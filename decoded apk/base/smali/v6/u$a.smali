.class public final Lv6/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lv6/u;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lv6/u;)V
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
    iput-object p1, p0, Lv6/u$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lv6/u$a;->b:Lv6/u;

    return-void
.end method

.method private synthetic A(IJJ)V
    .locals 7

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lv6/u;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lv6/u;->q(IJJ)V

    return-void
.end method

.method public static synthetic a(Lv6/u$a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/u$a;->z(Z)V

    return-void
.end method

.method public static synthetic b(Lv6/u$a;Lw6/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/u$a;->v(Lw6/e;)V

    return-void
.end method

.method public static synthetic c(Lv6/u$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/u$a;->r(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lv6/u$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/u$a;->s(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Lv6/u$a;Lt6/u1;Lw6/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv6/u$a;->x(Lt6/u1;Lw6/i;)V

    return-void
.end method

.method public static synthetic f(Lv6/u$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lv6/u$a;->t(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic g(Lv6/u$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/u$a;->u(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lv6/u$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv6/u$a;->y(J)V

    return-void
.end method

.method public static synthetic i(Lv6/u$a;IJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lv6/u$a;->A(IJJ)V

    return-void
.end method

.method public static synthetic j(Lv6/u$a;Lw6/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/u$a;->w(Lw6/e;)V

    return-void
.end method

.method private synthetic r(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic t(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lv6/u;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lv6/u;->j(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic u(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->i(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v(Lw6/e;)V
    .locals 1

    invoke-virtual {p1}, Lw6/e;->c()V

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->h(Lw6/e;)V

    return-void
.end method

.method private synthetic w(Lw6/e;)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->m(Lw6/e;)V

    return-void
.end method

.method private synthetic x(Lt6/u1;Lw6/i;)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->t(Lt6/u1;)V

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1, p2}, Lv6/u;->f(Lt6/u1;Lw6/i;)V

    return-void
.end method

.method private synthetic y(J)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1, p2}, Lv6/u;->k(J)V

    return-void
.end method

.method private synthetic z(Z)V
    .locals 1

    iget-object v0, p0, Lv6/u$a;->b:Lv6/u;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv6/u;

    invoke-interface {v0, p1}, Lv6/u;->onSkipSilenceEnabledChanged(Z)V

    return-void
.end method


# virtual methods
.method public B(J)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/m;

    invoke-direct {v1, p0, p1, p2}, Lv6/m;-><init>(Lv6/u$a;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/s;

    invoke-direct {v1, p0, p1}, Lv6/s;-><init>(Lv6/u$a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(IJJ)V
    .locals 9

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lv6/t;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lv6/t;-><init>(Lv6/u$a;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/q;

    invoke-direct {v1, p0, p1}, Lv6/q;-><init>(Lv6/u$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/p;

    invoke-direct {v1, p0, p1}, Lv6/p;-><init>(Lv6/u$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lv6/r;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lv6/r;-><init>(Lv6/u$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/k;

    invoke-direct {v1, p0, p1}, Lv6/k;-><init>(Lv6/u$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public o(Lw6/e;)V
    .locals 2

    invoke-virtual {p1}, Lw6/e;->c()V

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/n;

    invoke-direct {v1, p0, p1}, Lv6/n;-><init>(Lv6/u$a;Lw6/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public p(Lw6/e;)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/o;

    invoke-direct {v1, p0, p1}, Lv6/o;-><init>(Lv6/u$a;Lw6/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public q(Lt6/u1;Lw6/i;)V
    .locals 2

    iget-object v0, p0, Lv6/u$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lv6/l;

    invoke-direct {v1, p0, p1, p2}, Lv6/l;-><init>(Lv6/u$a;Lt6/u1;Lw6/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
