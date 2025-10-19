/*
Search in 2D matrix:

int m = matrix.length;
int n = matrix[0].length;
int left = 0 ; int right = n*m -1;
while(left<=right){
int mid = left + (right - left)/2;
int midValue = matrix[mid/n][mid%n];
if(midValue == target){
return true;
}else if(midValue < target){
left = mid + 1;
}
else {
right = mid -1;
}
}
return false;

*/

/*
Rotate image :

int n = matrix.length;
int m = matrix[0].length;
int [][] result = new int [m][n];
for(int i = 0 ; i < n ; i++){
for(int j = 0 ; i < m ; j++){
reult[j][i] = matrix[i][j];
}}
for(int i = 0 ; i < n ;i++){
int left = 0 ; int right = n-1;
while(left < right){
int temp = result[i][left];
result[i][left] = result[i][right];
result[i][right]= temp;
left ++;
right--;}}
 for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = result[i][j];
            }
        }
*/
