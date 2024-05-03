public class ControlAssignment {
  public static void main(String[] args) {
    int num = 15;

    if (num % 5 == 0 && num % 3 == 0) {
      System.out.println("number is divisible by 3 & 5");
    } else if (num % 3 == 0) {
      System.out.println("number is divisible by 3");
    } else if (num % 5 == 0) {
      System.out.println("number is divisible by 5");
    } else {
      System.out.println("number is not divisible by 3 nor 5");
    }

    int budget = 101;

    if (budget > 100) {
      System.out.println("ride a taxi");
    } else if (budget >= 50 && budget <= 100) {
      System.out.println("ride a train");
    } else if (budget >= 20 && budget <= 49) {
      System.out.println("ride a bus");
    } else if (budget >= 0 && budget <= 19) {
      System.out.println("walk");
    }

    int number = 5;

    switch (number) {
      case 1 -> System.out.println("1 - rat");
      case 2 -> System.out.println("2 - ox");
      case 3 -> System.out.println("3 - tiger");
      case 4 -> System.out.println("4 - rabbit");
      case 5 -> System.out.println("5 - dragon");
      case 6 -> System.out.println("6 - snake");
      case 7 -> System.out.println("7 - horse");
      case 8 -> System.out.println("8 - goat");
      case 9 -> System.out.println("9 - monkey");
      case 10 -> System.out.println("10 - rooster");
      case 11 -> System.out.println("11 - dog");
      case 12 -> System.out.println("12 - pig");
    }

  }

}
