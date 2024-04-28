<!DOCTYPE html>
<html>
<head>
    <title>Bank</title>
</head>
<body>
<form action="/add" method="post">

   <label for = "amount">Amount:</label>
    <input type = "number" id = "amount" name = "amount">
    <br>
    
    <label for = "beneficiaryName">Beneficiary Name:</label> 
    <input type = "text" id = "beneficiaryName" name = "beneficiaryName">
    <br>
    
    
    <label for = "IBANnumber">IBAN Number:</label>
    <input type = "text" id = "IBANnumber" name = "IBANnumber">
    <br>
    
    <label for = "fromIBAN">From IBAN:</label>
    <input type = "text" id = "fromIBAN" name = "fromIBAN">
    <br>
    
    <label for = "paymentPurpose">Payment Purpose:</label>     
    <input type = "text" id = "paymentPurpose" name = "paymentPurpose">
    <br>
    
    <label for="transactionDate">Transaction Date:</label
    <input type = "date" id = "transactionDate" name = "transactionDate">
    <br>
    
     <label for="status">Status:</label>
    <input type = "text" id = "status" name = "status">
    <br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
