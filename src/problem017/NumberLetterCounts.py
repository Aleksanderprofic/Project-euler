numbers_till_20 = {
    1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five',
    6: 'six', 7: 'seven', 8: 'eight', 9: 'nine',
    10: 'ten', 11: 'eleven', 12: 'twelve', 13: 'thirteen',
    14: 'fourteen', 15: 'fifteen', 16: 'sixteen', 17: 'seventeen',
    18: 'eighteen', 19: 'nineteen'
}

numbers_from_20 = ['twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety']


def sum_up_to_9():
    sum_of_letters = 0
    i = 1
    while i < 10:
        sum_of_letters += len(numbers_till_20[i])
        i += 1

    return sum_of_letters


def sum_up_to_19():
    sum_of_letters = 0
    i = 1
    while i < 20:
        sum_of_letters += len(numbers_till_20[i])
        i += 1

    return sum_of_letters


def sum_from_20_to_99():
    sum_of_letters = 0

    for number in numbers_from_20:
        sum_of_letters += len(number)
        for k in range(1, 10):
            sum_of_letters += len(number) + len(numbers_till_20[k])

    return sum_of_letters


def sum_of_hundreds():
    sum_of_letters = 0

    for i in range(1, 10):
        sum_of_letters += 7 + len(numbers_till_20[i])
        sum_of_letters += 99 * (10 + len(numbers_till_20[i]))

    return sum_of_letters


sum_of_letters = 0

sum_of_letters += 10*sum_up_to_19()
sum_of_letters += 10*sum_from_20_to_99()
sum_of_letters += sum_of_hundreds()
sum_of_letters += 11

print(sum_of_letters)
