.class public abstract Landroidx/constraintlayout/widget/m;
.super Landroidx/constraintlayout/widget/c;
.source "SourceFile"


# instance fields
.field private u:Z

.field private v:Z


# virtual methods
.method protected i(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/c;->h(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method protected m(Landroid/util/AttributeSet;)V
    .locals 5

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/c;->m(Landroid/util/AttributeSet;)V

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroidx/constraintlayout/widget/k;->n1:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Landroidx/constraintlayout/widget/k;->p1:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_0

    iput-boolean v4, p0, Landroidx/constraintlayout/widget/m;->u:Z

    goto :goto_1

    :cond_0
    sget v3, Landroidx/constraintlayout/widget/k;->u1:I

    if-ne v2, v3, :cond_1

    iput-boolean v4, p0, Landroidx/constraintlayout/widget/m;->v:Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 6

    invoke-super {p0}, Landroidx/constraintlayout/widget/c;->onAttachedToWindow()V

    iget-boolean v0, p0, Landroidx/constraintlayout/widget/m;->u:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/constraintlayout/widget/m;->v:Z

    if-eqz v0, :cond_3

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v1, :cond_3

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v2

    const/4 v3, 0x0

    :goto_0
    iget v4, p0, Landroidx/constraintlayout/widget/c;->b:I

    if-ge v3, v4, :cond_3

    iget-object v4, p0, Landroidx/constraintlayout/widget/c;->a:[I

    aget v4, v4, v3

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-boolean v5, p0, Landroidx/constraintlayout/widget/m;->u:Z

    if-eqz v5, :cond_1

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-boolean v5, p0, Landroidx/constraintlayout/widget/m;->v:Z

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    cmpl-float v5, v2, v5

    if-lez v5, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getTranslationZ()F

    move-result v5

    add-float/2addr v5, v2

    invoke-virtual {v4, v5}, Landroid/view/View;->setTranslationZ(F)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/c;->g()V

    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/c;->g()V

    return-void
.end method

.method public t(Ln0/k;II)V
    .locals 0

    return-void
.end method
