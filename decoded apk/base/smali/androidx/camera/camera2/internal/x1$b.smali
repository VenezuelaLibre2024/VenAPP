.class Landroidx/camera/camera2/internal/x1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/x1;->g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;
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
.field final synthetic a:Landroidx/camera/camera2/internal/x1;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/x1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1$b;->a:Landroidx/camera/camera2/internal/x1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1$b;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v0, v0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1$b;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v1, v1, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/j3;->e()Z

    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$b;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    const/4 v2, 0x7

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_1

    const-string v1, "CaptureSession"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Opening session with fail "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1$b;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v3, v3, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lw/o0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1$b;->a:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/x1;->m()V

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/x1$b;->b(Ljava/lang/Void;)V

    return-void
.end method
