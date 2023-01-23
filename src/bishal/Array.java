package bishal;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
    items = new int[length];
    }

    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int num){
//        if the array is full then resize
        if(items.length == count){
//            create a new array
            int[] newItems = new int[count*2];
            for(int i=0;i<count;i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = num;
        count++;
    }
    public void removeAt(int index){
//        validate the index
        if(count <= index || index < 0){
            System.out.print("Invalid Item Index");
            throw new IllegalArgumentException();
        }
        //shift the items array to left to fill the void
        for(int i=index;i<count;i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        int index = -1;
        for(int i=0;i<count;i++){
            if(items[i] == item){
                index = i;
            }
        }
        return index;
    }
}
