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

k = int(input("Enter 1 to add suggestions for a product, 2 to list products"))
while True:
    if k == 1:
        product = search(int(input("Enter id of product to add suggestions")))
        if product is not None:
            suggested_id = int(input("Enter id of the product to add into suggestions"))
            temp = ProductService.search(suggested_id)
            ProductService.addSuggestions(product, temp)
    elif k == 2:
        ProductService.listProducts(products)
    else:
        break
