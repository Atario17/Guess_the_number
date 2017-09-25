package project.by.tikhomirova;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int answer;
        getNumberFromScanner();
        do{
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить,\n" + "  0 – нет)");
            answer = sc.nextInt();
            if(answer==1){
                getNumberFromScanner();
            }else if(answer==0){
                answer=0;
            }
        }while(answer==1);
    }

    public static void getNumberFromScanner(){
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("Попробуйте отгадать число от 0 до 9. У Вас три попытки. Введите число.");
        int counter = 1;
        while (true && counter <= 3){
            int y = sc.nextInt();
            System.out.println("Ваше число = " + y);
            if (y == x){
                System.out.println("Поздравляем, Вы выиграли :)");
		System.out.println(x);
                break;
            }else if(y < x){
                counter++;
                System.out.println("Ваше число меньше загаданного.");
            }else if(y > x){
                counter++;
                System.out.println("Ваше число больше загаданного");
            }
        }if(counter > 3){
            System.out.println("Вы проиграли:(");
	    System.out.println(x);
        }
    }

}

