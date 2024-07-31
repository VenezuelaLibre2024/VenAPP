.class public Lv7/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/h0$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lv7/a0$b;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lv7/h0$a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J


# direct methods
.method public constructor <init>()V
    .locals 6

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lv7/h0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILv7/a0$b;J)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILv7/a0$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lv7/h0$a$a;",
            ">;I",
            "Lv7/a0$b;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lv7/h0$a;->a:I

    iput-object p3, p0, Lv7/h0$a;->b:Lv7/a0$b;

    iput-wide p4, p0, Lv7/h0$a;->d:J

    return-void
.end method

.method public static synthetic a(Lv7/h0$a;Lv7/h0;Lv7/a0$b;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/h0$a;->p(Lv7/h0;Lv7/a0$b;Lv7/x;)V

    return-void
.end method

.method public static synthetic b(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lv7/h0$a;->n(Lv7/h0;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic c(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/h0$a;->m(Lv7/h0;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic d(Lv7/h0$a;Lv7/h0;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/h0$a;->k(Lv7/h0;Lv7/x;)V

    return-void
.end method

.method public static synthetic e(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/h0$a;->o(Lv7/h0;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic f(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/h0$a;->l(Lv7/h0;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private h(J)J
    .locals 3

    invoke-static {p1, p2}, Lt8/r0;->a1(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lv7/h0$a;->d:J

    add-long/2addr v0, p1

    :goto_0
    return-wide v0
.end method

.method private synthetic k(Lv7/h0;Lv7/x;)V
    .locals 2

    iget v0, p0, Lv7/h0$a;->a:I

    iget-object v1, p0, Lv7/h0$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1, p2}, Lv7/h0;->v(ILv7/a0$b;Lv7/x;)V

    return-void
.end method

.method private synthetic l(Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 2

    iget v0, p0, Lv7/h0$a;->a:I

    iget-object v1, p0, Lv7/h0$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lv7/h0;->D(ILv7/a0$b;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private synthetic m(Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 2

    iget v0, p0, Lv7/h0$a;->a:I

    iget-object v1, p0, Lv7/h0$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lv7/h0;->x(ILv7/a0$b;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private synthetic n(Lv7/h0;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 7

    iget v1, p0, Lv7/h0$a;->a:I

    iget-object v2, p0, Lv7/h0$a;->b:Lv7/a0$b;

    move-object v0, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lv7/h0;->F(ILv7/a0$b;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic o(Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 2

    iget v0, p0, Lv7/h0$a;->a:I

    iget-object v1, p0, Lv7/h0$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lv7/h0;->G(ILv7/a0$b;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private synthetic p(Lv7/h0;Lv7/a0$b;Lv7/x;)V
    .locals 1

    iget v0, p0, Lv7/h0$a;->a:I

    invoke-interface {p1, v0, p2, p3}, Lv7/h0;->w(ILv7/a0$b;Lv7/x;)V

    return-void
.end method


# virtual methods
.method public A(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lv7/x;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lv7/h0$a;->B(Lv7/u;Lv7/x;)V

    return-void
.end method

.method public B(Lv7/u;Lv7/x;)V
    .locals 4

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/h0$a$a;

    iget-object v2, v1, Lv7/h0$a$a;->b:Lv7/h0;

    iget-object v1, v1, Lv7/h0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lv7/b0;

    invoke-direct {v3, p0, v2, p1, p2}, Lv7/b0;-><init>(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public C(Lv7/h0;)V
    .locals 3

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/h0$a$a;

    iget-object v2, v1, Lv7/h0$a$a;->b:Lv7/h0;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public D(IJJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lv7/x;

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-wide v7, p2

    invoke-direct {p0, p2, p3}, Lv7/h0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v9, p4

    invoke-direct {p0, v9, v10}, Lv7/h0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v3, p1

    invoke-direct/range {v1 .. v10}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lv7/h0$a;->E(Lv7/x;)V

    return-void
.end method

.method public E(Lv7/x;)V
    .locals 5

    iget-object v0, p0, Lv7/h0$a;->b:Lv7/a0$b;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/a0$b;

    iget-object v1, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv7/h0$a$a;

    iget-object v3, v2, Lv7/h0$a$a;->b:Lv7/h0;

    iget-object v2, v2, Lv7/h0$a$a;->a:Landroid/os/Handler;

    new-instance v4, Lv7/g0;

    invoke-direct {v4, p0, v3, v0, p1}, Lv7/g0;-><init>(Lv7/h0$a;Lv7/h0;Lv7/a0$b;Lv7/x;)V

    invoke-static {v2, v4}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F(ILv7/a0$b;J)Lv7/h0$a;
    .locals 7

    new-instance v6, Lv7/h0$a;

    iget-object v1, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    move-object v0, v6

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lv7/h0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILv7/a0$b;J)V

    return-object v6
.end method

.method public g(Landroid/os/Handler;Lv7/h0;)V
    .locals 2

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lv7/h0$a$a;

    invoke-direct {v1, p1, p2}, Lv7/h0$a$a;-><init>(Landroid/os/Handler;Lv7/h0;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i(ILt6/u1;ILjava/lang/Object;J)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lv7/x;

    const/4 v2, 0x1

    move-wide/from16 v3, p5

    invoke-direct {p0, v3, v4}, Lv7/h0$a;->h(J)J

    move-result-wide v7

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v11

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v10}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lv7/h0$a;->j(Lv7/x;)V

    return-void
.end method

.method public j(Lv7/x;)V
    .locals 4

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/h0$a$a;

    iget-object v2, v1, Lv7/h0$a$a;->b:Lv7/h0;

    iget-object v1, v1, Lv7/h0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lv7/c0;

    invoke-direct {v3, p0, v2, p1}, Lv7/c0;-><init>(Lv7/h0$a;Lv7/h0;Lv7/x;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(Lv7/u;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lv7/h0$a;->r(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public r(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lv7/x;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lv7/h0$a;->s(Lv7/u;Lv7/x;)V

    return-void
.end method

.method public s(Lv7/u;Lv7/x;)V
    .locals 4

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/h0$a$a;

    iget-object v2, v1, Lv7/h0$a$a;->b:Lv7/h0;

    iget-object v1, v1, Lv7/h0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lv7/f0;

    invoke-direct {v3, p0, v2, p1, p2}, Lv7/f0;-><init>(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lv7/u;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lv7/h0$a;->u(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public u(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lv7/x;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lv7/h0$a;->v(Lv7/u;Lv7/x;)V

    return-void
.end method

.method public v(Lv7/u;Lv7/x;)V
    .locals 4

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/h0$a$a;

    iget-object v2, v1, Lv7/h0$a$a;->b:Lv7/h0;

    iget-object v1, v1, Lv7/h0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lv7/e0;

    invoke-direct {v3, p0, v2, p1, p2}, Lv7/e0;-><init>(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lv7/u;IILt6/u1;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lv7/x;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lv7/h0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    move-object/from16 v2, p11

    move/from16 v3, p12

    invoke-virtual {p0, p1, v11, v2, v3}, Lv7/h0$a;->y(Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method

.method public x(Lv7/u;ILjava/io/IOException;Z)V
    .locals 13

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v11, p3

    move/from16 v12, p4

    invoke-virtual/range {v0 .. v12}, Lv7/h0$a;->w(Lv7/u;IILt6/u1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-void
.end method

.method public y(Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lv7/h0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/h0$a$a;

    iget-object v4, v1, Lv7/h0$a$a;->b:Lv7/h0;

    iget-object v1, v1, Lv7/h0$a$a;->a:Landroid/os/Handler;

    new-instance v9, Lv7/d0;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lv7/d0;-><init>(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    invoke-static {v1, v9}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(Lv7/u;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lv7/h0$a;->A(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return-void
.end method
