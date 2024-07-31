.class public final Lom/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lom/o$a;
    }
.end annotation


# instance fields
.field private final a:Lnm/m;

.field private final b:Lnm/p;

.field private c:Lnm/a;

.field private final d:Lom/l;

.field private e:Lom/j;

.field private f:Lpm/b;

.field private g:F

.field private h:F

.field private i:F

.field private j:Lnm/s;

.field private k:Lnm/r;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:I

.field private final p:Lom/c;


# direct methods
.method public constructor <init>(Lnm/m;Lnm/p;Lnm/a;Lom/l;)V
    .locals 1

    const-string v0, "ref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "soundPoolManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/o;->a:Lnm/m;

    iput-object p2, p0, Lom/o;->b:Lnm/p;

    iput-object p3, p0, Lom/o;->c:Lnm/a;

    iput-object p4, p0, Lom/o;->d:Lom/l;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lom/o;->g:F

    iput p1, p0, Lom/o;->i:F

    sget-object p1, Lnm/s;->RELEASE:Lnm/s;

    iput-object p1, p0, Lom/o;->j:Lnm/s;

    sget-object p1, Lnm/r;->MEDIA_PLAYER:Lnm/r;

    iput-object p1, p0, Lom/o;->k:Lnm/r;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lom/o;->l:Z

    const/4 p1, -0x1

    iput p1, p0, Lom/o;->o:I

    new-instance p1, Lom/c;

    invoke-direct {p1, p0}, Lom/c;-><init>(Lom/o;)V

    iput-object p1, p0, Lom/o;->p:Lom/c;

    return-void
.end method

.method private final M(Lom/j;FF)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    mul-float/2addr v1, p2

    add-float/2addr p3, v0

    invoke-static {v0, p3}, Ljava/lang/Math;->min(FF)F

    move-result p3

    mul-float/2addr p3, p2

    invoke-interface {p1, v1, p3}, Lom/j;->j(FF)V

    return-void
.end method

.method public static final synthetic a(Lom/o;)V
    .locals 0

    invoke-direct {p0}, Lom/o;->b()V

    return-void
.end method

.method private final b()V
    .locals 2

    iget-boolean v0, p0, Lom/o;->n:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lom/o;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lom/o;->e:Lom/j;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lom/o;->n:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lom/o;->s()V

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lom/o;->m:Z

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lom/j;->start()V

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0}, Lnm/m;->C()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final c(Lom/j;)V
    .locals 2

    iget v0, p0, Lom/o;->g:F

    iget v1, p0, Lom/o;->h:F

    invoke-direct {p0, p1, v0, v1}, Lom/o;->M(Lom/j;FF)V

    invoke-virtual {p0}, Lom/o;->u()Z

    move-result v0

    invoke-interface {p1, v0}, Lom/j;->h(Z)V

    invoke-interface {p1}, Lom/j;->a()V

    return-void
.end method

.method private final d()Lom/j;
    .locals 2

    iget-object v0, p0, Lom/o;->k:Lnm/r;

    sget-object v1, Lom/o$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Lom/m;

    iget-object v1, p0, Lom/o;->d:Lom/l;

    invoke-direct {v0, p0, v1}, Lom/m;-><init>(Lom/o;Lom/l;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lck/l;

    invoke-direct {v0}, Lck/l;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Lom/i;

    invoke-direct {v0, p0}, Lom/i;-><init>(Lom/o;)V

    :goto_0
    return-object v0
.end method

.method private final l()Lom/j;
    .locals 3

    iget-object v0, p0, Lom/o;->e:Lom/j;

    iget-boolean v1, p0, Lom/o;->l:Z

    const/4 v2, 0x0

    if-nez v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lom/o;->m:Z

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lom/j;->reset()V

    invoke-virtual {p0, v2}, Lom/o;->H(Z)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-direct {p0}, Lom/o;->d()Lom/j;

    move-result-object v0

    iput-object v0, p0, Lom/o;->e:Lom/j;

    iput-boolean v2, p0, Lom/o;->l:Z

    :cond_2
    :goto_1
    return-object v0
.end method

.method private final s()V
    .locals 2

    invoke-direct {p0}, Lom/o;->d()Lom/j;

    move-result-object v0

    iput-object v0, p0, Lom/o;->e:Lom/j;

    iget-object v1, p0, Lom/o;->f:Lpm/b;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Lom/j;->g(Lpm/b;)V

    invoke-direct {p0, v0}, Lom/o;->c(Lom/j;)V

    :cond_0
    return-void
.end method

.method private final v()I
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lck/n;->b:Lck/n$a;

    iget-object v1, p0, Lom/o;->e:Lom/j;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lom/j;->e()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v0

    :goto_3
    invoke-static {v1}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v1

    sget-object v2, Lck/n;->b:Lck/n$a;

    invoke-static {v1}, Lck/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_4
    invoke-static {v1}, Lck/n;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_5

    :cond_4
    move-object v0, v1

    :goto_5
    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_6

    :cond_5
    const/4 v0, -0x1

    :goto_6
    return v0
.end method


# virtual methods
.method public final A()V
    .locals 1

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0, p0}, Lnm/m;->H(Lom/o;)V

    return-void
