.class public final synthetic Landroidx/camera/camera2/internal/y3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/t;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/y3;->a:Landroidx/camera/core/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/y3;->a:Landroidx/camera/core/t;

    invoke-virtual {v0}, Landroidx/camera/core/t;->l()V

    return-void
.end method
