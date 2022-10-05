public class multiDimensionalarray {

    public static void main(String[] args) {

         String[][] sehirler = new String[3][3];

         sehirler[0][0] = "ADANA";
        sehirler[0][1] = "MERSİN";
        sehirler[0][2] = "ANTALYA";
        sehirler[1][0] = "OSMANİYE";
        sehirler[1][1] = "KAYSERİ";
        sehirler[1][2] = "HATAY";
        sehirler[2][0] = "İZMİR";
        sehirler[2][1] = "DENİZLİ";
        sehirler[2][2] = "KONYA";

        int i;

        int k;

        for(i = 0; i <=2;i++) {
            System.out.println("-----------------");
            for(k = 0; k <=2;k++){

                System.out.println(sehirler[i][k]);

            }

        }



    }
 }
