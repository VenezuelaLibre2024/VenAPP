.class public final synthetic Landroidx/camera/camera2/internal/compat/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/compat/i$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic c:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic d:Landroid/view/Surface;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/compat/i$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/k;->a:Landroidx/camera/camera2/internal/compat/i$b;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/k;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Landroidx/camera/camera2/internal/compat/k;->c:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, Landroidx/camera/camera2/internal/compat/k;->d:Landroid/view/Surface;

    iput-wide p5, p0, Landroidx/camera/camera2/internal/compat/k;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/k;->a:Landroidx/camera/camera2/internal/compat/i$b;

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/k;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/k;->c:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, Landroidx/camera/camera2/internal/compat/k;->d:Landroid/view/Surface;

    iget-wide v4, p0, Landroidx/camera/camera2/internal/compat/k;->e:J

    invoke-static/range {v0 .. v5}, Landroidx/camera/camera2/internal/compat/i$b;->a(Landroidx/camera/camera2/internal/compat/i$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V

    return-void
.end method
