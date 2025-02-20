import random
import numpy

x = numpy.empty(9)

for i in range(len(x)):
    x[i] = random.randint(1, 699)

print("the mean of: ", x, " IS: ", numpy.mean(x))
