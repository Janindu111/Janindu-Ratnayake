/// <reference types = "cypress"/>

const { auto } = require("async")

describe ("Registration", function()
{

    it ("Registration",function(){
        cy.visit('https://www.catchme.lk/')//open the url
        cy.get('div[class="dropdown d-none d-md-inline-block"]').contains('Register').click()
        cy.get('#input-register-name').type("Janindu")
        cy.get('#input-register-telephone').type("0774437475")
        cy.get('#input-register-email').type("janinduratnayake48@gmail.com")
        cy.get('#input-register-password').type("Janindu#1112")
        cy.get('#input-register-password-confirmation').type("Janindu#1122")
        cy.get('div[class="modal-footer text-center d-block"]').contains('Register').click()
        //Assertion for checking if registered email error message shows
        cy.get('.mr-auto').should('be.visible').should('contain', "Password and the confirmation does not match")
        cy.wait(3000)
    }
    )
    it ("Registration",function(){
        cy.visit('https://www.catchme.lk/')//open the url
        cy.get('div[class="dropdown d-none d-md-inline-block"]').contains('Register').click()
        cy.get('#input-register-name').type("Janindu")
        cy.get('#input-register-telephone').type("0774437475")
        cy.get('#input-register-email').type("janinduratnayake48@gmail.com")
        cy.get('#input-register-password').type("Janindu#1112")
        cy.get('#input-register-password-confirmation').type("Janindu#1112")
        cy.get('div[class="modal-footer text-center d-block"]').contains('Register').click()
        //Assertion for checking if registered email error message shows
        cy.get('.mr-auto').should('be.visible').should('contain', "This e-mail address is already associated with a user account.")
        cy.wait(3000)
    }
    )
}
)