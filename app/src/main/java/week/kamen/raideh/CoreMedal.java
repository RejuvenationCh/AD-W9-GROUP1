package week.kamen.raideh;

public abstract class CoreMedal {


    public enum SlotType {
        HEAD, ARMS, LEGS
    }

    public enum MedalName {
        // TODO : Make More
        Taka, Tora
    }
    
    // TODO : Make function untuk setiap head, arms, legs medla dan alokasikan itu yang di meedal name ke sana
    private final MedalName name;
    protected CoreMedal(MedalName name) {
        this.name = name;
    }

    public MedalName getName() {
        return name;
    }

    public abstract SlotType getSlotType();

    @Override
    public String toString() {
        return name.toString() + " (" + getSlotType() + ")";
    }
}