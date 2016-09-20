package aula01;

public class Retangulo {
	private double l;
	private double c;
	private Ponto centro;
	
	public Retangulo(double l, double c, Ponto centro){
		assert l > 0 && c > 0;
		this.l = l;
		this.c = c;
		this.centro = centro;
	}
	
	public Retangulo(double l, double c, double x, double y){
		assert l > 0 && c > 0;
		this.l = l;
		this.c = c;
		centro = new Ponto (x, y);
	}
	
	public double area(){
		return l*c;
	}
	
	public double perimetro(){
		return (l*2) + (c*2);
	}
	
	public void setDimension(double l, double c){
		assert l > 0 && c > 0;
		this.l = l;
		this.c = c;
	}
	
	public void setCentro(double x, double y){
		centro = new Ponto (x, y);
	}
	
	public Ponto getCentro(){
		return centro;
	}
	
	public double getL(){
		return l;
	}
	
	public double getC(){
		return c;
	}
	
	public String toString(){
		return "Retangulo com centro em " +centro.toString()+ ", de comprimento " +l+ " e àrea "+area()+ "e perimetro " +perimetro();
	}
}
