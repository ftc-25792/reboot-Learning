package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Motor Example", group = "Examples")
public class FGHB extends LinearOpMode {
    DcMotor frontRight;
    Servo servo;
    @Override
    public void runOpMode() {

        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        servo = hardwareMap.get(Servo.class, "Servo");
        waitForStart();
        while (opModeIsActive()) {
        if (gamepad1.a) {
            frontRight.setPower(1);
        } else {
            frontRight.setPower(0);
            frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            if (gamepad1.a) frontRight.setPower(1);
            else if (gamepad1.b) frontRight.setPower(0.5);
            else if (gamepad1.y) frontRight.setPower(-0.5);

            //frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            //frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            //frontRight.setPower(1);

            }
        }
    }
}
