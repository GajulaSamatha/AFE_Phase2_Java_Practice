class Strings{
    public static void countWords(StringBuilder str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Count of words: "+count);
    }
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Madam sir, Madam anthe!!");
        StringBuilder str1 = str.reverse();
        if(str == str1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        countWords(str);
    }
}