public class Rei9_3_4 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        String st = null;
        try {
            st = args[0];
            i = Integer.parseInt(st);
            j = 10 / i;
        } catch(NumberFormatException e) {
            System.out.println("�f�[�^�̎w��Ɍ�肪����܂��B");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("���s���ɒl���w�肳��Ă��܂���B");
        } catch(ArithmeticException e) {
            System.out.println("�[�����Z���������܂��� : " + i);
        }
        System.out.print("�����l: " + j);
    }
}
