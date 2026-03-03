package org.firstinspires.ftc.teamcode.Testing;

import com.qualcomm.hardware.bosch.BHI260IMU;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.BNO055IMUNew;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.teamcode.Mechanics.Robot;

@TeleOp(name = "IMU Test")
public class IMUTest extends OpMode {
    private IMU imu = null;
    @Override
    public void loop() {
        telemetry.addData("imu", imu.getRobotYawPitchRollAngles());
        telemetry.update();
    }

    /** This method is called once at the init of the OpMode. **/
    @Override
    public void init() {
        Robot.init(hardwareMap);
        imu = hardwareMap.get(IMU.class, "imu");
        imu.resetYaw();
    }

    /** This method is called once at the start of the OpMode.
     * It runs all the setup actions, including building paths and starting the path system **/
    @Override
    public void start() {

    }

    /** We do not use this because everything should automatically disable **/
    @Override
    public void stop() {

    }
}
