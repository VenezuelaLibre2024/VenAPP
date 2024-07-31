.class final Lqj/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/c;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/j;
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
        "Ldj/c;",
        "Lgj/b;"
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

.field b:Lgj/b;


# direct methods
.method constructor <init>(Ldj/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj/j$a;->a:Ldj/l;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/j$a;->b:Lgj/b;

    iget-object v0, p0, Lqj/j$a;->a:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/j$a;->b:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqj/j$a;->b:Lgj/b;

    iget-object p1, p0, Lqj/j$a;->a:Ldj/l;

    invoke-interface {p1, p0}, Ldj/l;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lqj/j$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/j$a;->b:Lgj/b;

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lqj/j$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/j$a;->b:Lgj/b;

    iget-object v0, p0, Lqj/j$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
