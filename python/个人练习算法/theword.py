import re

with open('/Users/shen/Documents/Code/vipkid-xbk/basescript/CodeNote/doc.text',
          'r') as f:
    # print(f.readlines())
    dictResult = {}

    # Find the letters each line
    for line in f.readlines():
        listMatch = re.findall('[a-zA-z]+',
                               line.lower())  # remember to lower the letters

        # count
        for eachLetter in listMatch:
            eachLetterCount = len(re.findall(eachLetter, line.lower()))
            dictResult[eachLetter] = dictResult.get(eachLetter,
                                                    0) + eachLetterCount

    # sort the result
    result = sorted(dictResult.items(), key=lambda d: d[1], reverse=True)
    for each in result:
        print(each)
