package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TeleOP_2_players", group = "")
public class FaseTeleOp2PLAYERSModindex1 extends LinearOpMode 
{
// TODO declaración de sensores, motores, servos, etc.
  private DcMotor derecho;
  private DcMotor Rot1;
  private DcMotor izquierdo;
  private DcMotor BaseR;
  private Servo degarra;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() 
  {

    derecho = hardwareMap.dcMotor.get("derecho");
    Rot1 = hardwareMap.dcMotor.get("Rot1");
    izquierdo = hardwareMap.dcMotor.get("izquierdo ");
    BaseR = hardwareMap.dcMotor.get("BaseR");
    degarra = hardwareMap.servo.get("degarra");

    derecho.setDirection(DcMotorSimple.Direction.REVERSE);
    Rot1.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) 
    {

      while (opModeIsActive()) 
      {
// TODO ---------------------------- movimientos con stick izquierdo

        derecho.setPower(gamepad1.left_stick_y / 1);
        izquierdo.setPower(gamepad1.left_stick_y / 1);

        derecho.setPower(gamepad1.left_stick_x / 2);
        izquierdo.setPower(gamepad1.left_stick_x / -2);
// TODO----------------------------  movimientos con stick derecho       

        derecho.setPower(gamepad1.right_stick_x / 2);
        izquierdo.setPower(gamepad1.right_stick_x / -2);
        Rot1.setPower(gamepad1.right_stick_y / 2);
        BaseR.setPower(gamepad1.right_stick_y / 2);
// TODO Cerrar garra
        degarra.setPosition(degarra.getPosition() + gamepad1.left_trigger / 100);
        degarra.setPosition(degarra.getPosition() + gamepad1.right_trigger / -100);
// TODO código para player 2 ----- es lo mismo pero con gamepad2
        derecho.setPower(gamepad2.left_stick_y / 1);
        izquierdo.setPower(gamepad2.left_stick_y / 1);
        derecho.setPower(gamepad2.left_stick_x / 2);
        izquierdo.setPower(gamepad2.left_stick_x / -2);
        derecho.setPower(gamepad2.right_stick_x / 2);
        izquierdo.setPower(gamepad2.right_stick_x / -2);
        Rot1.setPower(gamepad2.right_stick_y / 2);
        BaseR.setPower(gamepad2.right_stick_y / 2);

        degarra.setPosition(degarra.getPosition() + gamepad2.left_trigger / 100);
        degarra.setPosition(degarra.getPosition() + gamepad2.right_trigger / -100);
      }
    }
  }
}