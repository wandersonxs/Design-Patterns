package structural.facade;

public class Main {

    public static void main(String[] args) {

        SortFacade sortFacade = new SortFacade();
        sortFacade.doBubbleSort();
        sortFacade.doMergeSort();
        sortFacade.doQuickSort();
    }
}
