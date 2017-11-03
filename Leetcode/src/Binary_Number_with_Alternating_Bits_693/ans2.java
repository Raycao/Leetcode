package Binary_Number_with_Alternating_Bits_693;

//網友作法
public class ans2 {
	public boolean hasAlternatingBits(int n) {
        if (n == 0) return true;
        switch (n % 4) {
            case 1:
                return endsWith10(n / 2);
            case 2:
                return endsWith10(n / 4);
            default:
                return false;
        }
    }

    private boolean endsWith10(int n) {
        return (n % 4 == 2 && endsWith10(n / 4)) || n == 0;
    }
}
