.class Landroidx/camera/camera2/internal/s0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/s0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# static fields
.field private static final e:J


# instance fields
.field private final a:Landroidx/camera/camera2/internal/u;

.field private final b:I

.field private c:Z

.field private final d:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Landroidx/camera/camera2/internal/s0$f;->e:J

    return-void
.end method

.method constructor <init>(Landroidx/camera/camera2/internal/u;ILjava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/s0$f;->c:Z

    iput-object p1, p0, Landroidx/camera/camera2/internal/s0$f;->a:Landroidx/camera/camera2/internal/u;

    iput p2, p0, Landroidx/camera/camera2/internal/s0$f;->b:I

    iput-object p3, p0, Landroidx/camera/camera2/internal/s0$f;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic d(Landroidx/camera/camera2/internal/s0$f;Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/s0$f;->j(Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/camera/camera2/internal/s0$f;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/s0$f;->h(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/s0$f;->k(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/s0$f;->i(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private synthetic h(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/s0$f;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/u;->E()Landroidx/camera/camera2/internal/p3;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/camera/camera2/internal/p3;->e(Landroidx/concurrent/futures/c$a;Z)V

    const-string p1, "TorchOn"

    return-object p1
.end method

.method private static synthetic i(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/camera/camera2/internal/s0;->a(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method private synthetic j(Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;
    .locals 3

    sget-wide v0, Landroidx/camera/camera2/internal/s0$f;->e:J

    iget-object p1, p0, Landroidx/camera/camera2/internal/s0$f;->a:Landroidx/camera/camera2/internal/u;

    new-instance v2, Landroidx/camera/camera2/internal/b1;

    invoke-direct {v2}, Landroidx/camera/camera2/internal/b1;-><init>()V

    invoke-static {v0, v1, p1, v2}, Landroidx/camera/camera2/internal/s0;->f(JLandroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/s0$e$a;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic k(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget v0, p0, Landroidx/camera/camera2/internal/s0$f;->b:I

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/s0;->b(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/camera/camera2/internal/s0$f;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->M()Z

    move-result p1

    const-string v0, "Camera2CapturePipeline"

    if-eqz p1, :cond_0

    const-string p1, "Torch already on, not turn on"

    invoke-static {v0, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Turn on torch"

    invoke-static {v0, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/s0$f;->c:Z

    new-instance p1, Landroidx/camera/camera2/internal/c1;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/c1;-><init>(Landroidx/camera/camera2/internal/s0$f;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p1}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object p1

    new-instance v0, Landroidx/camera/camera2/internal/d1;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/d1;-><init>(Landroidx/camera/camera2/internal/s0$f;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/s0$f;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    new-instance v0, Landroidx/camera/camera2/internal/e1;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/e1;-><init>()V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, La0/d;->d(Lm/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget v0, p0, Landroidx/camera/camera2/internal/s0$f;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 3

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/s0$f;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/s0$f;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/u;->E()Landroidx/camera/camera2/internal/p3;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/camera/camera2/internal/p3;->e(Landroidx/concurrent/futures/c$a;Z)V

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "Turn off torch"

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
