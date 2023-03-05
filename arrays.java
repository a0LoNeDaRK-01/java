public class arrays {

    public static void main(String[] args){

       /* String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih"; */

        //Yukarıdaki kodu comment etmemin sebebi Alttaki tanımın kod icin daha uygun olmasıdır!..

        String[] ogrenciler = {"Engin","Derin","Salih"};

        for (int i=0;i< ogrenciler.length;i++){

            System.out.println(ogrenciler[i]);

        }
        System.out.println("----------------------------------"); //Alttaki sekil daha iyi tabii ki!..
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }

}
