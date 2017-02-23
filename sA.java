
var child = element.firstChild;
    var childrenDepth = [];

    if ( ! child ) {
        return 1;
    }

    while (child) {
        childrenDepth.push( solution(child) );
        child = child.nextSibling;
    }

    return Math.max.apply(Math, childrenDepth) + 1;
    
    