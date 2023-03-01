import characters.*;

public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	static int countEnergy(Energy[] e){
		int sum = 0;
		for (Energy energy : e) {
			sum = sum + energy.getEnergy();
		}
		return sum;
	}

	// both ogre and knight are beings who have energy
	// an interface provides uniform access
	// then we can define a method that calculates the energy difference with any two beings
	static int findEnergyDifference(Energy being1, Energy being2) {
		return being1.getEnergy() - being2.getEnergy();
	}
	
	public static void main(String[] args) {
		Ogre[] o = new Ogre[100];
		Knight[] k = new Knight[100];
		Energy[] e = new Energy[100];
		
		for (int i = 0; i < 20; i++) {
			k[i] = new BraveKnight(140, new Sword(i));
			o[i] = new BadOgre();
			o[i].setValues(50, true);

		}

		for (int i = 20; i < 40; i++) {
			k[i] = new Knight(40, new Sword(i));
			o[i] = new BadOgre();
			o[i].setValues(50);
		}

		for (int i = 40; i < 100; i++) {
			k[i] = new Knight(40, new Sword(i));
			o[i] = new TerrifyingOgre(60);
			o[i].setValues(50);
			((TerrifyingOgre)o[i]).eat(k[i]);
		}

		System.out.println("energia je "+ countEnergy(k));

		for (int i = 0; i < 100; i++) {
			clash(o[i], k[i]);
			System.out.println(i + ":" + "knight " + k[i].getEnergy() +
					" / " + "ogre " + o[i].getEnergy() + " sword: " + k[i].showSword());
		}

	}

}
