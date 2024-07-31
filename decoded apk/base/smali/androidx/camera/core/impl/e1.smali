.class public interface abstract Landroidx/camera/core/impl/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/u1;


# static fields
.field public static final f:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Lw/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.imageInput.inputFormat"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.imageInput.inputDynamicRange"

    const-class v1, Lw/y;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/e1;->g:Landroidx/camera/core/impl/n0$a;

    return-void
.end method


# virtual methods
.method public G()Lw/y;
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/e1;->g:Landroidx/camera/core/impl/n0$a;

    sget-object v1, Lw/y;->c:Lw/y;

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/y;

    invoke-static {v0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/y;

    return-object v0
.end method

.method public n()I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
