.class public final synthetic Landroidx/camera/camera2/internal/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/s0$f;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/s0$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/d1;->a:Landroidx/camera/camera2/internal/s0$f;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/d1;->a:Landroidx/camera/camera2/internal/s0$f;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/s0$f;->d(Landroidx/camera/camera2/internal/s0$f;Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
