public class VeryBadOgre extends BadOgre{

    void revenge(Knight knight) {
        if (hungry)
            eat(knight);
        System.out.println("revenge");
    }

}
