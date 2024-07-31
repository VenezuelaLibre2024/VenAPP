.class public final Landroidx/camera/camera2/Camera2Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/Camera2Config$DefaultProvider;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/Context;)Landroidx/camera/core/impl/l2;
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/Camera2Config;->e(Landroid/content/Context;)Landroidx/camera/core/impl/l2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Landroidx/camera/core/impl/z;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/camera2/Camera2Config;->d(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Landroidx/camera/core/impl/z;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lw/w;
    .locals 4

    new-instance v0, Lp/a;

    invoke-direct {v0}, Lp/a;-><init>()V

    new-instance v1, Lp/b;

    invoke-direct {v1}, Lp/b;-><init>()V

    new-instance v2, Lp/c;

    invoke-direct {v2}, Lp/c;-><init>()V

    new-instance v3, Lw/w$a;

    invoke-direct {v3}, Lw/w$a;-><init>()V

    invoke-virtual {v3, v0}, Lw/w$a;->c(Landroidx/camera/core/impl/a0$a;)Lw/w$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lw/w$a;->d(Landroidx/camera/core/impl/z$a;)Lw/w$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lw/w$a;->g(Landroidx/camera/core/impl/l2$c;)Lw/w$a;

    move-result-object v0

    invoke-virtual {v0}, Lw/w$a;->a()Lw/w;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Landroidx/camera/core/impl/z;
    .locals 1

    :try_start_0
    new-instance v0, Landroidx/camera/camera2/internal/g1;

    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/camera2/internal/g1;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V
    :try_end_0
    .catch Lw/r; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lw/n0;

    invoke-direct {p1, p0}, Lw/n0;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static synthetic e(Landroid/content/Context;)Landroidx/camera/core/impl/l2;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/k1;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/k1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
