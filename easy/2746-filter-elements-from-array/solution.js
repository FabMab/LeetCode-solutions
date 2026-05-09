/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const filteredArr = [];
    for (let i= 0; i < arr.length; i++) {
        if (!fn(arr[i], i)) continue;        
        filteredArr.push(arr[i]); //push into array, avoid 'holes'
    }
    return filteredArr;
};