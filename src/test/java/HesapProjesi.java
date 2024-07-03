import java.util.Scanner;

public class HesapProjesi {
    public static void main(String[] args) {
        //1.İnitialize what we know
        int assigment_total = 40;
        //Ödev toplamı 40
        int exam_total = 200;
        //Final toplamı 200'dür
        int assigment_grade;
        int exam_grade;

        //2. Get input
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan bir girdi alıyor.
        //Kullanıcıdan gelen bir girdinin bir değişkene eklenmesine ihtiyaç vardır. Yani burada ödev toplaımını ve final toplamını almak gerekir.
        //1. maddede yeni bir değişken oluşturuyoruz.(assigment_grade, int exam_grade)
        System.out.print("Please enter your total assigments gread:");
        assigment_grade = input.nextInt();
        System.out.print("Please enter your final exams gread:");
        exam_grade = input.nextInt();

        //3.Do some processing
        //Öğrenci notu + sınav notu
        int student_grade = assigment_grade + exam_grade;
        int total = assigment_total + exam_total;
        int percentage = (student_grade / total) * 100;

        //4. Print output
        System.out.println("Your Total Grade is: " + student_grade);
        System.out.println("Your Percentage is " + percentage);

    }
}
