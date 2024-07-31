.class public abstract Lzk/i1;
.super Lzk/g1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzk/g1;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract u1()Ljava/lang/Thread;
.end method

.method protected v1(JLzk/h1$b;)V
    .locals 1

    sget-object v0, Lzk/p0;->t:Lzk/p0;

    invoke-virtual {v0, p1, p2, p3}, Lzk/h1;->G1(JLzk/h1$b;)V

    return-void
.end method

.method protected final w1()V
    .locals 2

    invoke-virtual {p0}, Lzk/i1;->u1()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, Lzk/c;->a()Lzk/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
