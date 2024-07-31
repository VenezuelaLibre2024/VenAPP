.class Landroidx/swiperefreshlayout/widget/c$f;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/swiperefreshlayout/widget/c;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/c$f;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$f;->a:Landroidx/swiperefreshlayout/widget/c;

    iget-boolean v0, p2, Landroidx/swiperefreshlayout/widget/c;->mUsingCustomStart:Z

    if-nez v0, :cond_0

    iget v0, p2, Landroidx/swiperefreshlayout/widget/c;->mSpinnerOffsetEnd:I

    iget p2, p2, Landroidx/swiperefreshlayout/widget/c;->mOriginalOffsetTop:I

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    sub-int/2addr v0, p2

    goto :goto_0

    :cond_0
    iget v0, p2, Landroidx/swiperefreshlayout/widget/c;->mSpinnerOffsetEnd:I

    :goto_0
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$f;->a:Landroidx/swiperefreshlayout/widget/c;

    iget v1, p2, Landroidx/swiperefreshlayout/widget/c;->mFrom:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v1, v0

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/c;->mCircleView:Landroidx/swiperefreshlayout/widget/a;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr v1, p2

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$f;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-virtual {p2, v1}, Landroidx/swiperefreshlayout/widget/c;->setTargetOffsetTopAndBottom(I)V

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$f;->a:Landroidx/swiperefreshlayout/widget/c;

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/c;->mProgress:Landroidx/swiperefreshlayout/widget/b;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/b;->e(F)V

    return-void
.end method
