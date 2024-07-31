.class public Lio/flutter/plugins/camera/media/MediaRecorderBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;
    }
.end annotation


# instance fields
.field private final camcorderProfile:Landroid/media/CamcorderProfile;

.field private enableAudio:Z

.field private final encoderProfiles:Landroid/media/EncoderProfiles;

.field private mediaOrientation:I

.field private final outputFilePath:Ljava/lang/String;

.field private final recorderFactory:Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;


# direct methods
.method public constructor <init>(Landroid/media/CamcorderProfile;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;

    invoke-direct {v0}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;-><init>(Landroid/media/CamcorderProfile;Ljava/lang/String;Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;)V

    return-void
.end method

.method constructor <init>(Landroid/media/CamcorderProfile;Ljava/lang/String;Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->outputFilePath:Ljava/lang/String;

    iput-object p1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->encoderProfiles:Landroid/media/EncoderProfiles;

    iput-object p3, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->recorderFactory:Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;

    return-void
.end method

.method public constructor <init>(Landroid/media/EncoderProfiles;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;

    invoke-direct {v0}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;-><init>(Landroid/media/EncoderProfiles;Ljava/lang/String;Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;)V

    return-void
.end method

.method constructor <init>(Landroid/media/EncoderProfiles;Ljava/lang/String;Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->outputFilePath:Ljava/lang/String;

    iput-object p1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->encoderProfiles:Landroid/media/EncoderProfiles;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iput-object p3, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->recorderFactory:Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;

    return-void
.end method


# virtual methods
.method public build()Landroid/media/MediaRecorder;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->recorderFactory:Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;

    invoke-virtual {v0}, Lio/flutter/plugins/camera/media/MediaRecorderBuilder$MediaRecorderFactory;->makeMediaRecorder()Landroid/media/MediaRecorder;

    move-result-object v0

    iget-boolean v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->enableAudio:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setVideoSource(I)V

    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsEncoderProfiles()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->encoderProfiles:Landroid/media/EncoderProfiles;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lio/flutter/plugins/camera/features/resolution/b;->a(Landroid/media/EncoderProfiles;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/EncoderProfiles$VideoProfile;

    iget-object v3, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->encoderProfiles:Landroid/media/EncoderProfiles;

    invoke-static {v3}, Lio/flutter/plugins/camera/media/d;->a(Landroid/media/EncoderProfiles;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/EncoderProfiles$AudioProfile;

    iget-object v3, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->encoderProfiles:Landroid/media/EncoderProfiles;

    invoke-static {v3}, Lio/flutter/plugins/camera/media/e;->a(Landroid/media/EncoderProfiles;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    iget-boolean v3, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->enableAudio:Z

    if-eqz v3, :cond_1

    invoke-static {v2}, Lio/flutter/plugins/camera/media/f;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    invoke-static {v2}, Lio/flutter/plugins/camera/media/g;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    invoke-static {v2}, Lio/flutter/plugins/camera/media/h;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    :cond_1
    invoke-static {v1}, Lio/flutter/plugins/camera/media/i;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setVideoEncoder(I)V

    invoke-static {v1}, Lio/flutter/plugins/camera/media/j;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    invoke-static {v1}, Lio/flutter/plugins/camera/media/k;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setVideoFrameRate(I)V

    invoke-static {v1}, Lio/flutter/plugins/camera/features/resolution/c;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v2

    invoke-static {v1}, Lio/flutter/plugins/camera/features/resolution/d;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    if-eqz v1, :cond_4

    iget v1, v1, Landroid/media/CamcorderProfile;->fileFormat:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    iget-boolean v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->enableAudio:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v1, v1, Landroid/media/CamcorderProfile;->audioCodec:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v1, v1, Landroid/media/CamcorderProfile;->audioBitRate:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v1, v1, Landroid/media/CamcorderProfile;->audioSampleRate:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    :cond_3
    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v1, v1, Landroid/media/CamcorderProfile;->videoCodec:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setVideoEncoder(I)V

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v1, v1, Landroid/media/CamcorderProfile;->videoBitRate:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v1, v1, Landroid/media/CamcorderProfile;->videoFrameRate:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setVideoFrameRate(I)V

    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->camcorderProfile:Landroid/media/CamcorderProfile;

    iget v2, v1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v1, v1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    :goto_0
    invoke-virtual {v0, v2, v1}, Landroid/media/MediaRecorder;->setVideoSize(II)V

    :cond_4
    iget-object v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->outputFilePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    iget v1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->mediaOrientation:I

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOrientationHint(I)V

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V

    return-object v0
.end method

.method public setEnableAudio(Z)Lio/flutter/plugins/camera/media/MediaRecorderBuilder;
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->enableAudio:Z

    return-object p0
.end method

.method public setMediaOrientation(I)Lio/flutter/plugins/camera/media/MediaRecorderBuilder;
    .locals 0

    iput p1, p0, Lio/flutter/plugins/camera/media/MediaRecorderBuilder;->mediaOrientation:I

    return-object p0
.end method
