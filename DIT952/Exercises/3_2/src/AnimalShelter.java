import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */

/*Titta på koden för AnimalShelter med tillhörande kring-klasser. 
 * Kika särskilt på
ShelterError. Hur kan vi tänka om, så att det inte är möjligt 
att sätta hundar i ett katt-
    hem, och vice versa, utan att förlora code reuse eller 
    extensibility? Vi vill få ett statiskt
     felmeddelande, inte ett fel (exception) vid runtime.
     
     *
     * Proposed solution: 
     * 
     * Parametrisise animal shelter with the type of animal, 
     * and do the same with
     *************************************************************************************************'
     */

public class AnimalShelter<T>{

    private List<T> animalsInShelter = new ArrayList<T>(20);

    T adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(T animal){
        animalsInShelter.add(animal);
    }

}
