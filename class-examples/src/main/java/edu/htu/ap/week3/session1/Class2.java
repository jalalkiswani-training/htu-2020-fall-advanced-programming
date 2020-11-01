package edu.htu.ap.week3.session1;

import javax.swing.JOptionPane;

public class Class2 {
	public static void main(String[] args) {
		//read number of students
		int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter N (number of students):"));
		Student[] arr = new Student[n];

		//read user input for the students
		for (int i = 0; i < n; i++) {
			arr[i]=readStudent();
		}
		
		//calculate max and min avg of all students
		double max=0;
		double min=100;
		for (int i = 0; i < n; i++) {
			Student std=arr[0];
			if(std.avg>max) {
				max=std.avg;
			}
			if(std.avg<min) {
				min=std.avg;
			}
		
		}
		System.out.println("Max Avg: "+max+" , Min Avg: "+min);
		
		//print students list
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static Student readStudent() {
		Student std=new Student();
		String number = JOptionPane.showInputDialog("Please enter student number: ");
		std.number = Integer.parseInt(number);

		std.name= JOptionPane.showInputDialog("Please enter student name: ");
		String avg = JOptionPane.showInputDialog("Please enter student avg: ");
		std.avg= Double.parseDouble(avg);
		return std;
	}
}
