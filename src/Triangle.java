import java.io.IOException;

public class Triangle {
	public int side_a;
	public int side_b;
	public int side_c;
	public int angle_A;
	public int angle_B;
	public int angle_C;
	
	public void init_triangle(int side_a, int side_b, int side_c, int angle_A, int angle_B, int angle_C) throws IOException {
		if (side_a + side_b < side_c || side_b + side_c < side_a || side_a + side_c < side_b) {
			throw new IOException("The sum of the lengths of any two sides must be greater than or equal to the length of the remaining side.");
		} else if (angle_A + angle_B + angle_C != 180) {
			throw new IOException("Angle sum must be equal to 180!");
		} else if (side_a == side_b && side_b == side_c && angle_A != 60 || angle_B != 60 || angle_C != 60) {
			throw new IOException("In equilateral triangles all angles are 60º");
		}
		else {
			this.side_a = side_a;
			this.side_b = side_b;
			this.side_c = side_c;
			this.angle_A = angle_A;
			this.angle_B = angle_B;
			this.angle_C = angle_C;
		}
	}
}
