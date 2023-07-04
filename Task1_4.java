import java.util.Scanner;

public class Task1_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(StringToFloat());
                flag = false;
            } catch (MyNotNumberException e) {
                System.out.println("Введите число. " + e.getMessage());
                ;
            }
        }

    }
    // Задание 4
    public static String InputString() {
        String num = "";
        System.out.print("Введите число :");
        while (num == "") {
            try {
                num = sc.nextLine();
                if (num == "") {
                    throw new MyNullStringException("Строка пустая. ");

                }
            } catch (MyNullStringException e) {
                System.out.println("Введите число. " + e.getMessage());
            }
        }

        return num;
    }
     //Задание 1
    public static float StringToFloat() throws MyNotNumberException {
        float number;
        try {
            number = Float.parseFloat(InputString());
        } catch (NumberFormatException e) {
            throw new MyNotNumberException("Это не число, введите число. ");
        }
        return number;
    }
}

abstract class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class MyNotNumberException extends MyException {
    public MyNotNumberException(String message) {
        super(message);
    }

}

class MyNullStringException extends MyException {
    public MyNullStringException(String message) {
        super(message);
    }

}