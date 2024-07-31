.class public Lcom/google/mlkit/common/sdkinternal/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static c:Lcom/google/mlkit/common/sdkinternal/i;


# instance fields
.field private a:Lpc/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/i;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/google/mlkit/common/sdkinternal/i;
    .locals 3

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/mlkit/common/sdkinternal/i;->c:Lcom/google/mlkit/common/sdkinternal/i;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "MlKitContext has not been initialized"

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/s;->o(ZLjava/lang/Object;)V

    sget-object v1, Lcom/google/mlkit/common/sdkinternal/i;->c:Lcom/google/mlkit/common/sdkinternal/i;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/common/sdkinternal/i;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static d(Landroid/content/Context;)Lcom/google/mlkit/common/sdkinternal/i;
    .locals 7

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/mlkit/common/sdkinternal/i;->c:Lcom/google/mlkit/common/sdkinternal/i;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "MlKitContext is already initialized"

    invoke-static {v1, v4}, Lcom/google/android/gms/common/internal/s;->o(ZLjava/lang/Object;)V

    new-instance v1, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-direct {v1}, Lcom/google/mlkit/common/sdkinternal/i;-><init>()V

    sput-object v1, Lcom/google/mlkit/common/sdkinternal/i;->c:Lcom/google/mlkit/common/sdkinternal/i;

    invoke-static {p0}, Lcom/google/mlkit/common/sdkinternal/i;->e(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    const-class v4, Lcom/google/mlkit/common/internal/MlKitComponentDiscoveryService;

    invoke-static {p0, v4}, Lpc/f;->c(Landroid/content/Context;Ljava/lang/Class;)Lpc/f;

    move-result-object v4

    invoke-virtual {v4}, Lpc/f;->b()Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    invoke-static {v5}, Lpc/n;->l(Ljava/util/concurrent/Executor;)Lpc/n$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Lpc/n$b;->d(Ljava/util/Collection;)Lpc/n$b;

    move-result-object v4

    const-class v5, Landroid/content/Context;

    new-array v6, v3, [Ljava/lang/Class;

    invoke-static {p0, v5, v6}, Lpc/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lpc/c;

    move-result-object p0

    invoke-virtual {v4, p0}, Lpc/n$b;->b(Lpc/c;)Lpc/n$b;

    move-result-object p0

    const-class v4, Lcom/google/mlkit/common/sdkinternal/i;

    new-array v3, v3, [Ljava/lang/Class;

    invoke-static {v1, v4, v3}, Lpc/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lpc/c;

    move-result-object v3

    invoke-virtual {p0, v3}, Lpc/n$b;->b(Lpc/c;)Lpc/n$b;

    move-result-object p0

    invoke-virtual {p0}, Lpc/n$b;->e()Lpc/n;

    move-result-object p0

    iput-object p0, v1, Lcom/google/mlkit/common/sdkinternal/i;->a:Lpc/n;

    invoke-virtual {p0, v2}, Lpc/n;->o(Z)V

    sget-object p0, Lcom/google/mlkit/common/sdkinternal/i;->c:Lcom/google/mlkit/common/sdkinternal/i;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static e(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/i;->c:Lcom/google/mlkit/common/sdkinternal/i;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "MlKitContext has been deleted"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/s;->o(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/i;->a:Lpc/n;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/i;->a:Lpc/n;

    invoke-interface {v0, p1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Landroid/content/Context;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/google/mlkit/common/sdkinternal/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method
