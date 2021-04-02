var output = "";

for (var i = 0; i < 15; i++) {
    for (var j = 15; j > i; j--) {
        output += ' ';
    }
    for (var k = 0; k < 2 * i - 1; k++) {
        output += '*';
    }
    output += '\n';
}

console.log(output);