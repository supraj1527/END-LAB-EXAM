// src/main/java/com/klef/jfsd/exam/ClientController.java
package com.klef.jfsd.exam;

@Controller
public class ClientController {

    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greet"; // Corresponding JSP: greet.jsp
    }

    @RequestMapping("/about")
    public String about() {
        return "about"; // Corresponding JSP: about.jsp
    }

    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1"; // Corresponding JSP: demo1.jsp
    }

    @RequestMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("division", num1 / num2);
        return "demo2"; // Corresponding JSP: demo2.jsp
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform"; // Corresponding JSP: productform.jsp
    }

    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "multiplyNumbers"; // Corresponding JSP: multiplyNumbers.jsp
    }

    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversedStr1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversedStr2", new StringBuilder(str2).reverse().toString());
        return "reverse"; // Corresponding JSP: reverse.jsp
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("addition", num1 + num2);
        return "calculate"; // Corresponding JSP: calculate.jsp
    }
}
