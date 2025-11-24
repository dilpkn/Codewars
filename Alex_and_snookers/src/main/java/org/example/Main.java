import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public static class Frame {
    public static int[] frame(String score) {
        List<String> frames = Arrays.asList(score.split(";"));
        int [] result = new int[2];
        for(String frame: frames){
            frame = frame.trim();
            if(frame.isEmpty()){break;}
            String[] points = frame.replaceAll("\\(.*?\\)", "").split("-");
            if (Integer.parseInt(points[0]) < Integer.parseInt(points[1])){
                result[1]+=1;
            }else{
                result[0]+=1;
            }
        }
        return result;
    }
}

    public static void main(String[] args) {
        System.out.println("Ronnie O'Sullivan - Joe Perry");
        String score = "24-79(72); 16-101(53); 86(58)-27; 31-90(74); 0-115(115); 67-40; 61-21; 81(55)-23; 51-14; 124(56,68)-4; 67-12; 108(85)-15; 1-117(117); 1-92(92); 130(112)-0; 1-106(53); 59-39";
        Frame  f = new Frame();
        System.out.println(Arrays.toString(Frame.frame(score)));

    }