/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerAgreementApiService {

	SDCustomerAgreementActivateOutputModel activate(SDCustomerAgreementActivateInputModel request);
	
	SDCustomerAgreementConfigureOutputModel configure(String sdReferenceId, SDCustomerAgreementConfigureInputModel request);
	
	CRCustomerAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerAgreementControlInputModel request);
	
	CRCustomerAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerAgreementEvaluateInputModel request);
	
	BQLegalTermsEvaluateOutputModel evaluateLegalterms(String sdReferenceId, String crReferenceId, BQLegalTermsEvaluateInputModel request);
	
	BQPolicyTermsEvaluateOutputModel evaluatePolicyterms(String sdReferenceId, String crReferenceId, BQPolicyTermsEvaluateInputModel request);
	
	BQRegulatoryTermsEvaluateOutputModel evaluateRegulatoryterms(String sdReferenceId, String crReferenceId, BQRegulatoryTermsEvaluateInputModel request);
	
	CRCustomerAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerAgreementExchangeInputModel request);
	
	SDCustomerAgreementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerAgreementFeedbackInputModel request);
	
	CRCustomerAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerAgreementGrantInputModel request);
	
	BQLegalTermsRequestOutputModel requestLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsRequestInputModel request);
	
	BQPolicyTermsRequestOutputModel requestPolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsRequestInputModel request);
	
	BQRegulatoryTermsRequestOutputModel requestRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsRequestInputModel request);
	
	CRCustomerAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerAgreementRequestInputModel request);
	
	CRCustomerAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQLegalTermsRetrieveOutputModel retrieveLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPolicyTermsRetrieveOutputModel retrievePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQRegulatoryTermsRetrieveOutputModel retrieveRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerAgreementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerAgreementUpdateInputModel request);
	
	BQLegalTermsUpdateOutputModel updateLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsUpdateInputModel request);
	
	BQPolicyTermsUpdateOutputModel updatePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsUpdateInputModel request);
	
	BQRegulatoryTermsUpdateOutputModel updateRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsUpdateInputModel request);
	
}
