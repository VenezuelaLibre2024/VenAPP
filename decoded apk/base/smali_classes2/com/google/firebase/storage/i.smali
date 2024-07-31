.class Lcom/google/firebase/storage/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lcom/google/firebase/storage/p;

.field private b:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/storage/o;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/firebase/storage/o;

.field private d:Lgf/c;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/p;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/p;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/storage/o;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/storage/i;->a:Lcom/google/firebase/storage/p;

    iput-object p2, p0, Lcom/google/firebase/storage/i;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->v()Lcom/google/firebase/storage/p;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/storage/p;->s()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/firebase/storage/i;->a:Lcom/google/firebase/storage/p;

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->w()Lcom/google/firebase/storage/f;

    move-result-object p1

    new-instance p2, Lgf/c;

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->a()Lzb/g;

    move-result-object v0

    invoke-virtual {v0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->c()Loc/b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->b()Ljc/b;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->i()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lgf/c;-><init>(Landroid/content/Context;Loc/b;Ljc/b;J)V

    iput-object p2, p0, Lcom/google/firebase/storage/i;->d:Lgf/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "getMetadata() is not supported at the root of the bucket."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Lhf/b;

    iget-object v1, p0, Lcom/google/firebase/storage/i;->a:Lcom/google/firebase/storage/p;

    invoke-virtual {v1}, Lcom/google/firebase/storage/p;->x()Lgf/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/i;->a:Lcom/google/firebase/storage/p;

    invoke-virtual {v2}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lhf/b;-><init>(Lgf/h;Lzb/g;)V

    iget-object v1, p0, Lcom/google/firebase/storage/i;->d:Lgf/c;

    invoke-virtual {v1, v0}, Lgf/c;->d(Lhf/e;)V

    invoke-virtual {v0}, Lhf/e;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v1, Lcom/google/firebase/storage/o$b;

    invoke-virtual {v0}, Lhf/e;->n()Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/i;->a:Lcom/google/firebase/storage/p;

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/storage/o$b;-><init>(Lorg/json/JSONObject;Lcom/google/firebase/storage/p;)V

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$b;->a()Lcom/google/firebase/storage/o;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/storage/i;->c:Lcom/google/firebase/storage/o;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to parse resulting metadata. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lhf/e;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "GetMetadataTask"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/firebase/storage/i;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1}, Lcom/google/firebase/storage/n;->d(Ljava/lang/Throwable;)Lcom/google/firebase/storage/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/storage/i;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/google/firebase/storage/i;->c:Lcom/google/firebase/storage/o;

    invoke-virtual {v0, v1, v2}, Lhf/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
