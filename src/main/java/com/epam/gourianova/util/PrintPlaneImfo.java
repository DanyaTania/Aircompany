package com.epam.gourianova.util;

import com.epam.gourianova.model.Plane;

import java.util.List;

public class PrintPlaneImfo {

    public static void print(Plane plane) {
        if (plane != null) {
            System.out.println(plane.toString().replaceAll("^\\[|]$", ""));
        } else {
            System.out.println("no plane");
        }
    }

    public static void print(List<? extends Plane> planes) {
        if (planes != null) {

            planes.forEach(plane -> System.out.println(plane.toString().replaceAll("^\\[|]$", "")));
        }
        {
            System.out.println("no any plane");
        }
    }
}
