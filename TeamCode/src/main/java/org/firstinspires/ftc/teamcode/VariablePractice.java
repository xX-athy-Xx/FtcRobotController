package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int number = 1410;
        double speed = 03.01;
        boolean closed = true;
        String name = "KCLMS Volcanix";
        int motorAngle = 67;

        telemetry.addData("Number", number);
        telemetry.addData("Speed", speed);
        telemetry.addData("Closed", closed);
        telemetry.addData("Name", name);
        telemetry.addData("motorAngle", motorAngle);

    }

    @Override
    public void loop() {
    }
}
