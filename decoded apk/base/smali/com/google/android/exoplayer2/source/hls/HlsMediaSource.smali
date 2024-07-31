.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Lv7/a;
.source "SourceFile"

# interfaces
.implements Lb8/l$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:Lb8/l;

.field private final C:J

.field private final D:Lt6/c2;

.field private E:Lt6/c2$g;

.field private F:Ls8/m0;

.field private final s:La8/h;

.field private final t:Lt6/c2$h;

.field private final u:La8/g;

.field private final v:Lv7/i;

.field private final w:Lx6/v;

.field private final x:Ls8/d0;

.field private final y:Z

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Lt6/r1;->a(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lt6/c2;La8/g;La8/h;Lv7/i;Lx6/v;Ls8/d0;Lb8/l;JZIZ)V
    .locals 1

    invoke-direct {p0}, Lv7/a;-><init>()V

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/c2$h;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lt6/c2$h;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lt6/c2;

    iget-object p1, p1, Lt6/c2;->d:Lt6/c2$g;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:La8/g;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:La8/h;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lv7/i;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Lx6/v;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:Ls8/d0;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:J

    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Z

    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:I

    iput-boolean p12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Z

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2;La8/g;La8/h;Lv7/i;Lx6/v;Ls8/d0;Lb8/l;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Lt6/c2;La8/g;La8/h;Lv7/i;Lx6/v;Ls8/d0;Lb8/l;JZIZ)V

    return-void
.end method

