.class final Lb8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls8/e0$b<",
        "Ls8/g0<",
        "Lb8/i;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Ls8/e0;

.field private final c:Ls8/j;

.field private d:Lb8/g;

.field private e:J

.field private f:J

.field private r:J

.field private s:J

.field private t:Z

.field private u:Ljava/io/IOException;

.field final synthetic v:Lb8/c;


# direct methods
.method public constructor <init>(Lb8/c;Landroid/net/Uri;)V
    .locals 1

    iput-object p1, p0, Lb8/c$c;->v:Lb8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb8/c$c;->a:Landroid/net/Uri;

    new-instance p2, Ls8/e0;

    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    invoke-direct {p2, v0}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lb8/c$c;->b:Ls8/e0;

    invoke-static {p1}, Lb8/c;->B(Lb8/c;)La8/g;

    move-result-object p1

    const/4 p2, 0x4

    invoke-interface {p1, p2}, La8/g;->a(I)Ls8/j;

    move-result-object p1

    iput-object p1, p0, Lb8/c$c;->c:Ls8/j;

    return-void
.end method

.method public static synthetic a(Lb8/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lb8/c$c;->o(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic b(Lb8/c$c;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lb8/c$c;->j(J)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lb8/c$c;Lb8/g;Lv7/u;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb8/c$c;->w(Lb8/g;Lv7/u;)V

    return-void
.end method

.method static synthetic d(Lb8/c$c;)J
    .locals 2

    iget-wide v0, p0, Lb8/c$c;->s:J

    return-wide v0
.end method

.method static synthetic e(Lb8/c$c;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lb8/c$c;->a:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic f(Lb8/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lb8/c$c;->r(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic g(Lb8/c$c;)Lb8/g;
    .locals 0

    iget-object p0, p0, Lb8/c$c;->d:Lb8/g;

    return-object p0
.end method

.method private j(J)Z
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Lb8/c$c;->s:J

    iget-object p1, p0, Lb8/c$c;->a:Landroid/net/Uri;

    iget-object p2, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {p2}, Lb8/c;->w(Lb8/c;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {p1}, Lb8/c;->x(Lb8/c;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private k()Landroid/net/Uri;
    .locals 7

    iget-object v0, p0, Lb8/c$c;->d:Lb8/g;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lb8/g;->v:Lb8/g$f;

    iget-wide v1, v0, Lb8/g$f;->a:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-boolean v0, v0, Lb8/g$f;->e:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lb8/c$c;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, Lb8/c$c;->d:Lb8/g;

    iget-object v2, v1, Lb8/g;->v:Lb8/g$f;

    iget-boolean v2, v2, Lb8/g$f;->e:Z

    if-eqz v2, :cond_2

    iget-wide v5, v1, Lb8/g;->k:J

    iget-object v1, v1, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v1, v1

    add-long/2addr v5, v1

    const-string v1, "_HLS_msn"

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget-object v1, p0, Lb8/c$c;->d:Lb8/g;

    iget-wide v5, v1, Lb8/g;->n:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2

    iget-object v1, v1, Lb8/g;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v1}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/g$b;

    iget-boolean v1, v1, Lb8/g$b;->x:Z

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    const-string v1, "_HLS_part"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_2
    iget-object v1, p0, Lb8/c$c;->d:Lb8/g;

    iget-object v1, v1, Lb8/g;->v:Lb8/g$f;

    iget-wide v5, v1, Lb8/g$f;->a:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_4

    iget-boolean v1, v1, Lb8/g$f;->b:Z

    if-eqz v1, :cond_3

    const-string v1, "v2"

    goto :goto_0

    :cond_3
    const-string v1, "YES"

    :goto_0
    const-string v2, "_HLS_skip"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_5
    :goto_1
    iget-object v0, p0, Lb8/c$c;->a:Landroid/net/Uri;

    return-object v0
.end method

.method private synthetic o(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb8/c$c;->t:Z

    invoke-direct {p0, p1}, Lb8/c$c;->q(Landroid/net/Uri;)V

    return-void
.end method

.method private q(Landroid/net/Uri;)V
    .locals 8

    iget-object v0, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v0}, Lb8/c;->s(Lb8/c;)Lb8/k;

    move-result-object v0

    iget-object v1, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v1}, Lb8/c;->r(Lb8/c;)Lb8/h;

    move-result-object v1

    iget-object v2, p0, Lb8/c$c;->d:Lb8/g;

    invoke-interface {v0, v1, v2}, Lb8/k;->a(Lb8/h;Lb8/g;)Ls8/g0$a;

    move-result-object v0

    new-instance v1, Ls8/g0;

    iget-object v2, p0, Lb8/c$c;->c:Ls8/j;

    const/4 v3, 0x4

    invoke-direct {v1, v2, p1, v3, v0}, Ls8/g0;-><init>(Ls8/j;Landroid/net/Uri;ILs8/g0$a;)V

    iget-object p1, p0, Lb8/c$c;->b:Ls8/e0;

    iget-object v0, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v0}, Lb8/c;->D(Lb8/c;)Ls8/d0;

    move-result-object v0

    iget v2, v1, Ls8/g0;->c:I

    invoke-interface {v0, v2}, Ls8/d0;->a(I)I

    move-result v0

    invoke-virtual {p1, v1, p0, v0}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    move-result-wide v6

    iget-object p1, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {p1}, Lb8/c;->C(Lb8/c;)Lv7/h0$a;

    move-result-object p1

    new-instance v0, Lv7/u;

    iget-wide v3, v1, Ls8/g0;->a:J

    iget-object v5, v1, Ls8/g0;->b:Ls8/n;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lv7/u;-><init>(JLs8/n;J)V

    iget v1, v1, Ls8/g0;->c:I

    invoke-virtual {p1, v0, v1}, Lv7/h0$a;->z(Lv7/u;I)V

    return-void
.end method

.method private r(Landroid/net/Uri;)V
    .locals 6

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lb8/c$c;->s:J

    iget-boolean v0, p0, Lb8/c$c;->t:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lb8/c$c;->b:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lb8/c$c;->b:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lb8/c$c;->r:J

    cmp-long v2, v0, v2

    if-gez v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lb8/c$c;->t:Z

    iget-object v2, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v2}, Lb8/c;->q(Lb8/c;)Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lb8/d;

    invoke-direct {v3, p0, p1}, Lb8/d;-><init>(Lb8/c$c;Landroid/net/Uri;)V

    iget-wide v4, p0, Lb8/c$c;->r:J

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lb8/c$c;->q(Landroid/net/Uri;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private w(Lb8/g;Lv7/u;)V
    .locals 13

    iget-object v0, p0, Lb8/c$c;->d:Lb8/g;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lb8/c$c;->e:J

    iget-object v3, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v3, v0, p1}, Lb8/c;->t(Lb8/c;Lb8/g;Lb8/g;)Lb8/g;

    move-result-object v3

    iput-object v3, p0, Lb8/c$c;->d:Lb8/g;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v0, :cond_0

    iput-object v5, p0, Lb8/c$c;->u:Ljava/io/IOException;

    iput-wide v1, p0, Lb8/c$c;->f:J

    iget-object p1, p0, Lb8/c$c;->v:Lb8/c;

    iget-object p2, p0, Lb8/c$c;->a:Landroid/net/Uri;

    invoke-static {p1, p2, v3}, Lb8/c;->u(Lb8/c;Landroid/net/Uri;Lb8/g;)V

    goto :goto_1

    :cond_0
    iget-boolean v3, v3, Lb8/g;->o:Z

    if-nez v3, :cond_3

    iget-wide v7, p1, Lb8/g;->k:J

    iget-object p1, p1, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    int-to-long v9, p1

    add-long/2addr v7, v9

    iget-object p1, p0, Lb8/c$c;->d:Lb8/g;

    iget-wide v9, p1, Lb8/g;->k:J

    cmp-long v3, v7, v9

    if-gez v3, :cond_1

    new-instance v5, Lb8/l$c;

    iget-object p1, p0, Lb8/c$c;->a:Landroid/net/Uri;

    invoke-direct {v5, p1}, Lb8/l$c;-><init>(Landroid/net/Uri;)V

    move p1, v6

    goto :goto_0

    :cond_1
    iget-wide v7, p0, Lb8/c$c;->f:J

    sub-long v7, v1, v7

    long-to-double v7, v7

    iget-wide v9, p1, Lb8/g;->m:J

    invoke-static {v9, v10}, Lt8/r0;->a1(J)J

    move-result-wide v9

    long-to-double v9, v9

    iget-object p1, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {p1}, Lb8/c;->v(Lb8/c;)D

    move-result-wide v11

    mul-double/2addr v9, v11

    cmpl-double p1, v7, v9

    if-lez p1, :cond_2

    new-instance v5, Lb8/l$d;

    iget-object p1, p0, Lb8/c$c;->a:Landroid/net/Uri;

    invoke-direct {v5, p1}, Lb8/l$d;-><init>(Landroid/net/Uri;)V

    :cond_2
    move p1, v4

    :goto_0
    if-eqz v5, :cond_3

    iput-object v5, p0, Lb8/c$c;->u:Ljava/io/IOException;

    iget-object v3, p0, Lb8/c$c;->v:Lb8/c;

    iget-object v7, p0, Lb8/c$c;->a:Landroid/net/Uri;

    new-instance v8, Ls8/d0$c;

    new-instance v9, Lv7/x;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Lv7/x;-><init>(I)V

    invoke-direct {v8, p2, v9, v5, v6}, Ls8/d0$c;-><init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V

    invoke-static {v3, v7, v8, p1}, Lb8/c;->p(Lb8/c;Landroid/net/Uri;Ls8/d0$c;Z)Z

    :cond_3
    :goto_1
    iget-object p1, p0, Lb8/c$c;->d:Lb8/g;

    iget-object p2, p1, Lb8/g;->v:Lb8/g$f;

    iget-boolean p2, p2, Lb8/g$f;->e:Z

    if-nez p2, :cond_5

    if-eq p1, v0, :cond_4

    iget-wide p1, p1, Lb8/g;->m:J

    goto :goto_2

    :cond_4
    iget-wide p1, p1, Lb8/g;->m:J

    const-wide/16 v7, 0x2

    div-long/2addr p1, v7

    goto :goto_2

    :cond_5
    const-wide/16 p1, 0x0

    :goto_2
    invoke-static {p1, p2}, Lt8/r0;->a1(J)J

    move-result-wide p1

    add-long/2addr v1, p1

    iput-wide v1, p0, Lb8/c$c;->r:J

    iget-object p1, p0, Lb8/c$c;->d:Lb8/g;

    iget-wide p1, p1, Lb8/g;->n:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v0

    if-nez p1, :cond_6

    iget-object p1, p0, Lb8/c$c;->a:Landroid/net/Uri;

    iget-object p2, p0, Lb8/c$c;->v:Lb8/c;

    invoke-static {p2}, Lb8/c;->w(Lb8/c;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    move v4, v6

    :cond_7
    if-eqz v4, :cond_8

    iget-object p1, p0, Lb8/c$c;->d:Lb8/g;

    iget-boolean p1, p1, Lb8/g;->o:Z

    if-nez p1, :cond_8

    invoke-direct {p0}, Lb8/c$c;->k()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p0, p1}, Lb8/c$c;->r(Landroid/net/Uri;)V

    :cond_8
    return-void
.end method


# virtual methods
.method public bridge synthetic h(Ls8/e0$e;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    check-cast p1, Ls8/g0;

    invoke-virtual/range {p0 .. p7}, Lb8/c$c;->v(Ls8/g0;JJLjava/io/IOException;I)Ls8/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ls8/e0$e;JJZ)V
    .locals 0

    check-cast p1, Ls8/g0;

    invoke-virtual/range {p0 .. p6}, Lb8/c$c;->t(Ls8/g0;JJZ)V

    return-void
.end method

.method public l()Lb8/g;
    .locals 1

    iget-object v0, p0, Lb8/c$c;->d:Lb8/g;

    return-object v0
.end method

.method public bridge synthetic m(Ls8/e0$e;JJ)V
    .locals 0

    check-cast p1, Ls8/g0;

    invoke-virtual/range {p0 .. p5}, Lb8/c$c;->u(Ls8/g0;JJ)V

    return-void
.end method

.method public n()Z
    .locals 10

    iget-object v0, p0, Lb8/c$c;->d:Lb8/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, p0, Lb8/c$c;->d:Lb8/g;

    iget-wide v4, v0, Lb8/g;->u:J

    invoke-static {v4, v5}, Lt8/r0;->a1(J)J

    move-result-wide v4

    const-wide/16 v6, 0x7530

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object v0, p0, Lb8/c$c;->d:Lb8/g;

    iget-boolean v6, v0, Lb8/g;->o:Z

    const/4 v7, 0x1

    if-nez v6, :cond_1

    iget v0, v0, Lb8/g;->d:I

    const/4 v6, 0x2

    if-eq v0, v6, :cond_1

    if-eq v0, v7, :cond_1

    iget-wide v8, p0, Lb8/c$c;->e:J

    add-long/2addr v8, v4

    cmp-long v0, v8, v2

    if-lez v0, :cond_2

    :cond_1
    move v1, v7

    :cond_2
    return v1
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lb8/c$c;->a:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lb8/c$c;->r(Landroid/net/Uri;)V

    return-void
.end method

.method public s()V
    .locals 1

    iget-object v0, p0, Lb8/c$c;->b:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->a()V

    iget-object v0, p0, Lb8/c$c;->u:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public t(Ls8/g0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/g0<",
            "Lb8/i;",
            ">;JJZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lv7/u;

    iget-wide v3, v1, Ls8/g0;->a:J

    iget-object v5, v1, Ls8/g0;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->a()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v2}, Lb8/c;->D(Lb8/c;)Ls8/d0;

    move-result-object v2

    iget-wide v3, v1, Ls8/g0;->a:J

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    iget-object v1, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v1}, Lb8/c;->C(Lb8/c;)Lv7/h0$a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v14, v2}, Lv7/h0$a;->q(Lv7/u;I)V

    return-void
.end method

.method public u(Ls8/g0;JJ)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/g0<",
            "Lb8/i;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb8/i;

    new-instance v15, Lv7/u;

    iget-wide v4, v1, Ls8/g0;->a:J

    iget-object v6, v1, Ls8/g0;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->a()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    instance-of v3, v2, Lb8/g;

    const/4 v4, 0x4

    if-eqz v3, :cond_0

    check-cast v2, Lb8/g;

    invoke-direct {v0, v2, v15}, Lb8/c$c;->w(Lb8/g;Lv7/u;)V

    iget-object v2, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v2}, Lb8/c;->C(Lb8/c;)Lv7/h0$a;

    move-result-object v2

    invoke-virtual {v2, v15, v4}, Lv7/h0$a;->t(Lv7/u;I)V

    goto :goto_0

    :cond_0
    const-string v2, "Loaded playlist has unexpected type."

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lt6/b3;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object v2

    iput-object v2, v0, Lb8/c$c;->u:Ljava/io/IOException;

    iget-object v2, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v2}, Lb8/c;->C(Lb8/c;)Lv7/h0$a;

    move-result-object v2

    iget-object v3, v0, Lb8/c$c;->u:Ljava/io/IOException;

    const/4 v5, 0x1

    invoke-virtual {v2, v15, v4, v3, v5}, Lv7/h0$a;->x(Lv7/u;ILjava/io/IOException;Z)V

    :goto_0
    iget-object v2, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v2}, Lb8/c;->D(Lb8/c;)Ls8/d0;

    move-result-object v2

    iget-wide v3, v1, Ls8/g0;->a:J

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    return-void
.end method

