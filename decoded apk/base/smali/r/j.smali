.class Lr/j;
.super Lr/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/j$a;
    }
.end annotation


# direct methods
.method constructor <init>(ILandroid/view/Surface;)V
    .locals 2

    new-instance v0, Lr/j$a;

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {v0, v1}, Lr/j$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {p0, v0}, Lr/j;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method static j(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/j;
    .locals 2

    new-instance v0, Lr/j;

    new-instance v1, Lr/j$a;

    invoke-direct {v1, p0}, Lr/j$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {v0, v1}, Lr/j;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroid/view/Surface;)V
    .locals 1

    invoke-virtual {p0}, Lr/j;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0, p1}, Lr/i;->a(Landroid/hardware/camera2/params/OutputConfiguration;Landroid/view/Surface;)V

    return-void
.end method

.method public c(J)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/j$a;

    iput-wide p1, v0, Lr/j$a;->c:J

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/j$a;

    iput-object p1, v0, Lr/j$a;->b:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/j$a;

    iget-object v0, v0, Lr/j$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()V
    .locals 1

    invoke-virtual {p0}, Lr/j;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0}, Lr/h;->a(Landroid/hardware/camera2/params/OutputConfiguration;)V

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    instance-of v0, v0, Lr/j$a;

    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/j$a;

    iget-object v0, v0, Lr/j$a;->a:Landroid/hardware/camera2/params/OutputConfiguration;

    return-object v0
.end method

.method final h()Z
    .locals 2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "isSurfaceSharingEnabled() should not be called on API >= 26"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
