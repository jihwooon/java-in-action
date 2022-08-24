package example;

public class StringExample {
    // StringBuilder
    private String getStringBuilder(int... arr) {
        if (arr == null) {
            return "null";
        }

        if(arr.length - 1 == -1) {
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; ; i++) {
            stringBuilder.append(arr[i]);

            if (arr[i] == arr.length - 1) {
                return stringBuilder.append("]").toString();
            }
            stringBuilder.append(", ");
        }
    }

    //StringBuffer
    public String getStringBuffer(int... arr) {
        if (arr == null) {
            return "null";
        }

        if(arr.length - 1 == -1) {
            return "[]";
        }


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");

        for (int i = 0; ; i++) {
            stringBuffer.append(arr[i]);
            if (arr[i] == arr.length - 1) {
                return stringBuffer.append("]").toString();
            }
            stringBuffer.append(", ");
        }
    }

    public static void main(String[] args) {
        int[] ints = {};



        StringExample stringExample = new StringExample();

        stringExample.getStringBuffer(ints);

        System.out.println("StringBuffer : " + stringExample.getStringBuffer(ints));

        stringExample.getStringBuilder(ints);

        System.out.println("StringBuilder : " + stringExample.getStringBuilder(ints));

    }

}
