.class public final Lpj/r;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/r$b;,
        Lpj/r$c;,
        Lpj/r$a;
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
.field final c:Ldj/r;

.field final d:Z

.field final e:I


# direct methods
.method public constructor <init>(Ldj/f;Ldj/r;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ldj/r;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/r;->c:Ldj/r;

    iput-boolean p3, p0, Lpj/r;->d:Z

    iput p4, p0, Lpj/r;->e:I

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/r;->c:Ldj/r;

    invoke-virtual {v0}, Ldj/r;->a()Ldj/r$b;

    move-result-object v0

    instance-of v1, p1, Lmj/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lpj/a;->b:Ldj/f;

    new-instance v2, Lpj/r$b;

    check-cast p1, Lmj/a;

    iget-boolean v3, p0, Lpj/r;->d:Z

    iget v4, p0, Lpj/r;->e:I

    invoke-direct {v2, p1, v0, v3, v4}, Lpj/r$b;-><init>(Lmj/a;Ldj/r$b;ZI)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lpj/a;->b:Ldj/f;

    new-instance v2, Lpj/r$c;

    iget-boolean v3, p0, Lpj/r;->d:Z

    iget v4, p0, Lpj/r;->e:I

    invoke-direct {v2, p1, v0, v3, v4}, Lpj/r$c;-><init>(Lim/b;Ldj/r$b;ZI)V

    :goto_0
    invoke-virtual {v1, v2}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
