.class Landroidx/camera/camera2/internal/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final v:[Landroid/hardware/camera2/params/MeteringRectangle;


# instance fields
.field private final a:Landroidx/camera/camera2/internal/u;

.field final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private volatile d:Z

.field private volatile e:Landroid/util/Rational;

.field private final f:Lt/m;

.field private g:Z

.field h:Ljava/lang/Integer;

.field private i:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private j:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field k:J

.field l:Z

.field m:Z

.field private n:I

.field private o:Landroidx/camera/camera2/internal/u$c;

.field private p:Landroidx/camera/camera2/internal/u$c;

.field private q:[Landroid/hardware/camera2/params/MeteringRectangle;

.field private r:[Landroid/hardware/camera2/params/MeteringRectangle;

.field private s:[Landroid/hardware/camera2/params/MeteringRectangle;

.field t:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field u:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/hardware/camera2/params/MeteringRectangle;

    sput-object v0, Landroidx/camera/camera2/internal/h2;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    return-void
.end method

.method constructor <init>(Landroidx/camera/camera2/internal/u;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/t1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->e:Landroid/util/Rational;

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->g:Z

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/camera2/internal/h2;->h:Ljava/lang/Integer;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Landroidx/camera/camera2/internal/h2;->k:J

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->l:Z

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->m:Z

    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/camera2/internal/h2;->n:I

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->o:Landroidx/camera/camera2/internal/u$c;

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->p:Landroidx/camera/camera2/internal/u$c;

    sget-object v0, Landroidx/camera/camera2/internal/h2;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->t:Landroidx/concurrent/futures/c$a;

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    iput-object p3, p0, Landroidx/camera/camera2/internal/h2;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/camera/camera2/internal/h2;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lt/m;

    invoke-direct {p1, p4}, Lt/m;-><init>(Landroidx/camera/core/impl/t1;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->f:Lt/m;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/h2;IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/h2;->l(IJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->j:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->j:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    iput-object v1, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->i:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/h2;->i:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->o:Landroidx/camera/camera2/internal/u$c;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/u;->W(Landroidx/camera/camera2/internal/u$c;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->t:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    new-instance v1, Lw/j$a;

    invoke-direct {v1, p1}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->t:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method private j(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    iget-object v1, p0, Landroidx/camera/camera2/internal/h2;->p:Landroidx/camera/camera2/internal/u$c;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/u;->W(Landroidx/camera/camera2/internal/u$c;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    new-instance v1, Lw/j$a;

    invoke-direct {v1, p1}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    :cond_0
    return-void
.end method

.method private synthetic l(IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p4, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    invoke-static {p4, p2, p3}, Landroidx/camera/camera2/internal/u;->L(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/h2;->g()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private p()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method b(Lq/a$a;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/h2;->k()I

    move-result v0

    :goto_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v2, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v2, v0}, Landroidx/camera/camera2/internal/u;->C(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_1

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_2

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/h2;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_3

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_3
    return-void
.end method

.method c(ZZ)V
    .locals 4

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/l0$a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->s(Z)V

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->n:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->r(I)V

    new-instance v1, Lq/a$a;

    invoke-direct {v1}, Lq/a$a;-><init>()V

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, p1, v3}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_1
    if-eqz p2, :cond_2

    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_2
    invoke-virtual {v1}, Lq/a$a;->c()Lq/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/u;->c0(Ljava/util/List;)V

    return-void
.end method

.method d(Landroidx/concurrent/futures/c$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Cancelled by another cancelFocusAndMetering()"

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/h2;->j(Ljava/lang/String;)V

    const-string v0, "Cancelled by cancelFocusAndMetering()"

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/h2;->i(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    invoke-direct {p0}, Landroidx/camera/camera2/internal/h2;->h()V

    invoke-direct {p0}, Landroidx/camera/camera2/internal/h2;->f()V

    invoke-direct {p0}, Landroidx/camera/camera2/internal/h2;->p()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/h2;->c(ZZ)V

    :cond_0
    sget-object p1, Landroidx/camera/camera2/internal/h2;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->g:Z

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->f0()J

    move-result-wide v0

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->u:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/h2;->k()I

    move-result v2

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/u;->C(I)I

    move-result p1

    new-instance v2, Landroidx/camera/camera2/internal/g2;

    invoke-direct {v2, p0, p1, v0, v1}, Landroidx/camera/camera2/internal/g2;-><init>(Landroidx/camera/camera2/internal/h2;IJ)V

    iput-object v2, p0, Landroidx/camera/camera2/internal/h2;->p:Landroidx/camera/camera2/internal/u$c;

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/u;->t(Landroidx/camera/camera2/internal/u$c;)V

    :cond_1
    return-void
.end method

.method e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/h2;->d(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method k()I
    .locals 2

    iget v0, p0, Landroidx/camera/camera2/internal/h2;->n:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    return v0

    :cond_0
    return v1
.end method

.method m(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    iget-boolean p1, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/h2;->e()V

    :cond_1
    return-void
.end method

.method public n(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2;->e:Landroid/util/Rational;

    return-void
.end method

.method o(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/camera2/internal/h2;->n:I

    return-void
.end method

.method q(Landroidx/concurrent/futures/c$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lw/j$a;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/l0$a;-><init>()V

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->n:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->r(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->s(Z)V

    new-instance v2, Lq/a$a;

    invoke-direct {v2}, Lq/a$a;-><init>()V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    invoke-virtual {v2}, Lq/a$a;->c()Lq/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    new-instance v1, Landroidx/camera/camera2/internal/h2$b;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/h2$b;-><init>(Landroidx/camera/camera2/internal/h2;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/u;->c0(Ljava/util/List;)V

    return-void
.end method

.method r(Landroidx/concurrent/futures/c$a;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Landroidx/camera/core/impl/s;",
            ">;Z)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/h2;->d:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p2, Lw/j$a;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/l0$a;-><init>()V

    iget v1, p0, Landroidx/camera/camera2/internal/h2;->n:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->r(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/l0$a;->s(Z)V

    new-instance v2, Lq/a$a;

    invoke-direct {v2}, Lq/a$a;-><init>()V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    if-eqz p2, :cond_2

    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v3, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v3, v1}, Landroidx/camera/camera2/internal/u;->B(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, p2, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_2
    invoke-virtual {v2}, Lq/a$a;->c()Lq/a;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    new-instance p2, Landroidx/camera/camera2/internal/h2$a;

    invoke-direct {p2, p0, p1}, Landroidx/camera/camera2/internal/h2$a;-><init>(Landroidx/camera/camera2/internal/h2;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {v0, p2}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/h2;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/u;->c0(Ljava/util/List;)V

    return-void
.end method
