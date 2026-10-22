package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a; // press TRUE, depress FALSE
        double leftY = gamepad1.left_stick_y;
        double motorSpeed = gamepad1.left_stick_y;

        if (!aButton) {
            motorSpeed *= 0.5;
        }

        telemetry.addData("Left Stick Y", leftY);
        telemetry.addData("Motor Speed", motorSpeed);

    }

    /*
    1. Turbo button. If the a button is not pressed, multiply the motor speed by 0.5, otherwise use the standard speed


     */
}
