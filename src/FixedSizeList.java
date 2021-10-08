import java.util.ArrayList;
import java.util.List;

public class FixedSizeList<T extends NamePrintable> {
    //attributes
    private List<T> myList;

    //Constructor
    public FixedSizeList() {
        this.myList = new ArrayList<>();
    }

    //Methods
    public void add(T item){
        int i = 0;
        if(myList.size() < 5) {
            if(item != null) {
                myList.add(item);
                System.out.println("Item " + item.showName() + " added.");
                i++;
            }else{
                System.out.println("NULL values cannot be added.");
            }
        }else {
            System.out.println("Item " + item.showName() + " could not be added. You cannot add more then 5 items to the list.");
        }
    }

    public boolean removeByIndex(int index){
        if(!(index >= size())){
            myList.remove(index);
            System.out.println("Element removed successfully.");
            return true;
        }else{
            System.err.println("Could not remove Element. Index " + index + " out of bounds for length " + size());
            return false;
        }

    }

    public boolean remove(T element){
        if(contains(element)){
            myList.remove(element);
            System.out.println("Element " + element.showName() + " removed successfully.");
            return true;
        }else{
            System.err.println("Element " + element.showName() + " not contained in list. Could not remove Element.");
            return false;
        }
    }

    public T get(int index) {
        return myList.get(index);
    }

    public int size(){
        return myList.size();
    }

    public boolean contains(T element){
        return myList.contains(element);
    }

    //display names of objects
    public void showList(){
        for (T o : myList){
            System.out.println(o.showName());
        }
        System.out.println();
    }



}
