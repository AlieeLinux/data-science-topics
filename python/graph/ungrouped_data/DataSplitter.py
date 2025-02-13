import math
import numpy as np


Example = np.array([1, 2, 3, 4, 5, 6, 8, 9, 10])

def DataSplitter(Data, Classes):
    LD = np.empty(Classes)
    HD = np.empty(Classes)
    Range = Data.max() - Data.min()
    CW = math.ceil(Range/Classes)


    for i in range(Classes):
        if i == 0:
            HDL = 1
            HDH = HDL + CW -1
            HD[i] = HDH
            LD[i] = HDL

        else:
            HDL += CW
            HDH += CW
            LD[i] += HDL
            HD[i] += HDH

    print(Range, CW, LD, HD)


DataSplitter(Example, 5)
