/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {

    //Wait for both promises to resolve and return a new promise that resolve with the sum of values
    const [value1,value2] = await Promise.all([promise1,promise2]);
    return value1 + value2;
    
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */