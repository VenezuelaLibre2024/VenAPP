.class public final Lu8/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu8/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lu8/y;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lu8/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lu8/y$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lu8/y$a;->b:Lu8/y;

    return-void
.end method

.method public static synthetic a(Lu8/y$a;Lw6/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lu8/y$a;->s(Lw6/e;)V

    return-void
.end method

.method public static synthetic b(Lu8/y$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lu8/y$a;->r(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lu8/y$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lu8/y$a;->y(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lu8/y$a;Lw6/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lu8/y$a;->u(Lw6/e;)V

    return-void
.end method

.method public static synthetic e(Lu8/y$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu8/y$a;->w(Ljava/lang/Object;J)V

    return-void
.end method

.method public static synthetic f(Lu8/y$a;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu8/y$a;->t(IJ)V

    return-void
.end method

.method public static synthetic g(Lu8/y$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu8/y$a;->q(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic h(Lu8/y$a;Lu8/a0;)V
    .locals 0

    invoke-direct {p0, p1}, Lu8/y$a;->z(Lu8/a0;)V

    return-void
.end method

.method public static synthetic i(Lu8/y$a;Lt6/u1;Lw6/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu8/y$a;->v(Lt6/u1;Lw6/i;)V

    return-void
.end method

.method public static synthetic j(Lu8/y$a;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu8/y$a;->x(JI)V

    return-void
.end method

.method private synthetic q(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lu8/y;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lu8/y;->d(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic r(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1}, Lu8/y;->b(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic s(Lw6/e;)V
    .locals 1

    invoke-virtual {p1}, Lw6/e;->c()V

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1}, Lu8/y;->c(Lw6/e;)V

    return-void
.end method

.method private synthetic t(IJ)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1, p2, p3}, Lu8/y;->n(IJ)V

    return-void
.end method

.method private synthetic u(Lw6/e;)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1}, Lu8/y;->e(Lw6/e;)V

    return-void
.end method

.method private synthetic v(Lt6/u1;Lw6/i;)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1}, Lu8/y;->v(Lt6/u1;)V

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1, p2}, Lu8/y;->g(Lt6/u1;Lw6/i;)V

    return-void
.end method

.method private synthetic w(Ljava/lang/Object;J)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1, p2, p3}, Lu8/y;->o(Ljava/lang/Object;J)V

    return-void
.end method

.method private synthetic x(JI)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1, p2, p3}, Lu8/y;->r(JI)V

    return-void
.end method

.method private synthetic y(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1}, Lu8/y;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic z(Lu8/a0;)V
    .locals 1

    iget-object v0, p0, Lu8/y$a;->b:Lu8/y;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/y;

    invoke-interface {v0, p1}, Lu8/y;->onVideoSizeChanged(Lu8/a0;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lu8/y$a;->a:Landroid/os/Handler;

    new-instance v3, Lu8/v;

    invoke-direct {v3, p0, p1, v0, v1}, Lu8/v;-><init>(Lu8/y$a;Ljava/lang/Object;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public B(JI)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/s;

    invoke-direct {v1, p0, p1, p2, p3}, Lu8/s;-><init>(Lu8/y$a;JI)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/u;

    invoke-direct {v1, p0, p1}, Lu8/u;-><init>(Lu8/y$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(Lu8/a0;)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/r;

    invoke-direct {v1, p0, p1}, Lu8/r;-><init>(Lu8/y$a;Lu8/a0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lu8/x;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lu8/x;-><init>(Lu8/y$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/q;

    invoke-direct {v1, p0, p1}, Lu8/q;-><init>(Lu8/y$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m(Lw6/e;)V
    .locals 2

    invoke-virtual {p1}, Lw6/e;->c()V

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/o;

    invoke-direct {v1, p0, p1}, Lu8/o;-><init>(Lu8/y$a;Lw6/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n(IJ)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/w;

    invoke-direct {v1, p0, p1, p2, p3}, Lu8/w;-><init>(Lu8/y$a;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public o(Lw6/e;)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/p;

    invoke-direct {v1, p0, p1}, Lu8/p;-><init>(Lu8/y$a;Lw6/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public p(Lt6/u1;Lw6/i;)V
    .locals 2

    iget-object v0, p0, Lu8/y$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu8/t;

    invoke-direct {v1, p0, p1, p2}, Lu8/t;-><init>(Lu8/y$a;Lt6/u1;Lw6/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
