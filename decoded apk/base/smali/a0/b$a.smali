.class La0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/util/concurrent/f;

.field final synthetic b:La0/b;


# direct methods
.method constructor <init>(La0/b;Lcom/google/common/util/concurrent/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, La0/b$a;->b:La0/b;

    iput-object p2, p0, La0/b$a;->a:Lcom/google/common/util/concurrent/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La0/b$a;->b:La0/b;

    iget-object v2, p0, La0/b$a;->a:Lcom/google/common/util/concurrent/f;

    invoke-static {v2}, La0/f;->e(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, La0/d;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, La0/b$a;->b:La0/b;

    iput-object v0, v1, La0/b;->r:Lcom/google/common/util/concurrent/f;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_1
    iget-object v2, p0, La0/b$a;->b:La0/b;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v2, v1}, La0/d;->c(Ljava/lang/Throwable;)Z

    goto :goto_0

    :goto_1
    return-void

    :catch_1
    iget-object v1, p0, La0/b$a;->b:La0/b;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La0/b;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, La0/b$a;->b:La0/b;

    iput-object v0, v1, La0/b;->r:Lcom/google/common/util/concurrent/f;

    return-void

    :goto_2
    iget-object v2, p0, La0/b$a;->b:La0/b;

    iput-object v0, v2, La0/b;->r:Lcom/google/common/util/concurrent/f;

    throw v1
.end method
