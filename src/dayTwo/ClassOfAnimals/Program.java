package dayTwo.ClassOfAnimals;

/**
 * Created by student on 28-Jun-16.
 */
public class Program {

    public static void main (String [] args){

        Reptiles snake = new Reptiles();
        snake.setHasLegs(false);
        snake.setVertebrate(true);
        snake.setSpecies("Adder");
        snake.setHasScales(true);
        snake.setLaysEggs(true);

        System.out.println(snake.toString());

    }
}
