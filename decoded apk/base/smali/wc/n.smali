.class public Lwc/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/n$a;
    }
.end annotation


# instance fields
.field private final a:Lwc/f;

.field private final b:Lvc/n;

.field private c:Ljava/lang/String;

.field private final d:Lwc/n$a;

.field private final e:Lwc/n$a;

.field private final f:Lwc/j;

.field private final g:Ljava/util/concurrent/atomic/AtomicMarkableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicMarkableReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lad/f;Lvc/n;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwc/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwc/n$a;-><init>(Lwc/n;Z)V

    iput-object v0, p0, Lwc/n;->d:Lwc/n$a;

    new-instance v0, Lwc/n$a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lwc/n$a;-><init>(Lwc/n;Z)V

    iput-object v0, p0, Lwc/n;->e:Lwc/n$a;

    new-instance v0, Lwc/j;

    const/16 v2, 0x80

    invoke-direct {v0, v2}, Lwc/j;-><init>(I)V

    iput-object v0, p0, Lwc/n;->f:Lwc/j;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    iput-object p1, p0, Lwc/n;->c:Ljava/lang/String;

    new-instance p1, Lwc/f;

    invoke-direct {p1, p2}, Lwc/f;-><init>(Lad/f;)V

    iput-object p1, p0, Lwc/n;->a:Lwc/f;

    iput-object p3, p0, Lwc/n;->b:Lvc/n;

    return-void
.end method

.method public static synthetic a(Lwc/n;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lwc/n;->j()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwc/n;Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lwc/n;->k(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lwc/n;)Lvc/n;
    .locals 0

    iget-object p0, p0, Lwc/n;->b:Lvc/n;

    return-object p0
.end method

.method static synthetic d(Lwc/n;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lwc/n;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lwc/n;)Lwc/f;
    .locals 0

    iget-object p0, p0, Lwc/n;->a:Lwc/f;

    return-object p0
.end method

.method private synthetic j()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lwc/n;->n()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic k(Ljava/util/List;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwc/n;->a:Lwc/f;

    iget-object v1, p0, Lwc/n;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lwc/f;->r(Ljava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public static l(Ljava/lang/String;Lad/f;Lvc/n;)Lwc/n;
    .locals 3

    new-instance v0, Lwc/f;

    invoke-direct {v0, p1}, Lwc/f;-><init>(Lad/f;)V

    new-instance v1, Lwc/n;

    invoke-direct {v1, p0, p1, p2}, Lwc/n;-><init>(Ljava/lang/String;Lad/f;Lvc/n;)V

    iget-object p1, v1, Lwc/n;->d:Lwc/n$a;

    iget-object p1, p1, Lwc/n$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwc/d;

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Lwc/f;->i(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lwc/d;->e(Ljava/util/Map;)V

    iget-object p1, v1, Lwc/n;->e:Lwc/n$a;

    iget-object p1, p1, Lwc/n$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwc/d;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v2}, Lwc/f;->i(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lwc/d;->e(Ljava/util/Map;)V

    iget-object p1, v1, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0, p0}, Lwc/f;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, p2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    iget-object p1, v1, Lwc/n;->f:Lwc/j;

    invoke-virtual {v0, p0}, Lwc/f;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lwc/j;->c(Ljava/util/List;)Z

    return-object v1
.end method

.method public static m(Ljava/lang/String;Lad/f;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lwc/f;

    invoke-direct {v0, p1}, Lwc/f;-><init>(Lad/f;)V

    invoke-virtual {v0, p0}, Lwc/f;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private n()V
    .locals 4

    iget-object v0, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lwc/n;->i()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    iget-object v0, p0, Lwc/n;->a:Lwc/f;

    iget-object v2, p0, Lwc/n;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lwc/f;->s(Ljava/lang/String;Ljava/lang/String;)V

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


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwc/n;->d:Lwc/n$a;

    invoke-virtual {v0}, Lwc/n$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwc/n;->e:Lwc/n$a;

    invoke-virtual {v0}, Lwc/n$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxc/f0$e$d$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwc/n;->f:Lwc/j;

    invoke-virtual {v0}, Lwc/j;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lwc/n;->d:Lwc/n$a;

    invoke-virtual {v0, p1, p2}, Lwc/n$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lwc/n;->e:Lwc/n$a;

    invoke-virtual {v0, p1, p2}, Lwc/n$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public q(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lwc/n;->c:Ljava/lang/String;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lwc/n;->c:Ljava/lang/String;

    iget-object v1, p0, Lwc/n;->d:Lwc/n$a;

    invoke-virtual {v1}, Lwc/n$a;->b()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lwc/n;->f:Lwc/j;

    invoke-virtual {v2}, Lwc/j;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lwc/n;->i()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lwc/n;->a:Lwc/f;

    invoke-virtual {p0}, Lwc/n;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lwc/f;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lwc/n;->a:Lwc/f;

    invoke-virtual {v3, p1, v1}, Lwc/f;->p(Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lwc/n;->a:Lwc/f;

    invoke-virtual {v1, p1, v2}, Lwc/f;->r(Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public r(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x400

    invoke-static {p1, v0}, Lwc/d;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lvc/i;->y(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lwc/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lwc/n;->b:Lvc/n;

    new-instance v0, Lwc/k;

    invoke-direct {v0, p0}, Lwc/k;-><init>(Lwc/n;)V

    invoke-virtual {p1, v0}, Lvc/n;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public s(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwc/i;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lwc/n;->f:Lwc/j;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwc/n;->f:Lwc/j;

    invoke-virtual {v1, p1}, Lwc/j;->c(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lwc/n;->f:Lwc/j;

    invoke-virtual {p1}, Lwc/j;->b()Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lwc/n;->b:Lvc/n;

    new-instance v2, Lwc/l;

    invoke-direct {v2, p0, p1}, Lwc/l;-><init>(Lwc/n;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lvc/n;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
