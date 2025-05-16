package Huffman;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanCoding {
    public static void printCodes(HuffmanNode root, String code) {
        if (root == null)
            return;
        if (root.left == null && root.right == null && root.ch != '\0') {
            System.out.println(root.ch + " : " + code);
        }
        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freqs = { 5, 9, 12, 13, 16, 45 };
        int n = chars.length;
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.freq));
        for (int i = 0; i < n; i++) {
            pq.add(new HuffmanNode(chars[i], freqs[i]));
        }
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode merged = new HuffmanNode('\0', left.freq + right.freq);
            merged.left = left;
            merged.right = right;
            pq.add(merged);
        }
        HuffmanNode root = pq.peek();

        System.out.println("Huffman code: ");

        printCodes(root, "");

    }
}
