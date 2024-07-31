.class public final synthetic Landroidx/camera/camera2/internal/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/x1;

.field public final synthetic b:Landroidx/camera/core/impl/y1;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/v1;->a:Landroidx/camera/camera2/internal/x1;

    iput-object p2, p0, Landroidx/camera/camera2/internal/v1;->b:Landroidx/camera/core/impl/y1;

    iput-object p3, p0, Landroidx/camera/camera2/internal/v1;->c:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/v1;->a:Landroidx/camera/camera2/internal/x1;

    iget-object v1, p0, Landroidx/camera/camera2/internal/v1;->b:Landroidx/camera/core/impl/y1;

    iget-object v2, p0, Landroidx/camera/camera2/internal/v1;->c:Landroid/hardware/camera2/CameraDevice;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/camera2/internal/x1;->j(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
