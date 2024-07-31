.class public final Lqj/m;
.super Ldj/j;
.source "SourceFile"

# interfaces
.implements Lmj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
        "TT;>;",
        "Lmj/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lqj/m;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lqj/m;->a:Ljava/lang/Object;

    return-object v0
.end method

.method protected u(Ldj/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-static {}, Lgj/c;->a()Lgj/b;

    move-result-object v0

    invoke-interface {p1, v0}, Ldj/l;->b(Lgj/b;)V

    iget-object v0, p0, Lqj/m;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
