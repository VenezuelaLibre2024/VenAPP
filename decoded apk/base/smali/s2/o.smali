.class public Ls2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ls2/e;

.field private final d:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ls2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/o;->a:Ljava/lang/String;

    iput-object p2, p0, Ls2/o;->b:Ljava/lang/String;

    iput-object p3, p0, Ls2/o;->c:Ls2/e;

    iput-object p4, p0, Ls2/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    const-string v0, "ffmpeg-kit-flutter"

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cat "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ls2/o;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " > "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ls2/o;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Starting copy %s to pipe %s operation."

    new-array v6, v3, [Ljava/lang/Object;

    iget-object v7, p0, Ls2/o;->a:Ljava/lang/String;

    aput-object v7, v6, v2

    iget-object v7, p0, Ls2/o;->b:Ljava/lang/String;

    aput-object v7, v6, v1

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v7

    const/4 v8, 0x3

    new-array v9, v8, [Ljava/lang/String;

    const-string v10, "sh"

    aput-object v10, v9, v2

    const-string v10, "-c"

    aput-object v10, v9, v1

    aput-object v4, v9, v3

    invoke-virtual {v7, v9}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Process;->waitFor()I

    move-result v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const-string v7, "Copying %s to pipe %s operation completed with rc %d in %d seconds."

    const/4 v11, 0x4

    new-array v11, v11, [Ljava/lang/Object;

    iget-object v12, p0, Ls2/o;->a:Ljava/lang/String;

    aput-object v12, v11, v2

    iget-object v12, p0, Ls2/o;->b:Ljava/lang/String;

    aput-object v12, v11, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v3

    sub-long/2addr v9, v5

    const-wide/16 v5, 0x3e8

    div-long/2addr v9, v5

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v11, v8

    invoke-static {v7, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v5, p0, Ls2/o;->c:Ls2/e;

    iget-object v6, p0, Ls2/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Ls2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    goto :goto_0

    :catch_1
    move-exception v4

    :goto_0
    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Ls2/o;->a:Ljava/lang/String;

    aput-object v5, v3, v2

    iget-object v2, p0, Ls2/o;->b:Ljava/lang/String;

    aput-object v2, v3, v1

    const-string v1, "Copy %s to pipe %s failed with error."

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Ls2/o;->c:Ls2/e;

    iget-object v1, p0, Ls2/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v2, "WRITE_TO_PIPE_FAILED"

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Ls2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
