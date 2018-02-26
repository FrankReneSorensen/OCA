public class Test {

public static void main (String args[]) {
	//System.out.println("Erik skal lære java");
	//testSkrivEnGangTil("Her skal Franklære java også");
	//System.out.println(args[0]);
	testLoop(Integer.parseInt(args[1]), "STringen er FRank", "dette er en string");
	//ifTest(Integer.parseInt(args[2]));
	//test();
	}
	
	public static void testSkrivEnGangTil (String inntekst){
		System.out.println(inntekst);
	}
	
	public static void testLoop(int antallRunder, String navn, String etternavn) {
	System.out.println("NÅ ER VI HER");
	for (int x = 0; x < antallRunder; x++) {
		System.out.println("Her er nummer på denne runden: "+x);
	}
	}
	
	
	
	public static void testLoop(int antallRunder, String navn) {
	System.out.println(navn);
	for (int x = 0; x < antallRunder; x++) {
		System.out.println("Her er nummer på denne runden: "+x);
	}
	}
	
	public static void test() {
	
	int numFish = 4;
	int fishType = 4;
	System.out.println("fishtype= "+ fishType);
	
	}
	
	public static void ifTest(int verdi){ 
	
	if (verdi == 1)
		System.out.println("Dette er nummer: EN");
		
		if (verdi == 2)
		System.out.println("Dette er nummer: TO");

	if (verdi == 3)
		System.out.println("Dette er nummer: TRE");

	if (verdi == 4)
		System.out.println("Dette er nummer: FIRE");
			
	if (verdi > 4)
		System.out.println("Dette tallet er større enn FIRE");
	}

}

