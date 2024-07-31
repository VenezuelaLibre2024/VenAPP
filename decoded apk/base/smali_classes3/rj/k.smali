.class public final Lrj/k;
.super Lrj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lrj/a<",
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/p;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+TU;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lrj/a;-><init>(Ldj/p;)V

    iput-object p2, p0, Lrj/k;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method public s(Ldj/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TU;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lrj/a;->a:Ldj/p;

    new-instance v1, Lrj/k$a;

    iget-object v2, p0, Lrj/k;->b:Ljj/e;

    invoke-direct {v1, p1, v2}, Lrj/k$a;-><init>(Ldj/q;Ljj/e;)V

    invoke-interface {v0, v1}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method
