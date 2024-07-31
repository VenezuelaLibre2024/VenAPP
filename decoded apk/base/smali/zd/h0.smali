.class public Lzd/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqd/t;


# instance fields
.field private final a:Lzd/w0;

.field private final b:Lce/a;

.field private final c:Lzd/o3;

.field private final d:Lzd/m3;

.field private final e:Lzd/k;

.field private final f:Lde/m;

.field private final g:Lzd/q2;

.field private final h:Lzd/n;

.field private final i:Lde/i;

.field private final j:Ljava/lang/String;

.field private k:Z


# direct methods
.method constructor <init>(Lzd/w0;Lce/a;Lzd/o3;Lzd/m3;Lzd/k;Lde/m;Lzd/q2;Lzd/n;Lde/i;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/h0;->a:Lzd/w0;

    iput-object p2, p0, Lzd/h0;->b:Lce/a;

    iput-object p3, p0, Lzd/h0;->c:Lzd/o3;

    iput-object p4, p0, Lzd/h0;->d:Lzd/m3;

    iput-object p5, p0, Lzd/h0;->e:Lzd/k;

    iput-object p6, p0, Lzd/h0;->f:Lde/m;

    iput-object p7, p0, Lzd/h0;->g:Lzd/q2;

    iput-object p8, p0, Lzd/h0;->h:Lzd/n;

    iput-object p9, p0, Lzd/h0;->i:Lde/i;

    iput-object p10, p0, Lzd/h0;->j:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzd/h0;->k:Z

    return-void
.end method

.method private A(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lzd/h0;->B(Ljava/lang/String;Ldj/j;)V

    return-void
.end method

.method private B(Ljava/lang/String;Ldj/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ldj/j<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    aput-object p2, v2, v0

    const-string p1, "Not recording: %s. Reason: %s"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lzd/l2;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lzd/h0;->i:Lde/i;

    invoke-virtual {p2}, Lde/i;->a()Lde/e;

    move-result-object p2

    invoke-virtual {p2}, Lde/e;->c()Z

    move-result p2

    if-eqz p2, :cond_1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "Not recording: %s. Reason: Message is test message"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lzd/h0;->h:Lzd/n;

    invoke-virtual {p2}, Lzd/n;->b()Z

    move-result p2

    if-nez p2, :cond_2

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "Not recording: %s. Reason: Data collection is disabled"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "Not recording: %s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method private C(Ldj/b;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/b;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lzd/h0;->k:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lzd/h0;->d()Lcom/google/android/gms/tasks/Task;

    :cond_0
    invoke-virtual {p1}, Ldj/b;->q()Ldj/j;

    move-result-object p1

    iget-object v0, p0, Lzd/h0;->c:Lzd/o3;

    invoke-virtual {v0}, Lzd/o3;->a()Ldj/r;

    move-result-object v0

    invoke-static {p1, v0}, Lzd/h0;->F(Ldj/j;Ldj/r;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private D(Lde/a;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Attempting to record: message click to metrics logger"

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    new-instance v0, Lzd/y;

    invoke-direct {v0, p0, p1}, Lzd/y;-><init>(Lzd/h0;Lde/a;)V

    invoke-static {v0}, Ldj/b;->j(Ljj/a;)Ldj/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/h0;->C(Ldj/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private E()Ldj/b;
    .locals 5

    iget-object v0, p0, Lzd/h0;->i:Lde/i;

    invoke-virtual {v0}, Lde/i;->a()Lde/e;

    move-result-object v0

    invoke-virtual {v0}, Lde/e;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting to record message impression in impression store for id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lzd/l2;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lzd/h0;->a:Lzd/w0;

    invoke-static {}, Lpf/a;->f0()Lpf/a$b;

    move-result-object v2

    iget-object v3, p0, Lzd/h0;->b:Lce/a;

    invoke-interface {v3}, Lce/a;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lpf/a$b;->J(J)Lpf/a$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lpf/a$b;->I(Ljava/lang/String;)Lpf/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object v0

    check-cast v0, Lpf/a;

    invoke-virtual {v1, v0}, Lzd/w0;->r(Lpf/a;)Ldj/b;

    move-result-object v0

    new-instance v1, Lzd/e0;

    invoke-direct {v1}, Lzd/e0;-><init>()V

    invoke-virtual {v0, v1}, Ldj/b;->h(Ljj/d;)Ldj/b;

    move-result-object v0

    new-instance v1, Lzd/f0;

    invoke-direct {v1}, Lzd/f0;-><init>()V

    invoke-virtual {v0, v1}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object v0

    iget-object v1, p0, Lzd/h0;->j:Ljava/lang/String;

    invoke-static {v1}, Lzd/i2;->Q(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lzd/h0;->d:Lzd/m3;

    iget-object v2, p0, Lzd/h0;->f:Lde/m;

    invoke-virtual {v1, v2}, Lzd/m3;->l(Lde/m;)Ldj/b;

    move-result-object v1

    new-instance v2, Lzd/g0;

    invoke-direct {v2}, Lzd/g0;-><init>()V

    invoke-virtual {v1, v2}, Ldj/b;->h(Ljj/d;)Ldj/b;

    move-result-object v1

    new-instance v2, Lzd/w;

    invoke-direct {v2}, Lzd/w;-><init>()V

    invoke-virtual {v1, v2}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object v1

    invoke-virtual {v1}, Ldj/b;->l()Ldj/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ldj/b;->c(Ldj/d;)Ldj/b;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private static F(Ldj/j;Ldj/r;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj/j<",
            "TT;>;",
            "Ldj/r;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lzd/b0;

    invoke-direct {v1, v0}, Lzd/b0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, v1}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object p0

    new-instance v1, Lzd/c0;

    invoke-direct {v1, v0}, Lzd/c0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-static {v1}, Ldj/j;->l(Ljava/util/concurrent/Callable;)Ldj/j;

    move-result-object v1

    invoke-virtual {p0, v1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object p0

    new-instance v1, Lzd/d0;

    invoke-direct {v1, v0}, Lzd/d0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, v1}, Ldj/j;->r(Ljj/e;)Ldj/j;

    move-result-object p0

    invoke-virtual {p0, p1}, Ldj/j;->v(Ldj/r;)Ldj/j;

    move-result-object p0

    invoke-virtual {p0}, Ldj/j;->s()Lgj/b;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private G()Z
    .locals 1

    iget-object v0, p0, Lzd/h0;->h:Lzd/n;

    invoke-virtual {v0}, Lzd/n;->b()Z

    move-result v0

    return v0
.end method

.method private H()Ldj/b;
    .locals 1

    new-instance v0, Lzd/x;

    invoke-direct {v0, p0}, Lzd/x;-><init>(Lzd/h0;)V

    invoke-static {v0}, Ldj/b;->j(Ljj/a;)Ldj/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lcom/google/android/gms/tasks/TaskCompletionSource;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lzd/h0;->x(Lcom/google/android/gms/tasks/TaskCompletionSource;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/h0;->s(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic g(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Throwable;)Ldj/n;
    .locals 0

    invoke-static {p0, p1}, Lzd/h0;->w(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Throwable;)Ldj/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/h0;->u(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic i(Lzd/h0;)V
    .locals 0

    invoke-direct {p0}, Lzd/h0;->z()V

    return-void
.end method

.method public static synthetic j(Lzd/h0;Lqd/t$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/h0;->p(Lqd/t$b;)V

    return-void
.end method

.method public static synthetic k()V
    .locals 0

    invoke-static {}, Lzd/h0;->v()V

    return-void
.end method

.method public static synthetic l(Lzd/h0;)V
    .locals 0

    invoke-direct {p0}, Lzd/h0;->q()V

    return-void
.end method

.method public static synthetic m(Lzd/h0;Lqd/t$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/h0;->y(Lqd/t$a;)V

    return-void
.end method

.method public static synthetic n(Lzd/h0;Lde/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/h0;->r(Lde/a;)V

    return-void
.end method

.method public static synthetic o()V
    .locals 0

    invoke-static {}, Lzd/h0;->t()V

    return-void
.end method

.method private synthetic p(Lqd/t$b;)V
    .locals 2

    iget-object v0, p0, Lzd/h0;->g:Lzd/q2;

    iget-object v1, p0, Lzd/h0;->i:Lde/i;

    invoke-virtual {v0, v1, p1}, Lzd/q2;->u(Lde/i;Lqd/t$b;)V

    return-void
.end method

.method private synthetic q()V
    .locals 2

    iget-object v0, p0, Lzd/h0;->g:Lzd/q2;

    iget-object v1, p0, Lzd/h0;->i:Lde/i;

    invoke-virtual {v0, v1}, Lzd/q2;->s(Lde/i;)V

    return-void
.end method

.method private synthetic r(Lde/a;)V
    .locals 2

    iget-object v0, p0, Lzd/h0;->g:Lzd/q2;

    iget-object v1, p0, Lzd/h0;->i:Lde/i;

    invoke-virtual {v0, v1, p1}, Lzd/q2;->t(Lde/i;Lde/a;)V

    return-void
.end method

.method private static synthetic s(Ljava/lang/Throwable;)V
    .locals 0

    const-string p0, "Impression store write failure"

    invoke-static {p0}, Lzd/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic t()V
    .locals 1

    const-string v0, "Impression store write success"

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic u(Ljava/lang/Throwable;)V
    .locals 0

    const-string p0, "Rate limiter client write failure"

    invoke-static {p0}, Lzd/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic v()V
    .locals 1

    const-string v0, "Rate limiter client write success"

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic w(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Throwable;)Ldj/n;
    .locals 1

    instance-of v0, p1, Ljava/lang/Exception;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    :goto_0
    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic x(Lcom/google/android/gms/tasks/TaskCompletionSource;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-object v0
.end method

.method private synthetic y(Lqd/t$a;)V
    .locals 2

    iget-object v0, p0, Lzd/h0;->g:Lzd/q2;

    iget-object v1, p0, Lzd/h0;->i:Lde/i;

    invoke-virtual {v0, v1, p1}, Lzd/q2;->q(Lde/i;Lqd/t$a;)V

    return-void
.end method

.method private synthetic z()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd/h0;->k:Z

    return-void
.end method


# virtual methods
.method public a(Lde/a;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzd/h0;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lde/a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lqd/t$a;->CLICK:Lqd/t$a;

    invoke-virtual {p0, p1}, Lzd/h0;->b(Lqd/t$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lzd/h0;->D(Lde/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "message click to metrics logger"

    invoke-direct {p0, p1}, Lzd/h0;->A(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public b(Lqd/t$a;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqd/t$a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzd/h0;->G()Z

    move-result v0

    const-string v1, "message dismissal to metrics logger"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting to record: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    new-instance v0, Lzd/v;

    invoke-direct {v0, p0, p1}, Lzd/v;-><init>(Lzd/h0;Lqd/t$a;)V

    invoke-static {v0}, Ldj/b;->j(Ljj/a;)Ldj/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/h0;->C(Ldj/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, v1}, Lzd/h0;->A(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public c(Lqd/t$b;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqd/t$b;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzd/h0;->G()Z

    move-result v0

    const-string v1, "render error to metrics logger"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting to record: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    new-instance v0, Lzd/z;

    invoke-direct {v0, p0, p1}, Lzd/z;-><init>(Lzd/h0;Lqd/t$b;)V

    invoke-static {v0}, Ldj/b;->j(Ljj/a;)Ldj/b;

    move-result-object p1

    invoke-direct {p0}, Lzd/h0;->E()Ldj/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldj/b;->c(Ldj/d;)Ldj/b;

    move-result-object p1

    invoke-direct {p0}, Lzd/h0;->H()Ldj/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldj/b;->c(Ldj/d;)Ldj/b;

    move-result-object p1

    invoke-virtual {p1}, Ldj/b;->q()Ldj/j;

    move-result-object p1

    iget-object v0, p0, Lzd/h0;->c:Lzd/o3;

    invoke-virtual {v0}, Lzd/o3;->a()Ldj/r;

    move-result-object v0

    invoke-static {p1, v0}, Lzd/h0;->F(Ldj/j;Ldj/r;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, v1}, Lzd/h0;->A(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public d()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzd/h0;->G()Z

    move-result v0

    const-string v1, "message impression to metrics logger"

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lzd/h0;->k:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting to record: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    new-instance v0, Lzd/a0;

    invoke-direct {v0, p0}, Lzd/a0;-><init>(Lzd/h0;)V

    invoke-static {v0}, Ldj/b;->j(Ljj/a;)Ldj/b;

    move-result-object v0

    invoke-direct {p0}, Lzd/h0;->E()Ldj/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ldj/b;->c(Ldj/d;)Ldj/b;

    move-result-object v0

    invoke-direct {p0}, Lzd/h0;->H()Ldj/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/b;->c(Ldj/d;)Ldj/b;

    move-result-object v0

    invoke-virtual {v0}, Ldj/b;->q()Ldj/j;

    move-result-object v0

    iget-object v1, p0, Lzd/h0;->c:Lzd/o3;

    invoke-virtual {v1}, Lzd/o3;->a()Ldj/r;

    move-result-object v1

    invoke-static {v0, v1}, Lzd/h0;->F(Ldj/j;Ldj/r;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0, v1}, Lzd/h0;->A(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
