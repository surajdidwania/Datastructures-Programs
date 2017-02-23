
function uniq(arr) {
    return arr.reduce((prev, curr) => {
        if (prev.indexOf(curr) === -1) {
            prev = prev.concat(curr);
        }
        return prev;
    }, []);
}

function solution(A, B, M, X, Y) {
    let trip = 0,
        tripWeight = 0,
        rounds = [];
    
    for (let i = 0, len = A.length; i < len; i += 1) {
        if (typeof rounds[trip] !== 'undefined') {
            if (rounds[trip].length === X || tripWeight + A[i] > Y) {    
                trip++;   
                tripWeight = 0;
            }
        }
              rounds[trip] = rounds[trip] || [];
        rounds[trip].push(B[i]);  
        tripWeight += A[i];
    }
   
    rounds = rounds.map(round => uniq(round).length + 1);
    return rounds.reduce((prev, curr) => prev + curr, 0);
}
