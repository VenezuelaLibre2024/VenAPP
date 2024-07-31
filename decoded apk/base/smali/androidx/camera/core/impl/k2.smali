.class public interface abstract Landroidx/camera/core/impl/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/j;
.implements Lb0/l;
.implements Landroidx/camera/core/impl/e1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/k2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/camera/core/w;",
        ">",
        "Ljava/lang/Object;",
        "Lb0/j<",
        "TT;>;",
        "Lb0/l;",
        "Landroidx/camera/core/impl/e1;"
    }
.end annotation


# static fields
.field public static final A:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/y1;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/y1$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/l0$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Lw/p;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final y:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.useCase.defaultSessionConfig"

    const-class v1, Landroidx/camera/core/impl/y1;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->r:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.defaultCaptureConfig"

    const-class v1, Landroidx/camera/core/impl/l0;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->s:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.sessionConfigUnpacker"

    const-class v1, Landroidx/camera/core/impl/y1$d;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->t:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.captureConfigUnpacker"

    const-class v1, Landroidx/camera/core/impl/l0$b;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->u:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.surfaceOccupancyPriority"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->v:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.cameraSelector"

    const-class v1, Lw/p;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->w:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.targetFrameRate"

    const-class v1, Landroid/util/Range;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->x:Landroidx/camera/core/impl/n0$a;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.useCase.zslDisabled"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/k2;->y:Landroidx/camera/core/impl/n0$a;

    const-string v1, "camerax.core.useCase.highResolutionDisabled"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->z:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.useCase.captureType"

    const-class v1, Landroidx/camera/core/impl/l2$b;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k2;->A:Landroidx/camera/core/impl/n0$a;

    return-void
.end method


# virtual methods
.method public A(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->v:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public F(Lw/p;)Lw/p;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->w:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/p;

    return-object p1
.end method

.method public I(Z)Z
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->z:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public K(Z)Z
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->y:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public L()I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->v:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public N()Landroidx/camera/core/impl/l2$b;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->A:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/l2$b;

    return-object v0
.end method

.method public T(Landroidx/camera/core/impl/y1$d;)Landroidx/camera/core/impl/y1$d;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->t:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/y1$d;

    return-object p1
.end method

.method public o(Landroidx/camera/core/impl/y1;)Landroidx/camera/core/impl/y1;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->r:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/y1;

    return-object p1
.end method

.method public q(Landroidx/camera/core/impl/l0$b;)Landroidx/camera/core/impl/l0$b;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->u:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/l0$b;

    return-object p1
.end method

.method public s(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k2;->s:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/l0;

    return-object p1
.end method

.method public x(Landroid/util/Range;)Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/impl/k2;->x:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Range;

    return-object p1
.end method
