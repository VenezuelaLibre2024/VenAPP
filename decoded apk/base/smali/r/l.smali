.class Lr/l;
.super Lr/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/l$a;
    }
.end annotation


# direct methods
.method constructor <init>(ILandroid/view/Surface;)V
    .locals 2

    new-instance v0, Lr/l$a;

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {v0, v1}, Lr/l$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {p0, v0}, Lr/l;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/j;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method static k(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/l;
    .locals 2

    new-instance v0, Lr/l;

    new-instance v1, Lr/l$a;

    invoke-direct {v1, p0}, Lr/l$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {v0, v1}, Lr/l;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public c(J)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/l$a;

    iput-wide p1, v0, Lr/l$a;->b:J

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lr/l;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0, p1}, Lr/k;->a(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    instance-of v0, v0, Lr/l$a;

    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/l$a;

    iget-object v0, v0, Lr/l$a;->a:Landroid/hardware/camera2/params/OutputConfiguration;

    return-object v0
.end method
