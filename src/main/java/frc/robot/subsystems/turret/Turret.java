package frc.robot.subsystems.turret;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Turret extends SubsystemBase {

  private CANSparkMax angleMotor;
  private CANSparkMax speedMotor;
  private RelativeEncoder angleMotorEncoder
  private SparkMaxPIDController speedMotorController;

  public Turret(){

    this.angleMotor = new CANSparkMax(Constants.Turret.kPort1, CANSparkMax.MotorType.kBrushless);
    this.speedMotor = new CANSparkMax(Constants.Turret.kPort2, CANSparkMax.MotorType.kBrushless);
    
    this.angleMotorEncoder = this.angleMotor.getEncoder();
    this.speedMotorController = this.speedMotor.getPIDController();
    this.speedMotorController.setP(Constants.Turret.kPspeed); this.speedMotorController.setI(Constants.Turret.kIspeed); this.speedMotorController.setD(Constants.Turret.kDspeed); this.speedMotorController.setFF(Constants.Turret.kFFspeed);
  }
 public void setAngle (double anglePower){
    if (this.angleMotorEncoder.getPosition < angle){
        this.angleMotor.set(0.1);
    }
    else if (this.angleMotorEncoder.getPosition > angle){
        this.angleMotor.set(-0.1);
    }
 }
public void shootBall(double shotPower){
    this.speedMotor.set(shotPower);
}

}
