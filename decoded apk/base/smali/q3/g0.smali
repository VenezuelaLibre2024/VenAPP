.class public Lq3/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq3/g0$h;,
        Lq3/g0$d;,
        Lq3/g0$g;,
        Lq3/g0$c;,
        Lq3/g0$e;,
        Lq3/g0$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lh3/j<",
        "TT;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lh3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lh3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Lq3/g0$f;

.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lq3/g0$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/g0$e<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lk3/d;

.field private final c:Lq3/g0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lq3/g0$a;

    invoke-direct {v1}, Lq3/g0$a;-><init>()V

    const-string v2, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    invoke-static {v2, v0, v1}, Lh3/g;->a(Ljava/lang/String;Ljava/lang/Object;Lh3/g$b;)Lh3/g;

    move-result-object v0

    sput-object v0, Lq3/g0;->d:Lh3/g;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lq3/g0$b;

    invoke-direct {v1}, Lq3/g0$b;-><init>()V

    const-string v2, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    invoke-static {v2, v0, v1}, Lh3/g;->a(Ljava/lang/String;Ljava/lang/Object;Lh3/g$b;)Lh3/g;

    move-result-object v0

    sput-object v0, Lq3/g0;->e:Lh3/g;

    new-instance v0, Lq3/g0$f;

    invoke-direct {v0}, Lq3/g0$f;-><init>()V

    sput-object v0, Lq3/g0;->f:Lq3/g0$f;

    const-string v0, "TP1A"

    const-string v1, "TD1A.220804.031"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lq3/g0;->g:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lk3/d;Lq3/g0$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            "Lq3/g0$e<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, Lq3/g0;->f:Lq3/g0$f;

    invoke-direct {p0, p1, p2, v0}, Lq3/g0;-><init>(Lk3/d;Lq3/g0$e;Lq3/g0$f;)V

    return-void
.end method

