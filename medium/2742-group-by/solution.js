/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    const grouped = {};

    for (let i =0; i < this.length; i++){
        const item = this[i];     //element in array

        //compute the grouping key
        const key = fn(item);

        // If key doesn't eist, initialise an empty arry for it
        if (!grouped[key]) {
            grouped[key]= [];
        }
        //add the current item to its group
        grouped[key].push(item);
    }

    return grouped;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */