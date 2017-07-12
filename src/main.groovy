import java.nio.file.Files
import java.nio.file.Paths

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

// Replace this code for Step 3, exercise 2
def fin = new FileInputStream("words.small")
def lines = fin.readLines()
for (line in lines) {
    println line
}

// Replace this code for Step 3, exercise 3
fin = new FileInputStream("words")
lines = fin.readLines()
def uus = []
for (line in lines) {
    if (line =~ /uu/) {
        uus.add(line)
    }
}

println uus

// Replace this code for Step 3, exercise 4
fin = new FileInputStream("numbers")
lines = fin.readLines()
values = []
for (line in lines) {
    def value = line.toInteger()
    if (value % 2 == 0) {
        values.add(value)
    }
}

sum = 0
for (value in values) {
    sum += value
}

println sum / values.size()
