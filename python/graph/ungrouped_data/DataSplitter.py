import math
import numpy as np


Example = np.array([3, 7, 3, 4, 5, 6, 8, 9, 10, 20])

def DataSplitter(Data, Classes):
    LD = np.empty(Classes)
    HD = np.empty(Classes)
    Range = Data.max() - Data.min()
    CW = math.ceil(Range/Classes)
    HDL = Example.min()
    for i in range(Classes):
        LD[i] = HDL
        HD[i] = HDL + CW - 1
        HDL = HD[i] + 1

    print(Range, CW, LD, HD)


DataSplitter(Example, 5)
