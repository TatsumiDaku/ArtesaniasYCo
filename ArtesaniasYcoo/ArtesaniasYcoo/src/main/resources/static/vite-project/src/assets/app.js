const apiUrl = "http://localhost:8080/api/productos"; // URL del backend

// Elementos del DOM
const getProductsButton = document.getElementById("getProducts");
const productList = document.getElementById("productList");
const messageDiv = document.getElementById("message");

// Obtener productos
getProductsButton.addEventListener("click", async () => {
    try {
        const response = await fetch(apiUrl, { method: "GET" });

        // Verificar si la respuesta es válida
        if (!response.ok) {
            throw new Error(`Error en el servidor: ${response.status}`);
        }

        // Si la respuesta está vacía, evitar que se intente parsear JSON
        if (response.status === 204) {
            productList.innerHTML = "<li>No hay productos disponibles.</li>";
            messageDiv.innerHTML = "No hay productos disponibles.";
            return;  // Salir aquí, ya que no hay datos que procesar
        }

        // Intentar parsear la respuesta como JSON
        const data = await response.json();

        if (data.length === 0) {
            productList.innerHTML = "<li>No hay productos disponibles.</li>";
        } else {
            productList.innerHTML = data
                .map(product => `<li>${product.nombre} - ${product.precio}</li>`)
                .join("");
        }

        messageDiv.innerHTML = "Productos obtenidos con éxito.";
    } catch (error) {
        console.error("Error fetching products:", error);
        messageDiv.innerHTML = `Error al obtener productos: ${error.message}`;
    }
});
