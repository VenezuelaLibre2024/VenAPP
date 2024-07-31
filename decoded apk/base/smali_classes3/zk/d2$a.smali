.class final Lzk/d2$a;
.super Lzk/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzk/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/n<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final t:Lzk/d2;


# direct methods
.method public constructor <init>(Lgk/Continuation;Lzk/d2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-TT;>;",
            "Lzk/d2;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lzk/n;-><init>(Lgk/Continuation;I)V

    iput-object p2, p0, Lzk/d2$a;->t:Lzk/d2;

    return-void
.end method


# virtual methods
.method protected G()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public u(Lzk/w1;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lzk/d2$a;->t:Lzk/d2;

    invoke-virtual {v0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/d2$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lzk/d2$c;

    invoke-virtual {v1}, Lzk/d2$c;->f()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Lzk/a0;

    if-eqz v1, :cond_1

    check-cast v0, Lzk/a0;

    iget-object p1, v0, Lzk/a0;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-interface {p1}, Lzk/w1;->n()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
