.class Lg0/n0$a;
.super Landroidx/camera/core/impl/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final o:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field p:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field private q:Landroidx/camera/core/impl/r0;


# direct methods
.method constructor <init>(Landroid/util/Size;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/impl/r0;-><init>(Landroid/util/Size;I)V

    new-instance p1, Lg0/l0;

    invoke-direct {p1, p0}, Lg0/l0;-><init>(Lg0/n0$a;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Lg0/n0$a;->o:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method private synthetic n(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg0/n0$a;->p:Landroidx/concurrent/futures/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SettableFuture hashCode: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic t(Lg0/n0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lg0/n0$a;->n(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected r()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/n0$a;->o:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method

.method u()Z
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Lg0/n0$a;->q:Landroidx/camera/core/impl/r0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/r0;->m()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v(Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)Z
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg0/n0$a;->q:Landroidx/camera/core/impl/r0;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const-string v3, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider"

    invoke-static {v0, v3}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "The provider\'s size must match the parent"

    invoke-static {v0, v3}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/r0;->i()I

    move-result v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->i()I

    move-result v3

    if-ne v0, v3, :cond_2

    move v1, v2

    :cond_2
    const-string v0, "The provider\'s format must match the parent"

    invoke-static {v1, v0}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/r0;->m()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Lg0/n0$a;->q:Landroidx/camera/core/impl/r0;

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->j()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    iget-object v1, p0, Lg0/n0$a;->p:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1}, La0/f;->k(Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->l()V

    invoke-virtual {p0}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Lg0/m0;

    invoke-direct {v1, p1}, Lg0/m0;-><init>(Landroidx/camera/core/impl/r0;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->f()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return v2
.end method
