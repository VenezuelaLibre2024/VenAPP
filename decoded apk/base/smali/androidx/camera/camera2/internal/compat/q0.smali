.class public final synthetic Landroidx/camera/camera2/internal/compat/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/compat/r0$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/compat/r0$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/q0;->a:Landroidx/camera/camera2/internal/compat/r0$a;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/q0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/q0;->a:Landroidx/camera/camera2/internal/compat/r0$a;

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/q0;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/compat/r0$a;->b(Landroidx/camera/camera2/internal/compat/r0$a;Ljava/lang/String;)V

    return-void
.end method
