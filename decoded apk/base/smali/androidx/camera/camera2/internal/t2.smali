.class final Landroidx/camera/camera2/internal/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/y1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/t2$e;,
        Landroidx/camera/camera2/internal/t2$f;
    }
.end annotation


# static fields
.field private static q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field private static r:I


# instance fields
.field private final a:Landroidx/camera/core/impl/z1;

.field private final b:Landroidx/camera/camera2/internal/n0;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Landroidx/camera/camera2/internal/x1;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroidx/camera/core/impl/y1;

.field private h:Landroidx/camera/camera2/internal/i1;

.field private i:Landroidx/camera/core/impl/y1;

.field private j:Landroidx/camera/camera2/internal/t2$e;

.field private volatile k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation
.end field

.field volatile l:Z

.field private final m:Landroidx/camera/camera2/internal/t2$f;

.field private n:Lv/j;

.field private o:Lv/j;

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/t2;->q:Ljava/util/List;

    const/4 v0, 0x0

    sput v0, Landroidx/camera/camera2/internal/t2;->r:I

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/impl/z1;Landroidx/camera/camera2/internal/n0;Lr/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/t2;->l:Z

    new-instance v1, Lv/j$a;

    invoke-direct {v1}, Lv/j$a;-><init>()V

    invoke-virtual {v1}, Lv/j$a;->d()Lv/j;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/camera2/internal/t2;->n:Lv/j;

    new-instance v1, Lv/j$a;

    invoke-direct {v1}, Lv/j$a;-><init>()V

    invoke-virtual {v1}, Lv/j$a;->d()Lv/j;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/camera2/internal/t2;->o:Lv/j;

    iput v0, p0, Landroidx/camera/camera2/internal/t2;->p:I

    new-instance v0, Landroidx/camera/camera2/internal/x1;

    invoke-direct {v0, p3}, Landroidx/camera/camera2/internal/x1;-><init>(Lr/b;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->e:Landroidx/camera/camera2/internal/x1;

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    iput-object p2, p0, Landroidx/camera/camera2/internal/t2;->b:Landroidx/camera/camera2/internal/n0;

    iput-object p4, p0, Landroidx/camera/camera2/internal/t2;->c:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Landroidx/camera/camera2/internal/t2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object p1, Landroidx/camera/camera2/internal/t2$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    new-instance p1, Landroidx/camera/camera2/internal/t2$f;

    invoke-direct {p1}, Landroidx/camera/camera2/internal/t2$f;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->m:Landroidx/camera/camera2/internal/t2$f;

    sget p1, Landroidx/camera/camera2/internal/t2;->r:I

    add-int/lit8 p2, p1, 0x1

    sput p2, Landroidx/camera/camera2/internal/t2;->r:I

    iput p1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "New ProcessingCaptureSession (id="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ProcessingCaptureSession"

    invoke-static {p2, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Landroidx/camera/camera2/internal/t2;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/camera2/internal/t2;->u(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/camera/camera2/internal/t2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/t2;->s()V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/core/impl/r0;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/t2;->t(Landroidx/camera/core/impl/r0;)V

    return-void
.end method

.method public static synthetic l(Landroidx/camera/camera2/internal/t2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/t2;->w()V

    return-void
.end method

.method public static synthetic m(Landroidx/camera/camera2/internal/t2;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/t2;->v(Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private static n(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/l0;

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k;

    invoke-virtual {v1}, Landroidx/camera/core/impl/k;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static o(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/r0;

    instance-of v2, v1, Landroidx/camera/core/impl/a2;

    const-string v3, "Surface must be SessionProcessorSurface"

    invoke-static {v2, v3}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    check-cast v1, Landroidx/camera/core/impl/a2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private p(Landroidx/camera/core/impl/l0;)Z
    .locals 2

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r0;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroidx/camera/core/s;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private synthetic s()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->f:Ljava/util/List;

    invoke-static {v0}, Landroidx/camera/core/impl/w0;->e(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic t(Landroidx/camera/core/impl/r0;)V
    .locals 1

    sget-object v0, Landroidx/camera/camera2/internal/t2;->q:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic u(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-- getSurfaces done, start init (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ProcessingCaptureSession"

    invoke-static {v2, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    sget-object v3, Landroidx/camera/camera2/internal/t2$e;->DE_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    if-ne v0, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SessionProcessorCaptureSession is closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/r0;

    new-instance p2, Landroidx/camera/core/impl/r0$a;

    const-string p3, "Surface closed"

    invoke-direct {p2, p3, p1}, Landroidx/camera/core/impl/r0$a;-><init>(Ljava/lang/String;Landroidx/camera/core/impl/r0;)V

    invoke-static {p2}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p4, 0x0

    move v5, p4

    move-object v3, v0

    move-object v4, v3

    :goto_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/r0;

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/s;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->j()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->i()I

    move-result v6

    invoke-static {v0, v7, v6}, Landroidx/camera/core/impl/q1;->a(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/q1;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/n;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->j()Lcom/google/common/util/concurrent/f;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->i()I

    move-result v6

    invoke-static {v3, v7, v6}, Landroidx/camera/core/impl/q1;->a(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/q1;

    move-result-object v3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/f;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->j()Lcom/google/common/util/concurrent/f;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->h()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/r0;->i()I

    move-result v6

    invoke-static {v4, v7, v6}, Landroidx/camera/core/impl/q1;->a(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/q1;

    move-result-object v4

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_5
    sget-object v5, Landroidx/camera/camera2/internal/t2$e;->SESSION_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    iput-object v5, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    :try_start_0
    iget-object v5, p0, Landroidx/camera/camera2/internal/t2;->f:Ljava/util/List;

    invoke-static {v5}, Landroidx/camera/core/impl/w0;->f(Ljava/util/List;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/r0$a; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "== initSession (id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    iget-object v2, p0, Landroidx/camera/camera2/internal/t2;->b:Landroidx/camera/camera2/internal/n0;

    invoke-interface {v1, v2, v0, v3, v4}, Landroidx/camera/core/impl/z1;->h(Lw/o;Landroidx/camera/core/impl/q1;Landroidx/camera/core/impl/q1;Landroidx/camera/core/impl/q1;)Landroidx/camera/core/impl/y1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->i:Landroidx/camera/core/impl/y1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/core/impl/r0;

    invoke-virtual {p4}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object p4

    new-instance v0, Landroidx/camera/camera2/internal/r2;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/r2;-><init>(Landroidx/camera/camera2/internal/t2;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p4, v0, v1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p4, p0, Landroidx/camera/camera2/internal/t2;->i:Landroidx/camera/core/impl/y1;

    invoke-virtual {p4}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r0;

    sget-object v1, Landroidx/camera/camera2/internal/t2;->q:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object v1

    new-instance v2, Landroidx/camera/camera2/internal/s2;

    invoke-direct {v2, v0}, Landroidx/camera/camera2/internal/s2;-><init>(Landroidx/camera/core/impl/r0;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v0}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    :cond_6
    new-instance p4, Landroidx/camera/core/impl/y1$g;

    invoke-direct {p4}, Landroidx/camera/core/impl/y1$g;-><init>()V

    invoke-virtual {p4, p1}, Landroidx/camera/core/impl/y1$g;->a(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p4}, Landroidx/camera/core/impl/y1$g;->c()V

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->i:Landroidx/camera/core/impl/y1;

    invoke-virtual {p4, p1}, Landroidx/camera/core/impl/y1$g;->a(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p4}, Landroidx/camera/core/impl/y1$g;->e()Z

    move-result p1

    const-string v0, "Cannot transform the SessionConfig"

    invoke-static {p1, v0}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {p4}, Landroidx/camera/core/impl/y1$g;->b()Landroidx/camera/core/impl/y1;

    move-result-object p1

    iget-object p4, p0, Landroidx/camera/camera2/internal/t2;->e:Landroidx/camera/camera2/internal/x1;

    invoke-static {p2}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p4, p1, p2, p3}, Landroidx/camera/camera2/internal/x1;->g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance p2, Landroidx/camera/camera2/internal/t2$a;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/t2$a;-><init>(Landroidx/camera/camera2/internal/t2;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/t2;->c:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Landroidx/camera/camera2/internal/t2;->f:Ljava/util/List;

    invoke-static {p2}, Landroidx/camera/core/impl/w0;->e(Ljava/util/List;)V

    throw p1

    :catch_0
    move-exception p1

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private synthetic v(Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->e:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/t2;->x(Landroidx/camera/camera2/internal/x1;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic w()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "== deInitSession (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    invoke-interface {v0}, Landroidx/camera/core/impl/z1;->c()V

    return-void
.end method

.method private y(Lv/j;Lv/j;)V
    .locals 1

    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    invoke-virtual {v0, p1}, Lq/a$a;->d(Landroidx/camera/core/impl/n0;)Lq/a$a;

    invoke-virtual {v0, p2}, Lq/a$a;->d(Landroidx/camera/core/impl/n0;)Lq/a$a;

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object p2

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/z1;->i(Landroidx/camera/core/impl/n0;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "issueCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") + state ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/camera2/internal/t2$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Run issueCaptureRequests in wrong state, state = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/camera/camera2/internal/t2;->n(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/l0;

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0;->h()I

    move-result v1

    if-ne v1, v2, :cond_3

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/t2;->q(Landroidx/camera/core/impl/l0;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/t2;->r(Landroidx/camera/core/impl/l0;)V

    goto :goto_0

    :cond_4
    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    :cond_5
    :goto_1
    return-void
.end method

.method public b()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cancelIssuedCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/l0;

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/k;

    invoke-virtual {v2}, Landroidx/camera/core/impl/k;->a()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    :cond_2
    return-void
.end method

.method public c(Z)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "release (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") mProcessorState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->e:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/x1;->c(Z)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    sget-object v0, Landroidx/camera/camera2/internal/t2$d;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/camera/camera2/internal/o2;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/o2;-><init>(Landroidx/camera/camera2/internal/t2;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :goto_0
    sget-object v0, Landroidx/camera/camera2/internal/t2$e;->DE_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    return-object p1
.end method

.method public close()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    sget-object v2, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/t2$e;

    if-ne v0, v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "== onCaptureSessionEnd (id = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    invoke-interface {v0}, Landroidx/camera/core/impl/z1;->b()V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->h:Landroidx/camera/camera2/internal/i1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/i1;->a()V

    :cond_0
    sget-object v0, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_ENDED:Landroidx/camera/camera2/internal/t2$e;

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->e:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/x1;->close()V

    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e()Landroidx/camera/core/impl/y1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->g:Landroidx/camera/core/impl/y1;

    return-object v0
.end method

.method public f(Landroidx/camera/core/impl/y1;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSessionConfig (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->g:Landroidx/camera/core/impl/y1;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->h:Landroidx/camera/camera2/internal/i1;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/i1;->b(Landroidx/camera/core/impl/y1;)V

    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    sget-object v1, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/t2$e;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-static {v0}, Lv/j$a;->e(Landroidx/camera/core/impl/n0;)Lv/j$a;

    move-result-object v0

    invoke-virtual {v0}, Lv/j$a;->d()Lv/j;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->n:Lv/j;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->o:Lv/j;

    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/t2;->y(Lv/j;Lv/j;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/t2;->p(Landroidx/camera/core/impl/l0;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    invoke-interface {p1}, Landroidx/camera/core/impl/z1;->d()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->m:Landroidx/camera/camera2/internal/t2$f;

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/z1;->g(Landroidx/camera/core/impl/z1$a;)I

    :cond_3
    :goto_0
    return-void
.end method

.method public g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/y1;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Landroidx/camera/camera2/internal/j3;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    sget-object v1, Landroidx/camera/camera2/internal/t2$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state state:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "SessionConfig contains no surfaces"

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/camera2/internal/t2;->f:Ljava/util/List;

    const/4 v3, 0x0

    const-wide/16 v4, 0x1388

    iget-object v6, p0, Landroidx/camera/camera2/internal/t2;->c:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Landroidx/camera/camera2/internal/t2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static/range {v2 .. v7}, Landroidx/camera/core/impl/w0;->k(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-static {v0}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/p2;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/camera2/internal/p2;-><init>(Landroidx/camera/camera2/internal/t2;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    new-instance p2, Landroidx/camera/camera2/internal/q2;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/q2;-><init>(Landroidx/camera/camera2/internal/t2;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/t2;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, p3}, La0/d;->d(Lm/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method q(Landroidx/camera/core/impl/l0;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-static {v0}, Lv/j$a;->e(Landroidx/camera/core/impl/n0;)Lv/j$a;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/l0;->i:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lv/j$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/j$a;

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/l0;->j:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->byteValue()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lv/j$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/j$a;

    :cond_1
    invoke-virtual {v0}, Lv/j$a;->d()Lv/j;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->o:Lv/j;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->n:Lv/j;

    invoke-direct {p0, v1, v0}, Landroidx/camera/camera2/internal/t2;->y(Lv/j;Lv/j;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    new-instance v1, Landroidx/camera/camera2/internal/t2$c;

    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/t2$c;-><init>(Landroidx/camera/camera2/internal/t2;Landroidx/camera/core/impl/l0;)V

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/z1;->j(Landroidx/camera/core/impl/z1$a;)I

    return-void
.end method

.method r(Landroidx/camera/core/impl/l0;)V
    .locals 6

    const-string v0, "ProcessingCaptureSession"

    const-string v1, "issueTriggerRequest"

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-static {v0}, Lv/j$a;->e(Landroidx/camera/core/impl/n0;)Lv/j$a;

    move-result-object v0

    invoke-virtual {v0}, Lv/j$a;->d()Lv/j;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/u1;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/n0$a;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CaptureRequest$Key;

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v5}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v5}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    if-nez v1, :cond_3

    new-array v0, v3, [Landroidx/camera/core/impl/l0;

    aput-object p1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Landroidx/camera/camera2/internal/t2;->n(Ljava/util/List;)V

    return-void

    :cond_3
    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    new-instance v2, Landroidx/camera/camera2/internal/t2$b;

    invoke-direct {v2, p0, p1}, Landroidx/camera/camera2/internal/t2$b;-><init>(Landroidx/camera/camera2/internal/t2;Landroidx/camera/core/impl/l0;)V

    invoke-interface {v1, v0, v2}, Landroidx/camera/core/impl/z1;->f(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/z1$a;)I

    return-void
.end method

.method x(Landroidx/camera/camera2/internal/x1;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    sget-object v1, Landroidx/camera/camera2/internal/t2$e;->SESSION_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid state state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    new-instance v0, Landroidx/camera/camera2/internal/i1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t2;->i:Landroidx/camera/core/impl/y1;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Landroidx/camera/camera2/internal/t2;->o(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroidx/camera/camera2/internal/i1;-><init>(Landroidx/camera/camera2/internal/x1;Ljava/util/List;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/t2;->h:Landroidx/camera/camera2/internal/i1;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "== onCaptureSessinStarted (id = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroidx/camera/camera2/internal/t2;->p:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ProcessingCaptureSession"

    invoke-static {v0, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->a:Landroidx/camera/core/impl/z1;

    iget-object v0, p0, Landroidx/camera/camera2/internal/t2;->h:Landroidx/camera/camera2/internal/i1;

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/z1;->a(Landroidx/camera/core/impl/v1;)V

    sget-object p1, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/t2$e;

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->j:Landroidx/camera/camera2/internal/t2$e;

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->g:Landroidx/camera/core/impl/y1;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/t2;->f(Landroidx/camera/core/impl/y1;)V

    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/t2;->a(Ljava/util/List;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2;->k:Ljava/util/List;

    :cond_2
    return-void
.end method
