.class final Landroidx/camera/camera2/internal/x1$f;
.super Landroidx/camera/camera2/internal/x2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/x1;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/x1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    invoke-direct {p0}, Landroidx/camera/camera2/internal/x2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public q(Landroidx/camera/camera2/internal/x2;)V
    .locals 3

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object p1, p1, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v0, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v1, v1, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "CaptureSession"

    const-string v1, "ConfigureFailed callback after change to RELEASED state"

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/x1;->m()V

    goto :goto_0

    :pswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConfigureFailed() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    const-string v0, "CaptureSession"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureSession.onConfigureFailed() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(Landroidx/camera/camera2/internal/x2;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v0, v0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->close()V

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iput-object p1, v1, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    iput-object v2, v1, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    iput-object p1, v1, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    iget-object p1, v1, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    if-eqz p1, :cond_0

    iget-object p1, v1, Landroidx/camera/camera2/internal/x1;->i:Lq/c;

    invoke-virtual {p1}, Lq/c;->d()Lq/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lq/c$a;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/x1;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/x1;->p(Ljava/util/List;)I

    :cond_0
    const-string p1, "CaptureSession"

    const-string v1, "Attempting to send capture request onConfigured"

    invoke-static {p1, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v1, p1, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/x1;->r(Landroidx/camera/core/impl/y1;)I

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/x1;->q()V

    goto :goto_0

    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConfigured() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    const-string p1, "CaptureSession"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureSession.onConfigured() mState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public s(Landroidx/camera/camera2/internal/x2;)V
    .locals 3

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object p1, p1, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v0, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v1, v1, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const-string v0, "CaptureSession"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureSession.onReady() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReady() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public t(Landroidx/camera/camera2/internal/x2;)V
    .locals 3

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object p1, p1, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v0, v0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    sget-object v1, Landroidx/camera/camera2/internal/x1$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    if-eq v0, v1, :cond_0

    const-string v0, "CaptureSession"

    const-string v1, "onSessionFinished()"

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/x1;->m()V

    monitor-exit p1

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSessionFinished() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1$f;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v2, v2, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
