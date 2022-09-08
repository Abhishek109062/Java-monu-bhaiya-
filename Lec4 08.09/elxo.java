
class elxo {
    public static void main(String[] args) {
        String s="";
        String t="";
        int flag=0;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==s.charAt(j))
            continue;
            else if(s.charAt(i)>s.charAt(j))
            flag=1;
            else 
            flag=-1;
        }
        if(flag==0){
            if(s.length()==t.length())
            System.out.println("Equal");
            else if(s.length()>t.length())
            System.out.println(s+" is bigger");
            else
            System.out.println(t+" is bigger");
        }
        else if(flag==1)
        System.out.println(s+" is bigger");
        else 
        System.out.println(t+" is bigger");

    }
}
