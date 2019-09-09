package com.elfinlas.hackerrank.easy.tree;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by MHLab on 2019-06-10..
 */

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreeHeightOfBinaryTree {

    /*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
    public static int height(Node root) {
        // Write your code here.
        if (root == null) { return -1; }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void run() throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }

}

/*
[문제 해결]

이진 트리의 길이를 구하는 문제
그냥 재귀함수 형태로 구현하면 된다.
근데 문제에서 보면 맨 처음 노드의 높이가 1이 아닌 0부터 하는거 같다.
그래서 null일 때 -1을 주고 반환에서 1+ 식으로 처리하였다.
 */