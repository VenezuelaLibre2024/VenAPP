.class Landroidx/swiperefreshlayout/widget/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


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

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/c$a;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/c$a;->a:Landroidx/swiperefreshlayout/widget/c;

    iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/c;->mRefreshing:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/c;->mProgress:Landroidx/swiperefreshlayout/widget/b;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/b;->setAlpha(I)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/c$a;->a:Landroidx/swiperefreshlayout/widget/c;

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/c;->mProgress:Landroidx/swiperefreshlayout/widget/b;

    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/b;->start()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/c$a;->a:Landroidx/swiperefreshlayout/widget/c;

    iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/c;->mNotify:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/c;->mListener:Landroidx/swiperefreshlayout/widget/c$j;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/swiperefreshlayout/widget/c$j;->onRefresh()V

    :cond_0
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/c$a;->a:Landroidx/swiperefreshlayout/widget/c;

    iget-object v0, p1, Landroidx/swiperefreshlayout/widget/c;->mCircleView:Landroidx/swiperefreshlayout/widget/a;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, Landroidx/swiperefreshlayout/widget/c;->mCurrentTargetOffsetTop:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/c;->reset()V

    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
