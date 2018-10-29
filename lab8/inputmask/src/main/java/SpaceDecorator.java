public class SpaceDecorator implements IDecorator{

    @Override
    public String display(String s) {
        String decoratedString="";
        for(int i=0;i<s.length();i++){
            decoratedString+=s.charAt(i);
            if((i+1)%4==0 && i!=15){
                decoratedString+=" ";
            }
        }

        return decoratedString;
    }
}

