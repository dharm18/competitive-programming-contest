public class Test2 {

    public int solution(int N) {
        // write your code in Java SE 8
        String number = String.valueOf(N);
        String result="";
        int digit;

        if(N >= 0) {
            int i = 0;
            for (; i < number.length(); i++) {
                digit = Character.getNumericValue(number.charAt(i));
                if(digit <= 5) {
                    result+=5;
                    result+=digit;
                    break;
                }
                else
                    result+= digit;
            }

            if(i<number.length())
                result+=number.substring(i+1);
        }
        else {
            int i = 1;
            result="-";
            boolean isDoneInserting = false;
            for (; i < number.length(); i++) {
                digit = Character.getNumericValue(number.charAt(i));
                if(digit > 5) {
                    result+=5;
                    result+=digit;
                    isDoneInserting = true;
                    break;
                }
                else
                    result+= digit;
            }

            if(i<number.length())
                result+=number.substring(i+1);

            if(!isDoneInserting)
                result+="5";
        }
        return Integer.valueOf(result);
    }

    public static void main(String[] args) {
        /*System.out.println(new Test2().solution(268));
        System.out.println(new Test2().solution(670));
        System.out.println(new Test2().solution(0));
        System.out.println(new Test2().solution(1));
        System.out.println(new Test2().solution(50));*/
        System.out.println(new Test2().solution(-999));
        System.out.println(new Test2().solution(-1));
        System.out.println(new Test2().solution(-1111));
    }
}
