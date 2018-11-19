public class Classifier {	
	private String classify_by_sides_length(Triangle triangle) {
		String result;
		if (triangle.side_a == triangle.side_b && triangle.side_a == triangle.side_c) {
			result = "equilateral";
		} else if (triangle.side_a != triangle.side_b && triangle.side_a != triangle.side_b) {
			result = "scalene";
		} else {
			result = "isosceles";
		}
		return result;
	}
	
	private String classify_by_internal_angles(Triangle triangle) {
		String result;
		if (triangle.angle_A == 90 || triangle.angle_B == 90 || triangle.angle_C == 90) {
			result = "right";
		} else if (triangle.angle_A > 90 || triangle.angle_B > 90 || triangle.angle_C > 90) {
			result = "obtuse";
		} else {
			result = "acute";
		}
		return result;
	}
	
	public String classify(Triangle triangle) {
		
		String result = "This triangle is ";
		result += classify_by_sides_length(triangle);
		result += " and ";
		result += classify_by_internal_angles(triangle);
		return result;
	}
}
