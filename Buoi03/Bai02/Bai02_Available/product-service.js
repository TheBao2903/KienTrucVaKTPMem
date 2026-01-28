const express = require("express");
const app = express();

app.get("/product", (req, res) => {
  res.json({
    service: "PRODUCT SERVICE",
    port: 8081,
    status: "UP",
    data: {
      id: 101,
      name: "MacBook Pro",
    },
  });
});

app.listen(8081, () => {
  console.log("🔵 Product Service running on port 8081");
});
