.class public interface abstract Lpc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lpc/e0;)Lee/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpc/e0<",
            "TT;>;)",
            "Lee/a<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract b(Lpc/e0;)Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpc/e0<",
            "TT;>;)",
            "Lee/b<",
            "TT;>;"
        }
    .end annotation
.end method

.method public c(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lpc/d;->g(Lpc/e0;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Lpc/e0;)Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpc/e0<",
            "TT;>;)",
            "Lee/b<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public e(Lpc/e0;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpc/e0<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lpc/d;->b(Lpc/e0;)Lee/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Class;)Lee/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lee/b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lpc/d;->b(Lpc/e0;)Lee/b;

    move-result-object p1

    return-object p1
.end method

.method public g(Lpc/e0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpc/e0<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lpc/d;->d(Lpc/e0;)Lee/b;

    move-result-object p1

    invoke-interface {p1}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public get(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p1}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Class;)Lee/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lee/a<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lpc/d;->a(Lpc/e0;)Lee/a;

    move-result-object p1

    return-object p1
.end method
