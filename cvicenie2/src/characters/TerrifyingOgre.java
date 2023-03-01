package characters;

import characters.BadOgre;
import characters.Knight;

public class TerrifyingOgre extends BadOgre {
    public TerrifyingOgre(int energy){
        super(energy);
    }

    public void eat(Knight knight){
        super.eat(knight);
        roar();
    }

    private void roar() {
        System.out.println("Roar");
    }


}
