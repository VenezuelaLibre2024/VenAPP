.class Lj3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/h$b;
.implements Ld4/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/l$c;,
        Lj3/l$d;,
        Lj3/l$e;,
        Lj3/l$b;,
        Lj3/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj3/h$b<",
        "TR;>;",
        "Ld4/a$f;"
    }
.end annotation


# static fields
.field private static final K:Lj3/l$c;


# instance fields
.field private A:Z

.field private B:Lj3/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/v<",
            "*>;"
        }
    .end annotation
.end field

.field C:Lh3/a;

.field private D:Z

.field E:Lj3/q;

.field private F:Z

.field G:Lj3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/p<",
            "*>;"
        }
    .end annotation
.end field

.field private H:Lj3/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/h<",
            "TR;>;"
        }
    .end annotation
.end field

.field private volatile I:Z

.field private J:Z

.field final a:Lj3/l$e;

.field private final b:Ld4/c;

.field private final c:Lj3/p$a;

.field private final d:Landroidx/core/util/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/e<",
            "Lj3/l<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e:Lj3/l$c;

.field private final f:Lj3/m;

.field private final r:Lm3/a;

.field private final s:Lm3/a;

.field private final t:Lm3/a;

.field private final u:Lm3/a;

.field private final v:Ljava/util/concurrent/atomic/AtomicInteger;

.field private w:Lh3/f;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/l$c;

    invoke-direct {v0}, Lj3/l$c;-><init>()V

    sput-object v0, Lj3/l;->K:Lj3/l$c;

    return-void
.end method

.method constructor <init>(Lm3/a;Lm3/a;Lm3/a;Lm3/a;Lj3/m;Lj3/p$a;Landroidx/core/util/e;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/a;",
            "Lm3/a;",
            "Lm3/a;",
            "Lm3/a;",
            "Lj3/m;",
            "Lj3/p$a;",
            "Landroidx/core/util/e<",
            "Lj3/l<",
            "*>;>;)V"
        }
    .end annotation

    sget-object v8, Lj3/l;->K:Lj3/l$c;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lj3/l;-><init>(Lm3/a;Lm3/a;Lm3/a;Lm3/a;Lj3/m;Lj3/p$a;Landroidx/core/util/e;Lj3/l$c;)V

    return-void
.end method

