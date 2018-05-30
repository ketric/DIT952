/**
 * Created by Niklas on 2016-02-07.
 */
public class Tuple <T,S>{
	private T t;
	private S s;
	
    public T fst(){
    	return t;
    }
    
    public S snd(){
    	return s;
    }
    
    public static void main(String[] args){
    	Tuple<String, Integer> ture = new  Tuple<String, Integer>();
    	ture.t = "Hej";
    	ture.s = 1;
    	
    	ture.fst();
    	ture.snd();
    }
}
