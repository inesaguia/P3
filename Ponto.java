package aula01;

public class Ponto extends P1_3 {
	private double x;
	private double y;
	
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setDimension(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double distance(Ponto p){
		return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
	}
	
	public String toString(){
		return " Ponto de coordenadas("+x+","+y+")";
	}
}