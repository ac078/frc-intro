package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.turret.Turret;

public class shootLow extends CommandBase{
    private Turret turret;
    private double angle;
    private double shotPower;

    public shootLow(Turret turret, double angle, double shotPower) {
        this.turret = turret;
        this.angle = angle;
        this.shotPower = shotPower;
        addRequirements(turret);
    }

    @Override
    public void execute(){
        turret.setAngle(20)
        turret.shootBall(2.0)
    }
}
