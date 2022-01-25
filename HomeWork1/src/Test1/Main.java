package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int operation1 = 0;

		System.out.println("1. Stvorutu redactor ");
		System.out.println("2. Vuvestu redactor ");
		System.out.println("3. Vuitu s programu ");
		operation1 = scanner.nextInt();
		boolean menu1 = false;
		while (menu1) {

		}

		switch (operation1) {
		case 1: {

			System.out.println("Vuberit tup redactora ");
			System.out.println("1. Textovui ");
			System.out.println("2. Chislovui ");
			System.out.println("3. Matrica ");
		}
			operation1 = scanner.nextInt();

		case 2: {
			if (operation1 == 1) {
				textDate();
				// System.out.println("1. Textovui ");

			}
		}

		case 3:
			if (operation1 == 2) {
				MassivDate();
				// System.out.println("2. Chislovui ");

			}
			break;
		case 4:
			if (operation1 == 3) {
				MatrixDate();
				// System.out.println("3. Matrica");

			}

		case 5:
			if (operation1 == 4) {

				System.out.println("4. Poperedne menu ");
			}

		}

	}

	public static void textDate() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite pridlogenie");
		String a = scanner.nextLine();
		boolean menu = false;
		int operation = 0;
		while (menu) {

		}
		System.out.println("1. Poschitat kolvo slov v texti");
		System.out.println("2. Zamena slova");
		System.out.println("3. Skolko raz vstrechaetsya slovo");
		System.out.println("4. Poschitat unikalnie slova");
		System.out.println("5. Naiti text s naibolshem kolvo unikflnih slov");
		System.out.println("6. Naiti text s naibolshem kolvo slov");
		operation = scanner.nextInt();
		switch (operation) {
		case 1:

			if (operation == 1) {
				int count = 0;
				if (a.length() != 0) {
					count++;
					for (int i = 0; i < a.length(); i++) {
						if (a.charAt(i) == ' ') {
							count++;
						}
					}
				}
				System.out.println("You include " + count + " words");
			}

			operation = scanner.nextInt();

		case 2:
			if (operation == 2) {
				String s;
				String r;
				System.out.println("Vvedite to chto hotite zamenit");
				r = scanner.next();
				System.out.println(r);
				System.out.println("Vvedite to na chto hotite zamenit");
				s = scanner.next();
				System.out.println(s);

				String oldString = a;
				String newString = oldString.replace(r, s);

				System.out.println("New string: " + newString);
			}
			System.out.println("\n");
			operation = scanner.nextInt();
		case 3:
			if (operation == 3) {
				String word = "";
				int index = 1;
				String text = a;
				String[] words = text.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
				Arrays.sort(words);
				for (int i = 1; i < words.length; i++) {
					if (words[i].equals(words[i - 1])) {
						index++;
					} else if (!words[i].equals(words[i - 1])) {
						word = words[i - 1];

						System.out.println("Слово '" + word + "' встречается в тексте: " + index + " раз.");
						index = 1;
					}
					word = words[i - 1];
				}

			}
			System.out.println("\n");
			operation = scanner.nextInt();
		case 4:
			if (operation == 4) {

				String s = a;
				String t = "";
				int count = 1;

				for (int i = 0; i < a.length(); i++) {
					if (t.indexOf(a.charAt(i)) == -1)
						t += a.charAt(i);
				}

				for (int i = 0; i < t.length(); i++) {
					count = 0;
					for (int j = 0; j < a.length(); j++) {
						if (t.charAt(i) == a.charAt(j))
							count++;
					}
					System.out.println(t.charAt(i) + " " + count);
				}

			}
			System.out.println("\n");
			operation = scanner.nextInt();
		case 5:

		}
	}

	public static void MassivDate() {

		Scanner scanner = new Scanner(System.in);
		boolean menu = false;
		int operation = 0;
		while (menu) {

		}

		System.out.println("1. Otsortirovat massiv");
		System.out.println("2. Naiti min i max");
		System.out.println("3. Poschitat znachenie minshe za zadanoe");
		System.out.println("4. Soedinenie massivov");

		operation = scanner.nextInt();
		System.out.println("Vvedite znachenie massiva");
		switch (operation) {
		case 1:
			int a, b, c, d, e;
			if (operation == 1) {

				List<Integer> array = new ArrayList<Integer>();

				array.add(a = scanner.nextInt());
				array.add(b = scanner.nextInt());
				array.add(c = scanner.nextInt());
				array.add(d = scanner.nextInt());
				array.add(e = scanner.nextInt());

				Collections.sort(array);
				System.out.println(array);

			}
		case 2:
			if (operation == 2) {

				List<Integer> array = new ArrayList<Integer>();

				array.add(a = scanner.nextInt());
				array.add(b = scanner.nextInt());
				array.add(c = scanner.nextInt());
				array.add(d = scanner.nextInt());
				array.add(e = scanner.nextInt());

				int min = Collections.min(array);
				int max = Collections.max(array);
				System.out.println("Minimum value is: " + min);
				System.out.println("Maximum value is: " + max);
			}
		case 3:
			if (operation == 3) {
				int u;
				List<Integer> array = new ArrayList<Integer>();

				array.add(a = scanner.nextInt());
				array.add(b = scanner.nextInt());
				array.add(c = scanner.nextInt());
				array.add(d = scanner.nextInt());
				array.add(e = scanner.nextInt());

				System.out.println(array);

				System.out.println("Vvedite chislo u kotorogo hotite uznat nomer elementa ");
				u = scanner.nextInt();

				System.out.println(array.indexOf(u));

			}
		case 4:
			if (operation == 4) {

			}
		}

	}

	public static void MatrixDate() {

		Scanner scanner = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("Vvedite znachenie matrix");
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(a = scanner.nextInt());
		myArrayList.add(b = scanner.nextInt());
		myArrayList.add(c = scanner.nextInt());
		myArrayList.add(d = scanner.nextInt());

		Integer[] array = {}; 
		array = myArrayList.toArray(new Integer[myArrayList.size()]);
		System.out.println(myArrayList);

	}
}
