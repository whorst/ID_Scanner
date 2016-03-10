import java.util.LinkedList;


public class stack {
	String E;
	
	private LinkedList stack= new LinkedList< E>();

	public void push (String s) {
		
		stack.addFirst(s);
		
	}
	
//	public String pop(){
//		
//		String retval;
//		
//		If(!stack.ismt()){
//		retval= stack.poll();	
//			
//		}
//		}}
//		retval= (String) stack.getFirst();
//		return(retval);
//		
//	}
//	public String top(){
//		
//	}
	
	public boolean ismt(){
		boolean retval= false;
		if (stack.size()==0){
			retval =true;
			
			return(retval);
		}
		
		
		return(retval);
	}
	
	public boolean isfull(){
		boolean retval=false;
		return retval;
		//return false;
	}
	
	
}
