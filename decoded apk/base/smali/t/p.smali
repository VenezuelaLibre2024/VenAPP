.class public Lt/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/util/Rational;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Rational;

    const/16 v1, 0x10

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Landroid/util/Rational;-><init>(II)V

    sput-object v0, Lt/p;->a:Landroid/util/Rational;

    return-void
.end method

.method private static a(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 2

    new-instance v0, Landroid/util/Rational;

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    invoke-direct {v0, v1, p0}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b(Landroid/util/Size;Landroidx/camera/core/impl/y1$b;)V
    .locals 2

    const-class v0, Ls/c0;

    invoke-static {v0}, Ls/l;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    check-cast v0, Ls/c0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lt/p;->a:Landroid/util/Rational;

    invoke-static {p0, v0}, Lt/p;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    new-instance p0, Lq/a$a;

    invoke-direct {p0}, Lq/a$a;-><init>()V

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    invoke-virtual {p0}, Lq/a$a;->c()Lq/a;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    return-void
.end method