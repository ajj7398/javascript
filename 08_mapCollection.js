const map = new Map();
map.set("Height", "5.9inc");
map.set("Weight", 49);
map.set("name", "Ajay");
map.set("city", "Pune");
map.set("married_status", true);
console.log(map);

console.log(map.get("name"));
console.log(`Adding duplicate key - name`);
map.set("name", "Ajay Kushwaha");
console.log(map);

map.set("country", "Utter Pradesh");
console.table(map);

console.log(`Map size is: ${map.size}`);
map.delete("country");
console.table(map);

console.log(`Is key available: ${map.has("name")}`);
console.log(`Is key available: ${map.has("gender")}`);

console.log(map.keys());
console.log(map.values());

console.log(`Map traversing...`);
const keys = map.keys();
for (const key of keys) {
    console.log(`${key} ==> ${map.get(key)}`);
}