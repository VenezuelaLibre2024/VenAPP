.class public Llc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/play/core/integrity/IntegrityManager;

.field private final c:Lhc/o;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lhc/p;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/google/android/play/core/integrity/IntegrityManager;Lhc/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lhc/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc/i;->a:Ljava/lang/String;

    iput-object p2, p0, Llc/i;->b:Lcom/google/android/play/core/integrity/IntegrityManager;

    iput-object p3, p0, Llc/i;->c:Lhc/o;

    iput-object p4, p0, Llc/i;->d:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Llc/i;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Llc/i;->f:Lhc/p;

    return-void
.end method

.method public constructor <init>(Lzb/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 8
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param

    invoke-virtual {p1}, Lzb/g;->r()Lzb/p;

    move-result-object v0

    invoke-virtual {v0}, Lzb/p;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;

    move-result-object v3

    new-instance v4, Lhc/o;

    invoke-direct {v4, p1}, Lhc/o;-><init>(Lzb/g;)V

    new-instance v7, Lhc/p;

    invoke-direct {v7}, Lhc/p;-><init>()V

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Llc/i;-><init>(Ljava/lang/String;Lcom/google/android/play/core/integrity/IntegrityManager;Lhc/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lhc/p;)V

    return-void
.end method

.method public static synthetic b(Llc/i;Lcom/google/android/play/core/integrity/IntegrityTokenResponse;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, Llc/i;->k(Lcom/google/android/play/core/integrity/IntegrityTokenResponse;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llc/i;Llc/b;)Llc/c;
    .locals 0

    invoke-direct {p0, p1}, Llc/i;->h(Llc/b;)Llc/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llc/i;Llc/a;)Lhc/a;
    .locals 0

    invoke-direct {p0, p1}, Llc/i;->j(Llc/a;)Lhc/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llc/i;Llc/c;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, Llc/i;->i(Llc/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lhc/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Llc/i;->l(Lhc/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private g()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/play/core/integrity/IntegrityTokenResponse;",
            ">;"
        }
    .end annotation

    new-instance v0, Llc/b;

    invoke-direct {v0}, Llc/b;-><init>()V

    iget-object v1, p0, Llc/i;->e:Ljava/util/concurrent/Executor;

    new-instance v2, Llc/f;

    invoke-direct {v2, p0, v0}, Llc/f;-><init>(Llc/i;Llc/b;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Llc/i;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Llc/g;

    invoke-direct {v2, p0}, Llc/g;-><init>(Llc/i;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method private synthetic h(Llc/b;)Llc/c;
    .locals 2

    iget-object v0, p0, Llc/i;->c:Lhc/o;

    invoke-virtual {p1}, Llc/b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v1, p0, Llc/i;->f:Lhc/p;

    invoke-virtual {v0, p1, v1}, Lhc/o;->c([BLhc/p;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Llc/c;->a(Ljava/lang/String;)Llc/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Llc/c;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    iget-object v0, p0, Llc/i;->b:Lcom/google/android/play/core/integrity/IntegrityManager;

    invoke-static {}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest;->builder()Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;

    move-result-object v1

    iget-object v2, p0, Llc/i;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;->setCloudProjectNumber(J)Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;

    move-result-object v1

    invoke-virtual {p1}, Llc/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;->setNonce(Ljava/lang/String;)Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenRequest$Builder;->build()Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/play/core/integrity/IntegrityManager;->requestIntegrityToken(Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic j(Llc/a;)Lhc/a;
    .locals 3

    iget-object v0, p0, Llc/i;->c:Lhc/o;

    invoke-virtual {p1}, Llc/a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x3

    iget-object v2, p0, Llc/i;->f:Lhc/p;

    invoke-virtual {v0, p1, v1, v2}, Lhc/o;->b([BILhc/p;)Lhc/a;

    move-result-object p1

    return-object p1
.end method

.method private synthetic k(Lcom/google/android/play/core/integrity/IntegrityTokenResponse;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    new-instance v0, Llc/a;

    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;->token()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Llc/a;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Llc/i;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Llc/h;

    invoke-direct {v1, p0, v0}, Llc/h;-><init>(Llc/i;Llc/a;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic l(Lhc/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lhc/b;->c(Lhc/a;)Lhc/b;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Llc/i;->g()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Llc/i;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Llc/d;

    invoke-direct {v2, p0}, Llc/d;-><init>(Llc/i;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Llc/i;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Llc/e;

    invoke-direct {v2}, Llc/e;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
