// method-1 
// sort the array. After that largest element will be present at the last index
int largestElement(int[] arr){
  int n = arr.length;
  Arrays.sort(arr);
  return arr[n-1];
}


// method-1
// A simple for loop
int largestElement(int[] arr){
  int n = arr.length;
  int maxi = Integer.MIN_VALUE;

  for(int i=0;i<n;i++){
    if(arr[i]>maxi){
      maxi = arr[i];
    }
  }
  return maxi;
}
  
