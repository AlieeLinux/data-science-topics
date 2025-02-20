import pandas as pd

customer_data = pd.read_csv("customers-100.csv", header=0, sep=",")

print(customer_data.head())