.method private F(Lb8/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lv7/y0;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v1, Lb8/g;->h:J

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    invoke-interface {v4}, Lb8/l;->c()J

    move-result-wide v4

    sub-long v17, v2, v4

    iget-boolean v2, v1, Lb8/g;->o:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_0

    iget-wide v5, v1, Lb8/g;->u:J

    add-long v5, v17, v5

    move-wide v13, v5

    goto :goto_0

    :cond_0
    move-wide v13, v3

    :goto_0
    invoke-direct/range {p0 .. p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->J(Lb8/g;)J

    move-result-wide v11

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    iget-wide v5, v2, Lt6/c2$g;->a:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_1

    invoke-static {v5, v6}, Lt8/r0;->C0(J)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    invoke-static {v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->L(Lb8/g;J)J

    move-result-wide v2

    :goto_1
    move-wide v5, v2

    iget-wide v2, v1, Lb8/g;->u:J

    add-long v9, v2, v11

    move-wide v7, v11

    invoke-static/range {v5 .. v10}, Lt8/r0;->r(JJJ)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->M(Lb8/g;J)V

    invoke-direct {v0, v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->K(Lb8/g;J)J

    move-result-wide v19

    iget v2, v1, Lb8/g;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    iget-boolean v2, v1, Lb8/g;->f:Z

    if-eqz v2, :cond_2

    move/from16 v23, v4

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    move/from16 v23, v2

    :goto_2
    new-instance v2, Lv7/y0;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v9, v1, Lb8/g;->u:J

    const/16 v21, 0x1

    iget-boolean v1, v1, Lb8/g;->o:Z

    xor-int/lit8 v22, v1, 0x1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lt6/c2;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    move-object/from16 v26, v1

    move-object v6, v2

    move-wide/from16 v7, p2

    move-wide v3, v9

    move-wide/from16 v9, p4

    move-wide v15, v3

    move-object/from16 v24, p6

    invoke-direct/range {v6 .. v26}, Lv7/y0;-><init>(JJJJJJJZZZLjava/lang/Object;Lt6/c2;Lt6/c2$g;)V

    return-object v2
.end method

.method private G(Lb8/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lv7/y0;
    .locals 24

    move-object/from16 v0, p1

    iget-wide v1, v0, Lb8/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    iget-object v1, v0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, v0, Lb8/g;->g:Z

    if-nez v1, :cond_2

    iget-wide v1, v0, Lb8/g;->e:J

    iget-wide v3, v0, Lb8/g;->u:J

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lb8/g;->r:Ljava/util/List;

    invoke-static {v3, v1, v2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)Lb8/g$d;

    move-result-object v1

    iget-wide v1, v1, Lb8/g$e;->e:J

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v1, v0, Lb8/g;->e:J

    goto :goto_2

    :cond_3
    :goto_1
    const-wide/16 v1, 0x0

    :goto_2
    move-wide/from16 v16, v1

    new-instance v1, Lv7/y0;

    move-object v3, v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v10, v0, Lb8/g;->u:J

    move-wide v12, v10

    const-wide/16 v14, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lt6/c2;

    move-object/from16 v22, v2

    const/16 v23, 0x0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v21, p6

    invoke-direct/range {v3 .. v23}, Lv7/y0;-><init>(JJJJJJJZZZLjava/lang/Object;Lt6/c2;Lt6/c2$g;)V

    return-object v1
.end method

.method private static H(Ljava/util/List;J)Lb8/g$b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb8/g$b;",
            ">;J)",
            "Lb8/g$b;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb8/g$b;

    iget-wide v3, v2, Lb8/g$e;->e:J

    cmp-long v5, v3, p1

    if-gtz v5, :cond_0

    iget-boolean v5, v2, Lb8/g$b;->w:Z

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    cmp-long v2, v3, p1

    if-lez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method

.method private static I(Ljava/util/List;J)Lb8/g$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb8/g$d;",
            ">;J)",
            "Lb8/g$d;"
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p0, p1, p2, p2}, Lt8/r0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb8/g$d;

    return-object p0
.end method

.method private J(Lb8/g;)J
    .locals 4

    iget-boolean v0, p1, Lb8/g;->p:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:J

    invoke-static {v0, v1}, Lt8/r0;->b0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lt8/r0;->C0(J)J

    move-result-wide v0

    invoke-virtual {p1}, Lb8/g;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method private K(Lb8/g;J)J
    .locals 4

    iget-wide v0, p1, Lb8/g;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p1, Lb8/g;->u:J

    add-long/2addr v0, p2

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    iget-wide p2, p2, Lt6/c2$g;->a:J

    invoke-static {p2, p3}, Lt8/r0;->C0(J)J

    move-result-wide p2

    sub-long/2addr v0, p2

    :goto_0
    iget-boolean p2, p1, Lb8/g;->g:Z

    if-eqz p2, :cond_1

    return-wide v0

    :cond_1
    iget-object p2, p1, Lb8/g;->s:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)Lb8/g$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-wide p1, p2, Lb8/g$e;->e:J

    return-wide p1

    :cond_2
    iget-object p2, p1, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_3
    iget-object p1, p1, Lb8/g;->r:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)Lb8/g$d;

    move-result-object p1

    iget-object p2, p1, Lb8/g$d;->x:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)Lb8/g$b;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-wide p1, p2, Lb8/g$e;->e:J

    return-wide p1

    :cond_4
    iget-wide p1, p1, Lb8/g$e;->e:J

    return-wide p1
.end method

.method private static L(Lb8/g;J)J
    .locals 7

    iget-object v0, p0, Lb8/g;->v:Lb8/g$f;

    iget-wide v1, p0, Lb8/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v3, p0, Lb8/g;->u:J

    sub-long/2addr v3, v1

    goto :goto_0

    :cond_0
    iget-wide v1, v0, Lb8/g$f;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, p0, Lb8/g;->n:J

    cmp-long v5, v5, v3

    if-eqz v5, :cond_1

    move-wide v3, v1

    goto :goto_0

    :cond_1
    iget-wide v0, v0, Lb8/g$f;->c:J

    cmp-long v2, v0, v3

    if-eqz v2, :cond_2

    move-wide v3, v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3

    iget-wide v2, p0, Lb8/g;->m:J

    mul-long v3, v2, v0

    :goto_0
    add-long/2addr v3, p1

    return-wide v3
.end method

.method private M(Lb8/g;J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lt6/c2;

    iget-object v0, v0, Lt6/c2;->d:Lt6/c2$g;

    iget v1, v0, Lt6/c2$g;->d:F

    const v2, -0x800001

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget v0, v0, Lt6/c2$g;->e:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p1, Lb8/g;->v:Lb8/g$f;

    iget-wide v0, p1, Lb8/g$f;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p1, Lb8/g$f;->d:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Lt6/c2$g$a;

    invoke-direct {v0}, Lt6/c2$g$a;-><init>()V

    invoke-static {p2, p3}, Lt8/r0;->a1(J)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Lt6/c2$g$a;->k(J)Lt6/c2$g$a;

    move-result-object p2

    const/high16 p3, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    move v0, p3

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    iget v0, v0, Lt6/c2$g;->d:F

    :goto_1
    invoke-virtual {p2, v0}, Lt6/c2$g$a;->j(F)Lt6/c2$g$a;

    move-result-object p2

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    iget p3, p1, Lt6/c2$g;->e:F

    :goto_2
    invoke-virtual {p2, p3}, Lt6/c2$g$a;->h(F)Lt6/c2$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lt6/c2$g$a;->f()Lt6/c2$g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:Lt6/c2$g;

    return-void
.end method


# virtual methods
.method protected C(Ls8/m0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Ls8/m0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Lx6/v;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lv7/a;->A()Lu6/m3;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lx6/v;->b(Landroid/os/Looper;Lu6/m3;)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Lx6/v;

    invoke-interface {p1}, Lx6/v;->a()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lv7/a;->w(Lv7/a0$b;)Lv7/h0$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lt6/c2$h;

    iget-object v1, v1, Lt6/c2$h;->a:Landroid/net/Uri;

    invoke-interface {v0, v1, p1, p0}, Lb8/l;->d(Landroid/net/Uri;Lv7/h0$a;Lb8/l$e;)V

    return-void
.end method

.method protected E()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    invoke-interface {v0}, Lb8/l;->stop()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Lx6/v;

    invoke-interface {v0}, Lx6/v;->release()V

    return-void
.end method

.method public d()Lt6/c2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lt6/c2;

    return-object v0
.end method

.method public e(Lv7/a0$b;Ls8/b;J)Lv7/y;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p1}, Lv7/a;->w(Lv7/a0$b;)Lv7/h0$a;

    move-result-object v9

    invoke-virtual/range {p0 .. p1}, Lv7/a;->u(Lv7/a0$b;)Lx6/u$a;

    move-result-object v7

    new-instance v16, La8/k;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:La8/h;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:La8/g;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Ls8/m0;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Lx6/v;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:Ls8/d0;

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lv7/i;

    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Z

    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:I

    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Z

    invoke-virtual/range {p0 .. p0}, Lv7/a;->A()Lu6/m3;

    move-result-object v15

    move-object/from16 v1, v16

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v15}, La8/k;-><init>(La8/h;Lb8/l;La8/g;Ls8/m0;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;Ls8/b;Lv7/i;ZIZLu6/m3;)V

    return-object v16
.end method

.method public l(Lv7/y;)V
    .locals 0

    check-cast p1, La8/k;

    invoke-virtual {p1}, La8/k;->A()V

    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    invoke-interface {v0}, Lb8/l;->l()V

    return-void
.end method

.method public r(Lb8/g;)V
    .locals 12

    iget-boolean v0, p1, Lb8/g;->p:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    iget-wide v3, p1, Lb8/g;->h:J

    invoke-static {v3, v4}, Lt8/r0;->a1(J)J

    move-result-wide v3

    move-wide v9, v3

    goto :goto_0

    :cond_0
    move-wide v9, v1

    :goto_0
    iget v0, p1, Lb8/g;->d:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move-wide v7, v1

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v7, v9

    :goto_2
    new-instance v11, Lcom/google/android/exoplayer2/source/hls/a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    invoke-interface {v0}, Lb8/l;->e()Lb8/h;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/h;

    invoke-direct {v11, v0, p1}, Lcom/google/android/exoplayer2/source/hls/a;-><init>(Lb8/h;Lb8/g;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lb8/l;

    invoke-interface {v0}, Lb8/l;->j()Z

    move-result v0

    move-object v5, p0

    move-object v6, p1

    if-eqz v0, :cond_3

    invoke-direct/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F(Lb8/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lv7/y0;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-direct/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G(Lb8/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lv7/y0;

    move-result-object p1

    :goto_3
    invoke-virtual {p0, p1}, Lv7/a;->D(Lt6/d4;)V

    return-void
.end method
