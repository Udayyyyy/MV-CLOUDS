var reducer=1;
var n=0
var flag=false
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
    innerElement.style.height =(currentheight-(30*reducer))+"px";
    innerElement.style.width = (currentwidth - (30*reducer))+ "px"; 
    reducer+=1;  
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
 