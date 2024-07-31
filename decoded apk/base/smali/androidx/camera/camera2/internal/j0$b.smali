.class Landroidx/camera/camera2/internal/j0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/j0;->h0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/j0;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/j0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Landroidx/camera/core/impl/r0$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    check-cast p1, Landroidx/camera/core/impl/r0$a;

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0$a;->a()Landroidx/camera/core/impl/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j0;->J(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j0;->j0(Landroidx/camera/core/impl/y1;)V

    :cond_0
    return-void

    :cond_1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_2

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    const-string v0, "Unable to configure camera cancelled"

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    const/4 v2, 0x4

    invoke-static {v2, p1}, Lw/q$a;->b(ILjava/lang/Throwable;)Lw/q$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/camera/camera2/internal/j0;->q0(Landroidx/camera/camera2/internal/j0$g;Lw/q$a;)V

    :cond_3
    instance-of v0, p1, Landroid/hardware/camera2/CameraAccessException;

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to configure camera due to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/j0;->H(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    instance-of p1, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to configure camera "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/j0;->u:Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/n0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeout!"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    invoke-static {v0, p1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    iget-object p1, p1, Landroidx/camera/camera2/internal/j0;->D:Lx/a;

    invoke-interface {p1}, Lx/a;->b()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    iget-object p1, p1, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/camera/camera2/internal/j0$b;->a:Landroidx/camera/camera2/internal/j0;

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->CONFIGURED:Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/j0;->p0(Landroidx/camera/camera2/internal/j0$g;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/j0$b;->b(Ljava/lang/Void;)V

    return-void
.end method
