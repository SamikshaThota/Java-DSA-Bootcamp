public class SearchInString{
    public static void main(String[] args){
        String name="Samiksha";
        char target='s';
        System.out.println(search(name,target));


    }
    static boolean search2(String str,char target){
        if(str.isEmpty()){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target) {
                return true;
            }
        }
        return false;
    }




    static boolean search(String str,char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
