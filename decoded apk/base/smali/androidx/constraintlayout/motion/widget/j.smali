.class public Landroidx/constraintlayout/motion/widget/j;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/q0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/motion/widget/j$d;,
        Landroidx/constraintlayout/motion/widget/j$c;,
        Landroidx/constraintlayout/motion/widget/j$e;
    }
.end annotation


# static fields
.field public static F0:Z


# instance fields
.field private A0:I

.field private B0:Z

.field C0:Landroidx/constraintlayout/motion/widget/j$e;

.field private D0:Z

.field E0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field J:Landroid/view/animation/Interpolator;

.field K:Landroid/view/animation/Interpolator;

.field L:F

.field private M:I

.field N:I

.field private O:I

.field private P:Z

.field Q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Landroidx/constraintlayout/motion/widget/g;",
            ">;"
        }
    .end annotation
.end field

.field private R:J

.field private S:F

.field T:F

.field U:F

.field private V:J

.field W:F

.field private a0:Z

.field b0:Z

.field private c0:Landroidx/constraintlayout/motion/widget/j$d;

.field d0:I

.field private e0:Z

.field private f0:Landroidx/constraintlayout/motion/widget/b;

.field g0:Z

.field h0:F

.field i0:F

.field j0:J

.field k0:F

.field private l0:Z

.field private m0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/h;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/h;",
            ">;"
        }
    .end annotation
.end field

.field private o0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/h;",
            ">;"
        }
    .end annotation
.end field

.field private p0:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/constraintlayout/motion/widget/j$d;",
            ">;"
        }
    .end annotation
.end field

.field private q0:I

.field private r0:F

.field s0:Z

.field protected t0:Z

.field u0:F

.field private v0:Z

.field private w0:Landroidx/constraintlayout/motion/widget/j$c;

.field private x0:Ljava/lang/Runnable;

