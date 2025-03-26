package Binary_Search_Tree_sort;

public class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inOrderTraversal(Node root, int[] sortedArray, int[] index) {
        if (root != null) {
            inOrderTraversal(root.left, sortedArray, index);
            sortedArray[index[0]++] = root.key;
            inOrderTraversal(root.right, sortedArray, index);
        }
    }

    void bstSort(int[] arr) {
        for (int num : arr) {
            insert(num);
        }

        int[] index = { 0 };
        inOrderTraversal(root, arr, index);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 50, 30, 70, 20, 40, 60, 80 };
        System.out.println("before the sort :");
        printArray(arr);

        BST tree = new BST();
        tree.bstSort(arr);

        System.out.println("after the sort :");
        printArray(arr);
    }
}
