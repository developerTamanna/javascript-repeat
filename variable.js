var age = 30;
var price = 100;
if (age < 18) {
  price = price * 0.9;
}
 else if (age >= 70) {
  price = price * 0.5;
}
else {
  price = price;
}
console.log('final price: ', price);
