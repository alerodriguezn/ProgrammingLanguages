package main

import (
	"fmt"
	"sort"
)

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos

const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

func (l *listaProductos) buscarProducto(nombre string) (*producto, int) { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			result = i
		}
	}

	if result != -1 {
		return &((*l)[result]), 0
	}

	return nil, 1

}

func (l *listaProductos) agregarProducto(p producto) {

	existProduct, err := l.buscarProducto(p.nombre)

	if err == 0 {
		existProduct.cantidad += p.cantidad
		existProduct.precio = p.precio
	} else {
		*l = append(*l, p)
	}

}

func (l *listaProductos) agregarProductos(products ...producto) {
	for _, p := range products {
		existProduct, err := l.buscarProducto(p.nombre)

		if err == 0 {
			existProduct.cantidad += p.cantidad
			existProduct.precio = p.precio
		} else {
			*l = append(*l, p)
		}

	}
}

func (l *listaProductos) venderProducto(nombre string) {
	prod, err := l.buscarProducto(nombre)
	if err == 0 {
		prod.cantidad = prod.cantidad - 1

	}
}

func llenarDatos() {
	lProductos.agregarProducto(producto{"arroz", 15, 2500})
	lProductos.agregarProducto(producto{"frijoles", 4, 2000})
	lProductos.agregarProducto(producto{"leche", 8, 1200})
	lProductos.agregarProducto(producto{"café", 12, 4500})

}

func (l *listaProductos) listarProductosMínimos() listaProductos {
	var newList listaProductos

	for _, p := range *l {
		if p.cantidad <= existenciaMinima {
			newList = append(newList, p)
		}
	}
	return newList
}

func (l *listaProductos) aumentarInventarioDeMinimos(listaMinimos listaProductos) {
	for _, p := range listaMinimos {
		p.cantidad = existenciaMinima - p.cantidad
		l.agregarProducto(p)
	}
}

func (l *listaProductos) ordenarPorCantidad() {
	sort.Slice(*l, func(i, j int) bool {
		return (*l)[i].cantidad > (*l)[j].cantidad
		//return (*l)[i].nombre > (*l)[j].nombre OTRO ORDENAMIENTO
		//return (*l)[i].precio > (*l)[j].precio OTRO ORDENAMIENTO
	})
}

func main() {

	llenarDatos()
	//fmt.Println(lProductos)
	//venda productos
	//lProductos.venderProducto("arroz")
	//fmt.Println(lProductos)
	//lProductos.agregarProducto("arroz", 2, 2175)
	//fmt.Println(lProductos)
	pr := []producto{{nombre: "Producto1", cantidad: 2, precio: 2020}, {nombre: "Produc2", cantidad: 3, precio: 1895}}
	lProductos.agregarProductos(pr...)
	fmt.Println(lProductos)

	res := lProductos.listarProductosMínimos()
	fmt.Println(res)

	lProductos.aumentarInventarioDeMinimos(res)

	fmt.Println(lProductos)

	lProductos.ordenarPorCantidad()

	fmt.Println(lProductos)

}
