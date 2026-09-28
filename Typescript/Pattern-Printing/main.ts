import * as readline from 'node:readline';

function factorial(num: number): number {
    let fact = 1;
    for (let i = 1; i <= num; i++) {
            fact = fact * i;
        }
    return fact;
}

function printPascalsTriangle(exponent: number): void {
    for (let n: number = 0; n < exponent + 1; n++) {
        let row = new Array<number>(n + 1);
        for (let k: number = 0; k < n + 1; k++) {
            row[k] = factorial(n)/(factorial(k) * factorial(n - k));
        }
        console.log(row);
    }
}

const input = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

input.question('Enter exponent: ', (answer: string) => {
    const exponent = Number.parseInt(answer, 10);

    if (!Number.isInteger(exponent) || exponent < 0) {
        console.error('Please enter a non-negative whole number.');
    } else {
        printPascalsTriangle(exponent);
    }

    input.close();
});

