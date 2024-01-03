const firebaseConfig = {
  apiKey: "AIzaSyACwC1nqK_GY89j0nEJFLwLZc5la02iy6A",
  authDomain: "day2-form5.firebaseapp.com",
  databaseURL: "https://day2-form5-default-rtdb.firebaseio.com",
  projectId: "day2-form5",
  storageBucket: "day2-form5.appspot.com",
  messagingSenderId: "27321788205",
  appId: "1:27321788205:web:4c1b12ea34cc71884395a4",
  measurementId: "G-VSDXGXN0VJ",
};

firebase.initializeApp(firebaseConfig);
 
var messagesRef = firebase.database().ref("messages");
 
document.getElementById("contactForm").addEventListener("submit", submitForm);
 
function submitForm(e) {
  e.preventDefault();
 
  var name = getInputVal("name");
  var company = getInputVal("company");
  var email = getInputVal("email");
  var phone = getInputVal("phone");
  var message = getInputVal("message");
 
  saveMessage(name, company, email, phone, message);
 
  document.getElementById("contactForm").reset();
}
 
function getInputVal(id) {
  return document.getElementById(id).value;
}
 
function saveMessage(name, company, email, phone, message) {
  var newMessageRef = messagesRef.push();
  newMessageRef.set({
    name: name,
    company: company,
    email: email,
    phone: phone,
    message: message,
  });
}
