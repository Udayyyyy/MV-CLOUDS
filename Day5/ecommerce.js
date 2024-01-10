var cartitem = 0;
let cart = {}; 


function addtocart(productId,btnid,pid,mid) {
   
  if (!cart[productId]) {
    cart[productId] = 1;
    
    document.getElementById(btnid).style.visibility = "hidden";
    document.getElementById(productId).style.display = "block";
    document.getElementById(mid).style.visibility="visible"
    document.getElementById(pid).style.visibility = "visible";
  } else {
    
    cart[productId]++;
  }
  updateitemcount(productId);
  updateCartSummary();
}

function removefromcart(productId,btnid,pid,mid) {
   
  if (cart[productId] > 1) {
    cart[productId]--;
  }
  else if(cart[productId] == 1){
    document.getElementById(productId).style.display = "none";
    document.getElementById(btnid).style.visibility = "visible";
    
    console.log(cart[productId]);
    cart[productId]--;
    delete cart[productId];
    document.getElementById(mid).style.visibility = "hidden";
    document.getElementById(pid).style.visibility = "hidden";
  }
  else {
    
    alert("all items are removed");
  }
  
  updateitemcount(productId);
  updateCartSummary();
}
function updateitemcount(productId){
  
   document.getElementById(productId).innerHTML ="";
   document.getElementById(productId).innerHTML+=(cart[productId]);
  
   const ammountElement = document.getElementById("ammount");
   let totalCount = Object.values(cart).reduce(
     (total, count) => total + count,
     0
   );
   ammountElement.textContent = totalCount;

}
            
 
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

 

  
function updateCartSummary() {
  const cartItemsElement = document.getElementById("cartItemsPopup");
  const totalPriceElement = document.getElementById("totalPrice");
  const ammountElement = document.getElementById("ammount");

  cartItemsElement.innerHTML = "";  

  let totalPrice = 0;
  let totalItems = 0;
 
  for (const productId in cart) {
    const quantity = cart[productId];
    const li = document.createElement("li");
    li.innerHTML = `${productId} - Quantity: ${quantity}  `;
    cartItemsElement.appendChild(li);
 
    const price = parseInt(
      document.getElementById(productId).getAttribute("data-value")
    );
    console.log(price)
    totalPrice += quantity * price;
    totalItems += quantity;
  }
  
  const cartItemsPopupElement = document.getElementById("cartItemsPopup");
  cartItemsPopupElement.innerHTML = "";
  for (const productId in cart) {
    const quantity = cart[productId];
    const li = document.createElement("li");
     
    li.textContent = `${document.getElementById(productId.slice(1)).textContent} - Quantity: ${quantity}`;
    cartItemsPopupElement.appendChild(li);
  }
 
  const totalPricePopupElement = document.getElementById("totalPricePopup");
  totalPricePopupElement.innerHTML = totalPrice;
  console.log(totalPrice)
}

 
function openCartPopup() {
  const cartPopup = document.getElementById("cartPopup");
  const cartItemsPopupElement = document.getElementById("cartItemsPopup");
  if (Object.keys(cart).length > 0) {
    cartPopup.style.display = "block";
  } else {
    alert("Your cart is empty!");
  }
}
 
function closeCartPopup() {
  const cartPopup = document.getElementById("cartPopup");
  cartPopup.style.display = "none";
}
 
updateCartSummary();


const slides = document.getElementById("slides");
const slideWidth = document.querySelector(".slide").clientWidth;
let currentIndex = 0;

function nextSlide() {
  currentIndex = (currentIndex + 1) % slides.children.length;
  updateSlider();
}

function updateSlider() {
  slides.style.transform = `translateX(${-currentIndex * slideWidth}px)`;
}

setInterval(nextSlide, 3000); 