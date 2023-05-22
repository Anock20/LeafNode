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

    public static void deleteNode(int d) {
        parent[d] = -2; // 삭제한 노드는 -2
    }

    public static void countLeaf(int s, boolean[] visited) {
        visited[s] = true;
        boolean leafcheck = true;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == s && !visited[i]) { // 방문하지 않은 자식 노드가 있는 경우 해당 자식 노드로 재귀 호출
                leafcheck = false;      // visited 배열로 이미 확인한 노드 체크
                countLeaf(i, visited);
            }
        }
        if (leafcheck) { //리프노드인 경우 count ++
            count++;
        }
    }
}