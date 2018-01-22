package week6.object;

import java.util.Objects;

public class Engine implements Cloneable {

    private String type;
    private String power;

    public Engine(String type, String power) {
        this.type = type;
        this.power = power;
    }

    public Engine(Engine engine){
        type = engine.type;
        power = engine.power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(type, engine.type) &&
                Objects.equals(power, engine.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, power);
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
