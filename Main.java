import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Төрт таңбалы сан енгіз");
        String n = a.next();

        Scanner b = new Scanner(System.in);
        System.out.println("Тағы төрт таңбалы сан енгіз");
        String y = b.next();

        if (isValidLength(n) && isValidLength(y) && areAllDigitsDifferent(getDigitArray(Integer.parseInt(n)))) {
            int[] san = getDigitArray(Integer.parseInt(n));
            int[] yArray = getDigitArray(Integer.parseInt(y));

            if (san[0] == yArray[0]) {
                System.out.println("бык");
            } else {
                if (san[0] == yArray[1] || san[0] == yArray[2] || san[0] == yArray[3]) {
                    System.out.println("корова");
                } else {
                    System.out.println("error");
                }
            }

            if (san[1] == yArray[1]) {
                System.out.println("бык");
            } else {
                if (san[1] == yArray[0] || san[1] == yArray[2] || san[1] == yArray[3]) {
                    System.out.println("корова");
                } else {
                    System.out.println("error");
                }
            }

            if (san[2] == yArray[2]) {
                System.out.println("бык");
            } else {
                if (san[2] == yArray[0] || san[2] == yArray[1] || san[2] == yArray[3]) {
                    System.out.println("корова");
                } else {
                    System.out.println("error");
                }
            }

            if (san[3] == yArray[3]) {
                System.out.println("бык");
            } else {
                if (san[3] == yArray[0] || san[3] == yArray[1] || san[3] == yArray[2]) {
                    System.out.println("корова");
                } else {
                    System.out.println("error");
                }
            }
        } else {
            System.out.println("Сіздің енгізген сандарында қате бар. Оның себептері:\n 1-Тек 4 таңбалы сан енгізу керек. \n 2-Сандар қайтаданбау керек.  ");
        }
    }

    private static boolean isValidLength(String numberString) {
        return numberString.length() == 4;
    }

    private static boolean areAllDigitsDifferent(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] getDigitArray(int number) {
        int[] digitArray = new int[4];
        digitArray[0] = number / 1000;
        digitArray[1] = number / 100 % 10;
        digitArray[2] = number / 10 % 10;
        digitArray[3] = number % 10;
        return digitArray;
    }
}
