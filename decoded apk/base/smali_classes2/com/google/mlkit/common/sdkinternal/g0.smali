.class public final synthetic Lcom/google/mlkit/common/sdkinternal/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/mlkit/common/sdkinternal/o;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/sdkinternal/o;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/g0;->a:Lcom/google/mlkit/common/sdkinternal/o;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/g0;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const-class v0, Ljava/lang/Throwable;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/g0;->a:Lcom/google/mlkit/common/sdkinternal/o;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/g0;->b:Ljava/lang/Runnable;

    new-instance v3, Lcom/google/mlkit/common/sdkinternal/k0;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lcom/google/mlkit/common/sdkinternal/k0;-><init>(Lcom/google/mlkit/common/sdkinternal/o;Lcom/google/mlkit/common/sdkinternal/j0;)V

    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Lcom/google/mlkit/common/sdkinternal/k0;->close()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v3}, Lcom/google/mlkit/common/sdkinternal/k0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_2
    const-string v3, "addSuppressed"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v6

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    throw v1
.end method
