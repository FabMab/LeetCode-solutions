var TimeLimitedCache = function() {
  // Map to store key -> [value, expiration time]
  this.cache = new Map(); 
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    //calculate absolute expiration time : current time + duration
    const expiration = now + duration;

    //checks if keys exists AND is not expired
    const existsAndNotExpired = this.cache.has(key) && this.cache.get(key)[1] > now;

    //Store/update the entry : array [value, expirationTime]
    //updationg expiration even if it was expired (treat exoired as new)
    this.cache.set(key, [value, expiration]);

    return existsAndNotExpired;

};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();

    if (!this.cache.has(key)){
        return -1;
    }
    //Array destructuring - this.cache.get(key) returns [value, expiration]
    const [value, expiration] = this.cache.get(key);
    // if current time has passed expiration, it's expired
    if (expiration <= now){
        //Optional : Clean up expired entry to save memory
        this.cache.delete(key); //not required by problem
        return -1;
    }
    return value;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let count = 0;

    for(const [key, [, expiration]] of this.cache){
        if (expiration > now){
            count ++;
        }else{
            //optional cleanup of expired entries during count
            this.cache.delete(key);
        }
    }
    return count;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */