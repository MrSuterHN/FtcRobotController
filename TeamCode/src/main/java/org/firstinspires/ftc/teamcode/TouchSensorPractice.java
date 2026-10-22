package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@TeleOp
public class TouchSensorPractice extends OpMode {
    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchSensorState = "not pressed!"; // default state

        if (bench.isTouchSensorPressed()){
            touchSensorState = "pressed!";
        }
        telemetry.addData("touch sensor", touchSensorState);

    }

    /*
    1. create a new getter method in your testBench class called "isTouchSensorReleased"
    return true if the touch sensor is not being pressed.
    2. in your opmode telemetry, have telemetry state "pressed!" and "not pressed!" instead
    of true and false.
     */
}
