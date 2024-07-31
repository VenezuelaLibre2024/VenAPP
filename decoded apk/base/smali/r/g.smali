.class Lr/g;
.super Lr/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/g$a;
    }
.end annotation


# direct methods
.method constructor <init>(ILandroid/view/Surface;)V
    .locals 2

    new-instance v0, Lr/g$a;

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {v0, v1}, Lr/g$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {p0, v0}, Lr/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/n;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method static i(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/g;
    .locals 2

    new-instance v0, Lr/g;

    new-instance v1, Lr/g$a;

    invoke-direct {v1, p0}, Lr/g$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {v0, v1}, Lr/g;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public c(J)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/g$a;

    iput-wide p1, v0, Lr/g$a;->d:J

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/g$a;

    iput-object p1, v0, Lr/g$a;->b:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/g$a;

    iget-object v0, v0, Lr/g$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/g$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lr/g$a;->c:Z

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    instance-of v0, v0, Lr/g$a;

    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/g$a;

    iget-object v0, v0, Lr/g$a;->a:Landroid/hardware/camera2/params/OutputConfiguration;

    return-object v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    invoke-virtual {p0}, Lr/g;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0}, Landroid/hardware/camera2/params/OutputConfiguration;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method h()Z
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/g$a;

    iget-boolean v0, v0, Lr/g$a;->c:Z

    return v0
.end method
