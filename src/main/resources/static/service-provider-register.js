document.getElementById("registerButton").addEventListener("click", async function () {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;
    const address = document.getElementById("address").value;
    const city = document.getElementById("city").value;
    const password = document.getElementById("password").value;

    const messageElement = document.getElementById("message");

    // Validate form input (basic example)
    if (!name || !email || !phone || !address || !city || !password) {
        messageElement.textContent = "Please fill out all fields.";
        messageElement.style.color = "red";
        return;
    }

    // Data to be sent to the server
    const data = {
        serviceProviderName: name,
        serviceProviderEmail: email,
        serviceProviderPhone: phone,
        serviceProviderAddress: address,
        serviceProviderCity: city,
        password: password
    };

    try {
        const response = await fetch("http://localhost:8080/api/v1/service-providers/register", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(data),
        });

        if (response.ok) {
            const result = await response.json();
            messageElement.textContent = "Registration successful!";
            messageElement.style.color = "green";
        } else {
            const error = await response.json();
            messageElement.textContent = error.message || "Registration failed.";
            messageElement.style.color = "red";
        }
    } catch (error) {
        messageElement.textContent = "An error occurred. Please try again later.";
        messageElement.style.color = "red";
        console.error("Error:", error);
    }
});
