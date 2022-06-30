
def addSuggestions(product, suggestion):
    product.add_suggestions(suggestion)


def listProducts(products):
    print("suggested Products for each product")
    for product in products:
        print(product)

