.class abstract Lio/grpc/internal/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/y1$u;,
        Lio/grpc/internal/y1$v;,
        Lio/grpc/internal/y1$x;,
        Lio/grpc/internal/y1$c0;,
        Lio/grpc/internal/y1$t;,
        Lio/grpc/internal/y1$s;,
        Lio/grpc/internal/y1$b0;,
        Lio/grpc/internal/y1$z;,
        Lio/grpc/internal/y1$a0;,
        Lio/grpc/internal/y1$r;,
        Lio/grpc/internal/y1$w;,
        Lio/grpc/internal/y1$y;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/grpc/internal/q;"
    }
.end annotation


# static fields
.field static final A:Lvi/w0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/w0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final B:Lvi/w0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/w0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final C:Lvi/g1;

.field private static D:Ljava/util/Random;


# instance fields
.field private final a:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "TReqT;*>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Lvi/w0;

.field private final f:Lio/grpc/internal/z1;

.field private final g:Lio/grpc/internal/s0;

.field private final h:Z

.field private final i:Ljava/lang/Object;

.field private final j:Lio/grpc/internal/y1$t;

.field private final k:J

.field private final l:J

.field private final m:Lio/grpc/internal/y1$c0;

.field private final n:Lio/grpc/internal/w0;

.field private volatile o:Lio/grpc/internal/y1$z;

.field private final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final q:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final r:Ljava/util/concurrent/atomic/AtomicInteger;

.field private s:Lvi/g1;

.field private t:J

.field private u:Lio/grpc/internal/r;

.field private v:Lio/grpc/internal/y1$u;

.field private w:Lio/grpc/internal/y1$u;

.field private x:J

.field private y:Lvi/g1;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lvi/w0;->e:Lvi/w0$d;

    const-string v1, "grpc-previous-rpc-attempts"

    invoke-static {v1, v0}, Lvi/w0$g;->e(Ljava/lang/String;Lvi/w0$d;)Lvi/w0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/y1;->A:Lvi/w0$g;

    const-string v1, "grpc-retry-pushback-ms"

    invoke-static {v1, v0}, Lvi/w0$g;->e(Ljava/lang/String;Lvi/w0$d;)Lvi/w0$g;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/y1;->B:Lvi/w0$g;

    sget-object v0, Lvi/g1;->g:Lvi/g1;

    const-string v1, "Stream thrown away because RetriableStream committed"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/y1;->C:Lvi/g1;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lio/grpc/internal/y1;->D:Ljava/util/Random;

    return-void
.end method

