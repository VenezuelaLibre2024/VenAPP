.class final Landroidx/camera/camera2/internal/w2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/w2$b;,
        Landroidx/camera/camera2/internal/w2$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/camera2/internal/w2$b;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/String;

.field private final h:Landroidx/camera/camera2/internal/f;

.field private final i:Landroidx/camera/camera2/internal/compat/d0;

.field private final j:Lt/f;

.field private final k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field q:Landroidx/camera/core/impl/e2;

.field r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Landroidx/camera/camera2/internal/c2;

.field private final t:Lt/t;

.field private final u:Lt/q;

.field private final v:Landroidx/camera/camera2/internal/d2;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/camera/camera2/internal/compat/r0;Landroidx/camera/camera2/internal/f;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->c:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->l:Z

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->m:Z

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->n:Z

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->o:Z

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->p:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/w2;->r:Ljava/util/List;

    new-instance v1, Lt/t;

    invoke-direct {v1}, Lt/t;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/w2;->t:Lt/t;

    new-instance v1, Lt/q;

    invoke-direct {v1}, Lt/q;-><init>()V

    iput-object v1, p0, Landroidx/camera/camera2/internal/w2;->u:Lt/q;

    invoke-static {p2}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    invoke-static {p4}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/camera2/internal/f;

    iput-object p4, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    new-instance p4, Lt/f;

    invoke-direct {p4}, Lt/f;-><init>()V

    iput-object p4, p0, Landroidx/camera/camera2/internal/w2;->j:Lt/f;

    invoke-static {p1}, Landroidx/camera/camera2/internal/c2;->c(Landroid/content/Context;)Landroidx/camera/camera2/internal/c2;

    move-result-object p4

    iput-object p4, p0, Landroidx/camera/camera2/internal/w2;->s:Landroidx/camera/camera2/internal/c2;

    :try_start_0
    invoke-virtual {p3, p2}, Landroidx/camera/camera2/internal/compat/r0;->c(Ljava/lang/String;)Landroidx/camera/camera2/internal/compat/d0;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    sget-object p3, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, p3}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    iput p3, p0, Landroidx/camera/camera2/internal/w2;->k:I
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/h; {:try_start_0 .. :try_end_0} :catch_0

    sget-object p3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, p3}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    if-eqz p2, :cond_4

    array-length p3, p2

    :goto_1
    if-ge v0, p3, :cond_4

    aget p4, p2, v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne p4, v1, :cond_1

    iput-boolean v2, p0, Landroidx/camera/camera2/internal/w2;->l:Z

    goto :goto_2

    :cond_1
    const/4 v1, 0x6

    if-ne p4, v1, :cond_2

    iput-boolean v2, p0, Landroidx/camera/camera2/internal/w2;->m:Z

    goto :goto_2

    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v1, v3, :cond_3

    const/16 v1, 0x10

    if-ne p4, v1, :cond_3

    iput-boolean v2, p0, Landroidx/camera/camera2/internal/w2;->p:Z

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    new-instance p2, Landroidx/camera/camera2/internal/d2;

    iget-object p3, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-direct {p2, p3}, Landroidx/camera/camera2/internal/d2;-><init>(Landroidx/camera/camera2/internal/compat/d0;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/w2;->v:Landroidx/camera/camera2/internal/d2;

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->j()V

    iget-boolean p3, p0, Landroidx/camera/camera2/internal/w2;->p:Z

    if-eqz p3, :cond_5

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->l()V

    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string p3, "android.hardware.camera.concurrent"

    invoke-virtual {p1, p3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/w2;->n:Z

    if-eqz p1, :cond_6

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->h()V

    :cond_6
    invoke-virtual {p2}, Landroidx/camera/camera2/internal/d2;->d()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->g()V

    :cond_7
    iget-object p1, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {p1}, Landroidx/camera/camera2/internal/u2;->h(Landroidx/camera/camera2/internal/compat/d0;)Z

    move-result p1

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/w2;->o:Z

    if-eqz p1, :cond_8

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->i()V

    :cond_8
    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->k()V

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->b()V

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Landroidx/camera/camera2/internal/q1;->a(Landroidx/camera/camera2/internal/compat/h;)Lw/r;

    move-result-object p1

    throw p1
.end method

.method private A(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/Map;Ljava/util/Map;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;)",
            "Landroid/util/Pair<",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/a;->g()Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p7, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p7, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p7

    if-ge p2, p7, :cond_3

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Landroid/util/Size;

    invoke-interface {p5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k2;

    invoke-interface {v1}, Landroidx/camera/core/impl/e1;->n()I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/camera/camera2/internal/w2;->D(I)Landroidx/camera/core/impl/e2;

    move-result-object v3

    invoke-static {p1, v2, p7, v3}, Landroidx/camera/core/impl/d2;->h(IILandroid/util/Size;Landroidx/camera/core/impl/e2;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p8, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-interface {v1}, Landroidx/camera/core/impl/e1;->n()I

    move-result v1

    invoke-direct {p0, p6, v1, p7}, Landroidx/camera/camera2/internal/w2;->C(IILandroid/util/Size;)I

    move-result p6

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Landroid/util/Pair;

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Landroid/util/Range;
    .locals 3
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
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/a;->h()Landroid/util/Range;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Landroidx/camera/camera2/internal/w2;->E(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/camera/core/impl/k2;

    invoke-interface {p3, v0}, Landroidx/camera/core/impl/k2;->x(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p3

    invoke-direct {p0, p3, v1}, Landroidx/camera/camera2/internal/w2;->E(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;

    move-result-object v1

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method private C(IILandroid/util/Size;)I
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {v0, p2, p3}, Landroidx/camera/camera2/internal/w2;->o(Landroidx/camera/camera2/internal/compat/d0;ILandroid/util/Size;)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method private E(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p2, p1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method private F(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {v3, v4}, Landroidx/camera/core/impl/k2;->A(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/camera/core/impl/k2;

    invoke-interface {v5, v4}, Landroidx/camera/core/impl/k2;->A(I)I

    move-result v6

    if-ne v2, v6, :cond_3

    invoke-interface {p1, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private G(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/w2$b;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)Z"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/a;->g()Landroidx/camera/core/impl/d2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p2, Landroidx/camera/core/impl/utils/d;

    invoke-direct {p2}, Landroidx/camera/core/impl/utils/d;-><init>()V

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/k2;

    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "No available output size is found for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-static {v3, p2}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    invoke-interface {v2}, Landroidx/camera/core/impl/e1;->n()I

    move-result v2

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/w2$b;->a()I

    move-result v4

    invoke-virtual {p0, v2}, Landroidx/camera/camera2/internal/w2;->D(I)Landroidx/camera/core/impl/e2;

    move-result-object v5

    invoke-static {v4, v2, v3, v5}, Landroidx/camera/core/impl/d2;->h(IILandroid/util/Size;Landroidx/camera/core/impl/e2;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, v0}, Landroidx/camera/camera2/internal/w2;->c(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method private H()V
    .locals 8

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->s:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/c2;->g()V

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->k()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->s:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/c2;->f()Landroid/util/Size;

    move-result-object v3

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->b()Landroid/util/Size;

    move-result-object v1

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->j()Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->h()Ljava/util/Map;

    move-result-object v4

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->f()Landroid/util/Size;

    move-result-object v5

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->d()Ljava/util/Map;

    move-result-object v6

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->l()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {v1 .. v7}, Landroidx/camera/core/impl/e2;->a(Landroid/util/Size;Ljava/util/Map;Landroid/util/Size;Ljava/util/Map;Landroid/util/Size;Ljava/util/Map;Ljava/util/Map;)Landroidx/camera/core/impl/e2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    :goto_0
    return-void
.end method

.method private J(Ljava/util/Map;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Size;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/d0;->b()Landroidx/camera/camera2/internal/compat/z0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/z0;->c()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p2, v1}, Landroidx/camera/camera2/internal/w2;->p(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private K(Ljava/util/Map;Landroid/util/Size;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Size;",
            ">;",
            "Landroid/util/Size;",
            "I)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->n:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/d0;->b()Landroidx/camera/camera2/internal/compat/z0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/z0;->c()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p3, v1}, Landroidx/camera/camera2/internal/w2;->p(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    new-array v2, v2, [Landroid/util/Size;

    aput-object p2, v2, v1

    const/4 p2, 0x1

    aput-object v0, v2, p2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Landroidx/camera/core/impl/utils/d;

    invoke-direct {v0}, Landroidx/camera/core/impl/utils/d;-><init>()V

    invoke-static {p2, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/util/Size;

    :goto_0
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private L(Ljava/util/Map;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Size;",
            ">;I)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_2

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/w2;->p:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {}, Landroidx/camera/camera2/internal/v2;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v0, p2, v2}, Landroidx/camera/camera2/internal/w2;->p(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method private b()V
    .locals 0

    return-void
.end method

.method private static d(Landroid/util/Range;Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p0}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p2, p0}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p0

    invoke-static {p0}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result p0

    int-to-double v2, p0

    invoke-static {p2}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result p0

    int-to-double v4, p0

    div-double v4, v2, v4

    invoke-static {p1}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result p0

    int-to-double v6, p0

    div-double v6, v0, v6

    cmpl-double p0, v2, v0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    if-lez p0, :cond_1

    cmpl-double p0, v4, v0

    if-gez p0, :cond_0

    cmpl-double p0, v4, v6

    if-ltz p0, :cond_4

    :cond_0
    return-object p2

    :cond_1
    if-nez p0, :cond_3

    cmpl-double p0, v4, v6

    if-lez p0, :cond_2

    return-object p2

    :cond_2
    if-nez p0, :cond_4

    invoke-virtual {p2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le p0, v0, :cond_4

    return-object p2

    :cond_3
    cmpg-double p0, v6, v0

    if-gez p0, :cond_4

    cmpl-double p0, v4, v6

    if-lez p0, :cond_4

    return-object p2

    :cond_4
    return-object p1
.end method

.method private e(ILjava/util/Map;)Landroidx/camera/camera2/internal/w2$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Lw/y;",
            ">;)",
            "Landroidx/camera/camera2/internal/w2$b;"
        }
    .end annotation

    invoke-static {p2}, Landroidx/camera/camera2/internal/w2;->x(Ljava/util/Map;)I

    move-result p2

    if-eqz p1, :cond_1

    const/16 v0, 0xa

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p1}, Landroidx/camera/core/impl/d0;->a(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/w2$b;->c(II)Landroidx/camera/camera2/internal/w2$b;

    move-result-object p1

    return-object p1
.end method

.method private f(Ljava/util/Map;Landroidx/camera/camera2/internal/w2$b;Landroid/util/Range;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;",
            "Landroidx/camera/camera2/internal/w2$b;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/k2;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/Size;

    invoke-interface {v2}, Landroidx/camera/core/impl/e1;->n()I

    move-result v7

    invoke-virtual {p2}, Landroidx/camera/camera2/internal/w2$b;->a()I

    move-result v8

    invoke-virtual {p0, v7}, Landroidx/camera/camera2/internal/w2;->D(I)Landroidx/camera/core/impl/e2;

    move-result-object v9

    invoke-static {v8, v7, v6, v9}, Landroidx/camera/core/impl/d2;->h(IILandroid/util/Size;Landroidx/camera/core/impl/e2;)Landroidx/camera/core/impl/d2;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/camera/core/impl/d2;->c()Landroidx/camera/core/impl/d2$a;

    move-result-object v8

    if-eqz p3, :cond_1

    iget-object v9, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {v9, v7, v6}, Landroidx/camera/camera2/internal/w2;->o(Landroidx/camera/camera2/internal/compat/d0;ILandroid/util/Size;)I

    move-result v7

    goto :goto_2

    :cond_1
    const v7, 0x7fffffff

    :goto_2
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Set;

    if-nez v9, :cond_2

    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v4, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->e:Ljava/util/List;

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->c:Ljava/util/List;

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private i()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->f:Ljava/util/List;

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method private j()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    iget v1, p0, Landroidx/camera/camera2/internal/w2;->k:I

    iget-boolean v2, p0, Landroidx/camera/camera2/internal/w2;->l:Z

    iget-boolean v3, p0, Landroidx/camera/camera2/internal/w2;->m:Z

    invoke-static {v1, v2, v3}, Landroidx/camera/camera2/internal/i2;->a(IZZ)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->j:Lt/f;

    iget-object v2, p0, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    iget v3, p0, Landroidx/camera/camera2/internal/w2;->k:I

    invoke-virtual {v1, v2, v3}, Lt/f;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private k()V
    .locals 8

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->s:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/c2;->f()Landroid/util/Size;

    move-result-object v3

    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->u()Landroid/util/Size;

    move-result-object v5

    sget-object v1, Lf0/d;->c:Landroid/util/Size;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    invoke-static/range {v1 .. v7}, Landroidx/camera/core/impl/e2;->a(Landroid/util/Size;Ljava/util/Map;Landroid/util/Size;Ljava/util/Map;Landroid/util/Size;Ljava/util/Map;Ljava/util/Map;)Landroidx/camera/core/impl/e2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    return-void
.end method

.method private l()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->b:Ljava/util/List;

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private m(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v2, v3

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    div-int v4, v2, v4

    move v6, v2

    move v5, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    move v8, v3

    :goto_3
    if-ge v8, v2, :cond_2

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    rem-int v10, v8, v6

    div-int/2addr v10, v4

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Size;

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v1

    if-ge v5, v7, :cond_3

    add-int/lit8 v6, v5, 0x1

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    div-int v6, v4, v6

    move v11, v6

    move v6, v4

    move v4, v11

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to find supported resolutions."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private n(Landroid/util/Range;I)Landroid/util/Range;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/util/Range;

    if-nez v0, :cond_1

    sget-object p1, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    return-object p1

    :cond_1
    new-instance v1, Landroid/util/Range;

    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sget-object p1, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_9

    aget-object v5, v0, v3

    invoke-virtual {v5}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lt p2, v6, :cond_8

    sget-object v6, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    invoke-virtual {p1, v6}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object p1, v5

    :cond_2
    invoke-virtual {v5, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move-object p1, v5

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-virtual {v5, v1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v6

    invoke-static {v6}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result v6

    if-nez v4, :cond_4

    move v4, v6

    goto :goto_1

    :cond_4
    if-lt v6, v4, :cond_5

    invoke-static {v1, p1, v5}, Landroidx/camera/camera2/internal/w2;->d(Landroid/util/Range;Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v6

    invoke-static {v6}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    move-object v5, p1

    goto :goto_1

    :catch_0
    if-nez v4, :cond_8

    invoke-static {v5, v1}, Landroidx/camera/camera2/internal/w2;->s(Landroid/util/Range;Landroid/util/Range;)I

    move-result v6

    invoke-static {p1, v1}, Landroidx/camera/camera2/internal/w2;->s(Landroid/util/Range;Landroid/util/Range;)I

    move-result v7

    if-ge v6, v7, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v5, v1}, Landroidx/camera/camera2/internal/w2;->s(Landroid/util/Range;Landroid/util/Range;)I

    move-result v6

    invoke-static {p1, v1}, Landroidx/camera/camera2/internal/w2;->s(Landroid/util/Range;Landroid/util/Range;)I

    move-result v7

    if-ne v6, v7, :cond_8

    invoke-virtual {v5}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-le v6, v7, :cond_7

    goto :goto_1

    :cond_7
    invoke-static {v5}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result v6

    invoke-static {p1}, Landroidx/camera/camera2/internal/w2;->t(Landroid/util/Range;)I

    move-result v7

    if-ge v6, v7, :cond_8

    :goto_1
    move-object p1, v5

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_9
    :goto_2
    return-object p1
.end method

.method static o(Landroidx/camera/camera2/internal/compat/d0;ILandroid/util/Size;)I
    .locals 2

    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    invoke-virtual {p0, p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p0, p0

    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v0, p0

    double-to-int p0, v0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private p(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;
    .locals 3

    const/16 v0, 0x22

    if-ne p2, v0, :cond_0

    const-class v0, Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Landroidx/camera/core/impl/utils/d;

    invoke-direct {v1}, Landroidx/camera/core/impl/utils/d;-><init>()V

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    sget-object v2, Lf0/d;->a:Landroid/util/Size;

    if-eqz p3, :cond_2

    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/w2$a;->a(Landroid/hardware/camera2/params/StreamConfigurationMap;I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_2

    array-length p2, p1

    if-lez p2, :cond_2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/util/Size;

    :cond_2
    const/4 p1, 0x2

    new-array p1, p1, [Landroid/util/Size;

    const/4 p2, 0x0

    aput-object v0, p1, p2

    const/4 p2, 0x1

    aput-object v2, p1, p2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private q(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const v0, 0x7fffffff

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/a;->d()I

    move-result v2

    invoke-virtual {v1}, Landroidx/camera/core/impl/a;->f()Landroid/util/Size;

    move-result-object v1

    invoke-direct {p0, v0, v2, v1}, Landroidx/camera/camera2/internal/w2;->C(IILandroid/util/Size;)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method

.method private static s(Landroid/util/Range;Landroid/util/Range;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Ranges must not intersect"

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr p0, p1

    return p0

    :cond_1
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sub-int/2addr p1, p0

    return p1
.end method

.method private static t(Landroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sub-int/2addr v0, p0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private u()Landroid/util/Size;
    .locals 3

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    invoke-interface {v1, v0, v2}, Landroidx/camera/camera2/internal/f;->a(II)Landroid/media/CamcorderProfile;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v0, Landroid/util/Size;

    iget v2, v1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v1, v1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v2, v1}, Landroid/util/Size;-><init>(II)V

    return-object v0

    :cond_1
    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/w2;->v(I)Landroid/util/Size;

    move-result-object v0

    return-object v0

    :catch_0
    invoke-direct {p0}, Landroidx/camera/camera2/internal/w2;->w()Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method private v(I)Landroid/util/Size;
    .locals 3

    sget-object v0, Lf0/d;->d:Landroid/util/Size;

    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/16 v2, 0xa

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/16 v2, 0x8

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/16 v2, 0xc

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/4 v2, 0x6

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/4 v2, 0x5

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->h:Landroidx/camera/camera2/internal/f;

    const/4 v2, 0x4

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/f;->b(II)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_6

    new-instance v0, Landroid/util/Size;

    iget v1, p1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget p1, p1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v1, p1}, Landroid/util/Size;-><init>(II)V

    :cond_6
    return-object v0
.end method

.method private w()Landroid/util/Size;
    .locals 7

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/d0;->b()Landroidx/camera/camera2/internal/compat/z0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/z0;->c()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    const-class v1, Landroid/media/MediaRecorder;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lf0/d;->d:Landroid/util/Size;

    return-object v0

    :cond_0
    new-instance v1, Landroidx/camera/core/impl/utils/d;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroidx/camera/core/impl/utils/d;-><init>(Z)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    sget-object v5, Lf0/d;->f:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v6

    if-gt v4, v6, :cond_1

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    if-gt v4, v5, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lf0/d;->d:Landroid/util/Size;

    return-object v0
.end method

.method private static x(Ljava/util/Map;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Lw/y;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/y;

    invoke-virtual {v0}, Lw/y;->a()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    return v1

    :cond_1
    const/16 p0, 0x8

    return p0
.end method

.method private z(Landroidx/camera/camera2/internal/w2$b;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/w2$b;",
            ")",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/w2$b;->b()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_3

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/w2$b;->a()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->a:Ljava/util/List;

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->c:Ljava/util/List;

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroidx/camera/camera2/internal/w2$b;->b()I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_4

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/w2$b;->a()I

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->e:Ljava/util/List;

    goto :goto_1

    :cond_4
    :goto_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method D(I)Landroidx/camera/core/impl/e2;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->j()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lf0/d;->e:Landroid/util/Size;

    invoke-direct {p0, v0, v1, p1}, Landroidx/camera/camera2/internal/w2;->K(Ljava/util/Map;Landroid/util/Size;I)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->h()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lf0/d;->g:Landroid/util/Size;

    invoke-direct {p0, v0, v1, p1}, Landroidx/camera/camera2/internal/w2;->K(Ljava/util/Map;Landroid/util/Size;I)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->d()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/w2;->J(Ljava/util/Map;I)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/e2;->l()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/w2;->L(Ljava/util/Map;I)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/w2;->q:Landroidx/camera/core/impl/e2;

    return-object p1
.end method

.method I(IILandroid/util/Size;)Landroidx/camera/core/impl/d2;
    .locals 1

    invoke-virtual {p0, p2}, Landroidx/camera/camera2/internal/w2;->D(I)Landroidx/camera/core/impl/e2;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Landroidx/camera/core/impl/d2;->h(IILandroid/util/Size;Landroidx/camera/core/impl/e2;)Landroidx/camera/core/impl/d2;

    move-result-object p1

    return-object p1
.end method

.method a(Ljava/util/List;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->t:Lt/t;

    iget-object v1, p0, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-virtual {v0, v1, v2}, Lt/t;->a(Ljava/lang/String;Landroidx/camera/camera2/internal/compat/d0;)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x100

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/w2;->D(I)Landroidx/camera/core/impl/e2;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/e2;->c(I)Landroid/util/Size;

    move-result-object v0

    new-instance v1, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v1, v2, v0}, Landroid/util/Rational;-><init>(II)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/camera/core/impl/utils/a;->c:Landroid/util/Rational;

    goto :goto_0

    :cond_2
    sget-object v0, Landroidx/camera/core/impl/utils/a;->a:Landroid/util/Rational;

    :goto_0
    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    invoke-static {v3, v0}, Landroidx/camera/core/impl/utils/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    invoke-interface {v2, p1, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-object p1, v2

    :goto_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/w2;->u:Lt/q;

    invoke-static {p2}, Landroidx/camera/core/impl/d2;->e(I)Landroidx/camera/core/impl/d2$b;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lt/q;->a(Landroidx/camera/core/impl/d2$b;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method c(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/w2$b;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;)Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/w2;->z(Landroidx/camera/camera2/internal/w2$b;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/c2;

    invoke-virtual {v1, p2}, Landroidx/camera/core/impl/c2;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-eqz v1, :cond_0

    :cond_2
    return v1
.end method

.method r(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/w2$b;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d2;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/camera2/internal/u2;->n(Landroidx/camera/camera2/internal/w2$b;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/w2;->f:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/c2;

    invoke-virtual {v1, p2}, Landroidx/camera/core/impl/c2;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_2
    return-object v0
.end method

.method y(ILjava/util/List;Ljava/util/Map;)Landroid/util/Pair;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)",
            "Landroid/util/Pair<",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/b2;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/a;",
            "Landroidx/camera/core/impl/b2;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p2

    move-object/from16 v0, p3

    invoke-direct/range {p0 .. p0}, Landroidx/camera/camera2/internal/w2;->H()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v9, v11}, Landroidx/camera/camera2/internal/w2;->F(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    iget-object v1, v9, Landroidx/camera/camera2/internal/w2;->v:Landroidx/camera/camera2/internal/d2;

    invoke-virtual {v1, v10, v11, v12}, Landroidx/camera/camera2/internal/d2;->g(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;

    move-result-object v13

    move/from16 v14, p1

    invoke-direct {v9, v14, v13}, Landroidx/camera/camera2/internal/w2;->e(ILjava/util/Map;)Landroidx/camera/camera2/internal/w2$b;

    move-result-object v15

    invoke-direct {v9, v15, v10, v0}, Landroidx/camera/camera2/internal/w2;->G(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;Ljava/util/Map;)Z

    move-result v16

    const-string v8, ".  May be attempting to bind too many use cases. Existing surfaces: "

    const-string v7, " New configs: "

    const-string v6, "No supported surface combination is found for camera device - Id : "

    if-eqz v16, :cond_1c

    invoke-direct {v9, v10, v11, v12}, Landroidx/camera/camera2/internal/w2;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Landroid/util/Range;

    move-result-object v5

    invoke-direct {v9, v0, v15, v5}, Landroidx/camera/camera2/internal/w2;->f(Ljava/util/Map;Landroidx/camera/camera2/internal/w2$b;Landroid/util/Range;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/k2;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v3}, Landroidx/camera/core/impl/e1;->n()I

    move-result v3

    invoke-virtual {v9, v4, v3}, Landroidx/camera/camera2/internal/w2;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {v9, v1}, Landroidx/camera/camera2/internal/w2;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v17

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v10, v11}, Landroidx/camera/camera2/internal/u2;->d(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    invoke-direct {v9, v10}, Landroidx/camera/camera2/internal/w2;->q(Ljava/util/List;)I

    move-result v14

    move-object/from16 p3, v1

    iget-boolean v1, v9, Landroidx/camera/camera2/internal/w2;->o:Z

    const/16 v18, 0x0

    if-eqz v1, :cond_7

    if-nez v0, :cond_7

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    move-object/from16 v0, v18

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/util/List;

    move-object/from16 v0, p0

    move-object/from16 v21, p3

    move/from16 v1, p1

    move-object/from16 p3, v2

    move-object/from16 v2, p2

    move-object/from16 v22, v3

    move-object/from16 v3, v20

    move-object/from16 v23, v4

    move-object v4, v11

    move-object/from16 v20, v13

    move-object v13, v5

    move-object v5, v12

    move-object/from16 v24, v13

    move-object v13, v6

    move v6, v14

    move/from16 v25, v14

    move-object v14, v7

    move-object/from16 v7, p3

    move-object/from16 v26, v12

    move-object v12, v8

    move-object/from16 v8, v21

    invoke-direct/range {v0 .. v8}, Landroidx/camera/camera2/internal/w2;->A(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/Map;Ljava/util/Map;)Landroid/util/Pair;

    move-result-object v0

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-virtual {v9, v15, v0}, Landroidx/camera/camera2/internal/w2;->r(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v8, p3

    move-object/from16 v7, v21

    if-eqz v0, :cond_1

    invoke-static {v8, v7, v0}, Landroidx/camera/camera2/internal/u2;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_1

    move-object/from16 v0, v18

    :cond_1
    if-eqz v0, :cond_3

    iget-object v1, v9, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    invoke-static {v1, v0}, Landroidx/camera/camera2/internal/u2;->c(Landroidx/camera/camera2/internal/compat/d0;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v0, v18

    :cond_3
    invoke-interface {v8}, Ljava/util/Map;->clear()V

    invoke-interface {v7}, Ljava/util/Map;->clear()V

    move-object/from16 p3, v7

    move-object v2, v8

    move-object v8, v12

    move-object v6, v13

    move-object v7, v14

    move-object/from16 v13, v20

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    move/from16 v14, v25

    move-object/from16 v12, v26

    goto :goto_1

    :cond_4
    move-object/from16 v22, v3

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v26, v12

    move-object/from16 v20, v13

    move/from16 v25, v14

    move-object v13, v6

    move-object v14, v7

    move-object v12, v8

    move-object/from16 v7, p3

    move-object v8, v2

    :goto_2
    if-nez v0, :cond_6

    if-eqz v16, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v9, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_3
    move-object v12, v0

    goto :goto_4

    :cond_7
    move-object v8, v2

    move-object/from16 v22, v3

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v26, v12

    move-object/from16 v20, v13

    move/from16 v25, v14

    move-object v13, v6

    move-object v14, v7

    move-object/from16 v7, p3

    move-object/from16 v12, v18

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const v6, 0x7fffffff

    const/16 v17, 0x0

    move v4, v6

    move v5, v4

    move/from16 v19, v17

    move/from16 v21, v19

    move-object/from16 v27, v18

    move-object/from16 v28, v27

    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/16 v29, 0x1

    if-eqz v0, :cond_13

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Ljava/util/List;

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, v30

    move/from16 v33, v4

    move-object v4, v11

    move/from16 v34, v5

    move-object/from16 v5, v26

    move/from16 v6, v25

    move-object/from16 p3, v14

    move-object v14, v7

    move-object/from16 v7, v31

    move-object/from16 v31, v13

    move-object v13, v8

    move-object/from16 v8, v32

    invoke-direct/range {v0 .. v8}, Landroidx/camera/camera2/internal/w2;->A(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/Map;Ljava/util/Map;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move/from16 v0, v25

    if-eqz v24, :cond_8

    if-le v0, v5, :cond_8

    invoke-virtual/range {v24 .. v24}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v5, v2, :cond_8

    move/from16 v2, v17

    goto :goto_6

    :cond_8
    move/from16 v2, v29

    :goto_6
    if-nez v19, :cond_c

    invoke-virtual {v9, v15, v1}, Landroidx/camera/camera2/internal/w2;->c(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_c

    move/from16 v6, v34

    const v3, 0x7fffffff

    if-ne v6, v3, :cond_9

    goto :goto_7

    :cond_9
    if-ge v6, v5, :cond_a

    :goto_7
    move v6, v5

    move-object/from16 v27, v30

    :cond_a
    if-eqz v2, :cond_d

    if-eqz v21, :cond_b

    move-object/from16 v1, v28

    move-object/from16 v0, v30

    move/from16 v4, v33

    goto/16 :goto_c

    :cond_b
    move v6, v5

    move/from16 v19, v29

    move-object/from16 v27, v30

    goto :goto_8

    :cond_c
    move/from16 v6, v34

    const v3, 0x7fffffff

    :cond_d
    :goto_8
    if-eqz v12, :cond_11

    if-nez v21, :cond_11

    invoke-virtual {v9, v15, v1}, Landroidx/camera/camera2/internal/w2;->r(Landroidx/camera/camera2/internal/w2$b;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_11

    move/from16 v1, v33

    if-ne v1, v3, :cond_e

    goto :goto_9

    :cond_e
    if-ge v1, v5, :cond_f

    :goto_9
    move v4, v5

    move-object/from16 v28, v30

    goto :goto_a

    :cond_f
    move v4, v1

    :goto_a
    if-eqz v2, :cond_12

    move v4, v5

    if-eqz v19, :cond_10

    move v5, v6

    move-object/from16 v0, v27

    move-object/from16 v1, v30

    goto :goto_c

    :cond_10
    move/from16 v21, v29

    move-object/from16 v28, v30

    goto :goto_b

    :cond_11
    move/from16 v1, v33

    move v4, v1

    :cond_12
    :goto_b
    move/from16 v25, v0

    move v5, v6

    move-object v8, v13

    move-object v7, v14

    move-object/from16 v13, v31

    move-object/from16 v14, p3

    move v6, v3

    goto/16 :goto_5

    :cond_13
    move v1, v4

    move v6, v5

    move-object/from16 v31, v13

    move-object/from16 p3, v14

    move-object v14, v7

    move-object v13, v8

    move-object/from16 v0, v27

    move-object/from16 v1, v28

    :goto_c
    if-eqz v0, :cond_1b

    if-eqz v24, :cond_14

    move-object/from16 v2, v24

    invoke-direct {v9, v2, v5}, Landroidx/camera/camera2/internal/w2;->n(Landroid/util/Range;I)Landroid/util/Range;

    move-result-object v18

    :cond_14
    move-object/from16 v2, v18

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/k2;

    invoke-interface {v11, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v8, v26

    invoke-interface {v8, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Size;

    invoke-static {v7}, Landroidx/camera/core/impl/b2;->a(Landroid/util/Size;)Landroidx/camera/core/impl/b2$a;

    move-result-object v7

    move-object/from16 v15, v20

    invoke-interface {v15, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lw/y;

    invoke-static/range {v16 .. v16}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p1, v3

    move-object/from16 v3, v16

    check-cast v3, Lw/y;

    invoke-virtual {v7, v3}, Landroidx/camera/core/impl/b2$a;->b(Lw/y;)Landroidx/camera/core/impl/b2$a;

    move-result-object v3

    invoke-static {v6}, Landroidx/camera/camera2/internal/u2;->e(Landroidx/camera/core/impl/k2;)Lq/a;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object v3

    if-eqz v2, :cond_15

    invoke-virtual {v3, v2}, Landroidx/camera/core/impl/b2$a;->c(Landroid/util/Range;)Landroidx/camera/core/impl/b2$a;

    :cond_15
    invoke-virtual {v3}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object v3

    move-object/from16 v7, v22

    invoke-interface {v7, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v3, p1

    move-object/from16 v26, v8

    move-object/from16 v20, v15

    goto :goto_d

    :cond_16
    move-object/from16 v7, v22

    if-eqz v12, :cond_19

    if-ne v5, v4, :cond_19

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v2, v3, :cond_19

    move/from16 v2, v17

    :goto_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_18

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    move/from16 v17, v29

    goto :goto_f

    :cond_17
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_18
    :goto_f
    if-nez v17, :cond_19

    iget-object v0, v9, Landroidx/camera/camera2/internal/w2;->i:Landroidx/camera/camera2/internal/compat/d0;

    move-object/from16 v1, v23

    invoke-static {v0, v10, v7, v1}, Landroidx/camera/camera2/internal/u2;->k(Landroidx/camera/camera2/internal/compat/d0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_1a

    invoke-static {v7, v1, v13, v14, v12}, Landroidx/camera/camera2/internal/u2;->l(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V

    goto :goto_10

    :cond_19
    move-object/from16 v1, v23

    :cond_1a
    :goto_10
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, v7, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v31

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v9, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " and Hardware level: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v9, Landroidx/camera/camera2/internal/w2;->k:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". May be the specified resolution is too large and not supported. Existing surfaces: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v3, p3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    move-object v2, v6

    move-object v3, v7

    move-object v12, v8

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v9, Landroidx/camera/camera2/internal/w2;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
