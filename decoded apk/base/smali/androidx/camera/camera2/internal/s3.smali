.class public final synthetic Landroidx/camera/camera2/internal/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/u3;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;

.field public final synthetic c:Lw/k1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/u3;Landroidx/concurrent/futures/c$a;Lw/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/s3;->a:Landroidx/camera/camera2/internal/u3;

    iput-object p2, p0, Landroidx/camera/camera2/internal/s3;->b:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Landroidx/camera/camera2/internal/s3;->c:Lw/k1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/s3;->a:Landroidx/camera/camera2/internal/u3;

    iget-object v1, p0, Landroidx/camera/camera2/internal/s3;->b:Landroidx/concurrent/futures/c$a;

    iget-object v2, p0, Landroidx/camera/camera2/internal/s3;->c:Lw/k1;

    invoke-static {v0, v1, v2}, Landroidx/camera/camera2/internal/u3;->d(Landroidx/camera/camera2/internal/u3;Landroidx/concurrent/futures/c$a;Lw/k1;)V

    return-void
.end method
