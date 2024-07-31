.class public abstract Ly/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/v0$a;
    }
.end annotation


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le0/a;

    invoke-direct {v0}, Le0/a;-><init>()V

    invoke-virtual {v0}, Le0/a;->a()I

    move-result v0

    iput v0, p0, Ly/v0;->a:I

    return-void
.end method

.method public static synthetic a(Ly/v0;Lw/g0;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/v0;->o(Lw/g0;)V

    return-void
.end method

.method public static synthetic b(Ly/v0;Landroidx/camera/core/n$h;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/v0;->p(Landroidx/camera/core/n$h;)V

    return-void
.end method

.method public static synthetic c(Ly/v0;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/v0;->q(Landroidx/camera/core/o;)V

    return-void
.end method

.method private synthetic o(Lw/g0;)V
    .locals 4

    invoke-virtual {p0}, Ly/v0;->h()Landroidx/camera/core/n$e;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Ly/v0;->j()Landroidx/camera/core/n$f;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Ly/v0;->h()Landroidx/camera/core/n$e;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Landroidx/camera/core/n$e;->b(Lw/g0;)V

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    if-nez v0, :cond_3

    invoke-virtual {p0}, Ly/v0;->j()Landroidx/camera/core/n$f;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/n$f;

    invoke-interface {v0, p1}, Landroidx/camera/core/n$f;->a(Lw/g0;)V

    :goto_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "One and only one callback is allowed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private synthetic p(Landroidx/camera/core/n$h;)V
    .locals 1

    invoke-virtual {p0}, Ly/v0;->j()Landroidx/camera/core/n$f;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/n$f;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Landroidx/camera/core/n$f;->b(Landroidx/camera/core/n$h;)V

    return-void
.end method

.method private synthetic q(Landroidx/camera/core/o;)V
    .locals 1

    invoke-virtual {p0}, Ly/v0;->h()Landroidx/camera/core/n$e;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroidx/camera/core/o;

    invoke-virtual {v0, p1}, Landroidx/camera/core/n$e;->a(Landroidx/camera/core/o;)V

    return-void
.end method


# virtual methods
.method d()Z
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget v0, p0, Ly/v0;->a:I

    if-lez v0, :cond_0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ly/v0;->a:I

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method abstract e()Ljava/util/concurrent/Executor;
.end method

.method abstract f()I
.end method

.method abstract g()Landroid/graphics/Rect;
.end method

.method abstract h()Landroidx/camera/core/n$e;
.end method

.method abstract i()I
.end method

.method abstract j()Landroidx/camera/core/n$f;
.end method

.method abstract k()Landroidx/camera/core/n$g;
.end method

.method abstract l()I
.end method

.method abstract m()Landroid/graphics/Matrix;
.end method

.method abstract n()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k;",
            ">;"
        }
    .end annotation
.end method

.method r(Lw/g0;)V
    .locals 2

    invoke-virtual {p0}, Ly/v0;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Ly/s0;

    invoke-direct {v1, p0, p1}, Ly/s0;-><init>(Ly/v0;Lw/g0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method s(Landroidx/camera/core/n$h;)V
    .locals 2

    invoke-virtual {p0}, Ly/v0;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Ly/t0;

    invoke-direct {v1, p0, p1}, Ly/t0;-><init>(Ly/v0;Landroidx/camera/core/n$h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method t(Landroidx/camera/core/o;)V
    .locals 2

    invoke-virtual {p0}, Ly/v0;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Ly/u0;

    invoke-direct {v1, p0, p1}, Ly/u0;-><init>(Ly/v0;Landroidx/camera/core/o;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
