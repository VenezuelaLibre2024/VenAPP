.class public Ly/v;
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
        "Landroidx/camera/core/o;",
        ">;",
        "Landroidx/camera/core/o;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg0/c0;)Landroidx/camera/core/o;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "Landroidx/camera/core/o;",
            ">;)",
            "Landroidx/camera/core/o;"
        }
    .end annotation

    invoke-virtual {p1}, Lg0/c0;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/o;

    invoke-interface {v0}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v1

    invoke-interface {v1}, Lw/h0;->b()Landroidx/camera/core/impl/f2;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v2

    invoke-interface {v2}, Lw/h0;->c()J

    move-result-wide v2

    invoke-virtual {p1}, Lg0/c0;->f()I

    move-result v4

    invoke-virtual {p1}, Lg0/c0;->g()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, Lw/m0;->e(Landroidx/camera/core/impl/f2;JILandroid/graphics/Matrix;)Lw/h0;

    move-result-object v1

    new-instance v2, Landroidx/camera/core/u;

    invoke-virtual {p1}, Lg0/c0;->h()Landroid/util/Size;

    move-result-object v3

    invoke-direct {v2, v0, v3, v1}, Landroidx/camera/core/u;-><init>(Landroidx/camera/core/o;Landroid/util/Size;Lw/h0;)V

    invoke-virtual {p1}, Lg0/c0;->b()Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {v2, p1}, Landroidx/camera/core/o;->Z(Landroid/graphics/Rect;)V

    return-object v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg0/c0;

    invoke-virtual {p0, p1}, Ly/v;->a(Lg0/c0;)Landroidx/camera/core/o;

    move-result-object p1

    return-object p1
.end method
