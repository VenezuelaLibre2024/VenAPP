.class public final Landroidx/camera/lifecycle/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final h:Landroidx/camera/lifecycle/e;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lw/w$b;

.field private c:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Lw/v;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

.field private f:Lw/v;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/lifecycle/e;

    invoke-direct {v0}, Landroidx/camera/lifecycle/e;-><init>()V

    sput-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->b:Lw/w$b;

    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->d:Lcom/google/common/util/concurrent/f;

    new-instance v0, Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-direct {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;-><init>()V

    iput-object v0, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    return-void
.end method

.method public static synthetic a(Lw/v;Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/e;->k(Lw/v;Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/lifecycle/e;Lw/v;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/lifecycle/e;->l(Lw/v;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Lw/v;)Landroidx/camera/lifecycle/e;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/e;->j(Landroid/content/Context;Lw/v;)Landroidx/camera/lifecycle/e;

    move-result-object p0

    return-object p0
.end method

.method private g()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lw/v;->e()Landroidx/camera/core/impl/a0;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/a0;->d()Lx/a;

    move-result-object v0

    invoke-interface {v0}, Lx/a;->b()I

    move-result v0

    return v0
.end method

.method public static h(Landroid/content/Context;)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Landroidx/camera/lifecycle/e;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/camera/lifecycle/e;->i(Landroid/content/Context;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Landroidx/camera/lifecycle/b;

    invoke-direct {v1, p0}, Landroidx/camera/lifecycle/b;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-static {v0, v1, p0}, La0/f;->o(Lcom/google/common/util/concurrent/f;Lm/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method private i(Landroid/content/Context;)Lcom/google/common/util/concurrent/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Lw/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->c:Lcom/google/common/util/concurrent/f;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Lw/v;

    iget-object v2, p0, Landroidx/camera/lifecycle/e;->b:Lw/w$b;

    invoke-direct {v1, p1, v2}, Lw/v;-><init>(Landroid/content/Context;Lw/w$b;)V

    new-instance p1, Landroidx/camera/lifecycle/c;

    invoke-direct {p1, p0, v1}, Landroidx/camera/lifecycle/c;-><init>(Landroidx/camera/lifecycle/e;Lw/v;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->c:Lcom/google/common/util/concurrent/f;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static synthetic j(Landroid/content/Context;Lw/v;)Landroidx/camera/lifecycle/e;
    .locals 1

    sget-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    invoke-direct {v0, p1}, Landroidx/camera/lifecycle/e;->n(Lw/v;)V

    invoke-static {p0}, Landroidx/camera/core/impl/utils/g;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/lifecycle/e;->o(Landroid/content/Context;)V

    return-object v0
.end method

.method private static synthetic k(Lw/v;Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-virtual {p0}, Lw/v;->i()Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(Lw/v;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->d:Lcom/google/common/util/concurrent/f;

    invoke-static {v1}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object v1

    new-instance v2, Landroidx/camera/lifecycle/d;

    invoke-direct {v2, p1}, Landroidx/camera/lifecycle/d;-><init>(Lw/v;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object v1

    new-instance v2, Landroidx/camera/lifecycle/e$a;

    invoke-direct {v2, p0, p2, p1}, Landroidx/camera/lifecycle/e$a;-><init>(Landroidx/camera/lifecycle/e;Landroidx/concurrent/futures/c$a;Lw/v;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v1, v2, p1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "ProcessCameraProvider-initializeCameraX"

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private m(I)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lw/v;->e()Landroidx/camera/core/impl/a0;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/a0;->d()Lx/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lx/a;->c(I)V

    return-void
.end method

.method private n(Lw/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    return-void
.end method

.method private o(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->g:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method varargs d(Landroidx/lifecycle/k;Lw/p;Lw/j1;Ljava/util/List;[Landroidx/camera/core/w;)Lw/i;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/k;",
            "Lw/p;",
            "Lw/j1;",
            "Ljava/util/List<",
            "Lw/k;",
            ">;[",
            "Landroidx/camera/core/w;",
            ")",
            "Lw/i;"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p5

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-static/range {p2 .. p2}, Lw/p$a;->c(Lw/p;)Lw/p$a;

    move-result-object v3

    array-length v4, v2

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    aget-object v8, v2, v6

    invoke-virtual {v8}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v8

    invoke-interface {v8, v7}, Landroidx/camera/core/impl/k2;->F(Lw/p;)Lw/p;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lw/p;->c()Ljava/util/LinkedHashSet;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw/n;

    invoke-virtual {v3, v8}, Lw/p$a;->a(Lw/n;)Lw/p$a;

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lw/p$a;->b()Lw/p;

    move-result-object v3

    iget-object v4, v0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    invoke-virtual {v4}, Lw/v;->f()Landroidx/camera/core/impl/e0;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/camera/core/impl/e0;->a()Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-virtual {v3, v4}, Lw/p;->a(Ljava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-static {v3}, Lb0/e;->x(Ljava/util/LinkedHashSet;)Lb0/e$b;

    move-result-object v4

    iget-object v6, v0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-virtual {v6, p1, v4}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->c(Landroidx/lifecycle/k;Lb0/e$b;)Landroidx/camera/lifecycle/LifecycleCamera;

    move-result-object v4

    iget-object v6, v0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-virtual {v6}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->e()Ljava/util/Collection;

    move-result-object v6

    array-length v8, v2

    move v9, v5

    :goto_2
    if-ge v9, v8, :cond_5

    aget-object v10, v2, v9

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/camera/lifecycle/LifecycleCamera;

    invoke-virtual {v12, v10}, Landroidx/camera/lifecycle/LifecycleCamera;->p(Landroidx/camera/core/w;)Z

    move-result v13

    if-eqz v13, :cond_2

    if-ne v12, v4, :cond_3

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v10, v2, v5

    const-string v3, "Use case %s already bound to a different lifecycle."

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_5
    if-nez v4, :cond_6

    iget-object v4, v0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    new-instance v5, Lb0/e;

    iget-object v6, v0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    invoke-virtual {v6}, Lw/v;->e()Landroidx/camera/core/impl/a0;

    move-result-object v6

    invoke-interface {v6}, Landroidx/camera/core/impl/a0;->d()Lx/a;

    move-result-object v6

    iget-object v8, v0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    invoke-virtual {v8}, Lw/v;->d()Landroidx/camera/core/impl/z;

    move-result-object v8

    iget-object v9, v0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    invoke-virtual {v9}, Lw/v;->h()Landroidx/camera/core/impl/l2;

    move-result-object v9

    invoke-direct {v5, v3, v6, v8, v9}, Lb0/e;-><init>(Ljava/util/LinkedHashSet;Lx/a;Landroidx/camera/core/impl/z;Landroidx/camera/core/impl/l2;)V

    invoke-virtual {v4, p1, v5}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->b(Landroidx/lifecycle/k;Lb0/e;)Landroidx/camera/lifecycle/LifecycleCamera;

    move-result-object v4

    :cond_6
    invoke-virtual/range {p2 .. p2}, Lw/p;->c()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/n;

    invoke-interface {v3}, Lw/n;->a()Landroidx/camera/core/impl/b1;

    move-result-object v5

    sget-object v6, Lw/n;->a:Landroidx/camera/core/impl/b1;

    if-eq v5, v6, :cond_7

    invoke-interface {v3}, Lw/n;->a()Landroidx/camera/core/impl/b1;

    move-result-object v3

    invoke-static {v3}, Landroidx/camera/core/impl/y0;->a(Ljava/lang/Object;)Landroidx/camera/core/impl/w;

    move-result-object v3

    invoke-virtual {v4}, Landroidx/camera/lifecycle/LifecycleCamera;->b()Lw/o;

    move-result-object v5

    iget-object v6, v0, Landroidx/camera/lifecycle/e;->g:Landroid/content/Context;

    invoke-interface {v3, v5, v6}, Landroidx/camera/core/impl/w;->c(Lw/o;Landroid/content/Context;)Landroidx/camera/core/impl/u;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    if-nez v7, :cond_9

    move-object v7, v3

    goto :goto_4

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot apply multiple extended camera configs at the same time."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-virtual {v4, v7}, Landroidx/camera/lifecycle/LifecycleCamera;->l(Landroidx/camera/core/impl/u;)V

    array-length v1, v2

    if-nez v1, :cond_b

    return-object v4

    :cond_b
    iget-object v8, v0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-static/range {p5 .. p5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    iget-object v1, v0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    invoke-virtual {v1}, Lw/v;->e()Landroidx/camera/core/impl/a0;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/a0;->d()Lx/a;

    move-result-object v13

    move-object v9, v4

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    invoke-virtual/range {v8 .. v13}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->a(Landroidx/camera/lifecycle/LifecycleCamera;Lw/j1;Ljava/util/List;Ljava/util/Collection;Lx/a;)V

    return-object v4

    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Provided camera selector unable to resolve a camera for the given use case"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public varargs e(Landroidx/lifecycle/k;Lw/p;[Landroidx/camera/core/w;)Lw/i;
    .locals 7

    invoke-direct {p0}, Landroidx/camera/lifecycle/e;->g()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/camera/lifecycle/e;->m(I)V

    const/4 v4, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Landroidx/camera/lifecycle/e;->d(Landroidx/lifecycle/k;Lw/p;Lw/j1;Ljava/util/List;[Landroidx/camera/core/w;)Lw/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/o;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/camera/lifecycle/e;->f:Lw/v;

    invoke-virtual {v1}, Lw/v;->f()Landroidx/camera/core/impl/e0;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/e0;->a()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/c0;

    invoke-interface {v2}, Landroidx/camera/core/impl/c0;->b()Lw/o;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public p()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/camera/lifecycle/e;->m(I)V

    iget-object v0, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-virtual {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->k()V

    return-void
.end method
