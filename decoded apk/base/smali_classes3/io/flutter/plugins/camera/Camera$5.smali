.class Lio/flutter/plugins/camera/Camera$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/Camera;->setStreamHandler(Lio/flutter/plugin/common/EventChannel;)V
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

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera$5;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$5;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v0, p1, Lio/flutter/plugins/camera/Camera;->imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/camera/media/ImageStreamReader;->removeListener(Landroid/os/Handler;)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$5;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/camera/Camera;->setImageStreamImageAvailableListener(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method