.end method

.method public final B()V
    .locals 1

    iget-boolean v0, p0, Lom/o;->n:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lom/o;->n:Z

    iget-boolean v0, p0, Lom/o;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lom/j;->pause()V

    :cond_0
    return-void
.end method

.method public final C()V
    .locals 2

    iget-object v0, p0, Lom/o;->p:Lom/c;

    new-instance v1, Lom/o$b;

    invoke-direct {v1, p0}, Lom/o$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lom/c;->g(Lok/a;)V

    return-void
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, Lom/o;->p:Lom/c;

    invoke-virtual {v0}, Lom/c;->f()V

    iget-boolean v0, p0, Lom/o;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lom/o;->n:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lom/j;->stop()V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lom/o;->K(Lpm/b;)V

    iput-object v0, p0, Lom/o;->e:Lom/j;

    return-void
.end method

.method public final E(I)V
    .locals 3

    iget-boolean v0, p0, Lom/o;->m:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lom/o;->e:Lom/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lom/j;->k()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    if-nez v1, :cond_2

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lom/j;->seekTo(I)V

    :cond_1
    const/4 p1, -0x1

    :cond_2
    iput p1, p0, Lom/o;->o:I

    return-void
.end method

.method public final F(F)V
    .locals 2

    iget v0, p0, Lom/o;->h:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iput p1, p0, Lom/o;->h:F

    iget-boolean v0, p0, Lom/o;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_1

    iget v1, p0, Lom/o;->g:F

    invoke-direct {p0, v0, v1, p1}, Lom/o;->M(Lom/j;FF)V

    :cond_1
    return-void
.end method

.method public final G(Lnm/r;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lom/o;->k:Lnm/r;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lom/o;->k:Lnm/r;

    iget-object p1, p0, Lom/o;->e:Lom/j;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lom/o;->v()I

    move-result v0

    iput v0, p0, Lom/o;->o:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lom/o;->H(Z)V

    invoke-interface {p1}, Lom/j;->release()V

    :cond_0
    invoke-direct {p0}, Lom/o;->s()V

    :cond_1
    return-void
.end method

.method public final H(Z)V
    .locals 1

    iget-boolean v0, p0, Lom/o;->m:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lom/o;->m:Z

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0, p0, p1}, Lnm/m;->F(Lom/o;Z)V

    :cond_0
    return-void
.end method

.method public final I(F)V
    .locals 1

    iget v0, p0, Lom/o;->i:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iput p1, p0, Lom/o;->i:F

    iget-boolean v0, p0, Lom/o;->n:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lom/j;->l(F)V

    :cond_1
    return-void
.end method

