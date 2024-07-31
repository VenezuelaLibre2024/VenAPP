.class public Ly/i;
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
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lg0/c0<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lg0/z;


# direct methods
.method constructor <init>(Lg0/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/i;->a:Lg0/z;

    return-void
.end method


# virtual methods
.method public a(Lg0/c0;)Lg0/c0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly/i;->a:Lg0/z;

    new-instance v1, Lg0/w;

    new-instance v2, Ly/j0;

    invoke-direct {v2, p1}, Ly/j0;-><init>(Lg0/c0;)V

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lg0/w;-><init>(Landroidx/camera/core/o;I)V

    invoke-virtual {v0, v1}, Lg0/z;->e(Lw/k0$a;)Lw/k0$b;

    move-result-object v0

    invoke-interface {v0}, Lw/k0$b;->a()Landroidx/camera/core/o;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/camera/core/o;

    invoke-interface {v1}, Landroidx/camera/core/o;->u0()[Landroidx/camera/core/o$a;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/o;->getWidth()I

    move-result v2

    invoke-interface {v0}, Landroidx/camera/core/o;->getHeight()I

    move-result v0

    invoke-static {v1, v2, v0}, Lf0/b;->a([Landroidx/camera/core/o$a;II)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p1}, Lg0/c0;->d()Landroidx/camera/core/impl/utils/h;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lg0/c0;->b()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, Lg0/c0;->f()I

    move-result v6

    invoke-virtual {p1}, Lg0/c0;->g()Landroid/graphics/Matrix;

    move-result-object v7

    invoke-virtual {p1}, Lg0/c0;->a()Landroidx/camera/core/impl/s;

    move-result-object v8

    invoke-static/range {v3 .. v8}, Lg0/c0;->j(Landroid/graphics/Bitmap;Landroidx/camera/core/impl/utils/h;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Landroidx/camera/core/impl/s;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg0/c0;

    invoke-virtual {p0, p1}, Ly/i;->a(Lg0/c0;)Lg0/c0;

    move-result-object p1

    return-object p1
.end method
