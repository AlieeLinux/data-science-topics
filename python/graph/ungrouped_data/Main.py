import Simpletable
import numpy as np

x = np.array([6, 9, 12, 15, 18, 21, 24])
y = np.array([2, 4, 14, 9, 6, 3, 2])

cumfreq = Simpletable.unGroupData(x, y)
Simpletable.GraphOgive(x, cumfreq)
