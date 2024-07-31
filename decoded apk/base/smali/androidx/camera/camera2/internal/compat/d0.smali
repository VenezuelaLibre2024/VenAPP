.class public Landroidx/camera/camera2/internal/compat/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/compat/d0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroidx/camera/camera2/internal/compat/d0$a;

.field private final c:Ljava/lang/String;

.field private d:Landroidx/camera/camera2/internal/compat/z0;


# direct methods
.method private constructor <init>(Landroid/hardware/camera2/CameraCharacteristics;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->a:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->d:Landroidx/camera/camera2/internal/compat/z0;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/camera/camera2/internal/compat/b0;

    invoke-direct {v0, p1}, Landroidx/camera/camera2/internal/compat/b0;-><init>(Landroid/hardware/camera2/CameraCharacteristics;)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/camera/camera2/internal/compat/c0;

    invoke-direct {v0, p1}, Landroidx/camera/camera2/internal/compat/c0;-><init>(Landroid/hardware/camera2/CameraCharacteristics;)V

    :goto_0
    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->b:Landroidx/camera/camera2/internal/compat/d0$a;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/d0;->c:Ljava/lang/String;

    return-void
.end method

.method private c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "*>;)Z"
        }
    .end annotation

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraCharacteristics$Key;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static d(Landroid/hardware/camera2/CameraCharacteristics;Ljava/lang/String;)Landroidx/camera/camera2/internal/compat/d0;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/compat/d0;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/compat/d0;-><init>(Landroid/hardware/camera2/CameraCharacteristics;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/compat/d0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->b:Landroidx/camera/camera2/internal/compat/d0$a;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/compat/d0$a;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->b:Landroidx/camera/camera2/internal/compat/d0$a;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/compat/d0$a;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/d0;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Landroidx/camera/camera2/internal/compat/z0;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->d:Landroidx/camera/camera2/internal/compat/z0;

    if-nez v0, :cond_1

    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    new-instance v1, Lt/n;

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/d0;->c:Ljava/lang/String;

    invoke-direct {v1, v2}, Lt/n;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/compat/z0;->d(Landroid/hardware/camera2/params/StreamConfigurationMap;Lt/n;)Landroidx/camera/camera2/internal/compat/z0;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->d:Landroidx/camera/camera2/internal/compat/z0;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "StreamConfigurationMap is null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/d0;->d:Landroidx/camera/camera2/internal/compat/z0;

    return-object v0
.end method
