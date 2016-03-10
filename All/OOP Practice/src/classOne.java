import java.util.Comparator;


interface one{
	int hi();
}

abstract class hi{
	abstract void func();
}

public class classOne implements Comparator, one {

	int var1= 1;
	int var2= 2;
	
	public classOne(int var1, int var2){
		this.var1=var1;
		this.var2=var2;
	}

	public int getVar1() {return var1;}

	public void setVar1(int var1) {this.var1 = var1;}

	public int getVar2() {return var2;}

	public void setVar2(int var2) {this.var2 = var2;}
	
	public void printHi(){
		System.out.println("Hi");
	}
	
//	public int compareTo(Object temp){
//		int num;
//		classOne s1= (classOne) temp;  
//		
//		if(getVar1() > s1.getVar1()){
//			num = 1;
//			}
//		else if (getVar1() < s1.getVar1()) {
//			num = -1;
//		} else {
//			num = 0;
//		}
//		return num;
//	}

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
//
//	public int compareTo1(Object temp){
//		
//		classOne obj = (classOne) temp;
//		
//		if(obj.getVar1()>getVar1()){
//			
//		}
//		
//		
//		return (Integer) null;
//
//
//	}

//	@Override
//	public int compareTo(Object arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
