package utez.edu.mx.adoptame.e4.controller;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import utez.edu.mx.adoptame.e4.entity.Order;
import utez.edu.mx.adoptame.e4.service.PaypalService;

@Controller
@RequestMapping(path = "/donation")
public class PaypalController {

    @Autowired
    PaypalService service;

    public static final String SUCCESS_URL = "donation/success";
    public static final String CANCEL_URL = "incorrectDonation";

    @GetMapping("/red")
    public String home() {
        System.out.println("Redirijo");
        return "views/donation/paypal";
    }
    @GetMapping("/success")
    public String succes() {
        System.out.println("Redirijo");
        return "views/donation/success";
    }
    Payment payment;
    @PostMapping("/pay")
    public String payment(@ModelAttribute("order") Order order) {
        try {
             payment= service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
                    order.getIntent(), order.getDescription(), "http://localhost:8080/" + CANCEL_URL,
                    "http://localhost:8080/"+SUCCESS_URL
            );

            for(Links link:payment.getLinks()) {
                if(link.getRel().equals("approval_url")) {
                    return "redirect:"+link.getHref();
                }
            }

        } catch (PayPalRESTException e) {

            e.printStackTrace();
        }
        return "index";
    }

    @GetMapping(value = CANCEL_URL)
    public String cancelPay() {
        return "views/incorrectDonation";
    }

    @GetMapping(value = SUCCESS_URL)
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
        try {
            Payment payment = service.executePayment(paymentId, payerId);
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
                return "index";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "index";
    }

}