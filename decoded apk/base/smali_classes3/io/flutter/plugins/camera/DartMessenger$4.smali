.class Lio/flutter/plugins/camera/DartMessenger$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/DartMessenger;->send(Lio/flutter/plugins/camera/DartMessenger$CameraEventType;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/DartMessenger;

.field final synthetic val$args:Ljava/util/Map;

.field final synthetic val$eventType:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/DartMessenger$CameraEventType;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/camera/DartMessenger$4;->this$0:Lio/flutter/plugins/camera/DartMessenger;

    iput-object p2, p0, Lio/flutter/plugins/camera/DartMessenger$4;->val$eventType:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    iput-object p3, p0, Lio/flutter/plugins/camera/DartMessenger$4;->val$args:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/DartMessenger$4;->this$0:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v0, v0, Lio/flutter/plugins/camera/DartMessenger;->cameraChannel:Lio/flutter/plugin/common/MethodChannel;

    iget-object v1, p0, Lio/flutter/plugins/camera/DartMessenger$4;->val$eventType:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    iget-object v1, v1, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->method:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/camera/DartMessenger$4;->val$args:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
