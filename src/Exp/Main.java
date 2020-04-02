package Exp;

public class Main {

    public static void main(String[] args) {

        String[][] arrayStr = new String[4][4];
        arrayStr[0] = new String[]{"12", "10", "5", "4"};
        arrayStr[1] = new String[]{"7", "2", "3", "10"};
        arrayStr[2] = new String[]{"1", "15", "0", "-5"};
        arrayStr[3] = new String[]{"6", "6", "13", "12"};

        try{
            array(arrayStr);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        arrayStr = new String[5][4];
        arrayStr[0] = new String[]{"12", "10", "5", "4"};
        arrayStr[1] = new String[]{"7", "2", "3", "10"};
        arrayStr[2] = new String[]{"1", "15", "0", "-5"};
        arrayStr[3] = new String[]{"6", "6", "13", "12"};
        arrayStr[4] = new String[]{"6", "6", "13", "12"};

        try{
            array(arrayStr);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        arrayStr = new String[4][4];
        arrayStr[0] = new String[]{"12", "10", "5", "4"};
        arrayStr[1] = new String[]{"7", "number", "3", "10"};
        arrayStr[2] = new String[]{"1", "15", "0", "-5"};
        arrayStr[3] = new String[]{"6", "6", "13", "12"};

        try{
            array(arrayStr);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void array(String[][] arrayStr) throws MyArraySizeException, MyArrayDataException {
        if (arrayStr.length != 4 || arrayStr[0].length != 4)
            throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try{
                    sum += Integer.parseInt(arrayStr[i][j]);
                } catch (Exception e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Преобразовние массива прошло успешно. Полученная сумма: " + sum);
    }
}
