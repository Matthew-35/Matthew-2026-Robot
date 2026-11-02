// Copyright (c) 2021-2026 Littleton Robotics
// http://github.com/Mechanical-Advantage
//
// Use of this source code is governed by a BSD
// license that can be found in the LICENSE file
// at the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * This class defines the runtime mode used by AdvantageKit. The mode is always "real" when running
 * on a roboRIO. Change the value of "simMode" to switch between "sim" (physics sim) and "replay"
 * (log replay from a file).
 */
public final class Constants {
  public static final Mode simMode = Mode.SIM;
  public static final Mode currentMode = RobotBase.isReal() ? Mode.REAL : simMode;

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }

  // Intake (copied from original code)
  public static final int INTAKE_PIVOT = 14;
  public static final int INTAKE_ROLLER_MAIN_LEFT = 15;
  public static final int INTAKE_ROLLER_FOLLOWER_RIGHT = 18;
  public static final int INTAKE_INNER_ROLLER = 16;
  public static final double INTAKE_PIVOT_MOTOR_ROTATIONS_TO_ROTATIONS =
      (28.0 / 12.0) * (3.0) * (4.0) * (48.0 / 16.0);
  
  // Intake PID constants
  public final class PID {
    public final class IntakePivot {
      public static double maxVelocity = 50.;
      public static double maxAcceleration = 1000.;
      public static double maxJerk = 0.;
      public static double kP = 1.;
      public static double kI = 0.;
      public static double kD = 0.;
      public static double kV = 0.11;
      public static double kS = 0.;
      public static double kA = 0.;
    }
  }

}
