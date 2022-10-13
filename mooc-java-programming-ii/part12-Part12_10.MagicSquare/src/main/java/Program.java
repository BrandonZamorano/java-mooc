
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here

        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare magicSquare = msFactory.createMagicSquare(5);
//        System.out.println(msFactory.createMagicSquare(5));
        System.out.println(magicSquare);
        System.out.println(magicSquare.sumsOfRows());
        System.out.println(magicSquare.sumsOfColumns());

    }
}
