.class public final Lyl/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:J

.field private b:Z

.field private final c:Ldm/b;

.field private final d:Ldm/b;

.field private e:Lql/t;

.field private f:Z

.field final synthetic r:Lyl/i;


# direct methods
.method public constructor <init>(Lyl/i;JZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/i$c;->r:Lyl/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lyl/i$c;->a:J

    iput-boolean p4, p0, Lyl/i$c;->b:Z

    new-instance p1, Ldm/b;

    invoke-direct {p1}, Ldm/b;-><init>()V

    iput-object p1, p0, Lyl/i$c;->c:Ldm/b;

    new-instance p1, Ldm/b;

    invoke-direct {p1}, Ldm/b;-><init>()V

    iput-object p1, p0, Lyl/i$c;->d:Ldm/b;

    return-void
.end method

.method private final n(J)V
    .locals 2

    iget-object v0, p0, Lyl/i$c;->r:Lyl/i;

    sget-boolean v1, Lrl/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lyl/i$c;->r:Lyl/i;

    invoke-virtual {v0}, Lyl/i;->g()Lyl/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lyl/f;->x1(J)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lyl/i$c;->f:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lyl/i$c;->b:Z

    return v0
.end method

.method public close()V
    .locals 5

    iget-object v0, p0, Lyl/i$c;->r:Lyl/i;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1}, Lyl/i$c;->i(Z)V

    invoke-virtual {p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v1

    invoke-virtual {v1}, Ldm/b;->size()J

    move-result-wide v1

    invoke-virtual {p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v3

    invoke-virtual {v3}, Ldm/b;->b()V

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    sget-object v3, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_0

    invoke-direct {p0, v1, v2}, Lyl/i$c;->n(J)V

    :cond_0
    iget-object v0, p0, Lyl/i$c;->r:Lyl/i;

    invoke-virtual {v0}, Lyl/i;->b()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final e()Ldm/b;
    .locals 1

    iget-object v0, p0, Lyl/i$c;->d:Ldm/b;

    return-object v0
.end method

.method public final f()Ldm/b;
    .locals 1

    iget-object v0, p0, Lyl/i$c;->c:Ldm/b;

    return-object v0
.end method

.method public final g(Ldm/d;J)V
    .locals 9

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/i$c;->r:Lyl/i;

    sget-boolean v1, Lrl/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_9

    iget-object v2, p0, Lyl/i$c;->r:Lyl/i;

    monitor-enter v2

    :try_start_0
    invoke-virtual {p0}, Lyl/i$c;->b()Z

    move-result v3

    invoke-virtual {p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v4

    invoke-virtual {v4}, Ldm/b;->size()J

    move-result-wide v4

    add-long/2addr v4, p2

    iget-wide v6, p0, Lyl/i$c;->a:J

    cmp-long v4, v4, v6

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_2

    move v4, v5

    goto :goto_1

    :cond_2
    move v4, v6

    :goto_1
    sget-object v7, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v2

    if-eqz v4, :cond_3

    invoke-interface {p1, p2, p3}, Ldm/d;->skip(J)V

    iget-object p1, p0, Lyl/i$c;->r:Lyl/i;

    sget-object p2, Lyl/b;->FLOW_CONTROL_ERROR:Lyl/b;

    invoke-virtual {p1, p2}, Lyl/i;->f(Lyl/b;)V

    return-void

    :cond_3
    if-eqz v3, :cond_4

    invoke-interface {p1, p2, p3}, Ldm/d;->skip(J)V

    return-void

    :cond_4
    iget-object v2, p0, Lyl/i$c;->c:Ldm/b;

    invoke-interface {p1, v2, p2, p3}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide v2

    const-wide/16 v7, -0x1

    cmp-long v4, v2, v7

    if-eqz v4, :cond_8

    sub-long/2addr p2, v2

    iget-object v2, p0, Lyl/i$c;->r:Lyl/i;

    monitor-enter v2

    :try_start_1
    invoke-virtual {p0}, Lyl/i$c;->a()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lyl/i$c;->f()Ldm/b;

    move-result-object v3

    invoke-virtual {v3}, Ldm/b;->size()J

    move-result-wide v3

    invoke-virtual {p0}, Lyl/i$c;->f()Ldm/b;

    move-result-object v5

    invoke-virtual {v5}, Ldm/b;->b()V

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v3

    invoke-virtual {v3}, Ldm/b;->size()J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    move v5, v6

    :goto_2
    invoke-virtual {p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v3

    invoke-virtual {p0}, Lyl/i$c;->f()Ldm/b;

    move-result-object v4

    invoke-virtual {v3, v4}, Ldm/b;->E0(Ldm/x;)J

    if-eqz v5, :cond_7

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_7
    move-wide v3, v0

    :goto_3
    monitor-exit v2

    cmp-long v0, v3, v0

    if-lez v0, :cond_1

    invoke-direct {p0, v3, v4}, Lyl/i$c;->n(J)V

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_8
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_9
    return-void
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, Lyl/i$c;->f:Z

    return-void
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Lyl/i$c;->b:Z

    return-void
.end method

.method public final l(Lql/t;)V
    .locals 0

    iput-object p1, p0, Lyl/i$c;->e:Lql/t;

    return-void
.end method

.method public m()Ldm/y;
    .locals 1

    iget-object v0, p0, Lyl/i$c;->r:Lyl/i;

    invoke-virtual {v0}, Lyl/i;->m()Lyl/i$d;

    move-result-object v0

    return-object v0
.end method

.method public s1(Ldm/b;J)J
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    if-eqz v6, :cond_a

    :goto_1
    iget-object v6, v1, Lyl/i$c;->r:Lyl/i;

    monitor-enter v6

    :try_start_0
    invoke-virtual {v6}, Lyl/i;->m()Lyl/i$d;

    move-result-object v9

    invoke-virtual {v9}, Ldm/a;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v6}, Lyl/i;->h()Lyl/b;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual/range {p0 .. p0}, Lyl/i$c;->b()Z

    move-result v9

    if-nez v9, :cond_1

    invoke-virtual {v6}, Lyl/i;->i()Ljava/io/IOException;

    move-result-object v9

    if-nez v9, :cond_2

    new-instance v9, Lyl/n;

    invoke-virtual {v6}, Lyl/i;->h()Lyl/b;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-direct {v9, v10}, Lyl/n;-><init>(Lyl/b;)V

    goto :goto_2

    :cond_1
    const/4 v9, 0x0

    :cond_2
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lyl/i$c;->a()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual/range {p0 .. p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v10

    invoke-virtual {v10}, Ldm/b;->size()J

    move-result-wide v10

    cmp-long v10, v10, v4

    const-wide/16 v11, -0x1

    if-lez v10, :cond_3

    invoke-virtual/range {p0 .. p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lyl/i$c;->e()Ldm/b;

    move-result-object v13

    invoke-virtual {v13}, Ldm/b;->size()J

    move-result-wide v13

    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    invoke-virtual {v10, v0, v13, v14}, Ldm/b;->s1(Ldm/b;J)J

    move-result-wide v13

    invoke-virtual {v6}, Lyl/i;->l()J

    move-result-wide v15

    add-long v4, v15, v13

    invoke-virtual {v6, v4, v5}, Lyl/i;->C(J)V

    invoke-virtual {v6}, Lyl/i;->l()J

    move-result-wide v4

    invoke-virtual {v6}, Lyl/i;->k()J

    move-result-wide v15

    sub-long/2addr v4, v15

    if-nez v9, :cond_5

    invoke-virtual {v6}, Lyl/i;->g()Lyl/f;

    move-result-object v10

    invoke-virtual {v10}, Lyl/f;->i0()Lyl/m;

    move-result-object v10

    invoke-virtual {v10}, Lyl/m;->c()I

    move-result v10

    div-int/lit8 v10, v10, 0x2

    int-to-long v7, v10

    cmp-long v7, v4, v7

    if-ltz v7, :cond_5

    invoke-virtual {v6}, Lyl/i;->g()Lyl/f;

    move-result-object v7

    invoke-virtual {v6}, Lyl/i;->j()I

    move-result v8

    invoke-virtual {v7, v8, v4, v5}, Lyl/f;->D1(IJ)V

    invoke-virtual {v6}, Lyl/i;->l()J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Lyl/i;->B(J)V

    goto :goto_3

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lyl/i$c;->b()Z

    move-result v4

    if-nez v4, :cond_4

    if-nez v9, :cond_4

    invoke-virtual {v6}, Lyl/i;->F()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-wide v13, v11

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    move-wide v13, v11

    :cond_5
    :goto_3
    const/4 v4, 0x0

    :goto_4
    :try_start_2
    invoke-virtual {v6}, Lyl/i;->m()Lyl/i$d;

    move-result-object v5

    invoke-virtual {v5}, Lyl/i$d;->A()V

    sget-object v5, Lck/v;->a:Lck/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v6

    if-eqz v4, :cond_6

    const-wide/16 v4, 0x0

    goto/16 :goto_1

    :cond_6
    cmp-long v0, v13, v11

    if-eqz v0, :cond_7

    invoke-direct {v1, v13, v14}, Lyl/i$c;->n(J)V

    return-wide v13

    :cond_7
    if-nez v9, :cond_8

    return-wide v11

    :cond_8
    throw v9

    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_4
    invoke-virtual {v6}, Lyl/i;->m()Lyl/i$d;

    move-result-object v2

    invoke-virtual {v2}, Lyl/i$d;->A()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit v6

    throw v0

    :cond_a
    const-string v0, "byteCount < 0: "

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
