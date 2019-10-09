package pattern.observable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new Observer1(subject);
        new Observer2(subject);
        new Observer3(subject);

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter a number");
            subject.setState(sc.nextInt());
        }
    }
}
