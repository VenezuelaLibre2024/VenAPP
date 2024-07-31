.class final Lia/t;
.super Lia/b;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Lha/a;

.field final synthetic d:Lia/v;


# direct methods
.method constructor <init>(Lia/v;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/tasks/TaskCompletionSource;Lha/a;)V
    .locals 0

    iput-object p1, p0, Lia/t;->d:Lia/v;

    iput-object p2, p0, Lia/t;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lia/t;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lia/t;->c:Lha/a;

    invoke-direct {p0}, Lia/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final d2(Lcom/google/android/gms/common/api/Status;Lha/g;)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lia/t;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lia/t;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/x;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->y1()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lha/g;->v1()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lia/t;->d:Lia/v;

    iget-object p2, p0, Lia/t;->c:Lha/a;

    const-class v0, Lha/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/common/api/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/k$a;

    move-result-object p2

    const/16 v0, 0x6aaa

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/common/api/e;->doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/k$a;I)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
