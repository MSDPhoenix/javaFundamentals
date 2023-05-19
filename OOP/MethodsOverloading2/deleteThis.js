function swap(arr){
    var arrnew = arr;
    var first = arr[0];
    var last = arr[arr.length-1];
    arrnew[arrnew.length-1] = first
    arrnew[0] = last;
    console.log(arr);
    console.log(arrnew);
}
arr1 = [12,-2,55];
swap(arr1);
console.log(arr1);