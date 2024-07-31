.class public interface abstract Landroidx/camera/core/impl/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/s$a;
    }
.end annotation


# virtual methods
.method public a(Landroidx/camera/core/impl/utils/j$b;)V
    .locals 1

    invoke-interface {p0}, Landroidx/camera/core/impl/s;->d()Landroidx/camera/core/impl/r;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/j$b;->g(Landroidx/camera/core/impl/r;)Landroidx/camera/core/impl/utils/j$b;

    return-void
.end method

.method public abstract b()Landroidx/camera/core/impl/f2;
.end method

.method public abstract c()J
.end method

.method public abstract d()Landroidx/camera/core/impl/r;
.end method

.method public e()Landroid/hardware/camera2/CaptureResult;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/s$a;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object v0

    return-object v0
.end method

.method public abstract f()Landroidx/camera/core/impl/p;
.end method

.method public abstract g()Landroidx/camera/core/impl/q;
.end method

.method public abstract h()Landroidx/camera/core/impl/n;
.end method
