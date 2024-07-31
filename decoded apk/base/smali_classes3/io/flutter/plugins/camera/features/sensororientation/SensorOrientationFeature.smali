.class public Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private currentSetting:Ljava/lang/Integer;

.field private final deviceOrientationListener:Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

.field private lockedCaptureOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;)V
    .locals 2

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->currentSetting:Ljava/lang/Integer;

    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraProperties;->getSensorOrientation()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->setValue(Ljava/lang/Integer;)V

    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraProperties;->getLensFacing()I

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->currentSetting:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p2, p3, v0, p1}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->create(Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;ZI)Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->deviceOrientationListener:Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->start()V

    return-void
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "SensorOrientationFeature"

    return-object v0
.end method

.method public getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->deviceOrientationListener:Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    return-object v0
.end method

.method public getLockedCaptureOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->lockedCaptureOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0
.end method

.method public getValue()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->currentSetting:Ljava/lang/Integer;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->getValue()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public lockCaptureOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->lockedCaptureOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-void
.end method

.method public setValue(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->currentSetting:Ljava/lang/Integer;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->setValue(Ljava/lang/Integer;)V

    return-void
.end method

.method public unlockCaptureOrientation()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->lockedCaptureOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 0

    return-void
.end method
