// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int LongestString(String [] strs) {
        int maxL = 0;
        int idx = -1;
        for(int i = 0 ; i < strs.length ; ++i) {
            String str = strs[i];
            if(str.length() > maxL) {
                maxL = str.length();
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        String[] strs = {"vandana","iqued","coding","codingisfun"};
        int idx = LongestString(strs);
        System.out.println("String is "+strs[idx]+" at idx = " +idx);
    }
}
