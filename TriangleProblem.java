package lab1;

public class TriangleProblem {
	
	public String isTriangle(int a , int b , int c) {
		if(a==b && b==c){
			return "Equilateral Triangle";
		}else if((a==b&&a!=c) || (a==c&&a!=b) || (b==c&&b!=a)) {
		    return "Isosceles Triangle";
		}else{
			return "Scalene Triangle";
		}
	}
}
