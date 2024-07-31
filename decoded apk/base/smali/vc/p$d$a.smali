.class Lvc/p$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/p$d;->a(Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/tasks/Task<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Boolean;

.field final synthetic b:Lvc/p$d;


# direct methods
.method constructor <init>(Lvc/p$d;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iput-object p2, p0, Lvc/p$d$a;->a:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvc/p$d$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "Deleting cached crash reports..."

    invoke-virtual {v0, v1}, Lsc/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iget-object v0, v0, Lvc/p$d;->b:Lvc/p;

    invoke-virtual {v0}, Lvc/p;->N()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lvc/p;->d(Ljava/util/List;)V

    iget-object v0, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iget-object v0, v0, Lvc/p$d;->b:Lvc/p;

    invoke-static {v0}, Lvc/p;->h(Lvc/p;)Lvc/q0;

    move-result-object v0

    invoke-virtual {v0}, Lvc/q0;->w()V

    iget-object v0, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iget-object v0, v0, Lvc/p$d;->b:Lvc/p;

    iget-object v0, v0, Lvc/p;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "Sending cached crash reports..."

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lvc/p$d$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iget-object v1, v1, Lvc/p$d;->b:Lvc/p;

    invoke-static {v1}, Lvc/p;->l(Lvc/p;)Lvc/x;

    move-result-object v1

    invoke-virtual {v1, v0}, Lvc/x;->c(Z)V

    iget-object v0, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iget-object v0, v0, Lvc/p$d;->b:Lvc/p;

    invoke-static {v0}, Lvc/p;->m(Lvc/p;)Lvc/n;

    move-result-object v0

    invoke-virtual {v0}, Lvc/n;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lvc/p$d$a;->b:Lvc/p$d;

    iget-object v1, v1, Lvc/p$d;->a:Lcom/google/android/gms/tasks/Task;

    new-instance v2, Lvc/p$d$a$a;

    invoke-direct {v2, p0, v0}, Lvc/p$d$a$a;-><init>(Lvc/p$d$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvc/p$d$a;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
