package integratedStudy.input;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class InputScanner {
    private final Scanner sc = new Scanner(System.in);

    public String input() {
        return input("");
    }

    public String input(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public String checkedInput(Pattern... patterns) {
        return checkedInput("", patterns);
    }

    public String checkedInput(String inMsg, Pattern... patterns) {
        String s = input(inMsg);
        for (Pattern p : patterns) {
            Matcher m = p.matcher(s);
            if (m.matches())
                return s;
        }
        return "";
    }

    public int inputInt() {
        return inputInt("");
    }

    public int inputInt(String msg) {
        String s = input(msg);
        if (s.matches("[+-]?[0-9]+")) {
            return Integer.parseInt(s);
        }
        else {
            throw new InputNotIntegerException();
        }
    }
}
