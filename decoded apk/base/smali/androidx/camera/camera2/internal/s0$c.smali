.class Landroidx/camera/camera2/internal/s0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final i:J

.field private static final j:J


# instance fields
.field private final a:I

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/camera/camera2/internal/u;

.field private final d:Lt/o;

.field private final e:Z

.field private f:J

.field final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/s0$d;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroidx/camera/camera2/internal/s0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sput-wide v1, Landroidx/camera/camera2/internal/s0$c;->i:J

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Landroidx/camera/camera2/internal/s0$c;->j:J

    return-void
.end method

.method constructor <init>(ILjava/util/concurrent/Executor;Landroidx/camera/camera2/internal/u;ZLt/o;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-wide v0, Landroidx/camera/camera2/internal/s0$c;->i:J

    iput-wide v0, p0, Landroidx/camera/camera2/internal/s0$c;->f:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/s0$c;->g:Ljava/util/List;

    new-instance v0, Landroidx/camera/camera2/internal/s0$c$a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/s0$c$a;-><init>(Landroidx/camera/camera2/internal/s0$c;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/s0$c;->h:Landroidx/camera/camera2/internal/s0$d;

    iput p1, p0, Landroidx/camera/camera2/internal/s0$c;->a:I

    iput-object p2, p0, Landroidx/camera/camera2/internal/s0$c;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    iput-boolean p4, p0, Landroidx/camera/camera2/internal/s0$c;->e:Z

    iput-object p5, p0, Landroidx/camera/camera2/internal/s0$c;->d:Lt/o;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/s0$c;Landroidx/camera/core/impl/l0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/s0$c;->n(Landroidx/camera/core/impl/l0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/camera2/internal/s0$c;Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/s0$c;->l(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/camera2/internal/s0$c;Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/s0$c;->m(Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/camera/camera2/internal/s0$c;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/s0$c;->j(ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/s0$c;->k(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private g(Landroidx/camera/core/impl/l0$a;)V
    .locals 3

    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    return-void
.end method

.method private h(Landroidx/camera/core/impl/l0$a;Landroidx/camera/core/impl/l0;)V
    .locals 3

    iget v0, p0, Landroidx/camera/camera2/internal/s0$c;->a:I

    const/4 v1, 0x3

    const/4 v2, -0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/s0$c;->e:Z

    if-nez v0, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Landroidx/camera/core/impl/l0;->h()I

    move-result v0

    if-eq v0, v2, :cond_2

    invoke-virtual {p2}, Landroidx/camera/core/impl/l0;->h()I

    move-result p2

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    move p2, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x2

    :goto_1
    if-eq p2, v2, :cond_3

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/l0$a;->r(I)V

    :cond_3
    return-void
.end method

.method private synthetic j(ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;
    .locals 2

    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/s0;->b(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-wide v0, Landroidx/camera/camera2/internal/s0$c;->j:J

    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/s0$c;->o(J)V

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/s0$c;->h:Landroidx/camera/camera2/internal/s0$d;

    invoke-interface {p1, p2}, Landroidx/camera/camera2/internal/s0$d;->a(Landroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic k(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/camera/camera2/internal/s0;->a(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method private synthetic l(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/f;
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v0, p0, Landroidx/camera/camera2/internal/s0$c;->f:J

    iget-object p1, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    new-instance v2, Landroidx/camera/camera2/internal/y0;

    invoke-direct {v2}, Landroidx/camera/camera2/internal/y0;-><init>()V

    invoke-static {v0, v1, p1, v2}, Landroidx/camera/camera2/internal/s0;->f(JLandroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/s0$e$a;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/camera/camera2/internal/s0$c;->p(Ljava/util/List;I)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Landroidx/camera/core/impl/l0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/s0$c$b;

    invoke-direct {v0, p0, p2}, Landroidx/camera/camera2/internal/s0$c$b;-><init>(Landroidx/camera/camera2/internal/s0$c;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    const-string p1, "submitStillCapture"

    return-object p1
.end method

.method private o(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/camera/camera2/internal/s0$c;->f:J

    return-void
.end method


# virtual methods
.method f(Landroidx/camera/camera2/internal/s0$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/s0$c;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method i(Ljava/util/List;I)Lcom/google/common/util/concurrent/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;I)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/s0$c;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v1, p0, Landroidx/camera/camera2/internal/s0$c;->h:Landroidx/camera/camera2/internal/s0$d;

    invoke-interface {v1}, Landroidx/camera/camera2/internal/s0$d;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    iget-object v3, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    invoke-static {v1, v2, v3, v0}, Landroidx/camera/camera2/internal/s0;->f(JLandroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/s0$e$a;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/t0;

    invoke-direct {v1, p0, p2}, Landroidx/camera/camera2/internal/t0;-><init>(Landroidx/camera/camera2/internal/s0$c;I)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/s0$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/u0;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/u0;-><init>(Landroidx/camera/camera2/internal/s0$c;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/s0$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object v1

    :cond_1
    invoke-static {v1}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/v0;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/v0;-><init>(Landroidx/camera/camera2/internal/s0$c;Ljava/util/List;I)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/s0$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    iget-object p2, p0, Landroidx/camera/camera2/internal/s0$c;->h:Landroidx/camera/camera2/internal/s0$d;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroidx/camera/camera2/internal/w0;

    invoke-direct {v0, p2}, Landroidx/camera/camera2/internal/w0;-><init>(Landroidx/camera/camera2/internal/s0$d;)V

    iget-object p2, p0, Landroidx/camera/camera2/internal/s0$c;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method p(Ljava/util/List;I)Lcom/google/common/util/concurrent/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;I)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/l0;

    invoke-static {v2}, Landroidx/camera/core/impl/l0$a;->k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/camera/core/impl/l0;->h()I

    move-result v4

    const/4 v5, 0x5

    if-ne v4, v5, :cond_1

    iget-object v4, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v4}, Landroidx/camera/camera2/internal/u;->H()Landroidx/camera/camera2/internal/w3;

    move-result-object v4

    invoke-interface {v4}, Landroidx/camera/camera2/internal/w3;->g()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v4}, Landroidx/camera/camera2/internal/u;->H()Landroidx/camera/camera2/internal/w3;

    move-result-object v4

    invoke-interface {v4}, Landroidx/camera/camera2/internal/w3;->b()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v4}, Landroidx/camera/camera2/internal/u;->H()Landroidx/camera/camera2/internal/w3;

    move-result-object v4

    invoke-interface {v4}, Landroidx/camera/camera2/internal/w3;->e()Landroidx/camera/core/o;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v5}, Landroidx/camera/camera2/internal/u;->H()Landroidx/camera/camera2/internal/w3;

    move-result-object v5

    invoke-interface {v5, v4}, Landroidx/camera/camera2/internal/w3;->f(Landroidx/camera/core/o;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    invoke-interface {v4}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v4

    invoke-static {v4}, Landroidx/camera/core/impl/t;->a(Lw/h0;)Landroidx/camera/core/impl/s;

    move-result-object v4

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_2

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/l0$a;->o(Landroidx/camera/core/impl/s;)V

    goto :goto_3

    :cond_2
    invoke-direct {p0, v3, v2}, Landroidx/camera/camera2/internal/s0$c;->h(Landroidx/camera/core/impl/l0$a;Landroidx/camera/core/impl/l0;)V

    :goto_3
    iget-object v2, p0, Landroidx/camera/camera2/internal/s0$c;->d:Lt/o;

    invoke-virtual {v2, p2}, Lt/o;->c(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-direct {p0, v3}, Landroidx/camera/camera2/internal/s0$c;->g(Landroidx/camera/core/impl/l0$a;)V

    :cond_3
    new-instance v2, Landroidx/camera/camera2/internal/x0;

    invoke-direct {v2, p0, v3}, Landroidx/camera/camera2/internal/x0;-><init>(Landroidx/camera/camera2/internal/s0$c;Landroidx/camera/core/impl/l0$a;)V

    invoke-static {v2}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object p1, p0, Landroidx/camera/camera2/internal/s0$c;->c:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/u;->c0(Ljava/util/List;)V

    invoke-static {v0}, La0/f;->c(Ljava/util/Collection;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
