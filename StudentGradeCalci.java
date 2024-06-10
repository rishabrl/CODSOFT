import java.util.Scanner;

public class StudentGradeCalci {
    public static void main(String[] args) {
        int marks[]=new int[5];
        float totalMarks=0,averagePercentage;

        Scanner sc2=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print("Enter the mark of subject"+(i+1)+"=");
            marks[i] = sc2.nextInt();
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("Total Marks obtained="+totalMarks);
        averagePercentage = totalMarks/5;
        System.out.println("Average Percentage="+averagePercentage+"%");
        System.out.print("The student Grade is: ");
        if(averagePercentage>=80)
            System.out.print("A");
        else if(averagePercentage>=60 && averagePercentage<80)
           System.out.print("B");
        else if(averagePercentage>=40 && averagePercentage<60)
            System.out.print("C");
        else
            System.out.print("D");
    }
}
