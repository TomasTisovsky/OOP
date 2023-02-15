public class SuperKnight extends Knight{

    void attack(Ogre ogre) {
        ogre.energy = (int) (Math.random() * ogre.energy); // (int) just casts a float result into an int
        ogre.revenge(this); // this represents a reference to the current knight object
        System.out.println(this);
    }
}
