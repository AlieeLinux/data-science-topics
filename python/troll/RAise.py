import sys
import random

def trace_calls(frame, event, arg):
    if event == "line" and random.random() < 0.1:  # 10% chance to raise an error
        raise RuntimeError("Ur code sucks")
    return trace_calls

sys.settrace(trace_calls)


def main():
    print(9)
    print(8)

print(main())
