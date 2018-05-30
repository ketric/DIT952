/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        AnimalShelter<Cat> catShelter = new AnimalShelter<Cat>();
        Dog badBoyRex = new Dog();

//        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
