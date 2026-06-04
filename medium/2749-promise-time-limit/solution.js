/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    
    return async function(...args) { 

        //Original funtion promise we want to run
        const resolvedPromise = fn(...args);

        //timeout promise that rejects after t milliseconds
        const timeOutPromise = new Promise((_, reject) => {
            setTimeout(() => {
                reject("Time Limit Exceeded");
            }, t);
        });
    //Returns the first promise that settles (either resolve or reject).    
    return Promise.race([resolvedPromise, timeOutPromise]);
        
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */