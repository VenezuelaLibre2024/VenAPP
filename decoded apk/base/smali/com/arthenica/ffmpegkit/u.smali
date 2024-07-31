.class public Lcom/arthenica/ffmpegkit/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:[Ljava/lang/String;

.field static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-string v0, "avutil"

    const-string v1, "swscale"

    const-string v2, "swresample"

    const-string v3, "avcodec"

    const-string v4, "avformat"

    const-string v5, "avfilter"

    const-string v6, "avdevice"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/u;->a:[Ljava/lang/String;

    const-string v1, "chromaprint"

    const-string v2, "openh264"

    const-string v3, "rubberband"

    const-string v4, "snappy"

    const-string v5, "srt"

    const-string v6, "tesseract"

    const-string v7, "x265"

    const-string v8, "zimg"

    const-string v9, "libilbc"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/u;->b:[Ljava/lang/String;

    return-void
.end method

.method static a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "brand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", model: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", device: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", api level: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", abis: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    invoke-static {v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", 32bit abis: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    invoke-static {v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", 64bit abis: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    invoke-static {v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static b()Z
    .locals 1

    const-string v0, "enable.ffmpeg.kit.test.mode"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_X86_64:Lcom/arthenica/ffmpegkit/a;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/a;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static d()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method static f(Z)V
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const-string p0, "arm-v7a"

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    :try_start_0
    const-string v1, "ffmpegkit_armv7a_neon"

    invoke-static {v1}, Lcom/arthenica/ffmpegkit/u;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->b()V
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    move v0, p0

    goto :goto_1

    :catch_0
    move-exception v1

    move v2, p0

    goto :goto_0

    :catch_1
    move-exception v1

    move v2, v0

    :goto_0
    new-array p0, p0, [Ljava/lang/Object;

    invoke-static {v1}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p0, v0

    const-string v0, "NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    :cond_0
    :goto_1
    if-nez v0, :cond_1

    const-string p0, "ffmpegkit"

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/u;->i(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method static g()V
    .locals 1

    const-string v0, "ffmpegkit_abidetect"

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/u;->i(Ljava/lang/String;)V

    return-void
.end method

.method static h()Z
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->isNativeLTSBuild()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private static i(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/Error;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "FFmpegKit failed to start on %s."

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method static j()I
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->getNativeLogLevel()I

    move-result v0

    return v0

    :cond_0
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_DEBUG:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v0

    return v0
.end method

.method private static k()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->getNativeAbi()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_X86_64:Lcom/arthenica/ffmpegkit/a;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/a;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static l()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/v;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "test"

    return-object v0
.end method

.method static m()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->L()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->h()Z

    move-result v0

    const-string v1, "6.0"

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "%s-lts"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method