.method constructor <init>(Lk3/d;Lq3/g0$e;Lq3/g0$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            "Lq3/g0$e<",
            "TT;>;",
            "Lq3/g0$f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/g0;->b:Lk3/d;

    iput-object p2, p0, Lq3/g0;->a:Lq3/g0$e;

    iput-object p3, p0, Lq3/g0;->c:Lq3/g0$f;

    return-void
.end method

.method public static c(Lk3/d;)Lh3/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            ")",
            "Lh3/j<",
            "Landroid/content/res/AssetFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq3/g0;

    new-instance v1, Lq3/g0$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lq3/g0$c;-><init>(Lq3/g0$a;)V

    invoke-direct {v0, p0, v1}, Lq3/g0;-><init>(Lk3/d;Lq3/g0$e;)V

    return-object v0
.end method

.method public static d(Lk3/d;)Lh3/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            ")",
            "Lh3/j<",
            "Ljava/nio/ByteBuffer;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq3/g0;

    new-instance v1, Lq3/g0$d;

    invoke-direct {v1}, Lq3/g0$d;-><init>()V

    invoke-direct {v0, p0, v1}, Lq3/g0;-><init>(Lk3/d;Lq3/g0$e;)V

    return-object v0
.end method

.method private static e(Landroid/media/MediaMetadataRetriever;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    const-string v0, "VideoDecoder"

    invoke-static {}, Lq3/g0;->j()Z

    move-result v1

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    const/4 v1, 0x3

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p0}, Lq3/g0;->i(Landroid/media/MediaMetadataRetriever;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x18

    invoke-virtual {p0, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0xb4

    if-ne p0, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :catch_0
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "Exception trying to extract HDR transfer function or rotation"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    return-object p1

    :cond_2
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "Applying HDR 180 deg thumbnail correction"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p0

    int-to-float p0, p0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p0, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {v6, v0, p0, v1}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private f(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILq3/k;)Landroid/graphics/Bitmap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/media/MediaMetadataRetriever;",
            "JIII",
            "Lq3/k;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lq3/g0;->l(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1b

    if-lt p1, v0, :cond_0

    const/high16 p1, -0x80000000

    if-eq p6, p1, :cond_0

    if-eq p7, p1, :cond_0

    sget-object p1, Lq3/k;->f:Lq3/k;

    if-eq p8, p1, :cond_0

    invoke-static/range {p2 .. p8}, Lq3/g0;->h(Landroid/media/MediaMetadataRetriever;JIIILq3/k;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {p2, p3, p4, p5}, Lq3/g0;->g(Landroid/media/MediaMetadataRetriever;JI)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_1
    invoke-static {p2, p1}, Lq3/g0;->e(Landroid/media/MediaMetadataRetriever;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    new-instance p1, Lq3/g0$h;

    invoke-direct {p1}, Lq3/g0$h;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot decode VP8 video on CrOS."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static g(Landroid/media/MediaMetadataRetriever;JI)Landroid/graphics/Bitmap;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static h(Landroid/media/MediaMetadataRetriever;JIIILq3/k;)Landroid/graphics/Bitmap;
    .locals 9

    const/16 v0, 0x12

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x13

    invoke-virtual {p0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x18

    invoke-virtual {p0, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x5a

    if-eq v2, v3, :cond_0

    const/16 v3, 0x10e

    if-ne v2, v3, :cond_1

    :cond_0
    move v8, v1

    move v1, v0

    move v0, v8

    :cond_1
    invoke-virtual {p6, v0, v1, p4, p5}, Lq3/k;->b(IIII)F

    move-result p4

    int-to-float p5, v0

    mul-float/2addr p5, p4

    invoke-static {p5}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-float p5, v1

    mul-float/2addr p4, p5

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result v7

    move-object v2, p0

    move-wide v3, p1

    move v5, p3

    invoke-static/range {v2 .. v7}, Lq3/f0;->a(Landroid/media/MediaMetadataRetriever;JIII)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    const/4 p1, 0x3

    const-string p2, "VideoDecoder"

    invoke-static {p2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"

    invoke-static {p2, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static i(Landroid/media/MediaMetadataRetriever;)Z
    .locals 3

    const/16 v0, 0x24

    invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x23

    invoke-virtual {p0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    const/4 v1, 0x7

    const/4 v2, 0x6

    if-eq v0, v1, :cond_0

    if-ne v0, v2, :cond_1

    :cond_0
    if-ne p0, v2, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static j()Z
    .locals 3

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Pixel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x21

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v0, v1, :cond_0

    invoke-static {}, Lq3/g0;->k()Z

    move-result v0

    return v0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static k()Z
    .locals 3

    sget-object v0, Lq3/g0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private l(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/media/MediaMetadataRetriever;",
            ")Z"
        }
    .end annotation

    const-string v0, "VideoDecoder"

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const-string v4, ".+_cheets|cheets_.+"

    invoke-virtual {v1, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-nez v1, :cond_1

    return v3

    :cond_1
    const/16 v1, 0xc

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "video/webm"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    return v3

    :cond_2
    new-instance p2, Landroid/media/MediaExtractor;

    invoke-direct {p2}, Landroid/media/MediaExtractor;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lq3/g0;->a:Lq3/g0$e;

    invoke-interface {v1, p2, p1}, Lq3/g0$e;->a(Landroid/media/MediaExtractor;Ljava/lang/Object;)V

    invoke-virtual {p2}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result p1

    move v1, v3

    :goto_1
    if-ge v1, p1, :cond_4

    invoke-virtual {p2, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v4

    const-string v5, "mime"

    invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "video/x-vnd.on2.vp8"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_3

    invoke-virtual {p2}, Landroid/media/MediaExtractor;->release()V

    return v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Landroid/media/MediaExtractor;->release()V

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v4, p2

    goto :goto_2

    :catchall_1
    move-exception p1

    :goto_2
    const/4 p2, 0x3

    :try_start_2
    invoke-static {v0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "Exception trying to extract track info for a webm video on CrOS."

    invoke-static {v0, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroid/media/MediaExtractor;->release()V

    :cond_6
    :goto_3
    return v3

    :catchall_2
    move-exception p1

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroid/media/MediaExtractor;->release()V

    :cond_7
    throw p1
.end method

.method public static m(Lk3/d;)Lh3/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            ")",
            "Lh3/j<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq3/g0;

    new-instance v1, Lq3/g0$g;

    invoke-direct {v1}, Lq3/g0$g;-><init>()V

    invoke-direct {v0, p0, v1}, Lq3/g0;-><init>(Lk3/d;Lq3/g0$e;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lh3/h;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lh3/h;",
            ")Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    sget-object v0, Lq3/g0;->d:Lh3/g;

    invoke-virtual {p4, v0}, Lh3/h;->c(Lh3/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gez v0, :cond_1

    const-wide/16 v0, -0x1

    cmp-long v0, v4, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object v0, Lq3/g0;->e:Lh3/g;

    invoke-virtual {p4, v0}, Lh3/h;->c(Lh3/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_2
    sget-object v1, Lq3/k;->h:Lh3/g;

    invoke-virtual {p4, v1}, Lh3/h;->c(Lh3/g;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lq3/k;

    if-nez p4, :cond_3

    sget-object p4, Lq3/k;->g:Lq3/k;

    :cond_3
    move-object v9, p4

    iget-object p4, p0, Lq3/g0;->c:Lq3/g0$f;

    invoke-virtual {p4}, Lq3/g0$f;->a()Landroid/media/MediaMetadataRetriever;

    move-result-object p4

    const/16 v10, 0x1d

    :try_start_0
    iget-object v1, p0, Lq3/g0;->a:Lq3/g0$e;

    invoke-interface {v1, p4, p1}, Lq3/g0$e;->b(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move v7, p2

    move v8, p3

    invoke-direct/range {v1 .. v9}, Lq3/g0;->f(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILq3/k;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v10, :cond_4

    invoke-static {p4}, Lq3/e0;->a(Landroid/media/MediaMetadataRetriever;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p4}, Landroid/media/MediaMetadataRetriever;->release()V

    :goto_1
    iget-object p2, p0, Lq3/g0;->b:Lk3/d;

    invoke-static {p1, p2}, Lq3/f;->b(Landroid/graphics/Bitmap;Lk3/d;)Lq3/f;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v10, :cond_5

    invoke-static {p4}, Lq3/e0;->a(Landroid/media/MediaMetadataRetriever;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p4}, Landroid/media/MediaMetadataRetriever;->release()V

    :goto_2
    throw p1
.end method