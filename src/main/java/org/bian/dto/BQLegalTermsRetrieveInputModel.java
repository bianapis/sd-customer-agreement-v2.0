package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsRetrieveInputModelLegalTermsInstanceAnalysis;
import org.bian.dto.BQLegalTermsRetrieveInputModelLegalTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveInputModel
 */
public class BQLegalTermsRetrieveInputModel   {
  private Object legalTermsRetrieveActionTaskRecord = null;

  private String legalTermsRetrieveActionRequest = null;

  private BQLegalTermsRetrieveInputModelLegalTermsInstanceReport legalTermsInstanceReport = null;

  private BQLegalTermsRetrieveInputModelLegalTermsInstanceAnalysis legalTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return legalTermsRetrieveActionTaskRecord
  **/

  public Object getLegalTermsRetrieveActionTaskRecord() {
    return legalTermsRetrieveActionTaskRecord;
  }

  public void setLegalTermsRetrieveActionTaskRecord(Object legalTermsRetrieveActionTaskRecord) {
    this.legalTermsRetrieveActionTaskRecord = legalTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return legalTermsRetrieveActionRequest
  **/

  public String getLegalTermsRetrieveActionRequest() {
    return legalTermsRetrieveActionRequest;
  }

  public void setLegalTermsRetrieveActionRequest(String legalTermsRetrieveActionRequest) {
    this.legalTermsRetrieveActionRequest = legalTermsRetrieveActionRequest;
  }


  /**
   * Get legalTermsInstanceReport
   * @return legalTermsInstanceReport
  **/

  public BQLegalTermsRetrieveInputModelLegalTermsInstanceReport getLegalTermsInstanceReport() {
    return legalTermsInstanceReport;
  }

  public void setLegalTermsInstanceReport(BQLegalTermsRetrieveInputModelLegalTermsInstanceReport legalTermsInstanceReport) {
    this.legalTermsInstanceReport = legalTermsInstanceReport;
  }


  /**
   * Get legalTermsInstanceAnalysis
   * @return legalTermsInstanceAnalysis
  **/

  public BQLegalTermsRetrieveInputModelLegalTermsInstanceAnalysis getLegalTermsInstanceAnalysis() {
    return legalTermsInstanceAnalysis;
  }

  public void setLegalTermsInstanceAnalysis(BQLegalTermsRetrieveInputModelLegalTermsInstanceAnalysis legalTermsInstanceAnalysis) {
    this.legalTermsInstanceAnalysis = legalTermsInstanceAnalysis;
  }


}

