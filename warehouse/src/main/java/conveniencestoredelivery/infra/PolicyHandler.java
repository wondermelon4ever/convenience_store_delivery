package conveniencestoredelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import conveniencestoredelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import conveniencestoredelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired ParcelRepository parcelRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='InvoiceIssued'")
    public void wheneverInvoiceIssued_ScheculeParcelInbound(@Payload InvoiceIssued invoiceIssued){

        InvoiceIssued event = invoiceIssued;
        System.out.println("\n\n##### listener ScheculeParcelInbound : " + invoiceIssued + "\n\n");


        

        // Sample Logic //
        Parcel.scheculeParcelInbound(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='InvoiceCanceled'")
    public void wheneverInvoiceCanceled_CancelParcelInboundSchedule(@Payload InvoiceCanceled invoiceCanceled){

        InvoiceCanceled event = invoiceCanceled;
        System.out.println("\n\n##### listener CancelParcelInboundSchedule : " + invoiceCanceled + "\n\n");


        

        // Sample Logic //
        Parcel.cancelParcelInboundSchedule(event);
        

        

    }

}


