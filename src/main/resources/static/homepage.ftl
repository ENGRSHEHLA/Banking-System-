<!DOCTYPE html>
<html>
<head>
    <title>Bank Form</title>
</head>
<body>

<center>
<table border="1" cellspacing="0" cellpadding="1">
    <tr class="tableHeader">
        <th>Bank Id</th>
        <th>Bank Name</th>
        <th>Code</th>
        <th>Branch Name</th>
        <th>City Name</th>
        <th>Helpline</th>
        <th>Manager</th>
        <th>Action</th>
       
    </tr>
        <#list bank as bank>
        <tr class="tableBody">
            <td>${bank.id}</td>
            <td>${bank.bankName}</td>
            <td>${bank.code}</td>
            <td>${bank.branch}</td>
            <td>${bank.city}</td>
            <td>${bank.helpline}</td>
            <td>${bank.manager}</td>
             
             <td>
                    <a href="edit/${bank.id}">Edit</a>
                    <a href="delete/${bank.id}">Delete</a>
                </td>     
        </tr>
    </#list>   
                              
</table>
<h1><a href="formAdd"  method = "post" >Add </a>
</h1>
</center>
</body>
</html>
