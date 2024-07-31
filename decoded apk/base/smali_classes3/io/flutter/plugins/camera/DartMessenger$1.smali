.class Lio/flutter/plugins/camera/DartMessenger$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/DartMessenger;->sendDeviceOrientationChangeEvent(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/DartMessenger;

.field final synthetic val$orientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/DartMessenger$1;->this$0:Lio/flutter/plugins/camera/DartMessenger;

    iput-object p2, p0, Lio/flutter/plugins/camera/DartMessenger$1;->val$orientation:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "orientation"

    invoke-static {p2}, Lio/flutter/plugins/camera/CameraUtils;->serializeDeviceOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
