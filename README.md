## Clean Code Principles

Our RPG Alchemy System follows five Clean Code principles:

1. **Meaningful Names:** Classes and methods have clear names such as `RecipeBook`, `IngredientStorage`, and `brewPotion()`, making their purposes easy to understand.

2. **Single Responsibility Principle:** Each class has one responsibility. For example, `PotionBrewer` creates potions, while `PotionInventory` stores them. `AlchemyFacade` only coordinates the subsystems.

3. **Encapsulation:** Internal subsystem objects are declared private. The client interacts with the system through the simplified public API of `AlchemyFacade`.

4. **Small and Focused Methods:** Methods such as `getRecipe()`, `hasIngredients()`, and `addPotion()` perform specific tasks, making the code easier to read and maintain.

5. **Proper Error Handling:** The system uses exceptions and validation to handle unknown recipes and insufficient ingredients without crashing the application.
