import matplotlib.pyplot as pyplot
import numpy



x = numpy.random.normal(1, 10, 3000)

pyplot.hist(x, 100)
pyplot.show()
