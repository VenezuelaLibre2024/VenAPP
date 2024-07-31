.class public final Lzk/z2;
.super Lel/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lel/d0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final e:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lck/m<",
            "Lgk/f;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Lgk/f;Lgk/Continuation;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f;",
            "Lgk/Continuation<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lzk/a3;->a:Lzk/a3;

    invoke-interface {p1, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lel/d0;-><init>(Lgk/f;Lgk/Continuation;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lzk/z2;->e:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object p2

    sget-object v0, Lgk/d;->n:Lgk/d$b;

    invoke-interface {p2, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p2

    instance-of p2, p2, Lzk/h0;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lel/l0;->c(Lgk/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lzk/z2;->S0(Lgk/f;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method protected N0(Ljava/lang/Object;)V
    .locals 5

    iget-boolean v0, p0, Lzk/z2;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/z2;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lck/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lck/m;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgk/f;

    invoke-virtual {v0}, Lck/m;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lzk/z2;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-static {p1, v0}, Lzk/e0;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-interface {v0}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lel/l0;->c(Lgk/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lel/l0;->a:Lel/h0;

    if-eq v3, v4, :cond_2

    invoke-static {v0, v1, v3}, Lzk/g0;->g(Lgk/Continuation;Lgk/f;Ljava/lang/Object;)Lzk/z2;

    move-result-object v2

    :cond_2
    :try_start_0
    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-interface {v0, p1}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lzk/z2;->R0()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v3}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lzk/z2;->R0()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    invoke-static {v1, v3}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    :cond_6
    throw p1
.end method

.method public final R0()Z
    .locals 3

    iget-boolean v0, p0, Lzk/z2;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/z2;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lzk/z2;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final S0(Lgk/f;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzk/z2;->threadLocalIsSet:Z

    iget-object v0, p0, Lzk/z2;->e:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
