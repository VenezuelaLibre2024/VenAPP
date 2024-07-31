.class public Li0/f;
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
        "Li0/d;",
        ">;",
        "Landroidx/camera/core/impl/f1;",
        "Lb0/k;"
    }
.end annotation


# static fields
.field static final H:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final G:Landroidx/camera/core/impl/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.streamSharing.captureTypes"

    const-class v1, Ljava/util/List;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Li0/f;->H:Landroidx/camera/core/impl/n0$a;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/impl/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/f;->G:Landroidx/camera/core/impl/p1;

    return-void
.end method


# virtual methods
.method public W()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Li0/f;->H:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public m()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Li0/f;->G:Landroidx/camera/core/impl/p1;

    return-object v0
.end method
