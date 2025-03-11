import sympy as sp

# Define the symbol
x = sp.symbols('x')

# Example: Integrate sine, cosine, tangent, and cosecant functions

# Define the trigonometric functions
sin_func = sp.sin(x)
cos_func = sp.cos(x)
tan_func = sp.tan(x)
csc_func = sp.csc(x)  # Cosecant is 1/sin(x)

# Perform the indefinite integrals
indefinite_sin = sp.integrate(sin_func, x)
indefinite_cos = sp.integrate(cos_func, x)
indefinite_tan = sp.integrate(tan_func, x)
indefinite_csc = sp.integrate(csc_func, x)

# Print the results
print("Indefinite Integral of sin(x):", indefinite_sin)
print("Indefinite Integral of cos(x):", indefinite_cos)
print("Indefinite Integral of tan(x):", indefinite_tan)
print("Indefinite Integral of csc(x):", indefinite_csc)

# Example for definite integral of sin(x) from 0 to π
a = 0
b = sp.pi
definite_sin = sp.integrate(sin_func, (x, a, b))
print("Definite Integral of sin(x) from {} to {}: {}".format(a, b, definite_sin))
