.class Ly/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg0/b0<",
        "Ly/h$a;",
        "Lg0/c0<",
        "[B>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly/h$a;)Lg0/c0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly/h$a;",
            ")",
            "Lg0/c0<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, Ly/h$a;->b()Lg0/c0;

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v0}, Lg0/c0;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1}, Ly/h$a;->a()I

    move-result p1

    invoke-virtual {v2, v3, p1, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    invoke-virtual {v0}, Lg0/c0;->d()Landroidx/camera/core/impl/utils/h;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0x100

    invoke-virtual {v0}, Lg0/c0;->h()Landroid/util/Size;

    move-result-object v7

    invoke-virtual {v0}, Lg0/c0;->b()Landroid/graphics/Rect;

    move-result-object v8

    invoke-virtual {v0}, Lg0/c0;->f()I

    move-result v9

    invoke-virtual {v0}, Lg0/c0;->g()Landroid/graphics/Matrix;

    move-result-object v10

    invoke-virtual {v0}, Lg0/c0;->a()Landroidx/camera/core/impl/s;

    move-result-object v11

    invoke-static/range {v4 .. v11}, Lg0/c0;->m([BLandroidx/camera/core/impl/utils/h;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Landroidx/camera/core/impl/s;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/h$a;

    invoke-virtual {p0, p1}, Ly/h;->a(Ly/h$a;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method
