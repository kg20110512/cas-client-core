package org.jasig.cas.client.authentication;

public class PasswordPrincipalImpl extends AttributePrincipalImpl {

    private final String password;

    public PasswordPrincipalImpl(String name, String password) {
        super(name);
        this.password = password;
    }
}
