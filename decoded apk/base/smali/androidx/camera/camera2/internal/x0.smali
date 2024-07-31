.class public final synthetic Landroidx/camera/camera2/internal/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/s0$c;

.field public final synthetic b:Landroidx/camera/core/impl/l0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/s0$c;Landroidx/camera/core/impl/l0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/x0;->a:Landroidx/camera/camera2/internal/s0$c;

    iput-object p2, p0, Landroidx/camera/camera2/internal/x0;->b:Landroidx/camera/core/impl/l0$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/x0;->a:Landroidx/camera/camera2/internal/s0$c;

    iget-object v1, p0, Landroidx/camera/camera2/internal/x0;->b:Landroidx/camera/core/impl/l0$a;

    invoke-static {v0, v1, p1}, Landroidx/camera/camera2/internal/s0$c;->a(Landroidx/camera/camera2/internal/s0$c;Landroidx/camera/core/impl/l0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
