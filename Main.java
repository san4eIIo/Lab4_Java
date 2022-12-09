package Lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] Args){
        Cosmetics Cosmetic1 = new Cosmetics("Gucci","Starfall",1999,4,"Italy");
        Cosmetics Cosmetic2 = new Cosmetics("Chanel", "Chance", 4999,7,"France");
        Cosmetics Cosmetic3 = new Cosmetics("Lanvin","Elcat", 999,6,"France");
        Cosmetics Cosmetic4 = new Cosmetics("Montale", "De Capri", 2999,10,"France");
        Cosmetics Cosmetic5 = new Cosmetics("Versace","Bright Crystal",2999,9,"Italy");
        Cosmetics Array[] = {Cosmetic1,Cosmetic2,Cosmetic3,Cosmetic4,Cosmetic5};
        Arrays.sort(Array, new Sortbyrate());
        System.out.println("Відсортовано за оцінкою від найбільшого до найменшого:");
        for (int i=0;i<Array.length;i++){
            System.out.println(Array[i].toString()+"\t\t\tRate:"+Array[i].Rate);
        }
        System.out.println("\n");
        Arrays.sort(Array, new Sortbyprice());
        System.out.println("Выдсортовано за ціною від найменшої до найбільшої");
        for (int i=0;i<Array.length;i++){
            System.out.println(Array[i].toString()+"\t\t\tPrice:"+Array[i].Price);
        }

    }
}
