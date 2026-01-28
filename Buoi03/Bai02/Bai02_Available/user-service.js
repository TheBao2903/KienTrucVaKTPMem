const express = require("express");
const app = express();

app.get("/user", (req, res) => {
  res.json({
    service: "USER SERVICE",
    port: 8080,
    status: "UP",
    data: {
      id: 1,
      name: "Nguyen Van A",
    },
  });
});

app.listen(8080, () => {
  console.log("🟢 User Service running on port 8080");
});
