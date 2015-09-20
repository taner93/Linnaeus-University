package Point;


public class Point {

	int x;
	int y;
	
	public Point(int xPosition, int yPosition){
		x=xPosition;
		y=yPosition;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isEqualTo(Point p){
		boolean equal = false;
		if(x == p.getX() && y==p.getY()){
			equal = true;	
		}else{
			equal=false;
		}
		return equal;	
	}
	//NOTICE ! I have tried to store everything in different integers and doubles 
	//in order to follow the code easier
	public double distanceTo(Point p){
		double one = x - p.getX(); //new values to understand the code better
		double two = y - p.getY(); //new values to understand the code better 
		double first = Math.pow(one, 2); //rising to the power of 2 the first part of the equation
		double second = Math.pow(two, 2); //rising to the power of 2 the second part of the equation
		double distance = Math.sqrt(first + second); //calculating the distance
		return distance;
	}
	public String toString(){
		return "Positions are: "+getX()+"," +getY();
		
		}
	public void move(int x, int y){
		int newX = getX() +(x);
		int newY = getY() +(y);
		setX(newX);
		setY(newY);
	}
	public void moveToXY(int x, int y){
		setX(x);
		setY(y);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		               
		System.out.println(p1.toString());   // ==> (0,0)
		System.out.println(p2.toString());
		if(p1.isEqualTo(p2)){
			System.out.println("The two points are equal");
		}else{
			System.out.println("The two points are different");
		}
		double dist = p1.distanceTo(p2);
		System.out.println("Point Distance: "+dist);
		p2.move(5,-2);
		System.out.println(p2.toString()); // Just to test the move method
		p1.moveToXY(9,2);
		System.out.println(p1.toString()); // Testing again the moveToXY method
		
	}

}
