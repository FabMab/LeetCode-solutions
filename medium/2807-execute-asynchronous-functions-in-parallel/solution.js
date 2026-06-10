/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {

    const promise = new Promise((resolve, reject) => {
        const results = new Array(functions.length); //Array to store results in original orde
        let completed = 0;                           //Counter to track how many promises have resolved

        if (functions.length === 0){
            resolve(results);
            return;                               //Stop execution after resolving (Good practice)
        }

        //Iterate trhough each function
        for (let i = 0; i < functions.length; i++){
            const fn = functions[i];       //store reference to current function

            fn()
                .then(value => {
                    results[i] = value;   //store the result at the correct index to maintain ordrder
                    completed++;

                    // if all functions completed succesfully, resolve with results
                    if (completed === functions.length){
                        resolve(results);
                    }    
                })
                .catch((error) => {
                    reject(error);     //If any promise rejects, reject the main promise immediately
                });
        }

    });
    return promise;
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */