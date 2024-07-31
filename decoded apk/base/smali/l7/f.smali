.class public final Ll7/f;
.super Lt6/l;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Landroid/os/Handler;

.field private final B:Ll7/d;

.field private final C:Z

.field private D:Ll7/b;

.field private E:Z

.field private F:Z

.field private G:J

.field private H:Ll7/a;

.field private I:J

.field private final y:Ll7/c;

.field private final z:Ll7/e;


# direct methods
.method public constructor <init>(Ll7/e;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Ll7/c;->a:Ll7/c;

    invoke-direct {p0, p1, p2, v0}, Ll7/f;-><init>(Ll7/e;Landroid/os/Looper;Ll7/c;)V

    return-void
.end method

.method public constructor <init>(Ll7/e;Landroid/os/Looper;Ll7/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ll7/f;-><init>(Ll7/e;Landroid/os/Looper;Ll7/c;Z)V

    return-void
.end method

.method public constructor <init>(Ll7/e;Landroid/os/Looper;Ll7/c;Z)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lt6/l;-><init>(I)V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll7/e;

    iput-object p1, p0, Ll7/f;->z:Ll7/e;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lt8/r0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll7/f;->A:Landroid/os/Handler;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll7/c;

    iput-object p1, p0, Ll7/f;->y:Ll7/c;

    iput-boolean p4, p0, Ll7/f;->C:Z

    new-instance p1, Ll7/d;

    invoke-direct {p1}, Ll7/d;-><init>()V

    iput-object p1, p0, Ll7/f;->B:Ll7/d;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ll7/f;->I:J

    return-void
.end method

.method private Y(Ll7/a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a;",
            "Ljava/util/List<",
            "Ll7/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ll7/a;->e()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v1

    invoke-interface {v1}, Ll7/a$b;->H()Lt6/u1;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Ll7/f;->y:Ll7/c;

    invoke-interface {v2, v1}, Ll7/c;->a(Lt6/u1;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll7/f;->y:Ll7/c;

    invoke-interface {v2, v1}, Ll7/c;->b(Lt6/u1;)Ll7/b;

    move-result-object v1

    invoke-virtual {p1, v0}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v2

    invoke-interface {v2}, Ll7/a$b;->q1()[B

    move-result-object v2

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Ll7/f;->B:Ll7/d;

    invoke-virtual {v3}, Lw6/g;->n()V

    iget-object v3, p0, Ll7/f;->B:Ll7/d;

    array-length v4, v2

    invoke-virtual {v3, v4}, Lw6/g;->y(I)V

    iget-object v3, p0, Ll7/f;->B:Ll7/d;

    iget-object v3, v3, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Ll7/f;->B:Ll7/d;

    invoke-virtual {v2}, Lw6/g;->z()V

    iget-object v2, p0, Ll7/f;->B:Ll7/d;

    invoke-interface {v1, v2}, Ll7/b;->a(Ll7/d;)Ll7/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1, p2}, Ll7/f;->Y(Ll7/a;Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private Z(J)J
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

    iget-wide v5, p0, Ll7/f;->I:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lt8/a;->g(Z)V

    iget-wide v0, p0, Ll7/f;->I:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private a0(Ll7/a;)V
    .locals 2

    iget-object v0, p0, Ll7/f;->A:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Ll7/f;->b0(Ll7/a;)V

    :goto_0
    return-void
.end method

.method private b0(Ll7/a;)V
    .locals 1

    iget-object v0, p0, Ll7/f;->z:Ll7/e;

    invoke-interface {v0, p1}, Ll7/e;->onMetadata(Ll7/a;)V

    return-void
.end method

.method private c0(J)Z
    .locals 4

    iget-object v0, p0, Ll7/f;->H:Ll7/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v2, p0, Ll7/f;->C:Z

    if-nez v2, :cond_0

    iget-wide v2, v0, Ll7/a;->b:J

    invoke-direct {p0, p1, p2}, Ll7/f;->Z(J)J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gtz p1, :cond_1

    :cond_0
    iget-object p1, p0, Ll7/f;->H:Ll7/a;

    invoke-direct {p0, p1}, Ll7/f;->a0(Ll7/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ll7/f;->H:Ll7/a;

    move p1, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-boolean p2, p0, Ll7/f;->E:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Ll7/f;->H:Ll7/a;

    if-nez p2, :cond_2

    iput-boolean v1, p0, Ll7/f;->F:Z

    :cond_2
    return p1
.end method

.method private d0()V
    .locals 4

    iget-boolean v0, p0, Ll7/f;->E:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll7/f;->H:Ll7/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll7/f;->B:Ll7/d;

    invoke-virtual {v0}, Lw6/g;->n()V

    invoke-virtual {p0}, Lt6/l;->J()Lt6/v1;

    move-result-object v0

    iget-object v1, p0, Ll7/f;->B:Ll7/d;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->V(Lt6/v1;Lw6/g;I)I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Ll7/f;->B:Ll7/d;

    invoke-virtual {v0}, Lw6/a;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll7/f;->E:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll7/f;->B:Ll7/d;

    iget-wide v1, p0, Ll7/f;->G:J

    iput-wide v1, v0, Ll7/d;->t:J

    invoke-virtual {v0}, Lw6/g;->z()V

    iget-object v0, p0, Ll7/f;->D:Ll7/b;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll7/b;

    iget-object v1, p0, Ll7/f;->B:Ll7/d;

    invoke-interface {v0, v1}, Ll7/b;->a(Ll7/d;)Ll7/a;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll7/a;->e()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0, v1}, Ll7/f;->Y(Ll7/a;Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ll7/a;

    iget-object v2, p0, Ll7/f;->B:Ll7/d;

    iget-wide v2, v2, Lw6/g;->e:J

    invoke-direct {p0, v2, v3}, Ll7/f;->Z(J)J

    move-result-wide v2

    invoke-direct {v0, v2, v3, v1}, Ll7/a;-><init>(JLjava/util/List;)V

    iput-object v0, p0, Ll7/f;->H:Ll7/a;

    goto :goto_0

    :cond_1
    const/4 v2, -0x5

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Lt6/v1;->b:Lt6/u1;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/u1;

    iget-wide v0, v0, Lt6/u1;->A:J

    iput-wide v0, p0, Ll7/f;->G:J

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected O()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ll7/f;->H:Ll7/a;

    iput-object v0, p0, Ll7/f;->D:Ll7/b;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ll7/f;->I:J

    return-void
.end method

.method protected Q(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Ll7/f;->H:Ll7/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll7/f;->E:Z

    iput-boolean p1, p0, Ll7/f;->F:Z

    return-void
.end method

.method protected U([Lt6/u1;JJ)V
    .locals 2

    iget-object p2, p0, Ll7/f;->y:Ll7/c;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Ll7/c;->b(Lt6/u1;)Ll7/b;

    move-result-object p1

    iput-object p1, p0, Ll7/f;->D:Ll7/b;

    iget-object p1, p0, Ll7/f;->H:Ll7/a;

    if-eqz p1, :cond_0

    iget-wide p2, p1, Ll7/a;->b:J

    iget-wide v0, p0, Ll7/f;->I:J

    add-long/2addr p2, v0

    sub-long/2addr p2, p4

    invoke-virtual {p1, p2, p3}, Ll7/a;->c(J)Ll7/a;

    move-result-object p1

    iput-object p1, p0, Ll7/f;->H:Ll7/a;

    :cond_0
    iput-wide p4, p0, Ll7/f;->I:J

    return-void
.end method

.method public a(Lt6/u1;)I
    .locals 1

    iget-object v0, p0, Ll7/f;->y:Ll7/c;

    invoke-interface {v0, p1}, Ll7/c;->a(Lt6/u1;)Z

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
    const/4 p1, 0x0

    invoke-static {p1}, Lt6/r3;->o(I)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ll7/f;->F:Z

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll7/a;

    invoke-direct {p0, p1}, Ll7/f;->b0(Ll7/a;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public z(JJ)V
    .locals 0

    const/4 p3, 0x1

    :goto_0
    if-eqz p3, :cond_0

    invoke-direct {p0}, Ll7/f;->d0()V

    invoke-direct {p0, p1, p2}, Ll7/f;->c0(J)Z

    move-result p3

    goto :goto_0

    :cond_0
    return-void
.end method
