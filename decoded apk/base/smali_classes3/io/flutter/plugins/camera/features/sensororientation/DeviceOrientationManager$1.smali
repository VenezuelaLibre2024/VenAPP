.class Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$1;->this$0:Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager$1;->this$0:Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->handleUIOrientationChange()V

    return-void
.end method
