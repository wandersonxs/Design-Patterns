package structural.facade;

public class SortFacade {

    private Sorter bubbleSort;
    private Sorter mergeSort;
    private Sorter quickSort;


    public SortFacade() {
        bubbleSort = new BubbleSort();
        mergeSort = new MergeSort();
        quickSort = new QuickSort();
    }

    public void doBubbleSort(){
        bubbleSort.sort();
    }

    public void doMergeSort(){
        mergeSort.sort();
    }

    public void doQuickSort(){
        quickSort.sort();
    }

}
