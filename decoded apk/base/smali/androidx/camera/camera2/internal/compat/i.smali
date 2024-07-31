.class public final Landroidx/camera/camera2/internal/compat/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/compat/i$a;,
        Landroidx/camera/camera2/internal/compat/i$c;,
        Landroidx/camera/camera2/internal/compat/i$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/compat/i$a;


# direct methods
.method private constructor <init>(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance p2, Landroidx/camera/camera2/internal/compat/z;

    invoke-direct {p2, p1}, Landroidx/camera/camera2/internal/compat/z;-><init>(Landroid/hardware/camera2/CameraCaptureSession;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/i;->a:Landroidx/camera/camera2/internal/compat/i$a;

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/compat/a0;->d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)Landroidx/camera/camera2/internal/compat/i$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/i;->a:Landroidx/camera/camera2/internal/compat/i$a;

    :goto_0
    return-void
.end method

.method public static d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)Landroidx/camera/camera2/internal/compat/i;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/compat/i;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/compat/i;-><init>(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")I"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/i;->a:Landroidx/camera/camera2/internal/compat/i$a;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/compat/i$a;->b(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public b(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/i;->a:Landroidx/camera/camera2/internal/compat/i$a;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/compat/i$a;->c(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public c()Landroid/hardware/camera2/CameraCaptureSession;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/i;->a:Landroidx/camera/camera2/internal/compat/i$a;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/compat/i$a;->a()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    return-object v0
.end method
