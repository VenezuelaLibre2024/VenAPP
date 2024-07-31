.class public final synthetic Landroidx/camera/camera2/internal/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/y$b;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/i3;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/i3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/g3;->a:Landroidx/camera/camera2/internal/i3;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g3;->a:Landroidx/camera/camera2/internal/i3;

    invoke-static {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/i3;->K(Landroidx/camera/camera2/internal/i3;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
