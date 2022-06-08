import java.util.Arrays;

public class SelectionSort {

  // i와 j의 위치에 있는 값을 바꾼다
  // 요소의 크기와 위치를 알고 있다면 상수시간 -> 입력 크기에 의존하지 않는 상수 시간 알고리즘
  public static void swapElements(int[] array,int i , int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  // start로 부터 시작한 최솟값의 위치를 찾고 배열의 마지막으로 간다
  // 배열의 크기에 따라 실행시간이 길어지기 때문에 선형 알고리즘
  public static int getLowest(int[] array,int startIndex){
    int lowIndex = startIndex;
    for (int i = startIndex; i < array.length; i++) {
      if(array[i] < array[lowIndex]){
        lowIndex = i;
      }
    }
    return lowIndex;
  }
  // 선택 정렬을 사용하여 요소를 정렬한다.
  // 모든 배열을 탐색한다 -> 이차
  // n(n+1)/2 -> 모든 배열을 검색하기 때문에 입력값에 따라 n^2 되어 이차 알고리즘 이라고 한다.
  public static void selectionSort(int[] array){
    for (int i = 0; i <array.length; i++) {
      int j = getLowest(array,i);
      swapElements(array,j,i);
    }
  }

  public static void main(String[] args) {
    int[] ex = {1,5,9,10,3,2};
    selectionSort(ex);
    Arrays.stream(ex).forEach(System.out::println);
  }
}
