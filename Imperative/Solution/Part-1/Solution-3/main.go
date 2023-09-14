package main

import (
	"fmt"
)

func rotateArray(list *[]string, movements int, direction bool) []string {
	length := len(*list)
	var aux = make([]string, length)
	for i := 0; i < length; i++ {
		if direction {
			if (i + movements) >= length {
				aux[(i+movements)-length] = (*list)[i]
			} else {
				aux[i+movements] = (*list)[i]
			}
		} else {
			if (i - movements) < 0 {
				aux[(i-movements)+length] = (*list)[i]
			} else {
				aux[i-movements] = (*list)[i]
			}
		}

	}
	return aux
}

func main() {

	elements := []string{"a", "b", "c", "d", "e", "f", "g", "h"}

	// True = Right | False = Left
	arrayRotated := rotateArray(&elements, 3, false)
	fmt.Print(arrayRotated)

}
