.class public final synthetic Ly/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly/v0;

.field public final synthetic b:Landroidx/camera/core/n$h;


# direct methods
.method public synthetic constructor <init>(Ly/v0;Landroidx/camera/core/n$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/t0;->a:Ly/v0;

    iput-object p2, p0, Ly/t0;->b:Landroidx/camera/core/n$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly/t0;->a:Ly/v0;

    iget-object v1, p0, Ly/t0;->b:Landroidx/camera/core/n$h;

    invoke-static {v0, v1}, Ly/v0;->b(Ly/v0;Landroidx/camera/core/n$h;)V

    return-void
.end method
