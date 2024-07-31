.class Landroidx/camera/camera2/internal/d3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/d3;->n(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
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
.field final synthetic a:Landroidx/camera/camera2/internal/d3;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/d3;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/d3$a;->a:Landroidx/camera/camera2/internal/d3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/camera2/internal/d3$a;->a:Landroidx/camera/camera2/internal/d3;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/d3;->e()V

    iget-object p1, p0, Landroidx/camera/camera2/internal/d3$a;->a:Landroidx/camera/camera2/internal/d3;

    iget-object v0, p1, Landroidx/camera/camera2/internal/d3;->b:Landroidx/camera/camera2/internal/a2;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/a2;->j(Landroidx/camera/camera2/internal/x2;)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/d3$a;->b(Ljava/lang/Void;)V

    return-void
.end method
