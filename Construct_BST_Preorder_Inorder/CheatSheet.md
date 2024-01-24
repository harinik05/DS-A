# Important Array and List Methods

## 1. convert from list to an array
```
List<Integer> arrayList = new ArrayList<>();
int[] arr = new int[arrayList.size()];
arrayList.toArray(arr);
```

## 2. convert from array to list
```
Arrays.toList(arr);
```

## 3. convert from Integer list type to int[] type
```
int[] preorderLeftArr = preorderLeft.stream().mapToInt(Integer::intValue).toArray();
```