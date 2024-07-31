.class Ly/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/camera/core/n$g;

.field private final b:Landroid/graphics/Rect;

.field private final c:I

.field private final d:I

.field private final e:Landroid/graphics/Matrix;

.field private final f:Ly/n0;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final i:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/k0;Landroidx/camera/core/n$g;Landroid/graphics/Rect;IILandroid/graphics/Matrix;Ly/n0;Lcom/google/common/util/concurrent/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k0;",
            "Landroidx/camera/core/n$g;",
            "Landroid/graphics/Rect;",
            "II",
            "Landroid/graphics/Matrix;",
            "Ly/n0;",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly/f0;->a:Landroidx/camera/core/n$g;

    iput p5, p0, Ly/f0;->d:I

    iput p4, p0, Ly/f0;->c:I

    iput-object p3, p0, Ly/f0;->b:Landroid/graphics/Rect;

    iput-object p6, p0, Ly/f0;->e:Landroid/graphics/Matrix;

    iput-object p7, p0, Ly/f0;->f:Ly/n0;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ly/f0;->g:Ljava/lang/String;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ly/f0;->h:Ljava/util/List;

    invoke-interface {p1}, Landroidx/camera/core/impl/k0;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/m0;

    iget-object p3, p0, Ly/f0;->h:Ljava/util/List;

    invoke-interface {p2}, Landroidx/camera/core/impl/m0;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object p8, p0, Ly/f0;->i:Lcom/google/common/util/concurrent/f;

    return-void
.end method


# virtual methods
.method a()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly/f0;->i:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method

.method b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Ly/f0;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Ly/f0;->d:I

    return v0
.end method

.method d()Landroidx/camera/core/n$g;
    .locals 1

    iget-object v0, p0, Ly/f0;->a:Landroidx/camera/core/n$g;

    return-object v0
.end method

.method e()I
    .locals 1

    iget v0, p0, Ly/f0;->c:I

    return v0
.end method

.method f()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Ly/f0;->e:Landroid/graphics/Matrix;

    return-object v0
.end method

.method g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly/f0;->h:Ljava/util/List;

    return-object v0
.end method

.method h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly/f0;->g:Ljava/lang/String;

    return-object v0
.end method

.method i()Z
    .locals 1

    iget-object v0, p0, Ly/f0;->f:Ly/n0;

    invoke-interface {v0}, Ly/n0;->isAborted()Z

    move-result v0

    return v0
.end method

.method j()Z
    .locals 1

    invoke-virtual {p0}, Ly/f0;->d()Landroidx/camera/core/n$g;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method k(Lw/g0;)V
    .locals 1

    iget-object v0, p0, Ly/f0;->f:Ly/n0;

    invoke-interface {v0, p1}, Ly/n0;->e(Lw/g0;)V

    return-void
.end method

.method l(Landroidx/camera/core/n$h;)V
    .locals 1

    iget-object v0, p0, Ly/f0;->f:Ly/n0;

    invoke-interface {v0, p1}, Ly/n0;->b(Landroidx/camera/core/n$h;)V

    return-void
.end method

.method m(Landroidx/camera/core/o;)V
    .locals 1

    iget-object v0, p0, Ly/f0;->f:Ly/n0;

    invoke-interface {v0, p1}, Ly/n0;->c(Landroidx/camera/core/o;)V

    return-void
.end method

.method n()V
    .locals 1

    iget-object v0, p0, Ly/f0;->f:Ly/n0;

    invoke-interface {v0}, Ly/n0;->d()V

    return-void
.end method

.method o(Lw/g0;)V
    .locals 1

    iget-object v0, p0, Ly/f0;->f:Ly/n0;

    invoke-interface {v0, p1}, Ly/n0;->a(Lw/g0;)V

    return-void
.end method
