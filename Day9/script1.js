var reducer=1;
var n=0
var flag=false
var align = 0;
onDragStart = function (ev) {
     
    

};

 
drop_handler = function (ev) {
  ev.preventDefault();
 
  var innerElement = document.getElementsByClassName("innercircles")[n];
  n+=1
  var container = document.getElementsByClassName("container")[0];
  var currentheight=200;
  var currentwidth=200;
  
    ev.target.appendChild(innerElement); 
    if (currentheight - 20 * reducer==20) {
      innerElement.style.height = 20+ "px";
      innerElement.style.width = 20+ "px";
      console.log(innerElement.style.width);
      if(align==0){
         innerElement.style.left="10px"
        innerElement.style.top = "10px";
        align+=1 
      }
      else{ 
         innerElement.style.left = "0px";
         innerElement.style.top = "0px";

      }
    } 
    else{
    innerElement.style.height =(currentheight-(20*reducer))+"px";
    console.log(currentheight - 20 * reducer);
    innerElement.style.width = (currentwidth - (20*reducer))+ "px"; 
    reducer+=1;}  
    var container = document.getElementsByClassName("container")[0];

    var newDiv = document.createElement("div");
    newDiv.className = "innercircles";
    newDiv.id = "inner";
    var randomcolor = `rgb(${Math.floor(Math.random() * 256)},${Math.floor(
      Math.random() * 256
    )},${Math.floor(Math.random() * 256)})`;
    newDiv.setAttribute("style", `background-color:${randomcolor};`);
    
    newDiv.setAttribute("draggable", "true");
    newDiv.setAttribute("ondragstart", "onDragStart(event)");
    container.appendChild(newDiv);
     
    


};


dragover_handler = function (ev) {
 
  ev.preventDefault();
  ev.dataTransfer.dropEffect = "move";  
    

};
 