package _01_IntroToArrayLists;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class _04_RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
			public String type;
		}
		class Worm extends Stuff {
			public Worm() {
				type = "worm";
			}
		}
		class Dirt extends Stuff {
			public Dirt() {
				type = "dirt";
			}
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());

		/* TODO 1: Clean out the dirt but keep the delicious worms. */
		for (int j = 0; j < stuffIFoundInTheYard.size(); j++) {
			if (stuffIFoundInTheYard.get(j).type.equals("dirt")) {

				stuffIFoundInTheYard.remove(j);
			}
		}
		// System.out.println("2");
		System.out.println("size = " + stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('c');
		truth.add('u');
		truth.add('t');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('p');
		truth.add('e');
		truth.add('#');
		truth.add('n');
		truth.add(' ');
		truth.add('c');
		truth.add('#');
		truth.add('a');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('c');
		truth.add('#');
		truth.add('a');
		truth.add('n');
		truth.add(' ');
		truth.add('m');
		truth.add('#');
		truth.add('e');
		truth.add('o');
		truth.add('w');
		truth.add('#');
		/* TODO 2: Remove the hash symbols and print out the truth. */
		for (int i = 0; i < truth.size(); i++) {
			if (truth.get(i) == '#') {
				truth.remove(i);

			}

		}
		for (int i = 0; i < truth.size(); i++) {
			System.out.print(truth.get(i));
		}
	}
}
