package v1.user

import javax.inject.Inject

import play.api.Play.current
import play.api.libs.json.Json
import play.api.mvc._
import play.api.db._


/**
  * Takes HTTP requests and produces JSON.
  */
class UserController extends Controller
{
  def index = Action { implicit request => 
    Ok("Hello")
  }
 
}
