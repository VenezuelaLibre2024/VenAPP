.class public final Landroidx/camera/core/impl/m1;
.super Landroidx/camera/core/impl/p1;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/l1;


# static fields
.field private static final J:Landroidx/camera/core/impl/n0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/n0$c;->OPTIONAL:Landroidx/camera/core/impl/n0$c;

    sput-object v0, Landroidx/camera/core/impl/m1;->J:Landroidx/camera/core/impl/n0$c;

    return-void
.end method

.method private constructor <init>(Ljava/util/TreeMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeMap<",
            "Landroidx/camera/core/impl/n0$a<",
            "*>;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/n0$c;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/p1;-><init>(Ljava/util/TreeMap;)V

    return-void
.end method

.method public static a0()Landroidx/camera/core/impl/m1;
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/m1;

    new-instance v1, Ljava/util/TreeMap;

    sget-object v2, Landroidx/camera/core/impl/p1;->H:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/m1;-><init>(Ljava/util/TreeMap;)V

    return-object v0
.end method

.method public static b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;
    .locals 7

    new-instance v0, Ljava/util/TreeMap;

    sget-object v1, Landroidx/camera/core/impl/p1;->H:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    invoke-interface {p0}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v2}, Landroidx/camera/core/impl/n0;->f(Landroidx/camera/core/impl/n0$a;)Ljava/util/Set;

    move-result-object v3

    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/camera/core/impl/n0$c;

    invoke-interface {p0, v2, v5}, Landroidx/camera/core/impl/n0;->d(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v2, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p0, Landroidx/camera/core/impl/m1;

    invoke-direct {p0, v0}, Landroidx/camera/core/impl/m1;-><init>(Ljava/util/TreeMap;)V

    return-object p0
.end method


# virtual methods
.method public c0(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TValueT;>;)TValueT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/p1;->G:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TValueT;>;",
            "Landroidx/camera/core/impl/n0$c;",
            "TValueT;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/p1;->G:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iget-object v1, p0, Landroidx/camera/core/impl/p1;->G:Ljava/util/TreeMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$c;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1, p2}, Landroidx/camera/core/impl/n0;->z(Landroidx/camera/core/impl/n0$c;Landroidx/camera/core/impl/n0$c;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Option values conflicts: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroidx/camera/core/impl/n0$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", existing value ("

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", conflicting ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_0
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TValueT;>;TValueT;)V"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/impl/m1;->J:Landroidx/camera/core/impl/n0$c;

    invoke-virtual {p0, p1, v0, p2}, Landroidx/camera/core/impl/m1;->p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V

    return-void
.end method
