package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void ZodiacEnum (Zodiac zodiacs) {
		 
		if (zodiacs == Zodiac.AQUARIUS) {
			JOptionPane.showMessageDialog(null, "Aquarius");
		}
		else if (zodiacs == Zodiac.ARIES) {
			JOptionPane.showMessageDialog(null, "Aries");
		}
		else if (zodiacs == Zodiac.CANCER) {
			JOptionPane.showMessageDialog(null, "Cancer");
		}
		else if (zodiacs == Zodiac.CAPRICORN) {
			JOptionPane.showMessageDialog(null, "Capricorn");
		}
		else if (zodiacs == Zodiac.GEMINI) {
			JOptionPane.showMessageDialog(null, "Gemini");
		}
		else if (zodiacs == Zodiac.LEO) {
			JOptionPane.showMessageDialog(null, "Leo");
		}
		else if (zodiacs == Zodiac.LIBRA) {
			JOptionPane.showMessageDialog(null, "Libra");
		}
		else if (zodiacs == Zodiac.PISCES) {
			JOptionPane.showMessageDialog(null, "Pisces");
		}
		else if (zodiacs == Zodiac.SAGITTARIUS) {
			JOptionPane.showMessageDialog(null, "Sagittarius");
		}
		else if (zodiacs == Zodiac.SCORPIO) {
			JOptionPane.showMessageDialog(null, "Scorpio");
		}
		else if (zodiacs == Zodiac.TAURUS) {
			JOptionPane.showMessageDialog(null, "Taurus");
		}
		else if (zodiacs == Zodiac.VIRGO) {
			JOptionPane.showMessageDialog(null, "Virgo");
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
	_00_Horoscope h  = new _00_Horoscope();
	Zodiac zodiacs = Zodiac.CAPRICORN;	
	h.ZodiacEnum(zodiacs);
	}
}
