package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result impressum() {
        return ok(index.render("Your new application is ready."));
    }
    
     public static Result rezepte() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result bewerten() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result hochladen() {
        return ok(index.render("Your new application is ready."));
    }
    
    
    
    

}
