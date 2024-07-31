.class public Landroidx/camera/camera2/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s;


# instance fields
.field private final a:Landroidx/camera/core/impl/f2;

.field private final b:Landroid/hardware/camera2/CaptureResult;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CaptureResult;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/f2;->b()Landroidx/camera/core/impl/f2;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/g;-><init>(Landroidx/camera/core/impl/f2;Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/f2;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/g;->a:Landroidx/camera/core/impl/f2;

    iput-object p2, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/utils/j$b;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/camera/core/impl/s;->a(Landroidx/camera/core/impl/utils/j$b;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/utils/j$b;->j(I)Landroidx/camera/core/impl/utils/j$b;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/utils/j$b;->i(I)Landroidx/camera/core/impl/utils/j$b;

    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/j$b;->m(I)Landroidx/camera/core/impl/utils/j$b;
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "C2CameraCaptureResult"

    const-string v1, "Failed to get JPEG orientation."

    invoke-static {v0, v1}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/utils/j$b;->f(J)Landroidx/camera/core/impl/utils/j$b;

    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->LENS_APERTURE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/j$b;->l(F)Landroidx/camera/core/impl/utils/j$b;

    :cond_3
    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    iget-object v1, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v2, Landroid/hardware/camera2/CaptureResult;->CONTROL_POST_RAW_SENSITIVITY_BOOST:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/j$b;->k(I)Landroidx/camera/core/impl/utils/j$b;

    :cond_5
    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->LENS_FOCAL_LENGTH:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/j$b;->h(F)Landroidx/camera/core/impl/utils/j$b;

    :cond_6
    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_8

    sget-object v1, Landroidx/camera/core/impl/utils/j$c;->AUTO:Landroidx/camera/core/impl/utils/j$c;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_7

    sget-object v1, Landroidx/camera/core/impl/utils/j$c;->MANUAL:Landroidx/camera/core/impl/utils/j$c;

    :cond_7
    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/utils/j$b;->n(Landroidx/camera/core/impl/utils/j$c;)Landroidx/camera/core/impl/utils/j$b;

    :cond_8
    return-void
.end method

.method public b()Landroidx/camera/core/impl/f2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->a:Landroidx/camera/core/impl/f2;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()Landroidx/camera/core/impl/r;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->FLASH_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/camera/core/impl/r;->UNKNOWN:Landroidx/camera/core/impl/r;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined flash state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "C2CameraCaptureResult"

    invoke-static {v1, v0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/core/impl/r;->UNKNOWN:Landroidx/camera/core/impl/r;

    return-object v0

    :cond_1
    sget-object v0, Landroidx/camera/core/impl/r;->FIRED:Landroidx/camera/core/impl/r;

    return-object v0

    :cond_2
    sget-object v0, Landroidx/camera/core/impl/r;->READY:Landroidx/camera/core/impl/r;

    return-object v0

    :cond_3
    sget-object v0, Landroidx/camera/core/impl/r;->NONE:Landroidx/camera/core/impl/r;

    return-object v0
.end method

.method public e()Landroid/hardware/camera2/CaptureResult;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    return-object v0
.end method

.method public f()Landroidx/camera/core/impl/p;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/camera/core/impl/p;->UNKNOWN:Landroidx/camera/core/impl/p;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined af state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "C2CameraCaptureResult"

    invoke-static {v1, v0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/core/impl/p;->UNKNOWN:Landroidx/camera/core/impl/p;

    return-object v0

    :pswitch_0
    sget-object v0, Landroidx/camera/core/impl/p;->PASSIVE_NOT_FOCUSED:Landroidx/camera/core/impl/p;

    return-object v0

    :pswitch_1
    sget-object v0, Landroidx/camera/core/impl/p;->LOCKED_NOT_FOCUSED:Landroidx/camera/core/impl/p;

    return-object v0

    :pswitch_2
    sget-object v0, Landroidx/camera/core/impl/p;->LOCKED_FOCUSED:Landroidx/camera/core/impl/p;

    return-object v0

    :pswitch_3
    sget-object v0, Landroidx/camera/core/impl/p;->PASSIVE_FOCUSED:Landroidx/camera/core/impl/p;

    return-object v0

    :pswitch_4
    sget-object v0, Landroidx/camera/core/impl/p;->SCANNING:Landroidx/camera/core/impl/p;

    return-object v0

    :pswitch_5
    sget-object v0, Landroidx/camera/core/impl/p;->INACTIVE:Landroidx/camera/core/impl/p;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g()Landroidx/camera/core/impl/q;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/camera/core/impl/q;->UNKNOWN:Landroidx/camera/core/impl/q;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined awb state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "C2CameraCaptureResult"

    invoke-static {v1, v0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/core/impl/q;->UNKNOWN:Landroidx/camera/core/impl/q;

    return-object v0

    :cond_1
    sget-object v0, Landroidx/camera/core/impl/q;->LOCKED:Landroidx/camera/core/impl/q;

    return-object v0

    :cond_2
    sget-object v0, Landroidx/camera/core/impl/q;->CONVERGED:Landroidx/camera/core/impl/q;

    return-object v0

    :cond_3
    sget-object v0, Landroidx/camera/core/impl/q;->METERING:Landroidx/camera/core/impl/q;

    return-object v0

    :cond_4
    sget-object v0, Landroidx/camera/core/impl/q;->INACTIVE:Landroidx/camera/core/impl/q;

    return-object v0
.end method

.method public h()Landroidx/camera/core/impl/n;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/camera/core/impl/n;->UNKNOWN:Landroidx/camera/core/impl/n;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined ae state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "C2CameraCaptureResult"

    invoke-static {v1, v0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/core/impl/n;->UNKNOWN:Landroidx/camera/core/impl/n;

    return-object v0

    :cond_1
    sget-object v0, Landroidx/camera/core/impl/n;->FLASH_REQUIRED:Landroidx/camera/core/impl/n;

    return-object v0

    :cond_2
    sget-object v0, Landroidx/camera/core/impl/n;->LOCKED:Landroidx/camera/core/impl/n;

    return-object v0

    :cond_3
    sget-object v0, Landroidx/camera/core/impl/n;->CONVERGED:Landroidx/camera/core/impl/n;

    return-object v0

    :cond_4
    sget-object v0, Landroidx/camera/core/impl/n;->SEARCHING:Landroidx/camera/core/impl/n;

    return-object v0

    :cond_5
    sget-object v0, Landroidx/camera/core/impl/n;->INACTIVE:Landroidx/camera/core/impl/n;

    return-object v0
.end method

.method public i()Landroidx/camera/core/impl/o;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/g;->b:Landroid/hardware/camera2/CaptureResult;

    sget-object v1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/camera/core/impl/o;->UNKNOWN:Landroidx/camera/core/impl/o;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined af mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "C2CameraCaptureResult"

    invoke-static {v1, v0}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/core/impl/o;->UNKNOWN:Landroidx/camera/core/impl/o;

    return-object v0

    :cond_1
    sget-object v0, Landroidx/camera/core/impl/o;->ON_CONTINUOUS_AUTO:Landroidx/camera/core/impl/o;

    return-object v0

    :cond_2
    sget-object v0, Landroidx/camera/core/impl/o;->ON_MANUAL_AUTO:Landroidx/camera/core/impl/o;

    return-object v0

    :cond_3
    sget-object v0, Landroidx/camera/core/impl/o;->OFF:Landroidx/camera/core/impl/o;

    return-object v0
.end method
