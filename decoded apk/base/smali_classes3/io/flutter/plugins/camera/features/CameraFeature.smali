.class public abstract Lio/flutter/plugins/camera/features/CameraFeature;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final cameraProperties:Lio/flutter/plugins/camera/CameraProperties;


# direct methods
.method protected constructor <init>(Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    return-void
.end method


# virtual methods
.method public abstract checkIsSupported()Z
.end method

.method public abstract getDebugName()Ljava/lang/String;
.end method

.method public abstract getValue()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract setValue(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
.end method
