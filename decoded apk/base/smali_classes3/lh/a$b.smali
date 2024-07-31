.class Llh/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llh/a;->q(Ljava/lang/String;IILio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Llh/a;


# direct methods
.method constructor <init>(Llh/a;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Llh/a$b;->e:Llh/a;

    iput-object p2, p0, Llh/a$b;->a:Ljava/lang/String;

    iput-object p3, p0, Llh/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iput p4, p0, Llh/a$b;->c:I

    iput p5, p0, Llh/a$b;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Llh/a$b;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Llh/a$b;->e:Llh/a;

    new-instance v1, Llh/a$b$a;

    invoke-direct {v1, p0}, Llh/a$b$a;-><init>(Llh/a$b;)V

    :goto_0
    invoke-static {v0, v1}, Llh/a;->a(Llh/a;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v1, p0, Llh/a$b;->e:Llh/a;

    iget-object v2, p0, Llh/a$b;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Llh/a;->b(Llh/a;Ljava/lang/String;)Llh/a$d;

    move-result-object v1

    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iget-object v3, p0, Llh/a$b;->e:Llh/a;

    invoke-virtual {v1}, Llh/a$d;->c()I

    move-result v4

    invoke-virtual {v1}, Llh/a$d;->b()I

    move-result v5

    iget v6, p0, Llh/a$b;->c:I

    iget v7, p0, Llh/a$b;->d:I

    invoke-static {v3, v4, v5, v6, v7}, Llh/a;->e(Llh/a;IIII)I

    move-result v3

    iput v3, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget-object v3, p0, Llh/a$b;->a:Ljava/lang/String;

    invoke-static {v3, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v0, p0, Llh/a$b;->e:Llh/a;

    new-instance v1, Llh/a$b$b;

    invoke-direct {v1, p0}, Llh/a$b$b;-><init>(Llh/a$b;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Llh/a$d;->c()I

    move-result v3

    iget v4, p0, Llh/a$b;->c:I

    if-le v3, v4, :cond_2

    invoke-virtual {v1}, Llh/a$d;->b()I

    move-result v3

    iget v4, p0, Llh/a$b;->d:I

    if-le v3, v4, :cond_2

    iget v3, p0, Llh/a$b;->c:I

    int-to-float v3, v3

    invoke-virtual {v1}, Llh/a$d;->c()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    iget v4, p0, Llh/a$b;->d:I

    int-to-float v4, v4

    invoke-virtual {v1}, Llh/a$d;->b()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v4, 0x1

    invoke-static {v2, v3, v1, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    move-object v2, v1

    :cond_2
    :try_start_0
    iget-object v1, p0, Llh/a$b;->e:Llh/a;

    invoke-static {v1}, Llh/a;->c(Llh/a;)Ljava/io/File;

    move-result-object v1

    iget-object v3, p0, Llh/a$b;->e:Llh/a;

    invoke-static {v3, v2, v1}, Llh/a;->d(Llh/a;Landroid/graphics/Bitmap;Ljava/io/File;)V

    iget-object v3, p0, Llh/a$b;->e:Llh/a;

    invoke-static {v3, v0, v1}, Llh/a;->f(Llh/a;Ljava/io/File;Ljava/io/File;)V

    iget-object v0, p0, Llh/a$b;->e:Llh/a;

    new-instance v3, Llh/a$b$c;

    invoke-direct {v3, p0, v1}, Llh/a$b$c;-><init>(Llh/a$b;Ljava/io/File;)V

    invoke-static {v0, v3}, Llh/a;->a(Llh/a;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    iget-object v1, p0, Llh/a$b;->e:Llh/a;

    new-instance v3, Llh/a$b$d;

    invoke-direct {v3, p0, v0}, Llh/a$b$d;-><init>(Llh/a$b;Ljava/io/IOException;)V

    invoke-static {v1, v3}, Llh/a;->a(Llh/a;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    return-void

    :goto_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    throw v0
.end method
