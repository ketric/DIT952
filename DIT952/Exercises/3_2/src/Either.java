/**
 * Created by Niklas on 2016-02-07.
 */

/*För utmaning: färdigställ implementationen av klassen Either<A,B>.
 *  Tanken är att den
   ska fungera som typen Either i Haskell. Den ska representera 
   antingen ett objekt av typen
  A (annoterat Left) eller ett objekt av typen B (annoterat Right), 
  och ha metoderna
 isLeft() och isRight(). Den ska också ha metoden either med 
 motsvarande
 signatur (A -> R) -> (B -> R) -> R (fast uttryckt på ett sätt 
 som är möjligt i Java).
*/
/**
 * Models the Either type in Haskell
 * @author gwildr
 * 
 * @param <L> the left or wrong type
 * @param <R> the right or right type
 */
public abstract class Either <L,R>{
    public interface FromEither<L,R,T>{
    	T fromLeft(L l);
    	T fromRight(R r);
    }
    public class Left<L> extends Either<L,R>{
    	L l;
    	public Left(L l){
    		this.l = l;
    		}
    	public boolean isLeft(){
        	return true;
        }
    	public boolean isRight(){
    		return false;
    	}
    	
    	public <T> T either(FromEither<L,R,T> function){
    		return function.fromLeft(l);
    	}
    }

	
    
    public class Right<R> extends Either<L,R>{
    	R r;
    	public Right(R r){
    		this.r = r;
    	}
    	public boolean isLeft(){
        	return false;
        }
    	public boolean isRight(){
    		return true;
    	}
    	public <T> T either(FromEither<L,R,T> function){
    		return function.fromRight(r);
    	}
    	
    }
    
    public abstract boolean isLeft();
    public abstract boolean isRight();
//    public abstract T <T> either();
    
	// Return True if the given value is a Left-value, False otherwise.
	
    // public boolean isRight(){...}
//	Return True if the given value is a Right-value, False otherwise.
	
	
	
    // public T either((L->T)->(R->T)->T) func){...}

}
