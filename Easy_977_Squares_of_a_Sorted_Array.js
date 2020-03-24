/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    var number = new Array(A.length);
    for(i in A){
        number[i] = A[i] * A[i];
    }
    number.sort(function(a, b){return a-b});
    return number;
};