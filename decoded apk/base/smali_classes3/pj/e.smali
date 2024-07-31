.class public final Lpj/e;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/e$a;
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
.field final c:J

.field final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final e:Z


# direct methods
.method public constructor <init>(Ldj/f;JLjava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;JTT;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-wide p2, p0, Lpj/e;->c:J

    iput-object p4, p0, Lpj/e;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lpj/e;->e:Z

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

    new-instance v7, Lpj/e$a;

    iget-wide v3, p0, Lpj/e;->c:J

    iget-object v5, p0, Lpj/e;->d:Ljava/lang/Object;

    iget-boolean v6, p0, Lpj/e;->e:Z

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lpj/e$a;-><init>(Lim/b;JLjava/lang/Object;Z)V

    invoke-virtual {v0, v7}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
