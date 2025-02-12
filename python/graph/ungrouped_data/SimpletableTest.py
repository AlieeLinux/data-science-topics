import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import math

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
    Data = np.array(x)
    Frequency = np.array(y)

    RelativeFrequency = np.empty(len(x))
    CumulativeFrequency = np.empty(len(x))
    Midpoint = np.empty(len(x))
    XminuxMeanX = np.empty(len(x))
    XminuxMeanXpow2 = np.empty(len(x))
    FtimesXminuxMeanXpow2 = np.empty(len(x))

    Fx = np.empty(len(x))
    
    XMean = Data.sum() / len(Data)

    Frequencyp = Frequency
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
    else:
        Cfb = CumulativeFrequency[CellF-1]

    Fmedian = Frequency[CellF]
    LBmedian = Midpoint[CellF]


    print("cummulative freq: ", CumulativeFrequency)
    print(RelativeFrequency, "\n\n")


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
    #GraphOgive(Data, CumulativeFrequency)
    GraphPolygram(Data, Frequency)

    Mean = Fx.sum() / Frequency.sum()

    print(FrequencyMax)

    Nd2 = Fx.sum() / 2

    Median = ((Nd2 - Cfb)/Fmedian)*1+Fmedian

    print(Cfb)
    print(Median)

    print("The Mean is: ", Mean)
    return CumulativeFrequency
#x = np.array([1, 2, 3, 4, 5, 6, 7])
#y = np.array([7, 6, 5, 4, 3, 2, 1])

#GroupData(x, y )




