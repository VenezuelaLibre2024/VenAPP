.class public final Landroidx/camera/core/impl/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/k2;
.implements Landroidx/camera/core/impl/f1;
.implements Lb0/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/k2<",
        "Landroidx/camera/core/f;",
        ">;",
        "Landroidx/camera/core/impl/f1;",
        "Lb0/k;"
    }
.end annotation


# static fields
.field public static final H:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final I:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Lw/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final M:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final G:Landroidx/camera/core/impl/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.imageAnalysis.backpressureStrategy"

    const-class v1, Landroidx/camera/core/f$b;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c1;->H:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.imageAnalysis.imageQueueDepth"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c1;->I:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.imageAnalysis.imageReaderProxyProvider"

    const-class v1, Lw/l0;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c1;->J:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.imageAnalysis.outputImageFormat"

    const-class v1, Landroidx/camera/core/f$e;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c1;->K:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.imageAnalysis.onePixelShiftEnabled"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c1;->L:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.imageAnalysis.outputImageRotationEnabled"

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c1;->M:Landroidx/camera/core/impl/n0$a;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/c1;->G:Landroidx/camera/core/impl/p1;

    return-void
.end method


# virtual methods
.method public W(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c1;->H:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public X(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c1;->I:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public Y()Lw/l0;
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/c1;->J:Landroidx/camera/core/impl/n0$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/l0;

    return-object v0
.end method

.method public Z(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c1;->L:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public a0(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c1;->K:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public b0(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c1;->M:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public m()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/c1;->G:Landroidx/camera/core/impl/p1;

    return-object v0
.end method

.method public n()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method
