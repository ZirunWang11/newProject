Java Code Challenge

## Check Path
There are 5 branches

 1. Main branch only contain README
 2. First_master is the first commit which including UML and frame class
 3. Second_master is the second commit which including two more class
 4. Third_master which including overwrite part
 5. Final_master which is the final version

Used Eclipse IDE for Enterprise and Web Developer to finish this Code Challenge.

Created a Dynamic Web Project

Library part:

Used GSON 2.6.2 for implement JSON function.

Used Jersey and Jakarta for implement RESTful API.


## Create Function
This is the POST function with path - /api/createProduct
This method takes a Product as input and return the saved object

## Read Function

This is the GET function with path - /api/getProducts
This method dose not take any input and return a list of products

## Update Function

This is the PUTfunction with path - /api/updateProduct
This method takes a String and Product as input and return updated product


## Delete Funtion

This is the DELETE function with path - /api/deleteProduct
This method takes a String and return a message "Successfully Deleted the Product: " + name, if the Product has been delete;
This method also return a message "Product not found!", if the Product not found;

# Reference

com/google/code/gson/gson/2.6.2. GSON

[https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/)

ECLIPSE FUNDATION. Eclipse Jersey 3.x

From: [https://eclipse-ee4j.github.io/jersey/](https://eclipse-ee4j.github.io/jersey/)


