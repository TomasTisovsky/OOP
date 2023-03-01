package characters;

public class BadOgre extends Ogre {
//	boolean hungry; // beware of attribute hiding!

	public BadOgre() {
		super();
	}

	public BadOgre(int energy) {
		setEnergy(energy);
	}
	
	void revenge(Knight knight) {
		if (hungry)
			eat(knight);
	}
	void eat(Knight knight) {
		knight.setEnergy(0);
	}
}
