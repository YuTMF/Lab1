package Lab4;

public class example09_02 {
    public static void main(String[] args) {

        char heightBorder = '\\';
        char groundBorder = '_';

        int height = 9;
        int width = 9;
        int z = 0;

        for(int i = 0; i <= height; ++i) {
            for(int j = 0; j <= width; ++j) {
                if (j == 0) System.out.print("|");
                if (j == i) System.out.print(heightBorder);
                else if (i == height) System.out.print(groundBorder);
                    else System.out.print(" ");

            }

            System.out.println();
        }

    }
}
