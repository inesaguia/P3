package aula01;

public class Quadrado {
	private double l;
	private Ponto centro;
	
	public Quadrado(double l, Ponto centro){
		assert l > 0;
		this.l = l;
		this.centro = centro;
	}
	
	public Quadrado(double l, double x, double y){
		assert l > 0;
		this.l = l;
		centro = new Ponto (x, y);
	}
	
	public double area(){
		return l*l;
	}
	
	public double perimetro(){
		return l*4;
	}
	
	public void setDimension(double l){
		assert l > 0;
		this.l = l;
	}
	
	public void setCentro(double x, double y){
		centro = new Ponto (x, y);
	}
	
	public Ponto getCentro(){
		return centro;
	}
	
	public double getDimension(){
		return l;
	}
	
	public String toString(){
		return "Quadrado com centro em " +centro.toString()+ ", de comprimento " +l+" e àrea "+area()+ "e perimetro " +perimetro();
	}
}
