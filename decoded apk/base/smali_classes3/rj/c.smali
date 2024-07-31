.class public final Lrj/c;
.super Ldj/s;
.source "SourceFile"

# interfaces
.implements Lmj/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/s<",
        "Ljava/lang/Boolean;",
        ">;",
        "Lmj/d<",
        "Ljava/lang/Boolean;",
        ">;"
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

    invoke-direct {p0}, Ldj/s;-><init>()V

    iput-object p1, p0, Lrj/c;->a:Ldj/p;

    iput-object p2, p0, Lrj/c;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method public b()Ldj/o;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/o<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrj/b;

    iget-object v1, p0, Lrj/c;->a:Ldj/p;

    iget-object v2, p0, Lrj/c;->b:Ljj/g;

    invoke-direct {v0, v1, v2}, Lrj/b;-><init>(Ldj/p;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object v0

    return-object v0
.end method

.method protected k(Ldj/t;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lrj/c;->a:Ldj/p;

    new-instance v1, Lrj/c$a;

    iget-object v2, p0, Lrj/c;->b:Ljj/g;

    invoke-direct {v1, p1, v2}, Lrj/c$a;-><init>(Ldj/t;Ljj/g;)V

    invoke-interface {v0, v1}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method
