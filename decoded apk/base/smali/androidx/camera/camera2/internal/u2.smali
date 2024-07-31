.class public final Landroidx/camera/camera2/internal/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-string v0, "camera2.streamSpec.streamUseCase"

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/camera2/internal/u2;->a:Landroidx/camera/core/impl/n0$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/u2;->b:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Landroidx/camera/camera2/internal/u2;->c:Ljava/util/Map;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    sget-object v3, Landroidx/camera/core/impl/l2$b;->PREVIEW:Landroidx/camera/core/impl/l2$b;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v4, 0x4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v0, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v6, Landroidx/camera/core/impl/l2$b;->IMAGE_ANALYSIS:Landroidx/camera/core/impl/l2$b;

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v0, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    sget-object v6, Landroidx/camera/core/impl/l2$b;->IMAGE_CAPTURE:Landroidx/camera/core/impl/l2$b;

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v7, 0x2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    sget-object v7, Landroidx/camera/core/impl/l2$b;->VIDEO_CAPTURE:Landroidx/camera/core/impl/l2$b;

    invoke-interface {v2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v8, 0x3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {v0, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_5

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/d2;

    invoke-virtual {v2}, Landroidx/camera/core/impl/d2;->f()J

    move-result-wide v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/a;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v3, :cond_0

    invoke-virtual {v2}, Landroidx/camera/core/impl/a;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/l2$b;

    goto :goto_1

    :cond_0
    sget-object v3, Landroidx/camera/core/impl/l2$b;->STREAM_SHARING:Landroidx/camera/core/impl/l2$b;

    :goto_1
    invoke-virtual {v2}, Landroidx/camera/core/impl/a;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v3, v4, v5, v2}, Landroidx/camera/camera2/internal/u2;->g(Landroidx/camera/core/impl/l2$b;JLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_3

    return v0

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/k2;

    invoke-interface {v2}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v3

    invoke-interface {v2}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v6

    sget-object v7, Landroidx/camera/core/impl/l2$b;->STREAM_SHARING:Landroidx/camera/core/impl/l2$b;

    if-ne v6, v7, :cond_2

    check-cast v2, Li0/f;

    invoke-virtual {v2}, Li0/f;->W()Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_2
    invoke-static {v3, v4, v5, v2}, Landroidx/camera/camera2/internal/u2;->g(Landroidx/camera/core/impl/l2$b;JLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_3

    return v0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "SurfaceConfig does not map to any use case"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_5
    return v3
.end method

.method private static b(Ljava/util/Set;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static c(Landroidx/camera/camera2/internal/compat/d0;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/compat/d0;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;)Z"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_STREAM_USE_CASES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    if-eqz p0, :cond_5

    array-length v0, p0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    array-length v1, p0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-wide v4, p0, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/d2;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d2;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_1
    return v2
.end method

.method public static d(Ljava/util/List;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/a;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/l2$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/a;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/camera/camera2/internal/u2;->j(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/l2$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/k2;

    invoke-interface {p1}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/camera/camera2/internal/u2;->j(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/l2$b;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_3
    return v2
.end method

.method public static e(Landroidx/camera/core/impl/k2;)Lq/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;)",
            "Lq/a;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    sget-object v1, Lq/a;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_0
    sget-object v1, Landroidx/camera/core/impl/k2;->y:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Landroidx/camera/core/impl/d1;->H:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_2
    sget-object v1, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {v0, v1, p0}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_3
    new-instance p0, Lq/a;

    invoke-direct {p0, v0}, Lq/a;-><init>(Landroidx/camera/core/impl/n0;)V

    return-object p0
.end method

.method private static f(Landroidx/camera/core/impl/n0;J)Landroidx/camera/core/impl/n0;
    .locals 3

    sget-object v0, Landroidx/camera/camera2/internal/u2;->a:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object p0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    new-instance p1, Lq/a;

    invoke-direct {p1, p0}, Lq/a;-><init>(Landroidx/camera/core/impl/n0;)V

    return-object p1
.end method

.method private static g(Landroidx/camera/core/impl/l2$b;JLjava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/l2$b;",
            "J",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;)Z"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/l2$b;->STREAM_SHARING:Landroidx/camera/core/impl/l2$b;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_5

    sget-object p0, Landroidx/camera/camera2/internal/u2;->c:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p2

    if-eq p1, p2, :cond_2

    return v2

    :cond_2
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/l2$b;

    invoke-interface {p0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    return v2

    :cond_4
    return v1

    :cond_5
    sget-object p3, Landroidx/camera/camera2/internal/u2;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    move v2, v1

    :cond_6
    return v2
.end method

.method public static h(Landroidx/camera/camera2/internal/compat/d0;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_STREAM_USE_CASES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    if-eqz p0, :cond_2

    array-length p0, p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v2
.end method

.method private static i(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)Z"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/a;

    invoke-virtual {p0}, Landroidx/camera/core/impl/a;->e()Landroidx/camera/core/impl/n0;

    move-result-object v1

    sget-object v6, Lq/a;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v1, v6}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    move v1, v4

    move p0, v5

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/impl/a;->e()Landroidx/camera/core/impl/n0;

    move-result-object p0

    invoke-interface {p0, v6}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long p0, v6, v2

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    move p0, v4

    move v1, v5

    goto :goto_1

    :cond_2
    move p0, v5

    move v1, p0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/k2;

    sget-object v7, Lq/a;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v6, v7}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v8

    if-nez v8, :cond_4

    if-eqz p0, :cond_3

    :goto_3
    invoke-static {}, Landroidx/camera/camera2/internal/u2;->o()V

    :cond_3
    move v1, v4

    goto :goto_2

    :cond_4
    invoke-interface {v6, v7}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-nez v8, :cond_5

    if-eqz p0, :cond_3

    goto :goto_3

    :cond_5
    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/camera/camera2/internal/u2;->o()V

    :cond_6
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move p0, v4

    goto :goto_2

    :cond_7
    if-nez v1, :cond_8

    invoke-static {p2, v0}, Landroidx/camera/camera2/internal/u2;->b(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_4

    :cond_8
    move v4, v5

    :goto_4
    return v4
.end method

.method private static j(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/l2$b;)Z
    .locals 3

    sget-object v0, Landroidx/camera/core/impl/k2;->y:Landroidx/camera/core/impl/n0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/d1;->H:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-interface {p0, v0}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p1, p0}, Landroidx/camera/camera2/internal/l3;->b(Landroidx/camera/core/impl/l2$b;I)I

    move-result p0

    const/4 p1, 0x5

    if-ne p0, p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static k(Landroidx/camera/camera2/internal/compat/d0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/compat/d0;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/b2;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/a;",
            "Landroidx/camera/core/impl/b2;",
            ">;)Z"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/a;

    invoke-virtual {v3}, Landroidx/camera/core/impl/a;->e()Landroidx/camera/core/impl/n0;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/b2;

    invoke-static {v3}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/b2;

    invoke-virtual {v3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_STREAM_USE_CASES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    if-eqz p0, :cond_9

    array-length v1, p0

    if-nez v1, :cond_3

    goto/16 :goto_5

    :cond_3
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    array-length v3, p0

    move v4, v2

    :goto_2
    if-ge v4, v3, :cond_4

    aget-wide v5, p0, v4

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v1}, Landroidx/camera/camera2/internal/u2;->i(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/a;

    invoke-virtual {p1}, Landroidx/camera/core/impl/a;->e()Landroidx/camera/core/impl/n0;

    move-result-object v1

    sget-object v2, Lq/a;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Landroidx/camera/camera2/internal/u2;->f(Landroidx/camera/core/impl/n0;J)Landroidx/camera/core/impl/n0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/a;->i(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;

    move-result-object v1

    invoke-interface {p3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/k2;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/camera/core/impl/b2;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v0

    sget-object v1, Lq/a;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroidx/camera/camera2/internal/u2;->f(Landroidx/camera/core/impl/n0;J)Landroidx/camera/core/impl/n0;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->f()Landroidx/camera/core/impl/b2$a;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    const/4 p0, 0x1

    return p0

    :cond_9
    :goto_5
    return v2
.end method

.method public static l(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/b2;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/a;",
            "Landroidx/camera/core/impl/b2;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/d2;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d2;->f()J

    move-result-wide v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/a;

    invoke-virtual {v3}, Landroidx/camera/core/impl/a;->e()Landroidx/camera/core/impl/n0;

    move-result-object v4

    invoke-static {v4, v1, v2}, Landroidx/camera/camera2/internal/u2;->f(Landroidx/camera/core/impl/n0;J)Landroidx/camera/core/impl/n0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v3, v1}, Landroidx/camera/core/impl/a;->i(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;

    move-result-object v1

    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/b2;

    invoke-virtual {v4}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v5

    invoke-static {v5, v1, v2}, Landroidx/camera/camera2/internal/u2;->f(Landroidx/camera/core/impl/n0;J)Landroidx/camera/core/impl/n0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Landroidx/camera/core/impl/b2;->f()Landroidx/camera/core/impl/b2$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object v1

    invoke-interface {p0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "SurfaceConfig does not map to any use case"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_3
    return-void
.end method

.method public static m(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/y1;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/y1;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v3

    sget-object v4, Landroidx/camera/camera2/internal/u2;->a:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v3, v4}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v5, :cond_1

    new-array p0, v5, [Ljava/lang/Object;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p0, v2

    const-string p1, "SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping()."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Camera2CameraImpl"

    invoke-static {p1, p0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v1

    invoke-interface {v1, v4}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_2
    move v5, v2

    :goto_0
    if-eqz v5, :cond_5

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move p1, v2

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/y1;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {v3}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v3

    sget-object v4, Landroidx/camera/core/impl/l2$b;->METERING_REPEATING:Landroidx/camera/core/impl/l2$b;

    if-ne v3, v4, :cond_3

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/r0;

    const-wide/16 v3, 0x1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {p2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v3

    sget-object v4, Landroidx/camera/camera2/internal/u2;->a:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v3, v4}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/r0;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v1

    invoke-interface {v1, v4}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public static n(Landroidx/camera/camera2/internal/w2$b;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/w2$b;->a()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/w2$b;->b()I

    move-result p0

    const/16 v0, 0x8

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static o()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Either all use cases must have non-default stream use case assigned or none should have it"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
