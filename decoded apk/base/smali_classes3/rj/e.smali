.class public final Lrj/e;
.super Lrj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/e$a;
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
.field final b:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/p;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "TT;>;",
            "Ljj/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lrj/a;-><init>(Ldj/p;)V

    iput-object p2, p0, Lrj/e;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method public s(Ldj/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lrj/a;->a:Ldj/p;

    new-instance v1, Lrj/e$a;

    iget-object v2, p0, Lrj/e;->b:Ljj/g;

    invoke-direct {v1, p1, v2}, Lrj/e$a;-><init>(Ldj/q;Ljj/g;)V

    invoke-interface {v0, v1}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method