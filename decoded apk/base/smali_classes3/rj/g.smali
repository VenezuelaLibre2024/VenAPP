.class public final Lrj/g;
.super Lrj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/g$a;
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
.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;"
        }
    .end annotation
.end field

.field final c:Z


# direct methods
.method public constructor <init>(Ldj/p;Ljj/e;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lrj/a;-><init>(Ldj/p;)V

    iput-object p2, p0, Lrj/g;->b:Ljj/e;

    iput-boolean p3, p0, Lrj/g;->c:Z

    return-void
.end method


# virtual methods
.method protected s(Ldj/q;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lrj/a;->a:Ldj/p;

    new-instance v1, Lrj/g$a;

    iget-object v2, p0, Lrj/g;->b:Ljj/e;

    iget-boolean v3, p0, Lrj/g;->c:Z

    invoke-direct {v1, p1, v2, v3}, Lrj/g$a;-><init>(Ldj/q;Ljj/e;Z)V

    invoke-interface {v0, v1}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method
