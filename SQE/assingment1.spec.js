/// <reference types = "cypress"/>
describe ("Login", function()
{

    it ("Login fail",function(){
        cy.visit('https://www.catchme.lk/')//open the url
        cy.get('div[class="dropdown d-none d-md-inline-block"]').contains('Login').click()
        cy.get('#input-login-email').type("janinduratnayake48@gmail.com")
        cy.get('#input-login-password').type("Janindu#1122")
        cy.get('div[class="modal-footer text-center d-block"]').contains('Login').click()
        //Assertion for providing an invalid email or password
        cy.get('.mr-auto').should('be.visible').should('contain', "Provided e-mail address or password is invalid")
        cy.wait(3000)
    }
    )
    it ("Login success",function(){
        cy.visit('https://www.catchme.lk/')//open the url
        cy.get('div[class="dropdown d-none d-md-inline-block"]').contains('Login').click()
        cy.get('#input-login-email').type("janinduratnayake48@gmail.com")
        cy.get('#input-login-password').type("Janindu#1112")
        cy.get('div[class="modal-footer text-center d-block"]').contains('Login').click()
        //Assertion for signing succesfully
        cy.get('.mr-auto').should('be.visible').should('contain', "You have successfully signed in!")
        cy.wait(3000)
    }
    )

}
)
