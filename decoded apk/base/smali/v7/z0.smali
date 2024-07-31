.class final Lv7/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Ls8/e0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/z0$c;,
        Lv7/z0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv7/y;",
        "Ls8/e0$b<",
        "Lv7/z0$c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ls8/n;

.field private final b:Ls8/j$a;

.field private final c:Ls8/m0;

.field private final d:Ls8/d0;

.field private final e:Lv7/h0$a;

.field private final f:Lv7/f1;

.field private final r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv7/z0$b;",
            ">;"
        }
    .end annotation
.end field

.field private final s:J

.field final t:Ls8/e0;

.field final u:Lt6/u1;

.field final v:Z

.field w:Z

.field x:[B

.field y:I


# direct methods
.method public constructor <init>(Ls8/n;Ls8/j$a;Ls8/m0;Lt6/u1;JLs8/d0;Lv7/h0$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/z0;->a:Ls8/n;

    iput-object p2, p0, Lv7/z0;->b:Ls8/j$a;

    iput-object p3, p0, Lv7/z0;->c:Ls8/m0;

    iput-object p4, p0, Lv7/z0;->u:Lt6/u1;

    iput-wide p5, p0, Lv7/z0;->s:J

    iput-object p7, p0, Lv7/z0;->d:Ls8/d0;

    iput-object p8, p0, Lv7/z0;->e:Lv7/h0$a;

    iput-boolean p9, p0, Lv7/z0;->v:Z

    new-instance p1, Lv7/f1;

    const/4 p2, 0x1

    new-array p3, p2, [Lv7/d1;

    new-instance p5, Lv7/d1;

    new-array p2, p2, [Lt6/u1;

    const/4 p6, 0x0

    aput-object p4, p2, p6

    invoke-direct {p5, p2}, Lv7/d1;-><init>([Lt6/u1;)V

    aput-object p5, p3, p6

    invoke-direct {p1, p3}, Lv7/f1;-><init>([Lv7/d1;)V

    iput-object p1, p0, Lv7/z0;->f:Lv7/f1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv7/z0;->r:Ljava/util/ArrayList;

    new-instance p1, Ls8/e0;

    const-string p2, "SingleSampleMediaPeriod"

    invoke-direct {p1, p2}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lv7/z0;->t:Ls8/e0;

    return-void
.end method

.method static synthetic a(Lv7/z0;)Lv7/h0$a;
    .locals 0

    iget-object p0, p0, Lv7/z0;->e:Lv7/h0$a;

    return-object p0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-boolean v0, p0, Lv7/z0;->w:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lv7/z0;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    :goto_1
    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 0

    return-wide p1
.end method

.method public d(Lv7/z0$c;JJZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {p1 .. p1}, Lv7/z0$c;->a(Lv7/z0$c;)Ls8/l0;

    move-result-object v2

    new-instance v15, Lv7/u;

    iget-wide v4, v1, Lv7/z0$c;->a:J

    iget-object v6, v1, Lv7/z0$c;->b:Ls8/n;

    invoke-virtual {v2}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v2}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v2}, Ls8/l0;->h()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lv7/z0;->d:Ls8/d0;

    iget-wide v3, v1, Lv7/z0$c;->a:J

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    iget-object v3, v0, Lv7/z0;->e:Lv7/h0$a;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    iget-wide v12, v0, Lv7/z0;->s:J

    move-object v4, v15

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->r(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public e(J)Z
    .locals 22

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lv7/z0;->w:Z

    if-nez v1, :cond_2

    iget-object v1, v0, Lv7/z0;->t:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->j()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lv7/z0;->t:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lv7/z0;->b:Ls8/j$a;

    invoke-interface {v1}, Ls8/j$a;->a()Ls8/j;

    move-result-object v1

    iget-object v2, v0, Lv7/z0;->c:Ls8/m0;

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ls8/j;->l(Ls8/m0;)V

    :cond_1
    new-instance v2, Lv7/z0$c;

    iget-object v3, v0, Lv7/z0;->a:Ls8/n;

    invoke-direct {v2, v3, v1}, Lv7/z0$c;-><init>(Ls8/n;Ls8/j;)V

    iget-object v1, v0, Lv7/z0;->t:Ls8/e0;

    iget-object v3, v0, Lv7/z0;->d:Ls8/d0;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ls8/d0;->a(I)I

    move-result v3

    invoke-virtual {v1, v2, v0, v3}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    move-result-wide v9

    iget-object v11, v0, Lv7/z0;->e:Lv7/h0$a;

    new-instance v12, Lv7/u;

    iget-wide v6, v2, Lv7/z0$c;->a:J

    iget-object v8, v0, Lv7/z0;->a:Ls8/n;

    move-object v5, v12

    invoke-direct/range {v5 .. v10}, Lv7/u;-><init>(JLs8/n;J)V

    const/4 v13, 0x1

    const/4 v14, -0x1

    iget-object v15, v0, Lv7/z0;->u:Lt6/u1;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    iget-wide v1, v0, Lv7/z0;->s:J

    move-wide/from16 v20, v1

    invoke-virtual/range {v11 .. v21}, Lv7/h0$a;->A(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return v4

    :cond_2
    :goto_0
    const/4 v1, 0x0

    return v1
.end method

.method public f()J
    .locals 2

    iget-boolean v0, p0, Lv7/z0;->w:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public g(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic h(Ls8/e0$e;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    check-cast p1, Lv7/z0$c;

    invoke-virtual/range {p0 .. p7}, Lv7/z0;->p(Lv7/z0$c;JJLjava/io/IOException;I)Ls8/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ls8/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lv7/z0$c;

    invoke-virtual/range {p0 .. p6}, Lv7/z0;->d(Lv7/z0$c;JJZ)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lv7/z0;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    return v0
.end method

.method public j(J)J
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lv7/z0;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lv7/z0;->r:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/z0$b;

    invoke-virtual {v1}, Lv7/z0$b;->c()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 0

    invoke-interface {p1, p0}, Lv7/y$a;->h(Lv7/y;)V

    return-void
.end method

.method public l()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public bridge synthetic m(Ls8/e0$e;JJ)V
    .locals 0

    check-cast p1, Lv7/z0$c;

    invoke-virtual/range {p0 .. p5}, Lv7/z0;->n(Lv7/z0$c;JJ)V

    return-void
.end method

.method public n(Lv7/z0$c;JJ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {p1 .. p1}, Lv7/z0$c;->a(Lv7/z0$c;)Ls8/l0;

    move-result-object v2

    invoke-virtual {v2}, Ls8/l0;->h()J

    move-result-wide v2

    long-to-int v2, v2

    iput v2, v0, Lv7/z0;->y:I

    invoke-static/range {p1 .. p1}, Lv7/z0$c;->d(Lv7/z0$c;)[B

    move-result-object v2

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iput-object v2, v0, Lv7/z0;->x:[B

    const/4 v2, 0x1

    iput-boolean v2, v0, Lv7/z0;->w:Z

    invoke-static/range {p1 .. p1}, Lv7/z0$c;->a(Lv7/z0$c;)Ls8/l0;

    move-result-object v2

    new-instance v15, Lv7/u;

    iget-wide v4, v1, Lv7/z0$c;->a:J

    iget-object v6, v1, Lv7/z0$c;->b:Ls8/n;

    invoke-virtual {v2}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v2}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v8

    iget v2, v0, Lv7/z0;->y:I

    int-to-long v13, v2

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lv7/z0;->d:Ls8/d0;

    iget-wide v3, v1, Lv7/z0$c;->a:J

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    iget-object v3, v0, Lv7/z0;->e:Lv7/h0$a;

    const/4 v5, 0x1

    const/4 v6, -0x1

    iget-object v7, v0, Lv7/z0;->u:Lt6/u1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    iget-wide v12, v0, Lv7/z0;->s:J

    move-object v4, v15

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->u(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p(Lv7/z0$c;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    move/from16 v2, p7

    invoke-static/range {p1 .. p1}, Lv7/z0$c;->a(Lv7/z0$c;)Ls8/l0;

    move-result-object v3

    new-instance v4, Lv7/u;

    iget-wide v5, v1, Lv7/z0$c;->a:J

    iget-object v7, v1, Lv7/z0$c;->b:Ls8/n;

    invoke-virtual {v3}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v18

    invoke-virtual {v3}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v19

    invoke-virtual {v3}, Ls8/l0;->h()J

    move-result-wide v24

    move-object v14, v4

    move-wide v15, v5

    move-object/from16 v17, v7

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    invoke-direct/range {v14 .. v25}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v3, Lv7/x;

    const/16 v27, 0x1

    const/16 v28, -0x1

    iget-object v5, v0, Lv7/z0;->u:Lt6/u1;

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    iget-wide v6, v0, Lv7/z0;->s:J

    invoke-static {v6, v7}, Lt8/r0;->a1(J)J

    move-result-wide v34

    move-object/from16 v26, v3

    move-object/from16 v29, v5

    invoke-direct/range {v26 .. v35}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    iget-object v5, v0, Lv7/z0;->d:Ls8/d0;

    new-instance v6, Ls8/d0$c;

    invoke-direct {v6, v4, v3, v13, v2}, Ls8/d0$c;-><init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V

    invoke-interface {v5, v6}, Ls8/d0;->d(Ls8/d0$c;)J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v5, v7

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_1

    iget-object v9, v0, Lv7/z0;->d:Ls8/d0;

    invoke-interface {v9, v8}, Ls8/d0;->a(I)I

    move-result v9

    if-lt v2, v9, :cond_0

    goto :goto_0

    :cond_0
    move v2, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v8

    :goto_1
    iget-boolean v9, v0, Lv7/z0;->v:Z

    if-eqz v9, :cond_2

    if-eqz v2, :cond_2

    const-string v2, "SingleSampleMediaPeriod"

    const-string v3, "Loading failed, treating as end-of-stream."

    invoke-static {v2, v3, v13}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v8, v0, Lv7/z0;->w:Z

    sget-object v2, Ls8/e0;->f:Ls8/e0$c;

    :goto_2
    move-object v15, v2

    goto :goto_3

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v7, v5, v6}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v2

    goto :goto_2

    :cond_3
    sget-object v2, Ls8/e0;->g:Ls8/e0$c;

    goto :goto_2

    :goto_3
    invoke-virtual {v15}, Ls8/e0$c;->c()Z

    move-result v2

    xor-int/lit8 v16, v2, 0x1

    iget-object v2, v0, Lv7/z0;->e:Lv7/h0$a;

    const/4 v5, 0x1

    const/4 v6, -0x1

    iget-object v7, v0, Lv7/z0;->u:Lt6/u1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-wide v10, v0, Lv7/z0;->s:J

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-wide v11, v10

    const-wide/16 v9, 0x0

    move-object/from16 v13, p6

    move/from16 v14, v16

    invoke-virtual/range {v2 .. v14}, Lv7/h0$a;->w(Lv7/u;IILt6/u1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v16, :cond_4

    iget-object v2, v0, Lv7/z0;->d:Ls8/d0;

    iget-wide v3, v1, Lv7/z0$c;->a:J

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    :cond_4
    return-object v15
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lv7/z0;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->l()V

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lv7/z0;->f:Lv7/f1;

    return-object v0
.end method

.method public s(JZ)V
    .locals 0

    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 4

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_3

    aget-object v1, p3, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    aget-object v3, p1, v0

    if-eqz v3, :cond_0

    aget-boolean v3, p2, v0

    if-nez v3, :cond_1

    :cond_0
    iget-object v3, p0, Lv7/z0;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    aput-object v2, p3, v0

    :cond_1
    aget-object v1, p3, v0

    if-nez v1, :cond_2

    aget-object v1, p1, v0

    if-eqz v1, :cond_2

    new-instance v1, Lv7/z0$b;

    invoke-direct {v1, p0, v2}, Lv7/z0$b;-><init>(Lv7/z0;Lv7/z0$a;)V

    iget-object v2, p0, Lv7/z0;->r:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aput-object v1, p3, v0

    const/4 v1, 0x1

    aput-boolean v1, p4, v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-wide p5
.end method
