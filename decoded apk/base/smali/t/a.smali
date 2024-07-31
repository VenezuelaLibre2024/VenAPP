.class public Lt/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/t1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ls/a;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/t1;->b(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object p1

    check-cast p1, Ls/a;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ls/a;->b()Landroid/util/Range;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lt/a;->a:Landroid/util/Range;

    return-void
.end method


# virtual methods
.method public a(Lq/a$a;)V
    .locals 2

    iget-object v0, p0, Lt/a;->a:Landroid/util/Range;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_0
    return-void
.end method
