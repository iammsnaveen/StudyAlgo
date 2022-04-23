package Collections_demo;

public class makingAnagram {
    public static void main(String[] args) {

        System.out.println(makingAnagramdemo("abc","ybza"));
    }

    private static int makingAnagramdemo(String s1, String s2) {
        //create int array of size 26 to hold frequency
        int [] c=new int[26];
        s1=s1.toLowerCase().replaceAll(" ","");
        s2=s2.toLowerCase().replaceAll(" ","");

        for(int i=0;i<s1.length() ; i++){
                c[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length() ; i++){
            c[s2.charAt(i)-'a']--;
        }
        
        int total=0;
        for (int i:c
             ) {
            total+=Math.abs(i);
        }
        return total;
    }
}
