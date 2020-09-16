package Animals.Felines;

import Animals.Animal;
import java.util.Random;

public class Felines extends Animal {
    Felines(){
        super();
    }

    String Roam(){
        int whatToDo = Chance();
        if (whatToDo == 1){
            System.out.println(super.name + " the " + super.type + " roams.");
        } else if(whatToDo == 2){
            System.out.println(super.name + " the " + super.type + " sleeps.");
            super.is_asleep = true;
        } else {

        }
    }

    private int Chance(){
        //Looked at stack overflow in order to see how to get random chance https://stackoverflow.com/questions/22473931/specifying-random-chance
        int chance;
        Random random = new Random();
        double r = random.nextDouble();
        if(r <= 0.3){
            return 1;
        } else if(r <= .6) {
            return 2;
        } else {
            return 3;
        }
    }
}
