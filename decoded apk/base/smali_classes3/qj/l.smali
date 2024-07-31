.class public final Lqj/l;
.super Ldj/s;
.source "SourceFile"

# interfaces
.implements Lmj/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/l$a;
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
        "Lmj/c<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/s;-><init>()V

    iput-object p1, p0, Lqj/l;->a:Ldj/n;

    return-void
.end method


# virtual methods
.method public a()Ldj/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/j<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqj/k;

    iget-object v1, p0, Lqj/l;->a:Ldj/n;

    invoke-direct {v0, v1}, Lqj/k;-><init>(Ldj/n;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object v0

    return-object v0
.end method

.method protected k(Ldj/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/l;->a:Ldj/n;

    new-instance v1, Lqj/l$a;

    invoke-direct {v1, p1}, Lqj/l$a;-><init>(Ldj/t;)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
