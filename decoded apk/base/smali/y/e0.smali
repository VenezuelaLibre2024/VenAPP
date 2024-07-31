.class public Ly/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/e0$a;,
        Ly/e0$b;
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Executor;

.field final b:Lg0/z;

.field private c:Ly/e0$a;

.field private d:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Ly/e0$b;",
            "Lg0/c0<",
            "Landroidx/camera/core/o;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Ly/p$a;",
            "Lg0/c0<",
            "[B>;>;"
        }
    .end annotation
.end field

.field private f:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Ly/h$a;",
            "Lg0/c0<",
            "[B>;>;"
        }
    .end annotation
.end field

.field private g:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Ly/t$a;",
            "Landroidx/camera/core/n$h;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Lg0/c0<",
            "[B>;",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private i:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Lg0/c0<",
            "Landroidx/camera/core/o;",
            ">;",
            "Landroidx/camera/core/o;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Lg0/c0<",
            "[B>;",
            "Lg0/c0<",
            "Landroidx/camera/core/o;",
            ">;>;"
        }
    .end annotation
.end field

.field private k:Lg0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg0/b0<",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lg0/z;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ld0/f;

    invoke-static {v0}, Ld0/b;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p1}, Lz/a;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Ly/e0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ly/e0;->b:Lg0/z;

    return-void
.end method

