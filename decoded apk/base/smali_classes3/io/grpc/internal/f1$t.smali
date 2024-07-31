.class final Lio/grpc/internal/f1$t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "t"
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/grpc/internal/q;",
            ">;"
        }
    .end annotation
.end field

.field c:Lvi/g1;

.field final synthetic d:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$t;->d:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/f1$t;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/f1$t;->b:Ljava/util/Collection;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$t;-><init>(Lio/grpc/internal/f1;)V

    return-void
.end method


# virtual methods
.method a(Lio/grpc/internal/y1;)Lvi/g1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/grpc/internal/y1<",
            "*>;)",
            "Lvi/g1;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$t;->c:Lvi/g1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/f1$t;->b:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method b(Lvi/g1;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$t;->c:Lvi/g1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iput-object p1, p0, Lio/grpc/internal/f1$t;->c:Lvi/g1;

    iget-object v1, p0, Lio/grpc/internal/f1$t;->b:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$t;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->o(Lio/grpc/internal/f1;)Lio/grpc/internal/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/grpc/internal/a0;->d(Lvi/g1;)V

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

.method c(Lio/grpc/internal/y1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/grpc/internal/y1<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$t;->b:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/grpc/internal/f1$t;->b:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/f1$t;->c:Lvi/g1;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lio/grpc/internal/f1$t;->b:Ljava/util/Collection;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$t;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->o(Lio/grpc/internal/f1;)Lio/grpc/internal/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/grpc/internal/a0;->d(Lvi/g1;)V

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
