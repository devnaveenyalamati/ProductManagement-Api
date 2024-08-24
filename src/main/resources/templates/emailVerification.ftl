<!DOCTYPE html>
<html>
<head>
    <title>Email Verification</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .email-container {
            max-width: 600px;
            margin: 20px auto;
            background-color: #ffffff;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .header {
            background-color: #ffffff;
            color: #000000;
            padding: 20px;
            text-align: center;
            border-top-left-radius: 10px;
            border-top-right-radius: 10px;
        }
        .footer {
            background-color: #000000;
            color: #ffffff;
            padding: 10px;
            text-align: center;
            border-bottom-left-radius: 10px;
            border-bottom-right-radius: 10px;
        }
        .content {
            padding: 20px;
        }
    </style>
</head>
<body>
    <div class="email-container">
        <div class="header">
            <h1>Welcome to Employee Management</h1>
        </div>
        <div class="content">
            <h2>Hello,User</h2>
            <p>This is the OTP <b>${otp}</b> that you had requested from Employee Management</p>
        </div>
        <div class="footer">
            <p>&copy; 2024 Employee Management. All rights reserved.</p>
        </div>
    </div>
</body>
</html>
