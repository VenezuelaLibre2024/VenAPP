.class public final synthetic Landroidx/camera/camera2/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/impl/k;

.field public final synthetic b:Landroidx/camera/core/impl/s;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/t;->a:Landroidx/camera/core/impl/k;

    iput-object p2, p0, Landroidx/camera/camera2/internal/t;->b:Landroidx/camera/core/impl/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/t;->a:Landroidx/camera/core/impl/k;

    iget-object v1, p0, Landroidx/camera/camera2/internal/t;->b:Landroidx/camera/core/impl/s;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/u$a;->d(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/s;)V

    return-void
.end method
