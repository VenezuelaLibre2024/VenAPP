.class Lo0/j;
.super Lo0/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ln0/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lo0/p;-><init>(Ln0/e;)V

    iget-object v0, p1, Ln0/e;->e:Lo0/l;

    invoke-virtual {v0}, Lo0/l;->f()V

    iget-object v0, p1, Ln0/e;->f:Lo0/n;

    invoke-virtual {v0}, Lo0/n;->f()V

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->p1()I

    move-result p1

    iput p1, p0, Lo0/p;->f:I

    return-void
.end method

.method private q(Lo0/f;)V
    .locals 1

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lo0/f;->l:Ljava/util/List;

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Lo0/d;)V
    .locals 1

    iget-object p1, p0, Lo0/p;->h:Lo0/f;

    iget-boolean v0, p1, Lo0/f;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lo0/f;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Lo0/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0/f;

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    check-cast v0, Ln0/g;

    iget p1, p1, Lo0/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Ln0/g;->s1()F

    move-result v0

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    invoke-virtual {v0, p1}, Lo0/f;->d(I)V

    return-void
.end method

.method d()V
    .locals 5

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    check-cast v0, Ln0/g;

    invoke-virtual {v0}, Ln0/g;->q1()I

    move-result v1

    invoke-virtual {v0}, Ln0/g;->r1()I

    move-result v2

    invoke-virtual {v0}, Ln0/g;->s1()F

    invoke-virtual {v0}, Ln0/g;->p1()I

    move-result v0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    if-eq v1, v3, :cond_0

    iget-object v0, v0, Lo0/f;->l:Ljava/util/List;

    iget-object v2, p0, Lo0/p;->b:Ln0/e;

    iget-object v2, v2, Ln0/e;->a0:Ln0/e;

    iget-object v2, v2, Ln0/e;->e:Lo0/l;

    iget-object v2, v2, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->a0:Ln0/e;

    iget-object v0, v0, Ln0/e;->e:Lo0/l;

    iget-object v0, v0, Lo0/p;->h:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    iget-object v2, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    :goto_0
    iput v1, v0, Lo0/f;->f:I

    goto :goto_1

    :cond_0
    if-eq v2, v3, :cond_1

    iget-object v0, v0, Lo0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->b:Ln0/e;

    iget-object v1, v1, Ln0/e;->a0:Ln0/e;

    iget-object v1, v1, Ln0/e;->e:Lo0/l;

    iget-object v1, v1, Lo0/p;->i:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->a0:Ln0/e;

    iget-object v0, v0, Ln0/e;->e:Lo0/l;

    iget-object v0, v0, Lo0/p;->i:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    neg-int v1, v2

    goto :goto_0

    :cond_1
    iput-boolean v4, v0, Lo0/f;->b:Z

    iget-object v0, v0, Lo0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->b:Ln0/e;

    iget-object v1, v1, Ln0/e;->a0:Ln0/e;

    iget-object v1, v1, Ln0/e;->e:Lo0/l;

    iget-object v1, v1, Lo0/p;->i:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->a0:Ln0/e;

    iget-object v0, v0, Ln0/e;->e:Lo0/l;

    iget-object v0, v0, Lo0/p;->i:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->e:Lo0/l;

    iget-object v0, v0, Lo0/p;->h:Lo0/f;

    invoke-direct {p0, v0}, Lo0/j;->q(Lo0/f;)V

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->e:Lo0/l;

    goto :goto_4

    :cond_2
    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    if-eq v1, v3, :cond_3

    iget-object v0, v0, Lo0/f;->l:Ljava/util/List;

    iget-object v2, p0, Lo0/p;->b:Ln0/e;

    iget-object v2, v2, Ln0/e;->a0:Ln0/e;

    iget-object v2, v2, Ln0/e;->f:Lo0/n;

    iget-object v2, v2, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->a0:Ln0/e;

    iget-object v0, v0, Ln0/e;->f:Lo0/n;

    iget-object v0, v0, Lo0/p;->h:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    iget-object v2, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    :goto_2
    iput v1, v0, Lo0/f;->f:I

    goto :goto_3

    :cond_3
    if-eq v2, v3, :cond_4

    iget-object v0, v0, Lo0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->b:Ln0/e;

    iget-object v1, v1, Ln0/e;->a0:Ln0/e;

    iget-object v1, v1, Ln0/e;->f:Lo0/n;

    iget-object v1, v1, Lo0/p;->i:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->a0:Ln0/e;

    iget-object v0, v0, Ln0/e;->f:Lo0/n;

    iget-object v0, v0, Lo0/p;->i:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    neg-int v1, v2

    goto :goto_2

    :cond_4
    iput-boolean v4, v0, Lo0/f;->b:Z

    iget-object v0, v0, Lo0/f;->l:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->b:Ln0/e;

    iget-object v1, v1, Ln0/e;->a0:Ln0/e;

    iget-object v1, v1, Ln0/e;->f:Lo0/n;

    iget-object v1, v1, Lo0/p;->i:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->a0:Ln0/e;

    iget-object v0, v0, Ln0/e;->f:Lo0/n;

    iget-object v0, v0, Lo0/p;->i:Lo0/f;

    iget-object v0, v0, Lo0/f;->k:Ljava/util/List;

    iget-object v1, p0, Lo0/p;->h:Lo0/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->f:Lo0/n;

    iget-object v0, v0, Lo0/p;->h:Lo0/f;

    invoke-direct {p0, v0}, Lo0/j;->q(Lo0/f;)V

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v0, v0, Ln0/e;->f:Lo0/n;

    :goto_4
    iget-object v0, v0, Lo0/p;->i:Lo0/f;

    invoke-direct {p0, v0}, Lo0/j;->q(Lo0/f;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    check-cast v0, Ln0/g;

    invoke-virtual {v0}, Ln0/g;->p1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v1, p0, Lo0/p;->h:Lo0/f;

    iget v1, v1, Lo0/f;->g:I

    invoke-virtual {v0, v1}, Ln0/e;->j1(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo0/p;->b:Ln0/e;

    iget-object v1, p0, Lo0/p;->h:Lo0/f;

    iget v1, v1, Lo0/f;->g:I

    invoke-virtual {v0, v1}, Ln0/e;->k1(I)V

    :goto_0
    return-void
.end method

.method f()V
    .locals 1

    iget-object v0, p0, Lo0/p;->h:Lo0/f;

    invoke-virtual {v0}, Lo0/f;->c()V

    return-void
.end method

.method m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
