import pandas

x = pandas.read_csv("data.csv")

#xxx = pandas.DataFrame(data=x)
x.at[1, 'Username'] = "Mesa Gpu"

x.to_html("index.html")

print(x)
