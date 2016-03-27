package com.test.stripe;


import com.stripe.Stripe;
import com.stripe.model.Charge;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    String home() {
        return "home";
    }

    @RequestMapping(value = { "/"}, method = RequestMethod.POST)
    public String callback( HttpServletRequest request) {
        System.out.println("callback");
        Stripe.apiKey = "sk_test_YbH9ar0mLGGWQ6ZBHEWwjB9V";

        String token = request.getParameter("stripeToken");

        try {
            Map<String, Object> chargeParams = new HashMap<String, Object>();
            chargeParams.put("amount", 2000); // amount in cents, again
            chargeParams.put("currency", "usd");
            chargeParams.put("source", token);
            chargeParams.put("description", "Example charge");

            Charge charge = Charge.create(chargeParams);
            System.out.println(charge);
        } catch (Exception e) {
            // The card has been declined
        }
        return "home";
    }

}