public class DinnerItemIterator implements Iterator {
    DinnerItem dinnerItem[] ;
    int index = 0;
    public DinnerItemIterator(DinnerItem dinnerItem[]){
        this.dinnerItem = dinnerItem;
        this.index = index;
    }

    @Override
    public boolean hasNext(){
        if(index >= dinnerItem.length)
            return false;
        return true;

    }
    @Override
    public DinnerItem next(){
        DinnerItem next = dinnerItem[index];
        index = index + 1;
        return next;
    }


}
