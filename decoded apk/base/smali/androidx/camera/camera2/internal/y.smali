.class public final synthetic Landroidx/camera/camera2/internal/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/j0;

.field public final synthetic b:Landroidx/camera/camera2/internal/x1;

.field public final synthetic c:Landroidx/camera/core/impl/r0;

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/j0;Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/y;->a:Landroidx/camera/camera2/internal/j0;

    iput-object p2, p0, Landroidx/camera/camera2/internal/y;->b:Landroidx/camera/camera2/internal/x1;

    iput-object p3, p0, Landroidx/camera/camera2/internal/y;->c:Landroidx/camera/core/impl/r0;

    iput-object p4, p0, Landroidx/camera/camera2/internal/y;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/y;->a:Landroidx/camera/camera2/internal/j0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/y;->b:Landroidx/camera/camera2/internal/x1;

    iget-object v2, p0, Landroidx/camera/camera2/internal/y;->c:Landroidx/camera/core/impl/r0;

    iget-object v3, p0, Landroidx/camera/camera2/internal/y;->d:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/camera2/internal/j0;->v(Landroidx/camera/camera2/internal/j0;Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)V

    return-void
.end method
