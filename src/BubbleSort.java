public class BubbleSort {
int [] copy;
    public int[] bubbleSort(int[] v) {
        copy = new int[v.length];
        System.arraycopy(v, 0, copy, 0, v.length);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < copy.length - 1; i++) {
                if (copy[i] > copy[i + 1]) {
                    changed = true;
                    int tmp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = tmp;
                }
            }
        }
        System.out.print("Array = [ ");
        for(int i : copy) {
            System.out.print(i + " ");
        }
        System.out.print("]");

        return copy;

    }

    /*@Override
    public String toString() {
        return "BubbleSort{" + "copy=" + copy + "}";
    }*/
}
