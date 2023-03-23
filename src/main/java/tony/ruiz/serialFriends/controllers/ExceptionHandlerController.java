package tony.ruiz.serialFriends.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ExceptionHandlerController {
    
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        String errorMessage = "Se ha producido un error: " + e.getMessage();
        model.addAttribute("errorMessage", errorMessage);
        return "error";
    }
}
