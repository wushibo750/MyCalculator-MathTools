package Functions;


public class Trans {
    /**
     * 10进制变为2进制
     * @param ten
     * @return
     */
    public String tenTOtwo(String ten) {
        return Integer.toBinaryString(Integer.valueOf(ten));
    }

    /**
     * 2进制变为10进制
     * @param two
     * @return
     */
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
