public class Validate {
    public boolean validnum(String s, int index) {
        if (index == 1) {
            int binCount = 0;
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char tempB = s.charAt(i);
                if (tempB == '0' || tempB == '1') {
                    binCount = binCount + 1;
                    continue;
                } else {
                    binCount = -1;
                    break;
                }
            }
            if (binCount > 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (index == 2) {
            if (s == null) {
                System.out.println(false);;
            }
            try {
                double d = Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
        else if (index == 3) {
            boolean isOctal = false;
            if (s != null && !s.isEmpty()) {
                int number = Integer.parseInt(s);

                while (number > 0) {
                    if (number % 10 <= 7) {
                        isOctal = true;
                    } else {
                        isOctal = false;
                        break;
                    }
                    number /= 10;
                }
            }
            return isOctal;
        }
        else if (index == 4) {
            boolean result;
            try {
                int t = Integer.parseInt(s, 16);
                result = true;
            } catch (NumberFormatException e) {
                e.printStackTrace();

                result = false;
            }
            return result;
        }
      return false;
    }
}









