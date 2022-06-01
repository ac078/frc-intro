package frc.robot;

public class Constants {
    private final static int kPort = 0;
    private final static double kP = 0;
    private final static double kI = 0;
    private final static double kD = 0;
    private final static double kFF = 0;
    
    public static final class Trajectory {
        public static final double kDistPerRot = 3.072 / 100;
    }

    public static final class Drivetrain {
        public static final double kThrottleFilter = 1.5;
        public static final double kTurnFilter = 1.5;

        public static final double kIterativeTurningAdjustment = 0.1;
        public static final double kAcceptableTurningError = 3.0;

        public static final double kSafeForwardThrottle = 0.05;
    }

    public static final class Turret {

        public static final int kPort1 = 1;
        public static final int kPort2 = 2;

        public static final double kPspeed = 0;
        public static final double kIspeed = 0;
        public static final double kDspeed = 0;
        public static final double kFFspeed = 0;

    }
}
