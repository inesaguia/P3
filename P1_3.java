package aula01;

public class P1_3 {

	public static void main(String[] args) {
		
		Ponto p = new Ponto(4,4);
		Circulo c = new Circulo(1,1,2);
        Circulo c1 = new Circulo(p,5);  
        Circulo c2 = new Circulo(2,2,8);
        Circulo c3 = new Circulo(5,5,1);
         
        
        System.out.println("Área do Círculo c1: "+c1.area());
        System.out.println("Perímetro do Círculo c2: "+c2.perimetro());
         
        Retangulo r = new Retangulo(2,3,0,0);
        System.out.println("\nComposição do retângulo: "+r.toString());
        System.out.println("Área do retângulo: "+r.area());
        System.out.println("Perímetro do retângulo: "+r.perimetro());
         
        Quadrado q = new Quadrado(4,4,1);
        System.out.println("\nComposição do quadrado: "+q.toString());
        System.out.println("Área do quadrado: "+q.area());
        System.out.println("Perímetro do quadrado: "+q.perimetro());
         
        Ponto p1 = new Ponto(1,1);
        System.out.println("\nComposição do ponto P1: "+p1.toString());
        System.out.println("Distância entre pontos: "+p1.distance(p));

	}
}
