package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceAnalysis;
import org.bian.dto.BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRetrieveInputModel
 */
public class BQRegulatoryTermsRetrieveInputModel   {
  private Object regulatoryTermsRetrieveActionTaskRecord = null;

  private String regulatoryTermsRetrieveActionRequest = null;

  private BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceReport regulatoryTermsInstanceReport = null;

  private BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceAnalysis regulatoryTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return regulatoryTermsRetrieveActionTaskRecord
  **/

  public Object getRegulatoryTermsRetrieveActionTaskRecord() {
    return regulatoryTermsRetrieveActionTaskRecord;
  }

  public void setRegulatoryTermsRetrieveActionTaskRecord(Object regulatoryTermsRetrieveActionTaskRecord) {
    this.regulatoryTermsRetrieveActionTaskRecord = regulatoryTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return regulatoryTermsRetrieveActionRequest
  **/

  public String getRegulatoryTermsRetrieveActionRequest() {
    return regulatoryTermsRetrieveActionRequest;
  }

  public void setRegulatoryTermsRetrieveActionRequest(String regulatoryTermsRetrieveActionRequest) {
    this.regulatoryTermsRetrieveActionRequest = regulatoryTermsRetrieveActionRequest;
  }


  /**
   * Get regulatoryTermsInstanceReport
   * @return regulatoryTermsInstanceReport
  **/

  public BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceReport getRegulatoryTermsInstanceReport() {
    return regulatoryTermsInstanceReport;
  }

  public void setRegulatoryTermsInstanceReport(BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceReport regulatoryTermsInstanceReport) {
    this.regulatoryTermsInstanceReport = regulatoryTermsInstanceReport;
  }


  /**
   * Get regulatoryTermsInstanceAnalysis
   * @return regulatoryTermsInstanceAnalysis
  **/

  public BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceAnalysis getRegulatoryTermsInstanceAnalysis() {
    return regulatoryTermsInstanceAnalysis;
  }

  public void setRegulatoryTermsInstanceAnalysis(BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceAnalysis regulatoryTermsInstanceAnalysis) {
    this.regulatoryTermsInstanceAnalysis = regulatoryTermsInstanceAnalysis;
  }


}

