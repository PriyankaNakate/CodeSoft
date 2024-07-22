import java.util.*;
class GradeCalculation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of subjects you want to add : ");
		int n = sc.nextInt();
		float [] subjects = new float[n];
		System.out.print("Enter marks for each subjects out of 100 : ");
		int index = 0;
		int count = 0;
		for(int i=1;count<n;i++)
		{
			float marks = sc.nextFloat();
			if(marks>0 && marks<=100)
			{
				subjects[index++] = marks;
				count++;
			}
			else{
				System.out.println("Enter marks between 1 to 100");
			}
		}

		int totalMarks = 0;
		for(int i=0;i<subjects.length;i++)
		{
			totalMarks+=subjects[i];
		}

		float averagePercentage = totalMarks/n;

		String grade;
		String performance;
		if(averagePercentage>=90)
		{
			grade = "A+";
			performance = "Excellent";
		}
		else if(averagePercentage>=75)
		{
			grade = "A";
			performance = "very good";
		}
		else if(averagePercentage>=60)
		{
			grade = "B+";
			performance = "Average";
		}
		else if(averagePercentage>=45)
		{
			grade = "B";
			performance = "About Average";
		}
		else if(averagePercentage>=35)
		{
			grade = "C";
			performance = "pass";
		}
		else{
			grade  = "D";
			performance = "fail";
		}

		System.out.println("***Result***");
		System.out.println("Total Marks : "+totalMarks+" out of "+(100*n));
		System.out.println("Average Percentage : "+averagePercentage);
		System.out.println("Grade : "+grade);
		System.out.println("Performance : "+performance);
	}
}