package starbasedpgms;

public class CountSpecificCharacter {

    public static void main(String[] args) {

        String  str = "I love Coding and testing";
        //CharArray - for loop
        //str.length() - charAt(i)
        //Apache.CommonUtils StringUtils
        // Using Lambda func

        getCharCount(str, 'g');
        getCharCount1(str, 'o');


    }

    public static void streams(String str, String val){
        long count=   str.chars().mapToObj(e ->String.valueOf((char) e)).filter(e -> e.equals("i")).count();
        System.out.println(count);
    }

    public static void getCharCount(String str, char c){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch ==c){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void getCharCount1(String str, char ch){
        int count = 0;
       for(int i =0; i<str.length();i++){
           if(str.charAt(i)==ch){
               count++;
           }
       }
        System.out.println(count);
    }


}
