/**
 * Created by Niklas on 2016-02-07.
 */

/*
 * Färdigställ implementationen av interfacet Function. 
 * Tanken är att det ska
 * representera funktioner från argument av någon typ T 
 * till resultat av någon
 * typ R. Interfacet ska ha metoderna compose, som sätter 
 * ihop två funktioner av
 * lämpliga argument- och retur-typer, samt apply, som 
 * applicerar funktionen på
 * ett lämpligt argument. Hur kan ni göra metoderna så 
 * polymorfa som möjligt?
 */
public interface Function<T, R> {
	public R apply(T t);
	public <S> Function<S, R> compose(Function<S, T> inner);

}
