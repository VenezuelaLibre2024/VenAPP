.class public final Lw/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/v$a;
    }
.end annotation


# static fields
.field private static final o:Ljava/lang/Object;

.field private static final p:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Landroidx/camera/core/impl/e0;

.field private final b:Ljava/lang/Object;

.field private final c:Lw/w;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Landroid/os/Handler;

.field private final f:Landroid/os/HandlerThread;

.field private g:Landroidx/camera/core/impl/a0;

.field private h:Landroidx/camera/core/impl/z;

.field private i:Landroidx/camera/core/impl/l2;

.field private j:Landroid/content/Context;

.field private final k:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lw/v$a;

.field private m:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw/v;->o:Ljava/lang/Object;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lw/v;->p:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw/w$b;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/camera/core/impl/e0;

    invoke-direct {v0}, Landroidx/camera/core/impl/e0;-><init>()V

    iput-object v0, p0, Lw/v;->a:Landroidx/camera/core/impl/e0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lw/v;->b:Ljava/lang/Object;

    sget-object v0, Lw/v$a;->UNINITIALIZED:Lw/v$a;

    iput-object v0, p0, Lw/v;->l:Lw/v$a;

    const/4 v0, 0x0

    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v1

    iput-object v1, p0, Lw/v;->m:Lcom/google/common/util/concurrent/f;

    if-eqz p2, :cond_0

    :goto_0
    invoke-interface {p2}, Lw/w$b;->getCameraXConfig()Lw/w;

    move-result-object p2

    iput-object p2, p0, Lw/v;->c:Lw/w;

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lw/v;->g(Landroid/content/Context;)Lw/w$b;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_0

    :goto_1
    iget-object p2, p0, Lw/v;->c:Lw/w;

    invoke-virtual {p2, v0}, Lw/w;->X(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p2

    iget-object v1, p0, Lw/v;->c:Lw/w;

    invoke-virtual {v1, v0}, Lw/w;->a0(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object v1

    if-nez p2, :cond_1

    new-instance p2, Lw/m;

    invoke-direct {p2}, Lw/m;-><init>()V

    :cond_1
    iput-object p2, p0, Lw/v;->d:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_2

    new-instance p2, Landroid/os/HandlerThread;

    const-string v1, "CameraX-scheduler"

    const/16 v2, 0xa

    invoke-direct {p2, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Lw/v;->f:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {p2}, Landroidx/core/os/g;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p2

    iput-object p2, p0, Lw/v;->e:Landroid/os/Handler;

    goto :goto_2

    :cond_2
    iput-object v0, p0, Lw/v;->f:Landroid/os/HandlerThread;

    iput-object v1, p0, Lw/v;->e:Landroid/os/Handler;

    :goto_2
    iget-object p2, p0, Lw/v;->c:Lw/w;

    sget-object v1, Lw/w;->M:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p2, v1, v0}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    iput-object p2, p0, Lw/v;->n:Ljava/lang/Integer;

    invoke-static {p2}, Lw/v;->j(Ljava/lang/Integer;)V

    invoke-direct {p0, p1}, Lw/v;->l(Landroid/content/Context;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Lw/v;->k:Lcom/google/common/util/concurrent/f;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lw/v;Landroid/content/Context;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lw/v;->o(Landroid/content/Context;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lw/v;Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lw/v;->n(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method

.method public static synthetic c(Lw/v;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lw/v;->m(Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private static g(Landroid/content/Context;)Lw/w$b;
    .locals 5

    const-string v0, "CameraX"

    invoke-static {p0}, Landroidx/camera/core/impl/utils/g;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    instance-of v2, v1, Lw/w$b;

    if-eqz v2, :cond_0

    check-cast v1, Lw/w$b;

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0}, Landroidx/camera/core/impl/utils/g;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    const-class v4, Landroidx/camera/core/impl/MetadataHolderService;

    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 p0, 0x280

    invoke-virtual {v2, v3, p0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v2, "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_2

    const-string p0, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-static {v0, p0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/w$b;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    goto :goto_1

    :catch_5
    move-exception p0

    goto :goto_1

    :catch_6
    move-exception p0

    :goto_1
    const-string v2, "Failed to retrieve default CameraXConfig.Provider from meta-data"

    invoke-static {v0, v2, p0}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-object v1
.end method

.method private static j(Ljava/lang/Integer;)V
    .locals 5

    sget-object v0, Lw/v;->o:Ljava/lang/Object;

    monitor-enter v0

    if-nez p0, :cond_0

    :try_start_0
    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "minLogLevel"

    const/4 v3, 0x3

    const/4 v4, 0x6

    invoke-static {v1, v3, v4, v2}, Landroidx/core/util/h;->f(IIILjava/lang/String;)I

    sget-object v1, Lw/v;->p:Landroid/util/SparseArray;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v3, v2

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-static {}, Lw/v;->q()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private k(Ljava/util/concurrent/Executor;JLandroid/content/Context;Landroidx/concurrent/futures/c$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "J",
            "Landroid/content/Context;",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v7, Lw/t;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p5

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lw/t;-><init>(Lw/v;Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V

    invoke-interface {p1, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private l(Landroid/content/Context;)Lcom/google/common/util/concurrent/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/v;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw/v;->l:Lw/v$a;

    sget-object v2, Lw/v$a;->UNINITIALIZED:Lw/v$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "CameraX.initInternal() should only be called once per instance"

    invoke-static {v1, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    sget-object v1, Lw/v$a;->INITIALIZING:Lw/v$a;

    iput-object v1, p0, Lw/v;->l:Lw/v$a;

    new-instance v1, Lw/s;

    invoke-direct {v1, p0, p1}, Lw/s;-><init>(Lw/v;Landroid/content/Context;)V

    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic m(Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 6

    iget-object v4, p0, Lw/v;->j:Landroid/content/Context;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lw/v;->k(Ljava/util/concurrent/Executor;JLandroid/content/Context;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private synthetic n(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Landroidx/camera/core/impl/utils/g;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    iput-object v1, p0, Lw/v;->j:Landroid/content/Context;

    if-nez v1, :cond_0

    invoke-static {p1}, Landroidx/camera/core/impl/utils/g;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lw/v;->j:Landroid/content/Context;

    :cond_0
    iget-object p1, p0, Lw/v;->c:Lw/w;

    invoke-virtual {p1, v0}, Lw/w;->Y(Landroidx/camera/core/impl/a0$a;)Landroidx/camera/core/impl/a0$a;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lw/v;->d:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lw/v;->e:Landroid/os/Handler;

    invoke-static {v1, v2}, Landroidx/camera/core/impl/i0;->a(Ljava/util/concurrent/Executor;Landroid/os/Handler;)Landroidx/camera/core/impl/i0;

    move-result-object v1

    iget-object v2, p0, Lw/v;->c:Lw/w;

    invoke-virtual {v2, v0}, Lw/w;->W(Lw/p;)Lw/p;

    move-result-object v2

    iget-object v3, p0, Lw/v;->j:Landroid/content/Context;

    invoke-interface {p1, v3, v1, v2}, Landroidx/camera/core/impl/a0$a;->a(Landroid/content/Context;Landroidx/camera/core/impl/i0;Lw/p;)Landroidx/camera/core/impl/a0;

    move-result-object p1

    iput-object p1, p0, Lw/v;->g:Landroidx/camera/core/impl/a0;

    iget-object p1, p0, Lw/v;->c:Lw/w;

    invoke-virtual {p1, v0}, Lw/w;->Z(Landroidx/camera/core/impl/z$a;)Landroidx/camera/core/impl/z$a;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lw/v;->j:Landroid/content/Context;

    iget-object v3, p0, Lw/v;->g:Landroidx/camera/core/impl/a0;

    invoke-interface {v3}, Landroidx/camera/core/impl/a0;->c()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lw/v;->g:Landroidx/camera/core/impl/a0;

    invoke-interface {v4}, Landroidx/camera/core/impl/a0;->b()Ljava/util/Set;

    move-result-object v4

    invoke-interface {p1, v1, v3, v4}, Landroidx/camera/core/impl/z$a;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Landroidx/camera/core/impl/z;

    move-result-object p1

    iput-object p1, p0, Lw/v;->h:Landroidx/camera/core/impl/z;

    iget-object p1, p0, Lw/v;->c:Lw/w;

    invoke-virtual {p1, v0}, Lw/w;->b0(Landroidx/camera/core/impl/l2$c;)Landroidx/camera/core/impl/l2$c;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lw/v;->j:Landroid/content/Context;

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/l2$c;->a(Landroid/content/Context;)Landroidx/camera/core/impl/l2;

    move-result-object p1

    iput-object p1, p0, Lw/v;->i:Landroidx/camera/core/impl/l2;

    instance-of p1, p2, Lw/m;

    if-eqz p1, :cond_1

    move-object p1, p2

    check-cast p1, Lw/m;

    iget-object v1, p0, Lw/v;->g:Landroidx/camera/core/impl/a0;

    invoke-virtual {p1, v1}, Lw/m;->c(Landroidx/camera/core/impl/a0;)V

    :cond_1
    iget-object p1, p0, Lw/v;->a:Landroidx/camera/core/impl/e0;

    iget-object v1, p0, Lw/v;->g:Landroidx/camera/core/impl/a0;

    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/e0;->b(Landroidx/camera/core/impl/a0;)V

    iget-object p1, p0, Lw/v;->j:Landroid/content/Context;

    iget-object v1, p0, Lw/v;->a:Landroidx/camera/core/impl/e0;

    invoke-static {p1, v1, v2}, Landroidx/camera/core/impl/j0;->a(Landroid/content/Context;Landroidx/camera/core/impl/e0;Lw/p;)V

    invoke-direct {p0}, Lw/v;->p()V

    invoke-virtual {p3, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_2
    new-instance p1, Lw/n0;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing UseCaseConfigFactory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lw/n0;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    new-instance p1, Lw/n0;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lw/n0;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_4
    new-instance p1, Lw/n0;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing CameraFactory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lw/n0;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_0
    .catch Landroidx/camera/core/impl/j0$a; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lw/n0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long/2addr v1, p4

    const-wide/16 v3, 0x9c4

    cmp-long v1, v1, v3

    if-gez v1, :cond_5

    const-string v0, "CameraX"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retry init. Start time "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " current time "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lw/o0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lw/v;->e:Landroid/os/Handler;

    new-instance v6, Lw/u;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lw/u;-><init>(Lw/v;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    const-string p2, "retry_token"

    const-wide/16 p3, 0x1f4

    invoke-static {p1, v6, p2, p3, p4}, Landroidx/core/os/g;->b(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_1

    :cond_5
    iget-object p2, p0, Lw/v;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    sget-object p4, Lw/v$a;->INITIALIZING_ERROR:Lw/v$a;

    iput-object p4, p0, Lw/v;->l:Lw/v$a;

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    instance-of p2, p1, Landroidx/camera/core/impl/j0$a;

    if-eqz p2, :cond_6

    const-string p1, "CameraX"

    const-string p2, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."

    invoke-static {p1, p2}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    instance-of p2, p1, Lw/n0;

    if-eqz p2, :cond_7

    invoke-virtual {p3, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_1

    :cond_7
    new-instance p2, Lw/n0;

    invoke-direct {p2, p1}, Lw/n0;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p3, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private synthetic o(Landroid/content/Context;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 6

    iget-object v1, p0, Lw/v;->d:Ljava/util/concurrent/Executor;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lw/v;->k(Ljava/util/concurrent/Executor;JLandroid/content/Context;Landroidx/concurrent/futures/c$a;)V

    const-string p1, "CameraX initInternal"

    return-object p1
.end method

.method private p()V
    .locals 2

    iget-object v0, p0, Lw/v;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw/v$a;->INITIALIZED:Lw/v$a;

    iput-object v1, p0, Lw/v;->l:Lw/v$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static q()V
    .locals 3

    sget-object v0, Lw/v;->p:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lw/o0;->h()V

    return-void

    :cond_0
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    invoke-static {v1}, Lw/o0;->i(I)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public d()Landroidx/camera/core/impl/z;
    .locals 2

    iget-object v0, p0, Lw/v;->h:Landroidx/camera/core/impl/z;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Landroidx/camera/core/impl/a0;
    .locals 2

    iget-object v0, p0, Lw/v;->g:Landroidx/camera/core/impl/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()Landroidx/camera/core/impl/e0;
    .locals 1

    iget-object v0, p0, Lw/v;->a:Landroidx/camera/core/impl/e0;

    return-object v0
.end method

.method public h()Landroidx/camera/core/impl/l2;
    .locals 2

    iget-object v0, p0, Lw/v;->i:Landroidx/camera/core/impl/l2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/v;->k:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method
