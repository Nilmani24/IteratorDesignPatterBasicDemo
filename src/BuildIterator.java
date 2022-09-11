public class BuildIterator {

    public static DinnerItemIterator createIterator(DinnerItem dinnerItem[]){
        return new DinnerItemIterator(dinnerItem);
    }
}
