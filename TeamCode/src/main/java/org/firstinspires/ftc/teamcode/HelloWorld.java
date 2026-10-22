package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@Autonomous
public class HelloWorld extends OpMode {


    @Override
    public void init() {
        telemetry.addData("Hello", "Mr. Suter");
    }

    @Override
    public void loop() {

    }

    // Single Line Comment
    /*
    1. Hello: World, change to Hello: Mr. Suter
    2. Run in autonomous mode
     */
}
