# PowerShell seed script for the demo services
Write-Host "Seeding demo data to users/menu/orders services..."
try {
  Write-Host "Creating user..."
  $user = Invoke-RestMethod -Method Post -Uri 'http://localhost:8081/api/users' -ContentType 'application/json' -Body (@{name='Alice'; email='alice@example.com'} | ConvertTo-Json)
  Write-Host "User id: $($user.id)"

  Write-Host "Creating menu item..."
  $menu = Invoke-RestMethod -Method Post -Uri 'http://localhost:8082/api/menu' -ContentType 'application/json' -Body (@{name='Pho'; price=5.5} | ConvertTo-Json)
  Write-Host "Menu id: $($menu.id)"

  Write-Host "Creating order..."
  $order = Invoke-RestMethod -Method Post -Uri 'http://localhost:8083/api/orders' -ContentType 'application/json' -Body (@{userId=$user.id; itemIds=@($menu.id)} | ConvertTo-Json)
  Write-Host "Order id: $($order.id)"
  Write-Host "Seeding completed."
} catch {
  Write-Error "Seeding failed: $_"
  exit 1
}
