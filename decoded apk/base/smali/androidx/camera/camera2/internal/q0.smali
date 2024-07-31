.class public final synthetic Landroidx/camera/camera2/internal/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/s0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/s0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/q0;->a:Landroidx/camera/camera2/internal/s0$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/q0;->a:Landroidx/camera/camera2/internal/s0$a;

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/s0$a;->d(Landroidx/camera/camera2/internal/s0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
