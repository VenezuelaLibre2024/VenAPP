.class public final synthetic Landroidx/camera/camera2/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/u;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/m;->a:Landroidx/camera/camera2/internal/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/m;->a:Landroidx/camera/camera2/internal/u;

    invoke-static {v0}, Landroidx/camera/camera2/internal/u;->n(Landroidx/camera/camera2/internal/u;)V

    return-void
.end method