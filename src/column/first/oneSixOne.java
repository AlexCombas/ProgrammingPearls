package column.first;

public class oneSixOne {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 25;
        int num3 = 35;
        int num4 = 212;
        int result;

        result = num1 | num2;
        System.out.println("OR: 12 | 25 = " + result);

        result = num1 & num2;
        System.out.println("AND: 12 & 25 = " + result);

        result = ~num3;
        System.out.println("COMPLEMENT: ~35 = " + result);

        result = num1 ^ num2;
        System.out.println("XOR: 12 ^ 25 = " + result);
        System.out.println("\n\tSHIFTS");
        System.out.println("\nSIGNED LEFT SHIFT: 212 << 4 = " + (num4 << 4));
        System.out.println("SIGNED RIGHT SHIFT:212 >> 4 = " + (num4 >> 4));
        System.out.println("Clearing bits 12 &= ~12 = " + (num1 &= ~12));

    }
}
