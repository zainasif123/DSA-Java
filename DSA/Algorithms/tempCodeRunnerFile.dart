// void main() {
//   var n1 = 50;
//   var n2 = 10;
//   SwappingNumber swappingNumber = new SwappingNumber(n1, n2);
//   print(swappingNumber.swap());
//   print(swappingNumber.swap2());
// }

// class SwappingNumber {
//   var num1;
//   var num2;
//   SwappingNumber(var num1, var num2) {
//     this.num1 = num1;
//     this.num2 = num2;
//   }

//   List swap() {
//     var temp = num1;
//     num1 = num2;
//     num2 = temp;
//     return [num1, num2];
//   }

//   List swap2() {
//     num1 = num1 + num2;
//     num2 = num1 - num2;
//     num1 = num1 - num2;
//     return [num1, num2];
//   }
// }

// void main() {
//   List a = [1, 2, 5, 3, 4, 6, 7, 8];
//   //result var a=[1,2,3,4,5,6,7,8];

//   final obj = new Sort(sortList: a);
//   obj.sortlistfun();
// }

// class Sort {
//   late List sortList;
//   Sort({
//     required this.sortList,
//   });

//   sortlistfun() {
//     for (int i = 0; i < sortList.length; i++) {
//       for (int j = 0; j < sortList.length - i - 1; j++) {
//         if (sortList[j] > sortList[j + 1]) {
//           var temp = sortList[j];
//           sortList[j] = sortList[j + 1];
//           sortList[j + 1] = temp;
//         }
//       }
//     }
//     print(sortList);
//   }
// }

// void main() {
//   List a = [1, 2, 5, 3, 4, 6, 7, 8];
//   var obj = new SecondBig(a);
//   print(obj.secondBigDigit());

// //output :- 7;
// }

// class SecondBig {
//   late List list;

//   SecondBig(this.list);
//   int secondBigDigit() {
//     for (int i = 1; i < list.length; i++) {
//       for (int j = 1; j < list.length - i - 1; j++) {
//         if (list[j] > list[j + 1]) {
//           int temp = list[j];
//           list[j] = list[j + 1];
//           list[j + 1] = temp;
//         }
//       }
//     }
//     return list[list.length - 2];
//   }
// }

// void main() {
//   generatePrimeNumbers(7);
// }

// void generatePrimeNumbers(int count) {
//   for (int i = 1; i <= count; i++) {
//     //check if current number is prime
//     if (isPrime(i)) {
//       print(i);
//     }
//   }
// }

// bool isPrime(int num) {
//   if (num == 1 && num == 0) return false;
//   for (int i = 2; i < num; i++) {
//     if (num % i == 0) return false;
//   }
//   return true;
// }

// void main() {
//   var name = "shirsh";
//   print(name.length);
//   var result = "";

//   for (int i = name.length - 1; i >= 0; i--) {
//     result += name[i];
//   }

//   print(result); // Output: hsrihs
// }

// void main() {
//   List<List<int>> matrix1 = [
//     [1, 2],
//     [3, 4],
//   ];
//   List<List<int>> matrix2 = [
//     [1, 2],
//     [3, 4],
//   ];
//   List<List<int>> matrix3 = [
//     [0, 0],
//     [0, 0],
//   ];

//   void sum() {
//     for (int i = 0; i < matrix1.length; i++) {
//       for (int j = 0; j < matrix1[i].length; j++) {
//         matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
//       }
//     }
//   }

//   sum();
//   print(matrix3);
// }

// void main() {
//   var name = 'Shirsh';

//   Map<String, int> freq = {};
//   for (var i = 0; i < name.length; i++) {
//     var char = name[i];
//     if (freq.containsKey(char)) {
//       freq[char] = freq[char]! + 1;
//     } else {
//       freq[char] = 1;
//     }
//   }
//   print(freq);
// }

// void main() {
//   String str1 = 'abcdef';
//   String str2 = 'defghia';

//   for (int i = 0; i < str2.length; i++) {
//     var key = str2[i];
//     // if (str1.contains(key)) {
//     //   print(key);
//     // }
//     for (int j = 0; j < str1.length; j++) {
//       if (str1[j] == key) {
//         print(key);
//       }
//     }
//   }
// }

// void main() {
//   String str1 = 'abcdef';

//   var vowels = 0;
//   var consonents = 0;

//   List<String> vowel = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];

//   for (int i = 0; i < str1.length; i++) {
//     var char = str1[i];

//     // Check if the character is a vowel
//     if (vowel.contains(char)) {
//       vowels++;
//     } else {
//       consonents++;
//     }
//     // Check if the character is a consonant
//     // else if ((char >= 'a' && char <= 'z') || (char >= 'A' && char <= 'Z')) {
//     //   consonents++;
//     // }
//   }
//   print("{$consonents} consonants and {$vowels} vowels");
// }

// void main() {
//   int num = 15;
//   int countfactors = 0;
//   void factor(int num) {
//     for (int i = 1; i <= num; i++) {
//       if (num % i == 0) {
//         print(i);
//         countfactors++;
//       }
//     }
//     print(countfactors);
//   }

//   factor(num);
// }

// void main() {
//   List a = [4, 5, 15, 1, 2, 5, 3, 4, 6, 7, 8];
//   int min = a[0];
//   int max = 0;
//   for (int i = 0; i < a.length; i++) {
//     if (a[i] < min) {
//       min = a[i];
//     }
//     if (a[i] > max) {
//       max = a[i];
//     }
//   }
//   print("sum=" '${min + max}');
//   print("Minimum: $min");
//   print("Maximum: $max");
// }

// void main() {
//   int num = 208978972;
//   int sum = 0, reminder = 0, tempnum = 0;

//   tempnum = num;

//   while (num > 0) {
//     reminder = num % 10;
//     sum = (sum * 10) + reminder;
//     num = num ~/ 10;
//   }
//   if (tempnum == sum) {
//     print("num is palendrome");
//   } else {
//     print("num is not  palendrome");
//   }
// }

// void main() {
//   List a = [4, 5, 15, 1, 2, 5, 3, 4, 6, 7, 8];
//   Map freq = {};

//   for (int i = 0; i < a.length; i++) {
//     int key = a[i];
//     if (freq.containsKey(key)) {
//       freq[key] = freq[key]! + 1;
//     } else {
//       freq[key] = 1;
//     }
//   }
//   freq.toString();
// }

// void main() {
//   List a = [4, 5, 15, 1, 2, 5, 3, 4, 6, 7, 8];
//   int secondLargest = -1;
//   for (int i = 0; i < a.length; i++) {
//     for (int j = 0; j < a.length - 1 - i; j++) {
//       if (a[j] > a[j + 1]) {
//         int temp = a[j];
//         a[j] = a[j + 1];
//         a[j + 1] = temp;
//       }
//     }
//   }
// }
//   int largest = a[a.length - 1];
//   for (int i = 0; i < a.length; i++) {
//     if (a[i] != largest && (secondLargest == -1 || a[i] > secondLargest)) {
//       secondLargest = a[i];
//     }
//   }
//   print(secondLargest);
// }
