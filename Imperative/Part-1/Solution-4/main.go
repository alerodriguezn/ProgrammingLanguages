package main

import (
	"errors"
	"fmt"
	"math/rand"
	"strconv"
	"time"
)

type Shoe struct {
	brand string
	model string
	price float64
	size  int8
}

type Inventory struct {
	stock int16
	shoe  Shoe
}

func (s *Shoe) setSize(size int8) error {
	if size > 44 || size < 33 {
		return errors.New("this size must be 33-44")
	}
	s.size = size

	return nil

}

func (s *Shoe) setBrand(brand string) error {
	if brand == "" {
		return errors.New("you need to put a brand")
	}

	s.brand = brand

	return nil
}

func (s *Shoe) setModel(model string) error {
	if model == "" {
		return errors.New("you need to put a model")
	}

	s.model = model

	return nil
}

func (s *Shoe) setPrice(price float64) error {
	if price <= 0 {
		return errors.New("the price must be > 0")
	}

	s.price = price

	return nil
}

func (i *Inventory) setStock(stock int16) error {
	if stock < 0 {
		return errors.New("the stock must be > 0")
	}

	i.stock = stock

	return nil
}

func (i *Inventory) setShoe(shoe Shoe) error {
	//TODO
	if shoe.price < 1 {
		return errors.New("the stock must be > 0")
	}

	i.shoe = shoe

	return nil
}

type listShoes []Inventory

func (l *listShoes) searchShoe(model string, size int8) *Inventory {
	for _, i := range *l {
		if i.shoe.model == model && i.shoe.size == size {
			return &i
		}
	}

	return nil

}

func (l *listShoes) addShoe(i Inventory) {

	if l.searchShoe(i.shoe.model, i.shoe.size) == nil {
		*l = append(*l, i)
	}

}

func (l *listShoes) sellShoe(model string, size int8, quantity int16) error {
	for i := range *l {
		if (*l)[i].shoe.model == model && (*l)[i].shoe.size == size {
			if (*l)[i].stock == 0 {
				return errors.New("no Stock")
			}

			(*l)[i].stock -= quantity
			return nil
		}
	}
	return errors.New("invalid shoe")
}

func (l *listShoes) printStore() {
	for _, i := range *l {
		fmt.Println("Model: " + i.shoe.model + " Brand: " + i.shoe.brand + "Size: " + strconv.Itoa(int(i.shoe.size)) + " Stock: " + strconv.Itoa(int(i.stock)))
	}

}

var myStore listShoes

func (l *listShoes) harcodedData() {
	shoeBrands := []string{
		"New Balance",
		"Under Armour",
		"Skechers",
		"Fila",
		"Nike",
		"Adidas",
		"Puma",
		"Reebok",
		"Converse",
		"Vans",
	}
	shoeModels := []string{
		"X45",
		"Y12",
		"F15",
		"G15",
		"A50",
		"F14",
		"H12",
		"G12",
		"F4",
		"Y75",
	}

	r := rand.New(rand.NewSource(time.Now().UnixNano()))

	for i := 0; i < len(shoeBrands); i++ {
		s := Shoe{}

		branErr := s.setBrand(shoeBrands[i])
		if branErr != nil {
			fmt.Println(branErr.Error())
			return
		}

		modelErr := s.setModel(shoeModels[i])
		if modelErr != nil {
			fmt.Println(modelErr.Error())
			return
		}

		randomPrice := r.Intn(1000)
		priceErr := s.setPrice(float64(randomPrice))
		if priceErr != nil {
			fmt.Println(priceErr.Error())
			return
		}

		//randomSize := r.Intn(10) + 34
		//sizeErr := s.setSize(int8(randomSize))
		sizeErr := s.setSize(44)

		if sizeErr != nil {
			fmt.Println(sizeErr.Error())
			return
		}

		i := Inventory{}

		shoeErr := i.setShoe(s)
		if shoeErr != nil {
			fmt.Print(shoeErr.Error())
			return
		}

		randomStock := r.Intn(100)
		stockErr := i.setStock(int16(randomStock))
		if stockErr != nil {
			fmt.Print(stockErr.Error())
			return
		}

		(*l).addShoe(i)

	}

	// Testing
	(*l).addShoe(Inventory{2, Shoe{"Test", "X45", 22, 34}})

}

func main() {

	myStore.harcodedData()
	myStore.printStore()

	err := myStore.sellShoe("X45", 44, 1)
	if err != nil {
		fmt.Println(err.Error())
	}

	println("-----")
	myStore.printStore()

}
