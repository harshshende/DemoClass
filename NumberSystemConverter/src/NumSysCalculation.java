public class NumSysCalculation {

    public void convetor(String s, int index) {

        if(index == 1 ){
            System.out.println(s+ " as interger value "+ Integer.valueOf(String.valueOf(s), 2));
            System.out.println(s+ " as octal " + Integer.toOctalString(Integer.parseInt(s,2)));
            System.out.println(s+ " as Hexadecimal "+ Integer.toHexString(Integer.parseInt(s,2)));

        }
        else if (index == 2 ) {
            System.out.println(s+" as binary "+ Integer.toBinaryString(Integer.parseInt(s)));
            System.out.println(s+ " as octal " + Integer.toOctalString(Integer.parseInt(s)));
            System.out.println(s+ " as Hexadecimal "+ Integer.toHexString(Integer.parseInt(s)));
        }
        else if(index == 3 ){
            System.out.println(s+" as binary "+ Integer.toBinaryString(Integer.parseInt(s,8)));
            System.out.println(s+ " as decimal " + Integer.parseInt(s,16));
            System.out.println(s+ " as Hexadecimal "+ Integer.toHexString(Integer.parseInt(s,8)));
        }
        else if (index == 4 ) {
            System.out.println(s+" as binary "+ Integer.toBinaryString(Integer.parseInt(s,16)));
            System.out.println(s+ " as decimal " + Integer.parseInt(s,16));
            System.out.println(s+ " as octal " + Integer.toOctalString(Integer.parseInt(s)));

        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
