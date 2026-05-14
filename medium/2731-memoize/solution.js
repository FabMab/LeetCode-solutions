/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {

    //Cache to store  previously computed results
    const cache =  new Map();

    return function(...args) {

        //convert function arguments int a unique key
        const key = JSON.stringify(args);

        //If result exists in cahe, return cache value
        if (cache.has(key)){
            return cache.get(key);
        }

        //Otherwise compute result, store it in cache and return computed result
        const result = fn(...args);
        cache.set(key, result);

        return result;
        
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */