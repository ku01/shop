package dev.ku01.shop;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import com.jayway.jsonpath.PathNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(initializers = GraphQLShopDumpTest.PostgresqlInitializer.class)
@ActiveProfiles("test")
public class GraphQLShopDumpTest extends BaseGraphQLTest {
    public static final String GET_ALL_ORDERS = "getAllOrders.graphql";
    public static final String GET_ORDERS_US_GRAPHQL = "getOrdersUS.graphql";
    public static final String GET_ORDERS_CA_GRAPHQL = "getOrdersCA.graphql";
    public static final String GET_ORDERS_AND_CUSTOMERS_GRAPHQL = "getOrdersAndCustomers.graphql";
    public static final String GET_ORDER_ITEMS_GRAPHQL = "getOrderItems.graphql";

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void testGetAllOrders() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(GET_ALL_ORDERS);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertEquals(4, response.getRaw("data.getOrders.size()"));
        assertOrder1(response, 0, true);
        assertOrder2(response, 1, true);
        assertOrder3(response, 2, true);
        assertOrder4(response, 3, true);
    }

    @Test
    public void testGetOrdersUS() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(GET_ORDERS_US_GRAPHQL);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertEquals(3, response.getRaw("data.getOrders.size()"));
        assertOrder1(response, 0, true);
        assertOrder2(response, 1, true);
        assertOrder3(response, 2, true);
    }

    @Test
    public void testGetOrdersCA() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(GET_ORDERS_CA_GRAPHQL);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertEquals(1, response.getRaw("data.getOrders.size()"));
        assertOrder4(response, 0, true);
    }

    @Test
    public void testGetOrdersWithCustomers() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(GET_ORDERS_AND_CUSTOMERS_GRAPHQL);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertOrder1(response, 0, false);
        assertOrder2(response, 1, false);
        assertOrder3(response, 2, false);
        assertOrder4(response, 3, false);

        assertOrderItemsIsAbsent(response, 0);
        assertOrderItemsIsAbsent(response, 1);
        assertOrderItemsIsAbsent(response, 2);
        assertOrderItemsIsAbsent(response, 3);
    }

    @Test
    public void testGetOrderItems() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(GET_ORDER_ITEMS_GRAPHQL);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertEquals(1, response.getRaw("data.getOrderItems[0].orderId"));
        assertEquals(3, response.getRaw("data.getOrderItems[0].quantity"));
        assertEquals(2.97, response.getRaw("data.getOrderItems[0].amount"));
        assertEquals("1", response.getRaw("data.getOrderItems[0].item.id"));
        assertEquals("A101", response.getRaw("data.getOrderItems[0].item.sku"));
        assertEquals("A tooth brush", response.getRaw("data.getOrderItems[0].item.description"));
        assertEquals(0.99, response.getRaw("data.getOrderItems[0].item.price"));

        assertEquals(1, response.getRaw("data.getOrderItems[1].orderId"));
        assertEquals(1, response.getRaw("data.getOrderItems[1].quantity"));
        assertEquals(299.95, response.getRaw("data.getOrderItems[1].amount"));
        assertEquals("2", response.getRaw("data.getOrderItems[1].item.id"));
        assertEquals("A102", response.getRaw("data.getOrderItems[1].item.sku"));
        assertEquals("A washing machine", response.getRaw("data.getOrderItems[1].item.description"));
        assertEquals(299.95, response.getRaw("data.getOrderItems[1].item.price"));

        assertEquals(2, response.getRaw("data.getOrderItems[2].orderId"));
        assertEquals(6, response.getRaw("data.getOrderItems[2].quantity"));
        assertEquals(27.0, response.getRaw("data.getOrderItems[2].amount"));
        assertEquals("3", response.getRaw("data.getOrderItems[2].item.id"));
        assertEquals("A103", response.getRaw("data.getOrderItems[2].item.sku"));
        assertEquals("A bottle of beer", response.getRaw("data.getOrderItems[2].item.description"));
        assertEquals(4.5, response.getRaw("data.getOrderItems[2].item.price"));

        assertEquals(3, response.getRaw("data.getOrderItems[3].orderId"));
        assertEquals(1, response.getRaw("data.getOrderItems[3].quantity"));
        assertEquals(0.99, response.getRaw("data.getOrderItems[3].amount"));
        assertEquals("1", response.getRaw("data.getOrderItems[3].item.id"));
        assertEquals("A101", response.getRaw("data.getOrderItems[3].item.sku"));
        assertEquals("A tooth brush", response.getRaw("data.getOrderItems[3].item.description"));
        assertEquals(0.99, response.getRaw("data.getOrderItems[3].item.price"));

        assertEquals(3, response.getRaw("data.getOrderItems[4].orderId"));
        assertEquals(1, response.getRaw("data.getOrderItems[4].quantity"));
        assertEquals(299.95, response.getRaw("data.getOrderItems[4].amount"));
        assertEquals("2", response.getRaw("data.getOrderItems[4].item.id"));
        assertEquals("A102", response.getRaw("data.getOrderItems[4].item.sku"));
        assertEquals("A washing machine", response.getRaw("data.getOrderItems[4].item.description"));
        assertEquals(299.95, response.getRaw("data.getOrderItems[4].item.price"));

        assertEquals(3, response.getRaw("data.getOrderItems[5].orderId"));
        assertEquals(1, response.getRaw("data.getOrderItems[5].quantity"));
        assertEquals(4.5, response.getRaw("data.getOrderItems[5].amount"));
        assertEquals("3", response.getRaw("data.getOrderItems[5].item.id"));
        assertEquals("A103", response.getRaw("data.getOrderItems[5].item.sku"));
        assertEquals("A bottle of beer", response.getRaw("data.getOrderItems[5].item.description"));
        assertEquals(4.5, response.getRaw("data.getOrderItems[5].item.price"));

        assertEquals(4, response.getRaw("data.getOrderItems[6].orderId"));
        assertEquals(12, response.getRaw("data.getOrderItems[6].quantity"));
        assertEquals(54.0, response.getRaw("data.getOrderItems[6].amount"));
        assertEquals("3", response.getRaw("data.getOrderItems[6].item.id"));
        assertEquals("A103", response.getRaw("data.getOrderItems[6].item.sku"));
        assertEquals("A bottle of beer", response.getRaw("data.getOrderItems[6].item.description"));
        assertEquals(4.5, response.getRaw("data.getOrderItems[6].item.price"));
    }

    private void assertOrder1(GraphQLResponse response, int orderIndex, boolean isOrderItemIncluded) {
        assertEquals("1", response.getRaw(String.format("data.getOrders[%s].id", orderIndex)));
        assertEquals("1", response.getRaw(String.format("data.getOrders[%s].user.id", orderIndex)));
        assertEquals("Alice", response.getRaw(String.format("data.getOrders[%s].user.name", orderIndex)));
        assertEquals("alice@example.com", response.getRaw(String.format("data.getOrders[%s].user.email", orderIndex)));
        assertEquals("US", response.getRaw(String.format("data.getOrders[%s].user.country", orderIndex)));
        assertEquals(302.92, response.getRaw(String.format("data.getOrders[%s].total", orderIndex)));

        if (isOrderItemIncluded) {
            assertEquals(2, response.getRaw(String.format("data.getOrders[%s].orderItems.size()", orderIndex)));

            assertEquals(3, response.getRaw(String.format("data.getOrders[%s].orderItems[0].quantity", orderIndex)));
            assertEquals(2.97, response.getRaw(String.format("data.getOrders[%s].orderItems[0].amount", orderIndex)));
            assertItem1(response, orderIndex, 0);

            assertEquals(1, response.getRaw(String.format("data.getOrders[%s].orderItems[1].quantity", orderIndex)));
            assertEquals(299.95, response.getRaw(String.format("data.getOrders[%s].orderItems[1].amount", orderIndex)));
            assertItem2(response, orderIndex, 1);
        }
    }

    private void assertOrder2(GraphQLResponse response, int orderIndex, boolean isOrderItemIncluded) {
        assertEquals("2", response.getRaw(String.format("data.getOrders[%s].id", orderIndex)));
        assertEquals("1", response.getRaw(String.format("data.getOrders[%s].user.id", orderIndex)));
        assertEquals("Alice", response.getRaw(String.format("data.getOrders[%s].user.name", orderIndex)));
        assertEquals("alice@example.com", response.getRaw(String.format("data.getOrders[%s].user.email", orderIndex)));
        assertEquals("US", response.getRaw(String.format("data.getOrders[%s].user.country", orderIndex)));
        assertEquals(27.0, response.getRaw(String.format("data.getOrders[%s].total", orderIndex)));

        if (isOrderItemIncluded) {
            assertEquals(1, response.getRaw(String.format("data.getOrders[%s].orderItems.size()", orderIndex)));
            assertEquals(6, response.getRaw(String.format("data.getOrders[%s].orderItems[0].quantity", orderIndex)));
            assertEquals(27.0, response.getRaw(String.format("data.getOrders[%s].orderItems[0].amount", orderIndex)));
            assertItem3(response, orderIndex, 0);
        }
    }

    private void assertOrder3(GraphQLResponse response, int orderIndex, boolean isOrderItemIncluded) {
        assertEquals("3", response.getRaw(String.format("data.getOrders[%s].id", orderIndex)));
        assertEquals("2", response.getRaw(String.format("data.getOrders[%s].user.id", orderIndex)));
        assertEquals("Bob", response.getRaw(String.format("data.getOrders[%s].user.name", orderIndex)));
        assertEquals("bob@example.com", response.getRaw(String.format("data.getOrders[%s].user.email", orderIndex)));
        assertEquals("US", response.getRaw(String.format("data.getOrders[%s].user.country", orderIndex)));
        assertEquals(305.44, response.getRaw(String.format("data.getOrders[%s].total", orderIndex)));

        if (isOrderItemIncluded) {
            assertEquals(3, response.getRaw(String.format("data.getOrders[%s].orderItems.size()", orderIndex)));

            assertEquals(1, response.getRaw(String.format("data.getOrders[%s].orderItems[0].quantity", orderIndex)));
            assertEquals(0.99, response.getRaw(String.format("data.getOrders[%s].orderItems[0].amount", orderIndex)));
            assertItem1(response, orderIndex, 0);

            assertEquals(1, response.getRaw(String.format("data.getOrders[%s].orderItems[1].quantity", orderIndex)));
            assertEquals(299.95, response.getRaw(String.format("data.getOrders[%s].orderItems[1].amount", orderIndex)));
            assertItem2(response, orderIndex, 1);

            assertEquals(1, response.getRaw(String.format("data.getOrders[%s].orderItems[2].quantity", orderIndex)));
            assertEquals(4.5, response.getRaw(String.format("data.getOrders[%s].orderItems[2].amount", orderIndex)));
            assertItem3(response, orderIndex, 2);
        }
    }

    private void assertOrder4(GraphQLResponse response, int orderIndex, boolean isOrderItemIncluded) {
        assertEquals("4", response.getRaw(String.format("data.getOrders[%s].id", orderIndex)));
        assertEquals("3", response.getRaw(String.format("data.getOrders[%s].user.id", orderIndex)));
        assertEquals("Charlie", response.getRaw(String.format("data.getOrders[%s].user.name", orderIndex)));
        assertEquals("charlie@example.com", response.getRaw(String.format("data.getOrders[%s].user.email", orderIndex)));
        assertEquals("CA", response.getRaw(String.format("data.getOrders[%s].user.country", orderIndex)));
        assertEquals(54.0, response.getRaw(String.format("data.getOrders[%s].total", orderIndex)));

        if (isOrderItemIncluded) {
            assertEquals(1, response.getRaw(String.format("data.getOrders[%s].orderItems.size()", orderIndex)));

            assertEquals(12, response.getRaw(String.format("data.getOrders[%s].orderItems[0].quantity", orderIndex)));
            assertEquals(54.0, response.getRaw(String.format("data.getOrders[%s].orderItems[0].amount", orderIndex)));
            assertItem3(response, orderIndex, 0);
        }
    }

    private void assertItem1(GraphQLResponse response, int orderIndex, int orderItemIndex) {
        assertEquals("1", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.id", orderIndex, orderItemIndex)));
        assertEquals("A101", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.sku", orderIndex, orderItemIndex)));
        assertEquals("A tooth brush", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.description", orderIndex, orderItemIndex)));
        assertEquals(0.99, response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.price", orderIndex, orderItemIndex)));
    }

    private void assertItem2(GraphQLResponse response, int orderIndex, int orderItemIndex) {
        assertEquals("2", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.id", orderIndex, orderItemIndex)));
        assertEquals("A102", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.sku", orderIndex, orderItemIndex)));
        assertEquals("A washing machine", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.description", orderIndex, orderItemIndex)));
        assertEquals(299.95, response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.price", orderIndex, orderItemIndex)));
    }

    private void assertItem3(GraphQLResponse response, int orderIndex, int orderItemIndex) {
        assertEquals("3", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.id", orderIndex, orderItemIndex)));
        assertEquals("A103", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.sku", orderIndex, orderItemIndex)));
        assertEquals("A bottle of beer", response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.description", orderIndex, orderItemIndex)));
        assertEquals(4.5, response.getRaw(String.format("data.getOrders[%s].orderItems[%s].item.price", orderIndex, orderItemIndex)));
    }

    private void assertOrderItemsIsAbsent(GraphQLResponse response, int orderIndex) {
        try {
            response.getRaw(String.format("data.getOrders[%s].orderItems", orderIndex));
            fail();
        } catch (PathNotFoundException e) {
            assertTrue(e.getMessage().contains("No results for path"), e.getMessage());
        }
    }
}
