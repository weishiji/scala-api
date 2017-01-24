package v1.user

import javax.inject.Inject

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._


/**
  * Routes and URLs to the PostResource controller.
  */
class UserRouter @Inject()(controller: UserController) extends SimpleRouter {
  val prefix = "/v1/customer"
  override def routes: Routes = {
    case GET(p"/") =>
      controller.index
  }

}
