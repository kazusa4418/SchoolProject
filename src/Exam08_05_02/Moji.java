package Exam08_05_02;

class Moji {
    int count(String text, char ch) {
        return text.length()
                - text.replace(((Character) ch).toString(), "").length();
    }
}
