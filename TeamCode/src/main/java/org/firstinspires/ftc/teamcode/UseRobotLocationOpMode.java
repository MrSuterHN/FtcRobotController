package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocationPractice robotLocationPractice = new RobotLocationPractice(0, 0, 0);

    @Override
    public void init(){
        telemetry.addData("Status", "Initialized");
        robotLocationPractice.setAngle(0);
        robotLocationPractice.setX(0);
        robotLocationPractice.setY(0);
    }

    @Override
    public void loop(){
        telemetry.addData("Status", "loop");
        if (gamepad1.a) {
            robotLocationPractice.turnRobot(0.1);
        }
        else if (gamepad1.b) {
            robotLocationPractice.turnRobot(-0.1);
        }



        if (gamepad1.dpad_left) {
            robotLocationPractice.changeX(0.1);
        } else if (gamepad1.dpad_right) {
            robotLocationPractice.changeX(-0.1);
        }

        if (gamepad1.dpad_up) {
            robotLocationPractice.changeY(-0.1);
        } else if (gamepad1.dpad_down) {
            robotLocationPractice.changeY(0.1);
        }

        telemetry.addData("Heading", robotLocationPractice.getHeading());
        telemetry.addData("Angle", robotLocationPractice.getAngle());
        telemetry.addData("x", robotLocationPractice.getX());
        telemetry.addData("y", robotLocationPractice.getY());

    }


}

/*
1. Add a double getAngle to your RobotLocationPractice, and display this in your opmode
2. inside your RobotLocationPractice class,
- create a double x
- double get(x)
- void changeX(double changeAmount)
- setX(double x)

3. Inside your opmode
- when left dpad pressed + 0.1 to x
- when right dpad pressed - 0.1 to x
- telemetry, display x value

4. add in support for y as well.
-dpad up -0.1
-dpad down 0.1
 */