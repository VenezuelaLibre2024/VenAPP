.class public final Lv7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Lv7/y$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/v$a;
    }
.end annotation


# instance fields
.field public final a:Lv7/a0$b;

.field private final b:J

.field private final c:Ls8/b;

.field private d:Lv7/a0;

.field private e:Lv7/y;

.field private f:Lv7/y$a;

.field private r:Lv7/v$a;

.field private s:Z

.field private t:J


# direct methods
.method public constructor <init>(Lv7/a0$b;Ls8/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/v;->a:Lv7/a0$b;

    iput-object p2, p0, Lv7/v;->c:Ls8/b;

    iput-wide p3, p0, Lv7/v;->b:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lv7/v;->t:J

    return-void
.end method

.method private p(J)J
    .locals 4

    iget-wide v0, p0, Lv7/v;->t:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    move-wide p1, v0

    :cond_0
    return-wide p1
.end method


# virtual methods
.method public bridge synthetic a(Lv7/w0;)V
    .locals 0

    check-cast p1, Lv7/y;

    invoke-virtual {p0, p1}, Lv7/v;->q(Lv7/y;)V

    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0}, Lv7/y;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0, p1, p2, p3}, Lv7/y;->c(JLt6/u3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(Lv7/a0$b;)V
    .locals 4

    iget-wide v0, p0, Lv7/v;->b:J

    invoke-direct {p0, v0, v1}, Lv7/v;->p(J)J

    move-result-wide v0

    iget-object v2, p0, Lv7/v;->d:Lv7/a0;

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv7/a0;

    iget-object v3, p0, Lv7/v;->c:Ls8/b;

    invoke-interface {v2, p1, v3, v0, v1}, Lv7/a0;->e(Lv7/a0$b;Ls8/b;J)Lv7/y;

    move-result-object p1

    iput-object p1, p0, Lv7/v;->e:Lv7/y;

    iget-object v2, p0, Lv7/v;->f:Lv7/y$a;

    if-eqz v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lv7/y;->k(Lv7/y$a;J)V

    :cond_0
    return-void
.end method

.method public e(J)Z
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lv7/y;->e(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0}, Lv7/y;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0, p1, p2}, Lv7/y;->g(J)V

    return-void
.end method

.method public h(Lv7/y;)V
    .locals 1

    iget-object p1, p0, Lv7/v;->f:Lv7/y$a;

    invoke-static {p1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/y$a;->h(Lv7/y;)V

    iget-object p1, p0, Lv7/v;->r:Lv7/v$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lv7/v;->a:Lv7/a0$b;

    invoke-interface {p1, v0}, Lv7/v$a;->b(Lv7/a0$b;)V

    :cond_0
    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv7/y;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(J)J
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0, p1, p2}, Lv7/y;->j(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 0

    iput-object p1, p0, Lv7/v;->f:Lv7/y$a;

    iget-object p1, p0, Lv7/v;->e:Lv7/y;

    if-eqz p1, :cond_0

    iget-wide p2, p0, Lv7/v;->b:J

    invoke-direct {p0, p2, p3}, Lv7/v;->p(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lv7/y;->k(Lv7/y$a;J)V

    :cond_0
    return-void
.end method

.method public l()J
    .locals 2

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0}, Lv7/y;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, Lv7/v;->t:J

    return-wide v0
.end method

.method public n()J
    .locals 2

    iget-wide v0, p0, Lv7/v;->b:J

    return-wide v0
.end method

.method public o()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv7/y;->o()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv7/v;->d:Lv7/a0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lv7/a0;->n()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lv7/v;->r:Lv7/v$a;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Lv7/v;->s:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lv7/v;->s:Z

    iget-object v2, p0, Lv7/v;->a:Lv7/a0$b;

    invoke-interface {v1, v2, v0}, Lv7/v$a;->a(Lv7/a0$b;Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    throw v0
.end method

.method public q(Lv7/y;)V
    .locals 0

    iget-object p1, p0, Lv7/v;->f:Lv7/y$a;

    invoke-static {p1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0}, Lv7/y;->r()Lv7/f1;

    move-result-object v0

    return-object v0
.end method

.method public s(JZ)V
    .locals 1

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y;

    invoke-interface {v0, p1, p2, p3}, Lv7/y;->s(JZ)V

    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 13

    move-object v0, p0

    iget-wide v1, v0, Lv7/v;->t:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lv7/v;->b:J

    cmp-long v5, p5, v5

    if-nez v5, :cond_0

    iput-wide v3, v0, Lv7/v;->t:J

    move-wide v11, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p5

    :goto_0
    iget-object v1, v0, Lv7/v;->e:Lv7/y;

    invoke-static {v1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lv7/y;

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-interface/range {v6 .. v12}, Lv7/y;->t([Lq8/r;[Z[Lv7/v0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public u(J)V
    .locals 0

    iput-wide p1, p0, Lv7/v;->t:J

    return-void
.end method

.method public v()V
    .locals 2

    iget-object v0, p0, Lv7/v;->e:Lv7/y;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/v;->d:Lv7/a0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/a0;

    iget-object v1, p0, Lv7/v;->e:Lv7/y;

    invoke-interface {v0, v1}, Lv7/a0;->l(Lv7/y;)V

    :cond_0
    return-void
.end method

.method public w(Lv7/a0;)V
    .locals 1

    iget-object v0, p0, Lv7/v;->d:Lv7/a0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iput-object p1, p0, Lv7/v;->d:Lv7/a0;

    return-void
.end method
