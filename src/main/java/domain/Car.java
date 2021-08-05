package domain;
/**
 * domain이 뜻하는 의미가 무엇일까
 * =>
 */

import java.util.Random;

/**
 * Car가 하는 역할이 뭘까 생각해보자
 * 1) 이름을 받아서 생성한다. 생성자
 * 1-1) 이름은 5자리를 넘길 수 없다. isValid
 * 2) 레이싱을 진행하며 진행 시 마다 전진할지 안할지 판단하여 전진한다
 * 3) 전진 여부를 파악한 후 이름과 함께 출력한다.
 */
public class Car {

    private String name;
    private int go_count = 0;

    Random random = new Random();

    public Car(String name) {
        isValid(name);

        this.name = name;
    }

    private void isValid(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자리를 넘길 수 없습니다.");
        }
    }

    public void go(int number) {
        int random_value = random.nextInt(9) + 1;

        if (number < random_value) {
            go_count++;
        }
    }

    public void printCar() {
        System.out.print(name + " : ");

        for (int i = 0; i < go_count; i++) {
            System.out.print("-");
        }
    }

    public String getName() {
        return name;
    }
}
