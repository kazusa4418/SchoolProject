package Exam08_03_03;

class Translation {
    String[] months = { "�r��", "�@��", "�퐶", "�K��", "�H��", "������", "����",
                        "�t��", "����", "�_����", "����", "�t��" };

    void jpLocalize(int index) {
        if (index > 12 || index < 1) {
            System.out.println("1~12�̌�����͂��Ă�������");
            System.exit(1);
        }
        System.out.println(months[index - 1]);
    }
}
