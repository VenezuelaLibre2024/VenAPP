.class public final Lpj/d;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/d$a;,
        Lpj/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final c:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final d:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljj/a;

.field final f:Ljj/a;


# direct methods
.method public constructor <init>(Ldj/f;Ljj/d;Ljj/d;Ljj/a;Ljj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/d<",
            "-TT;>;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljj/a;",
            "Ljj/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/d;->c:Ljj/d;

    iput-object p3, p0, Lpj/d;->d:Ljj/d;

    iput-object p4, p0, Lpj/d;->e:Ljj/a;

    iput-object p5, p0, Lpj/d;->f:Ljj/a;

    return-void
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lmj/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v7, Lpj/d$a;

    move-object v2, p1

    check-cast v2, Lmj/a;

    iget-object v3, p0, Lpj/d;->c:Ljj/d;

    iget-object v4, p0, Lpj/d;->d:Ljj/d;

    iget-object v5, p0, Lpj/d;->e:Ljj/a;

    iget-object v6, p0, Lpj/d;->f:Ljj/a;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lpj/d$a;-><init>(Lmj/a;Ljj/d;Ljj/d;Ljj/a;Ljj/a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v7, Lpj/d$b;

    iget-object v3, p0, Lpj/d;->c:Ljj/d;

    iget-object v4, p0, Lpj/d;->d:Ljj/d;

    iget-object v5, p0, Lpj/d;->e:Ljj/a;

    iget-object v6, p0, Lpj/d;->f:Ljj/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lpj/d$b;-><init>(Lim/b;Ljj/d;Ljj/d;Ljj/a;Ljj/a;)V

    :goto_0
    invoke-virtual {v0, v7}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
