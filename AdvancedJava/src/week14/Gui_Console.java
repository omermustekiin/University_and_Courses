package week14;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gui_Console {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> arrayStudent=new ArrayList<Student>();
	static ArrayList<Teacher> arrayTeacher=new ArrayList<Teacher>();
	static ArrayList<Class> arrayClass=new ArrayList<Class>();

	public static void main(String[] args) {
		String option=JOptionPane.showInputDialog(null, "Console:1, Gui:2");
		
		if(option.equals("1")){
			while(true) {
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" Add Student: 1\n List Student: 2\n Add Teacher: 3\n List Teacher: 4\n Add Class: 5\n List Class: 6\n Add Class-Teacher-Student: 7\n List Class-Teacher-Student: 8\n Exit: 9");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(">>");
				int selection=input.nextInt();
				
				switch(selection) {
				case 1: 
					addStudent();
					break;
				case 2:
					listStudent();
					break;
				case 3:
					addTeacher();
					break;
				case 4:
					listTeacher();
					break;
				case 5:
					addClass();
					break;
				case 6: 
					listClass();
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:	
					//System.exit(0);
					new GuiApplication();
					break;
			}
		}
		}
		else if(option.equals("2")) {
			new GuiApplication();
		}
		
	}
	
	public static void addStudent() {
		System.out.println("Name? :");
		String name=input.next();
		System.out.println("Surname? :");
		String surname=input.next();
		System.out.println("Age? :");
		int age=input.nextInt();
		
		arrayStudent.add(new Student(name, surname, age));
		System.out.println("The Student is added succesfully...");
		}
	
	public static void listStudent() {
		for(Student s: arrayStudent)
			System.out.println(s);	
	}
	
	public static void addTeacher() {
		System.out.println("Name? :");
		String name=input.next();
		System.out.println("Surname? :");
		String surname=input.next();
		System.out.println("Age? :");
		int age=input.nextInt();
		
		arrayTeacher.add(new Teacher(name, surname, age));
		System.out.println("The Teacher is added succesfully...");
		}
	
	public static void listTeacher() {
		for(Teacher t: arrayTeacher)
			System.out.println(t);
	}
	
	public static void addClass() {
		System.out.println("Class Name? :");
		String className=input.next();
		System.out.println("Capacity? :");
		int capacity=input.nextInt();
		
		arrayClass.add(new Class(className,capacity));
		System.out.println("The Class is added succesfully...");
		}
	
	public static void listClass() {
		for(Class c: arrayClass)
			System.out.println(c);
	}
	
	
	
	
	
	
	
	
}
