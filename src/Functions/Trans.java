package Functions;


public class Trans {
    public String tenTOtwo(String ten) {
        return Integer.toBinaryString(Integer.valueOf(ten));
    }

    public String twoTOten(String two) {
        return Integer.valueOf(two, 2).toString();
    }

    public String tenTOSixteen(String ten) {
        return Integer.toHexString(Integer.valueOf(ten));

    }

    public String sixteenTOten(String sixteen) {
        return Integer.valueOf(sixteen, 16).toString();

    }
}
