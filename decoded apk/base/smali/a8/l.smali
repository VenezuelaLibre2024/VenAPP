.class final La8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# instance fields
.field private final a:I

.field private final b:La8/p;

.field private c:I


# direct methods
.method public constructor <init>(La8/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/l;->b:La8/p;

    iput p2, p0, La8/l;->a:I

    const/4 p1, -0x1

    iput p1, p0, La8/l;->c:I

    return-void
.end method

.method private c()Z
    .locals 2

    iget v0, p0, La8/l;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget v0, p0, La8/l;->c:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La8/l;->b:La8/p;

    invoke-virtual {v0}, La8/p;->T()V

    goto :goto_0

    :cond_0
    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    iget-object v1, p0, La8/l;->b:La8/p;

    invoke-virtual {v1, v0}, La8/p;->U(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, La8/r;

    iget-object v1, p0, La8/l;->b:La8/p;

    invoke-virtual {v1}, La8/p;->r()Lv7/f1;

    move-result-object v1

    iget v2, p0, La8/l;->a:I

    invoke-virtual {v1, v2}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v1

    iget-object v1, v1, Lt6/u1;->w:Ljava/lang/String;

    invoke-direct {v0, v1}, La8/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 2

    iget v0, p0, La8/l;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iget-object v0, p0, La8/l;->b:La8/p;

    iget v1, p0, La8/l;->a:I

    invoke-virtual {v0, v1}, La8/p;->x(I)I

    move-result v0

    iput v0, p0, La8/l;->c:I

    return-void
.end method

.method public d()Z
    .locals 2

    iget v0, p0, La8/l;->c:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    invoke-direct {p0}, La8/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/l;->b:La8/p;

    iget v1, p0, La8/l;->c:I

    invoke-virtual {v0, v1}, La8/p;->P(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()V
    .locals 3

    iget v0, p0, La8/l;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, La8/l;->b:La8/p;

    iget v2, p0, La8/l;->a:I

    invoke-virtual {v0, v2}, La8/p;->o0(I)V

    iput v1, p0, La8/l;->c:I

    :cond_0
    return-void
.end method

.method public p(J)I
    .locals 2

    invoke-direct {p0}, La8/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/l;->b:La8/p;

    iget v1, p0, La8/l;->c:I

    invoke-virtual {v0, v1, p1, p2}, La8/p;->n0(IJ)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 2

    iget v0, p0, La8/l;->c:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Lw6/a;->m(I)V

    const/4 p1, -0x4

    return p1

    :cond_0
    invoke-direct {p0}, La8/l;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La8/l;->b:La8/p;

    iget v1, p0, La8/l;->c:I

    invoke-virtual {v0, v1, p1, p2, p3}, La8/p;->d0(ILt6/v1;Lw6/g;I)I

    move-result v1

    :cond_1
    return v1
.end method
