<!-- edit-Transaction.ftl -->
<form action="updateTransaction" method="post">
    <input type = "hidden" name = "id" value = "${transaction.id}" />
    Amount: <input type = "number" name = "amount" value = "${transaction.amount}" /><br/>
    Beneficiary Name:<input type = "text" name = "beneficiaryName" value = "${transaction.beneficiaryName}" /><br/>
    IBAN Number:  <input type = "text" name = "IBANnumber" value = "${transaction.IBANnumber}" /><br/>
    From IBAN: <input type = "text" name = "fromIBAN" value = "${transaction.fromIBAN}" /><br/>
    Payment Purpose:<input type = "text" name = "paymentPurpose" value = "${transaction.paymentPurpose}" /><br/>
    Transaction Date: <input type = "date" name = "transactionDate" value = "${transaction.transactionDate}" /><br/>
    Status: <input type = "text" name = "status" value = "${transaction.status}" /><br/>
  
    <input type="submit" value="Update">
</form>
