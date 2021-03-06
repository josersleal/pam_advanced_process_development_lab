package org.specialtripsagency;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PaymentObject implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String creditCardExpiryDate;
   private java.lang.String creditCardNumber;

   private java.math.BigDecimal amount;

   private java.lang.String creditCardHolderName;

   private java.lang.String status;

   public PaymentObject()
   {
   }

   public java.lang.String getCreditCardExpiryDate()
   {
      return this.creditCardExpiryDate;
   }

   public void setCreditCardExpiryDate(java.lang.String creditCardExpiryDate)
   {
      this.creditCardExpiryDate = creditCardExpiryDate;
   }

   public java.lang.String getCreditCardNumber()
   {
      return this.creditCardNumber;
   }

   public void setCreditCardNumber(java.lang.String creditCardNumber)
   {
      this.creditCardNumber = creditCardNumber;
   }

   public java.math.BigDecimal getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.math.BigDecimal amount)
   {
      this.amount = amount;
   }

   public java.lang.String getCreditCardHolderName()
   {
      return this.creditCardHolderName;
   }

   public void setCreditCardHolderName(java.lang.String creditCardHolderName)
   {
      this.creditCardHolderName = creditCardHolderName;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public PaymentObject(java.lang.String creditCardExpiryDate,
         java.lang.String creditCardNumber, java.math.BigDecimal amount,
         java.lang.String creditCardHolderName, java.lang.String status)
   {
      this.creditCardExpiryDate = creditCardExpiryDate;
      this.creditCardNumber = creditCardNumber;
      this.amount = amount;
      this.creditCardHolderName = creditCardHolderName;
      this.status = status;
   }

}