.method constructor <init>(Lvi/x0;Lvi/w0;Lio/grpc/internal/y1$t;JJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/z1;Lio/grpc/internal/s0;Lio/grpc/internal/y1$c0;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "TReqT;*>;",
            "Lvi/w0;",
            "Lio/grpc/internal/y1$t;",
            "JJ",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lio/grpc/internal/z1;",
            "Lio/grpc/internal/s0;",
            "Lio/grpc/internal/y1$c0;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lvi/k1;

    new-instance v4, Lio/grpc/internal/y1$a;

    invoke-direct {v4, p0}, Lio/grpc/internal/y1$a;-><init>(Lio/grpc/internal/y1;)V

    invoke-direct {v3, v4}, Lvi/k1;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v3, v0, Lio/grpc/internal/y1;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    new-instance v3, Lio/grpc/internal/w0;

    invoke-direct {v3}, Lio/grpc/internal/w0;-><init>()V

    iput-object v3, v0, Lio/grpc/internal/y1;->n:Lio/grpc/internal/w0;

    new-instance v3, Lio/grpc/internal/y1$z;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v4, 0x8

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v12}, Lio/grpc/internal/y1$z;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lio/grpc/internal/y1$b0;ZZZI)V

    iput-object v3, v0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v3, v0, Lio/grpc/internal/y1;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v3, v0, Lio/grpc/internal/y1;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v3, v0, Lio/grpc/internal/y1;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v3, p1

    iput-object v3, v0, Lio/grpc/internal/y1;->a:Lvi/x0;

    move-object/from16 v3, p3

    iput-object v3, v0, Lio/grpc/internal/y1;->j:Lio/grpc/internal/y1$t;

    move-wide/from16 v3, p4

    iput-wide v3, v0, Lio/grpc/internal/y1;->k:J

    move-wide/from16 v3, p6

    iput-wide v3, v0, Lio/grpc/internal/y1;->l:J

    move-object/from16 v3, p8

    iput-object v3, v0, Lio/grpc/internal/y1;->b:Ljava/util/concurrent/Executor;

    move-object/from16 v3, p9

    iput-object v3, v0, Lio/grpc/internal/y1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v3, p2

    iput-object v3, v0, Lio/grpc/internal/y1;->e:Lvi/w0;

    iput-object v1, v0, Lio/grpc/internal/y1;->f:Lio/grpc/internal/z1;

    if-eqz v1, :cond_0

    iget-wide v3, v1, Lio/grpc/internal/z1;->b:J

    iput-wide v3, v0, Lio/grpc/internal/y1;->x:J

    :cond_0
    iput-object v2, v0, Lio/grpc/internal/y1;->g:Lio/grpc/internal/s0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v4

    :goto_1
    const-string v5, "Should not provide both retryPolicy and hedgingPolicy"

    invoke-static {v1, v5}, Leb/o;->e(ZLjava/lang/Object;)V

    if-eqz v2, :cond_3

    move v3, v4

    :cond_3
    iput-boolean v3, v0, Lio/grpc/internal/y1;->h:Z

    move-object/from16 v1, p12

    iput-object v1, v0, Lio/grpc/internal/y1;->m:Lio/grpc/internal/y1$c0;

    return-void
.end method

.method static synthetic A(Lio/grpc/internal/y1;)Lvi/g1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->s:Lvi/g1;

    return-object p0
.end method

