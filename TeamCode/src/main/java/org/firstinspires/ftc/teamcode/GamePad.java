package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class GamePad extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
    //note; runs 50t/s

        double speedForward = -gamepad1.left_stick_y / 2.0;
        double differenceX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumRearTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", speedForward);
        telemetry.addData("x2", gamepad1.right_stick_x);
        telemetry.addData("y2", gamepad1.right_stick_y);

        telemetry.addData("a", gamepad1.a);
        telemetry.addData("b", gamepad1.b);

        telemetry.addData("Difference x", differenceX);
        telemetry.addData("Sum of rear triggers", sumRearTriggers);
    }
}
