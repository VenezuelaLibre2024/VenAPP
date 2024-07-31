.class Lio/flutter/plugins/camera/Camera;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/camera/Camera$HandlerThreadFactory;,
        Lio/flutter/plugins/camera/Camera$HandlerFactory;,
        Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "Camera"

.field private static final supportedImageFormats:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final applicationContext:Landroid/content/Context;

.field backgroundHandler:Landroid/os/Handler;

.field private backgroundHandlerThread:Landroid/os/HandlerThread;

.field private final cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

.field cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

.field private final cameraFeatureFactory:Lio/flutter/plugins/camera/features/CameraFeatureFactory;

.field cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

.field private cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

.field private captureFile:Ljava/io/File;

.field private captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

.field captureSession:Landroid/hardware/camera2/CameraCaptureSession;

.field private captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

.field final dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

.field private final enableAudio:Z

.field flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

.field private final flutterTexture:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field private imageFormatGroup:Ljava/lang/String;

.field imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

.field private initialCameraFacing:I

.field private mediaRecorder:Landroid/media/MediaRecorder;

.field private pausedPreview:Z

.field private pictureImageReader:Landroid/media/ImageReader;

.field previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

.field recordingVideo:Z

.field private final resolutionPreset:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

.field private videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lio/flutter/plugins/camera/Camera;->supportedImageFormats:Ljava/util/HashMap;

    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "yuv420"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "jpeg"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "nv21"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;Lio/flutter/plugins/camera/features/CameraFeatureFactory;Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->activity:Landroid/app/Activity;

    iput-boolean p7, p0, Lio/flutter/plugins/camera/Camera;->enableAudio:Z

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera;->flutterTexture:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    iput-object p4, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera;->applicationContext:Landroid/content/Context;

    iput-object p5, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    iput-object p3, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatureFactory:Lio/flutter/plugins/camera/features/CameraFeatureFactory;

    iput-object p6, p0, Lio/flutter/plugins/camera/Camera;->resolutionPreset:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    invoke-static {p3, p5, p1, p4, p6}, Lio/flutter/plugins/camera/features/CameraFeatures;->init(Lio/flutter/plugins/camera/features/CameraFeatureFactory;Lio/flutter/plugins/camera/CameraProperties;Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Lio/flutter/plugins/camera/features/CameraFeatures;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    new-instance p1, Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    const-wide/16 p2, 0xbb8

    invoke-direct {p1, p2, p3, p2, p3}, Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;-><init>(JJ)V

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    new-instance p1, Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    invoke-direct {p1}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    invoke-static {p0, p2, p1}, Lio/flutter/plugins/camera/CameraCaptureCallback;->create(Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;Lio/flutter/plugins/camera/types/CameraCaptureProperties;)Lio/flutter/plugins/camera/CameraCaptureCallback;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->startBackgroundThread()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity available!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$setExposureOffset$12(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/camera/Camera;->lambda$setFocusPoint$9(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/camera/Camera;->lambda$setExposureOffset$11(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V

    return-void
.end method

.method private closeRenderer()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/VideoRenderer;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    :cond_0
    return-void
.end method

.method private varargs createCaptureSession(ILjava/lang/Runnable;[Landroid/view/Surface;)V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    invoke-interface {v0, p1}, Lio/flutter/plugins/camera/CameraDeviceWrapper;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getResolution()Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->flutterTexture:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {v1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getPreviewSize()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getPreviewSize()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    invoke-virtual {p1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Surface;

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v3, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-static {p1, v1}, Lio/flutter/plugins/camera/CameraRegionUtils;->getCameraBoundaries(Lio/flutter/plugins/camera/CameraProperties;Landroid/hardware/camera2/CaptureRequest$Builder;)Landroid/util/Size;

    move-result-object p1

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposurePoint()Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;

    move-result-object v1

    invoke-virtual {v1, p1}, Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;->setCameraBoundaries(Landroid/util/Size;)V

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getFocusPoint()Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;

    move-result-object v1

    invoke-virtual {v1, p1}, Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;->setCameraBoundaries(Landroid/util/Size;)V

    new-instance p1, Lio/flutter/plugins/camera/Camera$2;

    invoke-direct {p1, p0, p2}, Lio/flutter/plugins/camera/Camera$2;-><init>(Lio/flutter/plugins/camera/Camera;Ljava/lang/Runnable;)V

    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsSessionConfiguration()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, v0}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(Landroid/view/Surface;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, v0}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(Landroid/view/Surface;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/camera/Camera;->createCaptureSessionWithSessionConfig(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/camera/Camera;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    :goto_2
    return-void
.end method

.method private createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-interface {v0, p1, p2, v1}, Lio/flutter/plugins/camera/CameraDeviceWrapper;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    return-void
.end method

.method private createCaptureSessionWithSessionConfig(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    new-instance v1, Landroid/hardware/camera2/params/SessionConfiguration;

    const/4 v2, 0x0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-direct {v1, v2, p1, v3, p2}, Landroid/hardware/camera2/params/SessionConfiguration;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    invoke-interface {v0, v1}, Lio/flutter/plugins/camera/CameraDeviceWrapper;->createCaptureSession(Landroid/hardware/camera2/params/SessionConfiguration;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/camera/Camera;->lambda$setExposureMode$5(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/camera/Camera;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$runPrecaptureSequence$1(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$setExposurePoint$8(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/camera/Camera;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$unlockAutoFocus$2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private getDefaultDisplay()Landroid/view/Display;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/camera/Camera;->lambda$setZoomLevel$13(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$setZoomLevel$14(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/camera/Camera;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$resumePreview$15(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$setExposureMode$6(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugins/camera/Camera;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->lambda$startCapture$0()V

    return-void
.end method

.method private synthetic lambda$resumePreview$15(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$runPrecaptureSequence$1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "cameraAccess"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, p2, v2}, Lio/flutter/plugins/camera/DartMessenger;->error(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setExposureMode$5(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setExposureMode$6(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string p1, "Could not set exposure mode."

    const/4 p2, 0x0

    const-string v0, "setExposureModeFailed"

    invoke-interface {p0, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setExposureOffset$11(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V
    .locals 0

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getValue()Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setExposureOffset$12(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string p1, "Could not set exposure offset."

    const/4 p2, 0x0

    const-string v0, "setExposureOffsetFailed"

    invoke-interface {p0, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setExposurePoint$7(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setExposurePoint$8(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string p1, "Could not set exposure point."

    const/4 p2, 0x0

    const-string v0, "setExposurePointFailed"

    invoke-interface {p0, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setFlashMode$3(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setFlashMode$4(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string p1, "Could not set flash mode."

    const/4 p2, 0x0

    const-string v0, "setFlashModeFailed"

    invoke-interface {p0, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setFocusPoint$10(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string p1, "Could not set focus point."

    const/4 p2, 0x0

    const-string v0, "setFocusPointFailed"

    invoke-interface {p0, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setFocusPoint$9(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setZoomLevel$13(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$setZoomLevel$14(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string p1, "Could not set zoom level."

    const/4 p2, 0x0

    const-string v0, "setZoomLevelFailed"

    invoke-interface {p0, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic lambda$startCapture$0()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    return-void
.end method

.method private synthetic lambda$unlockAutoFocus$2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lio/flutter/plugins/camera/DartMessenger;->error(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private lockAutoFocus()V
    .locals 4

    const-string v0, "lockAutoFocus"

    const-string v1, "Camera"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-nez v0, :cond_0

    const-string v0, "[unlockAutoFocus] captureSession null, returning"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic m(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/camera/Camera;->lambda$setExposurePoint$7(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic n(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$setFlashMode$4(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic o(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/camera/Camera;->lambda$setFlashMode$3(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic p(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/camera/Camera;->lambda$setFocusPoint$10(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private prepareMediaRecorder(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Camera"

    const-string v1, "prepareMediaRecorder"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->closeRenderer()V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->getLockedCaptureOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    move-result-object v0

    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsEncoderProfiles()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getRecordingProfile()Landroid/media/EncoderProfiles;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v1, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getRecordingProfile()Landroid/media/EncoderProfiles;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;-><init>(Landroid/media/EncoderProfiles;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v1, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getRecordingProfileLegacy()Landroid/media/CamcorderProfile;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;-><init>(Landroid/media/CamcorderProfile;Ljava/lang/String;)V

    :goto_0
    iget-boolean p1, p0, Lio/flutter/plugins/camera/Camera;->enableAudio:Z

    invoke-virtual {v1, p1}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->setEnableAudio(Z)Lio/flutter/plugins/camera/media/MediaRecorderBuilder;

    move-result-object p1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getVideoOrientation()I

    move-result v0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getVideoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I

    move-result v0

    :goto_1
    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->setMediaOrientation(I)Lio/flutter/plugins/camera/media/MediaRecorderBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->build()Landroid/media/MediaRecorder;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    return-void
.end method

.method private prepareVideoRenderer()V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getResolution()Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/camera/Camera$6;

    invoke-direct {v1, p0}, Lio/flutter/plugins/camera/Camera$6;-><init>(Lio/flutter/plugins/camera/Camera;)V

    new-instance v2, Lio/flutter/plugins/camera/VideoRenderer;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v3}, Landroid/media/MediaRecorder;->getSurface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getCaptureSize()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getCaptureSize()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v2, v3, v4, v0, v1}, Lio/flutter/plugins/camera/VideoRenderer;-><init>(Landroid/view/Surface;IILjava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v2, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    return-void
.end method

.method private runPictureAutoFocus()V
    .locals 2

    const-string v0, "Camera"

    const-string v1, "runPictureAutoFocus"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    sget-object v1, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_FOCUS:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/camera/CameraCaptureCallback;->setCameraState(Lio/flutter/plugins/camera/CameraState;)V

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->lockAutoFocus()V

    return-void
.end method

.method private runPrecaptureSequence()V
    .locals 4

    const-string v0, "Camera"

    const-string v1, "runPrecaptureSequence"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    new-instance v0, Lio/flutter/plugins/camera/p;

    invoke-direct {v0, p0}, Lio/flutter/plugins/camera/p;-><init>(Lio/flutter/plugins/camera/Camera;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    sget-object v1, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_PRECAPTURE_START:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/camera/CameraCaptureCallback;->setCameraState(Lio/flutter/plugins/camera/CameraState;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private setStreamHandler(Lio/flutter/plugin/common/EventChannel;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/camera/Camera$5;

    invoke-direct {v0, p0}, Lio/flutter/plugins/camera/Camera$5;-><init>(Lio/flutter/plugins/camera/Camera;)V

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    return-void
.end method

.method private startCapture(ZZ)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lio/flutter/plugins/camera/o;

    invoke-direct {p1, p0}, Lio/flutter/plugins/camera/o;-><init>(Lio/flutter/plugins/camera/Camera;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/flutter/plugins/camera/media/ImageStreamReader;->getSurface()Landroid/view/Surface;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    invoke-virtual {p2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p2, 0x0

    new-array p2, p2, [Landroid/view/Surface;

    invoke-interface {v0, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroid/view/Surface;

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1, p2}, Lio/flutter/plugins/camera/Camera;->createCaptureSession(ILjava/lang/Runnable;[Landroid/view/Surface;)V

    return-void
.end method

.method private startPreviewWithVideoRendererStream()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->getLockedCaptureOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getVideoOrientation()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getVideoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v1}, Lio/flutter/plugins/camera/CameraProperties;->getLensFacing()I

    move-result v1

    iget v3, p0, Lio/flutter/plugins/camera/Camera;->initialCameraFacing:I

    if-eq v1, v3, :cond_3

    add-int/lit16 v0, v0, 0xb4

    rem-int/lit16 v0, v0, 0x168

    :cond_3
    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/camera/VideoRenderer;->setRotation(I)V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/Surface;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->videoRenderer:Lio/flutter/plugins/camera/VideoRenderer;

    invoke-virtual {v1}, Lio/flutter/plugins/camera/VideoRenderer;->getInputSurface()Landroid/view/Surface;

    move-result-object v1

    aput-object v1, v0, v2

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lio/flutter/plugins/camera/Camera;->createCaptureSession(I[Landroid/view/Surface;)V

    return-void
.end method

.method private startRegularPreview()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Camera"

    const-string v1, "startPreview"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    new-array v1, v0, [Landroid/view/Surface;

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    invoke-virtual {v2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lio/flutter/plugins/camera/Camera;->createCaptureSession(I[Landroid/view/Surface;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private stopAndReleaseCamera()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraDeviceWrapper;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->closeCaptureSession()V

    :goto_0
    return-void
.end method

.method private takePictureAfterPrecapture()V
    .locals 7

    const-string v0, "cameraAccess"

    const-string v1, "captureStillPicture"

    const-string v2, "Camera"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    sget-object v3, Lio/flutter/plugins/camera/CameraState;->STATE_CAPTURING:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {v1, v3}, Lio/flutter/plugins/camera/CameraCaptureCallback;->setCameraState(Lio/flutter/plugins/camera/CameraState;)V

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x2

    const/4 v4, 0x0

    :try_start_0
    invoke-interface {v1, v3}, Lio/flutter/plugins/camera/CameraDeviceWrapper;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v1
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    invoke-virtual {v3}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v5, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v5, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    invoke-virtual {v1, v3, v5}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lio/flutter/plugins/camera/Camera;->updateBuilderSettings(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v3}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v3

    invoke-virtual {v3}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->getLockedCaptureOrientation()Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;

    move-result-object v3

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v3

    invoke-virtual {v3}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getPhotoOrientation()I

    move-result v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v6

    invoke-virtual {v6, v3}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->getPhotoOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)I

    move-result v3

    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v5, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    new-instance v3, Lio/flutter/plugins/camera/Camera$3;

    invoke-direct {v3, p0}, Lio/flutter/plugins/camera/Camera$3;-><init>(Lio/flutter/plugins/camera/Camera;)V

    :try_start_1
    const-string v5, "sending capture request"

    invoke-static {v2, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v5, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v2, v1, v3, v5}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v0, v1, v4}, Lio/flutter/plugins/camera/DartMessenger;->error(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void

    :catch_1
    move-exception v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v0, v1, v4}, Lio/flutter/plugins/camera/DartMessenger;->error(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    const-string v0, "Camera"

    const-string v1, "close"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->stopAndReleaseCamera()V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugins/camera/media/ImageStreamReader;->close()V

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    :cond_2
    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->stopBackgroundThread()V

    return-void
.end method

.method closeCaptureSession()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    const-string v0, "Camera"

    const-string v1, "closeCaptureSession"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    :cond_0
    return-void
.end method

.method varargs createCaptureSession(I[Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lio/flutter/plugins/camera/Camera;->createCaptureSession(ILjava/lang/Runnable;[Landroid/view/Surface;)V

    return-void
.end method

.method public dispose()V
    .locals 2

    const-string v0, "Camera"

    const-string v1, "dispose"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->close()V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->flutterTexture:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->release()V

    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;->stop()V

    return-void
.end method

.method getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->getDeviceOrientationManager()Lio/flutter/plugins/camera/features/sensororientation/DeviceOrientationManager;

    move-result-object v0

    return-object v0
.end method

.method public getExposureOffsetStepSize()D
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposureOffset()Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getExposureOffsetStepSize()D

    move-result-wide v0

    return-wide v0
.end method

.method public getMaxExposureOffset()D
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposureOffset()Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getMaxExposureOffset()D

    move-result-wide v0

    return-wide v0
.end method

.method public getMaxZoomLevel()F
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getZoomLevel()Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;->getMaximumZoomLevel()F

    move-result v0

    return v0
.end method

.method public getMinExposureOffset()D
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposureOffset()Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getMinExposureOffset()D

    move-result-wide v0

    return-wide v0
.end method

.method public getMinZoomLevel()F
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getZoomLevel()Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;->getMinimumZoomLevel()F

    move-result v0

    return v0
.end method

.method getRecordingProfile()Landroid/media/EncoderProfiles;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getResolution()Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getRecordingProfile()Landroid/media/EncoderProfiles;

    move-result-object v0

    return-object v0
.end method

.method getRecordingProfileLegacy()Landroid/media/CamcorderProfile;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getResolution()Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getRecordingProfileLegacy()Landroid/media/CamcorderProfile;

    move-result-object v0

    return-object v0
.end method

.method public lockCaptureOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->lockCaptureOrientation(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$DeviceOrientation;)V

    return-void
.end method

.method public onConverged()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->takePictureAfterPrecapture()V

    return-void
.end method

.method public onImageAvailable(Landroid/media/ImageReader;)V
    .locals 4

    const-string v0, "Camera"

    const-string v1, "onImageAvailable"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    new-instance v1, Lio/flutter/plugins/camera/ImageSaver;

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;

    new-instance v3, Lio/flutter/plugins/camera/Camera$4;

    invoke-direct {v3, p0}, Lio/flutter/plugins/camera/Camera$4;-><init>(Lio/flutter/plugins/camera/Camera;)V

    invoke-direct {v1, p1, v2, v3}, Lio/flutter/plugins/camera/ImageSaver;-><init>(Landroid/media/Image;Ljava/io/File;Lio/flutter/plugins/camera/ImageSaver$Callback;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    sget-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/CameraCaptureCallback;->setCameraState(Lio/flutter/plugins/camera/CameraState;)V

    return-void
.end method

.method public onPrecapture()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->runPrecaptureSequence()V

    return-void
.end method

.method public open(Ljava/lang/String;)V
    .locals 5

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->imageFormatGroup:Ljava/lang/String;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getResolution()Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->checkIsSupported()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera with name \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v1}, Lio/flutter/plugins/camera/CameraProperties;->getCameraName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\" is not supported by this plugin."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getCaptureSize()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getCaptureSize()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/16 v3, 0x100

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    sget-object v1, Lio/flutter/plugins/camera/Camera;->supportedImageFormats:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    const-string p1, "Camera"

    const-string v1, "The selected imageFormatGroup is not supported by Android. Defaulting to yuv420"

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x23

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_1
    new-instance v1, Lio/flutter/plugins/camera/media/ImageStreamReader;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getPreviewSize()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getPreviewSize()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v1, v2, v3, p1, v4}, Lio/flutter/plugins/camera/media/ImageStreamReader;-><init>(IIII)V

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->activity:Landroid/app/Activity;

    invoke-static {p1}, Lio/flutter/plugins/camera/CameraUtils;->getCameraManager(Landroid/content/Context;)Landroid/hardware/camera2/CameraManager;

    move-result-object p1

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v1}, Lio/flutter/plugins/camera/CameraProperties;->getCameraName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/camera/Camera$1;

    invoke-direct {v2, p0, v0}, Lio/flutter/plugins/camera/Camera$1;-><init>(Lio/flutter/plugins/camera/Camera;Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {p1, v1, v2, v0}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V

    return-void
.end method

.method public pausePreview()V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->pausedPreview:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->pausedPreview:Z

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    :cond_0
    return-void
.end method

.method public pauseVideoRecording(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "videoRecordingFailed"

    iget-boolean v1, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsVideoPause()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->pause()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_1
    const-string v1, "pauseVideoRecording requires Android API +24."

    invoke-interface {p1, v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method prepareRecording(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->applicationContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "REC"

    const-string v3, ".mp4"

    invoke-static {v2, v3, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/camera/Camera;->prepareMediaRecorder(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatureFactory:Lio/flutter/plugins/camera/features/CameraFeatureFactory;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createAutoFocusFeature(Lio/flutter/plugins/camera/CameraProperties;Z)Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->setAutoFocus(Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;)V

    return-void

    :catch_0
    move-exception v0

    const/4 v2, 0x0

    iput-boolean v2, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;

    const-string v2, "videoRecordingFailed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    const-string v2, "cannotCreateFile"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V
    .locals 5

    const-string v0, "cameraAccess"

    const-string v1, "refreshPreviewCaptureSession"

    const-string v2, "Camera"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-nez v1, :cond_0

    const-string p1, "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh."

    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    iget-boolean v2, p0, Lio/flutter/plugins/camera/Camera;->pausedPreview:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    iget-object v4, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v1, v2, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Camera is closed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-interface {p2, v0, p1}, Lio/flutter/plugins/camera/ErrorCallback;->onError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public resumePreview()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->pausedPreview:Z

    new-instance v0, Lio/flutter/plugins/camera/f;

    invoke-direct {v0, p0}, Lio/flutter/plugins/camera/f;-><init>(Lio/flutter/plugins/camera/Camera;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void
.end method

.method public resumeVideoRecording(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "videoRecordingFailed"

    iget-boolean v1, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsVideoPause()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->resume()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_1
    const-string v1, "resumeVideoRecording requires Android API +24."

    invoke-interface {p1, v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setDescriptionWhileRecording(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 6

    iget-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    const-string v1, "setDescriptionWhileRecordingFailed"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string p2, "Device was not recording"

    :goto_0
    invoke-interface {p1, v1, p2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsEglRecordableAndroid()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p2, "Device does not support switching the camera while recording"

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->stopAndReleaseCamera()V

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->prepareVideoRenderer()V

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatureFactory:Lio/flutter/plugins/camera/features/CameraFeatureFactory;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->activity:Landroid/app/Activity;

    iget-object v4, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v5, p0, Lio/flutter/plugins/camera/Camera;->resolutionPreset:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    invoke-static {v0, p2, v3, v4, v5}, Lio/flutter/plugins/camera/features/CameraFeatures;->init(Lio/flutter/plugins/camera/features/CameraFeatureFactory;Lio/flutter/plugins/camera/CameraProperties;Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Lio/flutter/plugins/camera/features/CameraFeatures;

    move-result-object p2

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatureFactory:Lio/flutter/plugins/camera/features/CameraFeatureFactory;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    const/4 v4, 0x1

    invoke-interface {v0, v3, v4}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createAutoFocusFeature(Lio/flutter/plugins/camera/CameraProperties;Z)Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->setAutoFocus(Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;)V

    :try_start_0
    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->imageFormatGroup:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lio/flutter/plugins/camera/Camera;->open(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    invoke-interface {p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public setExposureMode(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposureLock()Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->setValue(Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;)V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    new-instance p2, Lio/flutter/plugins/camera/m;

    invoke-direct {p2, p1}, Lio/flutter/plugins/camera/m;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v0, Lio/flutter/plugins/camera/n;

    invoke-direct {v0, p1}, Lio/flutter/plugins/camera/n;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void
.end method

.method public setExposureOffset(Lio/flutter/plugin/common/MethodChannel$Result;D)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposureOffset()Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->setValue(Ljava/lang/Double;)V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    new-instance p2, Lio/flutter/plugins/camera/i;

    invoke-direct {p2, p1, v0}, Lio/flutter/plugins/camera/i;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V

    new-instance p3, Lio/flutter/plugins/camera/j;

    invoke-direct {p3, p1}, Lio/flutter/plugins/camera/j;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, p3}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void
.end method

.method public setExposurePoint(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/Point;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getExposurePoint()Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;->setValue(Lio/flutter/plugins/camera/features/Point;)V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    new-instance p2, Lio/flutter/plugins/camera/b;

    invoke-direct {p2, p1}, Lio/flutter/plugins/camera/b;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v0, Lio/flutter/plugins/camera/c;

    invoke-direct {v0, p1}, Lio/flutter/plugins/camera/c;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void
.end method

.method public setFlashMode(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/flash/FlashMode;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getFlash()Lio/flutter/plugins/camera/features/flash/FlashFeature;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/flash/FlashFeature;->setValue(Lio/flutter/plugins/camera/features/flash/FlashMode;)V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/flash/FlashFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    new-instance p2, Lio/flutter/plugins/camera/a;

    invoke-direct {p2, p1}, Lio/flutter/plugins/camera/a;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v0, Lio/flutter/plugins/camera/h;

    invoke-direct {v0, p1}, Lio/flutter/plugins/camera/h;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void
.end method

.method public setFocusMode(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/autofocus/FocusMode;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getAutoFocus()Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->setValue(Lio/flutter/plugins/camera/features/autofocus/FocusMode;)V

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    iget-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->pausedPreview:Z

    const/4 v1, 0x0

    if-nez v0, :cond_4

    sget-object v0, Lio/flutter/plugins/camera/Camera$7;->$SwitchMap$io$flutter$plugins$camera$features$autofocus$FocusMode:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->unlockAutoFocus()V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-nez p2, :cond_2

    const-string p1, "Camera"

    const-string p2, "[unlockAutoFocus] captureSession null, returning"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->lockAutoFocus()V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :try_start_0
    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {p2, v0, v1, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    if-eqz p1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error setting focus mode: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "setFocusModeFailed"

    invoke-interface {p1, v0, p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    return-void

    :cond_4
    :goto_0
    if-eqz p1, :cond_5

    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public setFocusPoint(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/Point;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getFocusPoint()Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;->setValue(Lio/flutter/plugins/camera/features/Point;)V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    new-instance p2, Lio/flutter/plugins/camera/d;

    invoke-direct {p2, p1}, Lio/flutter/plugins/camera/d;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v0, Lio/flutter/plugins/camera/e;

    invoke-direct {v0, p1}, Lio/flutter/plugins/camera/e;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getAutoFocus()Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->getValue()Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Lio/flutter/plugins/camera/Camera;->setFocusMode(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/autofocus/FocusMode;)V

    return-void
.end method

.method setImageStreamImageAvailableListener(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->imageStreamReader:Lio/flutter/plugins/camera/media/ImageStreamReader;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1, v2}, Lio/flutter/plugins/camera/media/ImageStreamReader;->subscribeListener(Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/os/Handler;)V

    return-void
.end method

.method public setZoomLevel(Lio/flutter/plugin/common/MethodChannel$Result;F)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getZoomLevel()Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;->getMaximumZoomLevel()F

    move-result v1

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;->getMinimumZoomLevel()F

    move-result v2

    cmpl-float v3, p2, v1

    if-gtz v3, :cond_1

    cmpg-float v3, p2, v2

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;->setValue(Ljava/lang/Float;)V

    iget-object p2, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    new-instance p2, Lio/flutter/plugins/camera/k;

    invoke-direct {p2, p1}, Lio/flutter/plugins/camera/k;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v0, Lio/flutter/plugins/camera/l;

    invoke-direct {v0, p1}, Lio/flutter/plugins/camera/l;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void

    :cond_1
    :goto_0
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v3

    const/4 v2, 0x1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "Zoom level out of bounds (zoom level should be between %f and %f)."

    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "ZOOM_ERROR"

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public startBackgroundThread()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandlerThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "CameraBackground"

    invoke-static {v0}, Lio/flutter/plugins/camera/Camera$HandlerThreadFactory;->create(Ljava/lang/String;)Landroid/os/HandlerThread;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandlerThread:Landroid/os/HandlerThread;

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/plugins/camera/Camera$HandlerFactory;->create(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    return-void
.end method

.method public startPreview()V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->startPreviewWithVideoRendererStream()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->startRegularPreview()V

    :goto_0
    return-void
.end method

.method public startPreviewWithImageStream(Lio/flutter/plugin/common/EventChannel;)V
    .locals 1

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/Camera;->setStreamHandler(Lio/flutter/plugin/common/EventChannel;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/camera/Camera;->startCapture(ZZ)V

    const-string p1, "Camera"

    const-string v0, "startPreviewWithImageStream"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public startVideoRecording(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugin/common/EventChannel;)V
    .locals 3

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/Camera;->prepareRecording(Lio/flutter/plugin/common/MethodChannel$Result;)V

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, Lio/flutter/plugins/camera/Camera;->setStreamHandler(Lio/flutter/plugin/common/EventChannel;)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getLensFacing()I

    move-result v0

    iput v0, p0, Lio/flutter/plugins/camera/Camera;->initialCameraFacing:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    move p2, v0

    goto :goto_0

    :cond_1
    move p2, v1

    :goto_0
    const/4 v2, 0x0

    :try_start_0
    invoke-direct {p0, v0, p2}, Lio/flutter/plugins/camera/Camera;->startCapture(ZZ)V

    invoke-interface {p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    iput-boolean v1, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    iput-object v2, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;

    const-string v0, "videoRecordingFailed"

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public stopBackgroundThread()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandlerThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandlerThread:Landroid/os/HandlerThread;

    iput-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    return-void
.end method

.method public stopVideoRecording(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    iget-boolean v0, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatureFactory:Lio/flutter/plugins/camera/features/CameraFeatureFactory;

    iget-object v3, p0, Lio/flutter/plugins/camera/Camera;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createAutoFocusFeature(Lio/flutter/plugins/camera/CameraProperties;Z)Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/flutter/plugins/camera/features/CameraFeatures;->setAutoFocus(Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;)V

    iput-boolean v4, p0, Lio/flutter/plugins/camera/Camera;->recordingVideo:Z

    :try_start_0
    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->closeRenderer()V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->mediaRecorder:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    :try_start_1
    invoke-virtual {p0}, Lio/flutter/plugins/camera/Camera;->startPreview()V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;

    return-void

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    :goto_0
    const-string v2, "videoRecordingFailed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public takePicture(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraCaptureCallback:Lio/flutter/plugins/camera/CameraCaptureCallback;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/CameraCaptureCallback;->getCameraState()Lio/flutter/plugins/camera/CameraState;

    move-result-object v0

    sget-object v1, Lio/flutter/plugins/camera/CameraState;->STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const-string v0, "captureAlreadyActive"

    const-string v1, "Picture is currently already being captured"

    invoke-interface {p1, v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->applicationContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    :try_start_0
    const-string v0, "CAP"

    const-string v1, ".jpg"

    invoke-static {v0, v1, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera;->captureFile:Ljava/io/File;

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->pictureImageReader:Landroid/media/ImageReader;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {p1, p0, v0}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/CameraFeatures;->getAutoFocus()Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->checkIsSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->getValue()Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    move-result-object p1

    sget-object v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->auto:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->runPictureAutoFocus()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/camera/Camera;->runPrecaptureSequence()V

    :goto_0
    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->flutterResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v3, "cannotCreateFile"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v3, p1, v2}, Lio/flutter/plugins/camera/DartMessenger;->error(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method unlockAutoFocus()V
    .locals 4

    const-string v0, "unlockAutoFocus"

    const-string v1, "Camera"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-nez v0, :cond_0

    const-string v0, "[unlockAutoFocus] captureSession null, returning"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v3, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lio/flutter/plugins/camera/g;

    invoke-direct {v0, p0}, Lio/flutter/plugins/camera/g;-><init>(Lio/flutter/plugins/camera/Camera;)V

    invoke-virtual {p0, v3, v0}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method

.method public unlockCaptureOrientation()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;->unlockCaptureOrientation()V

    return-void
.end method

.method updateBuilderSettings(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera;->cameraFeatures:Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;->getAllFeatures()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-virtual {v1, p1}, Lio/flutter/plugins/camera/features/CameraFeature;->updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    goto :goto_0

    :cond_0
    return-void
.end method
