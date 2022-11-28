package filmsecimi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Movie {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        hangingMan();

    }


    public static void hangingMan() {
        String movies[] = new String[10];
        movies[0] = "Esaretin Bedel";
        movies[1] = "Baba";
        movies[2] = "Kara Sovalye";
        movies[3] = "12 ofkeli adam";
        movies[4] = "Yuzuklerin efendizi";
        movies[5] = "Ucuz Roman";
        movies[6] = "Iyi kotu cirkin";
        movies[7] = "Forrest gump";
        movies[8] = "Madagasgar";
        movies[9] = "Kuzularin sessizligi";

        Random obje = new Random();
        int randomNumber = obje.nextInt(10);

        String selectedMovie = movies[randomNumber];

        int count = selectedMovie.length();
        System.out.println("Movie has got " + count + " letters");

        for (int i = 0; i < count; i++) {
            System.out.print("_ ");
        }
        System.out.println();
        System.out.println("You have " + count + " right to select letter");
        String emptyMovie="";

        for(int i=0; i<selectedMovie.length(); i++) {
            emptyMovie+="_";
        }



        boolean select = true;
        while (select) {
            System.out.println("Enter a letter");
            String enter = input.next().substring(0, 1);


            for (int i =0; i<selectedMovie.length();i++) {

                if (selectedMovie.substring(i,i+1).equals(enter)) {
                       emptyMovie.replace(emptyMovie.charAt(i), enter.charAt(0));
                    System.out.println(emptyMovie);
                }


            }

        }

    }


}
