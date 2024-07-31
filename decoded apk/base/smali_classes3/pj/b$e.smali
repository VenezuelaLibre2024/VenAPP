.class final Lpj/b$e;
.super Lwj/f;
.source "SourceFile"

# interfaces
.implements Ldj/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lwj/f;",
        "Ldj/i<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc75368d015d6d3dL


# instance fields
.field final s:Lpj/b$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpj/b$f<",
            "TR;>;"
        }
    .end annotation
.end field

.field t:J


# direct methods
.method constructor <init>(Lpj/b$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj/b$f<",
            "TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lwj/f;-><init>()V

    iput-object p1, p0, Lpj/b$e;->s:Lpj/b$f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-wide v0, p0, Lpj/b$e;->t:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lpj/b$e;->t:J

    invoke-virtual {p0, v0, v1}, Lwj/f;->h(J)V

    :cond_0
    iget-object v0, p0, Lpj/b$e;->s:Lpj/b$f;

    invoke-interface {v0}, Lpj/b$f;->b()V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-wide v0, p0, Lpj/b$e;->t:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lpj/b$e;->t:J

    iget-object v0, p0, Lpj/b$e;->s:Lpj/b$f;

    invoke-interface {v0, p1}, Lpj/b$f;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Lim/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwj/f;->j(Lim/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-wide v0, p0, Lpj/b$e;->t:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lpj/b$e;->t:J

    invoke-virtual {p0, v0, v1}, Lwj/f;->h(J)V

    :cond_0
    iget-object v0, p0, Lpj/b$e;->s:Lpj/b$f;

    invoke-interface {v0, p1}, Lpj/b$f;->e(Ljava/lang/Throwable;)V

    return-void
.end method
