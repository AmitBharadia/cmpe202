public class USStrategy implements  IDisplayStartegy{

    public String display(String number) {
        String op="";
        int len=number.length();
        if(len<1){
            return "";
        }
        else if(len<3 ){
            return "(" + number+ ")";
        }else{
            op+= "("+number.substring(0,3) +")";
            if(len>3){
                for(int i=3;i<len;i++){
                    op+=number.charAt(i);
                    if(i==5)
                        op+="-";

                }
            }
        }
        return op;
    }
}
