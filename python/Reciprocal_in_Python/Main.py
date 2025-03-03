class reciprocal:
    def Function(self, x):
        Answer = 1 / x
        print("the reciprocal of ", x, " Is: ", Answer)
        return None

try:
    inputs = int(input(">>"))

    Math = reciprocal()

    Math.Function(inputs)

except ValueError as e:
    print("Please Enter A number \n\n\n\n Sending an error: ")
    raise ValueError("Plss type Correctly")
