/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

public class User extends LibraryEntity {
    private final String name;
    private final String email;

    public User(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String getDetails() {
        return "User [ID=" + getId() + ", Name=" + name + ", Email=" + email + "]";
    }
}
