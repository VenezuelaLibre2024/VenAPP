.class public abstract Lg8/o;
.super Lw6/h;
.source "SourceFile"

# interfaces
.implements Lg8/i;


# instance fields
.field private d:Lg8/i;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw6/h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 3

    iget-object v0, p0, Lg8/o;->d:Lg8/i;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/i;

    iget-wide v1, p0, Lg8/o;->e:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lg8/i;->b(J)I

    move-result p1

    return p1
.end method

.method public h(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg8/o;->d:Lg8/i;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/i;

    iget-wide v1, p0, Lg8/o;->e:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lg8/i;->h(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public i(I)J
    .locals 4

    iget-object v0, p0, Lg8/o;->d:Lg8/i;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/i;

    invoke-interface {v0, p1}, Lg8/i;->i(I)J

    move-result-wide v0

    iget-wide v2, p0, Lg8/o;->e:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lg8/o;->d:Lg8/i;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/i;

    invoke-interface {v0}, Lg8/i;->l()I

    move-result v0

    return v0
.end method

.method public n()V
    .locals 1

    invoke-super {p0}, Lw6/a;->n()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/o;->d:Lg8/i;

    return-void
.end method

.method public y(JLg8/i;J)V
    .locals 2

    iput-wide p1, p0, Lw6/h;->b:J

    iput-object p3, p0, Lg8/o;->d:Lg8/i;

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p3, p4, v0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p4

    :goto_0
    iput-wide p1, p0, Lg8/o;->e:J

    return-void
.end method
