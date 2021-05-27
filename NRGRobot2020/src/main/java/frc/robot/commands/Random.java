import frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Random extends CommandBase{

    private XboxController controller;
    private Drive drive;

    public Random(XboxController controller, Drive drive){
        this.controller = controller;
        this.drive = drive;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        drive.tankDrive(-controller.getY(0), -controller.getY(1), false);
    }
}