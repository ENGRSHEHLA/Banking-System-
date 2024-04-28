<!DOCTYPE html>
<html>
<head>
    <title>Bank Form</title>
</head>
<body>

<center>
<table border="1" cellspacing="0" cellpadding="1">
    <tr class="tableHeader">
        <th>Account Id</th>
        <th>Account Number</th>
        <th>Account Holder</th>
        <th>Contact Number</th>
        <th>Type Of Account</th>
        <th>Postal Address</th>
        <th>Action</th>
       
    </tr>
        <#list bank as bank>
        <tr class="tableBody">
            <td>${account.id}</td>
            <td>${account.accountNumber}</td>
            <td>${account.accountHolder}</td>
            <td>${account.contactNumber}</td>
            <td>${account.typeofAccount}</td>
            <td>${account.postalAddress}</td>
             
             <td>
                    <a href="edit/${account.id}">Edit</a>
                    <a href="delete/${account.id}">Delete</a>
                </td>     
        </tr>
    </#list>   
                              
</table>
<h1><a href="accountAdd"  method = "post" >Add </a>
</h1>
</center>
</body>
</html>
