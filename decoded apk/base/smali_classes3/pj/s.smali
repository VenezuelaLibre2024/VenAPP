.class public final Lpj/s;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/s$a;
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
.field final c:I

.field final d:Z

.field final e:Z

.field final f:Ljj/a;


# direct methods
.method public constructor <init>(Ldj/f;IZZLjj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;IZZ",
            "Ljj/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput p2, p0, Lpj/s;->c:I

    iput-boolean p3, p0, Lpj/s;->d:Z

    iput-boolean p4, p0, Lpj/s;->e:Z

    iput-object p5, p0, Lpj/s;->f:Ljj/a;

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

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v7, Lpj/s$a;

    iget v3, p0, Lpj/s;->c:I

    iget-boolean v4, p0, Lpj/s;->d:Z

    iget-boolean v5, p0, Lpj/s;->e:Z

    iget-object v6, p0, Lpj/s;->f:Ljj/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lpj/s$a;-><init>(Lim/b;IZZLjj/a;)V

    invoke-virtual {v0, v7}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
