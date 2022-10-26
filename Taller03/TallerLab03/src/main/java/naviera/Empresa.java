package naviera;

import java.util.Arrays;
import java.util.List;

public class Empresa {

	public static void buques(){
		List<Buque> buques = null;
		buques.add(new Buque("Catamaran", 5));
		buques.add(new Buque("Richard", 15));
		buques.add(new Buque("Velociraptor", 9));
		buques.add(new Buque("lucy", 7));
		buques.add(new Buque("OverFlow", 18));
		buques.add(new Buque("Perla negra", 3));
		buques.add(new Buque("Continental", 10));
		buques.add(new Buque("Indigo", 8));
		buques.add(new Buque("Caleuche", 17));
		buques.add(new Buque("Holandes herrante", 4));

	}

	public void eliminarBuque(List <Arrays> buques) {
		Buque b = null;
		List<Arrays> desarme = null;
		buques.remove(buques);
		//desarme.add(b);
	}

	public void vendePartes() {

	}

}