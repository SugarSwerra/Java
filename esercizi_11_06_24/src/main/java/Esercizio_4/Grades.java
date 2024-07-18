package Esercizio_4;

import java.io.*;
import java.util.ArrayList;

public class Grades {

	private File grades, stats; 
	private ArrayList<String> students;
	
	public Grades(){
		grades = new File("src/main/java/Esercizio_3/log","grades.txt");
		stats = new File("src/main/java/Esercizio_3/log/statistics.txt");
		students = new ArrayList<>();

		try {
			BufferedReader input = new BufferedReader(new FileReader(grades));
			BufferedWriter output = new BufferedWriter(new FileWriter(stats));
			
			String line;
			
			while((line = input.readLine()) != null) {
				output.write(line + "\n");
			}
			
			input.close();
			output.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	/*
	
	public void minGrade() {
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(grades));
			
			
			
			output.append(product + "," + quantity + "," + price);
	
			output.close();
		}catch(IOException e){
			System.out.println(e.getStackTrace());
		}
	}
	
	public void avgGrade() {
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(stats));
			
			String file = "";
			String line = "";

			while((line = input.readLine()) != null) {
				if(line.contains(product))
					file += product + "," + quantity + "," + line.split(",")[2] + "\n";
				else
					file += line + "\n";
			}			
	
			input.close();
			
			BufferedWriter output = new BufferedWriter(new FileWriter(stats));
			
			output.write(file);

			output.close();
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public void maxGrade() {
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(stats));
			
			String file = "";
			String line = "";

			while((line = input.readLine()) != null) {
				if(line.contains(product))
					continue;
				else
					file += line + "\n";
			}			
	
			input.close();
			
			BufferedWriter output = new BufferedWriter(new FileWriter(stats));
			
			output.write(file);

			output.close();
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	*/
}
