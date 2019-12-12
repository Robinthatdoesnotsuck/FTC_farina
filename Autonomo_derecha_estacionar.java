package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

// TODO -------------------------------- modo autonomo para estacionarse 
@Autonomous(name = "EstacionamientoDer ", group = "")
public class EstacionamientoDer extends LinearOpMode 
{

  private DcMotor derecho;
  private DcMotor izquierdo;

  @Override
  public void runOpMode() 
  {
    derecho = hardwareMap.dcMotor.get("derecho");
    izquierdo = hardwareMap.dcMotor.get("izquierdo ");


    waitForStart();
    if (opModeIsActive()) 
    {
      derecho.setPower(0.5);
      izquierdo.setPower(0.5);
      sleep(1000);
      derecho.setPower(-0.5);
      izquierdo.setPower(0.5);
      sleep(900);
      derecho.setPower(0.5);
      izquierdo.setPower(0.5);
      sleep(1250);
      derecho.setPower(0);
      izquierdo.setPower(0);
    }
  }
}
