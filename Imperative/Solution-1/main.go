package main

import (
	"fmt"
	"os"
	"strconv"
	"strings"
)

func readFile() string {
	data, err := os.ReadFile("Imperative/Solution-1/text.txt")
	if err != nil {
		panic(err)
	}
	return string(data)
}

func getTextInfo(text string) [3]int {
	lines := len(strings.Split(text, "\n"))
	words := len(strings.Split(text, " "))
	characters := len(text)

	info := [3]int{lines, words, characters}
	return info

}

func main() {

	text := readFile()
	data := getTextInfo(text)
	info := fmt.Sprintf("Lines: %s \nWords: %s \nCharacters: %s", strconv.Itoa(data[0]), strconv.Itoa(data[1]), strconv.Itoa(data[2]))
	fmt.Print("-------- Text Information---------\n")
	fmt.Print(info)
	fmt.Print("\n---------------------------------")

}
