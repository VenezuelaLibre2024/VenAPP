.class public Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final orientationIntentFilter:Landroid/content/IntentFilter;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private broadcastReceiver:Landroid/content/BroadcastReceiver;

.field private final isFrontFacing:Z

.field private lastOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

.field private final messenger:Lio/flutter/plugins/camera/DartMessenger;

.field private final sensorOrientation:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->orientationIntentFilter:Landroid/content/IntentFilter;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    iput-object p2, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->messenger:Lio/flutter/plugins/camera/DartMessenger;

    iput-boolean p3, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->isFrontFacing:Z

    iput p4, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->sensorOrientation:I

    return-void
.end method

.method public static create(Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;ZI)Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;
    .locals 1

    new-instance v0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    invoke-direct {v0, p0, p1, p2, p3}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;-><init>(Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;ZI)V

    return-object v0
.end method

.method static handleOrientationChange(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;Lio/flutter/plugins/camera/DartMessenger;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2, p0}, Lio/flutter/plugins/camera/DartMessenger;->sendDeviceOrientationChangeEvent(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)V

    :cond_0
    return-void
.end method


# virtual methods
.method calculateSensorOrientation(I)Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;
    .locals 4

    add-int/lit8 p1, p1, 0x2d

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getDeviceDefaultOrientation()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    add-int/lit8 p1, p1, 0x5a

    :cond_0
    rem-int/lit16 p1, p1, 0x168

    const/4 v0, 0x4

    new-array v0, v0, [Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    const/4 v2, 0x0

    sget-object v3, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->PORTRAIT_UP:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    aput-object v3, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->LANDSCAPE_LEFT:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    aput-object v3, v0, v2

    sget-object v2, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->PORTRAIT_DOWN:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->LANDSCAPE_RIGHT:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    aput-object v2, v0, v1

    div-int/lit8 p1, p1, 0x5a

    aget-object p1, v0, p1

    return-object p1
.end method

.method getDeviceDefaultOrientation()I
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget v3, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v3, v2, :cond_4

    :cond_1
    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v4, 0x3

    if-ne v1, v4, :cond_3

    :cond_2
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v3, :cond_3

    goto :goto_0

    :cond_3
    return v3

    :cond_4
    :goto_0
    return v2
.end method

.method getDisplay()Landroid/view/Display;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public getLastUIOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->lastOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0
.end method

.method public getPhotoOrientation()I
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->lastOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    invoke-virtual {p0, v0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getPhotoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I

    move-result v0

    return v0
.end method

.method public getPhotoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getUIOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    move-result-object p1

    :cond_0
    sget-object v0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$2;->$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/16 v1, 0x10e

    if-eq p1, v0, :cond_6

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    const/16 v2, 0xb4

    const/4 v3, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    goto :goto_2

    :cond_1
    iget-boolean p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->isFrontFacing:Z

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_2
    iget-boolean p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->isFrontFacing:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move v2, v3

    :cond_4
    :goto_1
    move v3, v2

    goto :goto_2

    :cond_5
    move v3, v1

    goto :goto_2

    :cond_6
    const/16 v3, 0x5a

    :goto_2
    iget p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->sensorOrientation:I

    add-int/2addr v3, p1

    add-int/2addr v3, v1

    rem-int/lit16 v3, v3, 0x168

    return v3
.end method

.method getUIOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;
    .locals 4

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_0

    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->PORTRAIT_UP:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0

    :cond_0
    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->LANDSCAPE_RIGHT:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0

    :cond_2
    :goto_0
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->LANDSCAPE_LEFT:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0

    :cond_3
    if-eqz v0, :cond_5

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->PORTRAIT_DOWN:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0

    :cond_5
    :goto_1
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;->PORTRAIT_UP:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-object v0
.end method

.method public getVideoOrientation()I
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->lastOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    invoke-virtual {p0, v0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getVideoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I

    move-result v0

    return v0
.end method

.method public getVideoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I
    .locals 2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getUIOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    move-result-object p1

    :cond_0
    sget-object v0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$2;->$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x5a

    goto :goto_0

    :cond_2
    const/16 v1, 0x10e

    goto :goto_0

    :cond_3
    const/16 v1, 0xb4

    :cond_4
    :goto_0
    iget-boolean p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->isFrontFacing:Z

    if-eqz p1, :cond_5

    mul-int/lit8 v1, v1, -0x1

    :cond_5
    iget p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->sensorOrientation:I

    add-int/2addr v1, p1

    add-int/lit16 v1, v1, 0x168

    rem-int/lit16 v1, v1, 0x168

    return v1
.end method

.method handleUIOrientationChange()V
    .locals 3

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getUIOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->lastOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    iget-object v2, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->messenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->handleOrientationChange(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;Lio/flutter/plugins/camera/DartMessenger;)V

    iput-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->lastOrientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    return-void
.end method

.method public start()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$1;

    invoke-direct {v0, p0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$1;-><init>(Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;)V

    iput-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    sget-object v2, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->orientationIntentFilter:Landroid/content/IntentFilter;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public stop()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method
