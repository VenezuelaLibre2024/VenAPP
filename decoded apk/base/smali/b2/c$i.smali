.class Lb2/c$i;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/c;->p(Landroid/view/ViewGroup;Lb2/s;Lb2/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/graphics/Rect;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:Lb2/c;


# direct methods
.method constructor <init>(Lb2/c;Landroid/view/View;Landroid/graphics/Rect;IIII)V
    .locals 0

    iput-object p1, p0, Lb2/c$i;->h:Lb2/c;

    iput-object p2, p0, Lb2/c$i;->b:Landroid/view/View;

    iput-object p3, p0, Lb2/c$i;->c:Landroid/graphics/Rect;

    iput p4, p0, Lb2/c$i;->d:I

    iput p5, p0, Lb2/c$i;->e:I

    iput p6, p0, Lb2/c$i;->f:I

    iput p7, p0, Lb2/c$i;->g:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb2/c$i;->a:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    iget-boolean p1, p0, Lb2/c$i;->a:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lb2/c$i;->b:Landroid/view/View;

    iget-object v0, p0, Lb2/c$i;->c:Landroid/graphics/Rect;

    invoke-static {p1, v0}, Landroidx/core/view/x0;->c0(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lb2/c$i;->b:Landroid/view/View;

    iget v0, p0, Lb2/c$i;->d:I

    iget v1, p0, Lb2/c$i;->e:I

    iget v2, p0, Lb2/c$i;->f:I

    iget v3, p0, Lb2/c$i;->g:I

    invoke-static {p1, v0, v1, v2, v3}, Lb2/a0;->f(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method
