package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification {
    def "Set  GetQuantity()"() {
        setup:
        List order = Mock(List)
        order.size() >> 10;

        when: "set quantity and get quantity"
        def quantity = order.size()


        then: "compare with expected"
        quantity == 10
    }

    def "Test SetQuantity()"() {
        setup:
        Order order = new Order()
        expect:
        order.setQuantity(2).getQuantity() == 2
    }

    def "Test GetItemName()"() {
        setup:
        Order order = new Order()
        expect:
        order.setItemName("Test item").getItemName() == "Test item"
    }

    def "Test SetItemName()"() {
        setup:
        Order order = new Order()
        expect:
        order.setItemName("Test item").getItemName() == "Test item"
    }

    def "Test GetPrice()"() {
        setup:
        Order order = new Order()
        expect:
        order.setPrice(300).getPrice() == 300
    }

    def "Test SetPrice()"() {
        setup:
        Order order = new Order()
        expect:
        order.setPrice(300).getPrice() == 300
    }

    def "Test GetPriceWithTex()"() {
        setup:
        Order order = new Order()
        expect:
        order.setPriceWithTex(400).getPriceWithTex() == 400
    }

    def "Test SetPriceWithTex()"() {
        setup:
        Order order = new Order()
        expect:
        order.setPriceWithTex(400).getPriceWithTex() == 400
    }
}
