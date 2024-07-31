.class Lio/flutter/plugins/camera/Camera$1;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/Camera;->open(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/Camera;

.field final synthetic val$resolutionFeature:Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/Camera;Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera$1;->val$resolutionFeature:Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    const-string p1, "Camera"

    const-string v0, "open | onClosed"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    const/4 v0, 0x0

    iput-object v0, p1, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/Camera;->closeCaptureSession()V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraClosingEvent()V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    const-string p1, "Camera"

    const-string v0, "open | onDisconnected"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/Camera;->close()V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    const-string v0, "The camera was disconnected."

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 1

    const-string p1, "Camera"

    const-string v0, "open | onError"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/Camera;->close()V

    const/4 p1, 0x1

    if-eq p2, p1, :cond_4

    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    const/4 p1, 0x3

    if-eq p2, p1, :cond_2

    const/4 p1, 0x4

    if-eq p2, p1, :cond_1

    const/4 p1, 0x5

    if-eq p2, p1, :cond_0

    const-string p1, "Unknown camera error"

    goto :goto_0

    :cond_0
    const-string p1, "The camera service has encountered a fatal error."

    goto :goto_0

    :cond_1
    const-string p1, "The camera device has encountered a fatal error"

    goto :goto_0

    :cond_2
    const-string p1, "The camera device could not be opened due to a device policy."

    goto :goto_0

    :cond_3
    const-string p1, "Max cameras in use"

    goto :goto_0

    :cond_4
    const-string p1, "The camera device is in use already."

    :goto_0
    iget-object p2, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p2, p2, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 8

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    new-instance v1, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;

    invoke-direct {v1, v0, p1}, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;-><init>(Lio/flutter/plugins/camera/Camera;Landroid/hardware/camera2/CameraDevice;)V

    iput-object v1, v0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    :try_start_0
    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/Camera;->startPreview()V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-boolean v0, p1, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    if-nez v0, :cond_0

    iget-object v1, p1, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->val$resolutionFeature:Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getPreviewSize()Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->val$resolutionFeature:Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getPreviewSize()Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposureLock()Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->getValue()Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    move-result-object v4

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getAutoFocus()Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->getValue()Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    move-result-object v5

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposurePoint()Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;->checkIsSupported()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getFocusPoint()Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;->checkIsSupported()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraInitializedEvent(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;Lio/flutter/plugins/camera/features/autofocus/FocusMode;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v0, v0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$1;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/Camera;->close()V

    :cond_0
    :goto_0
    return-void
.end method