.method public v(Ls8/g0;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/g0<",
            "Lb8/i;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Ls8/e0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    new-instance v15, Lv7/u;

    iget-wide v4, v1, Ls8/g0;->a:J

    iget-object v6, v1, Ls8/g0;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->a()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-virtual/range {p1 .. p1}, Ls8/g0;->f()Landroid/net/Uri;

    move-result-object v3

    const-string v4, "_HLS_msn"

    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    instance-of v6, v2, Lb8/j$a;

    if-nez v3, :cond_1

    if-eqz v6, :cond_3

    :cond_1
    instance-of v3, v2, Ls8/a0;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Ls8/a0;

    iget v3, v3, Ls8/a0;->d:I

    goto :goto_1

    :cond_2
    const v3, 0x7fffffff

    :goto_1
    if-nez v6, :cond_7

    const/16 v6, 0x190

    if-eq v3, v6, :cond_7

    const/16 v6, 0x1f7

    if-ne v3, v6, :cond_3

    goto :goto_3

    :cond_3
    new-instance v3, Lv7/x;

    iget v6, v1, Ls8/g0;->c:I

    invoke-direct {v3, v6}, Lv7/x;-><init>(I)V

    new-instance v6, Ls8/d0$c;

    move/from16 v7, p7

    invoke-direct {v6, v15, v3, v2, v7}, Ls8/d0$c;-><init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V

    iget-object v3, v0, Lb8/c$c;->v:Lb8/c;

    iget-object v7, v0, Lb8/c$c;->a:Landroid/net/Uri;

    invoke-static {v3, v7, v6, v5}, Lb8/c;->p(Lb8/c;Landroid/net/Uri;Ls8/d0$c;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v3}, Lb8/c;->D(Lb8/c;)Ls8/d0;

    move-result-object v3

    invoke-interface {v3, v6}, Ls8/d0;->d(Ls8/d0$c;)J

    move-result-wide v6

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v6, v8

    if-eqz v3, :cond_4

    invoke-static {v5, v6, v7}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v3

    goto :goto_2

    :cond_4
    sget-object v3, Ls8/e0;->g:Ls8/e0$c;

    goto :goto_2

    :cond_5
    sget-object v3, Ls8/e0;->f:Ls8/e0$c;

    :goto_2
    invoke-virtual {v3}, Ls8/e0$c;->c()Z

    move-result v5

    xor-int/2addr v4, v5

    iget-object v5, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v5}, Lb8/c;->C(Lb8/c;)Lv7/h0$a;

    move-result-object v5

    iget v6, v1, Ls8/g0;->c:I

    invoke-virtual {v5, v15, v6, v2, v4}, Lv7/h0$a;->x(Lv7/u;ILjava/io/IOException;Z)V

    if-eqz v4, :cond_6

    iget-object v2, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v2}, Lb8/c;->D(Lb8/c;)Ls8/d0;

    move-result-object v2

    iget-wide v4, v1, Ls8/g0;->a:J

    invoke-interface {v2, v4, v5}, Ls8/d0;->c(J)V

    :cond_6
    return-object v3

    :cond_7
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iput-wide v5, v0, Lb8/c$c;->r:J

    invoke-virtual/range {p0 .. p0}, Lb8/c$c;->p()V

    iget-object v3, v0, Lb8/c$c;->v:Lb8/c;

    invoke-static {v3}, Lb8/c;->C(Lb8/c;)Lv7/h0$a;

    move-result-object v3

    invoke-static {v3}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/h0$a;

    iget v1, v1, Ls8/g0;->c:I

    invoke-virtual {v3, v15, v1, v2, v4}, Lv7/h0$a;->x(Lv7/u;ILjava/io/IOException;Z)V

    sget-object v1, Ls8/e0;->f:Ls8/e0$c;

    return-object v1
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, Lb8/c$c;->b:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->l()V

    return-void
.end method
