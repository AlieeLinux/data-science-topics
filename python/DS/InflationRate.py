import pandas as pd
import matplotlib.pyplot as plt

def main():
    print("Hello world")
    lists = pd.read_csv("Inflation.csv", sep=",")
    x = lists["Year"].astype(float)
    y = lists["Inflation Rate (%)"].astype(float)
    print(x)
    print(y)
    plt.scatter(x, y)
    plt.plot(x, y)
    plt.show()

main()