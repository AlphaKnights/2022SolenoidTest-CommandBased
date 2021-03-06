package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LauncherSubsystem;

public class activateCompressor extends CommandBase {

  LauncherSubsystem launcherSubsystem;
  /**
   * Creates a new activateCompressor.
   */
  public activateCompressor(LauncherSubsystem launcherSubsystem) {
    this.launcherSubsystem = launcherSubsystem;
    addRequirements(launcherSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    launcherSubsystem.activateCompressor();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    launcherSubsystem.deactivateCompressor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}