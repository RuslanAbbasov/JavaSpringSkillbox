package Task4;

import org.springframework.stereotype.Component;

public class Dog4 implements Pet4 {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
