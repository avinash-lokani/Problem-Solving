from model.Product import Product
from service import ProductService


def search(product_id):
    for obj in products:
        if obj.id == product_id:
            return obj
    return None


products = []

computer = Product(1, "Computer", 2000)
products.append(computer)
mouse = Product(2, "mouse", 300)
products.append(mouse)
keyboard = Product(3, "keyboard", 300)
products.append(keyboard)
speaker = Product(4, "speaker", 400)
products.append(speaker)
ProductService.addSuggestions(computer, mouse)
ProductService.addSuggestions(computer, keyboard)
ProductService.addSuggestions(computer, speaker)

while True:
    k = int(input("Enter 0 to add products, Enter 1 to add suggestions for a product, 2 to list products, 3 to delete "
                  "suggestions"))
    if k == 0:
        product_name = input("Enter the name of the product")
        product_price = int(input("Enter the price of the product"))
        product = Product(len(products) + 1, product_name, product_price)
        products.append(product)
    elif k == 1:
        product = search(int(input("Enter id of product to add suggestions")))
        if product is not None:
            suggested_id = int(input("Enter id of the product to add into suggestions"))
            temp = search(suggested_id)
            ProductService.addSuggestions(product, temp)
            ProductService.listProducts(products)
    elif k == 2:
        ProductService.listProducts(products)
    elif k == 3:
        product = search(int(input("Enter the id of the product to delete its suggestions")))
        suggested_id = int(input("Enter the id of suggested the product to delete"))
        temp = search(suggested_id)
        ProductService.deleteProduct(product, temp)
    else:
        break
