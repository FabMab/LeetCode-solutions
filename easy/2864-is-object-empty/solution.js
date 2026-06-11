/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {   
     for (const_ in obj){
        return false;
    }
    return true;
};