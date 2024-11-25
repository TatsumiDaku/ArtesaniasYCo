
import './App.css';

export const app= ({ className, ...props }) => {

  return (
    <main className={`app${className}`} {...props}>
      <header className="promotion">
        <span>CELEBRA LA ARTESANÍA: 60% OFF EN PRODUCTOS TRADICIONALES 🎁</span>
      </header>

      <header className="header">
        <div className="logo">
          <img src="/images/logo-AnyEraser.png" alt="Artesanías with a shopping cart icon" width="50" height="50" />
          <h1>Artesanías&Co</h1>
        </div>
        <nav className="nav">
          <a href="#">Hogar</a>
          <a href="#">Comercio</a>
          <a href="#">Nosotros</a>
          <a href="#">Contacto</a>
          <a href="#">Editar</a>
        </nav>
        <div className="search-container">
          <input type="text" className="search-input" placeholder="Buscar productos..." />
          <button className="search-button">
            <i className="fas fa-search"></i>
          </button>
        </div>
        <div className="icons">
          <i className="fas fa-shopping-cart"></i>
          <img src="https://storage.googleapis.com/a1aa/image/4Peb0FecojpQp06U5c6xwpZtCi4fZQCAVvVCccLeyiwCEDQPB.jpg" alt="Profile icon resembling a user profile picture" width="40" height="40" />
        </div>
      </header>

      <section className="carousel-container">
        <div className="left-container">
          <h3>Productos Destacados</h3>
          <ul>
            <li>
              <img src="/images/ceramica-tradicional-colombiana.jpg" alt="Cerámica Artesanal" />
              <div className="product-info">
                <h4>Cerámica de Ráquira</h4>
                <p>$180.000 COP</p>
              </div>
            </li>
            <li>
              <img src="/images/mochila-wayuu.jpg" alt="Mochila Wayuu" />
              <div className="product-info">
                <h4>Mochila Wayuu</h4>
                <p>$250.000 COP</p>
              </div>
            </li>
            <li>
              <img src="/images/sombrero-vueltiao.jpg" alt="Sombrero Vueltiao" />
              <div className="product-info">
                <h4>Sombrero Vueltiao</h4>
                <p>$350.000 COP</p>
              </div>
            </li>
          </ul>
        </div>

        <section className="carousel">
          <img className="active" src="https://cdn.pixabay.com/photo/2012/11/07/02/07/jugs-64975_1280.jpg" width="1200" height="600" />
          <img src="/images/piclumen-1730073782414.png" width="1200" height="600" />
          <img src="https://storage.googleapis.com/a1aa/image/rE4a4NCWezwGEqVy2c6YWH8u1SMvAMepuhGOwXZKI1kCxA0TA.jpg" width="1200" height="600" />
          <img src="https://storage.googleapis.com/a1aa/image/qjmrhGPYagLnHFTfVyTghwe4lP7BhpQu8nrErcUBumYfhBonA.jpg" width="1200" height="600" />
          <img src="/images/piclumen-1730084546453.png" width="1200" height=" 600" />
          <img src="/images/piclumen-1730084698681.png" width="1200" height="600" />
          <div className="controls">
            <i className="fas fa-chevron-left prev"></i>
            <i className="fas fa-chevron-right next"></i>
          </div>
        </section>

        <div className="right-container">
          <h3>Promociones Especiales</h3>
          <ul>
            <li>
              <img src="https://storage.googleapis.com/a1aa/image/promocion-1.jpg" alt="Promoción 1" />
              <div className="promo-info">
                <h4>Descuento 60% OFF</h4>
                <p>Colección de Invierno</p>
              </div>
            </li>
            <li>
              <img src="https://storage.googleapis.com/a1aa/image/promocion-2.jpg" alt="Promoción 2" />
              <div className="promo-info">
                <h4>2x1 en Accesorios</h4>
                <p>Tiempo Limitado</p>
              </div>
            </li>
            <li>
              <img src="https://storage.googleapis.com/a1aa/image/promocion-3.jpg" alt="Promoción 3" />
              <div className="promo-info">
                <h4>Envío Gratis</h4>
                <p>Compras superiores a $120.000 COP</p>
              </div>
            </li>
          </ul>
        </div>
      </section>

      <main>
        <section className="product-grid">
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/KxNh8KkFJNqvFpGeUc8PDFdlwtYlSLEbiiLltt7DuunKZA6JA.jpg" alt="Product image of a stylish modern chair" width="200" height="150" />
            <h2>Modern Chair</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/easLyokfXTpI1Ede1YzUQQBLHqCuZ5Toon2inYPM8yEJkBonA.jpg" alt="Product image of a sleek smartphone" width="200" height="150" />
            <h2>Smartphone</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/650LQxeIW7zrDSWDaCngKfoMjX9PcEAJ5fVy3QVfjNQnIDQPB.jpg" alt="Product image of a pair of running shoes" width="200" height="150" />
            <h2>Running Shoes</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/vhsn2oXuxLYXJZnH7cxHGKbi6sl6pIhOmoK3FUyGBSahMA9E.jpg" alt="Product image of a stylish wristwatch" width="200" height="150" />
            <h2>Wristwatch</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/vhsn2oXuxLYXJZnH7cxHGKbi6sl6pIhOmoK3FUyGBSahMA9E.jpg" alt="Product image of a stylish wristwatch" width="200" height="150" />
            <h2>Luxury Wristwatch</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/easLyokfXTpI1Ede1YzUQQBLHqCuZ5Toon2inYPM8yEJkBonA.jpg" alt="Product image of a modern smartphone" width="200" height="150" />
            <h2>Smartphone Pro</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/wireless-earbuds.jpg" alt="Product image of wireless earbuds" width="200" height="150" />
            <h2>Noise-Cancelling Earbuds</h2>
          </div>
          <div className="product-card">
            <img src="https ://storage.googleapis.com/a1aa/image/bluetooth-speaker.jpg" alt="Product image of a bluetooth speaker" width="200" height="150" />
            <h2>Portable Bluetooth Speaker</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/qceDlOODt70qA67VKcvRUrWAz0LlOLJQ2OdWkB7AVCJGZA6JA.jpg" alt="Product image of a leather handbag" width="200" height="150" />
            <h2>Leather Handbag</h2>
          </div>
          <div className="product-card">
            <img src="https://storage.googleapis.com/a1aa/image/d5WwUWnZOZp4MplK13A3z8v4feSUfUTYbShElddohKKeIDQPB.jpg" alt="Product image of a gaming console" width="200" height="150" />
            <h2>Gaming Console</h2>
          </div>
        </section>

        <section className="new-products">
          <h2>Nuevos Productos</h2>
          <div className="new-product-grid">
            <div className="new-product-card">
              <img src="https://storage.googleapis.com/a1aa/image/easLyokfXTpI1Ede1YzUQQBLHqCuZ5Toon2inYPM8yEJkBonA.jpg" alt="Product image of a sleek smartphone" />
              <h3>Smartphone</h3>
              <p>Un smartphone elegante y potente.</p>
              <div className="price">$699.00</div>
              <div className="product-actions">
                <button className="buy-button">Comprar</button>
                <div className="cart-icon">
                  <i className="fas fa-shopping-cart"></i>
                </div>
              </div>
            </div>
            <div className="new-product-card">
              <img src="https://storage.googleapis.com/a1aa/image/650LQxeIW7zrDSWDaCngKfoMjX9PcEAJ5fVy3QVfjNQnIDQPB.jpg" alt="Product image of a pair of running shoes" />
              <h3>Running Shoes</h3>
              <p>Zapatillas cómodas y duraderas.</p>
              <div className="price">$85.00</div>
              <div className="product-actions">
                <button className="buy-button">Comprar</button>
                <div className="cart-icon">
                  <i className="fas fa-shopping-cart"></i>
                </div>
              </div>
            </div>
            <div className="new-product-card">
              <img src="https://storage.googleapis.com/a1aa/image/vhsn2oXuxLYXJZnH7cxHGKbi6sl6pIhOmoK3FUyGBSahMA9E.jpg" alt="Product image of a stylish wristwatch" />
              <h3>Wristwatch</h3>
              <p>Un reloj elegante con correa de cuero.</p>
              <div className="price">$150.00</div>
              <div className="product-actions">
                <button className="buy-button">Comprar</button>
                <div className="cart-icon">
                  <i className="fas fa-shopping-cart"></i>
                </div>
              </div>
            </div>
            <div className="new-product-card">
              <img src="https://storage.googleapis.com/a1aa/image/wireless-earbuds.jpg" alt="Product image of wireless earbuds" />
              <h3>Wireless Earbuds</h3>
              <p>Audífonos inalámbricos de alta calidad.</p>
              <div className="price">$79.99</div>
              <div className="product-actions">
                <button className="buy-button">Comprar</button>
                <div className="cart-icon">
                  <i className="fas fa-shopping-cart"></i>
                </div>
              </div>
            </div>
            <div className="new-product-card">
              <img src="https://storage.googleapis.com/a1aa/image/gaming-mouse.jpg" alt="Product image of a gaming mouse" />
              <h3>Gaming Mouse</h3>
              <p>Mouse de alta precisión para gamers.</p>
              <div className="price">$59.99</div>
              <div className="product-actions">
                <button className="buy -button">Comprar</button>
                <div className="cart-icon">
                  <i className="fas fa-shopping-cart"></i>
                </div>
              </div>
            </div>
            <div className="new-product-card">
              <img src="https://storage.googleapis.com/a1aa/image/bluetooth-speaker.jpg" alt="Product image of a bluetooth speaker" />
              <h3>Bluetooth Speaker</h3>
              <p>Altavoz bluetooth portátil con sonido premium.</p>
              <div className="price">$69.99</div>
              <div className="product-actions">
                <button className="buy-button">Comprar</button>
                <div className="cart-icon">
                  <i className="fas fa-shopping-cart"></i>
                </div>
              </div>
            </div>
          </div>
        </section>

        <section className="newsletter-section">
          <div className="newsletter-container">
            <div className="newsletter-left">
              <div className="newsletter-text">
                <h1>Descubre Nuestras Novedades</h1>
                <p>Mantente informado de las últimas tendencias y ofertas exclusivas</p>
                <ul className="newsletter-benefits">
                  <li>🎁 Descuentos especiales</li>
                  <li>📦 Envío gratis</li>
                  <li>🌟 Productos en primicia</li>
                  <li>💡 Consejos de estilo</li>
                  <li>🔔 Alertas de promociones</li>
                </ul>
              </div>
            </div>
            <div className="newsletter-right">
              <div className="newsletter-form">
                <input type="email" placeholder="Ingresa tu correo electrónico" required />
                <button className="newsletter-submit">
                  <i className="fas fa-arrow-right" style={{ color: 'green' }}></i>
                </button>
              </div>
            </div>
          </div>
        </section>

        <footer className="artesanal-footer">
          <div className="footer-container">
            <div className="footer-logo">
              <img src="/images/logo-AnyEraser.png" alt="Logo Artesanías" />
              <h2>Artesanías Tradicionales</h2>
              <p>Preservando la cultura a través de nuestros productos</p>
              <div className="social-icons">
                <a href="#" className="fab fa-facebook"></a>
                <a href="#" className="fab fa-instagram"></a>
                <a href="#" className="fab fa-twitter"></a>
                <a href="#" className="fab fa-pinterest"></a>
              </div>
            </div>
            <div className="footer-column">
              <h3>Accesorios</h3>
              <ul>
                <li><a href="#">Collares Artesanales</a></li>
                <li><a href="#">Pulseras Étnicas</a></li>
                <li><a href="#">Aretes Tradicionales</a></li>
                <li><a href="#">Broches Decorativos</a></li>
              </ul>
            </div>
            <div className="footer-column">
              <h3>Ropa</h3>
              <ul>
                <li><a href="#">Textiles Andinos</a></li>
                <li><a href="#">Ponchos Artesanales</a></li>
                <li><a href="#">Chales Bordados</a></li>
                <li><a href="#">Vestidos Tradicionales</a></li>
              </ul>
            </div>
            <div className="footer-column">
              <h3>Implementos</h3>
              <ul>
                <li><a href="#">Cerámicas</a></li>
                <li><a href="#">Instrumentos Musicales</a></li>
                <li><a href="#">Herramientas Artesanales</a></li>
                <li><a href="#">Decoración Tradicional</a></li>
              </ul>
            </div>
          </div>
          <div className="footer-bottom-absolute">
            <p>© 2024 Artesanías Tradicionales. Todos los derechos reservados.</p>
          </div>
        </footer>
      </main>
  };
export default App;