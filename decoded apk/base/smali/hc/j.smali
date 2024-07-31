.class public Lhc/j;
.super Lec/e;
.source "SourceFile"


# instance fields
.field private final a:Lzb/g;

.field private final b:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lod/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljc/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lec/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lhc/r;

.field private final f:Lhc/s;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Ljava/util/concurrent/Executor;

.field private final i:Ljava/util/concurrent/Executor;

.field private final j:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lic/a;

.field private l:Lec/b;

.field private m:Lec/a;

.field private n:Lec/c;

.field private o:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzb/g;Lee/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/d;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/a;
        .end annotation
    .end param
    .param p6    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Ldc/b;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lee/b<",
            "Lod/i;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lec/e;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lhc/j;->a:Lzb/g;

    iput-object p2, p0, Lhc/j;->b:Lee/b;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lhc/j;->c:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lhc/j;->d:Ljava/util/List;

    new-instance p2, Lhc/r;

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lzb/g;->s()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lhc/r;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lhc/j;->e:Lhc/r;

    new-instance p2, Lhc/s;

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1, p0, p4, p6}, Lhc/s;-><init>(Landroid/content/Context;Lhc/j;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p2, p0, Lhc/j;->f:Lhc/s;

    iput-object p3, p0, Lhc/j;->g:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lhc/j;->h:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lhc/j;->i:Ljava/util/concurrent/Executor;

    invoke-direct {p0, p5}, Lhc/j;->z(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lhc/j;->j:Lcom/google/android/gms/tasks/Task;

    new-instance p1, Lic/a$a;

    invoke-direct {p1}, Lic/a$a;-><init>()V

    iput-object p1, p0, Lhc/j;->k:Lic/a;

    return-void
.end method

.method private B(Lec/c;)V
    .locals 2

    iget-object v0, p0, Lhc/j;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lhc/i;

    invoke-direct {v1, p0, p1}, Lhc/i;-><init>(Lhc/j;Lec/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p1}, Lhc/j;->A(Lec/c;)V

    iget-object v0, p0, Lhc/j;->f:Lhc/s;

    invoke-virtual {v0, p1}, Lhc/s;->d(Lec/c;)V

    return-void
.end method

.method public static synthetic j(Lhc/j;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, Lhc/j;->u(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lhc/j;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, Lhc/j;->w(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lhc/j;Lec/c;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, Lhc/j;->t(Lec/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lhc/j;->v(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lhc/j;Lec/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lhc/j;->y(Lec/c;)V

    return-void
.end method

.method public static synthetic o(Lhc/j;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Lhc/j;->x(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method private r()Z
    .locals 4

    iget-object v0, p0, Lhc/j;->n:Lec/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lec/c;->a()J

    move-result-wide v0

    iget-object v2, p0, Lhc/j;->k:Lic/a;

    invoke-interface {v2}, Lic/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic t(Lec/c;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-direct {p0, p1}, Lhc/j;->B(Lec/c;)V

    iget-object v0, p0, Lhc/j;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec/e$a;

    invoke-interface {v1, p1}, Lec/e$a;->a(Lec/c;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lhc/c;->c(Lec/c;)Lhc/c;

    move-result-object v0

    iget-object v1, p0, Lhc/j;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljc/a;

    invoke-interface {v2, v0}, Ljc/a;->a(Lec/d;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic u(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    if-nez p1, :cond_0

    invoke-direct {p0}, Lhc/j;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhc/j;->n:Lec/c;

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lhc/j;->m:Lec/a;

    if-nez p1, :cond_1

    new-instance p1, Lzb/m;

    const-string p2, "No AppCheckProvider installed."

    invoke-direct {p1, p2}, Lzb/m;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lhc/j;->p()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    :cond_3
    iget-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    return-object p1
.end method

.method private static synthetic v(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lec/c;

    invoke-static {p0}, Lhc/c;->c(Lec/c;)Lhc/c;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lzb/m;

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lzb/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lhc/c;->d(Lzb/m;)Lhc/c;

    move-result-object p0

    goto :goto_0
.end method

.method private synthetic w(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lhc/j;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhc/j;->n:Lec/c;

    invoke-static {p1}, Lhc/c;->c(Lec/c;)Lhc/c;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lhc/j;->m:Lec/a;

    if-nez p1, :cond_1

    new-instance p1, Lzb/m;

    const-string p2, "No AppCheckProvider installed."

    invoke-direct {p1, p2}, Lzb/m;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lhc/c;->d(Lzb/m;)Lhc/c;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lhc/j;->p()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    :cond_3
    iget-object p1, p0, Lhc/j;->o:Lcom/google/android/gms/tasks/Task;

    iget-object p2, p0, Lhc/j;->h:Ljava/util/concurrent/Executor;

    new-instance v0, Lhc/g;

    invoke-direct {v0}, Lhc/g;-><init>()V

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic x(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lhc/j;->e:Lhc/r;

    invoke-virtual {v0}, Lhc/r;->d()Lec/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lhc/j;->A(Lec/c;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic y(Lec/c;)V
    .locals 1

    iget-object v0, p0, Lhc/j;->e:Lhc/r;

    invoke-virtual {v0, p1}, Lhc/r;->e(Lec/c;)V

    return-void
.end method

.method private z(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lhc/f;

    invoke-direct {v1, p0, v0}, Lhc/f;-><init>(Lhc/j;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method A(Lec/c;)V
    .locals 0

    iput-object p1, p0, Lhc/j;->n:Lec/c;

    return-void
.end method

.method public a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhc/j;->j:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lhc/j;->h:Ljava/util/concurrent/Executor;

    new-instance v2, Lhc/e;

    invoke-direct {v2, p0, p1}, Lhc/e;-><init>(Lhc/j;Z)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljc/a;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lhc/j;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lhc/j;->f:Lhc/s;

    iget-object v1, p0, Lhc/j;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lhc/j;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lhc/s;->e(I)V

    invoke-direct {p0}, Lhc/j;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhc/j;->n:Lec/c;

    invoke-static {v0}, Lhc/c;->c(Lec/c;)Lhc/c;

    move-result-object v0

    invoke-interface {p1, v0}, Ljc/a;->a(Lec/d;)V

    :cond_0
    return-void
.end method

.method public c(Lec/e$a;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lhc/j;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lhc/j;->f:Lhc/s;

    iget-object v1, p0, Lhc/j;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lhc/j;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lhc/s;->e(I)V

    invoke-direct {p0}, Lhc/j;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhc/j;->n:Lec/c;

    invoke-interface {p1, v0}, Lec/e$a;->a(Lec/c;)V

    :cond_0
    return-void
.end method

.method public d(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhc/j;->j:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lhc/j;->h:Ljava/util/concurrent/Executor;

    new-instance v2, Lhc/d;

    invoke-direct {v2, p0, p1}, Lhc/d;-><init>(Lhc/j;Z)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public f()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhc/j;->m:Lec/a;

    if-nez v0, :cond_0

    new-instance v0, Lzb/m;

    const-string v1, "No AppCheckProvider installed."

    invoke-direct {v0, v1}, Lzb/m;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lec/a;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public g(Lec/b;)V
    .locals 1

    iget-object v0, p0, Lhc/j;->a:Lzb/g;

    invoke-virtual {v0}, Lzb/g;->x()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lhc/j;->s(Lec/b;Z)V

    return-void
.end method

.method public h(Lec/e$a;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lhc/j;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lhc/j;->f:Lhc/s;

    iget-object v0, p0, Lhc/j;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lhc/j;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lhc/s;->e(I)V

    return-void
.end method

.method public i(Z)V
    .locals 1

    iget-object v0, p0, Lhc/j;->f:Lhc/s;

    invoke-virtual {v0, p1}, Lhc/s;->f(Z)V

    return-void
.end method

.method p()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhc/j;->m:Lec/a;

    invoke-interface {v0}, Lec/a;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lhc/j;->g:Ljava/util/concurrent/Executor;

    new-instance v2, Lhc/h;

    invoke-direct {v2, p0}, Lhc/h;-><init>(Lhc/j;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method q()Lee/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lee/b<",
            "Lod/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhc/j;->b:Lee/b;

    return-object v0
.end method

.method public s(Lec/b;Z)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lhc/j;->l:Lec/b;

    iget-object v0, p0, Lhc/j;->a:Lzb/g;

    invoke-interface {p1, v0}, Lec/b;->a(Lzb/g;)Lec/a;

    move-result-object p1

    iput-object p1, p0, Lhc/j;->m:Lec/a;

    iget-object p1, p0, Lhc/j;->f:Lhc/s;

    invoke-virtual {p1, p2}, Lhc/s;->f(Z)V

    return-void
.end method
