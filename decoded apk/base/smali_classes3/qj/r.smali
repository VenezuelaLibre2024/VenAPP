.class public final Lqj/r;
.super Lqj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/r$a;,
        Lqj/r$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lqj/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:Ldj/r;


# direct methods
.method public constructor <init>(Ldj/n;Ldj/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;",
            "Ldj/r;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqj/a;-><init>(Ldj/n;)V

    iput-object p2, p0, Lqj/r;->b:Ldj/r;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lqj/r$a;

    invoke-direct {v0, p1}, Lqj/r$a;-><init>(Ldj/l;)V

    invoke-interface {p1, v0}, Ldj/l;->b(Lgj/b;)V

    iget-object p1, v0, Lqj/r$a;->a:Lkj/e;

    iget-object v1, p0, Lqj/r;->b:Ldj/r;

    new-instance v2, Lqj/r$b;

    iget-object v3, p0, Lqj/a;->a:Ldj/n;

    invoke-direct {v2, v0, v3}, Lqj/r$b;-><init>(Ldj/l;Ldj/n;)V

    invoke-virtual {v1, v2}, Ldj/r;->b(Ljava/lang/Runnable;)Lgj/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkj/e;->a(Lgj/b;)Z

    return-void
.end method
