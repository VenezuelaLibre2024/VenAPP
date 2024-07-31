.class public final Landroidx/camera/camera2/internal/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/z;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/camera/camera2/internal/w2;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroidx/camera/camera2/internal/f;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/camera/camera2/internal/f;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/camera/camera2/internal/f;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/g1;->a:Ljava/util/Map;

    invoke-static {p2}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/camera2/internal/g1;->b:Landroidx/camera/camera2/internal/f;

    instance-of p2, p3, Landroidx/camera/camera2/internal/compat/r0;

    if-eqz p2, :cond_0

    check-cast p3, Landroidx/camera/camera2/internal/compat/r0;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/camera/camera2/internal/compat/r0;->a(Landroid/content/Context;)Landroidx/camera/camera2/internal/compat/r0;

    move-result-object p3

    :goto_0
    invoke-direct {p0, p1, p3, p4}, Landroidx/camera/camera2/internal/g1;->c(Landroid/content/Context;Landroidx/camera/camera2/internal/compat/r0;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/g1$a;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/g1$a;-><init>()V

    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/camera/camera2/internal/g1;-><init>(Landroid/content/Context;Landroidx/camera/camera2/internal/f;Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method private c(Landroid/content/Context;Landroidx/camera/camera2/internal/compat/r0;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/camera/camera2/internal/compat/r0;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Landroidx/camera/camera2/internal/g1;->a:Ljava/util/Map;

    new-instance v2, Landroidx/camera/camera2/internal/w2;

    iget-object v3, p0, Landroidx/camera/camera2/internal/g1;->b:Landroidx/camera/camera2/internal/f;

    invoke-direct {v2, p1, v0, p2, v3}, Landroidx/camera/camera2/internal/w2;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/camera/camera2/internal/compat/r0;Landroidx/camera/camera2/internal/f;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
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

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "No new use cases to be bound."

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/g1;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/w2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p3, p4}, Landroidx/camera/camera2/internal/w2;->y(ILjava/util/List;Ljava/util/Map;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No such camera id in supported combination list: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(ILjava/lang/String;ILandroid/util/Size;)Landroidx/camera/core/impl/d2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g1;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/camera2/internal/w2;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1, p3, p4}, Landroidx/camera/camera2/internal/w2;->I(IILandroid/util/Size;)Landroidx/camera/core/impl/d2;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
