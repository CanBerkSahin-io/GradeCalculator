package uk.ac.brunel.cs1702;

public class GradeCalculator {

	static final double W1 = 0.10;
	static final double W2 = 0.10;
	static final double W3 = 0.15;
	static final double W4 = 0.15;
	static final double W5 = 0.25;
	static final double W6 = 0.25;
	static double a1;
	static double a2;
	static double a3;
	static double a4;
	static double a5;
	static double a6;
	public static String v1;
	public static String v2;
		

		

	
	//Declare all required Fields here as explained in the worksheet A1. 
	public static String vivagrade;
	public static char Finalgrade;
	public static boolean condition2;
	
	public static void main(String[] args) {
	
			double tm1=0, tm2=0, tm3=0, tm4=0, tm5=0, tm6=0;{ //TM stands for total mark so for instance TM1 means Total mark 1
			
			tm1= a1*W1;//TM stands for total mark
			tm2= a2*W2;//TM stands for total mark
			tm3= a3*W3;//TM stands for total mark
			tm4= a4*W4;//TM stands for total mark
			tm5= a5*W5;//TM stands for total mark
			tm6= a6*W6;//TM stands for total mark
			
			
			}
			
			double totalmarks = tm1+tm2+tm3+tm4+tm5+tm6; //TM stands for total mark
			
			System.out.println("Total marks: "+ totalmarks);
		
		
		String vivagrade = "";  //viva grade 1 compared to viva grade 2
		v1.compareTo(v2);
		if(v1.compareTo(v2)<0)
		{vivagrade= v1;
		}else if (v1.compareTo(v2)>0){
			vivagrade=v2;
		}else if (v1.compareTo(v2)==0){
			vivagrade= v1;
		}
			System.out.println("Viva grade: " +vivagrade);
	
		
	char FinalGrade=0;
	
	
		if (totalmarks >=70.00 && vivagrade.equals("A") && a5>=40 && a6>=40 ){   // if the total mark is greater or = to 70 and the conditions of the viva grade is an A and a5 and a6 is greater than or equal to 40 then the grade should be an A
			FinalGrade='A';
		}
		else if (totalmarks >=60.00 && vivagrade.equals("B") && a5>=40 && a6>=40){ // if the total mark is greater or = to 60 and the conditions of the viva grade is an B and a5 and a6 is greater than or equal to 40 then the grade should be an B
			FinalGrade='B';
		}
		else if (totalmarks >=60.00 && vivagrade.equals("A")&& a5>=40 && a6>=40){ // if the total mark is greater or = to 60 and the conditions of the viva grade is an A and a5 and a6 is greater than or equal to 40 then the grade should be an B
			FinalGrade='B';
		}
		else if (totalmarks >=50.00 && vivagrade.equals("C")){ // if the total mark is greater or = to 50 and the viva grade is c then the final grade is C
			FinalGrade='C';
		}
		else if (totalmarks >=50.00 && vivagrade.equals("B")){ // if the total mark is greater or = to 50 and the viva grade is B then the final grade is C
			FinalGrade='C';
		}
		else if (totalmarks >=50.00 && vivagrade.equals("A")){// if the total mark is greater or = to 50 and the viva grade is a then the final grade is C
			FinalGrade='C';
		}	
		else if (totalmarks >=40.00 && vivagrade.equals("D")){// if the total mark is greater or = to 40 and the viva grade is D then the final grade is D
			FinalGrade='D';
		}
		else if (totalmarks >=40.00 && vivagrade.equals("C")){// if the total mark is greater or = to 40 and the viva grade is C then the final grade is D
			FinalGrade='D';
		}
		else if (totalmarks >=40.00 && vivagrade.equals("B")){// if the total mark is greater or = to 40 and the viva grade is B then the final grade is D
			FinalGrade='D';
		}
		else if (totalmarks >=40.00 && vivagrade.equals("A")){// if the total mark is greater or = to 40 and the viva grade is A then the final grade is D
			FinalGrade='D';
		}
		else if (totalmarks <40.00 && vivagrade.equals("F")){// if the total mark is LESS THAN  40 and the viva grade is F then the final grade is F
			FinalGrade='F';
		}
		else if (totalmarks <40.00 && vivagrade.equals("D")){// if the total mark is LESS THAN  40 and the viva grade is D then the final grade is F
			FinalGrade='F';
		}
		else if (totalmarks <40.00 && vivagrade.equals("C")){// if the total mark is LESS THAN  40 and the viva grade is C then the final grade is F
			FinalGrade='F';
		}
		else if (totalmarks <40.00 && vivagrade.equals("B")){// if the total mark is LESS THAN  40 and the viva grade is B then the final grade is F
			FinalGrade='F';
		}
		else
			FinalGrade='F';    // Else Grade F
		
	
			System.out.println("Final grade: " + FinalGrade);
	

	}}
		/*	DRAFT 1 IGNORE
		if (v1 =="A" && v2 =="A"){
			vivagrade = "A";
		}
		else if (v1 =="A" && v2 =="B"){
			vivagrade = "A";
		}
		else if (v1 =="A" && v2 =="C"){
				vivagrade = "A";
		}
		else if (v1 =="A" && v2 =="D"){
			vivagrade = "A";
		}
		else if (v1 =="A" && v2 =="F"){
			vivagrade = "A";
		}
		else if (v1 =="B" && v2 =="A"){
			vivagrade = "A";
		}
		else if (v1 =="B" && v2 =="B"){
			vivagrade = "B";
		}
		else if (v1 =="B" && v2 =="C"){
			vivagrade = "B";
		}
		else if (v1 =="B" && v2 =="D"){
			vivagrade = "B";
		}
		else if (v1 =="C" && v2 =="A"){
			vivagrade = "A";
		}
		else if (v1 =="C" && v2 =="B"){
			vivagrade = "B";
		}
		else if (v1 =="C" && v2 =="C"){
			vivagrade = "C";
		}
		else if (v1 =="C" && v2 =="D"){
			vivagrade = "C";
		}
		else if (v1 =="C" && v2 =="F"){
			vivagrade = "C";
		}
		else if (v1 =="D" && v2 =="A"){
			vivagrade = "A";
		}
		else if (v1 =="D" && v2 =="B"){
			vivagrade = "B";
		}
		else if (v1 =="D" && v2 =="C"){
			vivagrade = "C";
		}
		else if (v1 =="D" && v2 =="D"){
			vivagrade = "D";
		}
		else if (v1 =="D" && v2 =="F"){
			vivagrade = "D";
		}
		else if (v1 =="F" && v2 =="A"){
			vivagrade = "A";
		}
		else if (v1 =="F" && v2 =="B"){
			vivagrade = "B";
		}
		else if (v1 =="F" && v2 =="C"){
			vivagrade = "C";
		}
		else if (v1 =="F" && v2 =="D"){
			vivagrade = "D";
		}
		else if (v1 =="F" && v2 =="F"){
			vivagrade = "F";
		}
		else{  
			System.out.println("Viva Grade Error try again");}
		
		if (a5>= 40 && a6>= 40)
		{
			condition2=true;
		}
		else
		{
			condition2=false;
		}
		
		
	*/
		
	
		
		
	
		
			//System.out.println("Total Marks:"+ totalMarks);
			//System.out.println("Viva grade: " +vivagrade);
			//System.out.println("Final grade: " + Finalgrade);
	//Implement your program logic here to process the Fields declared above.
	//Feel free to declare additional local variables in the main method.
	//Feel free to create other methods and call them from the main method.
	//Your program will be assessed based on its output as explained in the worksheet A1.	
		
		
