.class public final Landroidx/camera/core/impl/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/h0$a;,
        Landroidx/camera/core/impl/h0$b;,
        Landroidx/camera/core/impl/h0$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/StringBuilder;

.field private final b:Ljava/lang/Object;

.field private c:I

.field private final d:Lx/a;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lw/i;",
            "Landroidx/camera/core/impl/h0$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:I


# direct methods
.method public constructor <init>(Lx/a;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    iput p2, p0, Landroidx/camera/core/impl/h0;->c:I

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/impl/h0;->d:Lx/a;

    iget p1, p0, Landroidx/camera/core/impl/h0;->c:I

    iput p1, p0, Landroidx/camera/core/impl/h0;->f:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private b(Ljava/lang/String;)Landroidx/camera/core/impl/h0$a;
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/i;

    invoke-interface {v1}, Lw/i;->b()Lw/o;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/b0;

    invoke-interface {v2}, Landroidx/camera/core/impl/b0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/h0$a;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private static d(Landroidx/camera/core/impl/c0$a;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/c0$a;->h()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private f()V
    .locals 14

    const-string v0, "CameraStateRegistry"

    invoke-static {v0}, Lw/o0;->f(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "-------------------------------------------------------------------\n"

    const-string v3, "%-45s%-22s\n"

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    const-string v7, "Recalculating open cameras:\n"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v8, v4, [Ljava/lang/Object;

    const-string v9, "Camera"

    aput-object v9, v8, v6

    const-string v9, "State"

    aput-object v9, v8, v5

    invoke-static {v7, v3, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v7, v6

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-static {v0}, Lw/o0;->f(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {v9}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {v9}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_2
    const-string v9, "UNKNOWN"

    :goto_1
    iget-object v10, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v12, v4, [Ljava/lang/Object;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lw/i;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v6

    aput-object v9, v12, v5

    invoke-static {v11, v3, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {v8}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object v8

    invoke-static {v8}, Landroidx/camera/core/impl/h0;->d(Landroidx/camera/core/impl/c0$a;)Z

    move-result v8

    if-eqz v8, :cond_1

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v0}, Lw/o0;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    iget v4, p0, Landroidx/camera/core/impl/h0;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    const-string v4, "Open count: %d (Max allowed: %d)"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget v0, p0, Landroidx/camera/core/impl/h0;->c:I

    sub-int/2addr v0, v7

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Landroidx/camera/core/impl/h0;->f:I

    return-void
.end method

.method private j(Lw/i;)Landroidx/camera/core/impl/c0$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/h0$a;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroidx/camera/core/impl/h0;->f()V

    invoke-virtual {p1}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private k(Lw/i;Landroidx/camera/core/impl/c0$a;)Landroidx/camera/core/impl/c0$a;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/h0$a;

    const-string v0, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()"

    invoke-static {p1, v0}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/h0$a;->d(Landroidx/camera/core/impl/c0$a;)Landroidx/camera/core/impl/c0$a;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/c0$a;->OPENING:Landroidx/camera/core/impl/c0$a;

    if-ne p2, v0, :cond_2

    invoke-static {p2}, Landroidx/camera/core/impl/h0;->d(Landroidx/camera/core/impl/c0$a;)Z

    move-result v1

    if-nez v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()"

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    :cond_2
    if-eq p1, p2, :cond_3

    invoke-direct {p0}, Landroidx/camera/core/impl/h0;->f()V

    :cond_3
    return-object p1
.end method


# virtual methods
.method public a(II)V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    :try_start_0
    iput v3, p0, Landroidx/camera/core/impl/h0;->c:I

    const/4 v3, 0x0

    if-eq p1, v2, :cond_1

    if-ne p2, v2, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    if-ne p1, v2, :cond_2

    if-eq p2, v2, :cond_2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    if-nez v4, :cond_3

    if-eqz v1, :cond_4

    :cond_3
    invoke-direct {p0}, Landroidx/camera/core/impl/h0;->f()V

    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()Z
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object v2

    sget-object v3, Landroidx/camera/core/impl/c0$a;->CLOSING:Landroidx/camera/core/impl/c0$a;

    if-ne v2, v3, :cond_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :cond_1
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e(Lw/i;Landroidx/camera/core/impl/c0$a;Z)V
    .locals 6

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/core/impl/h0;->f:I

    sget-object v2, Landroidx/camera/core/impl/c0$a;->RELEASED:Landroidx/camera/core/impl/c0$a;

    if-ne p2, v2, :cond_0

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/h0;->j(Lw/i;)Landroidx/camera/core/impl/c0$a;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/camera/core/impl/h0;->k(Lw/i;Landroidx/camera/core/impl/c0$a;)Landroidx/camera/core/impl/c0$a;

    move-result-object v2

    :goto_0
    if-ne v2, p2, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    iget-object v2, p0, Landroidx/camera/core/impl/h0;->d:Lx/a;

    invoke-interface {v2}, Lx/a;->b()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    sget-object v2, Landroidx/camera/core/impl/c0$a;->CONFIGURED:Landroidx/camera/core/impl/c0$a;

    if-ne p2, v2, :cond_2

    invoke-interface {p1}, Lw/i;->b()Lw/o;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/b0;

    invoke-interface {v2}, Landroidx/camera/core/impl/b0;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/core/impl/h0;->d:Lx/a;

    invoke-interface {v3, v2}, Lx/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-direct {p0, v2}, Landroidx/camera/core/impl/h0;->b(Ljava/lang/String;)Landroidx/camera/core/impl/h0$a;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v4

    :goto_1
    const/4 v3, 0x1

    if-ge v1, v3, :cond_4

    iget v1, p0, Landroidx/camera/core/impl/h0;->f:I

    if-lez v1, :cond_4

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget-object p2, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {v3}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object v3

    sget-object v5, Landroidx/camera/core/impl/c0$a;->PENDING_OPEN:Landroidx/camera/core/impl/c0$a;

    if-ne v3, v5, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/i;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/h0$a;

    invoke-interface {v4, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    sget-object v1, Landroidx/camera/core/impl/c0$a;->PENDING_OPEN:Landroidx/camera/core/impl/c0$a;

    if-ne p2, v1, :cond_5

    iget p2, p0, Landroidx/camera/core/impl/h0;->f:I

    if-lez p2, :cond_5

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget-object p2, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/h0$a;

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eqz v4, :cond_6

    if-nez p3, :cond_6

    invoke-interface {v4, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_7

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/h0$a;

    invoke-virtual {p2}, Landroidx/camera/core/impl/h0$a;->c()V

    goto :goto_3

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroidx/camera/core/impl/h0$a;->b()V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public g(Lw/i;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/h0$b;Landroidx/camera/core/impl/h0$c;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Camera is already registered: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    new-instance v2, Landroidx/camera/core/impl/h0$a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p2, p3, p4}, Landroidx/camera/core/impl/h0$a;-><init>(Landroidx/camera/core/impl/c0$a;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/h0$b;Landroidx/camera/core/impl/h0$c;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Lw/i;)Z
    .locals 9

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/impl/h0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/h0$a;

    const-string v2, "Camera must first be registered with registerCamera()"

    invoke-static {v1, v2}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/h0$a;

    const-string v2, "CameraStateRegistry"

    invoke-static {v2}, Lw/o0;->f(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    iget-object v2, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    aput-object p1, v7, v4

    iget p1, p0, Landroidx/camera/core/impl/h0;->f:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v3

    invoke-virtual {v1}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object p1

    invoke-static {p1}, Landroidx/camera/core/impl/h0;->d(Landroidx/camera/core/impl/c0$a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v8, 0x2

    aput-object p1, v7, v8

    invoke-virtual {v1}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object p1

    const/4 v8, 0x3

    aput-object p1, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget p1, p0, Landroidx/camera/core/impl/h0;->f:I

    if-gtz p1, :cond_2

    invoke-virtual {v1}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object p1

    invoke-static {p1}, Landroidx/camera/core/impl/h0;->d(Landroidx/camera/core/impl/c0$a;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v4

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Landroidx/camera/core/impl/c0$a;->OPENING:Landroidx/camera/core/impl/c0$a;

    invoke-virtual {v1, p1}, Landroidx/camera/core/impl/h0$a;->d(Landroidx/camera/core/impl/c0$a;)Landroidx/camera/core/impl/c0$a;

    move p1, v3

    :goto_1
    const-string v1, "CameraStateRegistry"

    invoke-static {v1}, Lw/o0;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, " --> %s"

    new-array v3, v3, [Ljava/lang/Object;

    if-eqz p1, :cond_3

    const-string v6, "SUCCESS"

    goto :goto_2

    :cond_3
    const-string v6, "FAIL"

    :goto_2
    aput-object v6, v3, v4

    invoke-static {v2, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "CameraStateRegistry"

    iget-object v2, p0, Landroidx/camera/core/impl/h0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-direct {p0}, Landroidx/camera/core/impl/h0;->f()V

    :cond_5
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/impl/h0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/impl/h0;->d:Lx/a;

    invoke-interface {v1}, Lx/a;->b()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    monitor-exit v0

    return v3

    :cond_0
    invoke-direct {p0, p1}, Landroidx/camera/core/impl/h0;->b(Ljava/lang/String;)Landroidx/camera/core/impl/h0$a;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/h0;->b(Ljava/lang/String;)Landroidx/camera/core/impl/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    if-eqz p2, :cond_2

    invoke-direct {p0, p2}, Landroidx/camera/core/impl/h0;->b(Ljava/lang/String;)Landroidx/camera/core/impl/h0$a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p2}, Landroidx/camera/core/impl/h0;->b(Ljava/lang/String;)Landroidx/camera/core/impl/h0$a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/camera/core/impl/h0$a;->a()Landroidx/camera/core/impl/c0$a;

    move-result-object v2

    :cond_2
    sget-object p2, Landroidx/camera/core/impl/c0$a;->OPEN:Landroidx/camera/core/impl/c0$a;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-nez v1, :cond_4

    sget-object v1, Landroidx/camera/core/impl/c0$a;->CONFIGURED:Landroidx/camera/core/impl/c0$a;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move p1, v4

    goto :goto_2

    :cond_4
    :goto_1
    move p1, v3

    :goto_2
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    sget-object p2, Landroidx/camera/core/impl/c0$a;->CONFIGURED:Landroidx/camera/core/impl/c0$a;

    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    move p2, v4

    goto :goto_4

    :cond_6
    :goto_3
    move p2, v3

    :goto_4
    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    goto :goto_5

    :cond_7
    move v3, v4

    :goto_5
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
