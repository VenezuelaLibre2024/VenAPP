.class public abstract Lzk/a;
.super Lzk/d2;
.source "SourceFile"

# interfaces
.implements Lgk/Continuation;
.implements Lzk/k0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/d2;",
        "Lgk/Continuation<",
        "TT;>;",
        "Lzk/k0;"
    }
.end annotation


# instance fields
.field private final c:Lgk/f;


# direct methods
.method public constructor <init>(Lgk/f;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lzk/d2;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p1, p2}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p2

    check-cast p2, Lzk/w1;

    invoke-virtual {p0, p2}, Lzk/d2;->b0(Lzk/w1;)V

    :cond_0
    invoke-interface {p1, p0}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    iput-object p1, p0, Lzk/a;->c:Lgk/f;

    return-void
.end method


# virtual methods
.method protected D()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lzk/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected N0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lzk/d2;->t(Ljava/lang/Object;)V

    return-void
.end method

.method protected O0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected P0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final Q0(Lzk/m0;Ljava/lang/Object;Lok/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/m0;",
            "TR;",
            "Lok/p<",
            "-TR;-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lzk/m0;->h(Lok/p;Ljava/lang/Object;Lgk/Continuation;)V

    return-void
.end method

.method public a()Z
    .locals 1

    invoke-super {p0}, Lzk/d2;->a()Z

    move-result v0

    return v0
.end method

.method public final a0(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lzk/a;->c:Lgk/f;

    invoke-static {v0, p1}, Lzk/j0;->a(Lgk/f;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getContext()Lgk/f;
    .locals 1

    iget-object v0, p0, Lzk/a;->c:Lgk/f;

    return-object v0
.end method

.method public h()Lgk/f;
    .locals 1

    iget-object v0, p0, Lzk/a;->c:Lgk/f;

    return-object v0
.end method

.method public p0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lzk/a;->c:Lgk/f;

    invoke-static {v0}, Lzk/g0;->b(Lgk/f;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lzk/d2;->p0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lzk/d2;->p0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lzk/e0;->d(Ljava/lang/Object;Lok/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzk/d2;->n0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lzk/e2;->b:Lel/h0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lzk/a;->N0(Ljava/lang/Object;)V

    return-void
.end method

.method protected final u0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lzk/a0;

    if-eqz v0, :cond_0

    check-cast p1, Lzk/a0;

    iget-object v0, p1, Lzk/a0;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lzk/a0;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lzk/a;->O0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lzk/a;->P0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
