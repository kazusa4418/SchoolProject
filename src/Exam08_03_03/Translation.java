package Exam08_03_03;

class Translation {
    private String[] months = { "�r��", "�@��", "�퐶", "�K��", "�H��", "������", "����",
                        "�t��", "����", "�_����", "����", "�t��" };

    void jpLocalize(int index) {
        if (index > 0 && index < 13)
            System.out.println(months[index - 1]);
        else
            System.out.println("1~12�܂ł̒l����͂��Ă�������");
    }
}
