.class public final Lnj/e;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/c;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lgj/b;",
        ">;",
        "Ldj/c;",
        "Lgj/b;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x68b5a82715a81b26L


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 0

    invoke-static {p0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lkj/b;->b(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    new-instance v0, Lhj/d;

    invoke-direct {v0, p1}, Lhj/d;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void
.end method
