
import java.util.Scanner;

public class mete2 {


    public static void main(String[] args) {

            class main {
                public static void main(String[] args) {
                    int meyve;
                    int sebze;
                    int istenilen;
                    Scanner reader=new Scanner(System.in);
                    System.out.println("ne istersin");
                    meyve=reader.nextInt();
                    sebze=reader.nextInt();
                    istenilen=reader.nextInt();
                    System.out.println("yaz");
                    switch(istenilen){
                        case (6):System.out.println("meyve");

                            break;
                        case (5):System.out.println("Armut");
                    }
                    switch (meyve){
                        case (1):System.out.println("Armut aldınız");
                            break;
                        case (2):System.out.println("elma aldınız");
                            break;
                    }
                    switch(sebze){
                        case (3):System.out.println("marul aldınız");
                            break;
                        case (4):System.out.println("maydonoz aldınız");
                        break;
                    }

                }
            }
        }


    }
