.class public Lnc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final a:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Lxa/f;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lhc/o;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Lhc/p;

.field private final f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lzb/g;Lhc/o;Lca/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lzb/g;->r()Lzb/p;

    move-result-object v0

    invoke-virtual {v0}, Lzb/p;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnc/g;->f:Ljava/lang/String;

    iput-object p4, p0, Lnc/g;->c:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lnc/g;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3, p5}, Lnc/g;->h(Landroid/content/Context;Lca/f;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lnc/g;->a:Lcom/google/android/gms/tasks/Task;

    iput-object p2, p0, Lnc/g;->b:Lhc/o;

    new-instance p1, Lhc/p;

    invoke-direct {p1}, Lhc/p;-><init>()V

    iput-object p1, p0, Lnc/g;->e:Lhc/p;

    return-void
.end method

.method public constructor <init>(Lzb/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 7
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/a;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param

    new-instance v2, Lhc/o;

    invoke-direct {v2, p1}, Lhc/o;-><init>(Lzb/g;)V

    invoke-static {}, Lca/f;->n()Lca/f;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lnc/g;-><init>(Lzb/g;Lhc/o;Lca/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic b(Lhc/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lnc/g;->j(Lhc/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnc/g;Lnc/a;)Lhc/a;
    .locals 0

    invoke-direct {p0, p1}, Lnc/g;->i(Lnc/a;)Lhc/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lca/f;Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnc/g;->l(Lca/f;Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic e(Lnc/g;Lxa/f;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, Lnc/g;->k(Lxa/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private static g(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0x12

    if-eq p0, v0, :cond_0

    const-string p0, "Unknown error."

    return-object p0

    :cond_0
    const-string p0, "Google Play services is currently being updated on this device."

    return-object p0

    :cond_1
    const-string p0, "The version of the Google Play services installed on this device is not authentic."

    return-object p0

    :cond_2
    const-string p0, "The installed version of Google Play services has been disabled on this device."

    return-object p0

    :cond_3
    const-string p0, "The installed version of Google Play services is out of date."

    return-object p0

    :cond_4
    const-string p0, "Google Play services is missing on this device."

    return-object p0
.end method

.method private static h(Landroid/content/Context;Lca/f;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lca/f;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lxa/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lnc/d;

    invoke-direct {v1, p1, p0, v0}, Lnc/d;-><init>(Lca/f;Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private synthetic i(Lnc/a;)Lhc/a;
    .locals 3

    iget-object v0, p0, Lnc/g;->b:Lhc/o;

    invoke-virtual {p1}, Lnc/a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x1

    iget-object v2, p0, Lnc/g;->e:Lhc/p;

    invoke-virtual {v0, p1, v1, v2}, Lhc/o;->b([BILhc/p;)Lhc/a;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic j(Lhc/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lhc/b;->c(Lhc/a;)Lhc/b;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private synthetic k(Lxa/f;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    iget-object v1, p0, Lnc/g;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lxa/f;->d([BLjava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic l(Lca/f;Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    invoke-virtual {p0, p1}, Lca/f;->g(Landroid/content/Context;)I

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p1}, Lxa/d;->a(Landroid/content/Context;)Lxa/f;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SafetyNet unavailable; unable to connect to Google Play Services: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnc/g;->g(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    :goto_0
    return-void
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

    iget-object v0, p0, Lnc/g;->a:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lnc/g;->c:Ljava/util/concurrent/Executor;

    new-instance v2, Lnc/b;

    invoke-direct {v2, p0}, Lnc/b;-><init>(Lnc/g;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lnc/g;->c:Ljava/util/concurrent/Executor;

    new-instance v2, Lnc/c;

    invoke-direct {v2, p0}, Lnc/c;-><init>(Lnc/g;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method f(Lxa/e$a;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/e$a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lxa/e$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lnc/a;

    invoke-direct {v0, p1}, Lnc/a;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lnc/g;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lnc/e;

    invoke-direct {v1, p0, v0}, Lnc/e;-><init>(Lnc/g;Lnc/a;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v0, p0, Lnc/g;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lnc/f;

    invoke-direct {v1}, Lnc/f;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
