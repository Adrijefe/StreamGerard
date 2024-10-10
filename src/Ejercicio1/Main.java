package Ejercicio1;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    record Movie (String title, int duration, double rating, int year){}
    public static void main(String[] args) {

       var pelis =  Stream.of(
                new Movie("The Shawshank Redemption", 142, 9.3, 1994),
                new Movie("The Godfather", 175, 9.2, 1972),
                new Movie("The Dark Knight", 152, 9.0, 2008),
                new Movie("Pulp Fiction", 154, 8.9, 1994),
                new Movie("The Lord of the Rings: The Return of the King", 201, 8.9, 2003),
                new Movie("Schindler's List", 195, 8.9, 1993),
                new Movie("Fight Club", 139, 8.8, 1999),
                new Movie("Inception", 148, 8.8, 2010),
                new Movie("Forrest Gump", 142, 8.8, 1994),
                new Movie("The Matrix", 136, 8.7, 1999),
                new Movie("Goodfellas", 146, 8.7, 1990),
                new Movie("Star Wars: Episode IV - A New Hope", 121, 8.6, 1977),
                new Movie("Interstellar", 169, 8.6, 2014),
                new Movie("The Silence of the Lambs", 118, 8.6, 1991),
                new Movie("Seven", 127, 8.6, 1995)
        );

       //1

        //pelis.forEach(p->System.out.println(p.title));

        //2

       // Optional<Movie> masLarga = pelis.max((a,b)-> Integer.compare(a.duration , b.duration));
        //System.out.println(masLarga.get());

        //3

        /*
        Optional<Movie> masCorta = pelis.min((a,b)-> Integer.compare(a.duration, b.duration));
        System.out.println(masCorta.get());
         */

        //4
        //pelis.filter((p -> p.year() > 2000)).forEach(p-> System.out.println(p.title));

        //5
        //pelis.filter((p-> p.rating()>9)).forEach(p-> System.out.println(p.rating()));

        //6
      /* long años60=  pelis.filter((p-> p.year()> 1959 && p.year()<1961)).count();
        System.out.println(años60);*/

        //7
       //  Double d = pelis.collect(Collectors.averagingDouble(m -> m.rating()));
        //System.out.println(d)

        //8
        //pelis.sorted(Comparator.comparing(Movie::title)).forEach(p-> System.out.println(p.title));

        //9
       // pelis.sorted(Comparator.comparing(Movie::duration).reversed()).forEach(p-> System.out.println(p.duration));

        //10
        //pelis.max(Comparator.comparing(Movie::rating)).ifPresent(p -> System.out.println(p.title));

        //11
        //pelis.forEach(p-> System.out.println(p.title.toUpperCase()));

        //12
        //pelis.filter(p-> p.year()<1980).limit(1).forEach(p-> System.out.println(p.title));

        //13
        //boolean duracion =  pelis.allMatch(movie -> movie.duration() > 100);
        //System.out.println(duracion);

        //14
        //boolean b = pelis.anyMatch(movie -> movie.rating() < 8);
        //System.out.println(b);

        //15
        //int total = pelis.reduce(0, (movie, movie2) -> movie + movie2.duration(), Integer::sum);
        //System.out.println(total);
    }
}
