.class public Li0/i;
.super Landroidx/camera/core/impl/z0;
.source "SourceFile"


# instance fields
.field private final c:Li0/d$a;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/y;Li0/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/z0;-><init>(Landroidx/camera/core/impl/y;)V

    iput-object p2, p0, Li0/i;->c:Li0/d$a;

    return-void
.end method

.method private k(Landroidx/camera/core/impl/l0;)I
    .locals 2

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/l0;->j:Landroidx/camera/core/impl/n0$a;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method private l(Landroidx/camera/core/impl/l0;)I
    .locals 2

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/l0;->i:Landroidx/camera/core/impl/n0$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method


# virtual methods
.method public c(Ljava/util/List;II)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;II)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p3

    :goto_0
    const-string p2, "Only support one capture config."

    invoke-static {v0, p2}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    iget-object p2, p0, Li0/i;->c:Li0/d$a;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/l0;

    invoke-direct {p0, v0}, Li0/i;->k(Landroidx/camera/core/impl/l0;)I

    move-result v0

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/l0;

    invoke-direct {p0, p1}, Li0/i;->l(Landroidx/camera/core/impl/l0;)I

    move-result p1

    invoke-interface {p2, v0, p1}, Li0/d$a;->a(II)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, La0/f;->c(Ljava/util/Collection;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
