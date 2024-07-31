.class final Landroidx/camera/camera2/internal/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/d2$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/compat/d0;

.field private final b:Lr/b;

.field private final c:Z


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/compat/d0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/d2;->a:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {p1}, Lr/b;->a(Landroidx/camera/camera2/internal/compat/d0;)Lr/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/d2;->b:Lr/b;

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, p1, v2

    const/16 v4, 0x12

    if-ne v3, v4, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/d2;->c:Z

    return-void
.end method

.method private static a(Lw/y;Lw/y;)Z
    .locals 4

    invoke-virtual {p1}, Lw/y;->e()Z

    move-result v0

    const-string v1, "Fully specified range is not actually fully specified."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    invoke-virtual {p1}, Lw/y;->b()I

    move-result v0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    if-eq v0, v3, :cond_1

    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    invoke-virtual {p1}, Lw/y;->b()I

    move-result v3

    if-eq v0, v3, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lw/y;->a()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lw/y;->a()I

    move-result p0

    invoke-virtual {p1}, Lw/y;->a()I

    move-result p1

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :cond_3
    :goto_0
    return v1
.end method

.method private static b(Lw/y;Lw/y;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/y;",
            "Lw/y;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p0, p2, v0

    const/4 p0, 0x1

    aput-object p1, p2, p0

    const-string p0, "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s"

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "DynamicRangeResolver"

    invoke-static {p1, p0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/d2;->a(Lw/y;Lw/y;)Z

    move-result p0

    return p0
.end method

.method private static c(Lw/y;Ljava/util/Collection;Ljava/util/Set;)Lw/y;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/y;",
            "Ljava/util/Collection<",
            "Lw/y;",
            ">;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;)",
            "Lw/y;"
        }
    .end annotation

    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/y;

    const-string v3, "Fully specified DynamicRange cannot be null."

    invoke-static {v0, v3}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lw/y;->b()I

    move-result v3

    invoke-virtual {v0}, Lw/y;->e()Z

    move-result v4

    const-string v5, "Fully specified DynamicRange must have fully defined encoding."

    invoke-static {v4, v5}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    if-ne v3, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0, v0, p2}, Landroidx/camera/camera2/internal/d2;->b(Lw/y;Lw/y;Ljava/util/Set;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v0

    :cond_3
    return-object v1
.end method

.method private static e(Lw/y;)Z
    .locals 1

    sget-object v0, Lw/y;->c:Lw/y;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static f(Lw/y;)Z
    .locals 2

    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lw/y;->a()I

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Lw/y;->b()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lw/y;->a()I

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private h(Lw/y;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;)Lw/y;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/y;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lw/y;"
        }
    .end annotation

    invoke-virtual {p1}, Lw/y;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-virtual {p1}, Lw/y;->b()I

    move-result v0

    invoke-virtual {p1}, Lw/y;->a()I

    move-result v2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    if-nez v2, :cond_3

    sget-object p1, Lw/y;->d:Lw/y;

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    invoke-static {p1, p3, p2}, Landroidx/camera/camera2/internal/d2;->c(Lw/y;Ljava/util/Collection;Ljava/util/Set;)Lw/y;

    move-result-object p3

    const/4 v4, 0x0

    const/4 v5, 0x3

    const-string v6, "DynamicRangeResolver"

    const/4 v7, 0x2

    if-eqz p3, :cond_4

    new-array p2, v5, [Ljava/lang/Object;

    aput-object p5, p2, v4

    aput-object p1, p2, v3

    aput-object p3, p2, v7

    const-string p1, "Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {v6, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p3

    :cond_4
    invoke-static {p1, p4, p2}, Landroidx/camera/camera2/internal/d2;->c(Lw/y;Ljava/util/Collection;Ljava/util/Set;)Lw/y;

    move-result-object p3

    if-eqz p3, :cond_5

    new-array p2, v5, [Ljava/lang/Object;

    aput-object p5, p2, v4

    aput-object p1, p2, v3

    aput-object p3, p2, v7

    const-string p1, "Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    sget-object p3, Lw/y;->d:Lw/y;

    invoke-static {p1, p3, p2}, Landroidx/camera/camera2/internal/d2;->b(Lw/y;Lw/y;Ljava/util/Set;)Z

    move-result p4

    if-eqz p4, :cond_6

    new-array p2, v5, [Ljava/lang/Object;

    aput-object p5, p2, v4

    aput-object p1, p2, v3

    aput-object p3, p2, v7

    const-string p1, "Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    if-ne v0, v7, :cond_b

    const/16 p3, 0xa

    if-eq v2, p3, :cond_7

    if-nez v2, :cond_b

    :cond_7
    new-instance p3, Ljava/util/LinkedHashSet;

    invoke-direct {p3}, Ljava/util/LinkedHashSet;-><init>()V

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p4, v0, :cond_8

    iget-object p4, p0, Landroidx/camera/camera2/internal/d2;->a:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {p4}, Landroidx/camera/camera2/internal/d2$a;->a(Landroidx/camera/camera2/internal/compat/d0;)Lw/y;

    move-result-object p4

    if-eqz p4, :cond_9

    invoke-interface {p3, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    move-object p4, v1

    :cond_9
    :goto_1
    sget-object v0, Lw/y;->f:Lw/y;

    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {p1, p3, p2}, Landroidx/camera/camera2/internal/d2;->c(Lw/y;Ljava/util/Collection;Ljava/util/Set;)Lw/y;

    move-result-object p3

    if-eqz p3, :cond_b

    const/4 p2, 0x4

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p5, p2, v4

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    const-string p4, "recommended"

    goto :goto_2

    :cond_a
    const-string p4, "required"

    :goto_2
    aput-object p4, p2, v3

    aput-object p1, p2, v7

    aput-object p3, p2, v5

    const-string p1, "Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_b
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_c
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lw/y;

    invoke-virtual {p3}, Lw/y;->e()Z

    move-result p4

    const-string v0, "Candidate dynamic range must be fully specified."

    invoke-static {p4, v0}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    sget-object p4, Lw/y;->d:Lw/y;

    invoke-virtual {p3, p4}, Lw/y;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_d

    goto :goto_3

    :cond_d
    invoke-static {p1, p3}, Landroidx/camera/camera2/internal/d2;->a(Lw/y;Lw/y;)Z

    move-result p4

    if-eqz p4, :cond_c

    new-array p2, v5, [Ljava/lang/Object;

    aput-object p5, p2, v4

    aput-object p1, p2, v3

    aput-object p3, p2, v7

    const-string p1, "Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_e
    return-object v1
.end method

.method private i(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Landroidx/camera/core/impl/k2;Ljava/util/Set;)Lw/y;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;)",
            "Lw/y;"
        }
    .end annotation

    invoke-interface {p4}, Landroidx/camera/core/impl/e1;->G()Lw/y;

    move-result-object v6

    invoke-interface {p4}, Lb0/j;->P()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move-object v1, v6

    move-object v2, p5

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Landroidx/camera/camera2/internal/d2;->h(Lw/y;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;)Lw/y;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/camera/camera2/internal/d2;->b:Lr/b;

    invoke-static {p5, p2, p1}, Landroidx/camera/camera2/internal/d2;->j(Ljava/util/Set;Lw/y;Lr/b;)V

    return-object p2

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/4 p3, 0x4

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-interface {p4}, Lb0/j;->P()Ljava/lang/String;

    move-result-object p4

    aput-object p4, p3, v0

    const/4 p4, 0x1

    aput-object v6, p3, p4

    const/4 p4, 0x2

    const-string v0, "\n  "

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, p4

    const/4 p1, 0x3

    invoke-static {v0, p5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p4

    aput-object p4, p3, p1

    const-string p1, "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s"

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private static j(Ljava/util/Set;Lw/y;Lr/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;",
            "Lw/y;",
            "Lr/b;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Cannot update already-empty constraints."

    invoke-static {v0, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    invoke-virtual {p2, p1}, Lr/b;->b(Lw/y;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {p0, p2}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "\n  "

    invoke-static {p1, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v2, v1

    const/4 p2, 0x2

    invoke-static {p1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, p2

    const-string p1, "Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method d()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/d2;->c:Z

    return v0
.end method

.method g(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Lw/y;",
            ">;"
        }
    .end annotation

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/a;->c()Lw/y;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/d2;->b:Lr/b;

    invoke-virtual {p1}, Lr/b;->c()Ljava/util/Set;

    move-result-object p1

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/y;

    iget-object v2, p0, Landroidx/camera/camera2/internal/d2;->b:Lr/b;

    invoke-static {v7, v1, v2}, Landroidx/camera/camera2/internal/d2;->j(Ljava/util/Set;Lw/y;Lr/b;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {v3}, Landroidx/camera/core/impl/e1;->G()Lw/y;

    move-result-object v4

    invoke-static {v4}, Landroidx/camera/camera2/internal/d2;->e(Lw/y;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v4}, Landroidx/camera/camera2/internal/d2;->f(Lw/y;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    new-instance p3, Ljava/util/LinkedHashSet;

    invoke-direct {p3}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroidx/camera/core/impl/k2;

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    move-object v3, p3

    move-object v4, v9

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Landroidx/camera/camera2/internal/d2;->i(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Landroidx/camera/core/impl/k2;Ljava/util/Set;)Lw/y;

    move-result-object v0

    invoke-interface {p2, v9, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    return-object p2
.end method
