.class public final Lrj/h;
.super Ldj/b;
.source "SourceFile"

# interfaces
.implements Lmj/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/b;",
        "Lmj/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/p<",
            "TT;>;"
        }
    .end annotation
.end field

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

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Lrj/h;->a:Ldj/p;

    iput-object p2, p0, Lrj/h;->b:Ljj/e;

    iput-boolean p3, p0, Lrj/h;->c:Z

    return-void
.end method


# virtual methods
.method public b()Ldj/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lrj/g;

    iget-object v1, p0, Lrj/h;->a:Ldj/p;

    iget-object v2, p0, Lrj/h;->b:Ljj/e;

    iget-boolean v3, p0, Lrj/h;->c:Z

    invoke-direct {v0, v1, v2, v3}, Lrj/g;-><init>(Ldj/p;Ljj/e;Z)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object v0

    return-object v0
.end method

.method protected p(Ldj/c;)V
    .locals 4

    iget-object v0, p0, Lrj/h;->a:Ldj/p;

    new-instance v1, Lrj/h$a;

    iget-object v2, p0, Lrj/h;->b:Ljj/e;

    iget-boolean v3, p0, Lrj/h;->c:Z

    invoke-direct {v1, p1, v2, v3}, Lrj/h$a;-><init>(Ldj/c;Ljj/e;Z)V

    invoke-interface {v0, v1}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method
