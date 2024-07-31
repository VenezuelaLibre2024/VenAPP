.class public final Landroidx/camera/camera2/internal/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/camera/camera2/internal/compat/h;)Lw/r;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/compat/h;->d()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x6

    :cond_1
    :goto_0
    new-instance v0, Lw/r;

    invoke-direct {v0, v1, p0}, Lw/r;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method
