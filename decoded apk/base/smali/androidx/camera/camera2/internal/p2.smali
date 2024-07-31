.class public final synthetic Landroidx/camera/camera2/internal/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/t2;

.field public final synthetic b:Landroidx/camera/core/impl/y1;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic d:Landroidx/camera/camera2/internal/j3;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/t2;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/p2;->a:Landroidx/camera/camera2/internal/t2;

    iput-object p2, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/core/impl/y1;

    iput-object p3, p0, Landroidx/camera/camera2/internal/p2;->c:Landroid/hardware/camera2/CameraDevice;

    iput-object p4, p0, Landroidx/camera/camera2/internal/p2;->d:Landroidx/camera/camera2/internal/j3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/p2;->a:Landroidx/camera/camera2/internal/t2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/p2;->b:Landroidx/camera/core/impl/y1;

    iget-object v2, p0, Landroidx/camera/camera2/internal/p2;->c:Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Landroidx/camera/camera2/internal/p2;->d:Landroidx/camera/camera2/internal/j3;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/camera/camera2/internal/t2;->i(Landroidx/camera/camera2/internal/t2;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
