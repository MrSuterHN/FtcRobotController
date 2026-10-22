package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50xs a second
        double speedForward = -gamepad1.left_stick_y;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumOfTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("left stick x", gamepad1.left_stick_x);
        telemetry.addData("left stick y", speedForward);
        telemetry.addData("right stick x", gamepad1.right_stick_x);
        telemetry.addData("right stick y", gamepad1.right_stick_y);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("left x - right x", diffXJoysticks);
        telemetry.addData("left trigger + right trigger", sumOfTriggers);

    }

}
