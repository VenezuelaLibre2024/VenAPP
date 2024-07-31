.class public final synthetic Landroidx/camera/camera2/internal/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/impl/y1$c;

.field public final synthetic b:Landroidx/camera/core/impl/y1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/y1$c;Landroidx/camera/core/impl/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/e0;->a:Landroidx/camera/core/impl/y1$c;

    iput-object p2, p0, Landroidx/camera/camera2/internal/e0;->b:Landroidx/camera/core/impl/y1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/e0;->a:Landroidx/camera/core/impl/y1$c;

    iget-object v1, p0, Landroidx/camera/camera2/internal/e0;->b:Landroidx/camera/core/impl/y1;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/j0;->w(Landroidx/camera/core/impl/y1$c;Landroidx/camera/core/impl/y1;)V

    return-void
.end method
