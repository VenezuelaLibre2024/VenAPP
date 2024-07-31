.class Landroidx/swiperefreshlayout/widget/c$h;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/c;->startScaleDownReturnToStartAnimation(ILandroid/view/animation/Animation$AnimationListener;)V
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

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/c$h;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$h;->a:Landroidx/swiperefreshlayout/widget/c;

    iget v0, p2, Landroidx/swiperefreshlayout/widget/c;->mStartingScale:F

    neg-float v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/c;->setAnimationProgress(F)V

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$h;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/c;->moveToStart(F)V

    return-void
.end method
