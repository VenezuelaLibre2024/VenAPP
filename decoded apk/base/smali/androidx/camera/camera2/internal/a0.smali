.class public final synthetic Landroidx/camera/camera2/internal/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/j0;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/j0;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/a0;->a:Landroidx/camera/camera2/internal/j0;

    iput-object p2, p0, Landroidx/camera/camera2/internal/a0;->b:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/a0;->a:Landroidx/camera/camera2/internal/j0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/a0;->b:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/j0;->o(Landroidx/camera/camera2/internal/j0;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
