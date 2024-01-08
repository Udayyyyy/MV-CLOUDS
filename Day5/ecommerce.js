var cartitem = 0;

function addtocart() {
  cartitem += 1;
  document.getElementById("ammount").innerHTML = cartitem;
  console.log(cartitem)
}
// function removefromcart(){
//       if (cartitem > 0){
//             cartitem -= 1;
//             document.getElementById("ammount").innerHTML = cartitem;
//         } else{
//             alert('The item is already removed from the Cart');
//             }
//             }
 
function searchitem() {
  const searchInput = document.getElementById("searchInput").value.toLowerCase();
  const productCells = document.querySelectorAll(".cell");

  productCells.forEach(cell => {
    const productName = cell.querySelector("h2").textContent.toLowerCase();

    if (productName.includes(searchInput)) {
      cell.style.display = "block";
    } else {
      cell.style.display = "none";
    }
  });
}

 

 
