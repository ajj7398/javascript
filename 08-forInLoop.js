

let array = [11, 22, 33, 44, 55, 66, 77];
console.log(`Traversing an array using for in loop..`);
let sum = 0;
for (const index in array) {
   sum = sum + array[index];
    }  
console.log(`Sum of array element is : ${sum}`);

