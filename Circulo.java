package aula01;

public class Circulo extends P1_3 {
	private double raio;
	private Ponto centro;
	
	public Circulo(double x, double y, double raio){
		this.centro = new Ponto(x,y);
		this.raio = raio;
	}
	
	public Circulo(Ponto centro, double raio){
		this.centro =  centro;
		this.raio = raio;
	}
	
	public String toString(){
		return "Circulo com centro " +centro.toString()+ " e de raio " +raio;
	}
	
	public double getRaio(){
		return raio;
	}
	
	public Ponto getCentro(){
		return centro;
	}
	
	public double area(){
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double perimetro(){
		return 2 * Math.PI * raio;
	}
	
	public boolean circIgual(Circulo c){
		if(c.raio == raio && centro.getX() == c.centro.getX() && centro.getY() == c.centro.getY())
			return true;
		return false;
	}
	
	public boolean circInters(Circulo c){
		return false;
	}
}
