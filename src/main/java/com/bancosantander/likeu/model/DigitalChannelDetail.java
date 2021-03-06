/*
 * Credits
 * The Credits API provides information about customer credit lines.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: gipinacho@santander.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.bancosantander.likeu.model;

/**
 * Retrieves the use of digital channels for this period
 */
public class DigitalChannelDetail {

  private String id = null;

/**
   * Indicates the status of the period.   * &#x60;ONGOING&#x60; -  Indicates that status for period is in progress.   * &#x60;FINISH&#x60; - Indicates that the period has ended. 
   */
      /**
 * Adds 10 to the age
 * @param input - The age to add 10 to
 * @returns {value} - The age + 10
 **/
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private String value;
/**
	 * @param String
	 */
    StatusEnum(String value) {
      this.value = value;
    }
/**
   * Indicates the key contract for the benefit
   * @return value
  **/ 
    public String getValue() {
      return value;
    }
  }  

   /**
   * Indicates tuse of digital channels identifier.
   * @return id
  **/
  public String getId() {
    return id;
  }
/**
	 * @param String
	 */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicates the date when this information was collected. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return operationDate
  **/
  public java.util.Date getOperationDate() {
    if (operationDate != null) {
      return new java.util.Date(this.operationDate.getTime());
    } else {
      return null;
    }

	}
	/**
	 * @param Date
	 */
	public void setOperationDate(java.util.Date operationDate) {

			this.operationDate = operationDate;

	}

}
