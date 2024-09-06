// ignore_for_file: public_member_api_docs, sort_constructors_first
// import 'main.dart';

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
//     for (int i = 1; i < sortList.length; i++) {
//       for (int j = 1; j < sortList.length - i - 1; j++) {
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

//   Map<String, String> freq = {};
//   for (var i = 0; i < name.length; i++) {
//     var char = name[i];
//     if (freq.containsKey(char)) {
//       freq[char] = '${freq[char]}+1';

//     } else {
//       freq[char] = '1';
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
//     }
//     // Check if the character is a consonant
//     else if ((char. >= 'a' && char <= 'z') || (char >= 'A' && char <= 'Z')) {
//       consonents++;
//     }
//   }
//   print("{$consonents} consonants and {$vowels} vowels");
// }

// void main() {
//   int num = 15;
//   int countfactors = 0;
//   List nums = [];
//   void factor(int num) {
//     for (int i = 1; i <= num; i++) {
//       if (num % i == 0) {
//         nums.add(i);
//         countfactors++;
//       }
//     }
//     print(countfactors);
//     print(nums);
//   }

//   factor(num);
// }

// void main() {
//   int n = 10;
//   int firstnum = 0;
//   int secondnum = 1;
//   for (int i = 1; i < n; i++) {
//     print(firstnum);
//     var temp = firstnum;
//     firstnum = secondnum;
//     secondnum = temp + secondnum;
//   }
// }

// void main() {
//   List<int> num = [10, 2, 3, 4, 5, 6, 7, 8, 9];
//   late int sum = 0;
//   for (int i = 0; i < num.length; i++) {
//     sum += num[i];
//   }
//   print(sum / num.length);
// }

// void main() {
//   int num = 202322;
//   int reverse = 0;
//   while (num != 0) {
//     int remainder = num % 10;
//     reverse = (reverse * 10) + remainder;
//     num = (num - remainder) ~/ 10;
//   }
//   String name = "zain";
//   String result = '';
//   for (int i = name.length - 1; i >= 0; i--) {
//     result = result + name[i];
//   }
//   print(result);
//   print(reverse);
// }

// void main() {
//   List<int> num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14];
//   int findnum = 12;
//   int firstindex = 0;

//   int lastindex = num.length - 1;

//   while (firstindex <= lastindex) {
//     int mid = (firstindex + lastindex) ~/ 2;
//     if (num[mid] == findnum) {
//       print('Number found at index $mid');
//       return;
//     } else if (findnum < num[mid]) {
//       lastindex = mid - 1;
//     } else if (findnum > num[mid]) {
//       firstindex = mid + 1;
//     } else {
//       print("Number not found");
//     }
//   }
// }

void main() {
  List<int> array = [38, 27, 43, 3, 9, 82, 10];
  print("Original array: $array");

  List<int> sortedArray = mergeSort(array);
  print("Sorted array: $sortedArray");
}

List<int> mergeSort(List<int> array) {
  if (array.length <= 1) {
    return array;
  }

  int middle = array.length ~/ 2;
  List<int> left = mergeSort(array.sublist(0, middle));
  List<int> right = mergeSort(array.sublist(middle));

  return merge(left, right);
}

List<int> merge(List<int> left, List<int> right) {
  List<int> result = [];
  int i = 0, j = 0;

  while (i < left.length && j < right.length) {
    if (left[i] <= right[j]) {
      result.add(left[i]);
      i++;
    } else {
      result.add(right[j]);
      j++;
    }
  }

  result.addAll(left.sublist(i));
  result.addAll(right.sublist(j));

  return result;
}
