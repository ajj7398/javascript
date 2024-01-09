

const arrayNum = [ 2, 4, 6, 8 ]; 
console.log(arrayNum);
console.log(`Total elements in the array is: ${arrayNum.length}`);
console.log(`Array type is: ${typeof arrayNum}`);

console.log(`===== Read or Access value from array =====`);
const elementAtIndex2 = arrayNum[2];
console.log(`Element at index 2 is: ${elementAtIndex2}`);

console.log(`===== Traversing value from array =====`);
for (let index = 0; index < arrayNum.length; index++) {
    const element = arrayNum[index];
    console.log(element);
}

console.log(`===== WAP to Sum of from array =====`);
let sum = 0;
for (let index = 0; index < arrayNum.length; index++) {
    sum = sum + arrayNum[index];
}
console.log(sum);