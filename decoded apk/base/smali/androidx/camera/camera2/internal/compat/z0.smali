.class public Landroidx/camera/camera2/internal/compat/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/compat/z0$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/compat/z0$a;

.field private final b:Lt/n;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;[",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lt/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->e:Ljava/util/Map;

    new-instance v0, Landroidx/camera/camera2/internal/compat/a1;

    invoke-direct {v0, p1}, Landroidx/camera/camera2/internal/compat/a1;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->a:Landroidx/camera/camera2/internal/compat/z0$a;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/z0;->b:Lt/n;

    return-void
.end method

.method static d(Landroid/hardware/camera2/params/StreamConfigurationMap;Lt/n;)Landroidx/camera/camera2/internal/compat/z0;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/compat/z0;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/compat/z0;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lt/n;)V

    return-object v0
.end method


# virtual methods
.method public a(I)[Landroid/util/Size;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/util/Size;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    invoke-virtual {p1}, [Landroid/util/Size;->clone()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, [Landroid/util/Size;

    :goto_0
    return-object v1

    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->a:Landroidx/camera/camera2/internal/compat/z0$a;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/compat/z0$a;->c(I)[Landroid/util/Size;

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v2, v0

    if-lez v2, :cond_2

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/z0;->b:Lt/n;

    invoke-virtual {v2, v0, p1}, Lt/n;->b([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object v0

    :cond_2
    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/z0;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, [Landroid/util/Size;->clone()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, [Landroid/util/Size;

    :cond_3
    return-object v1
.end method

.method public b(I)[Landroid/util/Size;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/util/Size;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    invoke-virtual {p1}, [Landroid/util/Size;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    :goto_0
    return-object p1

    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->a:Landroidx/camera/camera2/internal/compat/z0$a;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/compat/z0$a;->b(I)[Landroid/util/Size;

    move-result-object v0

    if-eqz v0, :cond_3

    array-length v1, v0

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/z0;->b:Lt/n;

    invoke-virtual {v1, v0, p1}, Lt/n;->b([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/z0;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, [Landroid/util/Size;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    return-object p1

    :cond_3
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retrieved output sizes array is null or empty for format "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "StreamConfigurationMapCompat"

    invoke-static {v1, p1}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Landroid/hardware/camera2/params/StreamConfigurationMap;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/z0;->a:Landroidx/camera/camera2/internal/compat/z0$a;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/compat/z0$a;->a()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    return-object v0
.end method
