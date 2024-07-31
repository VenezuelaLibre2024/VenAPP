.class final Lv7/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lq8/r;

.field private final b:Lv7/d1;


# direct methods
.method public constructor <init>(Lq8/r;Lv7/d1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/i0$a;->a:Lq8/r;

    iput-object p2, p0, Lv7/i0$a;->b:Lv7/d1;

    return-void
.end method


# virtual methods
.method public a(I)Lt6/u1;
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1}, Lq8/u;->a(I)Lt6/u1;

    move-result-object p1

    return-object p1
.end method

.method public b(I)I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1}, Lq8/u;->b(I)I

    move-result p1

    return p1
.end method

.method public c(I)I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1}, Lq8/u;->c(I)I

    move-result p1

    return p1
.end method

.method public d()Lv7/d1;
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->b:Lv7/d1;

    return-object v0
.end method

.method public e(Lt6/u1;)I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1}, Lq8/u;->e(Lt6/u1;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv7/i0$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv7/i0$a;

    iget-object v1, p0, Lv7/i0$a;->a:Lq8/r;

    iget-object v3, p1, Lv7/i0$a;->a:Lq8/r;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv7/i0$a;->b:Lv7/d1;

    iget-object p1, p1, Lv7/i0$a;->b:Lv7/d1;

    invoke-virtual {v1, p1}, Lv7/d1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->f()V

    return-void
.end method

.method public g(JJJLjava/util/List;[Lx7/o;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;[",
            "Lx7/o;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Lv7/i0$a;->a:Lq8/r;

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-interface/range {v1 .. v9}, Lq8/r;->g(JJJLjava/util/List;[Lx7/o;)V

    return-void
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->h()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lv7/i0$a;->b:Lv7/d1;

    invoke-virtual {v0}, Lv7/d1;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public i(IJ)Z
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1, p2, p3}, Lq8/r;->i(IJ)Z

    move-result p1

    return p1
.end method

.method public j(IJ)Z
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1, p2, p3}, Lq8/r;->j(IJ)Z

    move-result p1

    return p1
.end method

.method public k(JLx7/f;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lx7/f;",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1, p2, p3, p4}, Lq8/r;->k(JLx7/f;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public l(F)V
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1}, Lq8/r;->l(F)V

    return-void
.end method

.method public length()I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/u;->length()I

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->m()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->n()V

    return-void
.end method

.method public o(Z)V
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1}, Lq8/r;->o(Z)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->p()V

    return-void
.end method

.method public q(JLjava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0, p1, p2, p3}, Lq8/r;->q(JLjava/util/List;)I

    move-result p1

    return p1
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->r()I

    move-result v0

    return v0
.end method

.method public s()Lt6/u1;
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->s()Lt6/u1;

    move-result-object v0

    return-object v0
.end method

.method public t()I
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->t()I

    move-result v0

    return v0
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, Lv7/i0$a;->a:Lq8/r;

    invoke-interface {v0}, Lq8/r;->u()V

    return-void
.end method
