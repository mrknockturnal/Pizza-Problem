#Opening the input File_line
f = open('a_example.in','r')
first_line = f.readline()

#Setting the input variables
row_count, column_count, min_ingredients, max_area = tuple(map(int,first_line.split(' ')))

#Creating the pizza grid and populating it
grid = []
for i in range(row_count):
        grid.append(f.readline().rstrip())

#Closing the File
f.close()

results = []
for r in range(row_count):
    beg = 0
    end = 0
    mushroom_count = 0
    tomato_count = 0

while end < column_count:
    if grid[r][end] == 'M':
        mushroom_count += 1
    elif grid[r][end] == 'T':
        tomato_count += 1
    end += 1

if end - beg > max_area:
    if grid[r][beg] == 'M':
        mushroom_count -= 1
    elif grid[r][beg] == 'T':
        tomato_count -= 1
    beg += 1

if (end - beg <= max_area
        and mushroom_count >= min_ingredients
        and tomato_count >= min_ingredient):
    results.append((r,beg, r, end - 1))
    beg = end
    tomato_count = 0
    mushroom_count = 0
