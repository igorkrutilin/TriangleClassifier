import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TriangleClassifier {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TriangleClassifier");
		
		Label label_side_a = new Label("Side a:");
		JTextField input_side_a = new JTextField(10);
		Label label_side_b = new Label("Side b:");
		JTextField input_side_b = new JTextField(10);
		Label label_side_c = new Label("Side c:");
		JTextField input_side_c = new JTextField(10);
		Label label_angle_A = new Label("Angle A:");
		JTextField input_angle_A = new JTextField(10);
		Label label_angle_B = new Label("Angle B:");
		JTextField input_angle_B = new JTextField(10);
		Label label_angle_C = new Label("Angle C:");
		JTextField input_angle_C = new JTextField(10);
		JButton btn_submit = new JButton("Submit");
		btn_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int side_a = Integer.parseInt(input_side_a.getText());
					int side_b = Integer.parseInt(input_side_b.getText());
					int side_c = Integer.parseInt(input_side_c.getText());
					int angle_A = Integer.parseInt(input_angle_A.getText());
					int angle_B = Integer.parseInt(input_angle_B.getText());
					int angle_C = Integer.parseInt(input_angle_C.getText());
					
					Triangle triangle = new Triangle();
					triangle.init_triangle(side_a, side_b, side_c, angle_A, angle_B, angle_C);
					
					Classifier classifier = new Classifier();
					String classification = classifier.classify(triangle);
					
					JOptionPane.showMessageDialog(null, classification);
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input error!");
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		JButton btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_side_a.setText("");
				input_side_b.setText("");
				input_side_c.setText("");
				input_angle_A.setText("");
				input_angle_B.setText("");
				input_angle_C.setText("");
			}
		});
		
		JPanel content = new JPanel(new FlowLayout(FlowLayout.LEFT));
		content.add(label_side_a);
		content.add(input_side_a);
		content.add(label_side_b);
		content.add(input_side_b);
		content.add(label_side_c);
		content.add(input_side_c);
		content.add(label_angle_A);
		content.add(input_angle_A);
		content.add(label_angle_B);
		content.add(input_angle_B);
		content.add(label_angle_C);
		content.add(input_angle_C);
		content.add(btn_submit);
		content.add(btn_reset);
		frame.setContentPane(content);
		
		frame.pack();
		frame.setSize(200, 250);
		frame.setVisible(true);
	}
}