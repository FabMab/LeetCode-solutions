/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let timer;
    return function(...args) {
        //if a timer is already waiting to execute, remove it 
       clearTimeout(timer);

       timer = setTimeout(() => {
        // use fn.apply(this, args) instead of fn(...args), to behave correctly for objects methods as well
          fn.apply(this ,args); 
       }, t); 
    };
};
//Key point: Keep track of the latest timer. Every new call cancels the previous timer and creates a new one.
/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */