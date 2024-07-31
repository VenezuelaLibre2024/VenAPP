.class final Lqj/p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/l<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/l<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lgj/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/l;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lgj/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj/p$a$a;->a:Ldj/l;

    iput-object p2, p0, Lqj/p$a$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqj/p$a$a;->a:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/p$a$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqj/p$a$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/p$a$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
