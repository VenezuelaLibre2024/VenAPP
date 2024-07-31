.class final Lzk/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final a:Lzk/h0;


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lzk/z0;->a:Lzk/h0;

    sget-object v1, Lgk/g;->a:Lgk/g;

    invoke-virtual {v0, v1}, Lzk/h0;->F0(Lgk/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/z0;->a:Lzk/h0;

    invoke-virtual {v0, v1, p1}, Lzk/h0;->D0(Lgk/f;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzk/z0;->a:Lzk/h0;

    invoke-virtual {v0}, Lzk/h0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
