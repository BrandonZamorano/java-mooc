
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int center = size / 2;
        int x = center;
        int y = 0;
        int filled = 0;
        while (filled < (size * size)) {
            if (filled == 0) {
                //place the first in center top row
                square.placeValue(x, y, ++filled);
                continue;
            }
            // place next diagonal
            int[] diagCoords = getNextDiagFrom(square, x, y);
            x = diagCoords[0];
            y = diagCoords[1];
            placeNextDiagonalFrom(square, x, y, ++filled);
        }
        return square;
    }

    private int[] getNextDiagFrom(MagicSquare square, int x, int y) {

        int newX = x + 1;
        int newY = y - 1;


//         if we go "over the right edge" we continue from the left edge
        if (newX == square.getWidth()) {
            newX = 0;
        }

//                 if we go "over the top edge" we continue from the bottom.
        if (newY < 0) {
            newY = square.getHeight() - 1;
        }
        
        
        // Check if place contains a number
        if (square.readValue(newX, newY) != 0) {
            // take a step down
            newY = y + 1;
            newX = x;
        }

        return new int[]{newX, newY};
    }

    private void placeNextDiagonalFrom(MagicSquare square, int x, int y, int value) {
        square.placeValue(x, y, value);
    }

}
