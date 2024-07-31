.class public Ll3/g;
.super Lc4/h;
.source "SourceFile"

# interfaces
.implements Ll3/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc4/h<",
        "Lh3/f;",
        "Lj3/v<",
        "*>;>;",
        "Ll3/h;"
    }
.end annotation


# instance fields
.field private e:Ll3/h$a;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc4/h;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lc4/h;->b()V

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    const/16 v0, 0xf

    if-ne p1, v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lc4/h;->h()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lc4/h;->m(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic c(Lh3/f;Lj3/v;)Lj3/v;
    .locals 0

    invoke-super {p0, p1, p2}, Lc4/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj3/v;

    return-object p1
.end method

.method public d(Ll3/h$a;)V
    .locals 0

    iput-object p1, p0, Ll3/g;->e:Ll3/h$a;

    return-void
.end method

.method public bridge synthetic e(Lh3/f;)Lj3/v;
    .locals 0

    invoke-super {p0, p1}, Lc4/h;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj3/v;

    return-object p1
.end method

.method protected bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj3/v;

    invoke-virtual {p0, p1}, Ll3/g;->n(Lj3/v;)I

    move-result p1

    return p1
.end method

.method protected bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh3/f;

    check-cast p2, Lj3/v;

    invoke-virtual {p0, p1, p2}, Ll3/g;->o(Lh3/f;Lj3/v;)V

    return-void
.end method

.method protected n(Lj3/v;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "*>;)I"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lc4/h;->i(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Lj3/v;->p()I

    move-result p1

    return p1
.end method

.method protected o(Lh3/f;Lj3/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/f;",
            "Lj3/v<",
            "*>;)V"
        }
    .end annotation

    iget-object p1, p0, Ll3/g;->e:Ll3/h$a;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Ll3/h$a;->a(Lj3/v;)V

    :cond_0
    return-void
.end method
