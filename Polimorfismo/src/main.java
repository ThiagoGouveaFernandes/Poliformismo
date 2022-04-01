
public class main {

	public static void main(String[] args) {

		gato g = new gato();
		cachorro c = new cachorro();
		
		//g.falar();
		//c.falar();
		
		animal animal = new gato();

		falar(g);
		falar(c);
		
		if(animal instanceof cachorro) {
			System.out.println("Cachorro");
		}
		else if(animal instanceof animal){
			
			System.out.println("Gato");
	}
	
}
	
	private static void falar(animal a) {
		
		a.falar();
		
	}

}
