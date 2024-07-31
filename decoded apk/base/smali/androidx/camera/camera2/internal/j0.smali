.class final Landroidx/camera/camera2/internal/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/j0$g;,
        Landroidx/camera/camera2/internal/j0$h;,
        Landroidx/camera/camera2/internal/j0$f;,
        Landroidx/camera/camera2/internal/j0$d;,
        Landroidx/camera/camera2/internal/j0$e;,
        Landroidx/camera/camera2/internal/j0$i;
    }
.end annotation


# instance fields
.field final A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/camera2/internal/y1;",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field final B:Landroidx/camera/camera2/internal/j0$d;

.field final C:Landroidx/camera/camera2/internal/j0$e;

.field final D:Lx/a;

.field final E:Landroidx/camera/core/impl/h0;

.field final F:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/camera2/internal/x1;",
            ">;"
        }
    .end annotation
.end field

.field private G:Landroidx/camera/camera2/internal/n2;

.field private final H:Landroidx/camera/camera2/internal/a2;

.field private final I:Landroidx/camera/camera2/internal/j3$a;

.field private final J:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private K:Landroidx/camera/core/impl/u;

.field final L:Ljava/lang/Object;

.field private M:Landroidx/camera/core/impl/z1;

.field N:Z

.field private final O:Landroidx/camera/camera2/internal/c2;

.field private final P:Landroidx/camera/camera2/internal/compat/d0;

.field private final Q:Lr/b;

.field private final a:Landroidx/camera/core/impl/j2;

.field private final b:Landroidx/camera/camera2/internal/compat/r0;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field volatile e:Landroidx/camera/camera2/internal/j0$g;

.field private final f:Landroidx/camera/core/impl/j1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/j1<",
            "Landroidx/camera/core/impl/c0$a;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Landroidx/camera/camera2/internal/p1;

.field private final s:Landroidx/camera/camera2/internal/u;

.field private final t:Landroidx/camera/camera2/internal/j0$h;

.field final u:Landroidx/camera/camera2/internal/n0;

.field v:Landroid/hardware/camera2/CameraDevice;

.field w:I

.field x:Landroidx/camera/camera2/internal/y1;

.field final y:Ljava/util/concurrent/atomic/AtomicInteger;

