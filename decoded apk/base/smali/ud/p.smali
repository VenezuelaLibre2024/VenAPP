.class public Lud/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/p$e;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:J

.field private e:Landroid/view/View;

.field private f:Lud/p$e;

.field private r:I

.field private s:F

.field private t:F

.field private u:Z

.field private v:I

.field private w:Ljava/lang/Object;

.field private x:Landroid/view/VelocityTracker;

.field private y:F


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/Object;Lud/p$e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lud/p;->r:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Lud/p;->a:I

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    mul-int/lit8 v1, v1, 0x10

    iput v1, p0, Lud/p;->b:I

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lud/p;->c:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x10e0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lud/p;->d:J

    iput-object p1, p0, Lud/p;->e:Landroid/view/View;

    iput-object p2, p0, Lud/p;->w:Ljava/lang/Object;

    iput-object p3, p0, Lud/p;->f:Lud/p$e;

    return-void
.end method

.method static synthetic a(Lud/p;)V
    .locals 0

    invoke-direct {p0}, Lud/p;->g()V

    return-void
.end method

.method static synthetic b(Lud/p;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lud/p;->e:Landroid/view/View;

    return-object p0
.end method

.method static synthetic c(Lud/p;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lud/p;->w:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lud/p;)Lud/p$e;
    .locals 0

    iget-object p0, p0, Lud/p;->f:Lud/p$e;

    return-object p0
.end method

.method private e(FFLandroid/animation/AnimatorListenerAdapter;)V
    .locals 6

    invoke-virtual {p0}, Lud/p;->f()F

    move-result v2

    sub-float v3, p1, v2

    iget-object p1, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v4

    sub-float v5, p2, v4

    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    iget-wide v0, p0, Lud/p;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance p2, Lud/p$b;

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lud/p$b;-><init>(Lud/p;FFFF)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    if-eqz p3, :cond_0

    invoke-virtual {p1, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private g()V
    .locals 5

    iget-object v0, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v3, 0x1

    aput v3, v2, v3

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v2

    iget-wide v3, p0, Lud/p;->d:J

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Lud/p$c;

    invoke-direct {v3, p0, v0, v1}, Lud/p$c;-><init>(Lud/p;Landroid/view/ViewGroup$LayoutParams;I)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v1, Lud/p$d;

    invoke-direct {v1, p0, v0}, Lud/p$d;-><init>(Lud/p;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method protected f()F
    .locals 1

    iget-object v0, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    return v0
.end method

.method protected h(F)V
    .locals 1

    iget-object v0, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method protected i(F)V
    .locals 1

    iget-object v0, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method protected j()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lud/p;->e(FFLandroid/animation/AnimatorListenerAdapter;)V

    return-void
.end method

.method protected k(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget p1, p0, Lud/p;->r:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lud/p;->r:I

    neg-int p1, p1

    :goto_0
    int-to-float p1, p1

    new-instance v0, Lud/p$a;

    invoke-direct {v0, p0}, Lud/p$a;-><init>(Lud/p;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lud/p;->e(FFLandroid/animation/AnimatorListenerAdapter;)V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    iget p1, p0, Lud/p;->y:F

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    iget p1, p0, Lud/p;->r:I

    const/4 v1, 0x2

    if-ge p1, v1, :cond_0

    iget-object p1, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iput p1, p0, Lud/p;->r:I

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_14

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq p1, v4, :cond_8

    const/4 v5, 0x3

    if-eq p1, v1, :cond_4

    if-eq p1, v5, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object p1, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    if-nez p1, :cond_2

    goto/16 :goto_8

    :cond_2
    invoke-virtual {p0}, Lud/p;->j()V

    iget-object p1, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    :goto_0
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    :cond_3
    iput-object v3, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    iput v0, p0, Lud/p;->y:F

    iput v0, p0, Lud/p;->s:F

    iput v0, p0, Lud/p;->t:F

    iput-boolean v2, p0, Lud/p;->u:Z

    goto/16 :goto_8

    :cond_4
    iget-object p1, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    if-nez p1, :cond_5

    goto/16 :goto_8

    :cond_5
    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v1, p0, Lud/p;->s:F

    sub-float/2addr p1, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iget v3, p0, Lud/p;->t:F

    sub-float/2addr v1, v3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v6, p0, Lud/p;->a:I

    int-to-float v6, v6

    cmpl-float v3, v3, v6

    const/high16 v6, 0x40000000    # 2.0f

    if-lez v3, :cond_7

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    div-float/2addr v3, v6

    cmpg-float v1, v1, v3

    if-gez v1, :cond_7

    iput-boolean v4, p0, Lud/p;->u:Z

    cmpl-float v1, p1, v0

    if-lez v1, :cond_6

    iget v1, p0, Lud/p;->a:I

    goto :goto_1

    :cond_6
    iget v1, p0, Lud/p;->a:I

    neg-int v1, v1

    :goto_1
    iput v1, p0, Lud/p;->v:I

    iget-object v1, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p2

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p2, v5

    invoke-virtual {v1, p2}, Landroid/view/MotionEvent;->setAction(I)V

    iget-object p2, p0, Lud/p;->e:Landroid/view/View;

    invoke-virtual {p2, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_7
    iget-boolean p2, p0, Lud/p;->u:Z

    if-eqz p2, :cond_13

    iput p1, p0, Lud/p;->y:F

    iget p2, p0, Lud/p;->v:I

    int-to-float p2, p2

    sub-float p2, p1, p2

    invoke-virtual {p0, p2}, Lud/p;->i(F)V

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    mul-float/2addr p1, v6

    iget p2, p0, Lud/p;->r:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float p1, p2, p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Lud/p;->h(F)V

    return v4

    :cond_8
    iget-object p1, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    if-nez p1, :cond_9

    goto/16 :goto_8

    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v5, p0, Lud/p;->s:F

    sub-float/2addr p1, v5

    iget-object v5, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    invoke-virtual {v5, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object p2, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    const/16 v5, 0x3e8

    invoke-virtual {p2, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object p2, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    invoke-virtual {p2}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v5

    iget-object v6, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    invoke-virtual {v6}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v7

    iget v8, p0, Lud/p;->r:I

    div-int/2addr v8, v1

    int-to-float v1, v8

    cmpl-float v1, v7, v1

    if-lez v1, :cond_b

    iget-boolean v1, p0, Lud/p;->u:Z

    if-eqz v1, :cond_b

    cmpl-float p1, p1, v0

    if-lez p1, :cond_a

    move p1, v4

    goto :goto_6

    :cond_a
    move p1, v2

    goto :goto_6

    :cond_b
    iget v1, p0, Lud/p;->b:I

    int-to-float v1, v1

    cmpg-float v1, v1, v5

    if-gtz v1, :cond_10

    iget v1, p0, Lud/p;->c:I

    int-to-float v1, v1

    cmpg-float v1, v5, v1

    if-gtz v1, :cond_10

    cmpg-float v1, v6, v5

    if-gez v1, :cond_10

    if-gez v1, :cond_10

    iget-boolean v1, p0, Lud/p;->u:Z

    if-eqz v1, :cond_10

    cmpg-float p2, p2, v0

    if-gez p2, :cond_c

    move p2, v4

    goto :goto_2

    :cond_c
    move p2, v2

    :goto_2
    cmpg-float p1, p1, v0

    if-gez p1, :cond_d

    move p1, v4

    goto :goto_3

    :cond_d
    move p1, v2

    :goto_3
    if-ne p2, p1, :cond_e

    move p1, v4

    goto :goto_4

    :cond_e
    move p1, v2

    :goto_4
    iget-object p2, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    invoke-virtual {p2}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p2

    cmpl-float p2, p2, v0

    if-lez p2, :cond_f

    goto :goto_5

    :cond_f
    move v4, v2

    :goto_5
    move v9, v4

    move v4, p1

    move p1, v9

    goto :goto_6

    :cond_10
    move p1, v2

    move v4, p1

    :goto_6
    if-eqz v4, :cond_11

    invoke-virtual {p0, p1}, Lud/p;->k(Z)V

    goto :goto_7

    :cond_11
    iget-boolean p1, p0, Lud/p;->u:Z

    if-eqz p1, :cond_12

    invoke-virtual {p0}, Lud/p;->j()V

    :cond_12
    :goto_7
    iget-object p1, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_13
    :goto_8
    return v2

    :cond_14
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lud/p;->s:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lud/p;->t:F

    iget-object p1, p0, Lud/p;->f:Lud/p$e;

    iget-object v0, p0, Lud/p;->w:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lud/p$e;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p1

    iput-object p1, p0, Lud/p;->x:Landroid/view/VelocityTracker;

    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_15
    return v2
.end method
