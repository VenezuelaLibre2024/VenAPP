.class final Lrj/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/m;
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
        "Ldj/q<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/q<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Ldj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/p<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final c:Lkj/e;

.field d:Z


# direct methods
.method constructor <init>(Ldj/q;Ldj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;",
            "Ldj/p<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj/m$a;->a:Ldj/q;

    iput-object p2, p0, Lrj/m$a;->b:Ldj/p;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrj/m$a;->d:Z

    new-instance p1, Lkj/e;

    invoke-direct {p1}, Lkj/e;-><init>()V

    iput-object p1, p0, Lrj/m$a;->c:Lkj/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lrj/m$a;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrj/m$a;->d:Z

    iget-object v0, p0, Lrj/m$a;->b:Ldj/p;

    invoke-interface {v0, p0}, Ldj/p;->d(Ldj/q;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrj/m$a;->a:Ldj/q;

    invoke-interface {v0}, Ldj/q;->a()V

    :goto_0
    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lrj/m$a;->c:Lkj/e;

    invoke-virtual {v0, p1}, Lkj/e;->b(Lgj/b;)Z

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lrj/m$a;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrj/m$a;->d:Z

    :cond_0
    iget-object v0, p0, Lrj/m$a;->a:Ldj/q;

    invoke-interface {v0, p1}, Ldj/q;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lrj/m$a;->a:Ldj/q;

    invoke-interface {v0, p1}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
