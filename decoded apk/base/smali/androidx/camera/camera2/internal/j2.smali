.class final Landroidx/camera/camera2/internal/j2;
.super Landroidx/camera/camera2/internal/p0;
.source "SourceFile"


# static fields
.field static final c:Landroidx/camera/camera2/internal/j2;


# instance fields
.field private final b:Lt/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/camera/camera2/internal/j2;

    new-instance v1, Lt/k;

    invoke-direct {v1}, Lt/k;-><init>()V

    invoke-direct {v0, v1}, Landroidx/camera/camera2/internal/j2;-><init>(Lt/k;)V

    sput-object v0, Landroidx/camera/camera2/internal/j2;->c:Landroidx/camera/camera2/internal/j2;

    return-void
.end method

.method private constructor <init>(Lt/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/p0;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/j2;->b:Lt/k;

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/l0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/l0$a;",
            ")V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroidx/camera/camera2/internal/p0;->a(Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/l0$a;)V

    instance-of v0, p1, Landroidx/camera/core/impl/d1;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/camera/core/impl/d1;

    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    invoke-virtual {p1}, Landroidx/camera/core/impl/d1;->c0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/camera2/internal/j2;->b:Lt/k;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d1;->X()I

    move-result p1

    invoke-virtual {v1, p1, v0}, Lt/k;->a(ILq/a$a;)V

    :cond_0
    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "config is not ImageCaptureConfig"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
