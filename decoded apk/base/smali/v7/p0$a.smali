.class final Lv7/p0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e0$e;
.implements Lv7/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Landroid/net/Uri;

.field private final c:Ls8/l0;

.field private final d:Lv7/k0;

.field private final e:Ly6/m;

.field private final f:Lt8/g;

.field private final g:Ly6/y;

.field private volatile h:Z

.field private i:Z

.field private j:J

.field private k:Ls8/n;

.field private l:Ly6/b0;

.field private m:Z

.field final synthetic n:Lv7/p0;


# direct methods
.method public constructor <init>(Lv7/p0;Landroid/net/Uri;Ls8/j;Lv7/k0;Ly6/m;Lt8/g;)V
    .locals 0

    iput-object p1, p0, Lv7/p0$a;->n:Lv7/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv7/p0$a;->b:Landroid/net/Uri;

    new-instance p1, Ls8/l0;

    invoke-direct {p1, p3}, Ls8/l0;-><init>(Ls8/j;)V

    iput-object p1, p0, Lv7/p0$a;->c:Ls8/l0;

    iput-object p4, p0, Lv7/p0$a;->d:Lv7/k0;

    iput-object p5, p0, Lv7/p0$a;->e:Ly6/m;

    iput-object p6, p0, Lv7/p0$a;->f:Lt8/g;

    new-instance p1, Ly6/y;

    invoke-direct {p1}, Ly6/y;-><init>()V

    iput-object p1, p0, Lv7/p0$a;->g:Ly6/y;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/p0$a;->i:Z

    invoke-static {}, Lv7/u;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lv7/p0$a;->a:J

    const-wide/16 p1, 0x0

    invoke-direct {p0, p1, p2}, Lv7/p0$a;->i(J)Ls8/n;

    move-result-object p1

    iput-object p1, p0, Lv7/p0$a;->k:Ls8/n;

    return-void
.end method

.method static synthetic d(Lv7/p0$a;)Ls8/l0;
    .locals 0

    iget-object p0, p0, Lv7/p0$a;->c:Ls8/l0;

    return-object p0
.end method

.method static synthetic e(Lv7/p0$a;)J
    .locals 2

    iget-wide v0, p0, Lv7/p0$a;->a:J

    return-wide v0
.end method

.method static synthetic f(Lv7/p0$a;)Ls8/n;
    .locals 0

    iget-object p0, p0, Lv7/p0$a;->k:Ls8/n;

    return-object p0
.end method

.method static synthetic g(Lv7/p0$a;)J
    .locals 2

    iget-wide v0, p0, Lv7/p0$a;->j:J

    return-wide v0
.end method

