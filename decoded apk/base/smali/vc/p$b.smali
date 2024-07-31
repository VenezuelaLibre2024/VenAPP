.class Lvc/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/p;->K(Lcd/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
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
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Ljava/lang/Thread;

.field final synthetic d:Lcd/i;

.field final synthetic e:Z

.field final synthetic f:Lvc/p;


# direct methods
.method constructor <init>(Lvc/p;JLjava/lang/Throwable;Ljava/lang/Thread;Lcd/i;Z)V
    .locals 0

    iput-object p1, p0, Lvc/p$b;->f:Lvc/p;

    iput-wide p2, p0, Lvc/p$b;->a:J

    iput-object p4, p0, Lvc/p$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lvc/p$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lvc/p$b;->d:Lcd/i;

    iput-boolean p7, p0, Lvc/p$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lvc/p$b;->a:J

    invoke-static {v0, v1}, Lvc/p;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lvc/p$b;->f:Lvc/p;

    invoke-static {v0}, Lvc/p;->c(Lvc/p;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, Lsc/g;->d(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Lvc/p$b;->f:Lvc/p;

    invoke-static {v2}, Lvc/p;->g(Lvc/p;)Lvc/s;

    move-result-object v2

    invoke-virtual {v2}, Lvc/s;->a()Z

    iget-object v2, p0, Lvc/p$b;->f:Lvc/p;

    invoke-static {v2}, Lvc/p;->h(Lvc/p;)Lvc/q0;

    move-result-object v2

    iget-object v3, p0, Lvc/p$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lvc/p$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Lvc/q0;->t(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Lvc/p$b;->f:Lvc/p;

    iget-wide v3, p0, Lvc/p$b;->a:J

    invoke-static {v2, v3, v4}, Lvc/p;->i(Lvc/p;J)V

    iget-object v2, p0, Lvc/p$b;->f:Lvc/p;

    iget-object v3, p0, Lvc/p$b;->d:Lcd/i;

    invoke-virtual {v2, v3}, Lvc/p;->v(Lcd/i;)V

    iget-object v2, p0, Lvc/p$b;->f:Lvc/p;

    new-instance v3, Lvc/h;

    iget-object v4, p0, Lvc/p$b;->f:Lvc/p;

    invoke-static {v4}, Lvc/p;->j(Lvc/p;)Lvc/b0;

    move-result-object v4

    invoke-direct {v3, v4}, Lvc/h;-><init>(Lvc/b0;)V

    invoke-virtual {v3}, Lvc/h;->toString()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lvc/p$b;->e:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lvc/p;->k(Lvc/p;Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v2, p0, Lvc/p$b;->f:Lvc/p;

    invoke-static {v2}, Lvc/p;->l(Lvc/p;)Lvc/x;

    move-result-object v2

    invoke-virtual {v2}, Lvc/x;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lvc/p$b;->f:Lvc/p;

    invoke-static {v1}, Lvc/p;->m(Lvc/p;)Lvc/n;

    move-result-object v1

    invoke-virtual {v1}, Lvc/n;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Lvc/p$b;->d:Lcd/i;

    invoke-interface {v2}, Lcd/i;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lvc/p$b$a;

    invoke-direct {v3, p0, v1, v0}, Lvc/p$b$a;-><init>(Lvc/p$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvc/p$b;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
