.class Ly/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/o$b;,
        Ly/o$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field b:Ly/f0;

.field c:Landroidx/camera/core/t;

.field private d:Ly/o$c;

.field private e:Ly/o$b;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ly/o;->a:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Ly/o;->b:Ly/f0;

    return-void
.end method

.method public static synthetic a(Ly/o;Ly/x;Ly/f0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly/o;->e(Ly/x;Ly/f0;)V

    return-void
.end method

.method public static synthetic b(Ly/o;Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/o;->f(Landroidx/camera/core/impl/g1;)V

    return-void
.end method

.method private static c(Lw/l0;III)Landroidx/camera/core/impl/g1;
    .locals 7

    if-eqz p0, :cond_0

    const/4 v4, 0x4

    const-wide/16 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v6}, Lw/l0;->a(IIIIJ)Landroidx/camera/core/impl/g1;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x4

    invoke-static {p1, p2, p3, p0}, Landroidx/camera/core/p;->a(IIII)Landroidx/camera/core/impl/g1;

    move-result-object p0

    return-object p0
.end method

.method private synthetic e(Ly/x;Ly/f0;)V
    .locals 0

    invoke-virtual {p0, p2}, Ly/o;->i(Ly/f0;)V

    invoke-virtual {p1, p2}, Ly/x;->h(Ly/f0;)V

    return-void
.end method

.method private synthetic f(Landroidx/camera/core/impl/g1;)V
    .locals 3

    const-string v0, "Failed to acquire latest image"

    const/4 v1, 0x2

    :try_start_0
    invoke-interface {p1}, Landroidx/camera/core/impl/g1;->b()Landroidx/camera/core/o;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ly/o;->h(Landroidx/camera/core/o;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lw/g0;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v0, v2}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Ly/o;->l(Lw/g0;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v2, Lw/g0;

    invoke-direct {v2, v1, v0, p1}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Ly/o;->l(Lw/g0;)V

    :goto_0
    return-void
.end method

.method private g(Landroidx/camera/core/o;)V
    .locals 4

    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v0

    invoke-interface {v0}, Lw/h0;->b()Landroidx/camera/core/impl/f2;

    move-result-object v0

    iget-object v1, p0, Ly/o;->b:Ly/f0;

    invoke-virtual {v1}, Ly/f0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/f2;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Ly/o;->a:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received an unexpected stage id"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v1, p0, Ly/o;->a:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Ly/o;->d:Ly/o$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ly/o$c;->a()Lg0/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg0/v;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Ly/o;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ly/o;->b:Ly/f0;

    const/4 v0, 0x0

    iput-object v0, p0, Ly/o;->b:Ly/f0;

    invoke-virtual {p1}, Ly/f0;->n()V

    :cond_0
    return-void
.end method

.method private k(Ly/o$b;Landroidx/camera/core/t;)V
    .locals 1

    invoke-virtual {p1}, Ly/o$b;->h()Landroidx/camera/core/impl/r0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->d()V

    invoke-virtual {p1}, Ly/o$b;->h()Landroidx/camera/core/impl/r0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroidx/camera/camera2/internal/y3;

    invoke-direct {v0, p2}, Landroidx/camera/camera2/internal/y3;-><init>(Landroidx/camera/core/t;)V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/o;->c:Landroidx/camera/core/t;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The ImageReader is not initialized."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Ly/o;->c:Landroidx/camera/core/t;

    invoke-virtual {v0}, Landroidx/camera/core/t;->i()I

    move-result v0

    return v0
.end method

.method h(Landroidx/camera/core/o;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/o;->b:Ly/f0;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CaptureNode"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/o;->close()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Ly/o;->g(Landroidx/camera/core/o;)V

    :goto_0
    return-void
.end method

.method i(Ly/f0;)V
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p0}, Ly/o;->d()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Too many acquire images. Close image to be able to process next."

    invoke-static {v0, v3}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Ly/o;->b:Ly/f0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ly/o;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    const-string v0, "The previous request is not complete"

    invoke-static {v1, v0}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Ly/o;->b:Ly/f0;

    iget-object v0, p0, Ly/o;->a:Ljava/util/Set;

    invoke-virtual {p1}, Ly/f0;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Ly/o;->d:Ly/o$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ly/o$c;->d()Lg0/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg0/v;->accept(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ly/f0;->a()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ly/o$a;

    invoke-direct {v1, p0, p1}, Ly/o$a;-><init>(Ly/o;Ly/f0;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public j()V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/o;->e:Ly/o$b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ly/o;->c:Landroidx/camera/core/t;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Ly/o;->k(Ly/o$b;Landroidx/camera/core/t;)V

    return-void
.end method

.method l(Lw/g0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/o;->b:Ly/f0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ly/f0;->k(Lw/g0;)V

    :cond_0
    return-void
.end method

.method public m(Landroidx/camera/core/e$a;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/o;->c:Landroidx/camera/core/t;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The ImageReader is not initialized."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Ly/o;->c:Landroidx/camera/core/t;

    invoke-virtual {v0, p1}, Landroidx/camera/core/t;->m(Landroidx/camera/core/e$a;)V

    return-void
.end method

.method public n(Ly/o$b;)Ly/o$c;
    .locals 5

    iget-object v0, p0, Ly/o;->e:Ly/o$b;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Ly/o;->c:Landroidx/camera/core/t;

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "CaptureNode does not support recreation yet."

    invoke-static {v0, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Ly/o;->e:Ly/o$b;

    invoke-virtual {p1}, Ly/o$b;->g()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Ly/o$b;->d()I

    move-result v2

    invoke-virtual {p1}, Ly/o$b;->i()Z

    move-result v3

    xor-int/2addr v1, v3

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ly/o$b;->c()Lw/l0;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Landroidx/camera/core/q;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    const/4 v4, 0x4

    invoke-direct {v1, v3, v0, v2, v4}, Landroidx/camera/core/q;-><init>(IIII)V

    invoke-virtual {v1}, Landroidx/camera/core/q;->m()Landroidx/camera/core/impl/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Ly/o$b;->k(Landroidx/camera/core/impl/k;)V

    new-instance v0, Ly/k;

    invoke-direct {v0, p0}, Ly/k;-><init>(Ly/o;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ly/x;

    invoke-virtual {p1}, Ly/o$b;->c()Lw/l0;

    move-result-object v3

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-static {v3, v4, v0, v2}, Ly/o;->c(Lw/l0;III)Landroidx/camera/core/impl/g1;

    move-result-object v0

    invoke-direct {v1, v0}, Ly/x;-><init>(Landroidx/camera/core/impl/g1;)V

    new-instance v0, Ly/l;

    invoke-direct {v0, p0, v1}, Ly/l;-><init>(Ly/o;Ly/x;)V

    :goto_1
    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->getSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ly/o$b;->l(Landroid/view/Surface;)V

    new-instance v2, Landroidx/camera/core/t;

    invoke-direct {v2, v1}, Landroidx/camera/core/t;-><init>(Landroidx/camera/core/impl/g1;)V

    iput-object v2, p0, Ly/o;->c:Landroidx/camera/core/t;

    new-instance v2, Ly/m;

    invoke-direct {v2, p0}, Ly/m;-><init>(Ly/o;)V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroidx/camera/core/impl/g1;->f(Landroidx/camera/core/impl/g1$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Ly/o$b;->f()Lg0/v;

    move-result-object v1

    invoke-virtual {v1, v0}, Lg0/v;->a(Landroidx/core/util/a;)V

    invoke-virtual {p1}, Ly/o$b;->b()Lg0/v;

    move-result-object v0

    new-instance v1, Ly/n;

    invoke-direct {v1, p0}, Ly/n;-><init>(Ly/o;)V

    invoke-virtual {v0, v1}, Lg0/v;->a(Landroidx/core/util/a;)V

    invoke-virtual {p1}, Ly/o$b;->d()I

    move-result v0

    invoke-virtual {p1}, Ly/o$b;->e()I

    move-result p1

    invoke-static {v0, p1}, Ly/o$c;->e(II)Ly/o$c;

    move-result-object p1

    iput-object p1, p0, Ly/o;->d:Ly/o$c;

    return-object p1
.end method
