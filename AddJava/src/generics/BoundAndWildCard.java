package generics;

public class BoundAndWildCard {

	public static void main(String[] args) {
		BoundWild<Integer> m = new BoundWild<>(23);
		BoundWild<Double> n = new BoundWild<>(23.34);
		double sum = BoundWild.sum(m, n);
		System.out.println(sum);

	}

}

class BoundWild<T extends Number> {
	private T value;

	public BoundWild(T value) {
		this.value = value;
	}

	public double getDouble() {
		return value.doubleValue();
	}

	public static double sum(BoundWild<? extends Number> num1, BoundWild<? extends Number> num2) {
		return num1.getDouble() + num2.getDouble();
	}
}
