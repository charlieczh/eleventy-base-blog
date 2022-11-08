function outer(a) {
    function inner(b) {
        return a + b;
    }
    return inner;
}

console.log(outer(1)(2));