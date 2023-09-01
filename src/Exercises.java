import java.util.*;

public class Exercises {
    /*
    public static boolean repeatedSubstringPattern(String s) {
        List<Integer> lis=new ArrayList<>();
        for (int i=1;i<=s.length()/2;i++){
            if (s.length()%i==0){
                lis.add(i);
            }
        }
        for (Integer li : lis) {
            if (s.substring(0, li).repeat(s.length() / li).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static int repeatedStringMatch(String a, String b) {
        int reperated=0;
        StringBuilder sb=new StringBuilder();
        while(sb.length()<b.length()){
            sb.append(a);
            reperated++;
        }
        if (sb.indexOf(b)==-1){
            sb.append(a);
            reperated++;
        }
        if (sb.indexOf(b)==-1){
            return -1;
        }
        return reperated;
    }

    public static int[] buildArray(int[] nums) {
        List<Integer> lis2=new ArrayList<>();
        // get ele from nums
        for (int num : nums) {
            lis2.add(nums[num]);
        }
        int[] result=new int[lis2.size()];
        for (int i=0;i<lis2.size();i++){
            result[i]=lis2.get(i);
        }
        return result;
    }


    public static int[] getConcatenation(int[] nums) {
        int length=nums.length;
        int [] dup=Arrays.copyOf(nums,2*length );
        for (int last = nums.length; last != 0 && last < 2*length; last <<= 1) {
            System.arraycopy(dup, 0, dup, last, Math.min(last << 1, 2*length) - last);
        }
        return dup;
    }


    public static int mostWordsFound(String[] sentences) {
        List<Integer> lis=new ArrayList<>();
        for (String sentence : sentences) {
            int count=1;
            if (sentence.contains(" ")){
                for(int j=0;j<sentence.length();j++){
                    if (String.valueOf(sentence.charAt(j)).equals(" ")){
                        count+=1;
                    }
                }
                lis.add(count);
            }else {
                lis.add(1);
            }

        }
        int [] result=new int[lis.size()];
        for (int i=0;i<lis.size();i++){
            result[i]=lis.get(i);
        }
        Arrays.sort(result);
        if (result.length>0){
            return result[result.length-1];
        }
        return result[0];
    }


    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length;j++){
                if (nums[i]==nums[j] & (i<j)){
                    count+=1;
                }
            }
        }
        return count;
    }


    public String sortSentence(String s) {
        Map<String, Integer> map=new Map<String, Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
            @Override
            public boolean containsKey(Object key) {
                return false;
            }
            @Override
            public boolean containsValue(Object value) {
                return false;
            }
            @Override
            public Integer get(Object key) {
                return null;
            }
            @Override
            public Integer put(String key, Integer value) {
                return null;
            }
            @Override
            public Integer remove(Object key) {
                return null;
            }
            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }
            @Override
            public void clear() {

            }
            @Override
            public Set<String> keySet() {
                return null;
            }
            @Override
            public Collection<Integer> values() {
                return null;
            }
            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }
        }
    }
    public static String sortSentence(String s) {
        /*
        Map<String, Integer> map=new HashMap<>();
        String [] string=s.split(" ");
        if (string.length<2){
            return s.substring(0,s.length()-1);
        }
        for (String value : string) {
            String s1 = value.substring(0, value.length() - 1);
            int num = Integer.parseInt(value.substring(value.length() - 1));
            map.put(s1, num);
        }
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        //System.out.println(map.size());
        if (map.size()==1){
            String str="";
            int num=Integer.parseInt(s.substring(s.length()-1));
            for (int i=0;i<num;i++){
                str+=s.charAt(0)+" ";
            }
            return str.substring(0, str.length()-1);
        }
        StringBuilder result= new StringBuilder();
        List<String> keys = new ArrayList<>(sortedMap.keySet());
        for (String key : keys) {
            result.append(key).append(" ");
        }
        return result.substring(0,result.length()-1);
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        String[] res_arr = new String[words.length];
        for(int i = 0; i < words.length; i++){
            int place = words[i].charAt(words[i].length()-1) - '0';
            System.out.println(place);
            res_arr[place-1] = words[i].substring(0, words[i].length()-1);
        }
        String res = "";
        for(int i = 0; i < res_arr.length; i++){
            res += res_arr[i];
            if(i < res_arr.length-1){
                res += " ";
            }
        }
        return res;

         */
        /*
        String [] string=s.split(" ");
        String [] result=new String[string.length];
        for (int i=0;i< string.length;i++){
            String str=string[i];
            int place=Integer.parseInt(str.substring(str.length()-1));
            result[place-1]=str.substring(0,str.length()-1);
        }
        String str="";
        for (int i=0;i< result.length;i++){
            str+=result[i]+" ";
        }
        return str.substring(0, str.length()-1);
    }
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String [] string=s.split(" ");
        //System.out.println(Arrays.toString(string));
        System.out.println(sortSentence(s));
    }

    public static int subtractProductAndSum(int n) {
        String str=String.valueOf(n);
        String[] result=new String[str.length()];
        for (int i=0;i<str.length();i++){
            result[i]= String.valueOf(str.charAt(i));
        }
        int product=1;
        int sum=0;
        for (String s : result) {
            product = product * Integer.parseInt(s);
            sum = sum + Integer.parseInt(s);
        }
        return product-sum;
    }

    public static int reverse(int x) {
        /*
        if (x==0){
            return x;
        }
        String str=String.valueOf(x);
        StringBuilder sb=new StringBuilder(str);
        String fir=str.substring(0,1);
        if (fir.equals("-")){
            String str2=sb.substring(1);
            StringBuilder sb2=new StringBuilder(str2);
            String res_part=sb2.reverse().toString();
            String result=fir+res_part;
            return Integer.parseInt(result);
        }
        if (str.substring(str.length()-1).equals("0")){
            String result=str.substring(0, str.length()-1);
            StringBuilder sb2=new StringBuilder(result);
            String final_result=sb2.reverse().toString();
            return Integer.parseInt(final_result);
        }
        String result=sb.reverse().toString();
        
        return Integer.parseInt(result);
       // return Integer.parseInt(result);

         */
    // rx -> reverse of x
    // prx-> previous value of rx
        /*

        int prx=0,rx=0;
        while(x!=0){
            rx=rx*10+x%10;
            System.out.println("rx: "+rx);
            System.out.println("(rx-x%10)/10: "+(rx-x%10)/10);
            if((rx-x%10)/10!=prx){
                rx=0;
                break;
            }
            else{
                prx=rx;
                System.out.println("prx: "+prx);
            }
            x/=10;
            System.out.println("x: "+x);
        }
        return rx;


        int result=0;
        int pre_result=0;
        while(x!=0){
            result=result*10+x%10;
            int check=(result-x%10)/10;
            if (check!=pre_result){
                result=0;
                break;
            }else {
                pre_result=result;
            }
            x=x/10;
        }
        return result;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i=0;i<jewels.length();i++){
            for (int j=0;j<stones.length();j++){
                if (jewels.charAt(i)==stones.charAt(j)){
                    count+=1;
                }
            }
        }
        return count;
    }



    public static int singleNumber(int[] nums) {
        /*
        if (nums.length==1){
            return nums[0];
        }
        List<Integer> lis=new ArrayList<>(nums.length);
        for (int j : nums) {
            lis.add(j);
        }
        Set<Integer> mySet = new HashSet<>(lis);
        HashMap<Integer, Integer> map=new HashMap<>();
        for(Integer s: mySet){
            map.put(s,Collections.frequency(lis,s));
        }
        //List<Integer> result=new ArrayList<>();
        List<Integer> keys = new ArrayList<>(map.keySet());
        for (int ele : keys) {
            if (map.get(ele) == 1) {
                return ele;
                //result.add(ele);
            }
        }
        return 0;
        //return result.get(0);


        int ans = 0;
        for (int num : nums) {
            //System.out.println(ans^nums[i]);
            System.out.println("before ans: "+ans);
            ans ^= num;
            System.out.println("check xor: "+ans);
        }
        return ans;


        int result=0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }


    public static int[] runningSum(int[] nums) {
        List<Integer> lis=new ArrayList<>();
        int count=0;
        for (int num : nums) {
            count += num;
            lis.add(count);
        }
        int [] result=new int[lis.size()];
        for (int i=0;i<lis.size();i++){
            result[i]=lis.get(i);
        }
        return result;
    }


    public static int finalValueAfterOperations(String[] operations) {
        int result=0;
        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--")) {
                result -= 1;
            }
            if (operation.equals("++X") || operation.equals("X++")) {
                result += 1;
            }
        }
        return result;
    }


    public static void nextPermutation(int[] nums) {

    }

    public static void main(String[] args) {
        int[] test=new int[]{1,1,3};
        List<Integer> lis=new ArrayList<>(test.length);
        for (int j : test) {
            lis.add(j);
        }
        Arrays.sort(test);
        for (int j=0;j<lis.size();j++){
            if (lis.get(j)==test[j]){
                System.out.println("true");
            }
        }


        //System.out.println(Arrays.toString(test));

    }

         */

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = null;
        return result;
    }

    public static void permute(int[] arr) {
        permuteHelper(arr, 0);
    }

    private static void permuteHelper(int[] arr, int index) {

        System.out.println("index:" + index);
        if (index >= arr.length - 1) { //If we are at the last element - nothing left to permute

            //Print the array
            System.out.print("[");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ", ");
            }
            if (arr.length > 0)
                System.out.print(arr[arr.length - 1]);
            System.out.println("]");
            return;
        }

        for (int i = index; i < arr.length; i++) { //For each index in the sub array arr[index...end]

            //Swap the elements at indices index and i
            System.out.println("i:" + i);
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            //Recurse on the sub array arr[index+1...end]
            permuteHelper(arr, index + 1);

            //Swap the elements back
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }

    public static int maximumWealth(int[][] accounts) {
        List<Integer> lis = new ArrayList<>();
        for (int[] account : accounts) {
            int total = 0;
            for (int i : account) {
                total += i;
            }
            lis.add(total);
        }
        int[] result = new int[lis.size()];
        for (int i = 0; i < lis.size(); i++) {
            result[i] = lis.get(i);
        }
        Arrays.sort(result);
        return result[result.length - 1];
    }

    public static int[] shuffle(int[] nums, int n) {
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + n < nums.length) {
                lis.add(nums[i]);
                lis.add(nums[i + n]);
            }

        }
        int[] result = new int[lis.size()];
        for (int j = 0; j < lis.size(); j++) {
            result[j] = lis.get(j);
        }
        return result;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //int [] candies2=Arrays.sort(candies);
        int[] c = new int[candies.length];
        System.arraycopy(candies, 0, c, 0, candies.length);
        Arrays.sort(candies);
        // get the max in the arr
        int max = candies[candies.length - 1];
        List<Boolean> res = new ArrayList<>();
        for (int j : c) {
            if (j + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] num2 = new int[nums.length];
        System.arraycopy(nums, 0, num2, 0, nums.length);
        List<Integer> lis = new ArrayList<>();
        for (int num : nums) {
            int count = 0;
            for (int i : num2) {
                if (i < num) {
                    count += 1;
                }
            }
            lis.add(count);
        }
        int[] result = new int[lis.size()];
        for (int i = 0; i < lis.size(); i++) {
            result[i] = lis.get(i);
        }
        return result;
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> lis = new ArrayList<>();
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                lis.add(nums[i]);
            }
        }
        int[] res = new int[lis.size()];
        for (int i = 0; i < lis.size(); i++) {
            res[i] = lis.get(i);
        }
        return res;
    }

    public static int numberOfSteps(int num) {
        /*
        int count=0;
        if (num==0){
            return count;
        }else {
            count++;
            System.out.println(count);
            if (num%2==0){
                numberOfSteps(num/2);
            }else {
                numberOfSteps(num-1);
            }
        }

         */
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                count++;
                num /= 2;
            } else {
                count++;
                num = num - 1;
            }
        }
        return count;
    }

    public static int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ start + i * 2;
        }
        return ans;
    }

    public static String restoreString(String s, int[] indices) {
        String[] strArr = s.split("");
        String[] result = new String[strArr.length];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = strArr[i];
        }
        for (String value : result) {
            res.append(value);
        }
        return res.toString();
    }

    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = encoded[i] ^ result[i];
        }
        return result;

    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                sb.append("al");
            }
        }
        return sb.toString();
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count += 1;
            } else {
                count -= 1;
            }
            if (count == 0) {
                result += 1;
            }
        }
        return result;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        if (ruleKey.equals("type")) {
            for (List<String> item : items) {
                if (item.get(0).equals(ruleValue)) {
                    result += 1;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (List<String> item : items) {
                if (item.get(1).equals(ruleValue)) {
                    result += 1;
                }
            }
        } else {
            for (List<String> item : items) {
                if (item.get(2).equals(ruleValue)) {
                    result += 1;
                }
            }
        }
        return result;
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int result = Math.abs(nums[i] - nums[j]);
                if (result == k) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int sumOddLengthSubarrays(int[] arr) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        int total=0;
//        for (int k : arr) {
//            total += k;
//        }
//        for (int j : arr) {
//            List<Integer> lis = new ArrayList<>();
//            lis.add(j);
//            result.add(lis);
//        }
//        int limit = arr.length/2 ;
//        int count = 0;
//
//        while(count<=limit){
//            List<Integer> lis2 = new ArrayList<>();
//            for (int j=count;j<=limit+count;j++){
//                lis2.add(arr[j]);
//            }
//            count+=1;
//            System.out.println(count);
//            result.add(lis2);
//        }
//        for (List<Integer> integers : result) {
//            for (Integer integer : integers) {
//                total += integer;
//            }
//        }
//        return total;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int cal = ((i + 1) * (arr.length - i) + 1) / 2;
            sum += cal * arr[i];
        }
        return sum;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb.toString().equals(sb2.toString());
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                lis.add(i);
            }
        }
        return lis;
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
//        List<Integer> lis = new ArrayList<>();
        int result = 0;
        for (int student : students) {
            int min = Math.abs(student - seats[0]);
            for (int j = 1; j < seats.length; j++) {
                int length = Math.abs(student - seats[j]);
                if (length < min) {
                    min = length;
                }
            }
//            lis.add(min);
            result += min;
        }