.method static synthetic B(Lio/grpc/internal/y1;Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/grpc/internal/y1;->m0(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V

    return-void
.end method

.method static synthetic C(Lio/grpc/internal/y1;)Lio/grpc/internal/r;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->u:Lio/grpc/internal/r;

    return-object p0
.end method

.method static synthetic D(Lio/grpc/internal/y1;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic E(Lio/grpc/internal/y1;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic F(Lio/grpc/internal/y1;)Z
    .locals 0

    iget-boolean p0, p0, Lio/grpc/internal/y1;->h:Z

    return p0
.end method

.method static synthetic G(Lio/grpc/internal/y1;)Lio/grpc/internal/z1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->f:Lio/grpc/internal/z1;

    return-object p0
.end method

.method static synthetic H(Lio/grpc/internal/y1;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/y1;->g0()V

    return-void
.end method

.method static synthetic I(Lio/grpc/internal/y1;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->l0(Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic J(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)Lio/grpc/internal/y1$u;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1;->v:Lio/grpc/internal/y1$u;

    return-object p1
.end method

.method static synthetic K(Lio/grpc/internal/y1;)J
    .locals 2

    iget-wide v0, p0, Lio/grpc/internal/y1;->x:J

    return-wide v0
.end method

.method static synthetic L(Lio/grpc/internal/y1;J)J
    .locals 0

    iput-wide p1, p0, Lio/grpc/internal/y1;->x:J

    return-wide p1
.end method

.method static synthetic M()Ljava/util/Random;
    .locals 1

    sget-object v0, Lio/grpc/internal/y1;->D:Ljava/util/Random;

    return-object v0
.end method

.method static synthetic N(Lio/grpc/internal/y1;)J
    .locals 2

    iget-wide v0, p0, Lio/grpc/internal/y1;->t:J

    return-wide v0
.end method

.method static synthetic O(Lio/grpc/internal/y1;J)J
    .locals 0

    iput-wide p1, p0, Lio/grpc/internal/y1;->t:J

    return-wide p1
.end method

.method static synthetic P(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    return-object p0
.end method

.method static synthetic Q(Lio/grpc/internal/y1;)J
    .locals 2

    iget-wide v0, p0, Lio/grpc/internal/y1;->k:J

    return-wide v0
.end method

.method static synthetic R(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Lio/grpc/internal/y1$z;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    return-object p1
.end method

.method static synthetic S(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$t;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->j:Lio/grpc/internal/y1$t;

    return-object p0
.end method

.method static synthetic T(Lio/grpc/internal/y1;)J
    .locals 2

    iget-wide v0, p0, Lio/grpc/internal/y1;->l:J

    return-wide v0
.end method

.method static synthetic U(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->b0(Lio/grpc/internal/y1$b0;)Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic V(Lio/grpc/internal/y1;IZ)Lio/grpc/internal/y1$b0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/y1;->d0(IZ)Lio/grpc/internal/y1$b0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic W(Lio/grpc/internal/y1;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic X(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Z
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->h0(Lio/grpc/internal/y1$z;)Z

    move-result p0

    return p0
.end method

.method static synthetic Y(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$c0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->m:Lio/grpc/internal/y1$c0;

    return-object p0
.end method

.method static synthetic Z(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)Lio/grpc/internal/y1$u;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    return-object p1
.end method

.method static synthetic a0(Lio/grpc/internal/y1;)Lio/grpc/internal/s0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->g:Lio/grpc/internal/s0;

    return-object p0
.end method

.method private b0(Lio/grpc/internal/y1$b0;)Ljava/lang/Runnable;
    .locals 9

    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, v1, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v5, v1, Lio/grpc/internal/y1$z;->c:Ljava/util/Collection;

    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    invoke-virtual {v1, p1}, Lio/grpc/internal/y1$z;->c(Lio/grpc/internal/y1$b0;)Lio/grpc/internal/y1$z;

    move-result-object v1

    iput-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, p0, Lio/grpc/internal/y1;->j:Lio/grpc/internal/y1$t;

    iget-wide v3, p0, Lio/grpc/internal/y1;->t:J

    neg-long v3, v3

    invoke-virtual {v1, v3, v4}, Lio/grpc/internal/y1$t;->a(J)J

    iget-object v1, p0, Lio/grpc/internal/y1;->v:Lio/grpc/internal/y1$u;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/grpc/internal/y1$u;->b()Ljava/util/concurrent/Future;

    move-result-object v1

    iput-object v2, p0, Lio/grpc/internal/y1;->v:Lio/grpc/internal/y1$u;

    move-object v7, v1

    goto :goto_0

    :cond_1
    move-object v7, v2

    :goto_0
    iget-object v1, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/grpc/internal/y1$u;->b()Ljava/util/concurrent/Future;

    move-result-object v1

    iput-object v2, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    move-object v8, v1

    goto :goto_1

    :cond_2
    move-object v8, v2

    :goto_1
    new-instance v1, Lio/grpc/internal/y1$c;

    move-object v3, v1

    move-object v4, p0

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Lio/grpc/internal/y1$c;-><init>(Lio/grpc/internal/y1;Ljava/util/Collection;Lio/grpc/internal/y1$b0;Ljava/util/concurrent/Future;Ljava/util/concurrent/Future;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private c0(Lio/grpc/internal/y1$b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->b0(Lio/grpc/internal/y1$b0;)Ljava/lang/Runnable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method private d0(IZ)Lio/grpc/internal/y1$b0;
    .locals 3

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/y1;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/y1;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lio/grpc/internal/y1$b0;

    invoke-direct {v0, p1}, Lio/grpc/internal/y1$b0;-><init>(I)V

    new-instance v1, Lio/grpc/internal/y1$s;

    invoke-direct {v1, p0, v0}, Lio/grpc/internal/y1$s;-><init>(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V

    new-instance v2, Lio/grpc/internal/y1$o;

    invoke-direct {v2, p0, v1}, Lio/grpc/internal/y1$o;-><init>(Lio/grpc/internal/y1;Lvi/k;)V

    iget-object v1, p0, Lio/grpc/internal/y1;->e:Lvi/w0;

    invoke-virtual {p0, v1, p1}, Lio/grpc/internal/y1;->o0(Lvi/w0;I)Lvi/w0;

    move-result-object v1

    invoke-virtual {p0, v1, v2, p1, p2}, Lio/grpc/internal/y1;->i0(Lvi/w0;Lvi/k$a;IZ)Lio/grpc/internal/q;

    move-result-object p1

    iput-object p1, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    return-object v0
.end method

.method private e0(Lio/grpc/internal/y1$r;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-boolean v1, v1, Lio/grpc/internal/y1$z;->a:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, v1, Lio/grpc/internal/y1$z;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, v1, Lio/grpc/internal/y1$z;->c:Ljava/util/Collection;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/grpc/internal/y1$b0;

    invoke-interface {p1, v1}, Lio/grpc/internal/y1$r;->a(Lio/grpc/internal/y1$b0;)V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private f0(Lio/grpc/internal/y1$b0;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    move-object v3, v1

    :goto_0
    iget-object v4, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    if-eqz v0, :cond_1

    iget-object v6, v5, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    if-eqz v6, :cond_0

    if-eq v6, p1, :cond_0

    :goto_1
    monitor-exit v4

    goto :goto_2

    :cond_0
    iget-boolean v6, v5, Lio/grpc/internal/y1$z;->g:Z

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v6, v5, Lio/grpc/internal/y1$z;->b:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v2, v6, :cond_5

    invoke-virtual {v5, p1}, Lio/grpc/internal/y1$z;->h(Lio/grpc/internal/y1$b0;)Lio/grpc/internal/y1$z;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    invoke-virtual {p0}, Lio/grpc/internal/y1;->d()Z

    move-result v0

    if-nez v0, :cond_2

    monitor-exit v4

    return-void

    :cond_2
    new-instance v1, Lio/grpc/internal/y1$p;

    invoke-direct {v1, p0}, Lio/grpc/internal/y1$p;-><init>(Lio/grpc/internal/y1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    if-eqz v1, :cond_3

    iget-object p1, p0, Lio/grpc/internal/y1;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    iget-object v0, p1, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, v1, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    if-ne v1, p1, :cond_4

    iget-object p1, p0, Lio/grpc/internal/y1;->y:Lvi/g1;

    goto :goto_3

    :cond_4
    sget-object p1, Lio/grpc/internal/y1;->C:Lvi/g1;

    :goto_3
    invoke-interface {v0, p1}, Lio/grpc/internal/q;->c(Lvi/g1;)V

    return-void

    :cond_5
    :try_start_1
    iget-boolean v6, p1, Lio/grpc/internal/y1$b0;->b:Z

    if-eqz v6, :cond_6

    monitor-exit v4

    return-void

    :cond_6
    add-int/lit16 v6, v2, 0x80

    iget-object v7, v5, Lio/grpc/internal/y1$z;->b:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/ArrayList;

    iget-object v5, v5, Lio/grpc/internal/y1$z;->b:Ljava/util/List;

    invoke-interface {v5, v2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_4

    :cond_7
    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v5, v5, Lio/grpc/internal/y1$z;->b:Ljava/util/List;

    invoke-interface {v5, v2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_4
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/grpc/internal/y1$r;

    invoke-interface {v4, p1}, Lio/grpc/internal/y1$r;->a(Lio/grpc/internal/y1$b0;)V

    instance-of v4, v4, Lio/grpc/internal/y1$y;

    if-eqz v4, :cond_9

    const/4 v0, 0x1

    :cond_9
    if-eqz v0, :cond_8

    iget-object v4, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v5, v4, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    if-eqz v5, :cond_a

    if-eq v5, p1, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean v4, v4, Lio/grpc/internal/y1$z;->g:Z

    if-eqz v4, :cond_8

    :cond_b
    :goto_5
    move v2, v6

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private g0()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/grpc/internal/y1$u;->b()Ljava/util/concurrent/Future;

    move-result-object v1

    iput-object v2, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    move-object v2, v1

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    invoke-virtual {v1}, Lio/grpc/internal/y1$z;->d()Lio/grpc/internal/y1$z;

    move-result-object v1

    iput-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private h0(Lio/grpc/internal/y1$z;)Z
    .locals 2

    iget-object v0, p1, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    if-nez v0, :cond_0

    iget v0, p1, Lio/grpc/internal/y1$z;->e:I

    iget-object v1, p0, Lio/grpc/internal/y1;->g:Lio/grpc/internal/s0;

    iget v1, v1, Lio/grpc/internal/s0;->a:I

    if-ge v0, v1, :cond_0

    iget-boolean p1, p1, Lio/grpc/internal/y1$z;->h:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private l0(Ljava/lang/Integer;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_1

    invoke-direct {p0}, Lio/grpc/internal/y1;->g0()V

    return-void

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    if-nez v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    invoke-virtual {v1}, Lio/grpc/internal/y1$u;->b()Ljava/util/concurrent/Future;

    move-result-object v1

    new-instance v2, Lio/grpc/internal/y1$u;

    iget-object v3, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    invoke-direct {v2, v3}, Lio/grpc/internal/y1$u;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    iget-object v0, p0, Lio/grpc/internal/y1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lio/grpc/internal/y1$w;

    invoke-direct {v1, p0, v2}, Lio/grpc/internal/y1$w;-><init>(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v3, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v3, v4, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {v2, p1}, Lio/grpc/internal/y1$u;->c(Ljava/util/concurrent/Future;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private m0(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lio/grpc/internal/y1$q;

    invoke-direct {v1, p0, p1, p2, p3}, Lio/grpc/internal/y1$q;-><init>(Lio/grpc/internal/y1;Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic p()Lvi/g1;
    .locals 1

    sget-object v0, Lio/grpc/internal/y1;->C:Lvi/g1;

    return-object v0
.end method

.method static synthetic q(Lio/grpc/internal/y1;)Z
    .locals 0

    iget-boolean p0, p0, Lio/grpc/internal/y1;->z:Z

    return p0
.end method

.method static synthetic r(Lio/grpc/internal/y1;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method static synthetic s(Lio/grpc/internal/y1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/grpc/internal/y1;->z:Z

    return p1
.end method

.method static synthetic t(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->f0(Lio/grpc/internal/y1$b0;)V

    return-void
.end method

.method static synthetic u(Lio/grpc/internal/y1;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic v(Lio/grpc/internal/y1;)Lvi/x0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->a:Lvi/x0;

    return-object p0
.end method

.method static synthetic w(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->c0(Lio/grpc/internal/y1$b0;)V

    return-void
.end method

.method static synthetic x(Lio/grpc/internal/y1;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic y(Lio/grpc/internal/y1;)Lio/grpc/internal/w0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->n:Lio/grpc/internal/w0;

    return-object p0
.end method

.method static synthetic z(Lio/grpc/internal/y1;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/y1;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method


# virtual methods
.method public final a(Lvi/n;)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$d;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$d;-><init>(Lio/grpc/internal/y1;Lvi/n;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-boolean v1, v0, Lio/grpc/internal/y1$z;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    iget-object v0, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->b(I)V

    return-void

    :cond_0
    new-instance v0, Lio/grpc/internal/y1$m;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$m;-><init>(Lio/grpc/internal/y1;I)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final c(Lvi/g1;)V
    .locals 3

    new-instance v0, Lio/grpc/internal/y1$b0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/grpc/internal/y1$b0;-><init>(I)V

    new-instance v1, Lio/grpc/internal/n1;

    invoke-direct {v1}, Lio/grpc/internal/n1;-><init>()V

    iput-object v1, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->b0(Lio/grpc/internal/y1$b0;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lio/grpc/internal/y1;->s:Lvi/g1;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lio/grpc/internal/y1;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    sget-object v0, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    new-instance v1, Lvi/w0;

    invoke-direct {v1}, Lvi/w0;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lio/grpc/internal/y1;->m0(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, v1, Lio/grpc/internal/y1$z;->c:Ljava/util/Collection;

    iget-object v2, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v2, v2, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    invoke-interface {v1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, v1, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    goto :goto_0

    :cond_2
    iput-object p1, p0, Lio/grpc/internal/y1;->y:Lvi/g1;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    invoke-virtual {v2}, Lio/grpc/internal/y1$z;->b()Lio/grpc/internal/y1$z;

    move-result-object v2

    iput-object v2, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    iget-object v0, v1, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->c(Lvi/g1;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v0, v0, Lio/grpc/internal/y1$z;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/grpc/internal/y1$b0;

    iget-object v1, v1, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-interface {v1}, Lio/grpc/internal/i2;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final e(I)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$j;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$j;-><init>(Lio/grpc/internal/y1;I)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final f(I)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$k;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$k;-><init>(Lio/grpc/internal/y1;I)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final flush()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-boolean v1, v0, Lio/grpc/internal/y1$z;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    iget-object v0, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-interface {v0}, Lio/grpc/internal/i2;->flush()V

    return-void

    :cond_0
    new-instance v0, Lio/grpc/internal/y1$g;

    invoke-direct {v0, p0}, Lio/grpc/internal/y1$g;-><init>(Lio/grpc/internal/y1;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final g(Lvi/t;)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$e;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$e;-><init>(Lio/grpc/internal/y1;Lvi/t;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final h(Ljava/io/InputStream;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RetriableStream.writeMessage() should not be called directly"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i()V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$l;

    invoke-direct {v0, p0}, Lio/grpc/internal/y1$l;-><init>(Lio/grpc/internal/y1;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method abstract i0(Lvi/w0;Lvi/k$a;IZ)Lio/grpc/internal/q;
.end method

.method public final j(Z)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$h;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$h;-><init>(Lio/grpc/internal/y1;Z)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method abstract j0()V
.end method

.method public final k(Lvi/v;)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$f;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$f;-><init>(Lio/grpc/internal/y1;Lvi/v;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method abstract k0()Lvi/g1;
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$b;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$b;-><init>(Lio/grpc/internal/y1;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public m(Lio/grpc/internal/w0;)V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "closed"

    iget-object v2, p0, Lio/grpc/internal/y1;->n:Lio/grpc/internal/w0;

    invoke-virtual {p1, v1, v2}, Lio/grpc/internal/w0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/w0;

    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    if-eqz v0, :cond_0

    new-instance v0, Lio/grpc/internal/w0;

    invoke-direct {v0}, Lio/grpc/internal/w0;-><init>()V

    iget-object v1, v1, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    iget-object v1, v1, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-interface {v1, v0}, Lio/grpc/internal/q;->m(Lio/grpc/internal/w0;)V

    const-string v1, "committed"

    :goto_0
    invoke-virtual {p1, v1, v0}, Lio/grpc/internal/w0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/w0;

    goto :goto_2

    :cond_0
    new-instance v0, Lio/grpc/internal/w0;

    invoke-direct {v0}, Lio/grpc/internal/w0;-><init>()V

    iget-object v1, v1, Lio/grpc/internal/y1$z;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/grpc/internal/y1$b0;

    new-instance v3, Lio/grpc/internal/w0;

    invoke-direct {v3}, Lio/grpc/internal/w0;-><init>()V

    iget-object v2, v2, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    invoke-interface {v2, v3}, Lio/grpc/internal/q;->m(Lio/grpc/internal/w0;)V

    invoke-virtual {v0, v3}, Lio/grpc/internal/w0;->a(Ljava/lang/Object;)Lio/grpc/internal/w0;

    goto :goto_1

    :cond_1
    const-string v1, "open"

    goto :goto_0

    :goto_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final n()V
    .locals 1

    new-instance v0, Lio/grpc/internal/y1$i;

    invoke-direct {v0, p0}, Lio/grpc/internal/y1$i;-><init>(Lio/grpc/internal/y1;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method final n0(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-boolean v1, v0, Lio/grpc/internal/y1$z;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lio/grpc/internal/y1$z;->f:Lio/grpc/internal/y1$b0;

    iget-object v0, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    iget-object v1, p0, Lio/grpc/internal/y1;->a:Lvi/x0;

    invoke-virtual {v1, p1}, Lvi/x0;->j(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->h(Ljava/io/InputStream;)V

    return-void

    :cond_0
    new-instance v0, Lio/grpc/internal/y1$n;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/y1$n;-><init>(Lio/grpc/internal/y1;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/y1;->e0(Lio/grpc/internal/y1$r;)V

    return-void
.end method

.method public final o(Lio/grpc/internal/r;)V
    .locals 6

    iput-object p1, p0, Lio/grpc/internal/y1;->u:Lio/grpc/internal/r;

    invoke-virtual {p0}, Lio/grpc/internal/y1;->k0()Lvi/g1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lio/grpc/internal/y1;->c(Lvi/g1;)V

    return-void

    :cond_0
    iget-object p1, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v0, v0, Lio/grpc/internal/y1$z;->b:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/y1$y;

    invoke-direct {v1, p0}, Lio/grpc/internal/y1$y;-><init>(Lio/grpc/internal/y1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 p1, 0x0

    invoke-direct {p0, p1, p1}, Lio/grpc/internal/y1;->d0(IZ)Lio/grpc/internal/y1$b0;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lio/grpc/internal/y1;->h:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    invoke-virtual {v1, p1}, Lio/grpc/internal/y1$z;->a(Lio/grpc/internal/y1$b0;)Lio/grpc/internal/y1$z;

    move-result-object v1

    iput-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    iget-object v1, p0, Lio/grpc/internal/y1;->o:Lio/grpc/internal/y1$z;

    invoke-direct {p0, v1}, Lio/grpc/internal/y1;->h0(Lio/grpc/internal/y1$z;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/grpc/internal/y1;->m:Lio/grpc/internal/y1$c0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/grpc/internal/y1$c0;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    new-instance v1, Lio/grpc/internal/y1$u;

    iget-object v2, p0, Lio/grpc/internal/y1;->i:Ljava/lang/Object;

    invoke-direct {v1, v2}, Lio/grpc/internal/y1$u;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/grpc/internal/y1;->w:Lio/grpc/internal/y1$u;

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_4

    iget-object v0, p0, Lio/grpc/internal/y1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lio/grpc/internal/y1$w;

    invoke-direct {v2, p0, v1}, Lio/grpc/internal/y1$w;-><init>(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)V

    iget-object v3, p0, Lio/grpc/internal/y1;->g:Lio/grpc/internal/s0;

    iget-wide v3, v3, Lio/grpc/internal/s0;->b:J

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/grpc/internal/y1$u;->c(Ljava/util/concurrent/Future;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    :goto_1
    invoke-direct {p0, p1}, Lio/grpc/internal/y1;->f0(Lio/grpc/internal/y1$b0;)V

    return-void

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method final o0(Lvi/w0;I)Lvi/w0;
    .locals 1

    new-instance v0, Lvi/w0;

    invoke-direct {v0}, Lvi/w0;-><init>()V

    invoke-virtual {v0, p1}, Lvi/w0;->l(Lvi/w0;)V

    if-lez p2, :cond_0

    sget-object p1, Lio/grpc/internal/y1;->A:Lvi/w0$g;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lvi/w0;->o(Lvi/w0$g;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method
