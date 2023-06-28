package exercise1;

public class Main {
public static void main(String[] args) {
	System.out.println(stringOddEven());
	System.out.println(leapYear());
}
public static boolean stringOddEven() {
	String oddEven = "Bongiovanni";
	if (oddEven.length() % 2 == 0) {
		return true;
	} else {
		return false;
}
}

public static boolean leapYear() {
	int year = 1936;
	if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
		return true;
	} else {
		return false;
	}
}
}