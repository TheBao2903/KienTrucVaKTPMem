import React, { useEffect, useState } from "react";

const USERS_API = process.env.REACT_APP_USERS_URL;
const MENU_API = process.env.REACT_APP_MENU_URL;
const ORDERS_API = process.env.REACT_APP_ORDERS_URL;

function App() {
  const [users, setUsers] = useState([]);
  const [menu, setMenu] = useState([]);
  const [orders, setOrders] = useState([]);

  useEffect(() => {
    fetch(USERS_API)
      .then((r) => r.json())
      .then(setUsers)
      .catch(() => {});
    fetch(MENU_API)
      .then((r) => r.json())
      .then(setMenu)
      .catch(() => {});
    fetch(ORDERS_API)
      .then((r) => r.json())
      .then(setOrders)
      .catch(() => {});
  }, []);

  return (
    <div style={{ padding: 20 }}>
      <h1>Food Delivery (Demo)</h1>
      <section>
        <h2>Users</h2>
        <ul>
          {users.map((u) => (
            <li key={u.id}>
              {u.name} - {u.email}
            </li>
          ))}
        </ul>
      </section>
      <section>
        <h2>Menu</h2>
        <ul>
          {menu.map((m) => (
            <li key={m.id}>
              {m.name} — ${m.price}
            </li>
          ))}
        </ul>
      </section>
      <section>
        <h2>Orders</h2>
        <ul>
          {orders.map((o) => (
            <li key={o.id}>
              Order {o.id} — User: {o.userId} — Items:{" "}
              {o.items ? o.items.length : 0}
            </li>
          ))}
        </ul>
      </section>
    </div>
  );
}

export default App;
