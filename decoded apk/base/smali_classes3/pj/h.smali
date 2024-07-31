.class public final Lpj/h;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/h$a;,
        Lpj/h$b;
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
.field final c:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/f;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/h;->c:Ljj/g;

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

    instance-of v0, p1, Lmj/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v1, Lpj/h$a;

    check-cast p1, Lmj/a;

    iget-object v2, p0, Lpj/h;->c:Ljj/g;

    invoke-direct {v1, p1, v2}, Lpj/h$a;-><init>(Lmj/a;Ljj/g;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v1, Lpj/h$b;

    iget-object v2, p0, Lpj/h;->c:Ljj/g;

    invoke-direct {v1, p1, v2}, Lpj/h$b;-><init>(Lim/b;Ljj/g;)V

    :goto_0
    invoke-virtual {v0, v1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
