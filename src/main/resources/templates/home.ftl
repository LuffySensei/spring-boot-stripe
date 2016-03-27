<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <h1>Test Stripe Payment</h1>
    <form action="" method="POST">
        <script
                src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                data-key="Your_Data_Key"
                data-amount="2000"
                data-name="Demo Pay with Stripe"
                data-description="2 widgets ($20.00)"
                data-image="/shop.png"
                data-locale="auto">
        </script>
    </form>
</body>
</html>