.method static synthetic h(Lv7/p0$a;JJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lv7/p0$a;->j(JJ)V

    return-void
.end method

.method private i(J)Ls8/n;
    .locals 2

    new-instance v0, Ls8/n$b;

    invoke-direct {v0}, Ls8/n$b;-><init>()V

    iget-object v1, p0, Lv7/p0$a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ls8/n$b;->i(Landroid/net/Uri;)Ls8/n$b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ls8/n$b;->h(J)Ls8/n$b;

    move-result-object p1

    iget-object p2, p0, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {p2}, Lv7/p0;->C(Lv7/p0;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls8/n$b;->f(Ljava/lang/String;)Ls8/n$b;

    move-result-object p1

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Ls8/n$b;->b(I)Ls8/n$b;

    move-result-object p1

    invoke-static {}, Lv7/p0;->B()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls8/n$b;->e(Ljava/util/Map;)Ls8/n$b;

    move-result-object p1

    invoke-virtual {p1}, Ls8/n$b;->a()Ls8/n;

    move-result-object p1

    return-object p1
.end method

.method private j(JJ)V
    .locals 1

    iget-object v0, p0, Lv7/p0$a;->g:Ly6/y;

    iput-wide p1, v0, Ly6/y;->a:J

    iput-wide p3, p0, Lv7/p0$a;->j:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/p0$a;->i:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lv7/p0$a;->m:Z

    return-void
.end method


# virtual methods
.method public a(Lt8/e0;)V
    .locals 11

    iget-boolean v0, p0, Lv7/p0$a;->m:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-wide v2, p0, Lv7/p0$a;->j:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v0, v1}, Lv7/p0;->A(Lv7/p0;Z)J

    move-result-wide v2

    iget-wide v4, p0, Lv7/p0$a;->j:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :goto_0
    move-wide v5, v2

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v8

    iget-object v0, p0, Lv7/p0$a;->l:Ly6/b0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ly6/b0;

    invoke-interface {v4, p1, v8}, Ly6/b0;->a(Lt8/e0;I)V

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Ly6/b0;->b(JIIILy6/b0$a;)V

    iput-boolean v1, p0, Lv7/p0$a;->m:Z

    return-void
.end method

.method public b()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-nez v2, :cond_9

    iget-boolean v3, v1, Lv7/p0$a;->h:Z

    if-nez v3, :cond_9

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    :try_start_0
    iget-object v6, v1, Lv7/p0$a;->g:Ly6/y;

    iget-wide v13, v6, Ly6/y;->a:J

    invoke-direct {v1, v13, v14}, Lv7/p0$a;->i(J)Ls8/n;

    move-result-object v6

    iput-object v6, v1, Lv7/p0$a;->k:Ls8/n;

    iget-object v7, v1, Lv7/p0$a;->c:Ls8/l0;

    invoke-virtual {v7, v6}, Ls8/l0;->o(Ls8/n;)J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-eqz v8, :cond_0

    add-long/2addr v6, v13

    iget-object v8, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v8}, Lv7/p0;->D(Lv7/p0;)V

    :cond_0
    move-wide v15, v6

    iget-object v6, v1, Lv7/p0$a;->n:Lv7/p0;

    iget-object v7, v1, Lv7/p0$a;->c:Ls8/l0;

    invoke-virtual {v7}, Ls8/l0;->e()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Lp7/b;->a(Ljava/util/Map;)Lp7/b;

    move-result-object v7

    invoke-static {v6, v7}, Lv7/p0;->F(Lv7/p0;Lp7/b;)Lp7/b;

    iget-object v6, v1, Lv7/p0$a;->c:Ls8/l0;

    iget-object v7, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v7}, Lv7/p0;->E(Lv7/p0;)Lp7/b;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v7, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v7}, Lv7/p0;->E(Lv7/p0;)Lp7/b;

    move-result-object v7

    iget v7, v7, Lp7/b;->f:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    new-instance v6, Lv7/t;

    iget-object v7, v1, Lv7/p0$a;->c:Ls8/l0;

    iget-object v8, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v8}, Lv7/p0;->E(Lv7/p0;)Lp7/b;

    move-result-object v8

    iget v8, v8, Lp7/b;->f:I

    invoke-direct {v6, v7, v8, v1}, Lv7/t;-><init>(Ls8/j;ILv7/t$a;)V

    iget-object v7, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-virtual {v7}, Lv7/p0;->N()Ly6/b0;

    move-result-object v7

    iput-object v7, v1, Lv7/p0$a;->l:Ly6/b0;

    invoke-static {}, Lv7/p0;->G()Lt6/u1;

    move-result-object v8

    invoke-interface {v7, v8}, Ly6/b0;->c(Lt6/u1;)V

    :cond_1
    move-object v8, v6

    iget-object v7, v1, Lv7/p0$a;->d:Lv7/k0;

    iget-object v9, v1, Lv7/p0$a;->b:Landroid/net/Uri;

    iget-object v6, v1, Lv7/p0$a;->c:Ls8/l0;

    invoke-virtual {v6}, Ls8/l0;->e()Ljava/util/Map;

    move-result-object v10

    iget-object v6, v1, Lv7/p0$a;->e:Ly6/m;

    move-wide v11, v13

    move-wide v4, v13

    move-wide v13, v15

    move-object v15, v6

    invoke-interface/range {v7 .. v15}, Lv7/k0;->e(Ls8/h;Landroid/net/Uri;Ljava/util/Map;JJLy6/m;)V

    iget-object v6, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v6}, Lv7/p0;->E(Lv7/p0;)Lp7/b;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v6, v1, Lv7/p0$a;->d:Lv7/k0;

    invoke-interface {v6}, Lv7/k0;->b()V

    :cond_2
    iget-boolean v6, v1, Lv7/p0$a;->i:Z

    if-eqz v6, :cond_3

    iget-object v6, v1, Lv7/p0$a;->d:Lv7/k0;

    iget-wide v7, v1, Lv7/p0$a;->j:J

    invoke-interface {v6, v4, v5, v7, v8}, Lv7/k0;->a(JJ)V

    iput-boolean v0, v1, Lv7/p0$a;->i:Z

    :cond_3
    :goto_1
    move-wide v13, v4

    :cond_4
    if-nez v2, :cond_5

    iget-boolean v4, v1, Lv7/p0$a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    :try_start_1
    iget-object v4, v1, Lv7/p0$a;->f:Lt8/g;

    invoke-virtual {v4}, Lt8/g;->a()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, v1, Lv7/p0$a;->d:Lv7/k0;

    iget-object v5, v1, Lv7/p0$a;->g:Ly6/y;

    invoke-interface {v4, v5}, Lv7/k0;->c(Ly6/y;)I

    move-result v2

    iget-object v4, v1, Lv7/p0$a;->d:Lv7/k0;

    invoke-interface {v4}, Lv7/k0;->d()J

    move-result-wide v4

    iget-object v6, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v6}, Lv7/p0;->H(Lv7/p0;)J

    move-result-wide v6

    add-long/2addr v6, v13

    cmp-long v6, v4, v6

    if-lez v6, :cond_4

    iget-object v6, v1, Lv7/p0$a;->f:Lt8/g;

    invoke-virtual {v6}, Lt8/g;->c()Z

    iget-object v6, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v6}, Lv7/p0;->z(Lv7/p0;)Landroid/os/Handler;

    move-result-object v6

    iget-object v7, v1, Lv7/p0$a;->n:Lv7/p0;

    invoke-static {v7}, Lv7/p0;->y(Lv7/p0;)Ljava/lang/Runnable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    if-ne v2, v3, :cond_6

    move v2, v0

    goto :goto_2

    :cond_6
    iget-object v3, v1, Lv7/p0$a;->d:Lv7/k0;

    invoke-interface {v3}, Lv7/k0;->d()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-eqz v3, :cond_7

    iget-object v3, v1, Lv7/p0$a;->g:Ly6/y;

    iget-object v4, v1, Lv7/p0$a;->d:Lv7/k0;

    invoke-interface {v4}, Lv7/k0;->d()J

    move-result-wide v4

    iput-wide v4, v3, Ly6/y;->a:J

    :cond_7
    :goto_2
    iget-object v3, v1, Lv7/p0$a;->c:Ls8/l0;

    invoke-static {v3}, Ls8/m;->a(Ls8/j;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    if-eq v2, v3, :cond_8

    iget-object v2, v1, Lv7/p0$a;->d:Lv7/k0;

    invoke-interface {v2}, Lv7/k0;->d()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_8

    iget-object v2, v1, Lv7/p0$a;->g:Ly6/y;

    iget-object v3, v1, Lv7/p0$a;->d:Lv7/k0;

    invoke-interface {v3}, Lv7/k0;->d()J

    move-result-wide v3

    iput-wide v3, v2, Ly6/y;->a:J

    :cond_8
    iget-object v2, v1, Lv7/p0$a;->c:Ls8/l0;

    invoke-static {v2}, Ls8/m;->a(Ls8/j;)V

    throw v0

    :cond_9
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/p0$a;->h:Z

    return-void
.end method
