.class public final Landroidx/camera/camera2/internal/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/n0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroidx/camera/camera2/internal/compat/d0;

.field private final c:Lv/h;

.field private final d:Ljava/lang/Object;

.field private e:Landroidx/camera/camera2/internal/u;

.field private f:Landroidx/camera/camera2/internal/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/camera2/internal/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroidx/camera/camera2/internal/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/camera2/internal/n0$a<",
            "Lw/k1;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroidx/camera/camera2/internal/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/camera2/internal/n0$a<",
            "Lw/q;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Landroidx/camera/core/impl/k;",
            "Ljava/util/concurrent/Executor;",
            ">;>;"
        }
    .end annotation
.end field

.field private final j:Landroidx/camera/core/impl/t1;

.field private final k:Landroidx/camera/core/impl/x0;

.field private final l:Landroidx/camera/camera2/internal/compat/r0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/camera/camera2/internal/compat/r0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/n0;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/n0;->f:Landroidx/camera/camera2/internal/n0$a;

    iput-object v0, p0, Landroidx/camera/camera2/internal/n0;->g:Landroidx/camera/camera2/internal/n0$a;

    iput-object v0, p0, Landroidx/camera/camera2/internal/n0;->i:Ljava/util/List;

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/camera/camera2/internal/n0;->a:Ljava/lang/String;

    iput-object p2, p0, Landroidx/camera/camera2/internal/n0;->l:Landroidx/camera/camera2/internal/compat/r0;

    invoke-virtual {p2, v0}, Landroidx/camera/camera2/internal/compat/r0;->c(Ljava/lang/String;)Landroidx/camera/camera2/internal/compat/d0;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    new-instance v0, Lv/h;

    invoke-direct {v0, p0}, Lv/h;-><init>(Landroidx/camera/camera2/internal/n0;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/n0;->c:Lv/h;

    invoke-static {p1, p2}, Ls/g;->a(Ljava/lang/String;Landroidx/camera/camera2/internal/compat/d0;)Landroidx/camera/core/impl/t1;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/camera2/internal/n0;->j:Landroidx/camera/core/impl/t1;

    new-instance p2, Landroidx/camera/camera2/internal/h1;

    invoke-direct {p2, p1}, Landroidx/camera/camera2/internal/h1;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/n0;->k:Landroidx/camera/core/impl/x0;

    new-instance p1, Landroidx/camera/camera2/internal/n0$a;

    sget-object p2, Lw/q$b;->CLOSED:Lw/q$b;

    invoke-static {p2}, Lw/q;->a(Lw/q$b;)Lw/q;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/camera/camera2/internal/n0$a;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/n0;->h:Landroidx/camera/camera2/internal/n0$a;

    return-void
.end method

.method private p()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/n0;->q()V

    return-void
.end method

.method private q()V
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n0;->n()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL"

    goto :goto_0

    :cond_1
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_3"

    goto :goto_0

    :cond_2
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY"

    goto :goto_0

    :cond_3
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_FULL"

    goto :goto_0

    :cond_4
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device Level: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraInfo"

    invoke-static {v1, v0}, Lw/o0;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/n0;->i(I)I

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/d0;->b()Landroidx/camera/camera2/internal/compat/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/compat/z0;->a(I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/camera/camera2/internal/l0;

    invoke-direct {v1, v0}, Landroidx/camera/camera2/internal/l0;-><init>(Landroidx/camera/camera2/internal/compat/d0;)V

    invoke-static {v1}, Lt/g;->a(Lt/c;)Z

    move-result v0

    return v0
.end method

.method public e()Landroidx/camera/core/impl/t1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->j:Landroidx/camera/core/impl/t1;

    return-object v0
.end method

.method public f(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/d0;->b()Landroidx/camera/camera2/internal/compat/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/compat/z0;->b(I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g()Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->e:Landroidx/camera/camera2/internal/u;

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->f:Landroidx/camera/camera2/internal/n0$a;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/camera/camera2/internal/n0$a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/camera/camera2/internal/n0$a;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Landroidx/camera/camera2/internal/n0;->f:Landroidx/camera/camera2/internal/n0$a;

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->f:Landroidx/camera/camera2/internal/n0$a;

    monitor-exit v0

    return-object v1

    :cond_1
    iget-object v2, p0, Landroidx/camera/camera2/internal/n0;->f:Landroidx/camera/camera2/internal/n0$a;

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/u;->E()Landroidx/camera/camera2/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/p3;->f()Landroidx/lifecycle/LiveData;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getLensFacing()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Unable to get the lens facing of the camera."

    invoke-static {v1, v2}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Landroidx/camera/camera2/internal/k2;->a(I)I

    move-result v0

    return v0
.end method

.method public i(I)I
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n0;->m()I

    move-result v0

    invoke-static {p1}, Landroidx/camera/core/impl/utils/c;->b(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n0;->getLensFacing()I

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v0, v2}, Landroidx/camera/core/impl/utils/c;->a(IIZ)I

    move-result p1

    return p1
.end method

.method public j()Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lw/k1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->e:Landroidx/camera/camera2/internal/u;

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->g:Landroidx/camera/camera2/internal/n0$a;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/camera/camera2/internal/n0$a;

    iget-object v2, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {v2}, Landroidx/camera/camera2/internal/u3;->g(Landroidx/camera/camera2/internal/compat/d0;)Lw/k1;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/camera/camera2/internal/n0$a;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Landroidx/camera/camera2/internal/n0;->g:Landroidx/camera/camera2/internal/n0$a;

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->g:Landroidx/camera/camera2/internal/n0$a;

    monitor-exit v0

    return-object v1

    :cond_1
    iget-object v2, p0, Landroidx/camera/camera2/internal/n0;->g:Landroidx/camera/camera2/internal/n0$a;

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/u;->G()Landroidx/camera/camera2/internal/u3;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/u3;->i()Landroidx/lifecycle/LiveData;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public k()Lv/h;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->c:Lv/h;

    return-object v0
.end method

.method public l()Landroidx/camera/camera2/internal/compat/d0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    return-object v0
.end method

.method m()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method n()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->b:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method o(Landroidx/camera/camera2/internal/u;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/camera2/internal/n0;->e:Landroidx/camera/camera2/internal/u;

    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->g:Landroidx/camera/camera2/internal/n0$a;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->G()Landroidx/camera/camera2/internal/u3;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u3;->i()Landroidx/lifecycle/LiveData;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/n0$a;->d(Landroidx/lifecycle/LiveData;)V

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/n0;->f:Landroidx/camera/camera2/internal/n0$a;

    if-eqz p1, :cond_1

    iget-object v1, p0, Landroidx/camera/camera2/internal/n0;->e:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/u;->E()Landroidx/camera/camera2/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/p3;->f()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/n0$a;->d(Landroidx/lifecycle/LiveData;)V

    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/n0;->i:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v2, p0, Landroidx/camera/camera2/internal/n0;->e:Landroidx/camera/camera2/internal/u;

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/k;

    invoke-virtual {v2, v3, v1}, Landroidx/camera/camera2/internal/u;->u(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/camera2/internal/n0;->i:Ljava/util/List;

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/n0;->p()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method r(Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lw/q;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/n0;->h:Landroidx/camera/camera2/internal/n0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/n0$a;->d(Landroidx/lifecycle/LiveData;)V

    return-void
.end method
