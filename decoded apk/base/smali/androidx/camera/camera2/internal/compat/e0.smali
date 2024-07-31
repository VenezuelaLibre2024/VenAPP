.class public final Landroidx/camera/camera2/internal/compat/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/compat/e0$a;,
        Landroidx/camera/camera2/internal/compat/e0$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/compat/e0$a;


# direct methods
.method private constructor <init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance p2, Landroidx/camera/camera2/internal/compat/m0;

    invoke-direct {p2, p1}, Landroidx/camera/camera2/internal/compat/m0;-><init>(Landroid/hardware/camera2/CameraDevice;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/e0;->a:Landroidx/camera/camera2/internal/compat/e0$a;

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/compat/k0;->e(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Landroidx/camera/camera2/internal/compat/k0;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/e0;->a:Landroidx/camera/camera2/internal/compat/e0$a;

    :goto_0
    return-void
.end method

.method public static b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Landroidx/camera/camera2/internal/compat/e0;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/compat/e0;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/compat/e0;-><init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Lr/w;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/e0;->a:Landroidx/camera/camera2/internal/compat/e0$a;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/compat/e0$a;->a(Lr/w;)V

    return-void
.end method
