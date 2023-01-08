package edu.brain.lesson17;

class GameConsole implements Powered {
    private final BrandConsole brand;
    private String model;
    private final String serial;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(BrandConsole brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        firstGamepad = new Gamepad(brand, GamepadColor.BLACK, (byte) 1);
        secondGamepad = new Gamepad(brand, GamepadColor.PURPLE, (byte) 2);
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Game console with that serial number: " + serial + " turn on!");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Game console with that serial number: " + serial + " turn off!");
    }

    public void loadGame(Game game) {
        activeGame = game;
        firstGamepad.powerOn();
        secondGamepad.powerOn();
        System.out.println("Game " + activeGame.getName() + " is loading");
    }

    public void playGame() {
        this.checkStatus();
        if (isOn) {
            System.out.println("We are playing a " + activeGame.getName());
            Gamepad[] gamepads = {firstGamepad, secondGamepad};
            for (Gamepad gamepad : gamepads) {
                if (gamepad.isOn) {
                    if (gamepad.chargeLevel == 0.0f) {
                        gamepad.powerOff();
                        System.out.println("Game over!");
                    } else {
                        gamepad.chargeLevel -= 10.0f;
                        System.out.println("Gamepad with that console serial " + gamepad.consoleSerial + " charge level " + gamepad.chargeLevel + " is active!");
                    }
                }
            }
        }
    }

    private void checkStatus() throws ConsoleException {
        if (waitingCounter > 5) {
            this.powerOff();
            throw new ConsoleException("This Game Console shutting down due to inactivity!");
        }
        if (!firstGamepad.isOn && !secondGamepad.isOn) {
            System.out.println("Please connect a gamepad");
            waitingCounter++;
        } else {
            waitingCounter = 0;
        }
    }

    class Gamepad implements Powered {
        private BrandConsole brand;
        private String consoleSerial;
        private byte connectedNumber;
        private GamepadColor color;
        private float chargeLevel = 100.0f;
        private boolean isOn;

        public Gamepad(BrandConsole brand, GamepadColor color, byte connectedNumber) {
            this.brand = brand;
            this.color = color;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = "XC123QeWR";
        }

        @Override
        public void powerOn() {
            isOn = true;
            GameConsole.this.powerOn();
            if (!firstGamepad.isOn) {
                secondGamepad.connectedNumber = 1;
            }
            System.out.println("Gamepad with that connected number: " + connectedNumber + " turn on!");
        }

        @Override
        public void powerOff() {
            isOn = false;
            System.out.println("Gamepad with that connected number: " + connectedNumber + " turn off!");
        }
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", firstGamepad=" + firstGamepad +
                ", secondGamepad=" + secondGamepad +
                ", isOn=" + isOn +
                ", activeGame=" + activeGame +
                ", waitingCounter=" + waitingCounter +
                '}';
    }
}
