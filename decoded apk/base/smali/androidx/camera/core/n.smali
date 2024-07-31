.class public final Landroidx/camera/core/n;
.super Landroidx/camera/core/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/n$c;,
        Landroidx/camera/core/n$b;,
        Landroidx/camera/core/n$e;,
        Landroidx/camera/core/n$f;,
        Landroidx/camera/core/n$g;,
        Landroidx/camera/core/n$d;,
        Landroidx/camera/core/n$h;
    }
.end annotation


# static fields
.field public static final x:Landroidx/camera/core/n$c;

.field static final y:Le0/b;


# instance fields
.field private final n:Landroidx/camera/core/impl/g1$a;

.field private final o:I

.field private final p:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final q:I

.field private r:I

.field private s:Landroid/util/Rational;

.field t:Landroidx/camera/core/impl/y1$b;

.field private u:Ly/r;

.field private v:Ly/r0;

.field private final w:Ly/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/n$c;

    invoke-direct {v0}, Landroidx/camera/core/n$c;-><init>()V

    sput-object v0, Landroidx/camera/core/n;->x:Landroidx/camera/core/n$c;

    new-instance v0, Le0/b;

    invoke-direct {v0}, Le0/b;-><init>()V

    sput-object v0, Landroidx/camera/core/n;->y:Le0/b;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/impl/d1;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/camera/core/w;-><init>(Landroidx/camera/core/impl/k2;)V

    new-instance p1, Lw/d0;

    invoke-direct {p1}, Lw/d0;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/n;->n:Landroidx/camera/core/impl/g1$a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/camera/core/n;->r:I

    iput-object v0, p0, Landroidx/camera/core/n;->s:Landroid/util/Rational;

    new-instance p1, Landroidx/camera/core/n$a;

    invoke-direct {p1, p0}, Landroidx/camera/core/n$a;-><init>(Landroidx/camera/core/n;)V

    iput-object p1, p0, Landroidx/camera/core/n;->w:Ly/q;

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/d1;

    sget-object v0, Landroidx/camera/core/impl/d1;->H:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/impl/d1;->X()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput v0, p0, Landroidx/camera/core/n;->o:I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d1;->Z(I)I

    move-result p1

    iput p1, p0, Landroidx/camera/core/n;->q:I

    return-void
.end method

