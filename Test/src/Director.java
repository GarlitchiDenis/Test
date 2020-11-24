import java.util.ArrayList;

public class Director implements Element{
    String nume;
    protected ArrayList<Element> ls = new ArrayList<>();

    public Director(String n){
        nume=n;
    }
    public void AddElement(Element elm){
        ls.add(elm);

    }

    public void print(){
        System.out.println("Director: "+nume);
        for(Element i : ls){
            i.print();
        }
    }


}
