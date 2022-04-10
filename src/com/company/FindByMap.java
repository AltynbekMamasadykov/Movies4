package com.company;

import java.util.List;
import java.util.Scanner;

public class FindByMap implements FindAble{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void findMoviesByActor(List<Movies> movies) {
        System.out.println("Enter Actor Name");
        String inputActorName = scanner.nextLine();
        movies.stream().filter(x -> x.getCast().stream().anyMatch(cast -> cast.getFullName()
                        .equalsIgnoreCase(inputActorName)))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies) {
        System.out.println("Enter Director Name");
        String inputDirectorName = scanner.nextLine();
        movies.stream().filter(x->x.getDirector().getFullName()
                        .equalsIgnoreCase(inputDirectorName))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
        movies.stream().filter(x->x.getYear()==name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {
        System.out.println("Enter Actor Name");
        String inputActorName = scanner.nextLine();
        movies.stream().filter(x->x.getCast().stream().
                anyMatch(cast -> cast.getFullName().equalsIgnoreCase(inputActorName))).
                forEach(System.out::println);

    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        for(Movies movie: movies) {
            movie.printCast();
        }
    }
}
