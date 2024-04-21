def is_happy(n):
    seen = set()
    while n != 1 and n not in seen:
        seen.add(n)
        n = sum(int(digit) ** 2 for digit in str(n))
    return n == 1

def main():
    num = int(input("Enter a number: "))
    if is_happy(num):
        print(f"{num} is a happy number")
    else:
        print(f"{num} is not a happy number")

if __name__ == "__main__":
    main()