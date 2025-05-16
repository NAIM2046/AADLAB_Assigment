#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;
};
Node *createNode(int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    newNode->left = newNode->right = nullptr;
    return newNode;
}

Node *insert(Node *root, int value)
{
    if (root == nullptr)
    {
        return createNode(value);
    }
    if (value < root->data)
    {
        root->left = insert(root->left, value);
    }
    else
    {
        root->right = insert(root->right, value);
    }
    return root;
}
void inorder(Node *root)
{
    if (root != nullptr)
    {
        inorder(root->left);
        cout << root->data << " ";
        inorder(root->right);
    }
}

int main()
{
    Node *root = nullptr;
    int a[] = {5, 3, 7, 2, 8, 1, 6};
    for (int i = 0; i < 7; i++)
    {
        root = insert(root, a[i]);
    }
    inorder(root);
    return 0;
}