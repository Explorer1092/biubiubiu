package main
//package是main是程序的入口
import (
	"fmt"
	"net/http"

)

func handler(w http.ResponseWriter,r *http.Request) {
	fmt.Fprint(w,"Hi there,I love %s!",r.URL.Path[1:])
}
func main() {
	http.HandleFunc("/",handler)
	http.ListenAndServe("8080",nil)


}
//func main() {
//	sum := 1
//	for sum < 1000 {
//		sum += sum
//	}
//	fmt.Println(sum)
//	fmt.Println("hello world")
//}