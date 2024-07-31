.class public Ly/u;
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
        "Landroidx/camera/core/o;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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
            "Landroidx/camera/core/o;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/t;

    invoke-virtual {p1}, Lg0/c0;->h()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lg0/c0;->h()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/16 v3, 0x100

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Landroidx/camera/core/p;->a(IIII)Landroidx/camera/core/impl/g1;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/t;-><init>(Landroidx/camera/core/impl/g1;)V

    invoke-virtual {p1}, Lg0/c0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v0, v1}, Landroidx/camera/core/ImageProcessingUtil;->e(Landroidx/camera/core/impl/g1;[B)Landroidx/camera/core/o;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/camera/core/t;->l()V

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Landroidx/camera/core/o;

    invoke-virtual {p1}, Lg0/c0;->d()Landroidx/camera/core/impl/utils/h;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lg0/c0;->b()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {p1}, Lg0/c0;->f()I

    move-result v5

    invoke-virtual {p1}, Lg0/c0;->g()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {p1}, Lg0/c0;->a()Landroidx/camera/core/impl/s;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lg0/c0;->k(Landroidx/camera/core/o;Landroidx/camera/core/impl/utils/h;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Landroidx/camera/core/impl/s;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg0/c0;

    invoke-virtual {p0, p1}, Ly/u;->a(Lg0/c0;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method
