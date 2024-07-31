.class public Lei/b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lei/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/net/Uri;

.field private c:Landroid/net/Uri;

.field private final d:I

.field private final e:I

.field private final f:Lci/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;IILci/b;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lei/b;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lei/b;->b:Landroid/net/Uri;

    iput-object p3, p0, Lei/b;->c:Landroid/net/Uri;

    iput p4, p0, Lei/b;->d:I

    iput p5, p0, Lei/b;->e:I

    iput-object p6, p0, Lei/b;->f:Lci/b;

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    const/high16 v1, 0x6400000

    if-le p1, v1, :cond_1

    iget p1, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/lit8 p1, p1, 0x2

    iput p1, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method private c(Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 4

    const-string v0, "BitmapWorkerTask"

    const-string v1, "downloadFile"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_3

    iget-object v0, p0, Lei/b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_2

    sget-object v1, Lbi/a;->b:Lbi/a;

    invoke-virtual {v1}, Lbi/a;->a()Lql/y;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Lql/a0$a;

    invoke-direct {v3}, Lql/a0$a;-><init>()V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lql/a0$a;->o(Ljava/lang/String;)Lql/a0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/a0$a;->b()Lql/a0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lql/y;->w(Lql/a0;)Lql/e;

    move-result-object p1

    invoke-interface {p1}, Lql/e;->n()Lql/c0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object v3

    invoke-virtual {v3}, Lql/d0;->f()Ldm/d;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2}, Ldm/l;->d(Ljava/io/OutputStream;)Ldm/v;

    move-result-object v2

    invoke-interface {v3, v2}, Ldm/d;->Y(Ldm/v;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v3}, Lfi/a;->c(Ljava/io/Closeable;)V

    invoke-static {v2}, Lfi/a;->c(Ljava/io/Closeable;)V

    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object p1

    invoke-static {p1}, Lfi/a;->c(Ljava/io/Closeable;)V

    invoke-virtual {v1}, Lql/y;->l()Lql/p;

    move-result-object p1

    invoke-virtual {p1}, Lql/p;->a()V

    iget-object p1, p0, Lei/b;->c:Landroid/net/Uri;

    iput-object p1, p0, Lei/b;->b:Landroid/net/Uri;

    return-void

    :cond_0
    :try_start_3
    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "OutputStream for given output Uri is null"

    invoke-direct {p2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p2

    move-object v0, p1

    move-object p1, v2

    move-object v2, v3

    goto :goto_0

    :catchall_1
    move-exception p2

    move-object v0, p1

    move-object p1, v2

    goto :goto_0

    :catchall_2
    move-exception p2

    move-object p1, v2

    move-object v0, p1

    :goto_0
    invoke-static {v2}, Lfi/a;->c(Ljava/io/Closeable;)V

    invoke-static {p1}, Lfi/a;->c(Ljava/io/Closeable;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lql/c0;->a()Lql/d0;

    move-result-object p1

    invoke-static {p1}, Lfi/a;->c(Ljava/io/Closeable;)V

    :cond_1
    invoke-virtual {v1}, Lql/y;->l()Lql/p;

    move-result-object p1

    invoke-virtual {p1}, Lql/p;->a()V

    iget-object p1, p0, Lei/b;->c:Landroid/net/Uri;

    iput-object p1, p0, Lei/b;->b:Landroid/net/Uri;

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Context is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Output Uri is null - cannot download image"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private e()V
    .locals 4

    iget-object v0, p0, Lei/b;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uri scheme: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BitmapWorkerTask"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "file"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid Uri scheme "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid Uri scheme"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    :try_start_0
    iget-object v0, p0, Lei/b;->b:Landroid/net/Uri;

    iget-object v1, p0, Lei/b;->c:Landroid/net/Uri;

    invoke-direct {p0, v0, v1}, Lei/b;->c(Landroid/net/Uri;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_2
    const-string v1, "Downloading failed"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw v0
.end method


# virtual methods
.method protected varargs b([Ljava/lang/Void;)Lei/b$a;
    .locals 13

    const-string p1, "BitmapWorkerTask"

    iget-object v0, p0, Lei/b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance p1, Lei/b$a;

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "context is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lei/b$a;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :cond_0
    iget-object v1, p0, Lei/b;->b:Landroid/net/Uri;

    if-nez v1, :cond_1

    new-instance p1, Lei/b$a;

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Input Uri cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lei/b$a;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :cond_1
    :try_start_0
    invoke-direct {p0}, Lei/b;->e()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget v3, p0, Lei/b;->d:I

    iget v4, p0, Lei/b;->e:I

    invoke-static {v1, v3, v4}, Lfi/a;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v3

    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v3, 0x0

    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    const/4 v4, 0x0

    move-object v5, v4

    :goto_0
    const-string v6, "Bitmap could not be decoded from the Uri: ["

    const-string v7, "]"

    if-nez v3, :cond_5

    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    iget-object v9, p0, Lei/b;->b:Landroid/net/Uri;

    invoke-virtual {v8, v9}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v8
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-static {v8, v4, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v5

    iget v9, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/4 v10, -0x1

    if-eq v9, v10, :cond_4

    iget v9, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v9, v10, :cond_2

    goto :goto_1

    :cond_2
    :try_start_3
    invoke-static {v8}, Lfi/a;->c(Ljava/io/Closeable;)V

    invoke-direct {p0, v5, v1}, Lei/b;->a(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Z

    move-result v6
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v6, :cond_3

    goto :goto_0

    :cond_3
    move v3, v2

    goto :goto_0

    :cond_4
    :goto_1
    :try_start_4
    new-instance v9, Lei/b$a;

    new-instance v10, Ljava/lang/IllegalArgumentException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Bounds for bitmap could not be retrieved from the Uri: ["

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, p0, Lei/b;->b:Landroid/net/Uri;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v9, v10}, Lei/b$a;-><init>(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v8}, Lfi/a;->c(Ljava/io/Closeable;)V

    return-object v9

    :catchall_0
    move-exception v9

    invoke-static {v8}, Lfi/a;->c(Ljava/io/Closeable;)V

    throw v9
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "doInBackground: ImageDecoder.createSource: "

    invoke-static {p1, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Lei/b$a;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lei/b;->b:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, v1}, Lei/b$a;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :catch_1
    move-exception v6

    const-string v7, "doInBackground: BitmapFactory.decodeFileDescriptor: "

    invoke-static {p1, v7, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget v6, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/lit8 v6, v6, 0x2

    iput v6, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto/16 :goto_0

    :cond_5
    if-nez v5, :cond_6

    new-instance p1, Lei/b$a;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lei/b;->b:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lei/b$a;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :cond_6
    iget-object p1, p0, Lei/b;->b:Landroid/net/Uri;

    invoke-static {v0, p1}, Lfi/a;->g(Landroid/content/Context;Landroid/net/Uri;)I

    move-result p1

    invoke-static {p1}, Lfi/a;->e(I)I

    move-result v0

    invoke-static {p1}, Lfi/a;->f(I)I

    move-result v1

    new-instance v3, Ldi/c;

    invoke-direct {v3, p1, v0, v1}, Ldi/c;-><init>(III)V

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    if-eqz v0, :cond_7

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    :cond_7
    if-eq v1, v2, :cond_8

    int-to-float v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_8
    invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v0, Lei/b$a;

    invoke-static {v5, p1}, Lfi/a;->i(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {v0, p1, v3}, Lei/b$a;-><init>(Landroid/graphics/Bitmap;Ldi/c;)V

    return-object v0

    :cond_9
    new-instance p1, Lei/b$a;

    invoke-direct {p1, v5, v3}, Lei/b$a;-><init>(Landroid/graphics/Bitmap;Ldi/c;)V

    return-object p1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    :goto_2
    new-instance v0, Lei/b$a;

    invoke-direct {v0, p1}, Lei/b$a;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method

.method protected d(Lei/b$a;)V
    .locals 4

    iget-object v0, p1, Lei/b$a;->c:Ljava/lang/Exception;

    if-nez v0, :cond_0

    iget-object v0, p0, Lei/b;->f:Lci/b;

    iget-object v1, p1, Lei/b$a;->a:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lei/b$a;->b:Ldi/c;

    iget-object v2, p0, Lei/b;->b:Landroid/net/Uri;

    iget-object v3, p0, Lei/b;->c:Landroid/net/Uri;

    invoke-interface {v0, v1, p1, v2, v3}, Lci/b;->a(Landroid/graphics/Bitmap;Ldi/c;Landroid/net/Uri;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lei/b;->f:Lci/b;

    invoke-interface {p1, v0}, Lci/b;->onFailure(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lei/b;->b([Ljava/lang/Void;)Lei/b$a;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lei/b$a;

    invoke-virtual {p0, p1}, Lei/b;->d(Lei/b$a;)V

    return-void
.end method
