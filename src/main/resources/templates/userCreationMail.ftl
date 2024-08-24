<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to ${portalType}</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #000000;
            color: #ffffff;
        }
        .header {
            padding: 20px;
            text-align: center;
            background-color: #1a1a1a;
            border-bottom: 2px solid #333333;
        }
        .content {
            padding: 40px;
            text-align: center;
        }
        .footer {
            padding: 20px;
            text-align: center;
            background-color: #1a1a1a;
            border-top: 2px solid #333333;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        .highlight {
            color: #ff9900;
        }
    </style>
</head>
<body>

    <div class="header">
                <h1>Welcome User</h1>
    </div>

    <div class="content">
        <p>We are glad to announce that you have access to the <span class="highlight">${portalType}</span> portal.</p>
        <p>To log in, use your email and the password <span class="highlight">${password}</span>.</p>
    </div>

    <div class="footer">
        <p>&copy; 2024 ${portalType}. All rights reserved.</p>
    </div>

</body>
</html>