.method public static synthetic a(Ly/e0;Ly/e0$b;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/e0;->j(Ly/e0$b;)V

    return-void
.end method

.method public static synthetic b(Ly/e0;Ly/e0$b;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/e0;->k(Ly/e0$b;)V

    return-void
.end method

.method public static synthetic c(Ly/f0;Landroidx/camera/core/n$h;)V
    .locals 0

    invoke-static {p0, p1}, Ly/e0;->h(Ly/f0;Landroidx/camera/core/n$h;)V

    return-void
.end method

.method public static synthetic d(Ly/f0;Landroidx/camera/core/o;)V
    .locals 0

    invoke-static {p0, p1}, Ly/e0;->g(Ly/f0;Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic e(Ly/f0;Lw/g0;)V
    .locals 0

    invoke-static {p0, p1}, Ly/e0;->i(Ly/f0;Lw/g0;)V

    return-void
.end method

.method private f(Lg0/c0;I)Lg0/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "[B>;I)",
            "Lg0/c0<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, Lg0/c0;->e()I

    move-result v0

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    iget-object v0, p0, Ly/e0;->h:Lg0/b0;

    invoke-interface {v0, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    iget-object v0, p0, Ly/e0;->k:Lg0/b0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    :cond_1
    iget-object v0, p0, Ly/e0;->f:Lg0/b0;

    invoke-static {p1, p2}, Ly/h$a;->c(Lg0/c0;I)Ly/h$a;

    move-result-object p1

    invoke-interface {v0, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    return-object p1
.end method

.method private static synthetic g(Ly/f0;Landroidx/camera/core/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly/f0;->m(Landroidx/camera/core/o;)V

    return-void
.end method

.method private static synthetic h(Ly/f0;Landroidx/camera/core/n$h;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly/f0;->l(Landroidx/camera/core/n$h;)V

    return-void
.end method

.method private static synthetic i(Ly/f0;Lw/g0;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly/f0;->o(Lw/g0;)V

    return-void
.end method

.method private synthetic j(Ly/e0$b;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly/e0;->m(Ly/e0$b;)V

    return-void
.end method

.method private synthetic k(Ly/e0$b;)V
    .locals 2

    invoke-virtual {p1}, Ly/e0$b;->b()Ly/f0;

    move-result-object v0

    invoke-virtual {v0}, Ly/f0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ly/e0;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ly/a0;

    invoke-direct {v1, p0, p1}, Ly/a0;-><init>(Ly/e0;Ly/e0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static p(Ly/f0;Lw/g0;)V
    .locals 2

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Ly/d0;

    invoke-direct {v1, p0, p1}, Ly/d0;-><init>(Ly/f0;Lw/g0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method l(Ly/e0$b;)Landroidx/camera/core/o;
    .locals 3

    invoke-virtual {p1}, Ly/e0$b;->b()Ly/f0;

    move-result-object v0

    iget-object v1, p0, Ly/e0;->d:Lg0/b0;

    invoke-interface {v1, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    invoke-virtual {p1}, Lg0/c0;->e()I

    move-result v1

    const/16 v2, 0x23

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Ly/e0;->k:Lg0/b0;

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Ly/e0;->c:Ly/e0$a;

    invoke-virtual {v1}, Ly/e0$a;->c()I

    move-result v1

    const/16 v2, 0x100

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Ly/e0;->e:Lg0/b0;

    invoke-virtual {v0}, Ly/f0;->c()I

    move-result v2

    invoke-static {p1, v2}, Ly/p$a;->c(Lg0/c0;I)Ly/p$a;

    move-result-object p1

    invoke-interface {v1, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    iget-object v1, p0, Ly/e0;->k:Lg0/b0;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ly/f0;->c()I

    move-result v0

    invoke-direct {p0, p1, v0}, Ly/e0;->f(Lg0/c0;I)Lg0/c0;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Ly/e0;->j:Lg0/b0;

    invoke-interface {v0, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    :cond_2
    iget-object v0, p0, Ly/e0;->i:Lg0/b0;

    invoke-interface {v0, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/o;

    return-object p1
.end method

.method m(Ly/e0$b;)V
    .locals 4

    invoke-virtual {p1}, Ly/e0$b;->b()Ly/f0;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Ly/e0$b;->b()Ly/f0;

    move-result-object v2

    invoke-virtual {v2}, Ly/f0;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1}, Ly/e0;->l(Ly/e0$b;)Landroidx/camera/core/o;

    move-result-object p1

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Ly/b0;

    invoke-direct {v3, v0, p1}, Ly/b0;-><init>(Ly/f0;Landroidx/camera/core/o;)V

    :goto_0
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p1}, Ly/e0;->n(Ly/e0$b;)Landroidx/camera/core/n$h;

    move-result-object p1

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Ly/c0;

    invoke-direct {v3, v0, p1}, Ly/c0;-><init>(Ly/f0;Landroidx/camera/core/n$h;)V
    :try_end_0
    .catch Lw/g0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v2, Lw/g0;

    const-string v3, "Processing failed."

    invoke-direct {v2, v1, v3, p1}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception p1

    new-instance v2, Lw/g0;

    const-string v3, "Processing failed due to low memory."

    invoke-direct {v2, v1, v3, p1}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {v0, v2}, Ly/e0;->p(Ly/f0;Lw/g0;)V

    goto :goto_2

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Ly/e0;->p(Ly/f0;Lw/g0;)V

    :goto_2
    return-void
.end method

.method n(Ly/e0$b;)Landroidx/camera/core/n$h;
    .locals 4

    iget-object v0, p0, Ly/e0;->c:Ly/e0$a;

    invoke-virtual {v0}, Ly/e0$a;->c()I

    move-result v0

    const/16 v1, 0x100

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    iget-object v2, p0, Ly/e0;->c:Ly/e0$a;

    invoke-virtual {v2}, Ly/e0$a;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    const-string v2, "On-disk capture only support JPEG output format. Output format: %s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ly/e0$b;->b()Ly/f0;

    move-result-object v0

    iget-object v1, p0, Ly/e0;->d:Lg0/b0;

    invoke-interface {v1, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    iget-object v1, p0, Ly/e0;->e:Lg0/b0;

    invoke-virtual {v0}, Ly/f0;->c()I

    move-result v2

    invoke-static {p1, v2}, Ly/p$a;->c(Lg0/c0;I)Ly/p$a;

    move-result-object p1

    invoke-interface {v1, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/c0;

    invoke-virtual {p1}, Lg0/c0;->i()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ly/e0;->k:Lg0/b0;

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {v0}, Ly/f0;->c()I

    move-result v1

    invoke-direct {p0, p1, v1}, Ly/e0;->f(Lg0/c0;I)Lg0/c0;

    move-result-object p1

    :cond_2
    iget-object v1, p0, Ly/e0;->g:Lg0/b0;

    invoke-virtual {v0}, Ly/f0;->d()Landroidx/camera/core/n$g;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0}, Ly/t$a;->c(Lg0/c0;Landroidx/camera/core/n$g;)Ly/t$a;

    move-result-object p1

    invoke-interface {v1, p1}, Lg0/b0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/n$h;

    return-object p1
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public q(Ly/e0$a;)Ljava/lang/Void;
    .locals 2

    iput-object p1, p0, Ly/e0;->c:Ly/e0$a;

    invoke-virtual {p1}, Ly/e0$a;->a()Lg0/v;

    move-result-object v0

    new-instance v1, Ly/z;

    invoke-direct {v1, p0}, Ly/z;-><init>(Ly/e0;)V

    invoke-virtual {v0, v1}, Lg0/v;->a(Landroidx/core/util/a;)V

    new-instance v0, Ly/y;

    invoke-direct {v0}, Ly/y;-><init>()V

    iput-object v0, p0, Ly/e0;->d:Lg0/b0;

    new-instance v0, Ly/p;

    invoke-direct {v0}, Ly/p;-><init>()V

    iput-object v0, p0, Ly/e0;->e:Lg0/b0;

    new-instance v0, Ly/s;

    invoke-direct {v0}, Ly/s;-><init>()V

    iput-object v0, p0, Ly/e0;->h:Lg0/b0;

    new-instance v0, Ly/h;

    invoke-direct {v0}, Ly/h;-><init>()V

    iput-object v0, p0, Ly/e0;->f:Lg0/b0;

    new-instance v0, Ly/t;

    invoke-direct {v0}, Ly/t;-><init>()V

    iput-object v0, p0, Ly/e0;->g:Lg0/b0;

    new-instance v0, Ly/v;

    invoke-direct {v0}, Ly/v;-><init>()V

    iput-object v0, p0, Ly/e0;->i:Lg0/b0;

    invoke-virtual {p1}, Ly/e0$a;->b()I

    move-result p1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Ly/e0;->b:Lg0/z;

    if-eqz p1, :cond_1

    :cond_0
    new-instance p1, Ly/u;

    invoke-direct {p1}, Ly/u;-><init>()V

    iput-object p1, p0, Ly/e0;->j:Lg0/b0;

    :cond_1
    iget-object p1, p0, Ly/e0;->b:Lg0/z;

    if-eqz p1, :cond_2

    new-instance v0, Ly/i;

    invoke-direct {v0, p1}, Ly/i;-><init>(Lg0/z;)V

    iput-object v0, p0, Ly/e0;->k:Lg0/b0;

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
