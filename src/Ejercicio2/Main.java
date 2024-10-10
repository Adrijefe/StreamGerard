package Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


record Student(String name , double nota){
    public Student(double i){
        /*
        Molaria que el nombre fuera con letras y la nota con un decimal
         */
       // this("Student"+Double.toString(i).chars().mapToObj(c-> Character.toChars(c)).collect(Collectors.joining()));

    }
    public String toString(){
        return name+": "+String.format("%.1f" + nota);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        var alumnes = ThreadLocalRandom.current()
                .doubles(100,0,10)
                .mapToObj(Student::new)
                .map(Student::toString)
                .toList();

        Files.write(Path.of("estudiante.txt"),alumnes);
    }


}
