import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int[] parent;
    static int count;
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        count = 0;
        parent = new int[]{-1, 0, 0, 1, 1};
        deleteNode(4);
        countLeaf(getRoot(), new boolean[parent.length]);
        System.out.println(count);
        count = 0;
        parent = new int[]{-1, 0, 0, 1, 1, 1, 2};
        deleteNode(1);
        countLeaf(getRoot(), new boolean[parent.length]);
        System.out.println(count);
    }
    public static int getRoot() {
        int root = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1)
                root = i;
        }
        return root;
    }
    public static void deleteNode(int d){
        parent[d] = -2;

    }
    public static void countLeaf(int s, boolean[] visited){


    }
}
