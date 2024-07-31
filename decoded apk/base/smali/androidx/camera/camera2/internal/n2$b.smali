.class Landroidx/camera/camera2/internal/n2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/k2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/n2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/k2<",
        "Landroidx/camera/core/w;",
        ">;"
    }
.end annotation


# instance fields
.field private final G:Landroidx/camera/core/impl/n0;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k2;->t:Landroidx/camera/core/impl/n0$a;

    new-instance v2, Landroidx/camera/camera2/internal/j1;

    invoke-direct {v2}, Landroidx/camera/camera2/internal/j1;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/n2$b;->G:Landroidx/camera/core/impl/n0;

    return-void
.end method


# virtual methods
.method public N()Landroidx/camera/core/impl/l2$b;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/l2$b;->METERING_REPEATING:Landroidx/camera/core/impl/l2$b;

    return-object v0
.end method

.method public m()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/n2$b;->G:Landroidx/camera/core/impl/n0;

    return-object v0
.end method
