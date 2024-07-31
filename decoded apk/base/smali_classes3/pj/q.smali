.class public final Lpj/q;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/q$a;,
        Lpj/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/a<",
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field final c:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/f;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+TU;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/q;->c:Ljj/e;

    return-void
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TU;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lmj/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v1, Lpj/q$a;

    check-cast p1, Lmj/a;

    iget-object v2, p0, Lpj/q;->c:Ljj/e;

    invoke-direct {v1, p1, v2}, Lpj/q$a;-><init>(Lmj/a;Ljj/e;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v1, Lpj/q$b;

    iget-object v2, p0, Lpj/q;->c:Ljj/e;

    invoke-direct {v1, p1, v2}, Lpj/q$b;-><init>(Lim/b;Ljj/e;)V

    :goto_0
    invoke-virtual {v0, v1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
