.class final Landroidx/camera/camera2/internal/j0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/camera2/internal/j0;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/j0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/j0$e;->a:Landroidx/camera/camera2/internal/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$e;->a:Landroidx/camera/camera2/internal/j0;

    iget-object v0, v0, Landroidx/camera/camera2/internal/j0;->e:Landroidx/camera/camera2/internal/j0$g;

    sget-object v1, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/j0$e;->a:Landroidx/camera/camera2/internal/j0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/j0;->h0()V

    :cond_0
    return-void
.end method
