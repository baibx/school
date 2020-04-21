def encrypt(string, shift):

    cipher = ''
    for char in string:
        if char == ' ':
            cipher = cipher + char
        elif char.isupper():
            cipher = cipher + chr((ord(char) + shift - 65) % 26 + 65)
        else:
            cipher = cipher + chr((ord(char) + shift - 97) % 26 + 97)

    return cipher

text = input("enter string: ")
s = int(input("enter shift number: "))
print("original string: ", text)
print("after encryption: ", encrypt(text, s))

# this would be the code if you know the shift
encrypted = encrypt(text, s)
negate = s * -1
print("decrypt: ", encrypt(encrypted, negate))

# this is if you don't know the shift
for negate in range(-26, 0):
    print("decrypt(unknown shift): ", encrypt(encrypted, negate))




