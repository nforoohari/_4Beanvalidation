package ir.digixo._4beanvalidation.controller;

import ir.digixo._4beanvalidation.entity.Product;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ProductController {

    @GetMapping("/showForm")
    public String showForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "productForm";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("bindingResult: " + bindingResult);
            System.out.println("product: " + product.getName() + "  " + product.getPrice());
            return "productForm";
        } else
            return "productForm-ok";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trimmerEditor);
    }
}
