// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AlgaeArm extends SubsystemBase {
  private final SparkMax armMotor;
  /** Creates a new PickAlgae. */
  public AlgaeArm() {
    armMotor = new SparkMax(0, MotorType.kBrushed);
    SparkMaxConfig armConfig = new SparkMaxConfig();
    armConfig.idleMode(IdleMode.kBrake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
SparkMaxConfig armConfig = new SparkMaxConfig();
  public void runArm(double speed) {
    armMotor.set(0);
  }
}
