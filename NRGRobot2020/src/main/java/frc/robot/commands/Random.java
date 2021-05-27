import frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Random extends CommandBase{

    private Drive drive;
    private float angularVelocity;

    public Random(Drive drive){
        this.drive = drive;
        angularVelocity = 0;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        drive.tankDrive(-0.1f, -angularVelocity, false);
        angularVelocity += 0.05f;
    }

    @Override
    public boolean isFinished(){
        return angularVelocity >= 1;
    }
}