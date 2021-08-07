package ui;


import java.util.Scanner;

public class InputView {

    public static void Start(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        Scanner scanner = new Scanner(System.in);

        String car_names = scanner.nextLine();


    }

    public static void Racing(){
        System.out.println("시도할 횟수는 몇회인가요?");

        Scanner scanner = new Scanner(System.in);

        int attempt_count = scanner.nextInt();

    }

}
