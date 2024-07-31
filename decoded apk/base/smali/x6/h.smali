.class public Lx6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/h$f;,
        Lx6/h$c;,
        Lx6/h$h;,
        Lx6/h$g;,
        Lx6/h$d;,
        Lx6/h$e;,
        Lx6/h$b;
    }
.end annotation


# instance fields
.field private final c:Ljava/util/UUID;

.field private final d:Lx6/b0$c;

.field private final e:Lx6/l0;

.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Z

.field private final h:[I

.field private final i:Z

.field private final j:Lx6/h$g;

.field private final k:Ls8/d0;

.field private final l:Lx6/h$h;

.field private final m:J

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx6/g;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lx6/h$f;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lx6/g;",
            ">;"
        }
    .end annotation
.end field

.field private q:I

.field private r:Lx6/b0;

.field private s:Lx6/g;

.field private t:Lx6/g;

.field private u:Landroid/os/Looper;

.field private v:Landroid/os/Handler;

.field private w:I

.field private x:[B

.field private y:Lu6/m3;

.field volatile z:Lx6/h$d;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lx6/b0$c;Lx6/l0;Ljava/util/HashMap;Z[IZLs8/d0;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lx6/b0$c;",
            "Lx6/l0;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z[IZ",
            "Ls8/d0;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lt6/p;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v0, v1}, Lt8/a;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lx6/h;->c:Ljava/util/UUID;

    iput-object p2, p0, Lx6/h;->d:Lx6/b0$c;

    iput-object p3, p0, Lx6/h;->e:Lx6/l0;

    iput-object p4, p0, Lx6/h;->f:Ljava/util/HashMap;

    iput-boolean p5, p0, Lx6/h;->g:Z

    iput-object p6, p0, Lx6/h;->h:[I

    iput-boolean p7, p0, Lx6/h;->i:Z

    iput-object p8, p0, Lx6/h;->k:Ls8/d0;

    new-instance p1, Lx6/h$g;

    invoke-direct {p1, p0}, Lx6/h$g;-><init>(Lx6/h;)V

    iput-object p1, p0, Lx6/h;->j:Lx6/h$g;

    new-instance p1, Lx6/h$h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lx6/h$h;-><init>(Lx6/h;Lx6/h$a;)V

    iput-object p1, p0, Lx6/h;->l:Lx6/h$h;

    const/4 p1, 0x0

    iput p1, p0, Lx6/h;->w:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx6/h;->n:Ljava/util/List;

    invoke-static {}, Lcom/google/common/collect/c1;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lx6/h;->o:Ljava/util/Set;

    invoke-static {}, Lcom/google/common/collect/c1;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lx6/h;->p:Ljava/util/Set;

    iput-wide p9, p0, Lx6/h;->m:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/UUID;Lx6/b0$c;Lx6/l0;Ljava/util/HashMap;Z[IZLs8/d0;JLx6/h$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lx6/h;-><init>(Ljava/util/UUID;Lx6/b0$c;Lx6/l0;Ljava/util/HashMap;Z[IZLs8/d0;J)V

    return-void
.end method

.method private A(IZ)Lx6/n;
    .locals 4

    iget-object v0, p0, Lx6/h;->r:Lx6/b0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/b0;

    invoke-interface {v0}, Lx6/b0;->f()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    sget-boolean v1, Lx6/c0;->d:Z

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-object v1, p0, Lx6/h;->h:[I

    invoke-static {v1, p1}, Lt8/r0;->z0([II)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-interface {v0}, Lx6/b0;->f()I

    move-result p1

    if-ne p1, v3, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lx6/h;->s:Lx6/g;

    if-nez p1, :cond_2

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object p1

    invoke-direct {p0, p1, v3, v2, p2}, Lx6/h;->x(Ljava/util/List;ZLx6/u$a;Z)Lx6/g;

    move-result-object p1

    iget-object p2, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Lx6/h;->s:Lx6/g;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v2}, Lx6/g;->g(Lx6/u$a;)V

    :goto_1
    iget-object p1, p0, Lx6/h;->s:Lx6/g;

    return-object p1

    :cond_3
    :goto_2
    return-object v2
.end method

.method private B(Landroid/os/Looper;)V
    .locals 1

    iget-object v0, p0, Lx6/h;->z:Lx6/h$d;

    if-nez v0, :cond_0

    new-instance v0, Lx6/h$d;

    invoke-direct {v0, p0, p1}, Lx6/h$d;-><init>(Lx6/h;Landroid/os/Looper;)V

    iput-object v0, p0, Lx6/h;->z:Lx6/h$d;

    :cond_0
    return-void
.end method

.method private C()V
    .locals 1

    iget-object v0, p0, Lx6/h;->r:Lx6/b0;

    if-eqz v0, :cond_0

    iget v0, p0, Lx6/h;->q:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx6/h;->o:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx6/h;->r:Lx6/b0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/b0;

    invoke-interface {v0}, Lx6/b0;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lx6/h;->r:Lx6/b0;

    :cond_0
    return-void
.end method

.method private D()V
    .locals 3

    iget-object v0, p0, Lx6/h;->p:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/collect/a0;->r(Ljava/util/Collection;)Lcom/google/common/collect/a0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/a0;->m()Lcom/google/common/collect/h1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/n;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lx6/n;->d(Lx6/u$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private E()V
    .locals 2

    iget-object v0, p0, Lx6/h;->o:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/collect/a0;->r(Ljava/util/Collection;)Lcom/google/common/collect/a0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/a0;->m()Lcom/google/common/collect/h1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/h$f;

    invoke-virtual {v1}, Lx6/h$f;->release()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private G(Lx6/n;Lx6/u$a;)V
    .locals 4

    invoke-interface {p1, p2}, Lx6/n;->d(Lx6/u$a;)V

    iget-wide v0, p0, Lx6/h;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lx6/n;->d(Lx6/u$a;)V

    :cond_0
    return-void
.end method

.method private H(Z)V
    .locals 2

    const-string v0, "DefaultDrmSessionMgr"

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx6/h;->u:Landroid/os/Looper;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v1, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    invoke-static {v0, v1, p1}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v1, p0, Lx6/h;->u:Landroid/os/Looper;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq p1, v1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nExpected thread: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx6/h;->u:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v0, p1, v1}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic f(Lx6/h;)Lx6/g;
    .locals 0

    iget-object p0, p0, Lx6/h;->t:Lx6/g;

    return-object p0
.end method

.method static synthetic g(Lx6/h;Lx6/g;)Lx6/g;
    .locals 0

    iput-object p1, p0, Lx6/h;->t:Lx6/g;

    return-object p1
.end method

.method static synthetic h(Lx6/h;)Lx6/h$g;
    .locals 0

    iget-object p0, p0, Lx6/h;->j:Lx6/h$g;

    return-object p0
.end method

.method static synthetic i(Lx6/h;)V
    .locals 0

    invoke-direct {p0}, Lx6/h;->C()V

    return-void
.end method

.method static synthetic j(Lx6/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lx6/h;->o:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic k(Lx6/h;)Landroid/os/Looper;
    .locals 0

    iget-object p0, p0, Lx6/h;->u:Landroid/os/Looper;

    return-object p0
.end method

.method static synthetic l(Lx6/h;Landroid/os/Looper;Lx6/u$a;Lt6/u1;Z)Lx6/n;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lx6/h;->t(Landroid/os/Looper;Lx6/u$a;Lt6/u1;Z)Lx6/n;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Lx6/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lx6/h;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic n(Lx6/h;)J
    .locals 2

    iget-wide v0, p0, Lx6/h;->m:J

    return-wide v0
.end method

.method static synthetic o(Lx6/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lx6/h;->p:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic p(Lx6/h;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lx6/h;->v:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic q(Lx6/h;)I
    .locals 0

    iget p0, p0, Lx6/h;->q:I

    return p0
.end method

.method static synthetic r(Lx6/h;)Lx6/g;
    .locals 0

    iget-object p0, p0, Lx6/h;->s:Lx6/g;

    return-object p0
.end method

.method static synthetic s(Lx6/h;Lx6/g;)Lx6/g;
    .locals 0

    iput-object p1, p0, Lx6/h;->s:Lx6/g;

    return-object p1
.end method

.method private t(Landroid/os/Looper;Lx6/u$a;Lt6/u1;Z)Lx6/n;
    .locals 4

    invoke-direct {p0, p1}, Lx6/h;->B(Landroid/os/Looper;)V

    iget-object p1, p3, Lt6/u1;->z:Lx6/m;

    if-nez p1, :cond_0

    iget-object p1, p3, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {p1}, Lt8/w;->k(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1, p4}, Lx6/h;->A(IZ)Lx6/n;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, p0, Lx6/h;->x:[B

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p3, :cond_2

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/m;

    iget-object p3, p0, Lx6/h;->c:Ljava/util/UUID;

    invoke-static {p1, p3, v0}, Lx6/h;->y(Lx6/m;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p1, Lx6/h$e;

    iget-object p3, p0, Lx6/h;->c:Ljava/util/UUID;

    invoke-direct {p1, p3, v1}, Lx6/h$e;-><init>(Ljava/util/UUID;Lx6/h$a;)V

    const-string p3, "DefaultDrmSessionMgr"

    const-string p4, "DRM error"

    invoke-static {p3, p4, p1}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lx6/u$a;->l(Ljava/lang/Exception;)V

    :cond_1
    new-instance p2, Lx6/a0;

    new-instance p3, Lx6/n$a;

    const/16 p4, 0x1773

    invoke-direct {p3, p1, p4}, Lx6/n$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p2, p3}, Lx6/a0;-><init>(Lx6/n$a;)V

    return-object p2

    :cond_2
    move-object p1, v1

    :cond_3
    iget-boolean p3, p0, Lx6/h;->g:Z

    if-nez p3, :cond_4

    iget-object v1, p0, Lx6/h;->t:Lx6/g;

    goto :goto_0

    :cond_4
    iget-object p3, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx6/g;

    iget-object v3, v2, Lx6/g;->a:Ljava/util/List;

    invoke-static {v3, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v1, v2

    :cond_6
    :goto_0
    if-nez v1, :cond_8

    invoke-direct {p0, p1, v0, p2, p4}, Lx6/h;->x(Ljava/util/List;ZLx6/u$a;Z)Lx6/g;

    move-result-object v1

    iget-boolean p1, p0, Lx6/h;->g:Z

    if-nez p1, :cond_7

    iput-object v1, p0, Lx6/h;->t:Lx6/g;

    :cond_7
    iget-object p1, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {v1, p2}, Lx6/g;->g(Lx6/u$a;)V

    :goto_1
    return-object v1
.end method

.method private static u(Lx6/n;)Z
    .locals 3

    invoke-interface {p0}, Lx6/n;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget v0, Lt8/r0;->a:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    invoke-interface {p0}, Lx6/n;->a()Lx6/n$a;

    move-result-object p0

    invoke-static {p0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx6/n$a;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Landroid/media/ResourceBusyException;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private v(Lx6/m;)Z
    .locals 4

    iget-object v0, p0, Lx6/h;->x:[B

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lx6/h;->c:Ljava/util/UUID;

    invoke-static {p1, v0, v1}, Lx6/h;->y(Lx6/m;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget v0, p1, Lx6/m;->d:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Lx6/m;->e(I)Lx6/m$b;

    move-result-object v0

    sget-object v3, Lt6/p;->b:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Lx6/m$b;->d(Ljava/util/UUID;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lx6/h;->c:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "DefaultDrmSessionMgr"

    invoke-static {v3, v0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    iget-object p1, p1, Lx6/m;->c:Ljava/lang/String;

    if-eqz p1, :cond_8

    const-string v0, "cenc"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "cbcs"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget p1, Lt8/r0;->a:I

    const/16 v0, 0x19

    if-lt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    return v1

    :cond_5
    const-string v0, "cbc1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "cens"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    return v1

    :cond_7
    :goto_2
    return v2

    :cond_8
    :goto_3
    return v1
.end method

.method private w(Ljava/util/List;ZLx6/u$a;)Lx6/g;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx6/m$b;",
            ">;Z",
            "Lx6/u$a;",
            ")",
            "Lx6/g;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lx6/h;->r:Lx6/b0;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, v0, Lx6/h;->i:Z

    or-int v9, v1, p2

    new-instance v1, Lx6/g;

    iget-object v3, v0, Lx6/h;->c:Ljava/util/UUID;

    iget-object v4, v0, Lx6/h;->r:Lx6/b0;

    iget-object v5, v0, Lx6/h;->j:Lx6/h$g;

    iget-object v6, v0, Lx6/h;->l:Lx6/h$h;

    iget v8, v0, Lx6/h;->w:I

    iget-object v11, v0, Lx6/h;->x:[B

    iget-object v12, v0, Lx6/h;->f:Ljava/util/HashMap;

    iget-object v13, v0, Lx6/h;->e:Lx6/l0;

    iget-object v2, v0, Lx6/h;->u:Landroid/os/Looper;

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/os/Looper;

    iget-object v15, v0, Lx6/h;->k:Ls8/d0;

    iget-object v2, v0, Lx6/h;->y:Lu6/m3;

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lu6/m3;

    move-object v2, v1

    move-object/from16 v7, p1

    move/from16 v10, p2

    invoke-direct/range {v2 .. v16}, Lx6/g;-><init>(Ljava/util/UUID;Lx6/b0;Lx6/g$a;Lx6/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lx6/l0;Landroid/os/Looper;Ls8/d0;Lu6/m3;)V

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Lx6/g;->g(Lx6/u$a;)V

    iget-wide v2, v0, Lx6/h;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lx6/g;->g(Lx6/u$a;)V

    :cond_0
    return-object v1
.end method

.method private x(Ljava/util/List;ZLx6/u$a;Z)Lx6/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx6/m$b;",
            ">;Z",
            "Lx6/u$a;",
            "Z)",
            "Lx6/g;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lx6/h;->w(Ljava/util/List;ZLx6/u$a;)Lx6/g;

    move-result-object v0

    invoke-static {v0}, Lx6/h;->u(Lx6/n;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lx6/h;->p:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lx6/h;->D()V

    invoke-direct {p0, v0, p3}, Lx6/h;->G(Lx6/n;Lx6/u$a;)V

    invoke-direct {p0, p1, p2, p3}, Lx6/h;->w(Ljava/util/List;ZLx6/u$a;)Lx6/g;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lx6/h;->u(Lx6/n;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p4, :cond_2

    iget-object p4, p0, Lx6/h;->o:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_2

    invoke-direct {p0}, Lx6/h;->E()V

    iget-object p4, p0, Lx6/h;->p:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-direct {p0}, Lx6/h;->D()V

    :cond_1
    invoke-direct {p0, v0, p3}, Lx6/h;->G(Lx6/n;Lx6/u$a;)V

    invoke-direct {p0, p1, p2, p3}, Lx6/h;->w(Ljava/util/List;ZLx6/u$a;)Lx6/g;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private static y(Lx6/m;Ljava/util/UUID;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx6/m;",
            "Ljava/util/UUID;",
            "Z)",
            "Ljava/util/List<",
            "Lx6/m$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lx6/m;->d:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lx6/m;->d:I

    if-ge v2, v3, :cond_4

    invoke-virtual {p0, v2}, Lx6/m;->e(I)Lx6/m$b;

    move-result-object v3

    invoke-virtual {v3, p1}, Lx6/m$b;->d(Ljava/util/UUID;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v4, Lt6/p;->c:Ljava/util/UUID;

    invoke-virtual {v4, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lt6/p;->b:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Lx6/m$b;->d(Ljava/util/UUID;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v4, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_3

    iget-object v4, v3, Lx6/m$b;->e:[B

    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method private declared-synchronized z(Landroid/os/Looper;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lx6/h;->u:Landroid/os/Looper;

    if-nez v0, :cond_0

    iput-object p1, p0, Lx6/h;->u:Landroid/os/Looper;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lx6/h;->v:Landroid/os/Handler;

    goto :goto_1

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lt8/a;->g(Z)V

    iget-object p1, p0, Lx6/h;->v:Landroid/os/Handler;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public F(I[B)V
    .locals 1

    iget-object v0, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lt8/a;->g(Z)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput p1, p0, Lx6/h;->w:I

    iput-object p2, p0, Lx6/h;->x:[B

    return-void
.end method

.method public final a()V
    .locals 6

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lx6/h;->H(Z)V

    iget v0, p0, Lx6/h;->q:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lx6/h;->q:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx6/h;->r:Lx6/b0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lx6/h;->d:Lx6/b0$c;

    iget-object v2, p0, Lx6/h;->c:Ljava/util/UUID;

    invoke-interface {v0, v2}, Lx6/b0$c;->a(Ljava/util/UUID;)Lx6/b0;

    move-result-object v0

    iput-object v0, p0, Lx6/h;->r:Lx6/b0;

    new-instance v2, Lx6/h$c;

    invoke-direct {v2, p0, v1}, Lx6/h$c;-><init>(Lx6/h;Lx6/h$a;)V

    invoke-interface {v0, v2}, Lx6/b0;->h(Lx6/b0$b;)V

    goto :goto_1

    :cond_1
    iget-wide v2, p0, Lx6/h;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lx6/h;->n:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx6/g;

    invoke-virtual {v2, v1}, Lx6/g;->g(Lx6/u$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public b(Landroid/os/Looper;Lu6/m3;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/h;->z(Landroid/os/Looper;)V

    iput-object p2, p0, Lx6/h;->y:Lu6/m3;

    return-void
.end method

.method public c(Lx6/u$a;Lt6/u1;)Lx6/n;
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx6/h;->H(Z)V

    iget v1, p0, Lx6/h;->q:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    move v0, v2

    :cond_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lx6/h;->u:Landroid/os/Looper;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/h;->u:Landroid/os/Looper;

    invoke-direct {p0, v0, p1, p2, v2}, Lx6/h;->t(Landroid/os/Looper;Lx6/u$a;Lt6/u1;Z)Lx6/n;

    move-result-object p1

    return-object p1
.end method

.method public d(Lt6/u1;)I
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx6/h;->H(Z)V

    iget-object v1, p0, Lx6/h;->r:Lx6/b0;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/b0;

    invoke-interface {v1}, Lx6/b0;->f()I

    move-result v1

    iget-object v2, p1, Lt6/u1;->z:Lx6/m;

    if-nez v2, :cond_1

    iget-object p1, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {p1}, Lt8/w;->k(Ljava/lang/String;)I

    move-result p1

    iget-object v2, p0, Lx6/h;->h:[I

    invoke-static {v2, p1}, Lt8/r0;->z0([II)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_0

    move v0, v1

    :cond_0
    return v0

    :cond_1
    invoke-direct {p0, v2}, Lx6/h;->v(Lx6/m;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :goto_0
    return v1
.end method

.method public e(Lx6/u$a;Lt6/u1;)Lx6/v$b;
    .locals 1

    iget v0, p0, Lx6/h;->q:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lx6/h;->u:Landroid/os/Looper;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lx6/h$f;

    invoke-direct {v0, p0, p1}, Lx6/h$f;-><init>(Lx6/h;Lx6/u$a;)V

    invoke-virtual {v0, p2}, Lx6/h$f;->e(Lt6/u1;)V

    return-object v0
.end method

.method public final release()V
    .locals 4

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lx6/h;->H(Z)V

    iget v1, p0, Lx6/h;->q:I

    sub-int/2addr v1, v0

    iput v1, p0, Lx6/h;->q:I

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lx6/h;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lx6/h;->n:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx6/g;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lx6/g;->d(Lx6/u$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lx6/h;->E()V

    invoke-direct {p0}, Lx6/h;->C()V

    return-void
.end method
