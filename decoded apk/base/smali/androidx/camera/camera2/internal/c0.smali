.class public final synthetic Landroidx/camera/camera2/internal/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/j0;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/j0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/c0;->a:Landroidx/camera/camera2/internal/j0;

    iput-boolean p2, p0, Landroidx/camera/camera2/internal/c0;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/c0;->a:Landroidx/camera/camera2/internal/j0;

    iget-boolean v1, p0, Landroidx/camera/camera2/internal/c0;->b:Z

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/j0;->q(Landroidx/camera/camera2/internal/j0;Z)V

    return-void
.end method
