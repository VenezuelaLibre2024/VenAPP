.class Landroidx/camera/camera2/internal/t2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/t2;->g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/t2;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/t2;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/t2$a;->a:Landroidx/camera/camera2/internal/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "ProcessingCaptureSession"

    const-string v1, "open session failed "

    invoke-static {v0, v1, p1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2$a;->a:Landroidx/camera/camera2/internal/t2;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/t2;->close()V

    iget-object p1, p0, Landroidx/camera/camera2/internal/t2$a;->a:Landroidx/camera/camera2/internal/t2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/t2;->c(Z)Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/t2$a;->b(Ljava/lang/Void;)V

    return-void
.end method
