def addSuggestions(product, suggestion):
    product.add_suggestions(suggestion)


def listProducts(products):
    print("suggested Products for each product")
    for i in products:
        print(i)


def search(product_id):
    from main import products
    for product in products:
        if product.id == product_id:
            return product
    return None
