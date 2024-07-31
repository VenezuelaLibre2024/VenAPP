.class public final Lrj/j;
.super Ldj/o;
.source "SourceFile"

# interfaces
.implements Lmj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/o<",
        "TT;>;",
        "Lmj/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
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

    invoke-direct {p0}, Ldj/o;-><init>()V

    iput-object p1, p0, Lrj/j;->a:Ljava/lang/Object;

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

    iget-object v0, p0, Lrj/j;->a:Ljava/lang/Object;

    return-object v0
.end method

.method protected s(Ldj/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lrj/l$a;

    iget-object v1, p0, Lrj/j;->a:Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lrj/l$a;-><init>(Ldj/q;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ldj/q;->b(Lgj/b;)V

    invoke-virtual {v0}, Lrj/l$a;->run()V

    return-void
.end method
