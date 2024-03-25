package lesson3.task2;

//Напишите обобщенный метод compareArrays(),
// который принимает два массива и возвращает true,
// если они одинаковые, и false в противном случае.
// Массивы могут быть любого типа данных, но должны иметь одинаковую
// длину и содержать элементы одного типа по парно по индексам.


public class Compare {
    public static <T> boolean compareArrays(T[] arrayA, T[] arrayB) {
        if (arrayA == null) {
            throw new NullPointerException("arrayA");
        }
        if (arrayB == null) {
            throw new NullPointerException("arrayB");
        }
        if (arrayA.length != arrayB.length) {
            return false;
        }

        for (int i = 0; i < arrayA.length; ++i) {

            if (!arrayA[i].getClass().equals(arrayB[i].getClass())){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Integer[] arr = {3, 6, 9};
        Integer[] arr2 = {3, 5, 6, 9};


        System.out.println(compareArrays(arr, arr2));

    }
}