.method constructor <init>(Lm3/a;Lm3/a;Lm3/a;Lm3/a;Lj3/m;Lj3/p$a;Landroidx/core/util/e;Lj3/l$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/a;",
            "Lm3/a;",
            "Lm3/a;",
            "Lm3/a;",
            "Lj3/m;",
            "Lj3/p$a;",
            "Landroidx/core/util/e<",
            "Lj3/l<",
            "*>;>;",
            "Lj3/l$c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj3/l$e;

    invoke-direct {v0}, Lj3/l$e;-><init>()V

    iput-object v0, p0, Lj3/l;->a:Lj3/l$e;

    invoke-static {}, Ld4/c;->a()Ld4/c;

    move-result-object v0

    iput-object v0, p0, Lj3/l;->b:Ld4/c;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lj3/l;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lj3/l;->r:Lm3/a;

    iput-object p2, p0, Lj3/l;->s:Lm3/a;

    iput-object p3, p0, Lj3/l;->t:Lm3/a;

    iput-object p4, p0, Lj3/l;->u:Lm3/a;

    iput-object p5, p0, Lj3/l;->f:Lj3/m;

    iput-object p6, p0, Lj3/l;->c:Lj3/p$a;

    iput-object p7, p0, Lj3/l;->d:Landroidx/core/util/e;

    iput-object p8, p0, Lj3/l;->e:Lj3/l$c;

    return-void
.end method

.method private j()Lm3/a;
    .locals 1

    iget-boolean v0, p0, Lj3/l;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj3/l;->t:Lm3/a;

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lj3/l;->z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj3/l;->u:Lm3/a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lj3/l;->s:Lm3/a;

    :goto_0
    return-object v0
.end method

.method private m()Z
    .locals 1

    iget-boolean v0, p0, Lj3/l;->F:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj3/l;->D:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj3/l;->I:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private declared-synchronized q()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/l;->w:Lh3/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v0}, Lj3/l$e;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj3/l;->w:Lh3/f;

    iput-object v0, p0, Lj3/l;->G:Lj3/p;

    iput-object v0, p0, Lj3/l;->B:Lj3/v;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lj3/l;->F:Z

    iput-boolean v1, p0, Lj3/l;->I:Z

    iput-boolean v1, p0, Lj3/l;->D:Z

    iput-boolean v1, p0, Lj3/l;->J:Z

    iget-object v2, p0, Lj3/l;->H:Lj3/h;

    invoke-virtual {v2, v1}, Lj3/h;->E(Z)V

    iput-object v0, p0, Lj3/l;->H:Lj3/h;

    iput-object v0, p0, Lj3/l;->E:Lj3/q;

    iput-object v0, p0, Lj3/l;->C:Lh3/a;

    iget-object v0, p0, Lj3/l;->d:Landroidx/core/util/e;

    invoke-interface {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method declared-synchronized a(Ly3/j;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/l;->b:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    iget-object v0, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v0, p1, p2}, Lj3/l$e;->c(Ly3/j;Ljava/util/concurrent/Executor;)V

    iget-boolean v0, p0, Lj3/l;->D:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lj3/l;->k(I)V

    new-instance v0, Lj3/l$b;

    invoke-direct {v0, p0, p1}, Lj3/l$b;-><init>(Lj3/l;Ly3/j;)V

    :goto_0
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_0
    iget-boolean v0, p0, Lj3/l;->F:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lj3/l;->k(I)V

    new-instance v0, Lj3/l$a;

    invoke-direct {v0, p0, p1}, Lj3/l$a;-><init>(Lj3/l;Ly3/j;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lj3/l;->I:Z

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const-string p1, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {v1, p1}, Lc4/k;->a(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Lj3/v;Lh3/a;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "TR;>;",
            "Lh3/a;",
            "Z)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lj3/l;->B:Lj3/v;

    iput-object p2, p0, Lj3/l;->C:Lh3/a;

    iput-boolean p3, p0, Lj3/l;->J:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lj3/l;->o()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Lj3/q;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lj3/l;->E:Lj3/q;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lj3/l;->n()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d(Lj3/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/h<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lj3/l;->j()Lm3/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm3/a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method e(Ly3/j;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lj3/l;->E:Lj3/q;

    invoke-interface {p1, v0}, Ly3/j;->c(Lj3/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lj3/b;

    invoke-direct {v0, p1}, Lj3/b;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method f(Ly3/j;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lj3/l;->G:Lj3/p;

    iget-object v1, p0, Lj3/l;->C:Lh3/a;

    iget-boolean v2, p0, Lj3/l;->J:Z

    invoke-interface {p1, v0, v1, v2}, Ly3/j;->b(Lj3/v;Lh3/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lj3/b;

    invoke-direct {v0, p1}, Lj3/b;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method g()V
    .locals 2

    invoke-direct {p0}, Lj3/l;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/l;->I:Z

    iget-object v0, p0, Lj3/l;->H:Lj3/h;

    invoke-virtual {v0}, Lj3/h;->m()V

    iget-object v0, p0, Lj3/l;->f:Lj3/m;

    iget-object v1, p0, Lj3/l;->w:Lh3/f;

    invoke-interface {v0, p0, v1}, Lj3/m;->b(Lj3/l;Lh3/f;)V

    return-void
.end method

.method public h()Ld4/c;
    .locals 1

    iget-object v0, p0, Lj3/l;->b:Ld4/c;

    return-object v0
.end method

.method i()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/l;->b:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    invoke-direct {p0}, Lj3/l;->m()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Lc4/k;->a(ZLjava/lang/String;)V

    iget-object v0, p0, Lj3/l;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    invoke-static {v1, v2}, Lc4/k;->a(ZLjava/lang/String;)V

    if-nez v0, :cond_1

    iget-object v0, p0, Lj3/l;->G:Lj3/p;

    invoke-direct {p0}, Lj3/l;->q()V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lj3/p;->d()V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method declared-synchronized k(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lj3/l;->m()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Lc4/k;->a(ZLjava/lang/String;)V

    iget-object v0, p0, Lj3/l;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lj3/l;->G:Lj3/p;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj3/p;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized l(Lh3/f;ZZZZ)Lj3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/f;",
            "ZZZZ)",
            "Lj3/l<",
            "TR;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lj3/l;->w:Lh3/f;

    iput-boolean p2, p0, Lj3/l;->x:Z

    iput-boolean p3, p0, Lj3/l;->y:Z

    iput-boolean p4, p0, Lj3/l;->z:Z

    iput-boolean p5, p0, Lj3/l;->A:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method n()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/l;->b:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    iget-boolean v0, p0, Lj3/l;->I:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lj3/l;->q()V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v0}, Lj3/l$e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lj3/l;->F:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/l;->F:Z

    iget-object v1, p0, Lj3/l;->w:Lh3/f;

    iget-object v2, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v2}, Lj3/l$e;->f()Lj3/l$e;

    move-result-object v2

    invoke-virtual {v2}, Lj3/l$e;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0, v3}, Lj3/l;->k(I)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lj3/l;->f:Lj3/m;

    const/4 v3, 0x0

    invoke-interface {v0, p0, v1, v3}, Lj3/m;->c(Lj3/l;Lh3/f;Lj3/p;)V

    invoke-virtual {v2}, Lj3/l$e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj3/l$d;

    iget-object v2, v1, Lj3/l$d;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lj3/l$a;

    iget-object v1, v1, Lj3/l$d;->a:Ly3/j;

    invoke-direct {v3, p0, v1}, Lj3/l$a;-><init>(Lj3/l;Ly3/j;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lj3/l;->i()V

    return-void

    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already failed once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method o()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/l;->b:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    iget-boolean v0, p0, Lj3/l;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj3/l;->B:Lj3/v;

    invoke-interface {v0}, Lj3/v;->q()V

    invoke-direct {p0}, Lj3/l;->q()V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v0}, Lj3/l$e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lj3/l;->D:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lj3/l;->e:Lj3/l$c;

    iget-object v1, p0, Lj3/l;->B:Lj3/v;

    iget-boolean v2, p0, Lj3/l;->x:Z

    iget-object v3, p0, Lj3/l;->w:Lh3/f;

    iget-object v4, p0, Lj3/l;->c:Lj3/p$a;

    invoke-virtual {v0, v1, v2, v3, v4}, Lj3/l$c;->a(Lj3/v;ZLh3/f;Lj3/p$a;)Lj3/p;

    move-result-object v0

    iput-object v0, p0, Lj3/l;->G:Lj3/p;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/l;->D:Z

    iget-object v1, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v1}, Lj3/l$e;->f()Lj3/l$e;

    move-result-object v1

    invoke-virtual {v1}, Lj3/l$e;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lj3/l;->k(I)V

    iget-object v0, p0, Lj3/l;->w:Lh3/f;

    iget-object v2, p0, Lj3/l;->G:Lj3/p;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Lj3/l;->f:Lj3/m;

    invoke-interface {v3, p0, v0, v2}, Lj3/m;->c(Lj3/l;Lh3/f;Lj3/p;)V

    invoke-virtual {v1}, Lj3/l$e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj3/l$d;

    iget-object v2, v1, Lj3/l$d;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lj3/l$b;

    iget-object v1, v1, Lj3/l$d;->a:Ly3/j;

    invoke-direct {v3, p0, v1}, Lj3/l$b;-><init>(Lj3/l;Ly3/j;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lj3/l;->i()V

    return-void

    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already have resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method p()Z
    .locals 1

    iget-boolean v0, p0, Lj3/l;->A:Z

    return v0
.end method

.method declared-synchronized r(Ly3/j;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/l;->b:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    iget-object v0, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {v0, p1}, Lj3/l$e;->k(Ly3/j;)V

    iget-object p1, p0, Lj3/l;->a:Lj3/l$e;

    invoke-virtual {p1}, Lj3/l$e;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lj3/l;->g()V

    iget-boolean p1, p0, Lj3/l;->D:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lj3/l;->F:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    iget-object p1, p0, Lj3/l;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lj3/l;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized s(Lj3/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/h<",
            "TR;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lj3/l;->H:Lj3/h;

    invoke-virtual {p1}, Lj3/h;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj3/l;->r:Lm3/a;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj3/l;->j()Lm3/a;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p1}, Lm3/a;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
