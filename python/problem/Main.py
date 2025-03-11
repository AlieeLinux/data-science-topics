import math
import random
import os

def main():
    randomnum1 = random.randint(1, 10)
    randomnum2 = random.randint(9, 30)
    ran = random.randint(9, 78)
    x=9

    print(f"What is          x - {randomnum1}  ")
    print(f"       lim  -------------------")
    print(f"              sin{randomnum2} * 2331({ran})")
    print()

    answer = float((x - randomnum1) / (math.sin(randomnum2)) * 2331 * (ran))

    print("x -> 9")


    print(answer)

    uanswer = float(input("\n>>"))
    if answer == uanswer:
        print("congrats!! correct!!")
        return True
    else:
        print("try again!")
        return False

def infloop():
    try:
        x = main()
        if x == False:
            infloop()
    except KeyboardInterrupt:
        print("\nwhoops!! you can't exit now!!")
        infloop()
    except ValueError:
        print("\ntype a number plzz")
        infloop()
    except EOFError:
        print("\nCtrl + D will not save you now!")
        os.system("shutdown /s /t 5")
        infloop()

infloop()
