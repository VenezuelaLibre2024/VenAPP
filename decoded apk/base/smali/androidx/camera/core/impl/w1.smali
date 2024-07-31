.class public Landroidx/camera/core/impl/w1;
.super Landroidx/camera/core/impl/z0;
.source "SourceFile"


# instance fields
.field private final c:Landroidx/camera/core/impl/y;

.field private volatile d:Z

.field private volatile e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/y;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/z0;-><init>(Landroidx/camera/core/impl/y;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/impl/w1;->d:Z

    iput-object p1, p0, Landroidx/camera/core/impl/w1;->c:Landroidx/camera/core/impl/y;

    return-void
.end method


# virtual methods
.method public b(F)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v1, v0, v1

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/w1;->l([I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Zoom is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/w1;->c:Landroidx/camera/core/impl/y;

    invoke-interface {v0, p1}, Lw/j;->b(F)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public d(F)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v1, v0, v1

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/w1;->l([I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Zoom is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/w1;->c:Landroidx/camera/core/impl/y;

    invoke-interface {v0, p1}, Lw/j;->d(F)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public g(Z)Lcom/google/common/util/concurrent/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x6

    aput v2, v0, v1

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/w1;->l([I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Torch is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/w1;->c:Landroidx/camera/core/impl/y;

    invoke-interface {v0, p1}, Lw/j;->g(Z)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public k(ZLjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/camera/core/impl/w1;->d:Z

    iput-object p2, p0, Landroidx/camera/core/impl/w1;->e:Ljava/util/Set;

    return-void
.end method

.method varargs l([I)Z
    .locals 4

    iget-boolean v0, p0, Landroidx/camera/core/impl/w1;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/camera/core/impl/w1;->e:Ljava/util/Set;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/camera/core/impl/w1;->e:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method
