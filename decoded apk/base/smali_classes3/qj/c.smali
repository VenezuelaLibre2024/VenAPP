.class public final Lqj/c;
.super Ldj/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/m<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/m<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lqj/c;->a:Ldj/m;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lqj/c$a;

    invoke-direct {v0, p1}, Lqj/c$a;-><init>(Ldj/l;)V

    invoke-interface {p1, v0}, Ldj/l;->b(Lgj/b;)V

    :try_start_0
    iget-object p1, p0, Lqj/c;->a:Ldj/m;

    invoke-interface {p1, v0}, Ldj/m;->a(Ldj/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lqj/c$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
