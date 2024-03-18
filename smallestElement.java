// method-1
// sort the array , smallest element is present at index-0
int smallestElement(int[] arr){
  Arrays.sort(arr);
  return arr[0];
}
// TC : O(n*logn) for sorting
// SC : O(1) no extra space

// method-2
// A simple for loop
int smallestElement(int[] arr){
  int mini = Integer.MAX_VALUE;
  for(int i=0;i<n;i++){
    if(arr[i]<mini){ mini = arr[i]; }
  }
  return mini;
}
// TC : O(n)
// SC : O(1) no extra space
