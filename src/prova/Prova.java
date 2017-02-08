package prova;

public class Prova {

    public static void main(String[] args) {
        FlexibleFactory ff = new FlexibleFactory();
        ff.addPrototype("Pneu", new Pneu());
        ff.addPrototype("Motor", new Motor());
        Pneu p = (Pneu) ff.create("Pneu");
        Motor m = (Motor) ff.create("Motor");
        if(!ff.removePrototype("Chassi")) System.out.println("Prototype não consta na lista!");
    }
    
}
