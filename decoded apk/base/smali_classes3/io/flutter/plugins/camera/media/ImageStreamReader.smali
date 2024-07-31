.class public Lio/flutter/plugins/camera/media/ImageStreamReader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final dartImageFormat:I

.field private final imageReader:Landroid/media/ImageReader;

.field private final imageStreamReaderUtils:Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->dartImageFormat:I

    invoke-static {p3}, Lio/flutter/plugins/camera/media/ImageStreamReader;->computeStreamImageFormat(I)I

    move-result p3

    invoke-static {p1, p2, p3, p4}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageReader:Landroid/media/ImageReader;

    new-instance p1, Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;

    invoke-direct {p1}, Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageStreamReaderUtils:Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;

    return-void
.end method

.method public constructor <init>(Landroid/media/ImageReader;ILio/flutter/plugins/camera/media/ImageStreamReaderUtils;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageReader:Landroid/media/ImageReader;

    iput p2, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->dartImageFormat:I

    iput-object p3, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageStreamReaderUtils:Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/camera/media/ImageStreamReader;->lambda$onImageAvailable$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/camera/media/ImageStreamReader;Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/media/ImageReader;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/camera/media/ImageStreamReader;->lambda$subscribeListener$2(Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/media/ImageReader;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/IllegalStateException;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/camera/media/ImageStreamReader;->lambda$onImageAvailable$1(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/IllegalStateException;)V

    return-void
.end method

.method public static computeStreamImageFormat(I)I
    .locals 1

    const/16 v0, 0x11

    if-ne p0, v0, :cond_0

    const/16 p0, 0x23

    :cond_0
    return p0
.end method

.method private static synthetic lambda$onImageAvailable$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V
    .locals 0

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$onImageAvailable$1(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/IllegalStateException;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Caught IllegalStateException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "IllegalStateException"

    invoke-interface {p0, v1, p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic lambda$subscribeListener$2(Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/media/ImageReader;)V
    .locals 0

    invoke-virtual {p3}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;

    move-result-object p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3, p1, p2}, Lio/flutter/plugins/camera/media/ImageStreamReader;->onImageAvailable(Landroid/media/Image;Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageReader:Landroid/media/ImageReader;

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    return-void
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageReader:Landroid/media/ImageReader;

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public onImageAvailable(Landroid/media/Image;Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget v1, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->dartImageFormat:I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x11

    const-string v3, "planes"

    if-ne v1, v2, :cond_0

    :try_start_1
    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/media/ImageStreamReader;->parsePlanesForNv21(Landroid/media/Image;)Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/media/ImageStreamReader;->parsePlanesForYuvOrJpeg(Landroid/media/Image;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :goto_1
    const-string v1, "width"

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "height"

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "format"

    iget v2, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->dartImageFormat:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "lensAperture"

    invoke-virtual {p2}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->getLastLensAperture()Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "sensorExposureTime"

    invoke-virtual {p2}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->getLastSensorExposureTime()Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->getLastSensorSensitivity()Ljava/lang/Integer;

    move-result-object p2

    const-string v1, "sensorSensitivity"

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    :goto_2
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lio/flutter/plugins/camera/media/b;

    invoke-direct {v1, p3, v0}, Lio/flutter/plugins/camera/media/b;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Landroid/media/Image;->close()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lio/flutter/plugins/camera/media/c;

    invoke-direct {v1, p3, p2}, Lio/flutter/plugins/camera/media/c;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/IllegalStateException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Landroid/media/Image;->close()V

    :goto_3
    return-void
.end method

.method public parsePlanesForNv21(Landroid/media/Image;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/Image;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageStreamReaderUtils:Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v2

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Lio/flutter/plugins/camera/media/ImageStreamReaderUtils;->yuv420ThreePlanesToNV21([Landroid/media/Image$Plane;II)Ljava/nio/ByteBuffer;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v3, "bytesPerRow"

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v3, "bytesPerPixel"

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "bytes"

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public parsePlanesForYuvOrJpeg(Landroid/media/Image;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/Image;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    new-array v7, v6, [B

    invoke-virtual {v5, v7, v2, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v8, "bytesPerRow"

    invoke-interface {v5, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v6, "bytesPerPixel"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "bytes"

    invoke-interface {v5, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public removeListener(Landroid/os/Handler;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageReader:Landroid/media/ImageReader;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    return-void
.end method

.method public subscribeListener(Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/os/Handler;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/media/ImageStreamReader;->imageReader:Landroid/media/ImageReader;

    new-instance v1, Lio/flutter/plugins/camera/media/a;

    invoke-direct {v1, p0, p1, p2}, Lio/flutter/plugins/camera/media/a;-><init>(Lio/flutter/plugins/camera/media/ImageStreamReader;Lio/flutter/plugins/camera/types/CameraCaptureProperties;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {v0, v1, p3}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    return-void
.end method
