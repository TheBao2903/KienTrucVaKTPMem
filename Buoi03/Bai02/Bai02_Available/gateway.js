const express = require("express");
const { createProxyMiddleware } = require("http-proxy-middleware");

const app = express();

// Log để debug
app.use((req, res, next) => {
  console.log("➡️ Gateway received:", req.method, req.url);
  next();
});

// USER SERVICE
app.use(
  "/user",
  createProxyMiddleware({
    target: "http://localhost:8080/user",
    changeOrigin: true,
  })
);

// PRODUCT SERVICE
app.use(
  "/product",
  createProxyMiddleware({
    target: "http://localhost:8081/product",
    changeOrigin: true,
  })
);

// Root
app.get("/", (req, res) => {
  res.send("API Gateway is running");
});

app.listen(3000, () => {
  console.log("🚪 Gateway running on port 3000");
});