//        int total =0;
//        for (Integer li : lis) {
//            total += li;
//        }
        return result;
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String ele = String.valueOf(word.charAt(i));
                if (!allowed.contains(ele)) {
                    System.out.println(ele);
                    count += 1;
                    break;
                }
            }
        }
        return words.length - count;
    }

    public static String firstPalindrome(String[] words) {
        List<StringBuilder> lis = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            System.out.println(sb);
            if (sb.toString().equals(word)) {
                lis.add(sb);
            }
        }
        if (lis.size() > 0) {
            return lis.get(0).toString();
        } else {
            return "";
        }
    }

    public static boolean checkIfPangram(String sentence) {
/*
        HashMap<Character,Long> map = new HashMap<>();
        for (int i=0;i<sentence.length();i++){
            char c =sentence.charAt(i);
            long count = sentence.chars().filter(ch -> ch == c).count();
            map.put(c,count);
        }
        List<Long> list = new ArrayList<Long>(map.values());
        for (Long aLong : list) {
            if (aLong > 1) {
                return false;
            }
        }
        return true;

 */
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return (nums[length - 1] * nums[length - 2]) - (nums[0] * nums[1]);
    }

    public static String truncateSentence(String s, int k) {
        String[] result = s.split(" ");
        String output = "";
        for (int i = 0; i < k; i++) {
            output += result[i] + " ";
        }
        return output.substring(0, output.length() - 1);
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        //List<ArrayList> lis = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        count += 1;
//                        List<Integer> target = new ArrayList<>();
//                        target.add(arr[i]);
//                        target.add(arr[j]);
//                        target.add(arr[k]);
//                        lis.add((ArrayList) target);
                    }
                }
            }
        }
        return count;
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] mapping = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        map.put('i', 8);
        map.put('j', 9);
        map.put('k', 10);
        map.put('l', 11);
        map.put('m', 12);
        map.put('n', 13);
        map.put('o', 14);
        map.put('p', 15);
        map.put('q', 16);
        map.put('r', 17);
        map.put('s', 18);
        map.put('t', 19);
        map.put('u', 20);
        map.put('v', 21);
        map.put('w', 22);
        map.put('x', 23);
        map.put('y', 24);
        map.put('z', 25);
        Set<String> set = new HashSet<>();
        for (String word : words) {
            String str = "";
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                str += mapping[map.get(c)];
            }
            set.add(str.substring(0, str.length() - 1));
        }
        return set.size();

    }

    public static int hammingWeight(int n) {
        List<Integer> number = new ArrayList<>();
        while (n > 0) {
            number.add(n % 10);
            n = n / 10;
        }
        System.out.println(number);
        int count = 0;
        for (Integer integer : number) {
            if (integer == 1) {
                count++;
            }
        }
        return count;
    }

    public int subtractProductAndSum(int n) {
        List<Integer> number = new ArrayList<>();
        while (n > 0) {
            number.add(n % 10);
            n = n / 10;
        }
        int product = 1;
        int sum = 0;
        for (Integer integer : number) {
            product *= integer;
            sum += integer;
        }
        return product - sum;
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] + nums[i + 1] >= nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return 0;
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int man = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            int value = 0;
            if (points[i][0] == x || points[i][1] == y) {
                value = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (value < man) {
                    man = value;
                    index = i;
                }
            }

        }
        return index;
    }

    public static int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                result = -result;
            }
        }
        return result;
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return false;
            }
        }
        return result;
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        while (n > 9) {
            while (n > 0) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 7) {
            return true;
        }
        return n == 1;
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() == 2) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count--;
            } else {
                count++;
            }
        }
        System.out.println(count);
        return count >= 0;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        for (int k : nums1) {
            for (int j = 0; j <= nums2.length - 1; j++) {
                if (k == nums2[j]) {
                    // 进行第二次循环
                    System.out.println("check index:" + j); // 1st j=5, index = 5,
                    if (j == nums2.length - 1) {
                        res.add(-1);
                    } else if (j + 1 == nums2.length - 1 && nums2[j + 1] < nums2[j]) {
                        res.add(-1);
                    } else {
                        for (int i = j; i < nums2.length - 1; i++) {
                            //System.out.println("打印:"+nums2[i]);
                            if (nums2[i + 1] > k) {
                                res.add(nums2[i + 1]);
                                break;
                            }
                        }
                    }
                }
            }
        }
        int size = res.size();
        int[] result = new int[size];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public static void plusMinus(List<Integer> arr) {
        int length = arr.size();
        int countP = 0;
        int countZero = 0;
        int countN = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                countP += 1;
            } else if (integer == 0) {
                countZero += 1;
            } else {
                countN += 1;
            }
        }
        double proPositive = (double) countP / length;
        double proZero = (double) countZero / length;
        double proCountN = (double) countN / length;
        System.out.printf("%.6f\n", proPositive);
        System.out.printf("%.6f\n", proZero);
        System.out.printf("%.6f\n", proCountN);
    }

    public static List<Integer> getPrefixScores(List<Integer> arr) {
        // Write your code here
        List<Integer> scores = new ArrayList<>();
        //int [] scores = new int[arr.size()];
        int prefixScore = 0;
        for (int i = 0; i < arr.size(); i++) {
            prefixScore += arr.get(i) * (i + 1);
            scores.add(prefixScore);
            //scores.get(i) = prefixScore;
            // scores[i] = prefixScore;
        }
        return scores;
    }

    public static List<List<Integer>> findEvenSubarrys(List<Integer> nums) {
        // Write your code here
        int count = 0;
        // find all possible subarray
        List<List<Integer>> evenSubarray = new ArrayList<>();
        int length = nums.size();
        for (int i = 0; i < length; i++) {
            int xor = 0;
            List<Integer> subarray = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                xor ^= nums.get(j);
                subarray.add(nums.get(j));
                if (j - i + 1 > 1 && (j - i + 1) % 2 == 0 && xor == 0) {
                    evenSubarray.add(new ArrayList<>(subarray));
                }
            }
        }
        return evenSubarray;

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean left;
        boolean right;
        for (int i = 0; i <= flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0) {
                left = i == 0 || flowerbed[i - 1] == 0;
                right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                //System.out.println("i的值:"+i);

                if (left && right) {
                    flowerbed[i] = 1;
                    n -= 1;
                }
                //System.out.println("n的值"+n);
            }
        }
        //System.out.println(n);
        return n <= 0;
    }

    public static int findMinArrowShots(int[][] points) {
        int count = 1;
        // 对end point 进行冒泡排序
        int length = points.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (points[j][1] > points[j + 1][1]) {
                    // 交换
                    int[] temp = points[j];
                    points[j] = points[j + 1];
                    points[j + 1] = temp;
                }
            }
        }
        // 交换成功了，这时候进行合并
        int end = points[0][1];
        for (int i = 0; i < length - 1; i++) {
            if (points[i + 1][0] > end) {
                count += 1;
                end = points[i + 1][1];
            }
        }
        return count;
    }

    public static List<Integer> partitionLabels(String s) {
        // 创建一个lastIndex来存放last index 的位置
        int[] lastIndex = new int[128];
        ArrayList<Integer> result = new ArrayList<>();
        //进行第一轮遍历
        for (int i=0;i<s.length();i++){
            lastIndex[(int)s.charAt(i)]=i;
        }
        //这个时候，我们拿到了每个元素的最后一位index,进行第二次遍历，把范围确定下来,现将start 和 end 定义为0；
        int start =0;
        int end = 0;
        for (int i=0;i<s.length();i++){
            end = Math.max(end, lastIndex[(int)s.charAt(i)]);
            // 这个时候如果i ==end, 说明到尽头了；

            if (i==end){
                result.add(end-start+1);
                start=end +1;
            }
        }
        return result;
    }
    public static int maxProfit(int[] prices) {
        ArrayList<Integer> profits =  new ArrayList<>();
        for (int i=0;i<prices.length-1;i++){
            int profit = prices[i+1] - prices[i];
            profits.add(profit);
        }
        int proSum = 0;
        for (Integer profit : profits) {
            if (profit > 0) {
                proSum += profit;
            }
        }
        return proSum;
    }
    public static int[] twoSum(int[] numbers, int target) {
        int index = 0;
        int index2 = numbers.length-1;
        while(numbers[index] + numbers[index2] != target){
            if(numbers[index] + numbers[index2] <target){
                index++;
            }else {
                index2--;
            }
        }
        return new int[]{index+1,index2+1};

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
        // 这道题用hashset 做
        public boolean hasCycle(ListNode head) {
            boolean result = false;
            HashSet<ListNode> hashSet = new HashSet<>();
            while(head!=null){
                if(hashSet.contains(head)){
                    return true;
                }else{
                    hashSet.add(head);
                }
                head=head.next;
                }
            return result;
            }

        public ListNode detectCycle(ListNode head) {
            /*
            HashSet<ListNode> hashSet = new HashSet<>();
            while(head!=null){
                if(hashSet.contains(head)){
                    return head;
                }else{
                    hashSet.add(head);
                }
                head=head.next;
            }

             */
            // 定义快慢指针
            ListNode fast = head;
            ListNode slow = head;
            // 判断是否有循环
            do {
                if(fast==null || fast.next==null){
                    return null;
                }
                fast = fast.next.next;
                slow = slow.next;
            }while(fast!=slow);
            // fast == meet
            fast = head;
            while(fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;

        }

    }

    public static String minWindow(String s, String t) {
        String conT = "";

        for (int right = 0;right<s.length();right++){
            char cha = s.charAt(right);
            if(!conT.contains(t)){
                conT+=cha;
                System.out.println("检查:"+conT);
            }else{
                break;
            }

        }
        System.out.println(conT.contains(t));
        for (int left = 0;left<conT.length();left++){
            if(!conT.substring(0,left).contains(t)){
                conT.substring(left,conT.length()-1);
            }

        }

        if (conT.length()==0){
            return "";
        }else{
            return conT.toString();
        }

    }

    public static boolean judgeSquareSum(int c) {
        // define two pointers
        boolean result = false;
        int pointer1 = 0;
        int pointer2 = (int) Math.round(Math.sqrt(c));
        while(pointer1<=pointer2){
            int tar = (int) (Math.pow(pointer1,2)+Math.pow(pointer2, 2));
            if(tar==c){
                result=true;
                break;
            }
            if(tar<c){
                pointer1++;
            }
            else {
                pointer2--;
            }
        }
        return result;
    }

    public static boolean validPalindrome(String s) {
        // define two pointers
        int left = 0;
        int right = s.length()-1;
        boolean result = false;
        if (check(s)){
            result = true;
        }
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                left++;
                if (check(s.substring(left,right+1))){
                    result=true;
                    break;
                }else{
                   // s=s.substring(left,right+1);
                    right--;
                    if (check(s.substring(left-1,right+1))){
                        result = true;
                        break;
                    }
                    else{
                        return false;
                    }
                }
            }else{
                left++;
                right--;
            }
        }
        return result;
    }

    public static boolean check (String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        System.out.println(s);
        return s.equals(sb.toString());
    }

    public static String findLongestWord(String s, List<String> dictionary) {
        ArrayList<String> result = new ArrayList<>();
        String longest = "";
        for (String ele:dictionary){
            int s_index =0;
            int ele_index = 0;
            while(s_index<=s.length()-1){
                if(s.charAt(s_index)==ele.charAt(ele_index)){
                    if(ele_index==ele.length()-1){
                        result.add(ele);
                        break;
                    }
                    s_index++;
                    ele_index++;
                }else{
                    s_index++;
                }

            }
        }
        if (result.size()==0){
            return "";
        }
        Collections.sort(result);
        for (String element: result){
            if (element.length()>longest.length()){
                longest = element;
            }
        }
        System.out.println(result);
        return longest;

    }

    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        // binary search [1,x]
        long left = 1;
        long right = x;
        while(left<=right){ // 左闭右闭
            long middle = left + ((right - left)/2);
            System.out.println("middle 的值: "+middle);
            if(middle * middle >x){ // 排除右边部分
                right = middle-1;
            }else if ((middle * middle <x)){
                left = middle+1;
                if ((middle+1) * (middle+1)>x){
                    return (int) Math.floor(middle);
                }
            }else{
                return (int) Math.floor(middle);
            }
        }
        return -1; // 如果找不到
    }





    public static void main(String[] args) {
        //System.out.println(judgeSquareSum(1));
       //System.out.println(validPalindrome("cxcaac"));
       // System.out.println("adcba".equals("abcda"));
      // System.out.println(check("caa"));
        String s = "abpcplea";
       // String [] dic = new String[]{"ale","apple","monkey","plea"};
        String [] dic = new String[]{"ale","apple","monkey","plea", "abpcplaaa","abpcllllll","abccclllpppeeaaaa"};
        //String [] dic = new String[]{"a","b","c"};
        //System.out.println(findLongestWord(s, Arrays.asList(dic)));
        System.out.println("结果:"+mySqrt(8));






    }
}



     class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
          // 这道题用hashset 做
         public boolean hasCycle(ListNode head) {
             return true;

         }

         public static void main(String[] args) {
             System.out.println("尼玛");
             ListNode head = new ListNode(3);
             ListNode node2 = new ListNode(2);
             ListNode node3 = new ListNode(0);
             ListNode node4 = new ListNode(-4);
             System.out.println("我擦:"+head.toString());
             head.next = node2;
             node2.next = node3;
             node3.next = node4;
             ListNode current = head;
             while(current!=null){
                 System.out.println(current.val+" ");
                 current = current.next;
             }


         }
      }










