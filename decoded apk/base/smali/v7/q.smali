.class public final Lv7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/a0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/q$b;,
        Lv7/q$a;
    }
.end annotation


# instance fields
.field private final a:Lv7/q$a;

.field private b:Ls8/j$a;

.field private c:Lv7/a0$a;

.field private d:Ls8/d0;

.field private e:J

.field private f:J

.field private g:J

.field private h:F

.field private i:F

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ly6/p;)V
    .locals 1

    new-instance v0, Ls8/r$a;

    invoke-direct {v0, p1}, Ls8/r$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lv7/q;-><init>(Ls8/j$a;Ly6/p;)V

    return-void
.end method

.method public constructor <init>(Ls8/j$a;Ly6/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/q;->b:Ls8/j$a;

    new-instance v0, Lv7/q$a;

    invoke-direct {v0, p2}, Lv7/q$a;-><init>(Ly6/p;)V

    iput-object v0, p0, Lv7/q;->a:Lv7/q$a;

    invoke-virtual {v0, p1}, Lv7/q$a;->m(Ls8/j$a;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lv7/q;->e:J

    iput-wide p1, p0, Lv7/q;->f:J

    iput-wide p1, p0, Lv7/q;->g:J

    const p1, -0x800001

    iput p1, p0, Lv7/q;->h:F

    iput p1, p0, Lv7/q;->i:F

    return-void
.end method

.method public static synthetic d(Lt6/u1;)[Ly6/k;
    .locals 0

    invoke-static {p0}, Lv7/q;->g(Lt6/u1;)[Ly6/k;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Ljava/lang/Class;)Lv7/a0$a;
    .locals 0

    invoke-static {p0}, Lv7/q;->j(Ljava/lang/Class;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q;->k(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Lt6/u1;)[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    sget-object v1, Lg8/l;->a:Lg8/l;

    invoke-interface {v1, p0}, Lg8/l;->a(Lt6/u1;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lg8/m;

    invoke-interface {v1, p0}, Lg8/l;->b(Lt6/u1;)Lg8/j;

    move-result-object v1

    invoke-direct {v2, v1, p0}, Lg8/m;-><init>(Lg8/j;Lt6/u1;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lv7/q$b;

    invoke-direct {v2, p0}, Lv7/q$b;-><init>(Lt6/u1;)V

    :goto_0
    const/4 p0, 0x0

    aput-object v2, v0, p0

    return-object v0
.end method

.method private static h(Lt6/c2;Lv7/a0;)Lv7/a0;
    .locals 10

    iget-object v0, p0, Lt6/c2;->f:Lt6/c2$d;

    iget-wide v1, v0, Lt6/c2$d;->a:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-wide v1, v0, Lt6/c2$d;->b:J

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-boolean v0, v0, Lt6/c2$d;->d:Z

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lv7/e;

    iget-object v1, p0, Lt6/c2;->f:Lt6/c2$d;

    iget-wide v1, v1, Lt6/c2$d;->a:J

    invoke-static {v1, v2}, Lt8/r0;->C0(J)J

    move-result-wide v3

    iget-object v1, p0, Lt6/c2;->f:Lt6/c2$d;

    iget-wide v1, v1, Lt6/c2$d;->b:J

    invoke-static {v1, v2}, Lt8/r0;->C0(J)J

    move-result-wide v5

    iget-object p0, p0, Lt6/c2;->f:Lt6/c2$d;

    iget-boolean v1, p0, Lt6/c2$d;->e:Z

    xor-int/lit8 v7, v1, 0x1

    iget-boolean v8, p0, Lt6/c2$d;->c:Z

    iget-boolean v9, p0, Lt6/c2$d;->d:Z

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lv7/e;-><init>(Lv7/a0;JJZZZ)V

    return-object v0
.end method

.method private i(Lt6/c2;Lv7/a0;)Lv7/a0;
    .locals 1

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p2
.end method

.method private static j(Ljava/lang/Class;)Lv7/a0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lv7/a0$a;",
            ">;)",
            "Lv7/a0$a;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv7/a0$a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static k(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lv7/a0$a;",
            ">;",
            "Ls8/j$a;",
            ")",
            "Lv7/a0$a;"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ls8/j$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv7/a0$a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public a(Lt6/c2;)Lv7/a0;
    .locals 8

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    iget-object v0, v0, Lt6/c2$h;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "ssai"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/q;->c:Lv7/a0$a;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/a0$a;

    invoke-interface {v0, p1}, Lv7/a0$a;->a(Lt6/c2;)Lv7/a0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    iget-object v1, v0, Lt6/c2$h;->a:Landroid/net/Uri;

    iget-object v0, v0, Lt6/c2$h;->b:Ljava/lang/String;

    invoke-static {v1, v0}, Lt8/r0;->p0(Landroid/net/Uri;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lv7/q;->a:Lv7/q$a;

    invoke-virtual {v1, v0}, Lv7/q$a;->f(I)Lv7/a0$a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No suitable media source factory found for content type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lt8/a;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lt6/c2;->d:Lt6/c2$g;

    invoke-virtual {v0}, Lt6/c2$g;->c()Lt6/c2$g$a;

    move-result-object v0

    iget-object v2, p1, Lt6/c2;->d:Lt6/c2$g;

    iget-wide v2, v2, Lt6/c2$g;->a:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    iget-wide v2, p0, Lv7/q;->e:J

    invoke-virtual {v0, v2, v3}, Lt6/c2$g$a;->k(J)Lt6/c2$g$a;

    :cond_1
    iget-object v2, p1, Lt6/c2;->d:Lt6/c2$g;

    iget v2, v2, Lt6/c2$g;->d:F

    const v3, -0x800001

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, Lv7/q;->h:F

    invoke-virtual {v0, v2}, Lt6/c2$g$a;->j(F)Lt6/c2$g$a;

    :cond_2
    iget-object v2, p1, Lt6/c2;->d:Lt6/c2$g;

    iget v2, v2, Lt6/c2$g;->e:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lv7/q;->i:F

    invoke-virtual {v0, v2}, Lt6/c2$g$a;->h(F)Lt6/c2$g$a;

    :cond_3
    iget-object v2, p1, Lt6/c2;->d:Lt6/c2$g;

    iget-wide v2, v2, Lt6/c2$g;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    iget-wide v2, p0, Lv7/q;->f:J

    invoke-virtual {v0, v2, v3}, Lt6/c2$g$a;->i(J)Lt6/c2$g$a;

    :cond_4
    iget-object v2, p1, Lt6/c2;->d:Lt6/c2$g;

    iget-wide v2, v2, Lt6/c2$g;->c:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_5

    iget-wide v2, p0, Lv7/q;->g:J

    invoke-virtual {v0, v2, v3}, Lt6/c2$g$a;->g(J)Lt6/c2$g$a;

    :cond_5
    invoke-virtual {v0}, Lt6/c2$g$a;->f()Lt6/c2$g;

    move-result-object v0

    iget-object v2, p1, Lt6/c2;->d:Lt6/c2$g;

    invoke-virtual {v0, v2}, Lt6/c2$g;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, Lt6/c2;->c()Lt6/c2$c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lt6/c2$c;->c(Lt6/c2$g;)Lt6/c2$c;

    move-result-object p1

    invoke-virtual {p1}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object p1

    :cond_6
    invoke-interface {v1, p1}, Lv7/a0$a;->a(Lt6/c2;)Lv7/a0;

    move-result-object v0

    iget-object v1, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/c2$h;

    iget-object v1, v1, Lt6/c2$h;->f:Lcom/google/common/collect/w;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Lv7/a0;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_a

    iget-boolean v0, p0, Lv7/q;->j:Z

    if-eqz v0, :cond_8

    new-instance v0, Lt6/u1$b;

    invoke-direct {v0}, Lt6/u1$b;-><init>()V

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/c2$l;

    iget-object v6, v6, Lt6/c2$l;->b:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/c2$l;

    iget-object v6, v6, Lt6/c2$l;->c:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lt6/u1$b;->X(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/c2$l;

    iget v6, v6, Lt6/c2$l;->d:I

    invoke-virtual {v0, v6}, Lt6/u1$b;->i0(I)Lt6/u1$b;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/c2$l;

    iget v6, v6, Lt6/c2$l;->e:I

    invoke-virtual {v0, v6}, Lt6/u1$b;->e0(I)Lt6/u1$b;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/c2$l;

    iget-object v6, v6, Lt6/c2$l;->f:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lt6/u1$b;->W(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/c2$l;

    iget-object v6, v6, Lt6/c2$l;->g:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v0

    new-instance v6, Lv7/k;

    invoke-direct {v6, v0}, Lv7/k;-><init>(Lt6/u1;)V

    new-instance v0, Lv7/q0$b;

    iget-object v7, p0, Lv7/q;->b:Ls8/j$a;

    invoke-direct {v0, v7, v6}, Lv7/q0$b;-><init>(Ls8/j$a;Ly6/p;)V

    iget-object v6, p0, Lv7/q;->d:Ls8/d0;

    if-eqz v6, :cond_7

    invoke-virtual {v0, v6}, Lv7/q0$b;->h(Ls8/d0;)Lv7/q0$b;

    :cond_7
    add-int/lit8 v6, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt6/c2$l;

    iget-object v7, v7, Lt6/c2$l;->a:Landroid/net/Uri;

    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lt6/c2;->f(Ljava/lang/String;)Lt6/c2;

    move-result-object v7

    invoke-virtual {v0, v7}, Lv7/q0$b;->e(Lt6/c2;)Lv7/q0;

    move-result-object v0

    aput-object v0, v2, v6

    goto :goto_1

    :cond_8
    new-instance v0, Lv7/a1$b;

    iget-object v6, p0, Lv7/q;->b:Ls8/j$a;

    invoke-direct {v0, v6}, Lv7/a1$b;-><init>(Ls8/j$a;)V

    iget-object v6, p0, Lv7/q;->d:Ls8/d0;

    if-eqz v6, :cond_9

    invoke-virtual {v0, v6}, Lv7/a1$b;->b(Ls8/d0;)Lv7/a1$b;

    :cond_9
    add-int/lit8 v6, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt6/c2$l;

    invoke-virtual {v0, v7, v4, v5}, Lv7/a1$b;->a(Lt6/c2$l;J)Lv7/a1;

    move-result-object v0

    aput-object v0, v2, v6

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_a
    new-instance v0, Lv7/j0;

    invoke-direct {v0, v2}, Lv7/j0;-><init>([Lv7/a0;)V

    :cond_b
    invoke-static {p1, v0}, Lv7/q;->h(Lt6/c2;Lv7/a0;)Lv7/a0;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lv7/q;->i(Lt6/c2;Lv7/a0;)Lv7/a0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lx6/x;)Lv7/a0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lv7/q;->l(Lx6/x;)Lv7/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ls8/d0;)Lv7/a0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lv7/q;->m(Ls8/d0;)Lv7/q;

    move-result-object p1

    return-object p1
.end method

.method public l(Lx6/x;)Lv7/q;
    .locals 2

    iget-object v0, p0, Lv7/q;->a:Lv7/q$a;

    const-string v1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v1}, Lt8/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/x;

    invoke-virtual {v0, p1}, Lv7/q$a;->n(Lx6/x;)V

    return-object p0
.end method

.method public m(Ls8/d0;)Lv7/q;
    .locals 1

    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lt8/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/d0;

    iput-object v0, p0, Lv7/q;->d:Ls8/d0;

    iget-object v0, p0, Lv7/q;->a:Lv7/q$a;

    invoke-virtual {v0, p1}, Lv7/q$a;->o(Ls8/d0;)V

    return-object p0
.end method
