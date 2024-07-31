.class final Ly/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/b0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg0/b0<",
        "Lg0/c0<",
        "[B>;",
        "Lg0/c0<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;
    .locals 2

    :try_start_0
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Landroid/graphics/BitmapRegionDecoder;->newInstance([BIIZ)Landroid/graphics/BitmapRegionDecoder;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-virtual {p1, p2, v0}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lw/g0;

    const/4 v0, 0x1

    const-string v1, "Failed to decode JPEG."

    invoke-direct {p2, v0, v1, p1}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public a(Lg0/c0;)Lg0/c0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "[B>;)",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lg0/c0;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Lg0/c0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-direct {p0, v1, v0}, Ly/s;->b([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p1}, Lg0/c0;->d()Landroidx/camera/core/impl/utils/h;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-direct {v4, v6, v6, v1, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p1}, Lg0/c0;->f()I

    move-result v5

    invoke-virtual {p1}, Lg0/c0;->g()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/camera/core/impl/utils/r;->p(Landroid/graphics/Matrix;Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {p1}, Lg0/c0;->a()Landroidx/camera/core/impl/s;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lg0/c0;->j(Landroid/graphics/Bitmap;Landroidx/camera/core/impl/utils/h;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Landroidx/camera/core/impl/s;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg0/c0;

    invoke-virtual {p0, p1}, Ly/s;->a(Lg0/c0;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method
