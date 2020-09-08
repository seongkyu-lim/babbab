package kr.co.limseongkyu.babbab.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository{
    private List<MenuItem> menuItems = new ArrayList<>();

    MenuItemRepositoryImpl() {
        menuItems.add(new MenuItem("donkkas"));
    }

    @Override
    public List<MenuItem> findAllByRestaurantId(Long restaurantId) {
        return menuItems;
    }
}
