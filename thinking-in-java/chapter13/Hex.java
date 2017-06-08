import java.io.*;

class Hex{
    public static String format(byte[] data){
        StringBuilder builder = new StringBuilder;
        int n = 0;
        for (byte b : data){
            if (n % 16 ==0) builder.append("%05x", by);
            builder.append("%02x", by);
            if (n % 16 ==0) builder.append("\n");
        }
        builder.append("\n")
        return builder.toString();

    }

    public static void main(String[] args){
        if (args.length == 0 ){
            System.out.println(format(BinaryFile.read("Hex.class")));
        }
        else{
            System.out.println(format(BinaryFile.read(args[0])));
        }

    }

}