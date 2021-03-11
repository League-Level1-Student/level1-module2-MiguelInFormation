package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		
		Smurf Smurf = new Smurf("Handy");
		Smurf.eat();
		Smurf.getName();
		
		Smurf Smurf2 = new Smurf("Papa");
		System.out.println(Smurf2.getName());
		System.out.println(Smurf2.getHatColor());
		System.out.println(Smurf2.isGirlOrBoy());
		
		Smurf Smurf3 = new Smurf("Smurfette");
		System.out.println(Smurf2.getName());
		System.out.println(Smurf2.getHatColor());
		System.out.println(Smurf2.isGirlOrBoy());
		
	}

}
