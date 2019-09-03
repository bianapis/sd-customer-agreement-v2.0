/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerAgreementApiServiceImpl implements CustomerAgreementApiService {

	public SDCustomerAgreementActivateOutputModel activate(SDCustomerAgreementActivateInputModel request){
		return JsonReader.read("activate-SDCustomerAgreementActivateOutputModel.json",new TypeReference<SDCustomerAgreementActivateOutputModel>(){});
	}
	
	public SDCustomerAgreementConfigureOutputModel configure(String sdReferenceId, SDCustomerAgreementConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerAgreementConfigureOutputModel.json",new TypeReference<SDCustomerAgreementConfigureOutputModel>(){});
	}
	
	public CRCustomerAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerAgreementControlInputModel request){
		return JsonReader.read("control-CRCustomerAgreementControlOutputModel.json",new TypeReference<CRCustomerAgreementControlOutputModel>(){});
	}
	
	public CRCustomerAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCustomerAgreementEvaluateOutputModel.json",new TypeReference<CRCustomerAgreementEvaluateOutputModel>(){});
	}
	
	public BQLegalTermsEvaluateOutputModel evaluateLegalterms(String sdReferenceId, String crReferenceId, BQLegalTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQLegalTermsEvaluateOutputModel.json",new TypeReference<BQLegalTermsEvaluateOutputModel>(){});
	}
	
	public BQPolicyTermsEvaluateOutputModel evaluatePolicyterms(String sdReferenceId, String crReferenceId, BQPolicyTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPolicyTermsEvaluateOutputModel.json",new TypeReference<BQPolicyTermsEvaluateOutputModel>(){});
	}
	
	public BQRegulatoryTermsEvaluateOutputModel evaluateRegulatoryterms(String sdReferenceId, String crReferenceId, BQRegulatoryTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQRegulatoryTermsEvaluateOutputModel.json",new TypeReference<BQRegulatoryTermsEvaluateOutputModel>(){});
	}
	
	public CRCustomerAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerAgreementExchangeOutputModel.json",new TypeReference<CRCustomerAgreementExchangeOutputModel>(){});
	}
	
	public SDCustomerAgreementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerAgreementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerAgreementFeedbackOutputModel.json",new TypeReference<SDCustomerAgreementFeedbackOutputModel>(){});
	}
	
	public CRCustomerAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerAgreementGrantInputModel request){
		return JsonReader.read("grant-CRCustomerAgreementGrantOutputModel.json",new TypeReference<CRCustomerAgreementGrantOutputModel>(){});
	}
	
	public BQLegalTermsRequestOutputModel requestLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsRequestInputModel request){
		return JsonReader.read("request-BQLegalTermsRequestOutputModel.json",new TypeReference<BQLegalTermsRequestOutputModel>(){});
	}
	
	public BQPolicyTermsRequestOutputModel requestPolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsRequestInputModel request){
		return JsonReader.read("request-BQPolicyTermsRequestOutputModel.json",new TypeReference<BQPolicyTermsRequestOutputModel>(){});
	}
	
	public BQRegulatoryTermsRequestOutputModel requestRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsRequestInputModel request){
		return JsonReader.read("request-BQRegulatoryTermsRequestOutputModel.json",new TypeReference<BQRegulatoryTermsRequestOutputModel>(){});
	}
	
	public CRCustomerAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerAgreementRequestInputModel request){
		return JsonReader.read("request-CRCustomerAgreementRequestOutputModel.json",new TypeReference<CRCustomerAgreementRequestOutputModel>(){});
	}
	
	public CRCustomerAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerAgreementRetrieveOutputModel.json",new TypeReference<CRCustomerAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQLegalTermsRetrieveOutputModel retrieveLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLegalTermsRetrieveOutputModel.json",new TypeReference<BQLegalTermsRetrieveOutputModel>(){});
	}
	
	public BQPolicyTermsRetrieveOutputModel retrievePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPolicyTermsRetrieveOutputModel.json",new TypeReference<BQPolicyTermsRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQRegulatoryTermsRetrieveOutputModel retrieveRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRegulatoryTermsRetrieveOutputModel.json",new TypeReference<BQRegulatoryTermsRetrieveOutputModel>(){});
	}
	
	public SDCustomerAgreementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerAgreementRetrieveOutputModel.json",new TypeReference<SDCustomerAgreementRetrieveOutputModel>(){});
	}
	
	public CRCustomerAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerAgreementUpdateInputModel request){
		return JsonReader.read("update-CRCustomerAgreementUpdateOutputModel.json",new TypeReference<CRCustomerAgreementUpdateOutputModel>(){});
	}
	
	public BQLegalTermsUpdateOutputModel updateLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsUpdateInputModel request){
		return JsonReader.read("update-BQLegalTermsUpdateOutputModel.json",new TypeReference<BQLegalTermsUpdateOutputModel>(){});
	}
	
	public BQPolicyTermsUpdateOutputModel updatePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsUpdateInputModel request){
		return JsonReader.read("update-BQPolicyTermsUpdateOutputModel.json",new TypeReference<BQPolicyTermsUpdateOutputModel>(){});
	}
	
	public BQRegulatoryTermsUpdateOutputModel updateRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsUpdateInputModel request){
		return JsonReader.read("update-BQRegulatoryTermsUpdateOutputModel.json",new TypeReference<BQRegulatoryTermsUpdateOutputModel>(){});
	}
	
}
