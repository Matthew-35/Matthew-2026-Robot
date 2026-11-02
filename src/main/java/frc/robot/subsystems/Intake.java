// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


// From what I can tell, it seems like the intake has one motor to move
// it up and down, and two motors to spin the rollers (which must be
// synchronized).


public class Intake extends SubsystemBase {
  
  private final TalonFX intakePivot = new TalonFX(Constants.INTAKE_PIVOT, CANBus.roboRIO());

  /** Creates a new Intake. */
  public Intake() {}

  public void setupMotors() {
    TalonFXConfiguration pivotConfig = new TalonFXConfiguration();
    pivotConfig.Slot0.kP = Constants.PID.IntakePivot.kP;
    pivotConfig.Slot0.kI = Constants.PID.IntakePivot.kI;
    pivotConfig.Slot0.kD = Constants.PID.IntakePivot.kD;
    pivotConfig.Slot0.kV = Constants.PID.IntakePivot.kV;
    pivotConfig.Slot0.kS = Constants.PID.IntakePivot.kS;
    pivotConfig.MotionMagic.MotionMagicCruiseVelocity =
        Constants.PID.IntakePivot.maxVelocity;
    pivotConfig.MotionMagic.MotionMagicAcceleration =
        Constants.PID.IntakePivot.maxAcceleration;
    pivotConfig.MotionMagic.MotionMagicJerk = Constants.PID.IntakePivot.maxJerk;
    pivotConfig.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;
    // TODO: Setup the roller motors, with one following the other
  }

  public void intakeUp() { // Move the intake up
  }

  public void intakeDown() { // Move the intake down
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
