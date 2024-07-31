.class public final synthetic Landroidx/camera/camera2/internal/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/j0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/camera/core/impl/y1;

.field public final synthetic d:Landroidx/camera/core/impl/k2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/f0;->a:Landroidx/camera/camera2/internal/j0;

    iput-object p2, p0, Landroidx/camera/camera2/internal/f0;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/camera/camera2/internal/f0;->c:Landroidx/camera/core/impl/y1;

    iput-object p4, p0, Landroidx/camera/camera2/internal/f0;->d:Landroidx/camera/core/impl/k2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/f0;->a:Landroidx/camera/camera2/internal/j0;

    iget-object v1, p0, Landroidx/camera/camera2/internal/f0;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/camera2/internal/f0;->c:Landroidx/camera/core/impl/y1;

    iget-object v3, p0, Landroidx/camera/camera2/internal/f0;->d:Landroidx/camera/core/impl/k2;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/camera2/internal/j0;->u(Landroidx/camera/camera2/internal/j0;Ljava/lang/String;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V

    return-void
.end method
