.class public final Lnj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/t<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lgj/b;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ldj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/t<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ldj/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lgj/b;",
            ">;",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/f;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lnj/f;->b:Ldj/t;

    return-void
.end method


# virtual methods
.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lnj/f;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lkj/b;->l(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lnj/f;->b:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lnj/f;->b:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
