.class Lcom/google/firebase/storage/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/storage/f;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lzb/g;

.field private final c:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Loc/b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Ljc/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lzb/g;Lee/b;Lee/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/d;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lee/b<",
            "Loc/b;",
            ">;",
            "Lee/b<",
            "Ljc/b;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/g;->a:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/firebase/storage/g;->b:Lzb/g;

    iput-object p2, p0, Lcom/google/firebase/storage/g;->c:Lee/b;

    iput-object p3, p0, Lcom/google/firebase/storage/g;->d:Lee/b;

    invoke-static {p4, p5}, Lcom/google/firebase/storage/g0;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method declared-synchronized a(Ljava/lang/String;)Lcom/google/firebase/storage/f;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/storage/g;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/storage/f;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/storage/f;

    iget-object v1, p0, Lcom/google/firebase/storage/g;->b:Lzb/g;

    iget-object v2, p0, Lcom/google/firebase/storage/g;->c:Lee/b;

    iget-object v3, p0, Lcom/google/firebase/storage/g;->d:Lee/b;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/firebase/storage/f;-><init>(Ljava/lang/String;Lzb/g;Lee/b;Lee/b;)V

    iget-object v1, p0, Lcom/google/firebase/storage/g;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
