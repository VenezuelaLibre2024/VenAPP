.class public interface abstract Landroidx/camera/core/impl/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/u1;


# static fields
.field public static final a:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/l2;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/b1;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/z1;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Landroidx/camera/core/impl/n0$a;
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

    const-string v0, "camerax.core.camera.useCaseConfigFactory"

    const-class v1, Landroidx/camera/core/impl/l2;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/u;->a:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.camera.compatibilityId"

    const-class v1, Landroidx/camera/core/impl/b1;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/u;->b:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.camera.useCaseCombinationRequiredRule"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/u;->c:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.camera.SessionProcessor"

    const-class v1, Landroidx/camera/core/impl/z1;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/u;->d:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.camera.isZslDisabled"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/u;->e:Landroidx/camera/core/impl/n0$a;

    return-void
.end method


# virtual methods
.method public abstract Q()Landroidx/camera/core/impl/b1;
.end method

.method public V(Landroidx/camera/core/impl/z1;)Landroidx/camera/core/impl/z1;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/u;->d:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/z1;

    return-object p1
.end method

.method public j()Landroidx/camera/core/impl/l2;
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/u;->a:Landroidx/camera/core/impl/n0$a;

    sget-object v1, Landroidx/camera/core/impl/l2;->a:Landroidx/camera/core/impl/l2;

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/l2;

    return-object v0
.end method

.method public v()I
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/u;->c:Landroidx/camera/core/impl/n0$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
