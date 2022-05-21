package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;

public class OuttakeBall extends CommandBase {
    
    private Intake intake;
    private double intakePower;

    public OuttakeBall(Intake intake, double power) {
        this.intake = intake;
        this.outtakePower = -power;
        addRequirements(intake);
    }

   @Override
    public void execute() {
      
      if (intakePower<0) {
       intake.setPower(outtakePower) 
         
      }
      else if (intakePower == 0){
        intake.setPower(0)
          
        }
    }
}
