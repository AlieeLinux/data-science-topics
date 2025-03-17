import pandas as pd



x = [1, 2, 3, 4, 5, 6]
y = [1, 2, 3, 4, 5, 6]

data = [
    x,
    y
]

data = pd.DataFrame(data=data).transpose()
data.columns = ["Index1", "Index2"]

data.at[4, 'Index2'] = 69

data.to_csv("jdasd.csv")

print(data)
