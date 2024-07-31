.class public interface abstract Landroidx/camera/core/impl/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/i;
.implements Landroidx/camera/core/w$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/c0$a;
    }
.end annotation


# virtual methods
.method public a()Lw/j;
    .locals 1

    invoke-interface {p0}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object v0

    return-object v0
.end method

.method public b()Lw/o;
    .locals 1

    invoke-interface {p0}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()Landroidx/camera/core/impl/y;
.end method

.method public e()Landroidx/camera/core/impl/u;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/x;->a()Landroidx/camera/core/impl/u;

    move-result-object v0

    return-object v0
.end method

.method public f(Z)V
    .locals 0

    return-void
.end method

.method public abstract g(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract h(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract i()Landroidx/camera/core/impl/b0;
.end method

.method public j()Z
    .locals 1

    invoke-interface {p0}, Landroidx/camera/core/impl/c0;->b()Lw/o;

    move-result-object v0

    invoke-interface {v0}, Lw/o;->getLensFacing()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(Landroidx/camera/core/impl/u;)V
    .locals 0

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
