package verificandoPalindromo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromoController {

    @GetMapping("/verificar-palindromo/{word}")
    public String verificacionDelPalindromo(@PathVariable String word) {
        if (isPalindrome(word)){
            return "La palabra " + word + " es un palindromo";
        }else{
            return "La palabra " + word + " no es un palindromo";
        }
    }

    private Boolean isPalindrome(String word){
        int length = word.length();
        for (int i = 0; i < length / 2; i++){
            if (word.charAt(i) != word.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
}
