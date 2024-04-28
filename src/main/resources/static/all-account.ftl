<!DOCTYPE html>
<html>
<head>
    <title>Bank</title>
</head>
<body>
<form action="/add" method="post">

   <label for = "accountNumber"> Account Number:</label>
    <input type = "number" id = "accountNumber" name = "accountNumber">
    <br>
    
    <label for = "accountHolder"> Account Holder:</label> 
    <input type = "text" id = "accountHolder" name = "accountHolder">
    <br>
    
    <label for = "contactNumber">  Contact Number:</label>
    <input type = "number" id = "contactNumber" name = "contactNumber">
    <br>
    
    <label for = "typeofAccount"> Type Of Account:</label>     
    <input type = "text" id = "typeofAccount" name = "typeofAccount">
    <br>
    
    <label for="postalAddress"> Postal Address:</label
    <input type = "text" id = "postalAddress" name = "postalAddress">
    <br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
