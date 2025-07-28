
import java.util.ArrayList;

class Box{
    ArrayList<String>  item = new ArrayList<String>();
}
public class ItemAdd{
    static void addedItem(Box b){
        b.item.add ("Pen");
    }
    public static void main(String[]args){
        Box b = new Box();
        addedItem(b);
        System.out.println("Item Added in the list is: "+b.item); //output: [Pen]
            }
}