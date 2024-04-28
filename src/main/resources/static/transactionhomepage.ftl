<!DOCTYPE html>
<html>
<head>
    <title>Transaction Form</title>
</head>
<body>

<center>
<table border="1" cellspacing="0" cellpadding="1">
    <tr class="tableHeader">
        <th>Transaction Id</th>
        <th>Amount</th>
        <th>Beneficiary Name</th>
        <th>IBAN Number</th>
        <th>From IBAN</th>
        <th>Payment Purpose</th>
        <th>Transaction Date</th>
        <th>Status</th>
        <th>Action</th>
       
    </tr>
        <#list bank as bank>
        <tr class="tableBody">
            <td>${transaction.id}</td>
            <td>${transaction.amount}</td>
            <td>${transaction.beneficiaryName}</td>
            <td>${transaction.IBANnumber}</td>
            <td>${transaction.fromIBAN}</td>
            <td>${transaction.paymentPurpose}</td>
            <td>${transaction.transactionDate}</td>
            <td>${transaction.status}</td>
            
             
             <td>
                    <a href="edit/${transaction.id}">Edit</a>
                    <a href="delete/${transaction.id}">Delete</a>
                </td>     
        </tr>
    </#list>   
                              
</table>
<h1><a href="transactionAdd"  method = "post" >Add </a>
</h1>
</center>
</body>
</html>
