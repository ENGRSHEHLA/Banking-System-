<!-- edit-bank.ftl -->
<form action="/updateBank" method="post">
    <input type = "hidden" name = "id" value = "${bank.id}" />
    Bank Name: <input type = "text" name = "bankName" value = "${bank.bankName}" /><br/>
    Bank Code: <input type = "number" name = "code" value = "${bank.code}" /><br/>
    Branch Name:<input type = "text" name = "branch" value = "${bank.branch}" /><br/>
    City: <input type = "text" name = "city" value = "${bank.city}" /><br/>
    Helpline: <input type = "text" name = "helpline" value = "${bank.helpline}" /><br/>
    Manager Name: <input type = "text" name = "manager" value = "${bank.manager}" /><br/>
    <input type="submit" value="Update">
</form>
