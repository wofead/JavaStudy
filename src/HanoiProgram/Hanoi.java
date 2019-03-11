package HanoiProgram;

public class Hanoi {
    public void excute(int count, char A, char B, char C) {
        if (count == 1) {
            move(A, C);
        } else {
            excute(count - 1, A, C, B);
            move(A, C);
            excute(count - 1, B, A, C);
        }
    }

    public void move(char A, char B) {
        System.out.println(A + "--->" + B);
    }

}
