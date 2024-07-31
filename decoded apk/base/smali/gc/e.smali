.class public Lgc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# static fields
.field private static final f:Ljava/lang/String; = "gc.e"


# instance fields
.field private final a:Lhc/o;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lhc/p;

.field private final e:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lzb/g;Lee/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/a;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lee/b<",
            "Lfc/c;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lhc/o;

    invoke-direct {v0, p1}, Lhc/o;-><init>(Lzb/g;)V

    iput-object v0, p0, Lgc/e;->a:Lhc/o;

    iput-object p3, p0, Lgc/e;->b:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lgc/e;->c:Ljava/util/concurrent/Executor;

    new-instance p3, Lhc/p;

    invoke-direct {p3}, Lhc/p;-><init>()V

    iput-object p3, p0, Lgc/e;->d:Lhc/p;

    invoke-interface {p2}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lfc/c;

    invoke-interface {p2}, Lfc/c;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {p1, p4}, Lgc/e;->f(Lzb/g;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lgc/e;->e:Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic b(Lgc/e;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, Lgc/e;->i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzb/g;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-static {p0, p1}, Lgc/e;->g(Lzb/g;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic d(Lhc/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lgc/e;->j(Lhc/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lgc/e;Lgc/f;)Lhc/a;
    .locals 0

    invoke-direct {p0, p1}, Lgc/e;->h(Lgc/f;)Lhc/a;

    move-result-object p0

    return-object p0
.end method

.method static f(Lzb/g;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lgc/a;

    invoke-direct {v1, p0, v0}, Lgc/a;-><init>(Lzb/g;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Lzb/g;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3

    new-instance v0, Lgc/g;

    invoke-virtual {p0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lzb/g;->s()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lgc/g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgc/g;->a()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lgc/g;->b(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lgc/e;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter this debug secret into the allow list in the Firebase Console for your project: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic h(Lgc/f;)Lhc/a;
    .locals 3

    iget-object v0, p0, Lgc/e;->a:Lhc/o;

    invoke-virtual {p1}, Lgc/f;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x2

    iget-object v2, p0, Lgc/e;->d:Lhc/p;

    invoke-virtual {v0, p1, v1, v2}, Lhc/o;->b([BILhc/p;)Lhc/a;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    new-instance v0, Lgc/f;

    invoke-direct {v0, p1}, Lgc/f;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lgc/e;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lgc/d;

    invoke-direct {v1, p0, v0}, Lgc/d;-><init>(Lgc/e;Lgc/f;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

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

    iget-object v0, p0, Lgc/e;->e:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lgc/e;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lgc/b;

    invoke-direct {v2, p0}, Lgc/b;-><init>(Lgc/e;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lgc/e;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lgc/c;

    invoke-direct {v2}, Lgc/c;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
