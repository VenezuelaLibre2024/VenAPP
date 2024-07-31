.class Lud/p$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lud/p;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup$LayoutParams;

.field final synthetic b:I

.field final synthetic c:Lud/p;


# direct methods
.method constructor <init>(Lud/p;Landroid/view/ViewGroup$LayoutParams;I)V
    .locals 0

    iput-object p1, p0, Lud/p$c;->c:Lud/p;

    iput-object p2, p0, Lud/p$c;->a:Landroid/view/ViewGroup$LayoutParams;

    iput p3, p0, Lud/p$c;->b:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lud/p$c;->c:Lud/p;

    invoke-static {p1}, Lud/p;->d(Lud/p;)Lud/p$e;

    move-result-object p1

    iget-object v0, p0, Lud/p$c;->c:Lud/p;

    invoke-static {v0}, Lud/p;->b(Lud/p;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lud/p$c;->c:Lud/p;

    invoke-static {v1}, Lud/p;->c(Lud/p;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lud/p$e;->b(Landroid/view/View;Ljava/lang/Object;)V

    iget-object p1, p0, Lud/p$c;->c:Lud/p;

    invoke-static {p1}, Lud/p;->b(Lud/p;)Landroid/view/View;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lud/p$c;->c:Lud/p;

    invoke-static {p1}, Lud/p;->b(Lud/p;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lud/p$c;->a:Landroid/view/ViewGroup$LayoutParams;

    iget v0, p0, Lud/p$c;->b:I

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object p1, p0, Lud/p$c;->c:Lud/p;

    invoke-static {p1}, Lud/p;->b(Lud/p;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lud/p$c;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
