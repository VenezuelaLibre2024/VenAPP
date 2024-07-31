.class public final Lpj/t;
.super Lpj/a;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/t$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/a<",
        "TT;TT;>;",
        "Ljj/d<",
        "TT;>;"
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


# direct methods
.method public constructor <init>(Ldj/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p0, p0, Lpj/t;->c:Ljj/d;

    return-void
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v1, Lpj/t$a;

    iget-object v2, p0, Lpj/t;->c:Ljj/d;

    invoke-direct {v1, p1, v2}, Lpj/t$a;-><init>(Lim/b;Ljj/d;)V

    invoke-virtual {v0, v1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method
