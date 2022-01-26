// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  private TalonSRX m_rightMotorFront = new TalonSRX(3);
  private VictorSPX m_rightMotorRear = new VictorSPX(4);
  private VictorSPX m_leftMotorFront = new VictorSPX(2);
  private TalonSRX m_leftMotorRear = new TalonSRX(5);
  
  public DriveTrain() {
    m_rightMotorFront.set(ControlMode.PercentOutput,0.0);
    m_leftMotorFront.set(ControlMode.PercentOutput,0.0);
    m_leftMotorFront.setInverted(true);
    m_leftMotorFront.follow(m_leftMotorRear);
    m_rightMotorRear.follow(m_rightMotorFront);


  }

public void tankDrive(double leftY,double rightY) { 
  m_rightMotorFront.set(ControlMode.PercentOutput,rightY);
  m_leftMotorFront.set(ControlMode.PercentOutput,leftY);

}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
