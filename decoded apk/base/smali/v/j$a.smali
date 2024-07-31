.class public final Lv/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/z<",
        "Lv/j;",
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

    iput-object v0, p0, Lv/j$a;->a:Landroidx/camera/core/impl/m1;

    return-void
.end method

.method public static synthetic c(Lv/j$a;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lv/j$a;->f(Lv/j$a;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)Z

    move-result p0

    return p0
.end method

.method public static e(Landroidx/camera/core/impl/n0;)Lv/j$a;
    .locals 3

    new-instance v0, Lv/j$a;

    invoke-direct {v0}, Lv/j$a;-><init>()V

    new-instance v1, Lv/i;

    invoke-direct {v1, v0, p0}, Lv/i;-><init>(Lv/j$a;Landroidx/camera/core/impl/n0;)V

    const-string v2, "camera2.captureRequest.option."

    invoke-interface {p0, v2, v1}, Landroidx/camera/core/impl/n0;->c(Ljava/lang/String;Landroidx/camera/core/impl/n0$b;)V

    return-object v0
.end method

.method private static synthetic f(Lv/j$a;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)Z
    .locals 1

    invoke-virtual {p0}, Lv/j$a;->a()Landroidx/camera/core/impl/l1;

    move-result-object p0

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/n0;->h(Landroidx/camera/core/impl/n0$a;)Landroidx/camera/core/impl/n0$c;

    move-result-object v0

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p2, v0, p1}, Landroidx/camera/core/impl/l1;->p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/l1;
    .locals 1

    iget-object v0, p0, Lv/j$a;->a:Landroidx/camera/core/impl/m1;

    return-object v0
.end method

.method public d()Lv/j;
    .locals 2

    new-instance v0, Lv/j;

    iget-object v1, p0, Lv/j$a;->a:Landroidx/camera/core/impl/m1;

    invoke-static {v1}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object v1

    invoke-direct {v0, v1}, Lv/j;-><init>(Landroidx/camera/core/impl/n0;)V

    return-object v0
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/j$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lv/j$a;"
        }
    .end annotation

    invoke-static {p1}, Lq/a;->W(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/n0$a;

    move-result-object p1

    iget-object v0, p0, Lv/j$a;->a:Landroidx/camera/core/impl/m1;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method
