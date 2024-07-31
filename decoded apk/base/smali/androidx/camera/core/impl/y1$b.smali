.class public Landroidx/camera/core/impl/y1$b;
.super Landroidx/camera/core/impl/y1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/impl/y1$a;-><init>()V

    return-void
.end method

.method public static p(Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroid/util/Size;",
            ")",
            "Landroidx/camera/core/impl/y1$b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/k2;->T(Landroidx/camera/core/impl/y1$d;)Landroidx/camera/core/impl/y1$d;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/impl/y1$b;

    invoke-direct {v1}, Landroidx/camera/core/impl/y1$b;-><init>()V

    invoke-interface {v0, p1, p0, v1}, Landroidx/camera/core/impl/y1$d;->a(Landroid/util/Size;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/y1$b;)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Implementation is missing option unpacker for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lb0/j;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/util/Collection;)Landroidx/camera/core/impl/y1$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/hardware/camera2/CameraDevice$StateCallback;",
            ">;)",
            "Landroidx/camera/core/impl/y1$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/y1$b;->e(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/core/impl/y1$b;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public b(Ljava/util/Collection;)Landroidx/camera/core/impl/y1$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/k;",
            ">;)",
            "Landroidx/camera/core/impl/y1$b;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->a(Ljava/util/Collection;)V

    return-object p0
.end method

.method public c(Ljava/util/List;)Landroidx/camera/core/impl/y1$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)",
            "Landroidx/camera/core/impl/y1$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/y1$b;->k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/y1$b;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public d(Landroidx/camera/core/impl/k;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public e(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public f(Landroidx/camera/core/impl/y1$c;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    return-object p0
.end method

.method public h(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    sget-object v0, Lw/y;->d:Lw/y;

    invoke-virtual {p0, p1, v0}, Landroidx/camera/core/impl/y1$b;->i(Landroidx/camera/core/impl/r0;Lw/y;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroidx/camera/core/impl/r0;Lw/y;)Landroidx/camera/core/impl/y1$b;
    .locals 0

    invoke-static {p1}, Landroidx/camera/core/impl/y1$e;->a(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$e$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/y1$e$a;->b(Lw/y;)Landroidx/camera/core/impl/y1$e$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e$a;->a()Landroidx/camera/core/impl/y1$e;

    move-result-object p1

    iget-object p2, p0, Landroidx/camera/core/impl/y1$a;->a:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public j(Landroidx/camera/core/impl/k;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    return-object p0
.end method

.method public k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public l(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    sget-object v0, Lw/y;->d:Lw/y;

    invoke-virtual {p0, p1, v0}, Landroidx/camera/core/impl/y1$b;->m(Landroidx/camera/core/impl/r0;Lw/y;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    return-object p1
.end method

.method public m(Landroidx/camera/core/impl/r0;Lw/y;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    invoke-static {p1}, Landroidx/camera/core/impl/y1$e;->a(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$e$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/camera/core/impl/y1$e$a;->b(Lw/y;)Landroidx/camera/core/impl/y1$e$a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1$e$a;->a()Landroidx/camera/core/impl/y1$e;

    move-result-object p2

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->a:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/l0$a;->f(Landroidx/camera/core/impl/r0;)V

    return-object p0
.end method

.method public n(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/l0$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o()Landroidx/camera/core/impl/y1;
    .locals 9

    new-instance v8, Landroidx/camera/core/impl/y1;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->a:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->c:Ljava/util/List;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->d:Ljava/util/List;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->f:Ljava/util/List;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->e:Ljava/util/List;

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v6

    iget-object v7, p0, Landroidx/camera/core/impl/y1$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/impl/y1;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/params/InputConfiguration;)V

    return-object v8
.end method

.method public q(Landroid/util/Range;)Landroidx/camera/core/impl/y1$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/core/impl/y1$b;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->p(Landroid/util/Range;)V

    return-object p0
.end method

.method public r(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->q(Landroidx/camera/core/impl/n0;)V

    return-object p0
.end method

.method public s(Landroid/hardware/camera2/params/InputConfiguration;)Landroidx/camera/core/impl/y1$b;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/impl/y1$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    return-object p0
.end method

.method public t(I)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/y1$a;->b:Landroidx/camera/core/impl/l0$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/l0$a;->r(I)V

    return-object p0
.end method
