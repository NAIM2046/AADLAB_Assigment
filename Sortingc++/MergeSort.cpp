#include <bits/stdc++.h>
using namespace std;
void marge(int arr[], int left, int mid, int right)
{
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int l[n1], r[n2];
    for (int i = 0; i < n1; i++)
    {
        l[i] = arr[left + i];
    }
    for (int i = 0; i < n2; i++)
    {
        r[i] = arr[mid + i + 1];
    }
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2)
    {
        if (l[i] <= r[j])
        {
            arr[k] = l[i];
            k++;
            i++;
        }
        else
        {
            arr[k] = r[j];
            k++;
            j++;
        }
    }
    while (i < n1)
    {
        arr[k] = l[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        arr[k] = r[j];
        j++;
    }
}
void mergeSort(int arr[], int left, int right)
{
    if (left < right)
    {
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        marge(arr, left, mid, right);
    }
}
int main()
{
    int arr[] = {12, 11, 13, 5, 6, 7};
    for (int i = 0; i < 6; i++)
        cout << arr[i] << " ";
    cout << endl;
    mergeSort(arr, 0, 5);
    cout << "Sorted array: ";
    for (int i = 0; i < 6; i++)
        cout << arr[i] << " ";
    cout << endl;
}