.method public static synthetic V(Landroidx/camera/core/n;Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/n;->h0(Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method

.method public static synthetic W(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/n;->j0(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/n;->i0(Landroidx/camera/core/impl/g1;)V

    return-void
.end method

.method private Y()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/n;->v:Ly/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly/r0;->e()V

    :cond_0
    return-void
.end method

.method private Z()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/camera/core/n;->a0(Z)V

    return-void
.end method

.method private a0(Z)V
    .locals 2

    const-string v0, "ImageCapture"

    const-string v1, "clearPipeline"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Landroidx/camera/core/n;->u:Ly/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly/r;->a()V

    iput-object v1, p0, Landroidx/camera/core/n;->u:Ly/r;

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/camera/core/n;->v:Ly/r0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ly/r0;->e()V

    iput-object v1, p0, Landroidx/camera/core/n;->v:Ly/r0;

    :cond_1
    return-void
.end method

.method private b0(Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;
    .locals 5

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v3, 0x1

    aput-object p3, v1, v3

    const-string v4, "createPipeline(cameraId: %s, streamSpec: %s)"

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "ImageCapture"

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Landroidx/camera/core/impl/c0;

    invoke-interface {v4}, Landroidx/camera/core/impl/c0;->m()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0}, Landroidx/camera/core/n;->g0()Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    move v2, v3

    :cond_1
    iget-object v3, p0, Landroidx/camera/core/n;->u:Ly/r;

    if-eqz v3, :cond_2

    invoke-static {v2}, Landroidx/core/util/h;->m(Z)V

    iget-object v3, p0, Landroidx/camera/core/n;->u:Ly/r;

    invoke-virtual {v3}, Ly/r;->a()V

    :cond_2
    new-instance v3, Ly/r;

    invoke-virtual {p0}, Landroidx/camera/core/w;->k()Lw/k;

    move-result-object v4

    invoke-direct {v3, p2, v1, v4, v2}, Ly/r;-><init>(Landroidx/camera/core/impl/d1;Landroid/util/Size;Lw/k;Z)V

    iput-object v3, p0, Landroidx/camera/core/n;->u:Ly/r;

    iget-object v1, p0, Landroidx/camera/core/n;->v:Ly/r0;

    if-nez v1, :cond_3

    new-instance v1, Ly/r0;

    iget-object v2, p0, Landroidx/camera/core/n;->w:Ly/q;

    invoke-direct {v1, v2}, Ly/r0;-><init>(Ly/q;)V

    iput-object v1, p0, Landroidx/camera/core/n;->v:Ly/r0;

    :cond_3
    iget-object v1, p0, Landroidx/camera/core/n;->v:Ly/r0;

    iget-object v2, p0, Landroidx/camera/core/n;->u:Ly/r;

    invoke-virtual {v1, v2}, Ly/r0;->l(Ly/r;)V

    iget-object v1, p0, Landroidx/camera/core/n;->u:Ly/r;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly/r;->f(Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/n;->d0()I

    move-result v2

    if-ne v2, v0, :cond_4

    invoke-virtual {p0}, Landroidx/camera/core/w;->g()Landroidx/camera/core/impl/y;

    move-result-object v0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/y;->a(Landroidx/camera/core/impl/y1$b;)V

    :cond_4
    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    :cond_5
    new-instance v0, Lw/e0;

    invoke-direct {v0, p0, p1, p2, p3}, Lw/e0;-><init>(Landroidx/camera/core/n;Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;)V

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/y1$b;->f(Landroidx/camera/core/impl/y1$c;)Landroidx/camera/core/impl/y1$b;

    return-object v1
.end method

.method private static f0(Ljava/util/List;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;I)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method private g0()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->e()Landroidx/camera/core/impl/u;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/u;->V(Landroidx/camera/core/impl/z1;)Landroidx/camera/core/impl/z1;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private synthetic h0(Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->x(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    iget-object p4, p0, Landroidx/camera/core/n;->v:Ly/r0;

    invoke-virtual {p4}, Ly/r0;->j()V

    const/4 p4, 0x1

    invoke-direct {p0, p4}, Landroidx/camera/core/n;->a0(Z)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/n;->b0(Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/n;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->D()V

    iget-object p1, p0, Landroidx/camera/core/n;->v:Ly/r0;

    invoke-virtual {p1}, Ly/r0;->k()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/camera/core/n;->Z()V

    :goto_0
    return-void
.end method

.method private static synthetic i0(Landroidx/camera/core/impl/g1;)V
    .locals 3

    const-string v0, "ImageCapture"

    :try_start_0
    invoke-interface {p0}, Landroidx/camera/core/impl/g1;->b()Landroidx/camera/core/o;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_1

    :try_start_2
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    if-eqz p0, :cond_0

    :try_start_3
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    const-string v1, "Failed to acquire latest image."

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return-void
.end method

.method private static synthetic j0(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private n0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->g()Landroidx/camera/core/impl/y;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/n;->e0()I

    move-result v2

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/y;->f(I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public F()V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    const-string v1, "Attached camera cannot be null"

    invoke-static {v0, v1}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public G()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/n;->n0()V

    return-void
.end method

.method protected H(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2$a;)Landroidx/camera/core/impl/k2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/b0;",
            "Landroidx/camera/core/impl/k2$a<",
            "***>;)",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/camera/core/impl/b0;->e()Landroidx/camera/core/impl/t1;

    move-result-object p1

    const-class v0, Ld0/h;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/t1;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/d1;->N:Landroidx/camera/core/impl/n0$a;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string v0, "ImageCapture"

    if-eqz p1, :cond_0

    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    invoke-static {v0, p1}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Requesting software JPEG due to device quirk."

    invoke-static {v0, p1}, Lw/o0;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    invoke-interface {p1, v1, v2}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/n;->c0(Landroidx/camera/core/impl/l1;)Z

    move-result p1

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/d1;->K:Landroidx/camera/core/impl/n0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/16 v1, 0x100

    const/16 v3, 0x23

    if-eqz v0, :cond_5

    invoke-direct {p0}, Landroidx/camera/core/n;->g0()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x1

    :goto_2
    const-string v2, "Cannot set non-JPEG buffer format with Extensions enabled."

    invoke-static {v1, v2}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    goto :goto_7

    :cond_5
    if-eqz p1, :cond_6

    :goto_4
    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_5
    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    goto :goto_7

    :cond_6
    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/f1;->o:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p1, v0, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_7

    :goto_6
    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :cond_7
    invoke-static {p1, v1}, Landroidx/camera/core/n;->f0(Ljava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {p1, v3}, Landroidx/camera/core/n;->f0(Ljava/util/List;I)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    :goto_7
    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1
.end method

.method public J()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/n;->Y()V

    return-void
.end method

.method protected K(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/n;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/core/n;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->d()Landroidx/camera/core/impl/b2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->f()Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/b2;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/d1;

    invoke-direct {p0, v0, v1, p1}, Landroidx/camera/core/n;->b0(Ljava/lang/String;Landroidx/camera/core/impl/d1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/n;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->B()V

    return-object p1
.end method

.method public M()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/n;->Y()V

    invoke-direct {p0}, Landroidx/camera/core/n;->Z()V

    return-void
.end method

.method c0(Landroidx/camera/core/impl/l1;)Z
    .locals 7

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Landroidx/camera/core/impl/d1;->N:Landroidx/camera/core/impl/n0$a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v1, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Landroidx/camera/core/n;->g0()Z

    move-result v0

    const-string v4, "ImageCapture"

    if-eqz v0, :cond_0

    const-string v0, "Software JPEG cannot be used with Extensions."

    invoke-static {v4, v0}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sget-object v5, Landroidx/camera/core/impl/d1;->K:Landroidx/camera/core/impl/n0$a;

    const/4 v6, 0x0

    invoke-interface {p1, v5, v6}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x100

    if-eq v5, v6, :cond_1

    const-string v0, "Software JPEG cannot be used with non-JPEG output buffer format."

    invoke-static {v4, v0}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    if-nez v3, :cond_2

    const-string v0, "Unable to support software JPEG. Disabling."

    invoke-static {v4, v0}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1, v2}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_2
    return v3
.end method

.method public d0()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/n;->o:I

    return v0
.end method

.method public e0()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/core/n;->r:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/d1;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/d1;->Y(I)I

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/camera/core/impl/l2;",
            ")",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/n;->x:Landroidx/camera/core/n$c;

    invoke-virtual {v0}, Landroidx/camera/core/n$c;->a()Landroidx/camera/core/impl/d1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/n;->d0()I

    move-result v2

    invoke-interface {p2, v1, v2}, Landroidx/camera/core/impl/l2;->a(Landroidx/camera/core/impl/l2$b;I)Landroidx/camera/core/impl/n0;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/n$c;->a()Landroidx/camera/core/impl/d1;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/n0;->O(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/n0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/n;->v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Landroidx/camera/core/n;->e0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public l0(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/n;->s:Landroid/util/Rational;

    return-void
.end method

.method m0(Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/w;->g()Landroidx/camera/core/impl/y;

    move-result-object v0

    iget v1, p0, Landroidx/camera/core/n;->o:I

    iget v2, p0, Landroidx/camera/core/n;->q:I

    invoke-interface {v0, p1, v1, v2}, Landroidx/camera/core/impl/y;->c(Ljava/util/List;II)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v0, Lw/f0;

    invoke-direct {v0}, Lw/f0;-><init>()V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v0, v1}, La0/f;->o(Lcom/google/common/util/concurrent/f;Lm/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method o0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->p:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/core/n;->e0()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-direct {p0}, Landroidx/camera/core/n;->n0()V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public t()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/w;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0;",
            ")",
            "Landroidx/camera/core/impl/k2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/n$b;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/n$b;

    move-result-object p1

    return-object p1
.end method
