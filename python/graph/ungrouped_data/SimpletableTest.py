import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import math
import System
from DataSplitter import DataSplit


System.out.println("starting...")

def RFOgive(x, y):
    plt.plot(x, y)
    plt.scatter(x, y)
    plt.title("RF ogive graph")
    plt.show()

def GraphPolygram(x, y):
    plt.plot(x, y)
    plt.scatter(x, y)
    plt.title("Polygon Graph")
    plt.show()

def GraphOgive(x, y):
    plt.plot(x, y)
    plt.title("Govie Graph")
    plt.scatter(x, y, color="red")
    plt.show()

def Frequency(f):
    return f


def FrequencyUngroup(Data, DataLower, DataUpper, Range):
    """
    Counts how many are the frequency values on the data
    """
    Return = np.empty(3)
    Frequencye = np.empty(Range)
    LowerUpper = np.empty(len(Data))
    FrequencyAndDatas = np.empty(Range)

    #fill with zeros
    for i in range(Frequencye.__len__()):
        Frequencye[i] = 0

    Data = np.array(Data)
    for j in range(len(FrequencyAndDatas)):
        for i in range(len(LowerUpper)):
            if DataUpper[j] >= Data[i] and DataLower[j] <= Data[i]:
                print(DataLower[j], " is ", DataUpper[j])
                Frequencye[j]+=1
        i=0
    Return = [
        Frequencye,
        DataLower,
        DataUpper
    ]
    print(Return)
    return Return


def DataSplitter(data, ClassBound = 6):
    LowerData = np.empty(ClassBound)
    HigherData = np.empty(ClassBound)
    Max = data.max()
    Min = data.min()
    Range = Max - Min

    for p in range(int(ClassBound)):
        LowerData[p]
        HigherData[p]

    ClassWidth = int(math.ceil(Range / 7))

    for i in range(int(ClassBound)):
        if i == 0:
            LowerData[i] +=1
            HigherData[i] +=ClassWidth-1
        else:
            LowerData[i] += LowerData[i-1]
            HigherData[i] += HigherData[i-1]
           # LowerData[i] +=1
           # HigherData[i] +=ClassWidth-1

    print(LowerData, HigherData)


def GroupData(x, y):
    Data = x
    Frequency = y

    RelativeFrequency = np.empty(len(x))
    CumulativeFrequency = np.empty(len(x))

    N = Frequency.sum()

    for i in range(len(Data)):
        RelativeFrequency[i] = Frequency[i]/N

        if i == 0:
            CumulativeFrequency[i] = Frequency[i]
        else:
            CumulativeFrequency[i] = CumulativeFrequency[i-1]+Frequency[i]

    print("cummulative freq: ", CumulativeFrequency)
    print(RelativeFrequency, "\n\n")


    FullData = [
        Data,
        Frequency,
        CumulativeFrequency,
        RelativeFrequency
    ]

    fd = pd.DataFrame(FullData)

    Tables = fd.transpose()
    Tables.columns = ["Data", "Frequency", "CF", "RF"]
    print(Tables)
    #GraphOgive(Data, CumulativeFrequency)
    GraphPolygram(Data, Frequency)
    return CumulativeFrequency


def unGroupData(x, y):
#    LowerData = np.empty(len(x))
    Data = np.array(x)
    Frequency = np.array(y)

#    Range = max(Data) - min(Data)

    RelativeFrequency = np.empty(len(x))
    CumulativeFrequency = np.empty(len(x))
    Midpoint = np.empty(len(x))
    XminuxMeanX = np.empty(len(x))
    XminuxMeanXpow2 = np.empty(len(x))
    FtimesXminuxMeanXpow2 = np.empty(len(x))

    Fx = np.empty(len(x))

    XMean = Data.sum() / len(Data)

    Frequencyp = Frequency.copy()
    Frequencyp.sort()

    FrequencyMax = Frequencyp[len(Frequencyp)-1]

    N = Frequency.sum()

    CellF = 0

    for i in range(len(Data)):


        if FrequencyMax == Frequency[i]:
            CellF = i

        XminuxMeanX[i] = Data[i] - XMean

        XminuxMeanXpow2[i] =  math.pow(XminuxMeanX[i], 2)

        FtimesXminuxMeanXpow2[i] = Frequency[i] * XminuxMeanXpow2[i]

        Midpoint[i] = Data[i]

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


#    print("cummulative freq: ", CumulativeFrequency)
#    print(RelativeFrequency, "\n\n")


    FullData = [
        Data,
        Frequency,
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
    Tables.columns = ["Data", "Frequency", "CF", "RF", "MidPoint", "(X-Xm)", "(X-Xm)2", "f(x)", "f(X-Xm2)"]
    print(Tables)
    GraphOgive(Data, CumulativeFrequency)
    GraphPolygram(Data, Frequency)

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


DataSplitter(data=np.array([1, 4, 7, 9, 11]))










