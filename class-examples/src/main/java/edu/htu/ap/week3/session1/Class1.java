package edu.htu.ap.week3.session1;

import javax.swing.JOptionPane;

public class Class1 {
	public static void main(String[] args) {
		//read number of students
		int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter N (number of students):"));
		String[] arr = new String[n];

		//read user input for the students
		for (int i = 0; i < n; i++) {
			String number = JOptionPane.showInputDialog("Please enter student number: ");
			int stdNumber = Integer.parseInt(number);

			String stdName = JOptionPane.showInputDialog("Please enter student name: ");
			String avg = JOptionPane.showInputDialog("Please enter student avg: ");
			double stdAvg = Double.parseDouble(avg);
			String value = stdNumber+","+stdName+","+stdAvg;
			arr[i]=value;
//			System.out.println("Student info : " + stdNumber + "," + stdName + "," + stdAvg);
		}
		
		//calculate max and min avg of all students
		double max=0;
		double min=100;
		for (int i = 0; i < n; i++) {
			String[] student = arr[i].split(",");//101,Ata,99.0
			String avg=student[2];
			double val=Double.parseDouble(avg);
			if(val>max) {
				max=val;
			}
			if(val<min) {
				min=val;
			}
		
		}
		System.out.println("Max Avg: "+max+" , Min Avg: "+min);
		
		//print students list
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
