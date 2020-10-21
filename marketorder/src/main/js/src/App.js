import React from "react";
import Filter from "./components/Filter";
import Products from "./components/Products";
import Cart from "./components/Cart";

function App() {
  return (
    <div className="grid-container">
      <header>
        <a href="/">React Market Order</a>
      </header>
      <main>
        <div className="content">
          <div className="main">
            <Filter></Filter>
            <Products></Products>
          </div>
          <div className="sidebar">
            <Cart></Cart>
          </div>
        </div>
      </main>
      <footer>All right is reserved.</footer>
    </div>
  );
}

export default App;
