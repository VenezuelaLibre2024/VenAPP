.class public final synthetic Landroidx/camera/camera2/internal/o3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/p3;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/p3;Landroidx/concurrent/futures/c$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/o3;->a:Landroidx/camera/camera2/internal/p3;

    iput-object p2, p0, Landroidx/camera/camera2/internal/o3;->b:Landroidx/concurrent/futures/c$a;

    iput-boolean p3, p0, Landroidx/camera/camera2/internal/o3;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/o3;->a:Landroidx/camera/camera2/internal/p3;

    iget-object v1, p0, Landroidx/camera/camera2/internal/o3;->b:Landroidx/concurrent/futures/c$a;

    iget-boolean v2, p0, Landroidx/camera/camera2/internal/o3;->c:Z

    invoke-static {v0, v1, v2}, Landroidx/camera/camera2/internal/p3;->a(Landroidx/camera/camera2/internal/p3;Landroidx/concurrent/futures/c$a;Z)V

    return-void
.end method
