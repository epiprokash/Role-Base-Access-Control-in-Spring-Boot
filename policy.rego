package httpapi.authz

default allow = false

allow if {
    input.method == "GET"
    input.path == ["api", "public"]
}

allow if {
    input.user == "admin"
    input.method == "POST"
    input.path == ["api", "secure"]
}
