package frc.robot.subsystems.intake;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
   
  private CANSparkMax Intake;
  private RelativeEncoder encoder;
  private SparkMaxPIDController controller;

  public Intake(){
  
        this.intake = new CANSparkMax(Intake.kPort, CANSparkMax.IntakeType.kBrushless);
        this.encoder = this.intake.getEncoder();

        this.controller = this.intake.getPIDController();
        this.controller.setP(Intake.kP); this.controller.setI(Intake.kI); this.controller.setD(Intake.kD); this.controller.setFF(Intake.kFF);
    }

 public void setPower(double power){
        this.intake.set(power);
    }

    public double getPosition(){
        return this.encoder.getPosition();
    }
    public void setPosition(double position){
        this.controller.setReference(position, CANSparkMax.ControlType.kPosition);
    }
    public void setEncoder(double count){
        this.encoder.setPosition(count);
    }

    public double getVelocity(){
        return this.encoder.getVelocity();
    }
    public void setVelocity(double velocity){
        this.controller.setReference(velocity, CANSparkMax.ControlType.kVelocity);
    }
    public void stop() {
    this.intake.set(0);
    }
}
  
