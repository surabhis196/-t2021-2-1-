dict={}
list=eval(input("Enter output"))
for num in range(1,10):
    for n in list:
        if n%num==0:
            if dict.get(num)==None:
              dict[num]=1
            else:
              dict[num] = dict[num]+1
        elif num not in dict.keys():
            dict[num] = 0
print(dict)
