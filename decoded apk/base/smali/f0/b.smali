.class public final Lf0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/b$a;
    }
.end annotation


# direct methods
.method public static a([Landroidx/camera/core/o$a;II)Landroid/graphics/Bitmap;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Expect a single plane"

    invoke-static {v0, v3}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    aget-object v0, p0, v1

    invoke-interface {v0}, Landroidx/camera/core/o$a;->e()I

    move-result v0

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v3, "Expect pixelStride=4"

    invoke-static {v0, v3}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    aget-object v0, p0, v1

    invoke-interface {v0}, Landroidx/camera/core/o$a;->d()I

    move-result v0

    mul-int/lit8 v3, p1, 0x4

    if-ne v0, v3, :cond_2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    const-string v0, "Expect rowStride=width*4"

    invoke-static {v2, v0}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    aget-object p2, p0, v1

    invoke-interface {p2}, Landroidx/camera/core/o$a;->c()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    aget-object p2, p0, v1

    invoke-interface {p2}, Landroidx/camera/core/o$a;->c()Ljava/nio/ByteBuffer;

    move-result-object p2

    aget-object p0, p0, v1

    invoke-interface {p0}, Landroidx/camera/core/o$a;->d()I

    move-result p0

    invoke-static {p1, p2, p0}, Landroidx/camera/core/ImageProcessingUtil;->i(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;I)V

    return-object p1
.end method

.method public static b(Landroid/graphics/Bitmap;)Ljava/nio/ByteBuffer;
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Only accept Bitmap with ARGB_8888 format for now."

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v1

    invoke-static {p0, v0, v1}, Landroidx/camera/core/ImageProcessingUtil;->h(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;I)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method public static c(Landroidx/camera/core/o;)[B
    .locals 3

    invoke-interface {p0}, Landroidx/camera/core/o;->getFormat()I

    move-result v0

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Landroidx/camera/core/o;->u0()[Landroidx/camera/core/o$a;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-interface {p0}, Landroidx/camera/core/o$a;->c()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect image format of the input image proxy: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Landroidx/camera/core/o;->getFormat()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Landroidx/camera/core/o;Landroid/graphics/Rect;II)[B
    .locals 8

    invoke-interface {p0}, Landroidx/camera/core/o;->getFormat()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_2

    invoke-static {p0}, Lf0/b;->e(Landroidx/camera/core/o;)[B

    move-result-object v3

    new-instance v0, Landroid/graphics/YuvImage;

    const/16 v4, 0x11

    invoke-interface {p0}, Landroidx/camera/core/o;->getWidth()I

    move-result v5

    invoke-interface {p0}, Landroidx/camera/core/o;->getHeight()I

    move-result v6

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Landroidx/camera/core/impl/utils/k;

    invoke-static {p0, p3}, Landroidx/camera/core/impl/utils/j;->b(Landroidx/camera/core/o;I)Landroidx/camera/core/impl/utils/j;

    move-result-object p3

    invoke-direct {v2, v1, p3}, Landroidx/camera/core/impl/utils/k;-><init>(Ljava/io/OutputStream;Landroidx/camera/core/impl/utils/j;)V

    if-nez p1, :cond_0

    new-instance p1, Landroid/graphics/Rect;

    invoke-interface {p0}, Landroidx/camera/core/o;->getWidth()I

    move-result p3

    invoke-interface {p0}, Landroidx/camera/core/o;->getHeight()I

    move-result p0

    const/4 v3, 0x0

    invoke-direct {p1, v3, v3, p3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    :cond_0
    invoke-virtual {v0, p1, p2, v2}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lf0/b$a;

    const-string p1, "YuvImage failed to encode jpeg."

    sget-object p2, Lf0/b$a$a;->ENCODE_FAILED:Lf0/b$a$a;

    invoke-direct {p0, p1, p2}, Lf0/b$a;-><init>(Ljava/lang/String;Lf0/b$a$a;)V

    throw p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Incorrect image format of the input image proxy: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Landroidx/camera/core/o;->getFormat()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static e(Landroidx/camera/core/o;)[B
    .locals 19

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->u0()[Landroidx/camera/core/o$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->u0()[Landroidx/camera/core/o$a;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->u0()[Landroidx/camera/core/o$a;

    move-result-object v3

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-interface {v0}, Landroidx/camera/core/o$a;->c()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-interface {v2}, Landroidx/camera/core/o$a;->c()Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-interface {v3}, Landroidx/camera/core/o$a;->c()Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v8

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getWidth()I

    move-result v9

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getHeight()I

    move-result v10

    mul-int/2addr v9, v10

    div-int/2addr v9, v4

    add-int/2addr v9, v8

    new-array v9, v9, [B

    move v10, v1

    move v11, v10

    :goto_0
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getHeight()I

    move-result v12

    if-ge v10, v12, :cond_0

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getWidth()I

    move-result v12

    invoke-virtual {v5, v9, v11, v12}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getWidth()I

    move-result v12

    add-int/2addr v11, v12

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v12

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getWidth()I

    move-result v13

    sub-int/2addr v12, v13

    invoke-interface {v0}, Landroidx/camera/core/o$a;->d()I

    move-result v13

    add-int/2addr v12, v13

    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getHeight()I

    move-result v0

    div-int/2addr v0, v4

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/o;->getWidth()I

    move-result v5

    div-int/2addr v5, v4

    invoke-interface {v3}, Landroidx/camera/core/o$a;->d()I

    move-result v4

    invoke-interface {v2}, Landroidx/camera/core/o$a;->d()I

    move-result v8

    invoke-interface {v3}, Landroidx/camera/core/o$a;->e()I

    move-result v3

    invoke-interface {v2}, Landroidx/camera/core/o$a;->e()I

    move-result v2

    new-array v10, v4, [B

    new-array v12, v8, [B

    move v13, v1

    :goto_1
    if-ge v13, v0, :cond_2

    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    move-result v14

    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    invoke-virtual {v7, v10, v1, v14}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/Buffer;->remaining()I

    move-result v14

    invoke-static {v8, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    invoke-virtual {v6, v12, v1, v14}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    move v14, v1

    move v15, v14

    move/from16 v16, v15

    :goto_2
    if-ge v14, v5, :cond_1

    add-int/lit8 v17, v11, 0x1

    aget-byte v18, v10, v15

    aput-byte v18, v9, v11

    add-int/lit8 v11, v17, 0x1

    aget-byte v18, v12, v16

    aput-byte v18, v9, v17

    add-int/2addr v15, v3

    add-int v16, v16, v2

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_2
    return-object v9
.end method
