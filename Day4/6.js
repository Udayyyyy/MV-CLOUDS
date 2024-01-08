const fs = require("fs");

fs.readFile("6.txt", "utf-8", (err, data) => {
  if (err) {
    console.error("Error reading file:", err);
    return;
  }

  var words = data.split(/\s+/);
  console.log(words)
  let charIndices = {};

  for (let j = 0; j < words.length; j++) {
    let word = words[j];
    for (let i = 0; i < word.length; i++) {
      const char = word[i];

      if (charIndices.hasOwnProperty(char)) {
        console.log([char], ":", [charIndices[char], i]);
        charIndices = {};
        break
      }  
    else { 
        charIndices[char] = i; 
      }
    }
   charIndices = {};
  }
});