.method public final J(Lnm/s;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lom/o;->j:Lnm/s;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lom/o;->j:Lnm/s;

    iget-boolean p1, p0, Lom/o;->l:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lom/o;->e:Lom/j;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lom/o;->u()Z

    move-result v0

    invoke-interface {p1, v0}, Lom/j;->h(Z)V

    :cond_0
    return-void
.end method

.method public final K(Lpm/b;)V
    .locals 2

    iget-object v0, p0, Lom/o;->f:Lpm/b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lom/o;->l()Lom/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lom/j;->g(Lpm/b;)V

    invoke-direct {p0, v0}, Lom/o;->c(Lom/j;)V

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lom/o;->l:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lom/o;->H(Z)V

    iput-boolean v0, p0, Lom/o;->n:Z

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lom/j;->release()V

    :cond_1
    :goto_0
    iput-object p1, p0, Lom/o;->f:Lpm/b;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {p1, p0, v1}, Lnm/m;->F(Lom/o;Z)V

    :goto_1
    return-void
.end method

.method public final L(F)V
    .locals 2

    iget v0, p0, Lom/o;->g:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iput p1, p0, Lom/o;->g:F

    iget-boolean v0, p0, Lom/o;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_1

    iget v1, p0, Lom/o;->h:F

    invoke-direct {p0, v0, p1, v1}, Lom/o;->M(Lom/j;FF)V

    :cond_1
    return-void
.end method

.method public final N()V
    .locals 3

    iget-object v0, p0, Lom/o;->p:Lom/c;

    invoke-virtual {v0}, Lom/c;->f()V

    iget-boolean v0, p0, Lom/o;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lom/o;->j:Lnm/s;

    sget-object v1, Lnm/s;->RELEASE:Lnm/s;

    if-eq v0, v1, :cond_4

    invoke-virtual {p0}, Lom/o;->B()V

    iget-boolean v0, p0, Lom/o;->m:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lom/o;->e:Lom/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lom/j;->k()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lom/j;->stop()V

    :cond_2
    invoke-virtual {p0, v1}, Lom/o;->H(Z)V

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lom/j;->a()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v1}, Lom/o;->E(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lom/o;->D()V

    :cond_5
    :goto_1
    return-void
.end method

.method public final O(Lnm/a;)V
    .locals 10

    const-string v0, "audioContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lom/o;->c:Lnm/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lom/o;->c:Lnm/a;

    invoke-virtual {v0}, Lnm/a;->d()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lnm/a;->d()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lom/o;->p:Lom/c;

    invoke-virtual {v0}, Lom/c;->f()V

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3f

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lnm/a;->c(Lnm/a;ZZIIIIILjava/lang/Object;)Lnm/a;

    move-result-object p1

    iput-object p1, p0, Lom/o;->c:Lnm/a;

    invoke-virtual {p0}, Lom/o;->g()Landroid/media/AudioManager;

    move-result-object p1

    iget-object v0, p0, Lom/o;->c:Lnm/a;

    invoke-virtual {v0}, Lnm/a;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->setMode(I)V

    invoke-virtual {p0}, Lom/o;->g()Landroid/media/AudioManager;

    move-result-object p1

    iget-object v0, p0, Lom/o;->c:Lnm/a;

    invoke-virtual {v0}, Lnm/a;->g()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    iget-object p1, p0, Lom/o;->e:Lom/j;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lom/j;->stop()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lom/o;->H(Z)V

    iget-object v0, p0, Lom/o;->c:Lnm/a;

    invoke-interface {p1, v0}, Lom/j;->f(Lnm/a;)V

    iget-object v0, p0, Lom/o;->f:Lpm/b;

    if-eqz v0, :cond_2

    invoke-interface {p1, v0}, Lom/j;->g(Lpm/b;)V

    invoke-direct {p0, p1}, Lom/o;->c(Lom/j;)V

    :cond_2
    return-void
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Lom/o;->D()V

    iget-object v0, p0, Lom/o;->b:Lnm/p;

    invoke-virtual {v0}, Lnm/p;->a()V

    return-void
.end method

.method public final f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0}, Lnm/m;->o()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final g()Landroid/media/AudioManager;
    .locals 1

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0}, Lnm/m;->p()Landroid/media/AudioManager;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lnm/a;
    .locals 1

    iget-object v0, p0, Lom/o;->c:Lnm/a;

    return-object v0
.end method

