package BuilderDesignPattern;

public class Computer {

// Required Parameters
    private String model;
    private String ram;
    private String os;
// optional parameters
    private boolean graphicsEnabled;
    private boolean extendableMemory;
    // 1. Private Constructor that takes only builder object to initialize computer class
    // 2. Set the parameters from the bulder object
    private Computer(ComputerBuilder builder) {
        this.model = builder.model;
        this.ram = builder.ram;
        this.os = builder.os;
        this.graphicsEnabled = builder.graphicsEnabled;
        this.extendableMemory = builder.extendableMemory;
    }

    // Only getters allowed , No setters should be available
    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public boolean isGraphicsEnabled() {
        return graphicsEnabled;
    }

    public boolean isExtendableMemory() {
        return extendableMemory;
    }

    public String toString(){
        System.out.println("--------------------------");
        System.out.println("Model:"+model+"\nRam:"+ram+"\nOS:"+os+"\ngraphicsEnabled:"+graphicsEnabled+"\nextendableMemory:"+extendableMemory);
        System.out.println("--------------------------");
        return "";
    }

    public static class ComputerBuilder{
        private String model;
        private String ram;
        private String os;

        private boolean graphicsEnabled;
        private boolean extendableMemory;

        public ComputerBuilder(String model, String ram, String os) {
            this.model = model;
            this.ram = ram;
            this.os = os;
        }
        // Stters of optional parameters only
        // Return type of these setters should be Builder object
        public ComputerBuilder setGraphicsEnabled(boolean graphicsEnabled) {
            this.graphicsEnabled = graphicsEnabled;
            return this;
        }

        public ComputerBuilder setExtendableMemory(boolean extendableMemory) {
            this.extendableMemory = extendableMemory;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
