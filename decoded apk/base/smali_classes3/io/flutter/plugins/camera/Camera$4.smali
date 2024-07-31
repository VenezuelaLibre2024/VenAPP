.class Lio/flutter/plugins/camera/Camera$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/camera/ImageSaver$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/Camera;->onImageAvailable(Landroid/media/ImageReader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/Camera;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/Camera;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera$4;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$4;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v1, v0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v0, v0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {v1, v0, p1}, Lio/flutter/plugins/camera/DartMessenger;->finish(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$4;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v1, v0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v0, v0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, p2, v2}, Lio/flutter/plugins/camera/DartMessenger;->error(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
