public class FisierTxt implements Element{
    String name;
    AlignStrategy alignStrategy;


    public FisierTxt(String n){

        name=n;

    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }

}


