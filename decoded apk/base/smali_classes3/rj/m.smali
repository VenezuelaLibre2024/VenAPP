.class public final Lrj/m;
.super Lrj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lrj/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:Ldj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/p<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/p;Ldj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "TT;>;",
            "Ldj/p<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lrj/a;-><init>(Ldj/p;)V

    iput-object p2, p0, Lrj/m;->b:Ldj/p;

    return-void
.end method


# virtual methods
.method public s(Ldj/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lrj/m$a;

    iget-object v1, p0, Lrj/m;->b:Ldj/p;

    invoke-direct {v0, p1, v1}, Lrj/m$a;-><init>(Ldj/q;Ldj/p;)V

    iget-object v1, v0, Lrj/m$a;->c:Lkj/e;

    invoke-interface {p1, v1}, Ldj/q;->b(Lgj/b;)V

    iget-object p1, p0, Lrj/a;->a:Ldj/p;

    invoke-interface {p1, v0}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method
