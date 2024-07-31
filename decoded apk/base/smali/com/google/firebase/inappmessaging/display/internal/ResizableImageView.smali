.class public Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;
    }
.end annotation


# instance fields
.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->e(Landroid/content/Context;)V

    return-void
.end method

.method private c(II)Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;
    .locals 4

    invoke-virtual {p0}, Landroid/widget/ImageView;->getMaxWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getMaxHeight()I

    move-result v1

    if-le p1, v0, :cond_0

    const-string v2, "Image: capping width"

    int-to-float v3, v0

    invoke-static {v2, v3}, Lud/m;->c(Ljava/lang/String;F)V

    mul-int/2addr p2, v0

    div-int/2addr p2, p1

    move p1, v0

    :cond_0
    if-le p2, v1, :cond_1

    const-string v0, "Image: capping height"

    int-to-float v2, v1

    invoke-static {v0, v2}, Lud/m;->c(Ljava/lang/String;F)V

    mul-int/2addr p1, v1

    div-int/2addr p1, p2

    goto :goto_0

    :cond_1
    move v1, p2

    :goto_0
    new-instance p2, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v1, v0}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;-><init>(IILcom/google/firebase/inappmessaging/display/internal/ResizableImageView$a;)V

    return-object p2
.end method

.method private d()V
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v4, v0

    int-to-float v5, v1

    const-string v6, "Image: min width, height"

    invoke-static {v6, v4, v5}, Lud/m;->d(Ljava/lang/String;FF)V

    int-to-float v6, v2

    int-to-float v7, v3

    const-string v8, "Image: actual width, height"

    invoke-static {v8, v6, v7}, Lud/m;->d(Ljava/lang/String;FF)V

    const/high16 v8, 0x3f800000    # 1.0f

    if-ge v2, v0, :cond_0

    div-float/2addr v4, v6

    goto :goto_0

    :cond_0
    move v4, v8

    :goto_0
    if-ge v3, v1, :cond_1

    div-float v8, v5, v7

    :cond_1
    cmpl-float v0, v4, v8

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    move v4, v8

    :goto_1
    float-to-double v0, v4

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v8

    if-lez v0, :cond_3

    mul-float/2addr v6, v4

    float-to-double v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    mul-float/2addr v7, v4

    float-to-double v4, v7

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v1, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Measured dimension ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") too small.  Resizing to "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lud/m;->a(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->c(II)Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;

    move-result-object v0

    iget v1, v0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;->a:I

    iget v0, v0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;->b:I

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    :cond_3
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x43200000    # 160.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d:I

    return-void
.end method

.method private f(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    int-to-float v1, v0

    int-to-float v2, p1

    const-string v3, "Image: intrinsic width, height"

    invoke-static {v3, v1, v2}, Lud/m;->d(Ljava/lang/String;FF)V

    iget v1, p0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d:I

    mul-int/2addr v0, v1

    div-int/lit16 v0, v0, 0xa0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d:I

    mul-int/2addr p1, v1

    div-int/lit16 p1, p1, 0xa0

    int-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int p1, v1

    invoke-direct {p0, v0, p1}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->c(II)Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;

    move-result-object p1

    iget v0, p1, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;->a:I

    int-to-float v0, v0

    iget v1, p1, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;->b:I

    int-to-float v1, v1

    const-string v2, "Image: new target dimensions"

    invoke-static {v2, v0, v1}, Lud/m;->d(Ljava/lang/String;FF)V

    iget v0, p1, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;->a:I

    iget p1, p1, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView$b;->b:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getAdjustViewBounds()Z

    move-result p2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->f(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d()V

    :cond_0
    return-void
.end method
