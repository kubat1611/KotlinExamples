package com.example.kotlinapplication.dataclass

data class Contact(val name: String, val phoneNumber: String, val email: String)

class ContactManager {
    private val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact) = contacts.add(contact)

    // TODO:
    // 1. Znajdź kontakt z danym imieniem i zaktualizuj jego numer telefonu i e-mail
    // 2. Jeśli jest kilka takich kontaktów, zaktualizuj pierwszy

    fun updateContact(name: String, newPhoneNumber: String, newEmail: String) {
        val contactIndex = contacts.indexOfFirst { it.name == name }

        if (contactIndex != -1) {
            val contact = contacts[contactIndex]
            val updatedContact = contact.copy(
                phoneNumber = newPhoneNumber,
                email = newEmail
            )
            contacts[contactIndex] = updatedContact  // Update contact in the list
        }
    }




    // TODO: Znajdź kontakt z podanym imieniem
    fun findContactsByName(name: String): List<Contact> {
        return contacts.filter { it.name == name }
    }


    // TODO: Sprawdź czy do managera jest już dodany kontakt o takich samych parametrach
    fun alreadyAdded(contact: Contact): String {
        if( contacts.any {
            it.name == contact.name &&
                    it.phoneNumber == contact.phoneNumber &&
                    it.email == contact.email
        }){
            return "YES"}
        else if (!contacts.any {
                it.name == contact.name &&
                        it.phoneNumber == contact.phoneNumber &&
                        it.email == contact.email
            }){
            return "NO"
        }
        return "No contacts found"
    }

    // TODO: wyświetl kontakt w formacie "Name:  Phone: Email:"
    fun printContactDetails(contact: Contact) {
        println("Name: ${contact.name} Phone: ${contact.phoneNumber} Email: ${contact.email}")

    }

    // TODO: Użyj domyślnej implementacji .toString() do wyświetlenia kontaktów
    fun printAllContacts() {
        for (contact in contacts){
            println(contact.toString())
        }
    }
}

fun main() {
    val manager = ContactManager()
    val contact1 = Contact("Alice Johnson", "555-1234", "alice@example.com")
    val contact2 = Contact("Bob Smith", "555-5678", "bob@example.com")
    val contact3 = Contact("Alice Johnson", "555-9999", "alicej@example.com")

    manager.addContact(contact1)
    manager.addContact(contact2)

    println("All contacts:")
    manager.printAllContacts()

    manager.updateContact("Alice Johnson", "555-4321", "alice.new@example.com")
    manager.printAllContacts()

    println("Is contact3 already added? ${manager.alreadyAdded(contact3)}")
    manager.addContact(contact3)
    println("Is contact3 already added now? ${manager.alreadyAdded(contact3)}")

    println("Contacts named 'Alice Johnson':")
    manager.findContactsByName("Alice Johnson").forEach(manager::printContactDetails)
}
