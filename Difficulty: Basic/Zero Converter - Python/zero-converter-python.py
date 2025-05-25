def pos(n):
    for i in range(n - 1, -1, -1):
        print(i, end=" ")

def neg(n):
    for i in range(n, 1):
        print(i, end=" ")

# Main function to determine which function to call
def zero_converter(n):
    if n == 0:
        print("already Zero")
    elif n > 0:
        pos(n)
    else:
        neg(n)


