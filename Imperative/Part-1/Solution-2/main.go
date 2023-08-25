package main

import (
	"fmt"
	"math"
	"strings"
)

func makeFigure(elements int) {

	if elements%2 == 0 {
		fmt.Print("Invalid value")
	} else {
		for i := 0; i < elements; i++ {
			spaces := int(math.Abs(float64(elements/2 - i)))
			symbol := elements - 2*spaces
			fmt.Print(strings.Repeat(" ", spaces) + strings.Repeat("*", symbol) + "\n")

		}
	}
}

func main() {
	makeFigure(5)
}
