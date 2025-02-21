import pandas as pd
import matplotlib.pyplot as plt
from scipy import stats

def main():
    print("Hello world")
    lists = pd.read_csv("Inflation.csv", sep=",")

    x = lists["Year"].astype(float)
    y = lists["Inflation Rate (%)"].astype(float)

    slope, intercept, x, y, std_err = stats.linregress(x, y)
    plt.ylim(ymin=0, ymax=2000)
    plt.xlim(xmin=0, xmax=200)
    plt.plot(x, y)
    plt.scatter(x, slope * intercept + x)
    plt.show()


main()