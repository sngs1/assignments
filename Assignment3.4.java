package com.acad.assignments;

class Student {
	public int roll_no;
	public String name;
	float sub1, sub2, sub3, totalMarks;

	Student(int roll_no, String name, float sub1, float sub2, float sub3, float totalMarks) {
		this.roll_no = roll_no;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.totalMarks = totalMarks;
	}
}

// Elements of array are objects of a class Student.
public class StudentResult {
	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[4];

		// initialize the first elements of the array
		arr[0] = new Student(1, "Aman", 79, 56, 98, 233);

		// initialize the second elements of the array
		arr[1] = new Student(2, "Anuj", 50, 75, 100, 225);

		// so on...
		arr[2] = new Student(3, "Saij", 80, 80, 70, 230);
		arr[3] = new Student(4, "Davi", 75, 75, 50, 200);

		System.out.println("                 ------->>>>STUDENT DETAILS <<<<<------");
		System.out.println();
		System.out.println("Roll_No  Name        Subject_1  Subject_2  Subject_3  Total_Marks ");
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].roll_no + "        " + arr[i].name
					+ "           " + arr[i].sub1 + "        " + arr[i].sub2 + "       "
					+ arr[i].sub3 + "       " + arr[i].totalMarks);
	}
}