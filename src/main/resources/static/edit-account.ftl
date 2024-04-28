<!-- edit-Account.ftl -->
<form action="/updateAccount" method="post">
    <input type = "hidden" name = "id" value = "${account.id}" />
    Account Number: <input type = "number" name = "accountNumber" value = "${account.accountNumber}" /><br/>
    Account Holder: <input type = "text" name = "accountHolder" value = "${account.accountHolder}" /><br/>
    Contact Number: <input type = "number" name = "contactNumber" value = "${account.contactNumber}" /><br/>
    Type Of Account:<input type = "text" name = "typeofAccount" value = "${account.typeofAccount}" /><br/>
    Postal Address: <input type = "text" name = "postalAddress" value = "${account.postalAddress}" /><br/>
    <input type="submit" value="Update">
</form>
