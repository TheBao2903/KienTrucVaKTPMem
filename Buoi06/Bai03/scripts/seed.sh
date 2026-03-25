#!/usr/bin/env bash
set -euo pipefail
echo "Seeding demo data to users/menu/orders services..."

echo "Creating user..."
USER_ID=$(curl -s -X POST -H "Content-Type: application/json" -d '{"name":"Alice","email":"alice@example.com"}' http://localhost:8081/api/users | jq -r '.id')
echo "User id: $USER_ID"

echo "Creating menu item..."
MENU_ID=$(curl -s -X POST -H "Content-Type: application/json" -d '{"name":"Pho","price":5.5}' http://localhost:8082/api/menu | jq -r '.id')
echo "Menu id: $MENU_ID"

echo "Creating order..."
curl -s -X POST -H "Content-Type: application/json" -d "{\"userId\":\"$USER_ID\",\"itemIds\":[\"$MENU_ID\"]}" http://localhost:8083/api/orders | jq
echo "Seeding completed."