.method public final i()Ljava/lang/Integer;
    .locals 2

    iget-boolean v0, p0, Lom/o;->m:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lom/j;->e()Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final j()Ljava/lang/Integer;
    .locals 2

    iget-boolean v0, p0, Lom/o;->m:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lom/j;->getDuration()Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final k()Lnm/p;
    .locals 1

    iget-object v0, p0, Lom/o;->b:Lnm/p;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lom/o;->n:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lom/o;->m:Z

    return v0
.end method

.method public final o()F
    .locals 1

    iget v0, p0, Lom/o;->i:F

    return v0
.end method

.method public final p()F
    .locals 1

    iget v0, p0, Lom/o;->g:F

    return v0
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0, p0, p1, p2, p3}, Lnm/m;->w(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0, p0, p1}, Lnm/m;->D(Lom/o;Ljava/lang/String;)V

    return-void
.end method

.method public final t()Z
    .locals 3

    iget-boolean v0, p0, Lom/o;->n:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lom/o;->m:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lom/o;->e:Lom/j;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lom/j;->i()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method public final u()Z
    .locals 2

    iget-object v0, p0, Lom/o;->j:Lnm/s;

    sget-object v1, Lnm/s;->LOOP:Lnm/s;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w(I)V
    .locals 0

    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Lom/o;->j:Lnm/s;

    sget-object v1, Lnm/s;->LOOP:Lnm/s;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lom/o;->N()V

    :cond_0
    iget-object v0, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v0, p0}, Lnm/m;->s(Lom/o;)V

    return-void
.end method

.method public final y(II)Z
    .locals 4

    const/16 v0, 0x64

    const/16 v1, 0x7d

    if-ne p1, v0, :cond_0

    const-string p1, "MEDIA_ERROR_SERVER_DIED"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MEDIA_ERROR_UNKNOWN {what:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/high16 v0, -0x80000000

    const-string v2, "MEDIA_ERROR_SYSTEM"

    if-eq p2, v0, :cond_5

    const/16 v0, -0x3f2

    if-eq p2, v0, :cond_4

    const/16 v0, -0x3ef

    if-eq p2, v0, :cond_3

    const/16 v0, -0x3ec

    if-eq p2, v0, :cond_2

    const/16 v0, -0x6e

    if-eq p2, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MEDIA_ERROR_UNKNOWN {extra:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    const-string p2, "MEDIA_ERROR_TIMED_OUT"

    goto :goto_1

    :cond_2
    const-string p2, "MEDIA_ERROR_IO"

    goto :goto_1

    :cond_3
    const-string p2, "MEDIA_ERROR_MALFORMED"

    goto :goto_1

    :cond_4
    const-string p2, "MEDIA_ERROR_UNSUPPORTED"

    goto :goto_1

    :cond_5
    move-object p2, v2

    :goto_1
    iget-boolean v0, p0, Lom/o;->m:Z

    const-string v1, "AndroidAudioError"

    const/4 v3, 0x0

    if-nez v0, :cond_6

    invoke-static {p2, v2}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md"

    invoke-virtual {p0, v1, p2, p1}, Lom/o;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0, v3}, Lom/o;->H(Z)V

    invoke-virtual {p0, v1, p1, p2}, Lom/o;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return v3
.end method

.method public final z()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lom/o;->H(Z)V

    iget-object v1, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v1, p0}, Lnm/m;->u(Lom/o;)V

    iget-boolean v1, p0, Lom/o;->n:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lom/o;->e:Lom/j;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lom/j;->start()V

    :cond_0
    iget-object v1, p0, Lom/o;->a:Lnm/m;

    invoke-virtual {v1}, Lnm/m;->C()V

    :cond_1
    iget v1, p0, Lom/o;->o:I

    if-ltz v1, :cond_3

    iget-object v1, p0, Lom/o;->e:Lom/j;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lom/j;->k()Z

    move-result v1

    if-ne v1, v0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    if-nez v0, :cond_3

    iget-object v0, p0, Lom/o;->e:Lom/j;

    if-eqz v0, :cond_3

    iget v1, p0, Lom/o;->o:I

    invoke-interface {v0, v1}, Lom/j;->seekTo(I)V

    :cond_3
    return-void
.end method
