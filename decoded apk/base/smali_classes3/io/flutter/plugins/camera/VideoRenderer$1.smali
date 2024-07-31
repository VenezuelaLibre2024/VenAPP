.class Lio/flutter/plugins/camera/VideoRenderer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/VideoRenderer;->configureOpenGL()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/VideoRenderer;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/VideoRenderer;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer$1;->this$0:Lio/flutter/plugins/camera/VideoRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    iget-object p1, p0, Lio/flutter/plugins/camera/VideoRenderer$1;->this$0:Lio/flutter/plugins/camera/VideoRenderer;

    iget-object p1, p1, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureAvailableFrameLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer$1;->this$0:Lio/flutter/plugins/camera/VideoRenderer;

    iget-object v0, v0, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureFrameAvailable:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/flutter/plugins/camera/VideoRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Frame available before processing other frames. dropping frames"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/VideoRenderer$1;->this$0:Lio/flutter/plugins/camera/VideoRenderer;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureFrameAvailable:Ljava/lang/Boolean;

    iget-object v0, v0, Lio/flutter/plugins/camera/VideoRenderer;->surfaceTextureAvailableFrameLock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
