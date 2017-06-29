package com.jackman.other;

import com.jackman.other.annotationPackage.FruitColor;
import com.jackman.other.annotationPackage.FruitName;
import com.jackman.other.annotationPackage.FruitProvider;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by JackManWu on 2016/10/31.
 */
@Setter
@Getter
public class Apple {
    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "陕西红富士集团", adress = "陕西省西安市延安路89号红富士大厦")
    private String appleProvider;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("appleName: ");
        builder.append(this.appleName);
        builder.append(" ,appleColor: ");
        builder.append(this.appleColor);
        builder.append(" ,appleProvider;");
        builder.append(this.appleProvider);
        return builder.toString();
    }
}
