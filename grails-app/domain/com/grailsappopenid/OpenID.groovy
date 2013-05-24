package com.grailsappopenid



class OpenID {

    String url

    static belongsTo = [user: User]

    static constraints = {
        url unique: true
    }
}
