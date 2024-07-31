.class Llh/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llh/a;->k(Ljava/lang/String;Landroid/graphics/RectF;FLio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic c:Landroid/graphics/RectF;

.field final synthetic d:F

.field final synthetic e:Llh/a;


# direct methods
.method constructor <init>(Llh/a;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Landroid/graphics/RectF;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Llh/a$a;->e:Llh/a;

    iput-object p2, p0, Llh/a$a;->a:Ljava/lang/String;

    iput-object p3, p0, Llh/a$a;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p4, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    iput p5, p0, Llh/a$a;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Llh/a$a;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Llh/a$a;->e:Llh/a;

    new-instance v1, Llh/a$a$a;

    invoke-direct {v1, p0}, Llh/a$a$a;-><init>(Llh/a$a;)V

    :goto_0
    invoke-static {v0, v1}, Llh/a;->a(Llh/a;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Llh/a$a;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Llh/a$a;->e:Llh/a;

    new-instance v1, Llh/a$a$b;

    invoke-direct {v1, p0}, Llh/a$a$b;-><init>(Llh/a$a;)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Llh/a$a;->e:Llh/a;

    iget-object v3, p0, Llh/a$a;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Llh/a;->b(Llh/a;Ljava/lang/String;)Llh/a$d;

    move-result-object v9

    invoke-virtual {v9}, Llh/a$d;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v9}, Llh/a$d;->a()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v7, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x1

    move-object v2, v0

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v2

    :cond_2
    invoke-virtual {v9}, Llh/a$d;->c()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    mul-float/2addr v2, v3

    iget v3, p0, Llh/a$a;->d:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v9}, Llh/a$d;->b()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    mul-float/2addr v3, v4

    iget v4, p0, Llh/a$a;->d:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setDither(Z)V

    new-instance v7, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    iget-object v9, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->left:F

    mul-float/2addr v8, v9

    float-to-int v8, v8

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    iget-object v10, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->top:F

    mul-float/2addr v9, v10

    float-to-int v9, v9

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    int-to-float v10, v10

    iget-object v11, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    iget v11, v11, Landroid/graphics/RectF;->right:F

    mul-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    int-to-float v11, v11

    iget-object v12, p0, Llh/a$a;->c:Landroid/graphics/RectF;

    iget v12, v12, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v11, v12

    float-to-int v11, v11

    invoke-direct {v7, v8, v9, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v8, Landroid/graphics/Rect;

    const/4 v9, 0x0

    invoke-direct {v8, v9, v9, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v5, v0, v7, v8, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :try_start_0
    iget-object v2, p0, Llh/a$a;->e:Llh/a;

    invoke-static {v2}, Llh/a;->c(Llh/a;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Llh/a$a;->e:Llh/a;

    invoke-static {v3, v4, v2}, Llh/a;->d(Llh/a;Landroid/graphics/Bitmap;Ljava/io/File;)V

    iget-object v3, p0, Llh/a$a;->e:Llh/a;

    new-instance v6, Llh/a$a$c;

    invoke-direct {v6, p0, v2}, Llh/a$a$c;-><init>(Llh/a$a;Ljava/io/File;)V

    invoke-static {v3, v6}, Llh/a;->a(Llh/a;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    iget-object v3, p0, Llh/a$a;->e:Llh/a;

    new-instance v6, Llh/a$a$d;

    invoke-direct {v6, p0, v2}, Llh/a$a$d;-><init>(Llh/a$a;Ljava/io/IOException;)V

    invoke-static {v3, v6}, Llh/a;->a(Llh/a;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v5, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    return-void

    :goto_2
    invoke-virtual {v5, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    throw v2
.end method
