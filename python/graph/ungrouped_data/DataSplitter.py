import math
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

def graph(x, y ):
    plt.scatter(x, y)
    plt.plot(x, y)
    plt.show()

Example = np.array([3, 7, 3, 4, 5, 6, 8, 9, 10, 20])

def DataSplitLower(Data, Classes):
    LD = np.empty(Classes)
    HD = np.empty(Classes)
    Range = Data.max() - Data.min()
    CW = math.ceil(Range/Classes)
    HDL = Example.min()

    for i in range(Classes):
        LD[i] = HDL
        HD[i] = HDL + CW - 1
        HDL = HD[i] + 1

    return LD


def DataSplitHigher(Data, Classes):
    LD = np.empty(Classes)
    HD = np.empty(Classes)
    Range = Data.max() - Data.min()
    CW = math.ceil(Range/Classes)
    HDL = Example.min()

    for i in range(Classes):
        LD[i] = HDL
        HD[i] = HDL + CW - 1
        HDL = HD[i] + 1

    return HD


def UngroupData(LD, HD, y):
    LData = np.array(LD)
    HData = np.array(HD)
    Frequency = np.array(y)

    LClassBound = np.array(LData)
    HClassBound = np.array(HData)
    Midpoint = np.empty(LData.__len__())

    for ClassBound in range(len(LData)):
        LClassBound[ClassBound] -= 0.5
        HClassBound[ClassBound] += 0.5
        Midpoint[ClassBound] = (LData[ClassBound] + HData[ClassBound]) / 2

    RelativeFrequency = np.empty(len(LD))
    CumulativeFrequency = np.empty(len(HD))
    XminuxMeanX = np.empty(len(HD))
    XminuxMeanXpow2 = np.empty(len(HD))
    FtimesXminuxMeanXpow2 = np.empty(len(HD))

    Fx = np.empty(len(HD))

    XMean = Midpoint.sum() / len(HD)

    Frequencyp = Frequency.copy()

    Frequencyp.sort()

    FrequencyMax = Frequencyp[len(Frequencyp)-1]

    N = Frequency.sum()

    CellF = 0

    for i in range(len(LData)):
        if FrequencyMax == Frequency[i]:
            CellF = i

        XminuxMeanX[i] = Midpoint[i] - XMean

        XminuxMeanXpow2[i] =  math.pow(XminuxMeanX[i], 2)

        FtimesXminuxMeanXpow2[i] = Frequency[i] * XminuxMeanXpow2[i]

        Midpoint[i] = Midpoint[i]

        Fx[i] = Frequency[i] * Midpoint[i]

        RelativeFrequency[i] = Frequency[i]/N

        if i == 0:
            CumulativeFrequency[i] = Frequency[i]
        else:
            CumulativeFrequency[i] = CumulativeFrequency[i-1]+Frequency[i]

    if CellF == 0:
        Cfb = 0
        F1 = 0
        F2 = 0
    else:
        Cfb = CumulativeFrequency[CellF-1]
        F1 = Frequency[CellF-1]
        F2 = Frequency[CellF+1]

    Fmedian = Frequency[CellF]
#    LBmedian = Midpoint[CellF]


    print("cummulative freq: ", CumulativeFrequency)
    print(RelativeFrequency, "\n\n")


    FullData = [
        LData,
        HData,
        Frequency,
        HClassBound,
        LClassBound,
        CumulativeFrequency,
        RelativeFrequency,
        Midpoint,
        XminuxMeanX,
        XminuxMeanXpow2,
        Fx,
        FtimesXminuxMeanXpow2
    ]

    fd = pd.DataFrame(FullData)

    Tables = fd.transpose()
    Tables.columns = ["LData", "HData", "Frequency", "H", "L", "CF", "RF", "MidPoint", "(X-Xm)", "(X-Xm)2", "f(x)", "f(X-Xm2)"]
    print(Tables)
#    GraphOgive(Data, CumulativeFrequency)
#    GraphPolygram(Data, Frequency)

    graph(Midpoint, Frequency)
    graph(Midpoint, CumulativeFrequency)
    MeanT = Frequency.copy()

    Mean = MeanT.sum() / 2

    Nd2 = Frequency.sum() / 2
    print(Fmedian)
    print(F1)
    print(F2)

    Median = ((Nd2 - Cfb)/(Fmedian))*10+40.5
    Mode = (Fmedian - F1)/(2*Fmedian-F2-F1)*10+40.5

    print("Median: ", Median)
    print("Mode: ", Mode)

    print("The Mean is: ", Mean)
    return CumulativeFrequency





LD = DataSplitLower(Example, 10)
HD = DataSplitHigher(Example, 10)


y = np.array([1 ,8, 9, 2, 5, 6, 7, 34, 1, 29])



UngroupData(LD, HD, y)

print(LD, HD)

