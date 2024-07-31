.class public Lio/flutter/plugins/camera/SdkCapabilityChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static SDK_VERSION:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static supportsDistortionCorrection()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static supportsEglRecordableAndroid()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static supportsEncoderProfiles()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static supportsMarshmallowNoiseReductionModes()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static supportsSessionConfiguration()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static supportsVideoPause()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static supportsZoomRatio()Z
    .locals 2

    sget v0, Lio/flutter/plugins/camera/SdkCapabilityChecker;->SDK_VERSION:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
