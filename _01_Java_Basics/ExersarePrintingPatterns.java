public class ExersarePrintingPatterns {

    // public static void printingNumbers(int numberOfRows) {
    //     if(numberOfRows <= 0) {
    //         System.out.println("Numarul de randuri trebuie sa fie pozitiv!");
    //         return;
    //     }

    //     int currentNumber = 1;
    //     for(int row = 1; row <= numberOfRows; row++) {
    //         for(int column = 1; column <= row; column++) {
    //         System.out.print(currentNumber + " ");
    //         currentNumber++;
    //         }
    //          System.out.println();
    //     }
    // }

    public static void blockNr(int nrRanduri) {
        if(nrRanduri <= 0) {
            System.out.println("Numarul de randuri trebuie sa fie mai mare decat 0!");
            return;
        }

        int numarCurent = 1;
        for(int rand = 1; rand <= nrRanduri; rand++) {
            for(int coloana = 1; coloana <= rand; coloana++) {
                System.out.print(numarCurent + " ");
                numarCurent++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
          //  printingNumbers(6);
          blockNr(7);
    }


}