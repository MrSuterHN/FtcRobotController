package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchsensor; // Use a discriptive name

    public void init(HardwareMap hwMap) {
        touchsensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchsensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean isTouchSensorPressed() {
        return !touchsensor.getState();
    }

    public boolean isTouchSensorReleased(){
        return touchsensor.getState();
    }
}
