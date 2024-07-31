.class public final Lul/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lul/e;-><init>(Lul/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lul/e;


# direct methods
.method constructor <init>(Lul/e;)V
    .locals 0

    iput-object p1, p0, Lul/e$d;->a:Lul/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    :cond_0
    :goto_0
    iget-object v0, p0, Lul/e$d;->a:Lul/e;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Lul/e;->d()Lul/a;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v1}, Lul/a;->d()Lul/d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lul/e$d;->a:Lul/e;

    sget-object v3, Lul/e;->h:Lul/e$b;

    invoke-virtual {v3}, Lul/e$b;->a()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lul/d;->h()Lul/e;

    move-result-object v4

    invoke-virtual {v4}, Lul/e;->g()Lul/e$a;

    move-result-object v4

    invoke-interface {v4}, Lul/e$a;->c()J

    move-result-wide v4

    const-string v6, "starting"

    invoke-static {v1, v0, v6}, Lul/b;->a(Lul/a;Lul/d;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-wide/16 v4, -0x1

    :goto_1
    :try_start_1
    invoke-static {v2, v1}, Lul/e;->b(Lul/e;Lul/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sget-object v2, Lck/v;->a:Lck/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lul/d;->h()Lul/e;

    move-result-object v2

    invoke-virtual {v2}, Lul/e;->g()Lul/e$a;

    move-result-object v2

    invoke-interface {v2}, Lul/e$a;->c()J

    move-result-wide v2

    sub-long/2addr v2, v4

    const-string v4, "finished run in "

    invoke-static {v2, v3}, Lul/b;->b(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lul/b;->a(Lul/a;Lul/d;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    :catchall_1
    move-exception v6

    :try_start_3
    invoke-virtual {v2}, Lul/e;->g()Lul/e$a;

    move-result-object v2

    invoke-interface {v2, p0}, Lul/e$a;->execute(Ljava/lang/Runnable;)V

    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lul/d;->h()Lul/e;

    move-result-object v3

    invoke-virtual {v3}, Lul/e;->g()Lul/e$a;

    move-result-object v3

    invoke-interface {v3}, Lul/e$a;->c()J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-string v3, "failed a run in "

    invoke-static {v6, v7}, Lul/b;->b(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v3}, Lul/b;->a(Lul/a;Lul/d;Ljava/lang/String;)V

    :cond_3
    throw v2

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method
