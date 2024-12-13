public class space{
    public static String compreesor(String str){
    StringBuilder Sb= new StringBuilder("");
    for(int i=0;i<str.length();i++){
     
 
       Integer counter=1;
       while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
  counter ++;
  i++;
       }
       Sb.append(str.charAt(i));
 
  if(counter>1){
 Sb.append(counter);
  }
 
 
       }
       return Sb.toString();
    }
 
 
 
    
    public static void main(String args[]){
       String str="aabccddd";
       System.out.println(compreesor(str));
    }
 
 }