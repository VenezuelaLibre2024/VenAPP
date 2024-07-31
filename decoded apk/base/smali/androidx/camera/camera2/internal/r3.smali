.class public final synthetic Landroidx/camera/camera2/internal/r3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/u3;

.field public final synthetic b:Lw/k1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/u3;Lw/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/r3;->a:Landroidx/camera/camera2/internal/u3;

    iput-object p2, p0, Landroidx/camera/camera2/internal/r3;->b:Lw/k1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/r3;->a:Landroidx/camera/camera2/internal/u3;

    iget-object v1, p0, Landroidx/camera/camera2/internal/r3;->b:Lw/k1;

    invoke-static {v0, v1, p1}, Landroidx/camera/camera2/internal/u3;->c(Landroidx/camera/camera2/internal/u3;Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