.field private y0:[I

.field z0:I


# direct methods
.method private C()V
    .locals 5

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/j;->s0:Z

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->E0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2, p0, v3}, Landroidx/constraintlayout/motion/widget/j$d;->b(Landroidx/constraintlayout/motion/widget/j;I)V

    :cond_3
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/motion/widget/j$d;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3, p0, v4}, Landroidx/constraintlayout/motion/widget/j$d;->b(Landroidx/constraintlayout/motion/widget/j;I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->E0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method static synthetic u(Landroidx/constraintlayout/motion/widget/j;)Landroidx/constraintlayout/motion/widget/j$c;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    return-object p0
.end method

.method static synthetic v(Landroidx/constraintlayout/motion/widget/j;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    return p0
.end method

.method static synthetic w(Landroidx/constraintlayout/motion/widget/j;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    return p0
.end method

.method private z()V
    .locals 6

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->r0:F

    iget v1, p0, Landroidx/constraintlayout/motion/widget/j;->T:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->q0:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    if-eqz v0, :cond_1

    iget v3, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    iget v4, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    invoke-interface {v0, p0, v3, v4}, Landroidx/constraintlayout/motion/widget/j$d;->c(Landroidx/constraintlayout/motion/widget/j;II)V

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/motion/widget/j$d;

    iget v4, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    iget v5, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    invoke-interface {v3, p0, v4, v5}, Landroidx/constraintlayout/motion/widget/j$d;->c(Landroidx/constraintlayout/motion/widget/j;II)V

    goto :goto_0

    :cond_2
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/j;->s0:Z

    :cond_3
    iput v2, p0, Landroidx/constraintlayout/motion/widget/j;->q0:I

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->T:F

    iput v0, p0, Landroidx/constraintlayout/motion/widget/j;->r0:F

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    if-eqz v2, :cond_4

    iget v3, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    iget v4, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    invoke-interface {v2, p0, v3, v4, v0}, Landroidx/constraintlayout/motion/widget/j$d;->a(Landroidx/constraintlayout/motion/widget/j;IIF)V

    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/j$d;

    iget v3, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    iget v4, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    iget v5, p0, Landroidx/constraintlayout/motion/widget/j;->T:F

    invoke-interface {v2, p0, v3, v4, v5}, Landroidx/constraintlayout/motion/widget/j$d;->a(Landroidx/constraintlayout/motion/widget/j;IIF)V

    goto :goto_1

    :cond_5
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/j;->s0:Z

    :cond_6
    return-void
.end method


# virtual methods
.method protected A()V
    .locals 4

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->q0:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/j;->q0:I

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->E0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->E0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v3, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    if-eq v0, v3, :cond_2

    if-eq v3, v2, :cond_2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->E0:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/j;->C()V

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->x0:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->y0:[I

    if-eqz v0, :cond_4

    iget v2, p0, Landroidx/constraintlayout/motion/widget/j;->z0:I

    if-lez v2, :cond_4

    const/4 v2, 0x0

    aget v0, v0, v2

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/j;->H(I)V

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->y0:[I

    array-length v3, v0

    sub-int/2addr v3, v1

    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->z0:I

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/constraintlayout/motion/widget/j;->z0:I

    :cond_4
    return-void
.end method

.method B()V
    .locals 0

    return-void
.end method

.method public D(FF)V
    .locals 2

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->e(F)V

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/motion/widget/j$c;->h(F)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/j;->setProgress(F)V

    sget-object v0, Landroidx/constraintlayout/motion/widget/j$e;->MOVING:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    iput p2, p0, Landroidx/constraintlayout/motion/widget/j;->L:F

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3

    if-lez p2, :cond_2

    :goto_0
    move v0, v1

    :cond_2
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/j;->x(F)V

    goto :goto_1

    :cond_3
    cmpl-float p2, p1, v0

    if-eqz p2, :cond_4

    cmpl-float p2, p1, v1

    if-eqz p2, :cond_4

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_2

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public E(III)V
    .locals 1

    sget-object v0, Landroidx/constraintlayout/motion/widget/j$e;->SETUP:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:Landroidx/constraintlayout/widget/d;

    if-eqz v0, :cond_0

    int-to-float p2, p2

    int-to-float p3, p3

    invoke-virtual {v0, p1, p2, p3}, Landroidx/constraintlayout/widget/d;->d(IFF)V

    :cond_0
    return-void
.end method

.method public F(II)V
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->f(I)V

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/motion/widget/j$c;->d(I)V

    :cond_1
    return-void
.end method

.method public G()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/j;->x(F)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->x0:Ljava/lang/Runnable;

    return-void
.end method

.method public H(I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->d(I)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, v0}, Landroidx/constraintlayout/motion/widget/j;->I(III)V

    return-void
.end method

.method public I(III)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/constraintlayout/motion/widget/j;->J(IIII)V

    return-void
.end method

.method public J(IIII)V
    .locals 3

    iget p2, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    iget p3, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    const/high16 v0, 0x447a0000    # 1000.0f

    const/4 v1, 0x0

    if-ne p3, p1, :cond_2

    invoke-virtual {p0, v1}, Landroidx/constraintlayout/motion/widget/j;->x(F)V

    if-lez p4, :cond_1

    int-to-float p1, p4

    div-float/2addr p1, v0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->S:F

    :cond_1
    return-void

    :cond_2
    iget p3, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne p3, p1, :cond_4

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/motion/widget/j;->x(F)V

    if-lez p4, :cond_3

    int-to-float p1, p4

    div-float/2addr p1, v0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->S:F

    :cond_3
    return-void

    :cond_4
    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    const/4 p3, -0x1

    if-eq p2, p3, :cond_6

    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/motion/widget/j;->F(II)V

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/motion/widget/j;->x(F)V

    iput v1, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->G()V

    if-lez p4, :cond_5

    int-to-float p1, p4

    div-float/2addr p1, v0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->S:F

    :cond_5
    return-void

    :cond_6
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/j;->e0:Z

    iput v2, p0, Landroidx/constraintlayout/motion/widget/j;->W:F

    iput v1, p0, Landroidx/constraintlayout/motion/widget/j;->T:F

    iput v1, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/constraintlayout/motion/widget/j;->V:J

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/constraintlayout/motion/widget/j;->R:J

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/j;->a0:Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/j;->J:Landroid/view/animation/Interpolator;

    if-ne p4, p3, :cond_7

    throw p1

    :cond_7
    iput p3, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    throw p1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->o0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/motion/widget/h;

    invoke-virtual {v1, p1}, Landroidx/constraintlayout/motion/widget/h;->w(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/j;->y(Z)V

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getConstraintSetIds()[I
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCurrentState()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    return v0
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/l$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDesignTool()Landroidx/constraintlayout/motion/widget/b;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->f0:Landroidx/constraintlayout/motion/widget/b;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/b;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/b;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->f0:Landroidx/constraintlayout/motion/widget/b;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->f0:Landroidx/constraintlayout/motion/widget/b;

    return-object v0
.end method

.method public getEndState()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    return v0
.end method

.method protected getNanoTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getProgress()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    return v0
.end method

.method public getScene()Landroidx/constraintlayout/motion/widget/l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getStartState()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    return v0
.end method

.method public getTargetPosition()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->W:F

    return v0
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/j$c;->c()V

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/j$c;->b()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getTransitionTimeMs()J
    .locals 2

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->S:F

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    return-wide v0
.end method

.method public getVelocity()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->L:F

    return v0
.end method

.method public isAttachedToWindow()Z
    .locals 1

    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    return v0
.end method

.method protected m(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:Landroidx/constraintlayout/widget/d;

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/j;->A0:I

    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->B()V

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/j;->B0:Z

    if-eqz v1, :cond_1

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$a;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$a;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/j$c;->a()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/j;->v0:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/j;->v0:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/j;->v0:Z

    throw p1
.end method

.method protected onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 0

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII)V
    .locals 0

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 0

    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/j;->g0:Z

    const/4 p6, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    aget p1, p7, p6

    add-int/2addr p1, p4

    aput p1, p7, p6

    const/4 p1, 0x1

    aget p2, p7, p1

    add-int/2addr p2, p5

    aput p2, p7, p1

    :cond_1
    iput-boolean p6, p0, Landroidx/constraintlayout/motion/widget/j;->g0:Z

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->getNanoTime()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/constraintlayout/motion/widget/j;->j0:J

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->k0:F

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->h0:F

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->i0:F

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 0

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    instance-of v0, p1, Landroidx/constraintlayout/motion/widget/h;

    if-eqz v0, :cond_6

    check-cast p1, Landroidx/constraintlayout/motion/widget/h;

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/h;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->m0:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->m0:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->m0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/h;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->n0:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->n0:Ljava/util/ArrayList;

    :cond_3
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->n0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/h;->t()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->o0:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->o0:Ljava/util/ArrayList;

    :cond_5
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->o0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->m0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->n0:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public requestLayout()V
    .locals 2

    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/j;->t0:Z

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    const/4 v1, -0x1

    :cond_0
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setDebugMode(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->d0:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/j;->B0:Z

    return-void
.end method

.method public setInteractionEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/j;->P:Z

    return-void
.end method

.method public setInterpolatedProgress(F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/j;->setProgress(F)V

    return-void
.end method

.method public setOnHide(F)V
    .locals 3

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->n0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/j;->n0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/h;

    invoke-virtual {v2, p1}, Landroidx/constraintlayout/motion/widget/h;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setOnShow(F)V
    .locals 3

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->m0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/j;->m0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/h;

    invoke-virtual {v2, p1}, Landroidx/constraintlayout/motion/widget/h;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 5

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_0

    cmpl-float v3, p1, v2

    if-lez v3, :cond_1

    :cond_0
    const-string v3, "MotionLayout"

    const-string v4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->isAttachedToWindow()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_2

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_2
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->e(F)V

    return-void

    :cond_3
    if-gtz v1, :cond_5

    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    cmpl-float p1, p1, v2

    if-nez p1, :cond_4

    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget v1, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    if-ne p1, v1, :cond_4

    sget-object p1, Landroidx/constraintlayout/motion/widget/j$e;->MOVING:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    :cond_4
    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_8

    :goto_0
    sget-object p1, Landroidx/constraintlayout/motion/widget/j$e;->FINISHED:Landroidx/constraintlayout/motion/widget/j$e;

    goto :goto_1

    :cond_5
    cmpl-float p1, p1, v2

    if-ltz p1, :cond_7

    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_6

    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    if-ne p1, v0, :cond_6

    sget-object p1, Landroidx/constraintlayout/motion/widget/j$e;->MOVING:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    :cond_6
    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget p1, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    cmpl-float p1, p1, v2

    if-nez p1, :cond_8

    goto :goto_0

    :cond_7
    const/4 p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    sget-object p1, Landroidx/constraintlayout/motion/widget/j$e;->MOVING:Landroidx/constraintlayout/motion/widget/j$e;

    :goto_1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    :cond_8
    return-void
.end method

.method public setScene(Landroidx/constraintlayout/motion/widget/l;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->k()Z

    const/4 p1, 0x0

    throw p1
.end method

.method setStartState(I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->f(I)V

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->d(I)V

    return-void

    :cond_1
    iput p1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    return-void
.end method

.method setState(Landroidx/constraintlayout/motion/widget/j$e;)V
    .locals 4

    sget-object v0, Landroidx/constraintlayout/motion/widget/j$e;->FINISHED:Landroidx/constraintlayout/motion/widget/j$e;

    if-ne p1, v0, :cond_0

    iget v1, p0, Landroidx/constraintlayout/motion/widget/j;->N:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/j;->C0:Landroidx/constraintlayout/motion/widget/j$e;

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/j;->C0:Landroidx/constraintlayout/motion/widget/j$e;

    sget-object v2, Landroidx/constraintlayout/motion/widget/j$e;->MOVING:Landroidx/constraintlayout/motion/widget/j$e;

    if-ne v1, v2, :cond_1

    if-ne p1, v2, :cond_1

    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/j;->z()V

    :cond_1
    sget-object v3, Landroidx/constraintlayout/motion/widget/j$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    if-ne p1, v0, :cond_5

    :goto_0
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->A()V

    goto :goto_1

    :cond_3
    if-ne p1, v2, :cond_4

    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/j;->z()V

    :cond_4
    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public setTransition(I)V
    .locals 0

    return-void
.end method

.method protected setTransition(Landroidx/constraintlayout/motion/widget/l$a;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setTransitionDuration(I)V
    .locals 1

    const-string p1, "MotionLayout"

    const-string v0, "MotionScene not defined"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setTransitionListener(Landroidx/constraintlayout/motion/widget/j$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/j;->c0:Landroidx/constraintlayout/motion/widget/j$d;

    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/motion/widget/j$c;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/j$c;-><init>(Landroidx/constraintlayout/motion/widget/j;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/j$c;->g(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/j;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/j;->w0:Landroidx/constraintlayout/motion/widget/j$c;

    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/j$c;->a()V

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Landroidx/constraintlayout/motion/widget/j;->M:I

    invoke-static {v0, v2}, Landroidx/constraintlayout/motion/widget/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/j;->O:I

    invoke-static {v0, v2}, Landroidx/constraintlayout/motion/widget/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (pos:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->U:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " Dpos/Dt:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/j;->L:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method x(F)V
    .locals 0

    return-void
.end method

.method y(Z)V
    .locals 21

    move-object/from16 v0, p0

    iget-wide v1, v0, Landroidx/constraintlayout/motion/widget/j;->V:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/j;->getNanoTime()J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/constraintlayout/motion/widget/j;->V:J

    :cond_0
    iget v1, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v3, :cond_1

    cmpg-float v3, v1, v5

    if-gez v3, :cond_1

    iput v4, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    :cond_1
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    const/4 v7, 0x0

    if-nez v3, :cond_3

    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    if-eqz v3, :cond_2

    if-nez p1, :cond_3

    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto/16 :goto_f

    :cond_3
    :goto_0
    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    sub-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/j;->getNanoTime()J

    move-result-wide v8

    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/j;->J:Landroid/view/animation/Interpolator;

    instance-of v10, v3, Landroidx/constraintlayout/motion/widget/i;

    const v11, 0x3089705f    # 1.0E-9f

    if-nez v10, :cond_4

    iget-wide v12, v0, Landroidx/constraintlayout/motion/widget/j;->V:J

    sub-long v12, v8, v12

    long-to-float v10, v12

    mul-float/2addr v10, v1

    mul-float/2addr v10, v11

    iget v12, v0, Landroidx/constraintlayout/motion/widget/j;->S:F

    div-float/2addr v10, v12

    goto :goto_1

    :cond_4
    move v10, v2

    :goto_1
    iget v12, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    add-float/2addr v12, v10

    iget-boolean v13, v0, Landroidx/constraintlayout/motion/widget/j;->a0:Z

    if-eqz v13, :cond_5

    iget v12, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    :cond_5
    cmpl-float v13, v1, v2

    if-lez v13, :cond_6

    iget v14, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpl-float v14, v12, v14

    if-gez v14, :cond_7

    :cond_6
    cmpg-float v14, v1, v2

    if-gtz v14, :cond_8

    iget v14, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpg-float v14, v12, v14

    if-gtz v14, :cond_8

    :cond_7
    iget v12, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    const/4 v14, 0x1

    goto :goto_2

    :cond_8
    move v14, v7

    :goto_2
    iput v12, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    iput v12, v0, Landroidx/constraintlayout/motion/widget/j;->T:F

    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/j;->V:J

    const v15, 0x3727c5ac    # 1.0E-5f

    if-eqz v3, :cond_d

    if-nez v14, :cond_d

    iget-boolean v14, v0, Landroidx/constraintlayout/motion/widget/j;->e0:Z

    if-eqz v14, :cond_a

    iget-wide v6, v0, Landroidx/constraintlayout/motion/widget/j;->R:J

    sub-long v6, v8, v6

    long-to-float v6, v6

    mul-float/2addr v6, v11

    invoke-interface {v3, v6}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v3

    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/j;->J:Landroid/view/animation/Interpolator;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v3, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/j;->V:J

    instance-of v7, v6, Landroidx/constraintlayout/motion/widget/i;

    if-eqz v7, :cond_c

    check-cast v6, Landroidx/constraintlayout/motion/widget/i;

    invoke-virtual {v6}, Landroidx/constraintlayout/motion/widget/i;->a()F

    move-result v6

    iput v6, v0, Landroidx/constraintlayout/motion/widget/j;->L:F

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v7

    iget v8, v0, Landroidx/constraintlayout/motion/widget/j;->S:F

    mul-float/2addr v7, v8

    cmpg-float v7, v7, v15

    cmpl-float v7, v6, v2

    if-lez v7, :cond_9

    cmpl-float v7, v3, v5

    if-ltz v7, :cond_9

    iput v5, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    const/4 v7, 0x0

    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    move v3, v5

    goto :goto_3

    :cond_9
    const/4 v7, 0x0

    :goto_3
    cmpg-float v6, v6, v2

    if-gez v6, :cond_c

    cmpg-float v6, v3, v2

    if-gtz v6, :cond_c

    iput v2, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    move v12, v2

    goto :goto_5

    :cond_a
    invoke-interface {v3, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v3

    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/j;->J:Landroid/view/animation/Interpolator;

    instance-of v7, v6, Landroidx/constraintlayout/motion/widget/i;

    if-eqz v7, :cond_b

    check-cast v6, Landroidx/constraintlayout/motion/widget/i;

    invoke-virtual {v6}, Landroidx/constraintlayout/motion/widget/i;->a()F

    move-result v6

    goto :goto_4

    :cond_b
    add-float/2addr v12, v10

    invoke-interface {v6, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v6

    sub-float/2addr v6, v3

    mul-float/2addr v6, v1

    div-float/2addr v6, v10

    :goto_4
    iput v6, v0, Landroidx/constraintlayout/motion/widget/j;->L:F

    :cond_c
    move v12, v3

    goto :goto_5

    :cond_d
    iput v10, v0, Landroidx/constraintlayout/motion/widget/j;->L:F

    :goto_5
    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->L:F

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v15

    if-lez v3, :cond_e

    sget-object v3, Landroidx/constraintlayout/motion/widget/j$e;->MOVING:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    :cond_e
    if-lez v13, :cond_f

    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_10

    :cond_f
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_11

    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_11

    :cond_10
    iget v12, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    const/4 v3, 0x0

    iput-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    :cond_11
    cmpl-float v3, v12, v5

    if-gez v3, :cond_13

    cmpg-float v3, v12, v2

    if-gtz v3, :cond_12

    goto :goto_6

    :cond_12
    const/4 v7, 0x0

    goto :goto_7

    :cond_13
    :goto_6
    const/4 v7, 0x0

    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    sget-object v3, Landroidx/constraintlayout/motion/widget/j$e;->FINISHED:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/j;->getNanoTime()J

    move-result-wide v8

    iput v12, v0, Landroidx/constraintlayout/motion/widget/j;->u0:F

    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/j;->K:Landroid/view/animation/Interpolator;

    if-nez v6, :cond_14

    move v6, v12

    goto :goto_8

    :cond_14
    invoke-interface {v6, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v6

    :goto_8
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/j;->K:Landroid/view/animation/Interpolator;

    if-eqz v10, :cond_15

    iget v11, v0, Landroidx/constraintlayout/motion/widget/j;->S:F

    div-float v11, v1, v11

    add-float/2addr v11, v12

    invoke-interface {v10, v11}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v10

    iput v10, v0, Landroidx/constraintlayout/motion/widget/j;->L:F

    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/j;->K:Landroid/view/animation/Interpolator;

    invoke-interface {v11, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v11

    sub-float/2addr v10, v11

    iput v10, v0, Landroidx/constraintlayout/motion/widget/j;->L:F

    :cond_15
    move v10, v7

    :goto_9
    if-ge v10, v3, :cond_17

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    iget-object v15, v0, Landroidx/constraintlayout/motion/widget/j;->Q:Ljava/util/HashMap;

    invoke-virtual {v15, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/constraintlayout/motion/widget/g;

    if-eqz v15, :cond_16

    iget-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    const/16 v20, 0x0

    move-object/from16 v16, v11

    move/from16 v17, v6

    move-wide/from16 v18, v8

    invoke-virtual/range {v15 .. v20}, Landroidx/constraintlayout/motion/widget/g;->c(Landroid/view/View;FJLl0/c;)Z

    move-result v11

    or-int/2addr v7, v11

    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    :cond_16
    add-int/lit8 v10, v10, 0x1

    const/4 v7, 0x0

    goto :goto_9

    :cond_17
    if-lez v13, :cond_18

    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_19

    :cond_18
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_1a

    iget v3, v0, Landroidx/constraintlayout/motion/widget/j;->W:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_1a

    :cond_19
    const/4 v7, 0x1

    goto :goto_a

    :cond_1a
    const/4 v7, 0x0

    :goto_a
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    if-nez v3, :cond_1b

    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    if-nez v3, :cond_1b

    if-eqz v7, :cond_1b

    sget-object v3, Landroidx/constraintlayout/motion/widget/j$e;->FINISHED:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    :cond_1b
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->t0:Z

    if-eqz v3, :cond_1c

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/j;->requestLayout()V

    :cond_1c
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    const/4 v6, 0x1

    xor-int/2addr v7, v6

    or-int/2addr v3, v7

    iput-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    cmpg-float v7, v12, v2

    const/4 v8, 0x0

    if-gtz v7, :cond_1e

    iget v7, v0, Landroidx/constraintlayout/motion/widget/j;->M:I

    if-eq v7, v4, :cond_1e

    iget v4, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    if-ne v4, v7, :cond_1d

    goto :goto_b

    :cond_1d
    iput v7, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    throw v8

    :cond_1e
    :goto_b
    float-to-double v9, v12

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v9, v14

    if-ltz v4, :cond_20

    iget v4, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget v7, v0, Landroidx/constraintlayout/motion/widget/j;->O:I

    if-ne v4, v7, :cond_1f

    goto :goto_c

    :cond_1f
    iput v7, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    throw v8

    :cond_20
    :goto_c
    if-nez v3, :cond_24

    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    if-eqz v3, :cond_21

    goto :goto_d

    :cond_21
    if-lez v13, :cond_22

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_23

    :cond_22
    cmpg-float v3, v1, v2

    if-gez v3, :cond_25

    cmpl-float v3, v12, v2

    if-nez v3, :cond_25

    :cond_23
    sget-object v3, Landroidx/constraintlayout/motion/widget/j$e;->FINISHED:Landroidx/constraintlayout/motion/widget/j$e;

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/j;->setState(Landroidx/constraintlayout/motion/widget/j$e;)V

    goto :goto_e

    :cond_24
    :goto_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    :cond_25
    :goto_e
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->l0:Z

    if-nez v3, :cond_28

    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/j;->b0:Z

    if-nez v3, :cond_28

    if-lez v13, :cond_26

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_27

    :cond_26
    cmpg-float v1, v1, v2

    if-gez v1, :cond_28

    cmpl-float v1, v12, v2

    if-nez v1, :cond_28

    :cond_27
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/j;->B()V

    :cond_28
    :goto_f
    iget v1, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    cmpl-float v3, v1, v5

    if-ltz v3, :cond_2a

    iget v1, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget v2, v0, Landroidx/constraintlayout/motion/widget/j;->O:I

    if-eq v1, v2, :cond_29

    goto :goto_10

    :cond_29
    const/4 v6, 0x0

    :goto_10
    iput v2, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    move v7, v6

    goto :goto_11

    :cond_2a
    cmpg-float v1, v1, v2

    if-gtz v1, :cond_2b

    iget v1, v0, Landroidx/constraintlayout/motion/widget/j;->N:I

    iget v2, v0, Landroidx/constraintlayout/motion/widget/j;->M:I

    if-eq v1, v2, :cond_29

    goto :goto_10

    :cond_2b
    const/4 v7, 0x0

    :goto_11
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/j;->D0:Z

    or-int/2addr v1, v7

    iput-boolean v1, v0, Landroidx/constraintlayout/motion/widget/j;->D0:Z

    if-eqz v7, :cond_2c

    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/j;->v0:Z

    if-nez v1, :cond_2c

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/j;->requestLayout()V

    :cond_2c
    iget v1, v0, Landroidx/constraintlayout/motion/widget/j;->U:F

    iput v1, v0, Landroidx/constraintlayout/motion/widget/j;->T:F

    return-void
.end method
