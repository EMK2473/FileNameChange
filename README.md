# File Name Change
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
This Java program reads a list of filenames from an input file and converts each filename ending with _photo.jpg to a new filename ending with _info.txt. The updated filenames are printed to the console.

## Installation Requirements
Using terminal commands: 

- Clone or download the repository: 
```Java 
- git clone https://github.com/your-username/FileNameChange.git 
```

- Navigate to the project directory: 
```Java
- cd FileNameChange 
```
- Compile the FileNameChange.java file: 
```Java
- javac FileNameChange.java 
```
- Run the program: 
```Java
- java FileNameChange
```  

## Application Usage
The program prompts you to enter the name of a file that contains a list of filenames. For each filename in the input file, the program replaces _photo.jpg with _info.txt and prints the result to the console. 

You can easily modify the program to replace any specified string in the filenames by updating the following line: 
```Java
String newFileName = photoName.replace("_photo.jpg", "_info.txt");
```

Input file (e.g., fileList.txt):
```Java  
image1_photo.jpg 
image2_photo.jpg 
image3_photo.jpg 
```
```Java
Output:
image1_info.txt 
image2_info.txt 
image3_info.txt
```

## Contributions
Eric Keeton

## Test Commands
To test the program:  

Create an input file with filenames ending in _photo.jpg. 

Run the program and ensure that the output correctly displays the filenames with _info.txt appended instead of _photo.jpg.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)