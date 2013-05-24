import com.grailsappopenid.Role
import com.grailsappopenid.User
import com.grailsappopenid.UserRole

class BootStrap {

    def init = { servletContext ->

        def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
        def roleUser = new Role(authority: 'ROLE_USER').save()

        def user = new User(username: 'james', password: 'james', enabled: true).save()
        def admin = new User(username: 'admin', password: 'admin', enabled: true).save()

        UserRole.create user, roleUser
        UserRole.create admin, roleUser
        UserRole.create admin, roleAdmin, true

    }
    def destroy = {
    }
}
