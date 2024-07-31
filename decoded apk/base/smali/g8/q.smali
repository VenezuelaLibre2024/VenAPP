.class public final Lg8/q;
.super Lt6/l;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Lg8/l;

.field private final B:Lt6/v1;

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:I

.field private G:Lt6/u1;

.field private H:Lg8/j;

.field private I:Lg8/n;

.field private J:Lg8/o;

.field private K:Lg8/o;

.field private L:I

.field private M:J

.field private N:J

.field private O:J

.field private final y:Landroid/os/Handler;

.field private final z:Lg8/p;


# direct methods
.method public constructor <init>(Lg8/p;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lg8/l;->a:Lg8/l;

    invoke-direct {p0, p1, p2, v0}, Lg8/q;-><init>(Lg8/p;Landroid/os/Looper;Lg8/l;)V

    return-void
.end method

.method public constructor <init>(Lg8/p;Landroid/os/Looper;Lg8/l;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lt6/l;-><init>(I)V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg8/p;

    iput-object p1, p0, Lg8/q;->z:Lg8/p;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lt8/r0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lg8/q;->y:Landroid/os/Handler;

    iput-object p3, p0, Lg8/q;->A:Lg8/l;

    new-instance p1, Lt6/v1;

    invoke-direct {p1}, Lt6/v1;-><init>()V

    iput-object p1, p0, Lg8/q;->B:Lt6/v1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lg8/q;->M:J

    iput-wide p1, p0, Lg8/q;->N:J

    iput-wide p1, p0, Lg8/q;->O:J

    return-void
.end method

.method private Y()V
    .locals 4

    new-instance v0, Lg8/f;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v1

    iget-wide v2, p0, Lg8/q;->O:J

    invoke-direct {p0, v2, v3}, Lg8/q;->b0(J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lg8/f;-><init>(Ljava/util/List;J)V

    invoke-direct {p0, v0}, Lg8/q;->j0(Lg8/f;)V

    return-void
.end method

.method private Z(J)J
    .locals 1

    iget-object v0, p0, Lg8/q;->J:Lg8/o;

    invoke-virtual {v0, p1, p2}, Lg8/o;->b(J)I

    move-result p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lg8/q;->J:Lg8/o;

    invoke-virtual {p2}, Lg8/o;->l()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lg8/q;->J:Lg8/o;

    invoke-virtual {p1}, Lg8/o;->l()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lg8/o;->i(I)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lg8/q;->J:Lg8/o;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Lg8/o;->i(I)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lg8/q;->J:Lg8/o;

    iget-wide p1, p1, Lw6/h;->b:J

    return-wide p1
.end method

.method private a0()J
    .locals 4

    iget v0, p0, Lg8/q;->L:I

    const/4 v1, -0x1

    const-wide v2, 0x7fffffffffffffffL

    if-ne v0, v1, :cond_0

    return-wide v2

    :cond_0
    iget-object v0, p0, Lg8/q;->J:Lg8/o;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lg8/q;->L:I

    iget-object v1, p0, Lg8/q;->J:Lg8/o;

    invoke-virtual {v1}, Lg8/o;->l()I

    move-result v1

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg8/q;->J:Lg8/o;

    iget v1, p0, Lg8/q;->L:I

    invoke-virtual {v0, v1}, Lg8/o;->i(I)J

    move-result-wide v2

    :goto_0
    return-wide v2
.end method

.method private b0(J)J
    .locals 7

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {v2}, Lt8/a;->g(Z)V

    iget-wide v5, p0, Lg8/q;->N:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lt8/a;->g(Z)V

    iget-wide v0, p0, Lg8/q;->N:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private c0(Lg8/k;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg8/q;->G:Lt6/u1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lg8/q;->Y()V

    invoke-direct {p0}, Lg8/q;->h0()V

    return-void
.end method

.method private d0()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/q;->E:Z

    iget-object v0, p0, Lg8/q;->A:Lg8/l;

    iget-object v1, p0, Lg8/q;->G:Lt6/u1;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/u1;

    invoke-interface {v0, v1}, Lg8/l;->b(Lt6/u1;)Lg8/j;

    move-result-object v0

    iput-object v0, p0, Lg8/q;->H:Lg8/j;

    return-void
.end method

.method private e0(Lg8/f;)V
    .locals 2

    iget-object v0, p0, Lg8/q;->z:Lg8/p;

    iget-object v1, p1, Lg8/f;->a:Lcom/google/common/collect/w;

    invoke-interface {v0, v1}, Lg8/p;->onCues(Ljava/util/List;)V

    iget-object v0, p0, Lg8/q;->z:Lg8/p;

    invoke-interface {v0, p1}, Lg8/p;->onCues(Lg8/f;)V

    return-void
.end method

.method private f0()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/q;->I:Lg8/n;

    const/4 v1, -0x1

    iput v1, p0, Lg8/q;->L:I

    iget-object v1, p0, Lg8/q;->J:Lg8/o;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lw6/h;->x()V

    iput-object v0, p0, Lg8/q;->J:Lg8/o;

    :cond_0
    iget-object v1, p0, Lg8/q;->K:Lg8/o;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lw6/h;->x()V

    iput-object v0, p0, Lg8/q;->K:Lg8/o;

    :cond_1
    return-void
.end method

.method private g0()V
    .locals 1

    invoke-direct {p0}, Lg8/q;->f0()V

    iget-object v0, p0, Lg8/q;->H:Lg8/j;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/j;

    invoke-interface {v0}, Lw6/d;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/q;->H:Lg8/j;

    const/4 v0, 0x0

    iput v0, p0, Lg8/q;->F:I

    return-void
.end method

.method private h0()V
    .locals 0

    invoke-direct {p0}, Lg8/q;->g0()V

    invoke-direct {p0}, Lg8/q;->d0()V

    return-void
.end method

.method private j0(Lg8/f;)V
    .locals 2

    iget-object v0, p0, Lg8/q;->y:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lg8/q;->e0(Lg8/f;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected O()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/q;->G:Lt6/u1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lg8/q;->M:J

    invoke-direct {p0}, Lg8/q;->Y()V

    iput-wide v0, p0, Lg8/q;->N:J

    iput-wide v0, p0, Lg8/q;->O:J

    invoke-direct {p0}, Lg8/q;->g0()V

    return-void
.end method

.method protected Q(JZ)V
    .locals 0

    iput-wide p1, p0, Lg8/q;->O:J

    invoke-direct {p0}, Lg8/q;->Y()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg8/q;->C:Z

    iput-boolean p1, p0, Lg8/q;->D:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lg8/q;->M:J

    iget p1, p0, Lg8/q;->F:I

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lg8/q;->h0()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lg8/q;->f0()V

    iget-object p1, p0, Lg8/q;->H:Lg8/j;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg8/j;

    invoke-interface {p1}, Lw6/d;->flush()V

    :goto_0
    return-void
.end method

.method protected U([Lt6/u1;JJ)V
    .locals 0

    iput-wide p4, p0, Lg8/q;->N:J

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Lg8/q;->G:Lt6/u1;

    iget-object p1, p0, Lg8/q;->H:Lg8/j;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lg8/q;->F:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lg8/q;->d0()V

    :goto_0
    return-void
.end method

.method public a(Lt6/u1;)I
    .locals 1

    iget-object v0, p0, Lg8/q;->A:Lg8/l;

    invoke-interface {v0, p1}, Lg8/l;->a(Lt6/u1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Lt6/u1;->R:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_1
    iget-object p1, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {p1}, Lt8/w;->r(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    goto :goto_1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lg8/q;->D:Z

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg8/f;

    invoke-direct {p0, p1}, Lg8/q;->e0(Lg8/f;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public i0(J)V
    .locals 1

    invoke-virtual {p0}, Lt6/l;->r()Z

    move-result v0

    invoke-static {v0}, Lt8/a;->g(Z)V

    iput-wide p1, p0, Lg8/q;->M:J

    return-void
.end method

.method public z(JJ)V
    .locals 8

    iput-wide p1, p0, Lg8/q;->O:J

    invoke-virtual {p0}, Lt6/l;->r()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iget-wide v0, p0, Lg8/q;->M:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    invoke-direct {p0}, Lg8/q;->f0()V

    iput-boolean p4, p0, Lg8/q;->D:Z

    :cond_0
    iget-boolean p3, p0, Lg8/q;->D:Z

    if-eqz p3, :cond_1

    return-void

    :cond_1
    iget-object p3, p0, Lg8/q;->K:Lg8/o;

    if-nez p3, :cond_2

    iget-object p3, p0, Lg8/q;->H:Lg8/j;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg8/j;

    invoke-interface {p3, p1, p2}, Lg8/j;->a(J)V

    :try_start_0
    iget-object p3, p0, Lg8/q;->H:Lg8/j;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg8/j;

    invoke-interface {p3}, Lw6/d;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg8/o;

    iput-object p3, p0, Lg8/q;->K:Lg8/o;
    :try_end_0
    .catch Lg8/k; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lg8/q;->c0(Lg8/k;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lt6/l;->getState()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    return-void

    :cond_3
    iget-object p3, p0, Lg8/q;->J:Lg8/o;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-direct {p0}, Lg8/q;->a0()J

    move-result-wide v2

    move p3, v1

    :goto_1
    cmp-long v2, v2, p1

    if-gtz v2, :cond_5

    iget p3, p0, Lg8/q;->L:I

    add-int/2addr p3, p4

    iput p3, p0, Lg8/q;->L:I

    invoke-direct {p0}, Lg8/q;->a0()J

    move-result-wide v2

    move p3, p4

    goto :goto_1

    :cond_4
    move p3, v1

    :cond_5
    iget-object v2, p0, Lg8/q;->K:Lg8/o;

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lw6/a;->s()Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez p3, :cond_9

    invoke-direct {p0}, Lg8/q;->a0()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_9

    iget v2, p0, Lg8/q;->F:I

    if-ne v2, v0, :cond_6

    invoke-direct {p0}, Lg8/q;->h0()V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Lg8/q;->f0()V

    iput-boolean p4, p0, Lg8/q;->D:Z

    goto :goto_2

    :cond_7
    iget-wide v4, v2, Lw6/h;->b:J

    cmp-long v4, v4, p1

    if-gtz v4, :cond_9

    iget-object p3, p0, Lg8/q;->J:Lg8/o;

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lw6/h;->x()V

    :cond_8
    invoke-virtual {v2, p1, p2}, Lg8/o;->b(J)I

    move-result p3

    iput p3, p0, Lg8/q;->L:I

    iput-object v2, p0, Lg8/q;->J:Lg8/o;

    iput-object v3, p0, Lg8/q;->K:Lg8/o;

    move p3, p4

    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    iget-object p3, p0, Lg8/q;->J:Lg8/o;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lg8/q;->Z(J)J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lg8/q;->b0(J)J

    move-result-wide v4

    new-instance p3, Lg8/f;

    iget-object v2, p0, Lg8/q;->J:Lg8/o;

    invoke-virtual {v2, p1, p2}, Lg8/o;->h(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1, v4, v5}, Lg8/f;-><init>(Ljava/util/List;J)V

    invoke-direct {p0, p3}, Lg8/q;->j0(Lg8/f;)V

    :cond_a
    iget p1, p0, Lg8/q;->F:I

    if-ne p1, v0, :cond_b

    return-void

    :cond_b
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Lg8/q;->C:Z

    if-nez p1, :cond_13

    iget-object p1, p0, Lg8/q;->I:Lg8/n;

    if-nez p1, :cond_d

    iget-object p1, p0, Lg8/q;->H:Lg8/j;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg8/j;

    invoke-interface {p1}, Lw6/d;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg8/n;

    if-nez p1, :cond_c

    return-void

    :cond_c
    iput-object p1, p0, Lg8/q;->I:Lg8/n;

    :cond_d
    iget p2, p0, Lg8/q;->F:I

    if-ne p2, p4, :cond_e

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lw6/a;->w(I)V

    iget-object p2, p0, Lg8/q;->H:Lg8/j;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg8/j;

    invoke-interface {p2, p1}, Lw6/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Lg8/q;->I:Lg8/n;

    iput v0, p0, Lg8/q;->F:I

    return-void

    :cond_e
    iget-object p2, p0, Lg8/q;->B:Lt6/v1;

    invoke-virtual {p0, p2, p1, v1}, Lt6/l;->V(Lt6/v1;Lw6/g;I)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_12

    invoke-virtual {p1}, Lw6/a;->s()Z

    move-result p2

    if-eqz p2, :cond_f

    iput-boolean p4, p0, Lg8/q;->C:Z

    iput-boolean v1, p0, Lg8/q;->E:Z

    goto :goto_5

    :cond_f
    iget-object p2, p0, Lg8/q;->B:Lt6/v1;

    iget-object p2, p2, Lt6/v1;->b:Lt6/u1;

    if-nez p2, :cond_10

    return-void

    :cond_10
    iget-wide p2, p2, Lt6/u1;->A:J

    iput-wide p2, p1, Lg8/n;->t:J

    invoke-virtual {p1}, Lw6/g;->z()V

    iget-boolean p2, p0, Lg8/q;->E:Z

    invoke-virtual {p1}, Lw6/a;->u()Z

    move-result p3

    if-nez p3, :cond_11

    move p3, p4

    goto :goto_4

    :cond_11
    move p3, v1

    :goto_4
    and-int/2addr p2, p3

    iput-boolean p2, p0, Lg8/q;->E:Z

    :goto_5
    iget-boolean p2, p0, Lg8/q;->E:Z

    if-nez p2, :cond_b

    iget-object p2, p0, Lg8/q;->H:Lg8/j;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg8/j;

    invoke-interface {p2, p1}, Lw6/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Lg8/q;->I:Lg8/n;
    :try_end_1
    .catch Lg8/k; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_12
    const/4 p1, -0x3

    if-ne p2, p1, :cond_b

    return-void

    :catch_1
    move-exception p1

    invoke-direct {p0, p1}, Lg8/q;->c0(Lg8/k;)V

    :cond_13
    return-void
.end method
