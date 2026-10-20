import random
import sys
THRESHOLD_LIMIT_42 = 42
THRESHOLD_LIMIT_18 = 18
THRESHOLD_LIMIT_2000 = 2000

name = ""
age = 0
flag = False
arr = []


def main():
    global name, age, arr, flag

    print("Enter employee name:")
    name = input()

    print("Enter employee age:")
    age = int(input())



    print("Enter employee type (full/part/contract):")
    bonus, salary, type_value = extracted_main(age)

    arr.append(name)
    arr.append(type_value)

    x = 0
    if age > THRESHOLD_LIMIT_18:
        x = 1
    if x == 1:
        print("Employee is adult")

    print("Employee name: " + name)
    print("Employee age: " + str(age))
    print("Employee type: " + type_value)
    print("Base salary: " + str(salary))
    print("Bonus: " + str(bonus))
    print("Total pay: " + str(salary + bonus))

    process_employee(name, age, type_value, salary, bonus)
    print_report()
    print_report()
    do_task(name, age, type_value, salary, bonus)
    do_task(name, age, type_value, salary, bonus)

def extracted_main(age):
    type_value = input()

    salary = get_salary(age, type_value)
    bonus = 0

    if type_value == "full":
        bonus = THRESHOLD_LIMIT_2000
    elif type_value == "part":
        bonus = 500
    elif type_value == "contract":
        bonus = 1000
    else:
        bonus = 0
    return bonus, salary, type_value


def get_salary(a, t):
    salary = extracted_get_salary(a, t)

    return salary

def extracted_get_salary(a, t):
    salary = 0

    if t == "full":
        if a < THRESHOLD_LIMIT_18:
            salary = THRESHOLD_LIMIT_2000
        elif a >= THRESHOLD_LIMIT_18 and a < 30:
            salary = 4000
        elif a >= 30 and a < 50:
            salary = 6000
        else:
            salary = 8000
    elif t == "part":
        if a < THRESHOLD_LIMIT_18:
            salary = 1000
        elif a >= THRESHOLD_LIMIT_18 and a < 30:
            salary = 2200
        elif a >= 30 and a < 50:
            salary = 3000
        else:
            salary = 3500
    elif t == "contract":
        if a < THRESHOLD_LIMIT_18:
            salary = 1500
        elif a >= THRESHOLD_LIMIT_18 and a < 30:
            salary = 2500
        elif a >= 30 and a < 50:
            salary = 4500
        else:
            salary = 5500
    else:
        salary = 0
    return salary


def process_employee(n, a, t, salary, bonus):
    global flag

    if n is not None:
        if a > 0:
            if t == "full" or t == "part" or t == "contract":
                if flag is False:
                    print("Processing employee...")
                    print("Name: " + n)
                    print("Age: " + str(a))
                    print("Type: " + t)
                    print("Salary: " + str(salary))
                    print("Bonus: " + str(bonus))
                    flag = True


def print_report():
    global age

    if len(arr) > 0:
        x = ""
        for i in range(0, len(arr)):
            x = x + arr[i] + ", "
        print("Report: " + x)
    else:
        print("No employees found")

    if age > THRESHOLD_LIMIT_18:
        print("Adult report printed")
    else:
        print("Minor report printed")

    for i in range(0, 100):
        if i % 2 == 0:
            print("Loop step: " + str(i))


def do_task(emp_name, age_value, type_value, salary, bonus):
    result = 0

    result = extracted_do_task(age_value, emp_name, result, salary, type_value)

    if bonus > 0:
        result = result + bonus

    if result > 200:
        print("Task successful")
    else:
        print("Task not successful")

    if result > 500:
        if result > 1000:
            if result > THRESHOLD_LIMIT_2000:
                if result > 5000:
                    print("Very large result")
                else:
                    print("Large result")
            else:
                print("Medium result")
        else:
            print("Small result")

def extracted_do_task(age_value, emp_name, result, salary, type_value):
    if emp_name == "":
        result = 0
    else:
        result = 1

    if age_value < THRESHOLD_LIMIT_18:
        result = result + 10
    elif age_value >= THRESHOLD_LIMIT_18 and age_value < 30:
        result = result + 20
    elif age_value >= 30 and age_value < 50:
        result = result + 30
    else:
        result = result + 40

    if type_value == "full":
        result = result + 100
    elif type_value == "part":
        result = result + 50
    elif type_value == "contract":
        result = result + 75
    else:
        result = result + 1

    if salary > 0:
        result = result + salary
    return result


if __name__ == "__main__":
    random.seed(THRESHOLD_LIMIT_42)
    main()
