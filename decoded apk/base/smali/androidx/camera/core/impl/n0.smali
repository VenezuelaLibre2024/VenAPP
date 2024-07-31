.class public interface abstract Landroidx/camera/core/impl/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/n0$c;,
        Landroidx/camera/core/impl/n0$a;,
        Landroidx/camera/core/impl/n0$b;
    }
.end annotation


# direct methods
.method public static D(Landroidx/camera/core/impl/m1;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/m1;",
            "Landroidx/camera/core/impl/n0;",
            "Landroidx/camera/core/impl/n0;",
            "Landroidx/camera/core/impl/n0$a<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/impl/f1;->p:Landroidx/camera/core/impl/n0$a;

    invoke-static {p3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p2, p3, v0}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh0/c;

    invoke-interface {p1, p3, v0}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh0/c;

    invoke-interface {p2, p3}, Landroidx/camera/core/impl/n0;->h(Landroidx/camera/core/impl/n0$a;)Landroidx/camera/core/impl/n0$c;

    move-result-object p2

    invoke-static {p1, v1}, Landroidx/camera/core/impl/utils/p;->a(Lh0/c;Lh0/c;)Lh0/c;

    move-result-object p1

    invoke-virtual {p0, p3, p2, p1}, Landroidx/camera/core/impl/m1;->p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Landroidx/camera/core/impl/n0;->h(Landroidx/camera/core/impl/n0$a;)Landroidx/camera/core/impl/n0$c;

    move-result-object p1

    invoke-interface {p2, p3}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p3, p1, p2}, Landroidx/camera/core/impl/m1;->p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static O(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/n0;
    .locals 3

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    invoke-static {}, Landroidx/camera/core/impl/p1;->X()Landroidx/camera/core/impl/p1;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    :goto_0
    if-eqz p0, :cond_2

    invoke-interface {p0}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/n0$a;

    invoke-static {v0, p1, p0, v2}, Landroidx/camera/core/impl/n0;->D(Landroidx/camera/core/impl/m1;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)V

    goto :goto_1

    :cond_2
    invoke-static {v0}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroidx/camera/core/impl/n0$c;Landroidx/camera/core/impl/n0$c;)Z
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/n0$c;->ALWAYS_OVERRIDE:Landroidx/camera/core/impl/n0$c;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/n0$c;->REQUIRED:Landroidx/camera/core/impl/n0$c;

    if-ne p0, v0, :cond_1

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public abstract a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TValueT;>;)TValueT;"
        }
    .end annotation
.end method

.method public abstract b(Landroidx/camera/core/impl/n0$a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0$a<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Landroidx/camera/core/impl/n0$b;)V
.end method

.method public abstract d(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TValueT;>;",
            "Landroidx/camera/core/impl/n0$c;",
            ")TValueT;"
        }
    .end annotation
.end method

.method public abstract e()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/n0$a<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract f(Landroidx/camera/core/impl/n0$a;)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0$a<",
            "*>;)",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/n0$c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TValueT;>;TValueT;)TValueT;"
        }
    .end annotation
.end method

.method public abstract h(Landroidx/camera/core/impl/n0$a;)Landroidx/camera/core/impl/n0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0$a<",
            "*>;)",
            "Landroidx/camera/core/impl/n0$c;"
        }
    .end annotation
.end method
