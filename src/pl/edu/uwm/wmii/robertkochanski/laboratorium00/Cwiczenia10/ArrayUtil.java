package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] t){
        for(int i = 1; i < t.length; i++){
            if(t[i - 1].compareTo(t[i]) > 0) return false;
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] a, T b){
        int low = 0;
        int high = a.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if (a[mid].compareTo(b) < 0) low = mid + 1;
            else if (a[mid].compareTo(b) > 0) high = mid - 1;
            else if (a[mid].compareTo(b) == 0) return mid;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a){
        for(int j = 0; j < a.length - 1; j++){
            int min_index = j;
            for(int i = j + 1; i < a.length; i++){
                if(a[i].compareTo(a[min_index]) < 0){
                    min_index = i;
                }
            }
            T tmp = a[j];
            a[j] = a[min_index];
            a[min_index] = tmp;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] a){
        mergeSort2(a, 0, a.length-1);
    }

    private static <T extends Comparable<T>> void mergeSort2(T[] a, int i, int j){
        if (j - i < 1) return;
        int mid = (i + j) / 2;
        mergeSort2(a, i, mid);
        mergeSort2(a, mid + 1, j);
        merge(a, i, mid, j);
    }

    private static <T extends Comparable<T>> void  merge(T[] a, int p, int mid, int q){
        Object[] tmp = new Object[q - p + 1];
        int i = p;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= q){
            if(a[i].compareTo(a[j]) <= 0) tmp[k] = a[i++];
            else tmp[k] = a[j++];
            k++;
        }
        if(i <= mid && j > q) while(i <= mid) tmp[k++] = a[i++];
        else while(j <= q) tmp[k++] = a[j++];
        for(k = 0; k < tmp.length; k++) a[k + p] = (T) (tmp[k]);
    }
}
