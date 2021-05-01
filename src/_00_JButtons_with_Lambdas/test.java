package _00_JButtons_with_Lambdas;

import java.util.Random;

public class test {
public static void main(String[] args) {
	int x = new Random().nextInt(3);
	switch (x) {
	case 1:
		System.out.println("cheese");
		break;
	case 2:
		System.out.println("pepperoni");
		break;
	case 3:
		System.out.println("sausage");
		break;
	case 4:
		System.out.println("Error!");
}
}
}
