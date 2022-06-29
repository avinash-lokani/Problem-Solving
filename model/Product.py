class Product:
    def __init__(self, product_id, product_name, product_price):
        self.id = product_id
        self.name = product_name
        self.price = product_price
        self.suggested_products = []

    def __str__(self):
        s = " "
        for i in self.suggested_products:
            s += str(i.name) + " " + str(i.price) + " "
        return self.name + " " + str(self.price) + " " + s

    def add_suggestions(self, new_product):
        if new_product not in self.suggested_products:
            self.suggested_products.append(new_product)
