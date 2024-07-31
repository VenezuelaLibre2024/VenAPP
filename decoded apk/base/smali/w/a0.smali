.class public final synthetic Lw/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/t;

.field public final synthetic b:Landroidx/camera/core/t;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/t;Landroidx/camera/core/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/a0;->a:Landroidx/camera/core/t;

    iput-object p2, p0, Lw/a0;->b:Landroidx/camera/core/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/a0;->a:Landroidx/camera/core/t;

    iget-object v1, p0, Lw/a0;->b:Landroidx/camera/core/t;

    invoke-static {v0, v1}, Landroidx/camera/core/f;->X(Landroidx/camera/core/t;Landroidx/camera/core/t;)V

    return-void
.end method
