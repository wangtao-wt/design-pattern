package com.example.service;

import com.example.design.builder.Meal;
import com.example.design.builder.MealBuilder;
import org.springframework.stereotype.Service;

/**
 * 建造者模式
 *
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候
 * 如何解决：将变与不变分离开
 * 优点：1、建造者独立，易扩展    2、便于控制细节风险
 * 缺点：1、产品必须有共同点，范围有限制  2、如内部变化复杂，会有很多的建造者
 * 使用场景：1、需要生成的对象具有复杂的内部结构  2、需要生成的对象内部属性本身相互依赖
 * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序
 *
 *
 * 实现：
 *  假设一个快餐店的商业案例，其中，一个典型的套餐可以是一个汉堡（Burger）和一杯冷饮（Cold drink）。汉堡（Burger）
 *  可以是素食汉堡（Veg Burger）或鸡肉汉堡（Chicken Burger），它们是包在纸盒中。冷饮（Cold drink）可以是可口可
 *  乐（coke）或百事可乐（pepsi），它们是装在瓶子中。我们将创建一个表示食物条目（比如汉堡和冷饮）的 Item 接口和实现
 *  Item 接口的实体类，以及一个表示食物包装的 Packing 接口和实现 Packing 接口的实体类，汉堡是包在纸盒中，冷饮是装
 *  在瓶子中。然后我们创建一个 Meal 类，带有 Item 的 ArrayList 和一个通过结合 Item 来创建不同类型的 Meal 对象的
 *  MealBuilder。BuilderPatternDemo，我们的演示类使用 MealBuilder 来创建一个 Meal。
 */
@Service
public class BuilderService {
    public void build() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }
}
