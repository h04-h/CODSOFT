import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int num = scan.nextInt();
        int total=0;
        int grade;
        for(int i=0;i<num;i++){
            do{
                System.out.println("Enter grade n:"+(i+1));
                grade = scan.nextInt();
            }while(grade<0 || grade>100);
            total += grade;
        }
        System.out.println("The total is: "+total);
        int avg = total/num;
        System.out.println("The average percentage is: "+ avg);
        if(avg>=90){
            System.out.println("The grade is: A");
        }
        else if(avg>=80){
            System.out.println("The grade is: B");
        }
        else if(avg>=70){
            System.out.println("The grade is: C");
        }
        else if(avg>=90){
            System.out.println("The grade is: D");
        }
        else {
            System.out.println("The grade is: F");
        }
    }
}
