.class Lvc/p$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/p$b;->a()Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/SuccessContinuation<",
        "Lcd/d;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Executor;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lvc/p$b;


# direct methods
.method constructor <init>(Lvc/p$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lvc/p$b$a;->c:Lvc/p$b;

    iput-object p2, p0, Lvc/p$b$a;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lvc/p$b$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcd/d;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v1, "Received null app settings, cannot send reports at crash time."

    invoke-virtual {p1, v1}, Lsc/g;->k(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lvc/p$b$a;->c:Lvc/p$b;

    iget-object v1, v1, Lvc/p$b;->f:Lvc/p;

    invoke-static {v1}, Lvc/p;->n(Lvc/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, p1, v2

    iget-object v1, p0, Lvc/p$b$a;->c:Lvc/p$b;

    iget-object v1, v1, Lvc/p$b;->f:Lvc/p;

    invoke-static {v1}, Lvc/p;->h(Lvc/p;)Lvc/q0;

    move-result-object v1

    iget-object v2, p0, Lvc/p$b$a;->a:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lvc/p$b$a;->c:Lvc/p$b;

    iget-boolean v3, v3, Lvc/p$b;->e:Z

    if-eqz v3, :cond_1

    iget-object v0, p0, Lvc/p$b$a;->b:Ljava/lang/String;

    :cond_1
    invoke-virtual {v1, v2, v0}, Lvc/q0;->y(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->whenAll([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Lcd/d;

    invoke-virtual {p0, p1}, Lvc/p$b$a;->a(Lcd/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
