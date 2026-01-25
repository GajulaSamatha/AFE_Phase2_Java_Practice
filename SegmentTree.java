public class SegmentTree {
    private int[] tree;
    private int n;

    public SegmentTree(int[] arr) {
        this.n = arr.length;
        this.tree = new int[4 * n];
        build(arr, 0, n - 1, 0);
    }

    private void build(int[] arr, int start, int end, int index) {
        if (start == end) {
            tree[index] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(arr, start, mid, 2 * index + 1);
        build(arr, mid + 1, end, 2 * index + 2);
        tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
    }
    private void print(){
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree segmentTree = new SegmentTree(arr);
        segmentTree.build(arr, 0, arr.length - 1, 0);
        segmentTree.print();        

    }
}