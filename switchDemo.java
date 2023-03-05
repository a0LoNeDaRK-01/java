public class switchDemo {


    public static void main(String[] args) {

       char grade = 'A';

       switch (grade) {

           case 'A':
               System.out.println("Cok Iyi");
               break;
           case 'B':
               System.out.println("Iyi");
               break;
           case 'C':
               System.out.println("Ortalama");
               break;
           case 'D':
               System.out.println("Ortalamanın alti");
               break;
           case 'F':
               System.out.println("Kaldi");
               break;
           default:
               System.out.println("Gecersiz Not Girdiniz");


       }





    }
}
