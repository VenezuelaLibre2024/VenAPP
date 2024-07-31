.class public Landroidx/camera/camera2/internal/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/u$a;,
        Landroidx/camera/camera2/internal/u$b;,
        Landroidx/camera/camera2/internal/u$c;
    }
.end annotation


# instance fields
.field final b:Landroidx/camera/camera2/internal/u$b;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/lang/Object;

.field private final e:Landroidx/camera/camera2/internal/compat/d0;

.field private final f:Landroidx/camera/core/impl/y$c;

.field private final g:Landroidx/camera/core/impl/y1$b;

.field private final h:Landroidx/camera/camera2/internal/h2;

.field private final i:Landroidx/camera/camera2/internal/u3;

.field private final j:Landroidx/camera/camera2/internal/p3;

.field private final k:Landroidx/camera/camera2/internal/e2;

.field l:Landroidx/camera/camera2/internal/w3;

.field private final m:Lv/g;

.field private final n:Landroidx/camera/camera2/internal/s0;

.field private o:I

.field private volatile p:Z

.field private volatile q:I

.field private final r:Lt/a;

.field private final s:Lt/b;

.field private final t:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile u:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private v:I

.field private w:J

.field private final x:Landroidx/camera/camera2/internal/u$a;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/y$c;Landroidx/camera/core/impl/t1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/u;->d:Ljava/lang/Object;

    new-instance v0, Landroidx/camera/core/impl/y1$b;

    invoke-direct {v0}, Landroidx/camera/core/impl/y1$b;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/u;->g:Landroidx/camera/core/impl/y1$b;

    const/4 v1, 0x0

    iput v1, p0, Landroidx/camera/camera2/internal/u;->o:I

    iput-boolean v1, p0, Landroidx/camera/camera2/internal/u;->p:Z

    const/4 v1, 0x2

    iput v1, p0, Landroidx/camera/camera2/internal/u;->q:I

    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v1, p0, Landroidx/camera/camera2/internal/u;->t:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    invoke-static {v1}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/camera2/internal/u;->u:Lcom/google/common/util/concurrent/f;

    const/4 v1, 0x1

    iput v1, p0, Landroidx/camera/camera2/internal/u;->v:I

    iput-wide v2, p0, Landroidx/camera/camera2/internal/u;->w:J

    new-instance v1, Landroidx/camera/camera2/internal/u$a;

    invoke-direct {v1}, Landroidx/camera/camera2/internal/u$a;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/u;->x:Landroidx/camera/camera2/internal/u$a;

    iput-object p1, p0, Landroidx/camera/camera2/internal/u;->e:Landroidx/camera/camera2/internal/compat/d0;

    iput-object p4, p0, Landroidx/camera/camera2/internal/u;->f:Landroidx/camera/core/impl/y$c;

    iput-object p3, p0, Landroidx/camera/camera2/internal/u;->c:Ljava/util/concurrent/Executor;

    new-instance p4, Landroidx/camera/camera2/internal/u$b;

    invoke-direct {p4, p3}, Landroidx/camera/camera2/internal/u$b;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/u;->b:Landroidx/camera/camera2/internal/u$b;

    iget v2, p0, Landroidx/camera/camera2/internal/u;->v:I

    invoke-virtual {v0, v2}, Landroidx/camera/core/impl/y1$b;->t(I)Landroidx/camera/core/impl/y1$b;

    invoke-static {p4}, Landroidx/camera/camera2/internal/s1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/internal/s1;

    move-result-object p4

    invoke-virtual {v0, p4}, Landroidx/camera/core/impl/y1$b;->j(Landroidx/camera/core/impl/k;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->j(Landroidx/camera/core/impl/k;)Landroidx/camera/core/impl/y1$b;

    new-instance p4, Landroidx/camera/camera2/internal/e2;

    invoke-direct {p4, p0, p1, p3}, Landroidx/camera/camera2/internal/e2;-><init>(Landroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/u;->k:Landroidx/camera/camera2/internal/e2;

    new-instance p4, Landroidx/camera/camera2/internal/h2;

    invoke-direct {p4, p0, p2, p3, p5}, Landroidx/camera/camera2/internal/h2;-><init>(Landroidx/camera/camera2/internal/u;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/t1;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/u;->h:Landroidx/camera/camera2/internal/h2;

    new-instance p2, Landroidx/camera/camera2/internal/u3;

    invoke-direct {p2, p0, p1, p3}, Landroidx/camera/camera2/internal/u3;-><init>(Landroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->i:Landroidx/camera/camera2/internal/u3;

    new-instance p2, Landroidx/camera/camera2/internal/p3;

    invoke-direct {p2, p0, p1, p3}, Landroidx/camera/camera2/internal/p3;-><init>(Landroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->j:Landroidx/camera/camera2/internal/p3;

    new-instance p2, Landroidx/camera/camera2/internal/a4;

    invoke-direct {p2, p1}, Landroidx/camera/camera2/internal/a4;-><init>(Landroidx/camera/camera2/internal/compat/d0;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->l:Landroidx/camera/camera2/internal/w3;

    new-instance p2, Lt/a;

    invoke-direct {p2, p5}, Lt/a;-><init>(Landroidx/camera/core/impl/t1;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->r:Lt/a;

    new-instance p2, Lt/b;

    invoke-direct {p2, p5}, Lt/b;-><init>(Landroidx/camera/core/impl/t1;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->s:Lt/b;

    new-instance p2, Lv/g;

    invoke-direct {p2, p0, p3}, Lv/g;-><init>(Landroidx/camera/camera2/internal/u;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    new-instance p2, Landroidx/camera/camera2/internal/s0;

    invoke-direct {p2, p0, p1, p5, p3}, Landroidx/camera/camera2/internal/s0;-><init>(Landroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/compat/d0;Landroidx/camera/core/impl/t1;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u;->n:Landroidx/camera/camera2/internal/s0;

    new-instance p1, Landroidx/camera/camera2/internal/m;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/m;-><init>(Landroidx/camera/camera2/internal/u;)V

    invoke-interface {p3, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private D(I)I
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->e:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method private J()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u;->F()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private K(I[I)Z
    .locals 4

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p2, v2

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method static L(Landroid/hardware/camera2/TotalCaptureResult;J)Z
    .locals 4

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/camera/core/impl/f2;

    if-eqz v0, :cond_2

    check-cast p0, Landroidx/camera/core/impl/f2;

    const-string v0, "CameraControlSessionUpdateId"

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/f2;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    if-nez p0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p0, v2, p1

    if-ltz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static synthetic N()V
    .locals 0

    return-void
.end method

.method private synthetic O(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->x:Landroidx/camera/camera2/internal/u$a;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/camera2/internal/u$a;->g(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V

    return-void
.end method

.method private static synthetic P()V
    .locals 0

    return-void
.end method

.method private synthetic Q()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->l()Landroidx/camera/camera2/internal/u$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u;->t(Landroidx/camera/camera2/internal/u$c;)V

    return-void
.end method

.method private synthetic R(Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/f;
    .locals 0

    iget-object p5, p0, Landroidx/camera/camera2/internal/u;->n:Landroidx/camera/camera2/internal/s0;

    invoke-virtual {p5, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/s0;->e(Ljava/util/List;III)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private synthetic S(Landroidx/concurrent/futures/c$a;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u;->f0()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/u;->g0(J)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-static {v0, p1}, La0/f;->k(Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private synthetic T(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/o;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/o;-><init>(Landroidx/camera/camera2/internal/u;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "updateSessionConfigAsync"

    return-object p1
.end method

.method private static synthetic U(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p3, p0, p1}, Landroidx/camera/camera2/internal/u;->L(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private synthetic V(JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/h;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/h;-><init>(JLandroidx/concurrent/futures/c$a;)V

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u;->t(Landroidx/camera/camera2/internal/u$c;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "waitForSessionUpdateId:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private g0(J)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/q;

    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/camera2/internal/q;-><init>(Landroidx/camera/camera2/internal/u;J)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic k(Landroidx/camera/camera2/internal/u;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/u;->S(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic l(Landroidx/camera/camera2/internal/u;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/u;->T(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/u;->U(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Landroidx/camera/camera2/internal/u;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u;->Q()V

    return-void
.end method

.method public static synthetic o(Landroidx/camera/camera2/internal/u;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u;->O(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V

    return-void
.end method

.method public static synthetic p(Landroidx/camera/camera2/internal/u;Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/camera2/internal/u;->R(Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Landroidx/camera/camera2/internal/u;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/u;->V(JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r()V
    .locals 0

    invoke-static {}, Landroidx/camera/camera2/internal/u;->P()V

    return-void
.end method

.method public static synthetic s()V
    .locals 0

    invoke-static {}, Landroidx/camera/camera2/internal/u;->N()V

    return-void
.end method


# virtual methods
.method A()Landroidx/camera/core/impl/n0;
    .locals 7

    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->h:Landroidx/camera/camera2/internal/h2;

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/h2;->b(Lq/a$a;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->r:Lt/a;

    invoke-virtual {v1, v0}, Lt/a;->a(Lq/a$a;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->i:Landroidx/camera/camera2/internal/u3;

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/u3;->e(Lq/a$a;)V

    iget-boolean v1, p0, Landroidx/camera/camera2/internal/u;->p:Z

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/camera/camera2/internal/u;->q:I

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->s:Lt/b;

    invoke-virtual {v1, v3}, Lt/b;->a(I)I

    move-result v1

    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/u;->B(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-direct {p0, v2}, Landroidx/camera/camera2/internal/u;->D(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->k:Landroidx/camera/camera2/internal/e2;

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/e2;->c(Lq/a$a;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-virtual {v1}, Lv/g;->k()Lq/a;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0}, Lq/a$a;->a()Landroidx/camera/core/impl/l1;

    move-result-object v4

    sget-object v5, Landroidx/camera/core/impl/n0$c;->ALWAYS_OVERRIDE:Landroidx/camera/core/impl/n0$c;

    invoke-interface {v1, v3}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v3, v5, v6}, Landroidx/camera/core/impl/l1;->p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    return-object v0
.end method

.method B(I)I
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->e:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method C(I)I
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->e:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x4

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    return p1

    :cond_2
    const/4 p1, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/u;->K(I[I)Z

    move-result v0

    if-eqz v0, :cond_3

    return p1

    :cond_3
    return v1
.end method

.method public E()Landroidx/camera/camera2/internal/p3;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->j:Landroidx/camera/camera2/internal/p3;

    return-object v0
.end method

.method F()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/u;->o:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public G()Landroidx/camera/camera2/internal/u3;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->i:Landroidx/camera/camera2/internal/u3;

    return-object v0
.end method

.method public H()Landroidx/camera/camera2/internal/w3;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->l:Landroidx/camera/camera2/internal/w3;

    return-object v0
.end method

.method I()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/u;->o:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/camera/camera2/internal/u;->o:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method M()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/u;->p:Z

    return v0
.end method

.method W(Landroidx/camera/camera2/internal/u$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->b:Landroidx/camera/camera2/internal/u$b;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/u$b;->d(Landroidx/camera/camera2/internal/u$c;)V

    return-void
.end method

.method X()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u;->a0(I)V

    return-void
.end method

.method Y(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->h:Landroidx/camera/camera2/internal/h2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/h2;->m(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->i:Landroidx/camera/camera2/internal/u3;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/u3;->o(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->j:Landroidx/camera/camera2/internal/p3;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/p3;->j(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->k:Landroidx/camera/camera2/internal/e2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/e2;->b(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-virtual {v0, p1}, Lv/g;->s(Z)V

    return-void
.end method

.method public Z(Landroid/util/Rational;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->h:Landroidx/camera/camera2/internal/h2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/h2;->n(Landroid/util/Rational;)V

    return-void
.end method

.method public a(Landroidx/camera/core/impl/y1$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->l:Landroidx/camera/camera2/internal/w3;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/w3;->a(Landroidx/camera/core/impl/y1$b;)V

    return-void
.end method

.method a0(I)V
    .locals 1

    iput p1, p0, Landroidx/camera/camera2/internal/u;->v:I

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->h:Landroidx/camera/camera2/internal/h2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/h2;->o(I)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u;->n:Landroidx/camera/camera2/internal/s0;

    iget v0, p0, Landroidx/camera/camera2/internal/u;->v:I

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/s0;->d(I)V

    return-void
.end method

.method public b(F)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u;->J()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lw/j$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->i:Landroidx/camera/camera2/internal/u3;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/u3;->p(F)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p1}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public b0(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->l:Landroidx/camera/camera2/internal/w3;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/w3;->d(Z)V

    return-void
.end method

.method public c(Ljava/util/List;II)Lcom/google/common/util/concurrent/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;II)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u;->J()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string p2, "Camera is not active."

    invoke-static {p1, p2}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lw/j$a;

    invoke-direct {p1, p2}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u;->x()I

    move-result v4

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->u:Lcom/google/common/util/concurrent/f;

    invoke-static {v0}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-static {v0}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object v6

    new-instance v7, Landroidx/camera/camera2/internal/l;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Landroidx/camera/camera2/internal/l;-><init>(Landroidx/camera/camera2/internal/u;Ljava/util/List;III)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v6, v7, p1}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    return-object p1
.end method

.method c0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->f:Landroidx/camera/core/impl/y$c;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/y$c;->b(Ljava/util/List;)V

    return-void
.end method

.method public d(F)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u;->J()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lw/j$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->i:Landroidx/camera/camera2/internal/u3;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/u3;->q(F)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p1}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public d0()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/p;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/p;-><init>(Landroidx/camera/camera2/internal/u;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->e:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-static {v0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method

.method e0()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/i;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/i;-><init>(Landroidx/camera/camera2/internal/u;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-static {v0}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method public f(I)V
    .locals 2

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u;->J()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string v0, "Camera is not active."

    invoke-static {p1, v0}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput p1, p0, Landroidx/camera/camera2/internal/u;->q:I

    iget-object p1, p0, Landroidx/camera/camera2/internal/u;->l:Landroidx/camera/camera2/internal/w3;

    iget v0, p0, Landroidx/camera/camera2/internal/u;->q:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, p0, Landroidx/camera/camera2/internal/u;->q:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-interface {p1, v1}, Landroidx/camera/camera2/internal/w3;->c(Z)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u;->e0()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/u;->u:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method f0()J
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->t:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/camera/camera2/internal/u;->w:J

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->f:Landroidx/camera/core/impl/y$c;

    invoke-interface {v0}, Landroidx/camera/core/impl/y$c;->a()V

    iget-wide v0, p0, Landroidx/camera/camera2/internal/u;->w:J

    return-wide v0
.end method

.method public g(Z)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/camera/camera2/internal/u;->J()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lw/j$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->j:Landroidx/camera/camera2/internal/p3;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/p3;->d(Z)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p1}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->k()Lq/a;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroidx/camera/core/impl/n0;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-static {p1}, Lv/j$a;->e(Landroidx/camera/core/impl/n0;)Lv/j$a;

    move-result-object p1

    invoke-virtual {p1}, Lv/j$a;->d()Lv/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv/g;->g(Lv/j;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v0, Landroidx/camera/camera2/internal/n;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/n;-><init>()V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->i()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/j;

    invoke-direct {v1}, Landroidx/camera/camera2/internal/j;-><init>()V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method t(Landroidx/camera/camera2/internal/u$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->b:Landroidx/camera/camera2/internal/u$b;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/u$b;->b(Landroidx/camera/camera2/internal/u$c;)V

    return-void
.end method

.method u(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/k;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/k;-><init>(Landroidx/camera/camera2/internal/u;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method v()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/u;->o:I

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/camera/camera2/internal/u;->o:I

    monitor-exit v0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Decrementing use count occurs more times than incrementing"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method w(Z)V
    .locals 3

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/u;->p:Z

    if-nez p1, :cond_0

    new-instance p1, Landroidx/camera/core/impl/l0$a;

    invoke-direct {p1}, Landroidx/camera/core/impl/l0$a;-><init>()V

    iget v0, p0, Landroidx/camera/camera2/internal/u;->v:I

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/l0$a;->r(I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/l0$a;->s(Z)V

    new-instance v1, Lq/a$a;

    invoke-direct {v1}, Lq/a$a;-><init>()V

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/u;->B(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    invoke-virtual {v1}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/u;->c0(Ljava/util/List;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u;->f0()J

    return-void
.end method

.method public x()I
    .locals 1

    iget v0, p0, Landroidx/camera/camera2/internal/u;->q:I

    return v0
.end method

.method public y()Landroidx/camera/camera2/internal/h2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->h:Landroidx/camera/camera2/internal/h2;

    return-object v0
.end method

.method public z()Landroidx/camera/core/impl/y1;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->g:Landroidx/camera/core/impl/y1$b;

    iget v1, p0, Landroidx/camera/camera2/internal/u;->v:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->t(I)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->g:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/u;->A()Landroidx/camera/core/impl/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->r(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->m:Lv/g;

    invoke-virtual {v0}, Lv/g;->k()Lq/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq/a;->Z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/camera2/internal/u;->g:Landroidx/camera/core/impl/y1$b;

    const-string v2, "Camera2CameraControl"

    invoke-virtual {v1, v2, v0}, Landroidx/camera/core/impl/y1$b;->n(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/y1$b;

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->g:Landroidx/camera/core/impl/y1$b;

    iget-wide v1, p0, Landroidx/camera/camera2/internal/u;->w:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "CameraControlSessionUpdateId"

    invoke-virtual {v0, v2, v1}, Landroidx/camera/core/impl/y1$b;->n(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/camera2/internal/u;->g:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v0

    return-object v0
.end method
