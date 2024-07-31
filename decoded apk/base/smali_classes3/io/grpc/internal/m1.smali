.class final Lio/grpc/internal/m1;
.super Lvi/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/m1$a;
    }
.end annotation


# instance fields
.field private final a:Lio/grpc/internal/s;

.field private final b:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "**>;"
        }
    .end annotation
.end field

.field private final c:Lvi/w0;

.field private final d:Lvi/c;

.field private final e:Lvi/r;

.field private final f:Lio/grpc/internal/m1$a;

.field private final g:[Lvi/k;

.field private final h:Ljava/lang/Object;

.field private i:Lio/grpc/internal/q;

.field j:Z

.field k:Lio/grpc/internal/b0;


# direct methods
.method constructor <init>(Lio/grpc/internal/s;Lvi/x0;Lvi/w0;Lvi/c;Lio/grpc/internal/m1$a;[Lvi/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/grpc/internal/s;",
            "Lvi/x0<",
            "**>;",
            "Lvi/w0;",
            "Lvi/c;",
            "Lio/grpc/internal/m1$a;",
            "[",
            "Lvi/k;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lvi/b$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/m1;->h:Ljava/lang/Object;

    iput-object p1, p0, Lio/grpc/internal/m1;->a:Lio/grpc/internal/s;

    iput-object p2, p0, Lio/grpc/internal/m1;->b:Lvi/x0;

    iput-object p3, p0, Lio/grpc/internal/m1;->c:Lvi/w0;

    iput-object p4, p0, Lio/grpc/internal/m1;->d:Lvi/c;

    invoke-static {}, Lvi/r;->e()Lvi/r;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/m1;->e:Lvi/r;

    iput-object p5, p0, Lio/grpc/internal/m1;->f:Lio/grpc/internal/m1$a;

    iput-object p6, p0, Lio/grpc/internal/m1;->g:[Lvi/k;

    return-void
.end method

.method private b(Lio/grpc/internal/q;)V
    .locals 4

    iget-boolean v0, p0, Lio/grpc/internal/m1;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already finalized"

    invoke-static {v0, v2}, Leb/o;->v(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lio/grpc/internal/m1;->j:Z

    iget-object v0, p0, Lio/grpc/internal/m1;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lio/grpc/internal/m1;->i:Lio/grpc/internal/q;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-object p1, p0, Lio/grpc/internal/m1;->i:Lio/grpc/internal/q;

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    :cond_1
    :goto_1
    iget-object p1, p0, Lio/grpc/internal/m1;->f:Lio/grpc/internal/m1$a;

    invoke-interface {p1}, Lio/grpc/internal/m1$a;->a()V

    return-void

    :cond_2
    iget-object v0, p0, Lio/grpc/internal/m1;->k:Lio/grpc/internal/b0;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v1, v3

    :goto_2
    const-string v0, "delayedStream is null"

    invoke-static {v1, v0}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/m1;->k:Lio/grpc/internal/b0;

    invoke-virtual {v0, p1}, Lio/grpc/internal/b0;->w(Lio/grpc/internal/q;)Ljava/lang/Runnable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(Lvi/g1;)V
    .locals 2

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot fail with OK status"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/m1;->j:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "apply() or fail() already called"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    new-instance v0, Lio/grpc/internal/f0;

    invoke-static {p1}, Lio/grpc/internal/q0;->n(Lvi/g1;)Lvi/g1;

    move-result-object p1

    iget-object v1, p0, Lio/grpc/internal/m1;->g:[Lvi/k;

    invoke-direct {v0, p1, v1}, Lio/grpc/internal/f0;-><init>(Lvi/g1;[Lvi/k;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/m1;->b(Lio/grpc/internal/q;)V

    return-void
.end method

.method c()Lio/grpc/internal/q;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/m1;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/m1;->i:Lio/grpc/internal/q;

    if-nez v1, :cond_0

    new-instance v1, Lio/grpc/internal/b0;

    invoke-direct {v1}, Lio/grpc/internal/b0;-><init>()V

    iput-object v1, p0, Lio/grpc/internal/m1;->k:Lio/grpc/internal/b0;

    iput-object v1, p0, Lio/grpc/internal/m1;->i:Lio/grpc/internal/q;

    monitor-exit v0

    return-object v1

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
