package com.kodilla.good.patterns.challenges.DiamondStore;

public class ShoppingProcessor {
    private InformationSystem informationSystem;
    private ShoppingRepository shoppingRepository;
    private ShoppingService shoppingService;

    public ShoppingProcessor(final InformationSystem informationSystem, final ShoppingRepository shoppingRepository,
                             final ShoppingService shoppingService) {
        this.informationSystem = informationSystem;
        this.shoppingRepository = shoppingRepository;
        this.shoppingService = shoppingService;
    }

    public ShoppingDto process (final Order order) {
        boolean isBoughtSth= shoppingService.shopping(order.getUser(),order.getPrice()  );
        if (isBoughtSth) {
            informationSystem.sendMessage( order.getUser() );
            shoppingRepository.createShopping( order.getUser(), order.getPrice() );
            return new ShoppingDto( order.getUser(), true );
        }
        else return  new ShoppingDto( order.getUser(), false );
        }
    }
