package com.company;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static SortAble s = new MovieStore();
    private static FindAble f = new FindByMap();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InputException {

        s.printAllMovies(movies);

        while (true) {
            commands();
            int inputNumber = in.nextInt();
            if(inputNumber==1){
                s.printAllMovies(movies);
            }else if(inputNumber==2){
                s.findMovie(movies);
            }else if(inputNumber==3){
                s.sortByYear(movies);
            }else if(inputNumber==4){
                s.sortByName(movies);
            }else if(inputNumber==5){
                s.sortByDirector(movies);
            }else if(inputNumber==6){
                f.findMoviesByActor(movies);
            }else if(inputNumber==7){
                f.findMoviesByDirector(movies);
            } else if (inputNumber==8) {
                int name =getInt();
                f.findMoviesByYear(movies,name);
            }else if (inputNumber==9){
                f.findMoviesAndRoleByActor(movies);
            }else if (inputNumber==10){
                f.showActorRoles(movies);
            }else if (inputNumber==0){
                break;
            }

        }

    }


    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("Press 0 to quit");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
