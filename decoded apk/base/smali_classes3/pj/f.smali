.class public final Lpj/f;
.super Ldj/j;
.source "SourceFile"

# interfaces
.implements Lmj/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
        "TT;>;",
        "Lmj/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:J


# direct methods
.method public constructor <init>(Ldj/f;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lpj/f;->a:Ldj/f;

    iput-wide p2, p0, Lpj/f;->b:J

    return-void
.end method


# virtual methods
.method public d()Ldj/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lpj/e;

    iget-object v1, p0, Lpj/f;->a:Ldj/f;

    iget-wide v2, p0, Lpj/f;->b:J

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lpj/e;-><init>(Ldj/f;JLjava/lang/Object;Z)V

    invoke-static {v6}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method protected u(Ldj/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/f;->a:Ldj/f;

    new-instance v1, Lpj/f$a;

    iget-wide v2, p0, Lpj/f;->b:J

    invoke-direct {v1, p1, v2, v3}, Lpj/f$a;-><init>(Ldj/l;J)V

    invoke-virtual {v0, v1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
