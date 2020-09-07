package kr.co.limseongkyu.babbab.domain;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1004L, "Bob zip","Seoul");

        assertThat(restaurant.getId(), CoreMatchers.is(1004L));
        assertThat(restaurant.getName(), CoreMatchers.is("Bob zip"));
        assertThat(restaurant.getAddress(), CoreMatchers.is("Seoul"));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");

        assertThat(restaurant.getInformation(), CoreMatchers.is("Bob zip in Seoul"));
    }

}