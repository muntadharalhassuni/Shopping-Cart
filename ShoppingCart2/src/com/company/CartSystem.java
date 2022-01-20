package com.company;

import java.util.Set;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CartSystem extends TheSystem {
    CartSystem() {
    }
    //why is it printing out twice for display requirement #4
    @Override
    public void display() {
        Set<String> keySet = getItemCollection().keySet();
        DecimalFormat decFor = new DecimalFormat();
        decFor.setMaximumFractionDigits(2);
        decFor.setMinimumFractionDigits(2);
        System.out.println("Cart:");
        System.out.println("Name                 Description          Price      Quantity   Sub Total ");
        Double preTax = 0.0;
        Double tax = 0.0;
        Double total = 0.0;
        for (String string : keySet )
        {
            StringBuilder stringBuilder = new StringBuilder();
            Double subTotal = getItemCollection().get(string).getItemPrice()*getItemCollection().get(string).getQuantity();
            preTax = preTax + subTotal;

            stringBuilder.append(getItemCollection().get(string).getItemName()).append(blankSpaceBuilder(20-getItemCollection().get(string).getItemName().length()));
            stringBuilder.append(getItemCollection().get(string).getItemDesc()).append(blankSpaceBuilder(20-getItemCollection().get(string).getItemDesc().length()));
            stringBuilder.append(decFor.format(getItemCollection().get(string).getItemPrice())).append(blankSpaceBuilder(10-decFor.format(getItemCollection().get(string).getItemPrice()).length()));
            stringBuilder.append(getItemCollection().get(string).getQuantity()).append(blankSpaceBuilder(10-getItemCollection().get(string).getQuantity().toString().length()));
            stringBuilder.append(decFor.format(subTotal)).append(blankSpaceBuilder(10 - decFor.format(subTotal).toString().length()));
            System.out.println(stringBuilder);
        }
        tax = preTax * .05;
        total = preTax + tax;
        System.out.println("Pre-tax Total "+blankSpaceBuilder(7) + decFor.format(preTax) +blankSpaceBuilder(20-decFor.format(preTax).toString().length()) );
        System.out.println("Tax "+blankSpaceBuilder(17) + decFor.format(tax) +blankSpaceBuilder(20-decFor.format(tax).toString().length()) );
        System.out.println("Total "+blankSpaceBuilder(15) + decFor.format(total) + blankSpaceBuilder(20-decFor.format(total).toString().length()) );

    }
    private String blankSpaceBuilder (int wSpaceB)
    {
        StringBuffer blankSpace = new StringBuffer();

        for (int i = 0; i < wSpaceB; i++) {
            blankSpace.append(" ");
        }
        return blankSpace.toString();
    }
}
