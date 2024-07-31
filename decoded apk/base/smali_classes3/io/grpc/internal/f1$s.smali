.class final Lio/grpc/internal/f1$s;
.super Lio/grpc/internal/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "s"
.end annotation


# instance fields
.field final a:Lvi/p0$b;

.field final b:Lio/grpc/internal/f1$n;

.field final c:Lvi/i0;

.field final d:Lio/grpc/internal/n;

.field final e:Lio/grpc/internal/o;

.field f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation
.end field

.field g:Lio/grpc/internal/x0;

.field h:Z

.field i:Z

.field j:Lvi/k1$d;

.field final synthetic k:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;Lvi/p0$b;Lio/grpc/internal/f1$n;)V
    .locals 7

    iput-object p1, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lio/grpc/internal/e;-><init>()V

    const-string v0, "args"

    invoke-static {p2, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lvi/p0$b;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/f1$s;->f:Ljava/util/List;

    invoke-static {p1}, Lio/grpc/internal/f1;->n0(Lio/grpc/internal/f1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lvi/p0$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/grpc/internal/f1$s;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lvi/p0$b;->d()Lvi/p0$b$a;

    move-result-object p2

    invoke-virtual {p2, v0}, Lvi/p0$b$a;->d(Ljava/util/List;)Lvi/p0$b$a;

    move-result-object p2

    invoke-virtual {p2}, Lvi/p0$b$a;->b()Lvi/p0$b;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Lio/grpc/internal/f1$s;->a:Lvi/p0$b;

    const-string v0, "helper"

    invoke-static {p3, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/grpc/internal/f1$n;

    iput-object p3, p0, Lio/grpc/internal/f1$s;->b:Lio/grpc/internal/f1$n;

    invoke-virtual {p1}, Lio/grpc/internal/f1;->a()Ljava/lang/String;

    move-result-object p3

    const-string v0, "Subchannel"

    invoke-static {v0, p3}, Lvi/i0;->b(Ljava/lang/String;Ljava/lang/String;)Lvi/i0;

    move-result-object v2

    iput-object v2, p0, Lio/grpc/internal/f1$s;->c:Lvi/i0;

    new-instance p3, Lio/grpc/internal/o;

    invoke-static {p1}, Lio/grpc/internal/f1;->U(Lio/grpc/internal/f1;)I

    move-result v3

    invoke-static {p1}, Lio/grpc/internal/f1;->T(Lio/grpc/internal/f1;)Lio/grpc/internal/k2;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/k2;->a()J

    move-result-wide v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subchannel for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lvi/p0$b;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Lio/grpc/internal/o;-><init>(Lvi/i0;IJLjava/lang/String;)V

    iput-object p3, p0, Lio/grpc/internal/f1$s;->e:Lio/grpc/internal/o;

    new-instance p2, Lio/grpc/internal/n;

    invoke-static {p1}, Lio/grpc/internal/f1;->T(Lio/grpc/internal/f1;)Lio/grpc/internal/k2;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lio/grpc/internal/n;-><init>(Lio/grpc/internal/o;Lio/grpc/internal/k2;)V

    iput-object p2, p0, Lio/grpc/internal/f1$s;->d:Lio/grpc/internal/n;

    return-void
.end method

.method private i(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/x;

    new-instance v2, Lvi/x;

    invoke-virtual {v1}, Lvi/x;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lvi/x;->b()Lvi/a;

    move-result-object v1

    invoke-virtual {v1}, Lvi/a;->d()Lvi/a$b;

    move-result-object v1

    sget-object v4, Lvi/x;->d:Lvi/a$c;

    invoke-virtual {v1, v4}, Lvi/a$b;->c(Lvi/a$c;)Lvi/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lvi/a$b;->a()Lvi/a;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lvi/x;-><init>(Ljava/util/List;Lvi/a;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-boolean v0, p0, Lio/grpc/internal/f1$s;->h:Z

    const-string v1, "not started"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$s;->f:Ljava/util/List;

    return-object v0
.end method

.method public c()Lvi/a;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$s;->a:Lvi/p0$b;

    invoke-virtual {v0}, Lvi/p0$b;->b()Lvi/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lio/grpc/internal/f1$s;->h:Z

    const-string v1, "Subchannel is not started"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    return-object v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-boolean v0, p0, Lio/grpc/internal/f1$s;->h:Z

    const-string v1, "not started"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    invoke-virtual {v0}, Lio/grpc/internal/x0;->a()Lio/grpc/internal/s;

    return-void
.end method

.method public f()V
    .locals 7

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-object v0, p0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lio/grpc/internal/f1$s;->i:Z

    return-void

    :cond_0
    iget-boolean v0, p0, Lio/grpc/internal/f1$s;->i:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Q(Lio/grpc/internal/f1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$s;->j:Lvi/k1$d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lvi/k1$d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/f1$s;->j:Lvi/k1$d;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    iput-boolean v1, p0, Lio/grpc/internal/f1$s;->i:Z

    :goto_0
    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Q(Lio/grpc/internal/f1;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v1, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v2, Lio/grpc/internal/c1;

    new-instance v0, Lio/grpc/internal/f1$s$b;

    invoke-direct {v0, p0}, Lio/grpc/internal/f1$s$b;-><init>(Lio/grpc/internal/f1$s;)V

    invoke-direct {v2, v0}, Lio/grpc/internal/c1;-><init>(Ljava/lang/Runnable;)V

    const-wide/16 v3, 0x5

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->w(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->l0()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lvi/k1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lvi/k1$d;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/f1$s;->j:Lvi/k1$d;

    return-void

    :cond_3
    iget-object v0, p0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    sget-object v1, Lio/grpc/internal/f1;->q0:Lvi/g1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/x0;->d(Lvi/g1;)V

    return-void
.end method

.method public g(Lvi/p0$j;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v1, v1, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v1}, Lvi/k1;->e()V

    iget-boolean v1, v0, Lio/grpc/internal/f1$s;->h:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const-string v3, "already started"

    invoke-static {v1, v3}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-boolean v1, v0, Lio/grpc/internal/f1$s;->i:Z

    xor-int/2addr v1, v2

    const-string v3, "already shutdown"

    invoke-static {v1, v3}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v1, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->Q(Lio/grpc/internal/f1;)Z

    move-result v1

    xor-int/2addr v1, v2

    const-string v3, "Channel is being terminated"

    invoke-static {v1, v3}, Leb/o;->v(ZLjava/lang/Object;)V

    iput-boolean v2, v0, Lio/grpc/internal/f1$s;->h:Z

    new-instance v1, Lio/grpc/internal/x0;

    iget-object v2, v0, Lio/grpc/internal/f1$s;->a:Lvi/p0$b;

    invoke-virtual {v2}, Lvi/p0$b;->a()Ljava/util/List;

    move-result-object v5

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-virtual {v2}, Lio/grpc/internal/f1;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->Y(Lio/grpc/internal/f1;)Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->Z(Lio/grpc/internal/f1;)Lio/grpc/internal/k$a;

    move-result-object v8

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->w(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v9

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->w(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v2

    invoke-interface {v2}, Lio/grpc/internal/t;->l0()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v10

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->a0(Lio/grpc/internal/f1;)Leb/v;

    move-result-object v11

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v12, v2, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v13, Lio/grpc/internal/f1$s$a;

    move-object/from16 v2, p1

    invoke-direct {v13, v0, v2}, Lio/grpc/internal/f1$s$a;-><init>(Lio/grpc/internal/f1$s;Lvi/p0$j;)V

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->W(Lio/grpc/internal/f1;)Lvi/c0;

    move-result-object v14

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->V(Lio/grpc/internal/f1;)Lio/grpc/internal/m$b;

    move-result-object v2

    invoke-interface {v2}, Lio/grpc/internal/m$b;->a()Lio/grpc/internal/m;

    move-result-object v15

    iget-object v2, v0, Lio/grpc/internal/f1$s;->e:Lio/grpc/internal/o;

    iget-object v3, v0, Lio/grpc/internal/f1$s;->c:Lvi/i0;

    iget-object v4, v0, Lio/grpc/internal/f1$s;->d:Lio/grpc/internal/n;

    move-object/from16 v18, v4

    move-object v4, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    invoke-direct/range {v4 .. v18}, Lio/grpc/internal/x0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/grpc/internal/k$a;Lio/grpc/internal/t;Ljava/util/concurrent/ScheduledExecutorService;Leb/v;Lvi/k1;Lio/grpc/internal/x0$j;Lvi/c0;Lio/grpc/internal/m;Lio/grpc/internal/o;Lvi/i0;Lvi/f;)V

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->G(Lio/grpc/internal/f1;)Lio/grpc/internal/o;

    move-result-object v2

    new-instance v3, Lvi/d0$a;

    invoke-direct {v3}, Lvi/d0$a;-><init>()V

    const-string v4, "Child Subchannel started"

    invoke-virtual {v3, v4}, Lvi/d0$a;->b(Ljava/lang/String;)Lvi/d0$a;

    move-result-object v3

    sget-object v4, Lvi/d0$b;->CT_INFO:Lvi/d0$b;

    invoke-virtual {v3, v4}, Lvi/d0$a;->c(Lvi/d0$b;)Lvi/d0$a;

    move-result-object v3

    iget-object v4, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v4}, Lio/grpc/internal/f1;->T(Lio/grpc/internal/f1;)Lio/grpc/internal/k2;

    move-result-object v4

    invoke-interface {v4}, Lio/grpc/internal/k2;->a()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lvi/d0$a;->e(J)Lvi/d0$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lvi/d0$a;->d(Lvi/n0;)Lvi/d0$a;

    move-result-object v3

    invoke-virtual {v3}, Lvi/d0$a;->a()Lvi/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/grpc/internal/o;->e(Lvi/d0;)V

    iput-object v1, v0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->W(Lio/grpc/internal/f1;)Lvi/c0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lvi/c0;->e(Lvi/h0;)V

    iget-object v2, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->b0(Lio/grpc/internal/f1;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iput-object p1, p0, Lio/grpc/internal/f1$s;->f:Ljava/util/List;

    iget-object v0, p0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->n0(Lio/grpc/internal/f1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$s;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    invoke-virtual {v0, p1}, Lio/grpc/internal/x0;->T(Ljava/util/List;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$s;->c:Lvi/i0;

    invoke-virtual {v0}, Lvi/i0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
