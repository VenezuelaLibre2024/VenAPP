.class final Lqj/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldj/l<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lqj/h$a;


# direct methods
.method constructor <init>(Lqj/h$a;)V
    .locals 0

    iput-object p1, p0, Lqj/h$a$a;->a:Lqj/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqj/h$a$a;->a:Lqj/h$a;

    iget-object v0, v0, Lqj/h$a;->a:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/h$a$a;->a:Lqj/h$a;

    invoke-static {v0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqj/h$a$a;->a:Lqj/h$a;

    iget-object v0, v0, Lqj/h$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/h$a$a;->a:Lqj/h$a;

    iget-object v0, v0, Lqj/h$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
