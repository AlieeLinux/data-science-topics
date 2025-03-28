import pandas



DataFrame = pandas.read_csv("plays.csv")

print("Dataframe head: ")

Dfhead = DataFrame.head(10)

print(Dfhead)
print()

print("Dataframe Shape:")


print(DataFrame.shape)
print()

print("DataFrame info:")


print(DataFrame.info())
print()

print("DataFrame NullValues:")

print(DataFrame.isnull())
print()

Modes = DataFrame.mode()

print("data Describe: ")
print(DataFrame.describe())

minutes_median = DataFrame['minutes_viewed'].median()
uid_mean= DataFrame['user_id'].median()
asset_mean = DataFrame['asset_id'].median()

print()

print("The median of Minutes Viewed is: ", minutes_median)
print("The median of user_id is: ", uid_mean)
print("the median of asset id is:", asset_mean)

print()

print("Data Frame modes:")

print(Modes)










