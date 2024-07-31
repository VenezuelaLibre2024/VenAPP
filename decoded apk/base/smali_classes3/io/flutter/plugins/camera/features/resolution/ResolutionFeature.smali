.class public Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;",
        ">;"
    }
.end annotation


# instance fields
.field private cameraId:I

.field private captureSize:Landroid/util/Size;

.field private currentSetting:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

.field private previewSize:Landroid/util/Size;

.field private recordingProfile:Landroid/media/EncoderProfiles;

.field private recordingProfileLegacy:Landroid/media/CamcorderProfile;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    iput-object p2, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->currentSetting:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    const/16 p1, 0xa

    :try_start_0
    invoke-static {p3, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->cameraId:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->configureResolution(Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;I)V

    return-void

    :catch_0
    const/4 p1, -0x1

    iput p1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->cameraId:I

    return-void
.end method

.method static computeBestPreviewSize(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/util/Size;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;->high:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-le v0, v2, :cond_0

    move-object p1, v1

    :cond_0
    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsEncoderProfiles()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getBestAvailableCamcorderProfileForResolutionPreset(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/media/EncoderProfiles;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/plugins/camera/features/resolution/b;->a(Landroid/media/EncoderProfiles;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/EncoderProfiles$VideoProfile;

    if-eqz v0, :cond_1

    new-instance p0, Landroid/util/Size;

    invoke-static {v0}, Lio/flutter/plugins/camera/features/resolution/c;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result p1

    invoke-static {v0}, Lio/flutter/plugins/camera/features/resolution/d;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/util/Size;-><init>(II)V

    return-object p0

    :cond_1
    invoke-static {p0, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getBestAvailableCamcorderProfileForResolutionPresetLegacy(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/media/CamcorderProfile;

    move-result-object p0

    new-instance p1, Landroid/util/Size;

    iget v0, p0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget p0, p0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {p1, v0, p0}, Landroid/util/Size;-><init>(II)V

    return-object p1
.end method

.method private configureResolution(Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;I)V
    .locals 4

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsEncoderProfiles()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iput-object v1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfileLegacy:Landroid/media/CamcorderProfile;

    invoke-static {p2, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getBestAvailableCamcorderProfileForResolutionPreset(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/media/EncoderProfiles;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfile:Landroid/media/EncoderProfiles;

    invoke-static {v0}, Lio/flutter/plugins/camera/features/resolution/b;->a(Landroid/media/EncoderProfiles;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/EncoderProfiles$VideoProfile;

    if-eqz v0, :cond_1

    new-instance v2, Landroid/util/Size;

    invoke-static {v0}, Lio/flutter/plugins/camera/features/resolution/c;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v3

    invoke-static {v0}, Lio/flutter/plugins/camera/features/resolution/d;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/util/Size;-><init>(II)V

    iput-object v2, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->captureSize:Landroid/util/Size;

    const/4 v2, 0x1

    :cond_1
    if-nez v2, :cond_2

    iput-object v1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfile:Landroid/media/EncoderProfiles;

    invoke-static {p2, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getBestAvailableCamcorderProfileForResolutionPresetLegacy(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/media/CamcorderProfile;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfileLegacy:Landroid/media/CamcorderProfile;

    new-instance v0, Landroid/util/Size;

    iget-object v1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfileLegacy:Landroid/media/CamcorderProfile;

    iget v2, v1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v1, v1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v2, v1}, Landroid/util/Size;-><init>(II)V

    iput-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->captureSize:Landroid/util/Size;

    :cond_2
    invoke-static {p2, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->computeBestPreviewSize(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/util/Size;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->previewSize:Landroid/util/Size;

    return-void
.end method

.method public static getBestAvailableCamcorderProfileForResolutionPreset(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/media/EncoderProfiles;
    .locals 2

    if-ltz p0, :cond_7

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature$1;->$SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x1

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_0
    :pswitch_1
    const/16 p1, 0x8

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_1
    :pswitch_2
    const/4 p1, 0x6

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_2
    :pswitch_3
    const/4 p1, 0x5

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_3
    :pswitch_4
    const/4 p1, 0x4

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_4
    :pswitch_5
    const/4 p1, 0x7

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_0
    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {v0, p1}, Lio/flutter/plugins/camera/features/resolution/a;->a(Ljava/lang/String;I)Landroid/media/EncoderProfiles;

    move-result-object p0

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "No capture session available for current capture session."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers."

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static getBestAvailableCamcorderProfileForResolutionPresetLegacy(ILio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Landroid/media/CamcorderProfile;
    .locals 1

    if-ltz p0, :cond_7

    sget-object v0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature$1;->$SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x1

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_0
    :pswitch_1
    const/16 p1, 0x8

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_1
    :pswitch_2
    const/4 p1, 0x6

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_2
    :pswitch_3
    const/4 p1, 0x5

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_3
    :pswitch_4
    const/4 p1, 0x4

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_4
    :pswitch_5
    const/4 p1, 0x7

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_0
    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p0, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p0

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "No capture session available for current capture session."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers."

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 1

    iget v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->cameraId:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getCaptureSize()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->captureSize:Landroid/util/Size;

    return-object v0
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "ResolutionFeature"

    return-object v0
.end method

.method public getPreviewSize()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->previewSize:Landroid/util/Size;

    return-object v0
.end method

.method public getRecordingProfile()Landroid/media/EncoderProfiles;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfile:Landroid/media/EncoderProfiles;

    return-object v0
.end method

.method public getRecordingProfileLegacy()Landroid/media/CamcorderProfile;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->recordingProfileLegacy:Landroid/media/CamcorderProfile;

    return-object v0
.end method

.method public getValue()Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->currentSetting:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->getValue()Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->currentSetting:Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    iget v0, p0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->cameraId:I

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->configureResolution(Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;I)V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;->setValue(Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 0

    return-void
.end method
