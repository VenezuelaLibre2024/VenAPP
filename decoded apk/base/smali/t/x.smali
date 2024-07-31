.class public final synthetic Lt/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# instance fields
.field public final synthetic a:Lt/y$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Lr/w;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lt/y$b;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/x;->a:Lt/y$b;

    iput-object p2, p0, Lt/x;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p3, p0, Lt/x;->c:Lr/w;

    iput-object p4, p0, Lt/x;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 4

    iget-object v0, p0, Lt/x;->a:Lt/y$b;

    iget-object v1, p0, Lt/x;->b:Landroid/hardware/camera2/CameraDevice;

    iget-object v2, p0, Lt/x;->c:Lr/w;

    iget-object v3, p0, Lt/x;->d:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lt/y;->b(Lt/y$b;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
