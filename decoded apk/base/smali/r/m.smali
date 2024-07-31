.class public Lr/m;
.super Lr/l;
.source "SourceFile"


# direct methods
.method constructor <init>(ILandroid/view/Surface;)V
    .locals 1

    new-instance v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {p0, v0}, Lr/m;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/l;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method static l(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/m;
    .locals 1

    new-instance v0, Lr/m;

    invoke-direct {v0, p0}, Lr/m;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lr/m;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;->setStreamUseCase(J)V

    return-void
.end method

.method public bridge synthetic b(Landroid/view/Surface;)V
    .locals 0

    invoke-super {p0, p1}, Lr/j;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public c(J)V
    .locals 1

    invoke-virtual {p0}, Lr/m;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;->setDynamicRangeProfile(J)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lr/l;->d(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic e()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lr/l;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lr/n;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f()V
    .locals 0

    invoke-super {p0}, Lr/j;->f()V

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    instance-of v0, v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic getSurface()Landroid/view/Surface;
    .locals 1

    invoke-super {p0}, Lr/g;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, Lr/n;->hashCode()I

    move-result v0

    return v0
.end method
