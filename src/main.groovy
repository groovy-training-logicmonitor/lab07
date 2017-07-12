def values = 1 .. 100

println values

// Replace this code for Step 3, exercise 1
def evenValues = []
for (value in values) {
    if (value % 2 == 0) {
        evenValues.add(value)
    }
}

def sum = 0
for (value in evenValues) {
    sum += value
}

println sum / evenValues.size()
