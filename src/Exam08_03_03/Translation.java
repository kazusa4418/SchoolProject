package Exam08_03_03;

class Translation {
    String[] months = { "睦月", "如月", "弥生", "卯月", "皐月", "水無月", "文月",
                        "葉月", "長月", "神無月", "霜月", "師走" };

    void jpLocalize(int index) {
        if (index > 12 || index < 1) {
            System.out.println("1~12の月を入力してください");
            System.exit(1);
        }
        System.out.println(months[index - 1]);
    }
}
