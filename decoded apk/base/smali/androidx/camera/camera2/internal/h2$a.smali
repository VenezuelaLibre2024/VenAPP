.class Landroidx/camera/camera2/internal/h2$a;
.super Landroidx/camera/core/impl/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/h2;->r(Landroidx/concurrent/futures/c$a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Landroidx/camera/camera2/internal/h2;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/h2;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/h2$a;->b:Landroidx/camera/camera2/internal/h2;

    iput-object p2, p0, Landroidx/camera/camera2/internal/h2$a;->a:Landroidx/concurrent/futures/c$a;

    invoke-direct {p0}, Landroidx/camera/core/impl/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2$a;->a:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    new-instance v1, Lw/j$a;

    const-string v2, "Camera is closed"

    invoke-direct {v1, v2}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public b(Landroidx/camera/core/impl/s;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2$a;->a:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c(Landroidx/camera/core/impl/m;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/h2$a;->a:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/impl/y$b;

    invoke-direct {v1, p1}, Landroidx/camera/core/impl/y$b;-><init>(Landroidx/camera/core/impl/m;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method
