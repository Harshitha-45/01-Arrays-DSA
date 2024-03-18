// method-1
// sort the array

int secondLargest(int[] arr){
  int n = arr.length;
  for(int i=n-2;i>=0;i--){
    if(arr[i]!=arr[i+1]){
      return arr[i];
    }
  }
  return -1;
}
// TC : O(n)+O(n) == O(n)
// SC : O(1) no extra space

// method-2
// using loops
int secondLargest(int[] arr){
  int n = arr.length;
  
  int largest = Integer.MIN_VALUE;
  for(int i=0;i<n;i++){
    if(arr[i]>largest){ largest = arr[i]; }
  }

  int second_largest =Integer.MIN_VALUE;
  for(int i=0;i<n;i++){
    if(arr[i]>second_largest && arr[i]!=largest){
      second_largest=arr[i];
    }
  }

  return second_largest;
}

// method-3 
// using a single for loop
int secondLargest(int[] arr){
  int n = arr.length;
  int largest = Integer.MIN_VALUE;
  int second_largest =Integer.MIN_VALUE;

  for(int i=0;i<n;i++){
    if(arr[i]>largest){
      second_largest = largest;
      largest = arr[i];
    }
    else if(arr[i]>second_largest && arr[i]!=largest){
      second_largest = arr[i];
    }
  }
  return second_largest;
}
