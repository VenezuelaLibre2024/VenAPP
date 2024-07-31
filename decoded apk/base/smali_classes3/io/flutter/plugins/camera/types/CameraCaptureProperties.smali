.class public Lio/flutter/plugins/camera/types/CameraCaptureProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private lastLensAperture:Ljava/lang/Float;

.field private lastSensorExposureTime:Ljava/lang/Long;

.field private lastSensorSensitivity:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLastLensAperture()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->lastLensAperture:Ljava/lang/Float;

    return-object v0
.end method

.method public getLastSensorExposureTime()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->lastSensorExposureTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getLastSensorSensitivity()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->lastSensorSensitivity:Ljava/lang/Integer;

    return-object v0
.end method

.method public setLastLensAperture(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->lastLensAperture:Ljava/lang/Float;

    return-void
.end method

.method public setLastSensorExposureTime(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->lastSensorExposureTime:Ljava/lang/Long;

    return-void
.end method

.method public setLastSensorSensitivity(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->lastSensorSensitivity:Ljava/lang/Integer;

    return-void
.end method