.field z:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/compat/r0;Ljava/lang/String;Landroidx/camera/camera2/internal/n0;Lx/a;Landroidx/camera/core/impl/h0;Ljava/util/concurrent/Executor;Landroid/os/Handler;Landroidx/camera/camera2/internal/c2;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    sget-object v5, Landroidx/camera/camera2/internal/j0$g;->INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

    iput-object v5, v1, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    new-instance v5, Landroidx/camera/core/impl/j1;

    invoke-direct {v5}, Landroidx/camera/core/impl/j1;-><init>()V

    iput-object v5, v1, Landroidx/camera/camera2/internal/j0;->f:Landroidx/camera/core/impl/j1;

    const/4 v6, 0x0

    iput v6, v1, Landroidx/camera/camera2/internal/j0;->w:I

    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v7, v1, Landroidx/camera/camera2/internal/j0;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/j0;->A:Ljava/util/Map;

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/j0;->F:Ljava/util/Set;

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/j0;->J:Ljava/util/Set;

    invoke-static {}, Landroidx/camera/core/impl/x;->a()Landroidx/camera/core/impl/u;

    move-result-object v7

    iput-object v7, v1, Landroidx/camera/camera2/internal/j0;->K:Landroidx/camera/core/impl/u;

    new-instance v7, Ljava/lang/Object;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v7, v1, Landroidx/camera/camera2/internal/j0;->L:Ljava/lang/Object;

    iput-boolean v6, v1, Landroidx/camera/camera2/internal/j0;->N:Z

    iput-object v0, v1, Landroidx/camera/camera2/internal/j0;->b:Landroidx/camera/camera2/internal/compat/r0;

    move-object/from16 v6, p4

    iput-object v6, v1, Landroidx/camera/camera2/internal/j0;->D:Lx/a;

    iput-object v4, v1, Landroidx/camera/camera2/internal/j0;->E:Landroidx/camera/core/impl/h0;

    invoke-static/range {p7 .. p7}, Lz/a;->e(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v12

    iput-object v12, v1, Landroidx/camera/camera2/internal/j0;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static/range {p6 .. p6}, Lz/a;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v13

    iput-object v13, v1, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v6, Landroidx/camera/camera2/internal/j0$h;

    invoke-direct {v6, v1, v13, v12}, Landroidx/camera/camera2/internal/j0$h;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v6, v1, Landroidx/camera/camera2/internal/j0;->t:Landroidx/camera/camera2/internal/j0$h;

    new-instance v6, Landroidx/camera/core/impl/j2;

    invoke-direct {v6, v2}, Landroidx/camera/core/impl/j2;-><init>(Ljava/lang/String;)V

    iput-object v6, v1, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    sget-object v6, Landroidx/camera/core/impl/c0$a;->CLOSED:Landroidx/camera/core/impl/c0$a;

    invoke-virtual {v5, v6}, Landroidx/camera/core/impl/j1;->a(Ljava/lang/Object;)V

    new-instance v5, Landroidx/camera/camera2/internal/p1;

    invoke-direct {v5, v4}, Landroidx/camera/camera2/internal/p1;-><init>(Landroidx/camera/core/impl/h0;)V

    iput-object v5, v1, Landroidx/camera/camera2/internal/j0;->r:Landroidx/camera/camera2/internal/p1;

    new-instance v14, Landroidx/camera/camera2/internal/a2;

    invoke-direct {v14, v13}, Landroidx/camera/camera2/internal/a2;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v14, v1, Landroidx/camera/camera2/internal/j0;->H:Landroidx/camera/camera2/internal/a2;

    move-object/from16 v6, p8

    iput-object v6, v1, Landroidx/camera/camera2/internal/j0;->O:Landroidx/camera/camera2/internal/c2;

    :try_start_0
    invoke-virtual/range {p1 .. p2}, Landroidx/camera/camera2/internal/compat/r0;->c(Ljava/lang/String;)Landroidx/camera/camera2/internal/compat/d0;

    move-result-object v15

    iput-object v15, v1, Landroidx/camera/camera2/internal/j0;->P:Landroidx/camera/camera2/internal/compat/d0;

    new-instance v11, Landroidx/camera/camera2/internal/u;

    new-instance v10, Landroidx/camera/camera2/internal/j0$f;

    invoke-direct {v10, v1}, Landroidx/camera/camera2/internal/j0$f;-><init>(Landroidx/camera/camera2/internal/j0;)V

    invoke-virtual/range {p3 .. p3}, Landroidx/camera/camera2/internal/n0;->e()Landroidx/camera/core/impl/t1;

    move-result-object v16

    move-object v6, v11

    move-object v7, v15

    move-object v8, v12

    move-object v9, v13

    move-object v0, v11

    move-object/from16 v11, v16

    invoke-direct/range {v6 .. v11}, Landroidx/camera/camera2/internal/u;-><init>(Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/y$c;Landroidx/camera/core/impl/t1;)V

    iput-object v0, v1, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    iput-object v3, v1, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v3, v0}, Landroidx/camera/camera2/internal/n0;->o(Landroidx/camera/camera2/internal/u;)V

    invoke-virtual {v5}, Landroidx/camera/camera2/internal/p1;->a()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroidx/camera/camera2/internal/n0;->r(Landroidx/lifecycle/LiveData;)V
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/h; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v15}, Lr/b;->a(Landroidx/camera/camera2/internal/compat/d0;)Lr/b;

    move-result-object v0

    iput-object v0, v1, Landroidx/camera/camera2/internal/j0;->Q:Lr/b;

    invoke-direct/range {p0 .. p0}, Landroidx/camera/camera2/internal/j0;->d0()Landroidx/camera/camera2/internal/y1;

    move-result-object v0

    iput-object v0, v1, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    new-instance v0, Landroidx/camera/camera2/internal/j3$a;

    invoke-virtual/range {p3 .. p3}, Landroidx/camera/camera2/internal/n0;->e()Landroidx/camera/core/impl/t1;

    move-result-object v11

    invoke-static {}, Ls/l;->b()Landroidx/camera/core/impl/t1;

    move-result-object v3

    move-object v6, v0

    move-object v7, v13

    move-object v8, v12

    move-object/from16 v9, p7

    move-object v10, v14

    move-object v12, v3

    invoke-direct/range {v6 .. v12}, Landroidx/camera/camera2/internal/j3$a;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Landroidx/camera/camera2/internal/a2;Landroidx/camera/core/impl/t1;Landroidx/camera/core/impl/t1;)V

    iput-object v0, v1, Landroidx/camera/camera2/internal/j0;->I:Landroidx/camera/camera2/internal/j3$a;

    new-instance v0, Landroidx/camera/camera2/internal/j0$d;

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$d;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;)V

    iput-object v0, v1, Landroidx/camera/camera2/internal/j0;->B:Landroidx/camera/camera2/internal/j0$d;

    new-instance v2, Landroidx/camera/camera2/internal/j0$e;

    invoke-direct {v2, v1}, Landroidx/camera/camera2/internal/j0$e;-><init>(Landroidx/camera/camera2/internal/j0;)V

    iput-object v2, v1, Landroidx/camera/camera2/internal/j0;->C:Landroidx/camera/camera2/internal/j0$e;

    invoke-virtual {v4, v1, v13, v2, v0}, Landroidx/camera/core/impl/h0;->g(Lw/i;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/h0$b;Landroidx/camera/core/impl/h0$c;)V

    move-object/from16 v2, p1

    invoke-virtual {v2, v13, v0}, Landroidx/camera/camera2/internal/compat/r0;->g(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/camera/camera2/internal/q1;->a(Landroidx/camera/camera2/internal/compat/h;)Lw/r;

    move-result-object v0

    throw v0
.end method

.method private A()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/camera/camera2/internal/j0;->M(Landroidx/camera/camera2/internal/n2;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/n2;->g()Landroidx/camera/core/impl/y1;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/n2;->h()Landroidx/camera/core/impl/k2;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Landroidx/camera/core/impl/j2;->r(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/n2;->g()Landroidx/camera/core/impl/y1;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/n2;->h()Landroidx/camera/core/impl/k2;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Landroidx/camera/core/impl/j2;->q(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    :cond_0
    return-void
.end method

.method private B()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->f()Landroidx/camera/core/impl/y1$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->b()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/camera/camera2/internal/n2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/n0;->l()Landroidx/camera/camera2/internal/compat/d0;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->O:Landroidx/camera/camera2/internal/c2;

    new-instance v3, Landroidx/camera/camera2/internal/z;

    invoke-direct {v3, p0}, Landroidx/camera/camera2/internal/z;-><init>(Landroidx/camera/camera2/internal/j0;)V

    invoke-direct {v0, v1, v2, v3}, Landroidx/camera/camera2/internal/n2;-><init>(Landroidx/camera/camera2/internal/compat/d0;Landroidx/camera/camera2/internal/c2;Landroidx/camera/camera2/internal/n2$c;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    :cond_0
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->A()V

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    if-ne v2, v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-lt v2, v0, :cond_3

    :goto_0
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->m0()V

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", CaptureConfig Surfaces: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraImpl"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private C(Landroidx/camera/core/impl/l0$a;)Z
    .locals 5

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0$a;->m()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Camera2CameraImpl"

    if-nez v0, :cond_0

    const-string p1, "The capture config builder already has surface inside."

    :goto_0
    invoke-static {v2, p1}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/y1;

    invoke-virtual {v3}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/r0;

    invoke-virtual {p1, v4}, Landroidx/camera/core/impl/l0$a;->f(Landroidx/camera/core/impl/r0;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroidx/camera/core/impl/l0$a;->m()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Unable to find a repeating surface to attach to CaptureConfig"

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private E()V
    .locals 3

    const-string v0, "Closing camera."

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/camera2/internal/j0$c;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->t:Landroidx/camera/camera2/internal/j0$h;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/j0$h;->a()Z

    move-result v0

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->Q()Z

    move-result v0

    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->K()V

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    invoke-virtual {p0, v2}, Landroidx/camera/camera2/internal/j0;->D(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    if-nez v0, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Landroidx/core/util/h;->m(Z)V

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private F(Z)V
    .locals 5

    new-instance v0, Landroidx/camera/camera2/internal/x1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->Q:Lr/b;

    invoke-direct {v0, v1}, Landroidx/camera/camera2/internal/x1;-><init>(Lr/b;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->F:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->n0(Z)V

    new-instance p1, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-virtual {p1, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    new-instance v2, Landroidx/camera/camera2/internal/i0;

    invoke-direct {v2, v1, p1}, Landroidx/camera/camera2/internal/i0;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    new-instance p1, Landroidx/camera/core/impl/y1$b;

    invoke-direct {p1}, Landroidx/camera/core/impl/y1$b;-><init>()V

    new-instance v3, Landroidx/camera/core/impl/h1;

    invoke-direct {v3, v1}, Landroidx/camera/core/impl/h1;-><init>(Landroid/view/Surface;)V

    invoke-virtual {p1, v3}, Landroidx/camera/core/impl/y1$b;->h(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$b;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/y1$b;->t(I)Landroidx/camera/core/impl/y1$b;

    const-string v1, "Start configAndClose."

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object p1

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/CameraDevice;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->I:Landroidx/camera/camera2/internal/j3$a;

    invoke-virtual {v4}, Landroidx/camera/camera2/internal/j3$a;->a()Landroidx/camera/camera2/internal/j3;

    move-result-object v4

    invoke-virtual {v0, p1, v1, v4}, Landroidx/camera/camera2/internal/x1;->g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v1, Landroidx/camera/camera2/internal/y;

    invoke-direct {v1, p0, v0, v3, v2}, Landroidx/camera/camera2/internal/y;-><init>(Landroidx/camera/camera2/internal/j0;Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v1, v0}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private G()Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->f()Landroidx/camera/core/impl/y1$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->b()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->H:Landroidx/camera/camera2/internal/a2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/a2;->c()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->t:Landroidx/camera/camera2/internal/j0$h;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Landroidx/camera/camera2/internal/n1;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    return-object v0
.end method

.method private I(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "{%s} %s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    invoke-static {v0, p1, p2}, Lw/o0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static L(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN ERROR"

    return-object p0

    :cond_0
    const-string p0, "ERROR_CAMERA_SERVICE"

    return-object p0

    :cond_1
    const-string p0, "ERROR_CAMERA_DEVICE"

    return-object p0

    :cond_2
    const-string p0, "ERROR_CAMERA_DISABLED"

    return-object p0

    :cond_3
    const-string p0, "ERROR_MAX_CAMERAS_IN_USE"

    return-object p0

    :cond_4
    const-string p0, "ERROR_CAMERA_IN_USE"

    return-object p0

    :cond_5
    const-string p0, "ERROR_NONE"

    return-object p0
.end method

.method static M(Landroidx/camera/camera2/internal/n2;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n2;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static N(Landroidx/camera/core/w;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/camera/core/w;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private O()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/n0;->n()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic R()V
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->P()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/n2;->g()Landroidx/camera/core/impl/y1;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/n2;->h()Landroidx/camera/core/impl/k2;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-static {v2}, Landroidx/camera/camera2/internal/j0;->M(Landroidx/camera/camera2/internal/n2;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v0, v1}, Landroidx/camera/camera2/internal/j0;->o0(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    return-void
.end method

.method private synthetic S(Ljava/util/List;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->u0(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->v()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/u;->v()V

    throw p1
.end method

.method private static synthetic T(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method private synthetic U(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/j0;->k0(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic V(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->v0(Ljava/util/Collection;)V

    return-void
.end method

.method private synthetic W(Landroidx/concurrent/futures/c$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-static {v0}, Landroidx/camera/camera2/internal/j0;->M(Landroidx/camera/camera2/internal/n2;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/j2;->l(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method private synthetic X(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/a0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/a0;-><init>(Landroidx/camera/camera2/internal/j0;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unable to check if MeteringRepeating is attached. Camera executor shut down."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    const-string p1, "isMeteringRepeatingAttached"

    return-object p1
.end method

.method private synthetic Y(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/j2;->q(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/j2;->u(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->y0()V

    return-void
.end method

.method private synthetic Z(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " INACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/j2;->t(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->y0()V

    return-void
.end method

.method private static synthetic a0(Landroidx/camera/core/impl/y1$c;Landroidx/camera/core/impl/y1;)V
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/y1$f;->SESSION_ERROR_SURFACE_NEEDS_RESET:Landroidx/camera/core/impl/y1$f;

    invoke-interface {p0, p1, v0}, Landroidx/camera/core/impl/y1$c;->a(Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method

.method private synthetic b0(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " RESET"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/j2;->u(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->B()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->n0(Z)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->y0()V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object p2, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->h0()V

    :cond_0
    return-void
.end method

.method private synthetic c0(Z)V
    .locals 1

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/j0;->N:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->PENDING_OPEN:Landroidx/camera/camera2/internal/j0$g;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->w0(Z)V

    :cond_0
    return-void
.end method

.method private d0()Landroidx/camera/camera2/internal/y1;
    .locals 8

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->L:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->M:Landroidx/camera/core/impl/z1;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/camera/camera2/internal/x1;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->Q:Lr/b;

    invoke-direct {v1, v2}, Landroidx/camera/camera2/internal/x1;-><init>(Lr/b;)V

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Landroidx/camera/camera2/internal/t2;

    iget-object v3, p0, Landroidx/camera/camera2/internal/j0;->M:Landroidx/camera/core/impl/z1;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    iget-object v5, p0, Landroidx/camera/camera2/internal/j0;->Q:Lr/b;

    iget-object v6, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Landroidx/camera/camera2/internal/j0;->d:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Landroidx/camera/camera2/internal/t2;-><init>(Landroidx/camera/core/impl/z1;Landroidx/camera/camera2/internal/n0;Lr/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private e0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/w;

    invoke-static {v0}, Landroidx/camera/camera2/internal/j0;->N(Landroidx/camera/core/w;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->J:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->J:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/camera/core/w;->I()V

    invoke-virtual {v0}, Landroidx/camera/core/w;->G()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private f0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/w;

    invoke-static {v0}, Landroidx/camera/camera2/internal/j0;->N(Landroidx/camera/core/w;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->J:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/w;->J()V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->J:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private g0(Z)V
    .locals 4

    const-string v0, "Unable to open camera due to "

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->t:Landroidx/camera/camera2/internal/j0$h;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/j0$h;->d()V

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->t:Landroidx/camera/camera2/internal/j0$h;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/j0$h;->a()Z

    const-string p1, "Opening camera."

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    sget-object p1, Landroidx/camera/camera2/internal/j0$g;->OPENING:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    :try_start_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->b:Landroidx/camera/camera2/internal/compat/r0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/n0;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->G()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, Landroidx/camera/camera2/internal/compat/r0;->f(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/h; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    sget-object p1, Landroidx/camera/camera2/internal/j0$g;->REOPENING:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->t:Landroidx/camera/camera2/internal/j0$h;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/j0$h;->e()V

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/h;->d()I

    move-result v0

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

    const/4 v1, 0x7

    invoke-static {v1, p1}, Lw/q$a;->b(ILjava/lang/Throwable;)Lw/q$a;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroidx/camera/camera2/internal/j0;->q0(Landroidx/camera/camera2/internal/j0$g;Lw/q$a;)V

    :goto_0
    return-void
.end method

.method private i0()V
    .locals 4

    sget-object v0, Landroidx/camera/camera2/internal/j0$c;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->REOPENING:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->Q()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Landroidx/camera/camera2/internal/j0;->w:I

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    const-string v0, "Camera Device should be open if session close is not complete"

    invoke-static {v1, v0}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->h0()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/j0;->w0(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method private m0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/n2;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/j2;->s(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/n2;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/j2;->t(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/n2;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->G:Landroidx/camera/camera2/internal/n2;

    :cond_0
    return-void
.end method

.method public static synthetic o(Landroidx/camera/camera2/internal/j0;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->W(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private o0(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/y1;",
            "Landroidx/camera/core/impl/k2<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/f0;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/camera2/internal/f0;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic p(Landroidx/camera/camera2/internal/j0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->V(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic q(Landroidx/camera/camera2/internal/j0;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->c0(Z)V

    return-void
.end method

.method public static synthetic r(Landroidx/camera/camera2/internal/j0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->S(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s(Landroidx/camera/camera2/internal/j0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->X(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->Z(Ljava/lang/String;)V

    return-void
.end method

.method private t0(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)",
            "Ljava/util/Collection<",
            "Landroidx/camera/camera2/internal/j0$i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-static {v1}, Landroidx/camera/camera2/internal/j0$i;->b(Landroidx/camera/core/w;)Landroidx/camera/camera2/internal/j0$i;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static synthetic u(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/j0;->b0(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    return-void
.end method

.method private u0(Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/camera2/internal/j0$i;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/camera2/internal/j0$i;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/camera/core/impl/j2;->l(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->c()Landroidx/camera/core/impl/y1;

    move-result-object v6

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->e()Landroidx/camera/core/impl/k2;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Landroidx/camera/core/impl/j2;->r(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->g()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Landroidx/camera/core/s;

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->d()Landroid/util/Size;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v2, v4, v3}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] now ATTACHED"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/u;->Y(Z)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->I()V

    :cond_3
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->B()V

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->z0()V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->y0()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->n0(Z)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->h0()V

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->i0()V

    :goto_1
    if-eqz v2, :cond_5

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1, v2}, Landroidx/camera/camera2/internal/u;->Z(Landroid/util/Rational;)V

    :cond_5
    return-void
.end method

.method public static synthetic v(Landroidx/camera/camera2/internal/j0;Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/j0;->U(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V

    return-void
.end method

.method private v0(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/camera2/internal/j0$i;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/camera2/internal/j0$i;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/camera/core/impl/j2;->l(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/camera/core/impl/j2;->p(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j0$i;->g()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Landroidx/camera/core/s;

    if-ne v3, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] now DETACHED for camera"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    if-eqz v2, :cond_3

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/u;->Z(Landroid/util/Rational;)V

    :cond_3
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->B()V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {p1}, Landroidx/camera/core/impl/j2;->h()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/u;->b0(Z)V

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->z0()V

    :goto_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {p1}, Landroidx/camera/core/impl/j2;->g()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->v()V

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/j0;->n0(Z)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/u;->Y(Z)V

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->d0()Landroidx/camera/camera2/internal/y1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->E()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->y0()V

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/j0;->n0(Z)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/j0;->h0()V

    :cond_6
    :goto_2
    return-void
.end method

.method public static synthetic w(Landroidx/camera/core/impl/y1$c;Landroidx/camera/core/impl/y1;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/j0;->a0(Landroidx/camera/core/impl/y1$c;Landroidx/camera/core/impl/y1;)V

    return-void
.end method

.method public static synthetic x(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/j0;->T(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method public static synthetic y(Landroidx/camera/camera2/internal/j0;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->R()V

    return-void
.end method

.method public static synthetic z(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/j0;->Y(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    return-void
.end method

.method private z0()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {v3, v1}, Landroidx/camera/core/impl/k2;->K(Z)Z

    move-result v3

    or-int/2addr v2, v3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0, v2}, Landroidx/camera/camera2/internal/u;->b0(Z)V

    return-void
.end method


# virtual methods
.method D(Z)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->RELEASING:Landroidx/camera/camera2/internal/j0$g;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->REOPENING:Landroidx/camera/camera2/internal/j0$g;

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/camera/camera2/internal/j0;->w:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/camera2/internal/j0;->w:I

    invoke-static {v2}, Landroidx/camera/camera2/internal/j0;->L(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_2

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Landroidx/camera/camera2/internal/j0;->w:I

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->F(Z)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->n0(Z)V

    :goto_2
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/y1;->b()V

    return-void
.end method

.method H(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/j0;->I(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method J(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/y1;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method K()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->RELEASING:Landroidx/camera/camera2/internal/j0$g;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->A:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    if-ne v1, v2, :cond_2

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    goto :goto_2

    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->b:Landroidx/camera/camera2/internal/compat/r0;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->B:Landroidx/camera/camera2/internal/j0$d;

    invoke-virtual {v1, v2}, Landroidx/camera/camera2/internal/compat/r0;->h(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->RELEASED:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->z:Landroidx/concurrent/futures/c$a;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->z:Landroidx/concurrent/futures/c$a;

    :cond_3
    :goto_2
    return-void
.end method

.method P()Z
    .locals 3

    :try_start_0
    new-instance v0, Landroidx/camera/camera2/internal/x;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/x;-><init>(Landroidx/camera/camera2/internal/j0;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to check if MeteringRepeating is attached."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method Q()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->A:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->F:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Landroidx/camera/core/w;)V
    .locals 4

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Landroidx/camera/camera2/internal/j0;->N(Landroidx/camera/core/w;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object p1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/camera/camera2/internal/d0;

    invoke-direct {v3, p0, v0, v1, p1}, Landroidx/camera/camera2/internal/d0;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()Landroidx/camera/core/impl/y;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    return-object v0
.end method

.method public e()Landroidx/camera/core/impl/u;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->K:Landroidx/camera/core/impl/u;

    return-object v0
.end method

.method public f(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/c0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/c0;-><init>(Landroidx/camera/camera2/internal/j0;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->I()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->e0(Ljava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/j0;->t0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/h0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/h0;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Unable to attach use cases."

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/j0;->I(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->v()V

    :goto_0
    return-void
.end method

.method public h(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/j0;->t0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v1}, Landroidx/camera/camera2/internal/j0;->f0(Ljava/util/List;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/g0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/g0;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method h0()V
    .locals 5

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->f()Landroidx/camera/core/impl/y1$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->e()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v0, "Unable to create capture session due to conflicting configurations"

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->E:Landroidx/camera/core/impl/h0;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v2}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/j0;->D:Lx/a;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v4}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lx/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/camera/core/impl/h0;->i(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to create capture session in camera operating mode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->D:Lx/a;

    invoke-interface {v1}, Lx/a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v2}, Landroidx/camera/core/impl/j2;->g()Ljava/util/Collection;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v3}, Landroidx/camera/core/impl/j2;->h()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroidx/camera/camera2/internal/u2;->m(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {v2, v1}, Landroidx/camera/camera2/internal/y1;->h(Ljava/util/Map;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->b()Landroidx/camera/core/impl/y1;

    move-result-object v0

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->v:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v2}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Landroidx/camera/camera2/internal/j0;->I:Landroidx/camera/camera2/internal/j3$a;

    invoke-virtual {v3}, Landroidx/camera/camera2/internal/j3$a;->a()Landroidx/camera/camera2/internal/j3;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Landroidx/camera/camera2/internal/y1;->g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/j0$b;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/j0$b;-><init>(Landroidx/camera/camera2/internal/j0;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public i()Landroidx/camera/core/impl/b0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    return-object v0
.end method

.method j0(Landroidx/camera/core/impl/y1;)V
    .locals 4

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/y1$c;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    const-string v3, "Posting surface closed"

    invoke-direct {p0, v3, v2}, Landroidx/camera/camera2/internal/j0;->I(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Landroidx/camera/camera2/internal/e0;

    invoke-direct {v2, v1, p1}, Landroidx/camera/camera2/internal/e0;-><init>(Landroidx/camera/core/impl/y1$c;Landroidx/camera/core/impl/y1;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public k(Landroidx/camera/core/w;)V
    .locals 2

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v1

    invoke-static {p1}, Landroidx/camera/camera2/internal/j0;->N(Landroidx/camera/core/w;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0, v1}, Landroidx/camera/camera2/internal/j0;->o0(Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    return-void
.end method

.method k0(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/j0;->l0(Landroidx/camera/camera2/internal/y1;Z)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-virtual {p2}, Landroidx/camera/core/impl/r0;->d()V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/common/util/concurrent/f;

    aput-object p1, v1, v0

    const/4 p1, 0x1

    invoke-virtual {p2}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object p2

    aput-object p2, v1, p1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, La0/f;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public l(Landroidx/camera/core/impl/u;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Landroidx/camera/core/impl/x;->a()Landroidx/camera/core/impl/u;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/u;->V(Landroidx/camera/core/impl/z1;)Landroidx/camera/core/impl/z1;

    move-result-object v0

    iput-object p1, p0, Landroidx/camera/camera2/internal/j0;->K:Landroidx/camera/core/impl/u;

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->L:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iput-object v0, p0, Landroidx/camera/camera2/internal/j0;->M:Landroidx/camera/core/impl/z1;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method l0(Landroidx/camera/camera2/internal/y1;Z)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/y1;",
            "Z)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/camera/camera2/internal/y1;->close()V

    invoke-interface {p1, p2}, Landroidx/camera/camera2/internal/y1;->c(Z)Lcom/google/common/util/concurrent/f;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing session in state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->A:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroidx/camera/camera2/internal/j0$a;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/j0$a;-><init>(Landroidx/camera/camera2/internal/j0;Landroidx/camera/camera2/internal/y1;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p2, v0, p1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-object p2
.end method

.method public n(Landroidx/camera/core/w;)V
    .locals 2

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Landroidx/camera/camera2/internal/j0;->N(Landroidx/camera/core/w;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/b0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/b0;-><init>(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method n0(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    const-string v0, "Resetting Capture Session"

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/y1;->e()Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/camera2/internal/y1;->d()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0}, Landroidx/camera/camera2/internal/j0;->d0()Landroidx/camera/camera2/internal/y1;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {v3, v1}, Landroidx/camera/camera2/internal/y1;->f(Landroidx/camera/core/impl/y1;)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {v1, v2}, Landroidx/camera/camera2/internal/y1;->a(Ljava/util/List;)V

    invoke-virtual {p0, v0, p1}, Landroidx/camera/camera2/internal/j0;->l0(Landroidx/camera/camera2/internal/y1;Z)Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method p0(Landroidx/camera/camera2/internal/j0$g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/j0;->q0(Landroidx/camera/camera2/internal/j0$g;Lw/q$a;)V

    return-void
.end method

.method q0(Landroidx/camera/camera2/internal/j0$g;Lw/q$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/camera/camera2/internal/j0;->r0(Landroidx/camera/camera2/internal/j0$g;Lw/q$a;Z)V

    return-void
.end method

.method r0(Landroidx/camera/camera2/internal/j0$g;Lw/q$a;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning camera internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v0, Landroidx/camera/camera2/internal/j0$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    sget-object p1, Landroidx/camera/core/impl/c0$a;->RELEASED:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_1
    sget-object p1, Landroidx/camera/core/impl/c0$a;->RELEASING:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, Landroidx/camera/core/impl/c0$a;->OPENING:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_3
    sget-object p1, Landroidx/camera/core/impl/c0$a;->CONFIGURED:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_4
    sget-object p1, Landroidx/camera/core/impl/c0$a;->OPEN:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_5
    sget-object p1, Landroidx/camera/core/impl/c0$a;->CLOSING:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_6
    sget-object p1, Landroidx/camera/core/impl/c0$a;->PENDING_OPEN:Landroidx/camera/core/impl/c0$a;

    goto :goto_0

    :pswitch_7
    sget-object p1, Landroidx/camera/core/impl/c0$a;->CLOSED:Landroidx/camera/core/impl/c0$a;

    :goto_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->E:Landroidx/camera/core/impl/h0;

    invoke-virtual {v0, p0, p1, p3}, Landroidx/camera/core/impl/h0;->e(Lw/i;Landroidx/camera/core/impl/c0$a;Z)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/j0;->f:Landroidx/camera/core/impl/j1;

    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/j1;->a(Ljava/lang/Object;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/j0;->r:Landroidx/camera/camera2/internal/p1;

    invoke-virtual {p3, p1, p2}, Landroidx/camera/camera2/internal/p1;->c(Landroidx/camera/core/impl/c0$a;Lw/q$a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method s0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/l0;

    invoke-static {v1}, Landroidx/camera/core/impl/l0$a;->k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->h()I

    move-result v3

    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->c()Landroidx/camera/core/impl/s;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->c()Landroidx/camera/core/impl/s;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/l0$a;->o(Landroidx/camera/core/impl/s;)V

    :cond_0
    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v2}, Landroidx/camera/camera2/internal/j0;->C(Landroidx/camera/core/impl/l0$a;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string p1, "Issue capture request"

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {p1, v0}, Landroidx/camera/camera2/internal/y1;->a(Ljava/util/List;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/n0;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "Camera@%x[id=%s]"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method w0(Z)V
    .locals 1

    const-string v0, "Attempting to force open the camera."

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->E:Landroidx/camera/core/impl/h0;

    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/h0;->h(Lw/i;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    sget-object p1, Landroidx/camera/camera2/internal/j0$g;->PENDING_OPEN:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->g0(Z)V

    return-void
.end method

.method x0(Z)V
    .locals 1

    const-string v0, "Attempting to open the camera."

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->B:Landroidx/camera/camera2/internal/j0$d;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/j0$d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->E:Landroidx/camera/core/impl/h0;

    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/h0;->h(Lw/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    sget-object p1, Landroidx/camera/camera2/internal/j0$g;->PENDING_OPEN:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/j0;->g0(Z)V

    return-void
.end method

.method y0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->a:Landroidx/camera/core/impl/j2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/j2;->d()Landroidx/camera/core/impl/y1$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->b()Landroidx/camera/core/impl/y1;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->l()I

    move-result v1

    invoke-virtual {v2, v1}, Landroidx/camera/camera2/internal/u;->a0(I)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/u;->z()Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$g;->a(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$g;->b()Landroidx/camera/core/impl/y1;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    invoke-interface {v1, v0}, Landroidx/camera/camera2/internal/y1;->f(Landroidx/camera/core/impl/y1;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/u;->X()V

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0;->x:Landroidx/camera/camera2/internal/y1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/j0;->s:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/u;->z()Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/camera/camera2/internal/y1;->f(Landroidx/camera/core/impl/y1;)V

    :goto_0
    return-void
.end method
