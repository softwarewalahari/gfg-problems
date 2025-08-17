<h2><a href="https://www.geeksforgeeks.org/problems/minimum-increment-by-k-operations-to-make-all-equal/1">Minimum increment by k operations to make all equal</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> and an integer <strong>k</strong>. You can perform an operation in which you can increment any of the number in the array by <strong>k. </strong>Find the <strong>minimum</strong> number of operations needed to make all the elements of array equal.</span></p>
<p><span style="color: #273239; font-family: Nunito, sans-serif; font-size: 18px; letter-spacing: 0.162px; background-color: #ffffff;">Note: If it is not possible to make all elements of array equal return -1.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [4, 4, 4, 2],</span><span style="font-size: 18px;"> k = 2</span><span style="font-size: 18px;">
<strong>Output: </strong>1<strong>
Explanation: </strong>We can increment the element at last index of the array by 2 to make all the elements equal to 4.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [4, 2, 6, 8], k = 3
<strong>Output: </strong>-1<strong>
Explanation: </strong>It can be proven that these elements can't be made equal by applying any number of operations.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [4, 7, 19, 16],</span><span style="font-size: 18px;"> k = 3</span><span style="font-size: 18px;">
<strong>Output: </strong>10</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong>1 &lt;= arr.size() &lt;= 10<sup>5</sup><strong><br></strong></span><span style="font-size: 18px;">0 &lt;= arr[i]&nbsp;</span><span style="font-size: 18px;">&lt;= 10<sup>5</sup></span><span style="font-size: 18px;"><br></span><span style="font-size: 18px;">1 &lt;= k &lt;= 10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Algorithms</code>&nbsp;