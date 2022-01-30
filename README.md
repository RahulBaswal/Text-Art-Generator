# Simplest Text Art Generator API  

A simple api to convert your input text to -> ASCII Stylish Font.

## API Reference

#### Base URL for all endpoints

```http
   https://textartgenerator.herokuapp.com/
```

#### Get text

```https
  GET /api/textart?type=0&text=Enter_Text_here
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `text`      | `string` | **required**. Enter Text to generate it's ASCII version |
| `type`      | `integer` | **optional**. to select which type of Font Style {**0-9** inclusive} |


#### return JSON Format Array[ ][ ] 
## Endpoints Examples

Enter the url in your browser with your text

```https
 1).https://textartgenerator.herokuapp.com/api/textart?type=3&text=enter text
 
 2).https://textartgenerator.herokuapp.com/api/textart?text=enter text

```
## Usage

using javascript code:

```javascript
fetch('https://textartgenerator.herokuapp.com/api/textart?text=TextHere')
.then(data => {
return data.json();
})
.then( textart => {

	// to print text horizontally
	for(let i=0; i<textart[0].length; i++) {
	let str="";
		for(let j=0; j<textart.length; j++) {
			str+=(textart[j][i]);
		}
		console.log(str+"\n");
	}
	
	// to print text vertically
	for(let i=0; i<textart.length; i++) {
	let str="";
		for(let j=0; j<textart[0].length; j++) {
			str+=(textart[i][j]);
			console.log(str+"\n");
			str="";
		}
	}
});


```

