.class final Lcom/google/android/gms/common/internal/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/i$a;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/i;

.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Lcom/google/android/gms/common/internal/r$a;

.field final synthetic d:Lcom/google/android/gms/common/internal/r0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/common/internal/r$a;Lcom/google/android/gms/common/internal/r0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/o0;->a:Lcom/google/android/gms/common/api/i;

    iput-object p2, p0, Lcom/google/android/gms/common/internal/o0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lcom/google/android/gms/common/internal/o0;->c:Lcom/google/android/gms/common/internal/r$a;

    iput-object p4, p0, Lcom/google/android/gms/common/internal/o0;->d:Lcom/google/android/gms/common/internal/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->y1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/common/internal/o0;->a:Lcom/google/android/gms/common/api/i;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/common/api/i;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/n;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/o0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/o0;->c:Lcom/google/android/gms/common/internal/r$a;

    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/r$a;->a(Lcom/google/android/gms/common/api/n;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/o0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method
