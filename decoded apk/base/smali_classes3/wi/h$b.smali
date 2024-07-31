.class Lwi/h$b;
.super Lio/grpc/internal/t0;
.source "SourceFile"

# interfaces
.implements Lwi/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxi/d;",
            ">;"
        }
    .end annotation
.end field

.field private B:Ldm/b;

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:I

.field private G:I

.field private final H:Lwi/b;

.field private final I:Lwi/q;

.field private final J:Lwi/i;

.field private K:Z

.field private final L:Lcj/d;

.field private M:Lwi/q$c;

.field private N:I

.field final synthetic O:Lwi/h;

.field private final y:I

.field private final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwi/h;ILio/grpc/internal/h2;Ljava/lang/Object;Lwi/b;Lwi/q;Lwi/i;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {p1}, Lwi/h;->C(Lwi/h;)Lio/grpc/internal/n2;

    move-result-object p1

    invoke-direct {p0, p2, p3, p1}, Lio/grpc/internal/t0;-><init>(ILio/grpc/internal/h2;Lio/grpc/internal/n2;)V

    new-instance p1, Ldm/b;

    invoke-direct {p1}, Ldm/b;-><init>()V

    iput-object p1, p0, Lwi/h$b;->B:Ldm/b;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwi/h$b;->C:Z

    iput-boolean p1, p0, Lwi/h$b;->D:Z

    iput-boolean p1, p0, Lwi/h$b;->E:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lwi/h$b;->K:Z

    const/4 p1, -0x1

    iput p1, p0, Lwi/h$b;->N:I

    const-string p1, "lock"

    invoke-static {p4, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lwi/h$b;->z:Ljava/lang/Object;

    iput-object p5, p0, Lwi/h$b;->H:Lwi/b;

    iput-object p6, p0, Lwi/h$b;->I:Lwi/q;

    iput-object p7, p0, Lwi/h$b;->J:Lwi/i;

    iput p8, p0, Lwi/h$b;->F:I

    iput p8, p0, Lwi/h$b;->G:I

    iput p8, p0, Lwi/h$b;->y:I

    invoke-static {p9}, Lcj/c;->a(Ljava/lang/String;)Lcj/d;

    move-result-object p1

    iput-object p1, p0, Lwi/h$b;->L:Lcj/d;

    return-void
.end method

.method static synthetic W(Lwi/h$b;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lwi/h$b;->z:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic X(Lwi/h$b;Lvi/w0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lwi/h$b;->g0(Lvi/w0;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Y(Lwi/h$b;Ldm/b;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwi/h$b;->e0(Ldm/b;ZZ)V

    return-void
.end method

.method static synthetic Z(Lwi/h$b;Lvi/g1;ZLvi/w0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwi/h$b;->a0(Lvi/g1;ZLvi/w0;)V

    return-void
.end method

.method private a0(Lvi/g1;ZLvi/w0;)V
    .locals 8

    iget-boolean v0, p0, Lwi/h$b;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lwi/h$b;->E:Z

    iget-boolean v1, p0, Lwi/h$b;->K:Z

    if-eqz v1, :cond_2

    iget-object p2, p0, Lwi/h$b;->J:Lwi/i;

    iget-object v1, p0, Lwi/h$b;->O:Lwi/h;

    invoke-virtual {p2, v1}, Lwi/i;->h0(Lwi/h;)V

    const/4 p2, 0x0

    iput-object p2, p0, Lwi/h$b;->A:Ljava/util/List;

    iget-object p2, p0, Lwi/h$b;->B:Ldm/b;

    invoke-virtual {p2}, Ldm/b;->b()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lwi/h$b;->K:Z

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p3, Lvi/w0;

    invoke-direct {p3}, Lvi/w0;-><init>()V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lio/grpc/internal/a$c;->N(Lvi/g1;ZLvi/w0;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lwi/h$b;->J:Lwi/i;

    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result v2

    sget-object v4, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    sget-object v6, Lxi/a;->CANCEL:Lxi/a;

    move-object v3, p1

    move v5, p2

    move-object v7, p3

    invoke-virtual/range {v1 .. v7}, Lwi/i;->U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V

    :goto_1
    return-void
.end method

.method private d0()V
    .locals 15

    invoke-virtual {p0}, Lio/grpc/internal/a$c;->G()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lwi/h$b;->J:Lwi/i;

    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result v2

    const/4 v3, 0x0

    sget-object v4, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    const/4 v5, 0x0

    sget-object v6, Lxi/a;->CANCEL:Lxi/a;

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lwi/i;->U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V

    goto :goto_0

    :cond_0
    iget-object v8, p0, Lwi/h$b;->J:Lwi/i;

    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result v9

    const/4 v10, 0x0

    sget-object v11, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v8 .. v14}, Lwi/i;->U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V

    :goto_0
    return-void
.end method

.method private e0(Ldm/b;ZZ)V
    .locals 4

    iget-boolean v0, p0, Lwi/h$b;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lwi/h$b;->K:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ldm/b;->size()J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, Lwi/h$b;->B:Ldm/b;

    int-to-long v2, v0

    invoke-virtual {v1, p1, v2, v3}, Ldm/b;->K0(Ldm/b;J)V

    iget-boolean p1, p0, Lwi/h$b;->C:Z

    or-int/2addr p1, p2

    iput-boolean p1, p0, Lwi/h$b;->C:Z

    iget-boolean p1, p0, Lwi/h$b;->D:Z

    or-int/2addr p1, p3

    iput-boolean p1, p0, Lwi/h$b;->D:Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-string v1, "streamId should be set"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lwi/h$b;->I:Lwi/q;

    iget-object v1, p0, Lwi/h$b;->M:Lwi/q$c;

    invoke-virtual {v0, p2, v1, p1, p3}, Lwi/q;->d(ZLwi/q$c;Ldm/b;Z)V

    :goto_1
    return-void
.end method

.method private g0(Lvi/w0;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {v0}, Lwi/h;->F(Lwi/h;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {v0}, Lwi/h;->G(Lwi/h;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {v0}, Lwi/h;->B(Lwi/h;)Z

    move-result v5

    iget-object v0, p0, Lwi/h$b;->J:Lwi/i;

    invoke-virtual {v0}, Lwi/i;->b0()Z

    move-result v6

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lwi/d;->b(Lvi/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwi/h$b;->A:Ljava/util/List;

    iget-object p1, p0, Lwi/h$b;->J:Lwi/i;

    iget-object p2, p0, Lwi/h$b;->O:Lwi/h;

    invoke-virtual {p1, p2}, Lwi/i;->o0(Lwi/h;)V

    return-void
.end method


# virtual methods
.method protected P(Lvi/g1;ZLvi/w0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwi/h$b;->a0(Lvi/g1;ZLvi/w0;)V

    return-void
.end method

.method b0()Lwi/q$c;
    .locals 2

    iget-object v0, p0, Lwi/h$b;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/h$b;->M:Lwi/q$c;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(I)V
    .locals 4

    iget v0, p0, Lwi/h$b;->G:I

    sub-int/2addr v0, p1

    iput v0, p0, Lwi/h$b;->G:I

    int-to-float p1, v0

    iget v1, p0, Lwi/h$b;->y:I

    int-to-float v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    cmpg-float p1, p1, v2

    if-gtz p1, :cond_0

    sub-int/2addr v1, v0

    iget p1, p0, Lwi/h$b;->F:I

    add-int/2addr p1, v1

    iput p1, p0, Lwi/h$b;->F:I

    add-int/2addr v0, v1

    iput v0, p0, Lwi/h$b;->G:I

    iget-object p1, p0, Lwi/h$b;->H:Lwi/b;

    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result v0

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Lwi/b;->d(IJ)V

    :cond_0
    return-void
.end method

.method c0()I
    .locals 1

    iget v0, p0, Lwi/h$b;->N:I

    return v0
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {p1}, Lvi/g1;->l(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p1

    new-instance v0, Lvi/w0;

    invoke-direct {v0}, Lvi/w0;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v0}, Lwi/h$b;->P(Lvi/g1;ZLvi/w0;)V

    return-void
.end method

.method public e(Z)V
    .locals 0

    invoke-direct {p0}, Lwi/h$b;->d0()V

    invoke-super {p0, p1}, Lio/grpc/internal/t0;->e(Z)V

    return-void
.end method

.method public f(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lwi/h$b;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f0(I)V
    .locals 9

    iget v0, p0, Lwi/h$b;->N:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v1, "the stream has been started with id %s"

    invoke-static {v0, v1, p1}, Leb/o;->x(ZLjava/lang/String;I)V

    iput p1, p0, Lwi/h$b;->N:I

    iget-object v0, p0, Lwi/h$b;->I:Lwi/q;

    invoke-virtual {v0, p0, p1}, Lwi/q;->c(Lwi/q$b;I)Lwi/q$c;

    move-result-object p1

    iput-object p1, p0, Lwi/h$b;->M:Lwi/q$c;

    iget-object p1, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {p1}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object p1

    invoke-virtual {p1}, Lwi/h$b;->r()V

    iget-boolean p1, p0, Lwi/h$b;->K:Z

    if-eqz p1, :cond_2

    iget-object v3, p0, Lwi/h$b;->H:Lwi/b;

    iget-object p1, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {p1}, Lwi/h;->B(Lwi/h;)Z

    move-result v4

    const/4 v5, 0x0

    iget v6, p0, Lwi/h$b;->N:I

    const/4 v7, 0x0

    iget-object v8, p0, Lwi/h$b;->A:Ljava/util/List;

    invoke-virtual/range {v3 .. v8}, Lwi/b;->r1(ZZIILjava/util/List;)V

    iget-object p1, p0, Lwi/h$b;->O:Lwi/h;

    invoke-static {p1}, Lwi/h;->E(Lwi/h;)Lio/grpc/internal/h2;

    move-result-object p1

    invoke-virtual {p1}, Lio/grpc/internal/h2;->c()V

    const/4 p1, 0x0

    iput-object p1, p0, Lwi/h$b;->A:Ljava/util/List;

    iget-object p1, p0, Lwi/h$b;->B:Ldm/b;

    invoke-virtual {p1}, Ldm/b;->size()J

    move-result-wide v0

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-lez p1, :cond_1

    iget-object p1, p0, Lwi/h$b;->I:Lwi/q;

    iget-boolean v0, p0, Lwi/h$b;->C:Z

    iget-object v1, p0, Lwi/h$b;->M:Lwi/q$c;

    iget-object v3, p0, Lwi/h$b;->B:Ldm/b;

    iget-boolean v4, p0, Lwi/h$b;->D:Z

    invoke-virtual {p1, v0, v1, v3, v4}, Lwi/q;->d(ZLwi/q$c;Ldm/b;Z)V

    :cond_1
    iput-boolean v2, p0, Lwi/h$b;->K:Z

    :cond_2
    return-void
.end method

.method h0()Lcj/d;
    .locals 1

    iget-object v0, p0, Lwi/h$b;->L:Lcj/d;

    return-object v0
.end method

.method public i0(Ldm/b;Z)V
    .locals 8

    invoke-virtual {p1}, Ldm/b;->size()J

    move-result-wide v0

    long-to-int v0, v0

    iget v1, p0, Lwi/h$b;->F:I

    sub-int/2addr v1, v0

    iput v1, p0, Lwi/h$b;->F:I

    if-gez v1, :cond_0

    iget-object p1, p0, Lwi/h$b;->H:Lwi/b;

    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result p2

    sget-object v0, Lxi/a;->FLOW_CONTROL_ERROR:Lxi/a;

    invoke-virtual {p1, p2, v0}, Lwi/b;->s(ILxi/a;)V

    iget-object v1, p0, Lwi/h$b;->J:Lwi/i;

    invoke-virtual {p0}, Lwi/h$b;->c0()I

    move-result v2

    sget-object p1, Lvi/g1;->t:Lvi/g1;

    const-string p2, "Received data size exceeded our receiving window size"

    invoke-virtual {p1, p2}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    sget-object v4, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lwi/i;->U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V

    return-void

    :cond_0
    new-instance v0, Lwi/l;

    invoke-direct {v0, p1}, Lwi/l;-><init>(Ldm/b;)V

    invoke-super {p0, v0, p2}, Lio/grpc/internal/t0;->S(Lio/grpc/internal/u1;Z)V

    return-void
.end method

.method public j0(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-static {p1}, Lwi/r;->c(Ljava/util/List;)Lvi/w0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/t0;->U(Lvi/w0;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lwi/r;->a(Ljava/util/List;)Lvi/w0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/t0;->T(Lvi/w0;)V

    :goto_0
    return-void
.end method

.method protected r()V
    .locals 1

    invoke-super {p0}, Lio/grpc/internal/d$a;->r()V

    invoke-virtual {p0}, Lio/grpc/internal/d$a;->m()Lio/grpc/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/n2;->c()V

    return-void
.end method
