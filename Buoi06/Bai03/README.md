# Food Delivery Mono-demo

This is a minimal monolithic demo combining:

- Backend: Spring Boot (Java + MongoDB)
- Frontend: React
- DB: MongoDB

How to run (recommended: service-based with docker-compose):

1. Copy `.env.sample` to `.env` and set any keys.
2. Start all services (MongoDB + Users + Menu + Orders + Frontend):

```powershell
docker compose up --build
```

3. Frontend will be available at `http://localhost:3000` and backend services at ports `8081`, `8082`, `8083`.

If you still prefer a single-container monolith demo, see the previous Dockerfile (mono) — but service-based is better for demonstrating a service architecture.

API endpoints (demo):

- `GET /api/users` — list users
- `POST /api/users` — create user
- `GET /api/menu` — list menu items
- `POST /api/menu` — create menu item
- `GET /api/orders` — list orders
- `POST /api/orders` — place order

Note: The Dockerfile runs `mongod` inside the same container for simplicity so you can demo a single-container setup. For production, use separate containers or managed DB.
