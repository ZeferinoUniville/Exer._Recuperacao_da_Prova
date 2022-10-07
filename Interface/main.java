public class main {

	public static void main(String args[]) {
		Triangulo tri = new Triangulo(10, 2, 1, 1, 1);
        Quadrado qua = new Quadrado(10);

        System.out.println("A área do triangulo é:"+tri.getArea());
        System.out.println("O perímetro do triangulo é:"+tri.getPerimetro());
        System.out.println("A área do quadrado é:"+qua.getArea());
        System.out.println("O perímetro do quadrado é:"+qua.getPerimetro());
	}

}