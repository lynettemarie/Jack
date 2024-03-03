public class Jack { 
  public static void main(String[] args) {
        System.out.println("This is the house that Jack built.");
        System.out.println();
        System.out.println("This is the malt");
        System.out.println("That lay in the house that Jack built. ");
        System.out.println();
        System.out.println("This is the rat,");
        malt();
        System.out.println();
        System.out.println("This is the cat,");
        System.out.println("That killed that rat,");
        malt();
        System.out.println();
        System.out.println("This is the dog,");
        System.out.println("That worried the cat,");
        rat();
        System.out.println();
        System.out.println("This is the cow with the crumpled horn,");
        System.out.println("That tossed the dog,");
        cat();
        System.out.println();
        System.out.println("This is the maiden all forlorn");
        cow();
    }

    public static void malt() {
        Console.println("That ate the malt");
        System.out.println("That lay in the house that Jack built.");

    }

    public static void rat() {
        System.out.println("That killed the rat,");
        malt();
    }

    public static void cat() {
        System.out.println("That worried the cat,");
        rat();
    }

    public static void dog() {
        System.out.println("That tossed the dog,");
        cat();
    }

    public static void cow() {
        System.out.println("That milked the cow with the crumpled horn,");
        dog();

    }
}
