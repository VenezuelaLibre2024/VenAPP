.class Lx6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/g$d;,
        Lx6/g$c;,
        Lx6/g$e;,
        Lx6/g$b;,
        Lx6/g$a;,
        Lx6/g$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx6/m$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lx6/b0;

.field private final c:Lx6/g$a;

.field private final d:Lx6/g$b;

.field private final e:I

.field private final f:Z

.field private final g:Z

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lt8/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/i<",
            "Lx6/u$a;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ls8/d0;

.field private final k:Lu6/m3;

.field private final l:Lx6/l0;

.field private final m:Ljava/util/UUID;

.field private final n:Landroid/os/Looper;

.field private final o:Lx6/g$e;

.field private p:I

.field private q:I

.field private r:Landroid/os/HandlerThread;

.field private s:Lx6/g$c;

.field private t:Lw6/b;

.field private u:Lx6/n$a;

.field private v:[B

.field private w:[B

.field private x:Lx6/b0$a;

.field private y:Lx6/b0$d;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lx6/b0;Lx6/g$a;Lx6/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lx6/l0;Landroid/os/Looper;Ls8/d0;Lu6/m3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lx6/b0;",
            "Lx6/g$a;",
            "Lx6/g$b;",
            "Ljava/util/List<",
            "Lx6/m$b;",
            ">;IZZ[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lx6/l0;",
            "Landroid/os/Looper;",
            "Ls8/d0;",
            "Lu6/m3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-eq p6, v0, :cond_0

    const/4 v0, 0x3

    if-ne p6, v0, :cond_1

    :cond_0
    invoke-static {p9}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-object p1, p0, Lx6/g;->m:Ljava/util/UUID;

    iput-object p3, p0, Lx6/g;->c:Lx6/g$a;

    iput-object p4, p0, Lx6/g;->d:Lx6/g$b;

    iput-object p2, p0, Lx6/g;->b:Lx6/b0;

    iput p6, p0, Lx6/g;->e:I

    iput-boolean p7, p0, Lx6/g;->f:Z

    iput-boolean p8, p0, Lx6/g;->g:Z

    if-eqz p9, :cond_2

    iput-object p9, p0, Lx6/g;->w:[B

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-static {p5}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lx6/g;->a:Ljava/util/List;

    iput-object p10, p0, Lx6/g;->h:Ljava/util/HashMap;

    iput-object p11, p0, Lx6/g;->l:Lx6/l0;

    new-instance p1, Lt8/i;

    invoke-direct {p1}, Lt8/i;-><init>()V

    iput-object p1, p0, Lx6/g;->i:Lt8/i;

    iput-object p13, p0, Lx6/g;->j:Ls8/d0;

    iput-object p14, p0, Lx6/g;->k:Lu6/m3;

    const/4 p1, 0x2

    iput p1, p0, Lx6/g;->p:I

    iput-object p12, p0, Lx6/g;->n:Landroid/os/Looper;

    new-instance p1, Lx6/g$e;

    invoke-direct {p1, p0, p12}, Lx6/g$e;-><init>(Lx6/g;Landroid/os/Looper;)V

    iput-object p1, p0, Lx6/g;->o:Lx6/g$e;

    return-void
.end method

.method private A(Ljava/lang/Exception;Z)V
    .locals 1

    instance-of v0, p1, Landroid/media/NotProvisionedException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lx6/g;->c:Lx6/g$a;

    invoke-interface {p1, p0}, Lx6/g$a;->b(Lx6/g;)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    :goto_0
    invoke-direct {p0, p1, p2}, Lx6/g;->y(Ljava/lang/Exception;I)V

    :goto_1
    return-void
.end method

.method private B()V
    .locals 2

    iget v0, p0, Lx6/g;->e:I

    if-nez v0, :cond_0

    iget v0, p0, Lx6/g;->p:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx6/g;->v:[B

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx6/g;->s(Z)V

    :cond_0
    return-void
.end method

.method private F(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx6/g;->y:Lx6/b0$d;

    if-ne p1, v0, :cond_2

    iget p1, p0, Lx6/g;->p:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lx6/g;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lx6/g;->y:Lx6/b0$d;

    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lx6/g;->c:Lx6/g$a;

    check-cast p2, Ljava/lang/Exception;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lx6/g$a;->a(Ljava/lang/Exception;Z)V

    return-void

    :cond_1
    :try_start_0
    iget-object p1, p0, Lx6/g;->b:Lx6/b0;

    check-cast p2, [B

    invoke-interface {p1, p2}, Lx6/b0;->e([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lx6/g;->c:Lx6/g$a;

    invoke-interface {p1}, Lx6/g$a;->c()V

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lx6/g;->c:Lx6/g$a;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lx6/g$a;->a(Ljava/lang/Exception;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method private G()Z
    .locals 4

    invoke-direct {p0}, Lx6/g;->v()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lx6/g;->b:Lx6/b0;

    invoke-interface {v0}, Lx6/b0;->c()[B

    move-result-object v0

    iput-object v0, p0, Lx6/g;->v:[B

    iget-object v2, p0, Lx6/g;->b:Lx6/b0;

    iget-object v3, p0, Lx6/g;->k:Lu6/m3;

    invoke-interface {v2, v0, v3}, Lx6/b0;->g([BLu6/m3;)V

    iget-object v0, p0, Lx6/g;->b:Lx6/b0;

    iget-object v2, p0, Lx6/g;->v:[B

    invoke-interface {v0, v2}, Lx6/b0;->i([B)Lw6/b;

    move-result-object v0

    iput-object v0, p0, Lx6/g;->t:Lw6/b;

    const/4 v0, 0x3

    iput v0, p0, Lx6/g;->p:I

    new-instance v2, Lx6/d;

    invoke-direct {v2, v0}, Lx6/d;-><init>(I)V

    invoke-direct {p0, v2}, Lx6/g;->r(Lt8/h;)V

    iget-object v0, p0, Lx6/g;->v:[B

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    invoke-direct {p0, v0, v1}, Lx6/g;->y(Ljava/lang/Exception;I)V

    goto :goto_0

    :catch_1
    iget-object v0, p0, Lx6/g;->c:Lx6/g$a;

    invoke-interface {v0, p0}, Lx6/g$a;->b(Lx6/g;)V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private H([BIZ)V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lx6/g;->b:Lx6/b0;

    iget-object v2, p0, Lx6/g;->a:Ljava/util/List;

    iget-object v3, p0, Lx6/g;->h:Ljava/util/HashMap;

    invoke-interface {v1, p1, v2, p2, v3}, Lx6/b0;->m([BLjava/util/List;ILjava/util/HashMap;)Lx6/b0$a;

    move-result-object p1

    iput-object p1, p0, Lx6/g;->x:Lx6/b0$a;

    iget-object p1, p0, Lx6/g;->s:Lx6/g$c;

    invoke-static {p1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/g$c;

    iget-object p2, p0, Lx6/g;->x:Lx6/b0$a;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, v0, p2, p3}, Lx6/g$c;->b(ILjava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1, v0}, Lx6/g;->A(Ljava/lang/Exception;Z)V

    :goto_0
    return-void
.end method

.method private J()Z
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lx6/g;->b:Lx6/b0;

    iget-object v2, p0, Lx6/g;->v:[B

    iget-object v3, p0, Lx6/g;->w:[B

    invoke-interface {v1, v2, v3}, Lx6/b0;->d([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    invoke-direct {p0, v1, v0}, Lx6/g;->y(Ljava/lang/Exception;I)V

    const/4 v0, 0x0

    return v0
.end method

.method private K()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lx6/g;->n:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nExpected thread: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx6/g;->n:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v0, v1}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static synthetic j(Ljava/lang/Exception;Lx6/u$a;)V
    .locals 0

    invoke-static {p0, p1}, Lx6/g;->w(Ljava/lang/Exception;Lx6/u$a;)V

    return-void
.end method

.method public static synthetic k(ILx6/u$a;)V
    .locals 0

    invoke-static {p0, p1}, Lx6/g;->x(ILx6/u$a;)V

    return-void
.end method

.method static synthetic l(Lx6/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx6/g;->F(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic m(Lx6/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx6/g;->z(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic n(Lx6/g;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lx6/g;->m:Ljava/util/UUID;

    return-object p0
.end method

.method static synthetic o(Lx6/g;)Lx6/l0;
    .locals 0

    iget-object p0, p0, Lx6/g;->l:Lx6/l0;

    return-object p0
.end method

.method static synthetic p(Lx6/g;)Ls8/d0;
    .locals 0

    iget-object p0, p0, Lx6/g;->j:Ls8/d0;

    return-object p0
.end method

.method static synthetic q(Lx6/g;)Lx6/g$e;
    .locals 0

    iget-object p0, p0, Lx6/g;->o:Lx6/g$e;

    return-object p0
.end method

.method private r(Lt8/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/h<",
            "Lx6/u$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx6/g;->i:Lt8/i;

    invoke-virtual {v0}, Lt8/i;->z0()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a;

    invoke-interface {p1, v1}, Lt8/h;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private s(Z)V
    .locals 8

    iget-boolean v0, p0, Lx6/g;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx6/g;->v:[B

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget v1, p0, Lx6/g;->e:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_4

    if-eq v1, v3, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v1, p0, Lx6/g;->w:[B

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lx6/g;->v:[B

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lx6/g;->w:[B

    invoke-direct {p0, v1, v0, p1}, Lx6/g;->H([BIZ)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lx6/g;->w:[B

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lx6/g;->J()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_3
    :goto_0
    invoke-direct {p0, v0, v3, p1}, Lx6/g;->H([BIZ)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lx6/g;->w:[B

    if-nez v1, :cond_5

    invoke-direct {p0, v0, v2, p1}, Lx6/g;->H([BIZ)V

    goto :goto_1

    :cond_5
    iget v1, p0, Lx6/g;->p:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_6

    invoke-direct {p0}, Lx6/g;->J()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_6
    invoke-direct {p0}, Lx6/g;->t()J

    move-result-wide v4

    iget v1, p0, Lx6/g;->e:I

    if-nez v1, :cond_7

    const-wide/16 v6, 0x3c

    cmp-long v1, v4, v6

    if-gtz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Offline license has expired or will expire soon. Remaining seconds: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v1}, Lt8/s;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    const-wide/16 v0, 0x0

    cmp-long p1, v4, v0

    if-gtz p1, :cond_8

    new-instance p1, Lx6/k0;

    invoke-direct {p1}, Lx6/k0;-><init>()V

    invoke-direct {p0, p1, v3}, Lx6/g;->y(Ljava/lang/Exception;I)V

    goto :goto_1

    :cond_8
    iput v2, p0, Lx6/g;->p:I

    new-instance p1, Lx6/f;

    invoke-direct {p1}, Lx6/f;-><init>()V

    invoke-direct {p0, p1}, Lx6/g;->r(Lt8/h;)V

    :cond_9
    :goto_1
    return-void
.end method

.method private t()J
    .locals 5

    sget-object v0, Lt6/p;->d:Ljava/util/UUID;

    iget-object v1, p0, Lx6/g;->m:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    invoke-static {p0}, Lx6/o0;->b(Lx6/n;)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private v()Z
    .locals 2

    iget v0, p0, Lx6/g;->p:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static synthetic w(Ljava/lang/Exception;Lx6/u$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lx6/u$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic x(ILx6/u$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lx6/u$a;->k(I)V

    return-void
.end method

.method private y(Ljava/lang/Exception;I)V
    .locals 1

    new-instance v0, Lx6/n$a;

    invoke-static {p1, p2}, Lx6/y;->a(Ljava/lang/Exception;I)I

    move-result p2

    invoke-direct {v0, p1, p2}, Lx6/n$a;-><init>(Ljava/lang/Throwable;I)V

    iput-object v0, p0, Lx6/g;->u:Lx6/n$a;

    const-string p2, "DefaultDrmSession"

    const-string v0, "DRM session error"

    invoke-static {p2, v0, p1}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Lx6/e;

    invoke-direct {p2, p1}, Lx6/e;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, p2}, Lx6/g;->r(Lt8/h;)V

    iget p1, p0, Lx6/g;->p:I

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lx6/g;->p:I

    :cond_0
    return-void
.end method

.method private z(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx6/g;->x:Lx6/b0$a;

    if-ne p1, v0, :cond_5

    invoke-direct {p0}, Lx6/g;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lx6/g;->x:Lx6/b0$a;

    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    check-cast p2, Ljava/lang/Exception;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Lx6/g;->A(Ljava/lang/Exception;Z)V

    return-void

    :cond_1
    :try_start_0
    check-cast p2, [B

    iget p1, p0, Lx6/g;->e:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lx6/g;->b:Lx6/b0;

    iget-object v0, p0, Lx6/g;->w:[B

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-interface {p1, v0, p2}, Lx6/b0;->l([B[B)[B

    new-instance p1, Lx6/b;

    invoke-direct {p1}, Lx6/b;-><init>()V

    :goto_0
    invoke-direct {p0, p1}, Lx6/g;->r(Lt8/h;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lx6/g;->b:Lx6/b0;

    iget-object v0, p0, Lx6/g;->v:[B

    invoke-interface {p1, v0, p2}, Lx6/b0;->l([B[B)[B

    move-result-object p1

    iget p2, p0, Lx6/g;->e:I

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    if-nez p2, :cond_4

    iget-object p2, p0, Lx6/g;->w:[B

    if-eqz p2, :cond_4

    :cond_3
    if-eqz p1, :cond_4

    array-length p2, p1

    if-eqz p2, :cond_4

    iput-object p1, p0, Lx6/g;->w:[B

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Lx6/g;->p:I

    new-instance p1, Lx6/c;

    invoke-direct {p1}, Lx6/c;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lx6/g;->A(Ljava/lang/Exception;Z)V

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public C(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lx6/g;->B()V

    :goto_0
    return-void
.end method

.method public D()V
    .locals 1

    invoke-direct {p0}, Lx6/g;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lx6/g;->s(Z)V

    :cond_0
    return-void
.end method

.method public E(Ljava/lang/Exception;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    :goto_0
    invoke-direct {p0, p1, p2}, Lx6/g;->y(Ljava/lang/Exception;I)V

    return-void
.end method

.method public I()V
    .locals 4

    iget-object v0, p0, Lx6/g;->b:Lx6/b0;

    invoke-interface {v0}, Lx6/b0;->b()Lx6/b0$d;

    move-result-object v0

    iput-object v0, p0, Lx6/g;->y:Lx6/b0$d;

    iget-object v0, p0, Lx6/g;->s:Lx6/g$c;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/g$c;

    iget-object v1, p0, Lx6/g;->y:Lx6/b0$d;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lx6/g$c;->b(ILjava/lang/Object;Z)V

    return-void
.end method

.method public final a()Lx6/n$a;
    .locals 2

    invoke-direct {p0}, Lx6/g;->K()V

    iget v0, p0, Lx6/g;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx6/g;->u:Lx6/n$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Ljava/util/UUID;
    .locals 1

    invoke-direct {p0}, Lx6/g;->K()V

    iget-object v0, p0, Lx6/g;->m:Ljava/util/UUID;

    return-object v0
.end method

.method public d(Lx6/u$a;)V
    .locals 3

    invoke-direct {p0}, Lx6/g;->K()V

    iget v0, p0, Lx6/g;->q:I

    if-gtz v0, :cond_0

    const-string p1, "DefaultDrmSession"

    const-string v0, "release() called on a session that\'s already fully released."

    invoke-static {p1, v0}, Lt8/s;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lx6/g;->q:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lx6/g;->p:I

    iget-object v0, p0, Lx6/g;->o:Lx6/g$e;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/g$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lx6/g;->s:Lx6/g$c;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/g$c;

    invoke-virtual {v0}, Lx6/g$c;->c()V

    iput-object v1, p0, Lx6/g;->s:Lx6/g$c;

    iget-object v0, p0, Lx6/g;->r:Landroid/os/HandlerThread;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    iput-object v1, p0, Lx6/g;->r:Landroid/os/HandlerThread;

    iput-object v1, p0, Lx6/g;->t:Lw6/b;

    iput-object v1, p0, Lx6/g;->u:Lx6/n$a;

    iput-object v1, p0, Lx6/g;->x:Lx6/b0$a;

    iput-object v1, p0, Lx6/g;->y:Lx6/b0$d;

    iget-object v0, p0, Lx6/g;->v:[B

    if-eqz v0, :cond_1

    iget-object v2, p0, Lx6/g;->b:Lx6/b0;

    invoke-interface {v2, v0}, Lx6/b0;->k([B)V

    iput-object v1, p0, Lx6/g;->v:[B

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lx6/g;->i:Lt8/i;

    invoke-virtual {v0, p1}, Lt8/i;->f(Ljava/lang/Object;)V

    iget-object v0, p0, Lx6/g;->i:Lt8/i;

    invoke-virtual {v0, p1}, Lt8/i;->d(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lx6/u$a;->m()V

    :cond_2
    iget-object p1, p0, Lx6/g;->d:Lx6/g$b;

    iget v0, p0, Lx6/g;->q:I

    invoke-interface {p1, p0, v0}, Lx6/g$b;->a(Lx6/g;I)V

    return-void
.end method

.method public e()Z
    .locals 1

    invoke-direct {p0}, Lx6/g;->K()V

    iget-boolean v0, p0, Lx6/g;->f:Z

    return v0
.end method

.method public final f()Lw6/b;
    .locals 1

    invoke-direct {p0}, Lx6/g;->K()V

    iget-object v0, p0, Lx6/g;->t:Lw6/b;

    return-object v0
.end method

.method public g(Lx6/u$a;)V
    .locals 3

    invoke-direct {p0}, Lx6/g;->K()V

    iget v0, p0, Lx6/g;->q:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session reference count less than zero: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lx6/g;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v0}, Lt8/s;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput v1, p0, Lx6/g;->q:I

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lx6/g;->i:Lt8/i;

    invoke-virtual {v0, p1}, Lt8/i;->c(Ljava/lang/Object;)V

    :cond_1
    iget v0, p0, Lx6/g;->q:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Lx6/g;->q:I

    if-ne v0, v2, :cond_3

    iget p1, p0, Lx6/g;->p:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Lt8/a;->g(Z)V

    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "ExoPlayer:DrmRequestHandler"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lx6/g;->r:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    new-instance p1, Lx6/g$c;

    iget-object v0, p0, Lx6/g;->r:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lx6/g$c;-><init>(Lx6/g;Landroid/os/Looper;)V

    iput-object p1, p0, Lx6/g;->s:Lx6/g$c;

    invoke-direct {p0}, Lx6/g;->G()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, v2}, Lx6/g;->s(Z)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    invoke-direct {p0}, Lx6/g;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lx6/g;->i:Lt8/i;

    invoke-virtual {v0, p1}, Lt8/i;->d(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v2, :cond_4

    iget v0, p0, Lx6/g;->p:I

    invoke-virtual {p1, v0}, Lx6/u$a;->k(I)V

    :cond_4
    :goto_0
    iget-object p1, p0, Lx6/g;->d:Lx6/g$b;

    iget v0, p0, Lx6/g;->q:I

    invoke-interface {p1, p0, v0}, Lx6/g$b;->b(Lx6/g;I)V

    return-void
.end method

.method public final getState()I
    .locals 1

    invoke-direct {p0}, Lx6/g;->K()V

    iget v0, p0, Lx6/g;->p:I

    return v0
.end method

.method public h()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lx6/g;->K()V

    iget-object v0, p0, Lx6/g;->v:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lx6/g;->b:Lx6/b0;

    invoke-interface {v1, v0}, Lx6/b0;->a([B)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public i(Ljava/lang/String;)Z
    .locals 2

    invoke-direct {p0}, Lx6/g;->K()V

    iget-object v0, p0, Lx6/g;->b:Lx6/b0;

    iget-object v1, p0, Lx6/g;->v:[B

    invoke-static {v1}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-interface {v0, v1, p1}, Lx6/b0;->j([BLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public u([B)Z
    .locals 1

    invoke-direct {p0}, Lx6/g;->K()V

    iget-object v0, p0, Lx6/g;->v:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method
