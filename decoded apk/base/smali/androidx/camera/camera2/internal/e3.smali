.class public final synthetic Landroidx/camera/camera2/internal/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/y$c;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/i3;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/i3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/e3;->a:Landroidx/camera/camera2/internal/i3;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/e3;->a:Landroidx/camera/camera2/internal/i3;

    invoke-static {v0, p1, p2}, Landroidx/camera/camera2/internal/i3;->M(Landroidx/camera/camera2/internal/i3;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method
