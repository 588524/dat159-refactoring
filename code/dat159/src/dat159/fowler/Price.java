package dat159.fowler;

public abstract class Price {
 abstract int _getPriceCode();
 abstract double _getCharge(int daysRented);
}
class ChildrensPrice extends Price{
	int _getPriceCode() {
		return Movie.CHILDRENS;
	}
	double _getCharge(int daysRented) {
		double thisAmount=1.5;
		if (daysRented > 3)
		     thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
}
	class NewReleasePrice extends Price{
		int _getPriceCode() {
			return Movie.NEW_RELEASE;
		}
		double _getCharge(int daysRented) {
			double thisAmount=0;
			thisAmount += daysRented * 3;
			return thisAmount;
		}
	}
	class RegularPrice extends Price{
		int _getPriceCode() {
			return Movie.REGULAR;
		}
		double _getCharge(int daysRented) {
			double thisAmount=2;
			 if (daysRented > 2)
			     thisAmount += (daysRented - 2) * 1.5;
			 return thisAmount;
		}
}