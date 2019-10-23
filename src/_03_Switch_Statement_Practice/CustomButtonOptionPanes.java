package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option

		switch (choice) {
		case "Sunday":
			System.out.println("Did you go to chruch??");
			break;
		case "Monday":
			System.out.println("Ugh. I hate mondays");
			break;
		case "Tuesday":
			System.out.println("I get late start at school");
			break;
		case "Wednesday":
			System.out.println("Block days are long...");
			break;
		case "Thursday":
			System.out.println("More block periods??!?!");
			break;
		case "Friday":
			System.out.println("Dont play that very cringy song plz. You know what im talkin about");
			break;
		case "Saturday":
			System.out.println("A day to chill");
			break;
		default:
			System.err.println("Uh oh! Something went wrong... Please try again! :P");
			break;
		}

	}
}
