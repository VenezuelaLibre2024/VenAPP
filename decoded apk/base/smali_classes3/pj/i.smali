.class public final Lpj/i;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/i$a;,
        Lpj/i$b;
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
            "-TT;+",
            "Lim/a<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field final d:Z

.field final e:I

.field final f:I


# direct methods
.method public constructor <init>(Ldj/f;Ljj/e;ZII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/i;->c:Ljj/e;

    iput-boolean p3, p0, Lpj/i;->d:Z

    iput p4, p0, Lpj/i;->e:I

    iput p5, p0, Lpj/i;->f:I

    return-void
.end method

.method public static K(Lim/b;Ljj/e;ZII)Ldj/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lim/b<",
            "-TU;>;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TU;>;>;ZII)",
            "Ldj/i<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lpj/i$b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lpj/i$b;-><init>(Lim/b;Ljj/e;ZII)V

    return-object v6
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TU;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    iget-object v1, p0, Lpj/i;->c:Ljj/e;

    invoke-static {v0, p1, v1}, Lpj/x;->b(Lim/a;Lim/b;Ljj/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    iget-object v1, p0, Lpj/i;->c:Ljj/e;

    iget-boolean v2, p0, Lpj/i;->d:Z

    iget v3, p0, Lpj/i;->e:I

    iget v4, p0, Lpj/i;->f:I

    invoke-static {p1, v1, v2, v3, v4}, Lpj/i;->K(Lim/b;Ljj/e;ZII)Ldj/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
