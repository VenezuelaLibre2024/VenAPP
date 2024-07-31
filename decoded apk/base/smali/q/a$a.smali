.class public final Lq/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/z<",
        "Lq/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/core/impl/m1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    iput-object v0, p0, Lq/a$a;->a:Landroidx/camera/core/impl/m1;

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/l1;
    .locals 1

    iget-object v0, p0, Lq/a$a;->a:Landroidx/camera/core/impl/m1;

    return-object v0
.end method

.method public c()Lq/a;
    .locals 2

    new-instance v0, Lq/a;

    iget-object v1, p0, Lq/a$a;->a:Landroidx/camera/core/impl/m1;

    invoke-static {v1}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object v1

    invoke-direct {v0, v1}, Lq/a;-><init>(Landroidx/camera/core/impl/n0;)V

    return-object v0
.end method

.method public d(Landroidx/camera/core/impl/n0;)Lq/a$a;
    .locals 4

    invoke-interface {p1}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$a;

    iget-object v2, p0, Lq/a$a;->a:Landroidx/camera/core/impl/m1;

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lq/a$a;"
        }
    .end annotation

    invoke-static {p1}, Lq/a;->W(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/n0$a;

    move-result-object p1

    iget-object v0, p0, Lq/a$a;->a:Landroidx/camera/core/impl/m1;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method
