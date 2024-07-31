.class public final Lw/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/x$a;
    }
.end annotation


# direct methods
.method static varargs a([Landroidx/camera/core/impl/m0;)Landroidx/camera/core/impl/k0;
    .locals 1

    new-instance v0, Lw/x$a;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lw/x$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Landroidx/camera/core/impl/k0;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Landroidx/camera/core/impl/m0;

    new-instance v1, Landroidx/camera/core/impl/m0$a;

    invoke-direct {v1}, Landroidx/camera/core/impl/m0$a;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lw/x;->a([Landroidx/camera/core/impl/m0;)Landroidx/camera/core/impl/k0;

    move-result-object v0

    return-object v0
.end method
