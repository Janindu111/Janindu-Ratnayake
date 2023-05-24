/// <reference types = "cypress"/>
describe ("Search", function(){

    it ("Search",function(){
        cy.visit('https://www.catchme.lk/')//open the urlcy.get('div[class="dropdown d-none d-md-inline-block"]').contains('Register').click()
        cy.wait(500)
        cy.get('#search_query').type("Wireless Fast Charger")
        cy.get('[href="/product/wireless-fast-charger-10629"]').eq(0).click()
        
    }
    )
    
    it ("Cart",function(){
        cy.get('#btn-add-to-cart').click()
        cy.get('#modal-added-to-cart > .modal-dialog > .modal-content > .modal-footer > .btn-success')
        //Assertion for adding product to the cart
        cy.get('div[class="modal-header"]').contains('Product added to cart').should('be.visible')
    }
    )
    it ("Add Note",function(){
        cy.get('div[class="modal-footer text-center d-block"]').contains('Shopping Cart').click()
        cy.get('div[class="card-body"]').contains('Click here').click()
        cy.get('#text-order-comments').type("Please send my order fast as possible")
        cy.get('div[class="modal-footer text-center d-block"]').contains('Add Order Note').click()
        //Assertion for successfully adding a n order note
        cy.get('.mr-auto').should('be.visible').should('contain', "Successfully added your order note")
        cy.wait(3000)

    })
    it ("Delete Add Note",function(){
        cy.get('div[class="card-body"]').contains('Delete').click()
        //Assertion for removing the order note
        cy.get('.mr-auto').should('be.visible').should('contain', "Successfully removed your order note")
        cy.wait(3000)

    })
}
)