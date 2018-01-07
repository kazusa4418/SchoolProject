package Exam08_05_02;

class Moji {
    int count(String text, Character ch) {
        return text.length()
                - text.replace(ch.toString(), "").length();
    }
}
