.class Landroidx/camera/camera2/internal/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/f1$a;
    }
.end annotation


# direct methods
.method private static a(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-static {v0}, Lv/j$a;->e(Landroidx/camera/core/impl/n0;)Lv/j$a;

    move-result-object v0

    invoke-virtual {v0}, Lv/j$a;->d()Lv/j;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Lq/a;->W(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/n0$a;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->d()Landroid/util/Range;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    invoke-virtual {v0, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->d()Landroid/util/Range;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static b(Landroid/hardware/camera2/CaptureRequest$Builder;Landroidx/camera/core/impl/n0;)V
    .locals 4

    invoke-static {p1}, Lv/j$a;->e(Landroidx/camera/core/impl/n0;)Lv/j$a;

    move-result-object p1

    invoke-virtual {p1}, Lv/j$a;->d()Lv/j;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/u1;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/n0$a;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CaptureRequest$Key;

    :try_start_0
    invoke-interface {p1, v1}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CaptureRequest.Key is not supported: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Camera2CaptureRequestBuilder"

    invoke-static {v2, v1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static c(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map;)Landroid/hardware/camera2/CaptureRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/l0;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Landroid/view/Surface;",
            ">;)",
            "Landroid/hardware/camera2/CaptureRequest;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, p2}, Landroidx/camera/camera2/internal/f1;->e(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->c()Landroidx/camera/core/impl/s;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->h()I

    move-result v1

    const/4 v2, 0x5

    const-string v3, "Camera2CaptureRequestBuilder"

    if-ne v1, v2, :cond_2

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object v1

    instance-of v1, v1, Landroid/hardware/camera2/TotalCaptureResult;

    if-eqz v1, :cond_2

    const-string v1, "createReprocessCaptureRequest"

    invoke-static {v3, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {p1, v0}, Landroidx/camera/camera2/internal/f1$a;->a(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string v0, "createCaptureRequest"

    invoke-static {v3, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    :goto_0
    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/camera/camera2/internal/f1;->b(Landroid/hardware/camera2/CaptureRequest$Builder;Landroidx/camera/core/impl/n0;)V

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/f1;->a(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CaptureRequest$Builder;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/l0;->i:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v2

    invoke-interface {v2, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/l0;->j:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v2

    invoke-interface {v2, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->byteValue()B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->g()Landroidx/camera/core/impl/f2;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/hardware/camera2/CaptureRequest$Builder;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CaptureRequest;
    .locals 1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object p0

    invoke-static {p1, p0}, Landroidx/camera/camera2/internal/f1;->b(Landroid/hardware/camera2/CaptureRequest$Builder;Landroidx/camera/core/impl/n0;)V

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Landroid/view/Surface;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/r0;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "DeferrableSurface not in configuredSurfaceMap"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v0
.end method
