.class public Lyd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyd/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyd/c;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lyd/c;->b:I

    iput v0, p0, Lyd/c;->c:I

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Z)V
    .locals 1

    new-instance v0, Lyd/d;

    invoke-direct {v0, p1, p2}, Lyd/d;-><init>(Landroid/view/View;Z)V

    iget p1, p0, Lyd/c;->b:I

    iget p2, p0, Lyd/c;->c:I

    invoke-virtual {v0, p1, p2}, Lyd/d;->f(II)V

    iget-object p1, p0, Lyd/c;->a:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(I)V
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lyd/c;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyd/d;

    invoke-virtual {v2}, Lyd/d;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Lyd/c$a;

    invoke-direct {v1, p0}, Lyd/c$a;-><init>(Lyd/c;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyd/d;

    invoke-virtual {v3}, Lyd/d;->a()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x6

    if-ge v1, v3, :cond_6

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    const v3, 0x3e4ccccd    # 0.2f

    mul-float/2addr v1, v3

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v4, v1

    const-string v1, "VVGM (minFrac, maxFrac)"

    invoke-static {v1, v3, v4}, Lud/m;->d(Ljava/lang/String;FF)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyd/d;

    invoke-virtual {v5}, Lyd/d;->a()I

    move-result v6

    int-to-float v6, v6

    int-to-float v7, v2

    div-float/2addr v6, v7

    cmpl-float v7, v6, v4

    if-lez v7, :cond_3

    sub-float v7, v6, v4

    add-float/2addr v1, v7

    move v7, v4

    goto :goto_3

    :cond_3
    move v7, v6

    :goto_3
    cmpg-float v8, v6, v3

    if-gez v8, :cond_4

    sub-float v7, v3, v6

    invoke-static {v7, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    add-float v8, v6, v7

    sub-float/2addr v1, v7

    move v7, v8

    :cond_4
    const-string v8, "\t(desired, granted)"

    invoke-static {v8, v6, v7}, Lud/m;->d(Ljava/lang/String;FF)V

    int-to-float v6, p1

    mul-float/2addr v7, v6

    float-to-int v6, v7

    iget v7, p0, Lyd/c;->b:I

    invoke-virtual {v5, v7, v6}, Lyd/d;->f(II)V

    goto :goto_2

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "VerticalViewGroupMeasure only supports up to 5 children"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()I
    .locals 4

    iget-object v0, p0, Lyd/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyd/d;

    invoke-virtual {v2}, Lyd/d;->d()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lyd/d;->a()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public d()I
    .locals 3

    iget-object v0, p0, Lyd/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyd/d;

    invoke-virtual {v2}, Lyd/d;->a()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lyd/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyd/c;->a:Ljava/util/List;

    return-object v0
.end method

.method public f(II)V
    .locals 0

    iput p1, p0, Lyd/c;->b:I

    iput p2, p0, Lyd/c;->c:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lyd/c;->a:Ljava/util/List;

    return-void
.end method
