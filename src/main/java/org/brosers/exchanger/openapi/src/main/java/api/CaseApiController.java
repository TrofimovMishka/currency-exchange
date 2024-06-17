package api;

import model.Attachment;
import model.CalculationSummary;
import model.CaseData;
import model.CaseDataRevision;
import model.CaseMediator;
import model.ClientData;
import model.ClientInteractionEvent;
import model.ClientInteractionSummary;
import model.CourtHearingMeeting;
import model.CreditData;
import model.CreditDecision;
import model.CreditDecisionEvent;
import model.DocumentationData;
import model.FinalizationParameters;
import model.KNFData;
import model.KnfHistoryOperation;
import model.KnfMediator;
import model.MediationOutcome;
import model.NegotiationLimit;
import model.Note;
import model.NoteSectionEnum;
import model.OrganizationAttorney;
import model.Person;
import model.StatusResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:53:14.400592496+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
@Controller
@RequestMapping("${openapi.eYMediator.base-path:}")
public class CaseApiController implements CaseApi {

    private final NativeWebRequest request;

    @Autowired
    public CaseApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
