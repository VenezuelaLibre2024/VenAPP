.class public abstract Landroidx/camera/core/impl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroidx/camera/core/impl/d2;ILandroid/util/Size;Lw/y;Ljava/util/List;Landroidx/camera/core/impl/n0;Landroid/util/Range;)Landroidx/camera/core/impl/a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/d2;",
            "I",
            "Landroid/util/Size;",
            "Lw/y;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;",
            "Landroidx/camera/core/impl/n0;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/core/impl/a;"
        }
    .end annotation

    new-instance v8, Landroidx/camera/core/impl/b;

    move-object v0, v8

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/impl/b;-><init>(Landroidx/camera/core/impl/d2;ILandroid/util/Size;Lw/y;Ljava/util/List;Landroidx/camera/core/impl/n0;Landroid/util/Range;)V

    return-object v8
.end method


# virtual methods
.method public abstract b()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Lw/y;
.end method

.method public abstract d()I
.end method

.method public abstract e()Landroidx/camera/core/impl/n0;
.end method

.method public abstract f()Landroid/util/Size;
.end method

.method public abstract g()Landroidx/camera/core/impl/d2;
.end method

.method public abstract h()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public i(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/impl/a;->f()Landroid/util/Size;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/core/impl/b2;->a(Landroid/util/Size;)Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/impl/a;->c()Lw/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/b2$a;->b(Lw/y;)Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/camera/core/impl/a;->h()Landroid/util/Range;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/a;->h()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/b2$a;->c(Landroid/util/Range;)Landroidx/camera/core/impl/b2$a;

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object p1

    return-object p1
.end method
