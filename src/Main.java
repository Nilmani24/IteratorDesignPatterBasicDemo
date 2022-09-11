public class Main {

    public static void main(String[] args) {
      DinnerItem [] dinnerItems = new DinnerItem[5];
        dinnerItems[0] = new DinnerItem("f1");
        dinnerItems[1] = new DinnerItem("f2");
        dinnerItems[2] = new DinnerItem("f3");
        dinnerItems[3] = new DinnerItem("f4");
        dinnerItems[4] = new DinnerItem("f5");
        DinnerItemIterator dinnerItemIterator = BuildIterator.createIterator(dinnerItems);

        while(dinnerItemIterator.hasNext()){
            System.out.println(dinnerItemIterator.next().foodId);
        }

    }
}
