// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RollerSubsystem;

import java.util.function.DoubleSupplier;

// Command to run the roller with joystick inputs
public class RollerCommand extends Command {
  //private final DoubleSupplier forward;
  // private final CANRollerSubsystem rollerSubsystem;
  double reverse;
  private final RollerSubsystem rollerSubsystem;

  public RollerCommand(
      /*DoubleSupplier forward,*/ RollerSubsystem rollerSubsystem, double reverse) {
    //this.forward = forward;
    this.rollerSubsystem = rollerSubsystem;
    this.reverse = reverse;
    addRequirements(rollerSubsystem);
  }

  @Override
  public void initialize() {
  }

  // Runs every cycle while the command is scheduled (~50 times per second)
  @Override
  public void execute() {
    // Run the roller motor at the desired speed
    rollerSubsystem.runRoller(reverse/*forward.getAsDouble()*/);
  }

  // Runs each time the command ends via isFinished or being interrupted.
  @Override
  public void end(boolean isInterrupted) {
    rollerSubsystem.runRoller(0);
  }

  // Runs every cycle while the command is scheduled to check if the command is
  // finished
  @Override
  public boolean isFinished() {
    // Return false to indicate that this command never ends. It can be interrupted
    // by another command needing the same subsystem.

    return false;
  }
}
