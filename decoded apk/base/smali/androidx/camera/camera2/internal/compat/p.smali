.class public final synthetic Landroidx/camera/camera2/internal/compat/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/compat/i$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic c:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic d:Landroid/hardware/camera2/CaptureFailure;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/compat/i$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/p;->a:Landroidx/camera/camera2/internal/compat/i$b;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/p;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Landroidx/camera/camera2/internal/compat/p;->c:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, Landroidx/camera/camera2/internal/compat/p;->d:Landroid/hardware/camera2/CaptureFailure;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/p;->a:Landroidx/camera/camera2/internal/compat/i$b;

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/p;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/p;->c:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, Landroidx/camera/camera2/internal/compat/p;->d:Landroid/hardware/camera2/CaptureFailure;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/camera2/internal/compat/i$b;->g(Landroidx/camera/camera2/internal/compat/i$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    return-void
.end method