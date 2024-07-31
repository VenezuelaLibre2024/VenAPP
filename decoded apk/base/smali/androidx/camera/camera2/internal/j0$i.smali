.class abstract Landroidx/camera/camera2/internal/j0$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "i"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/Class;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/camera2/internal/j0$i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Landroidx/camera/core/impl/y1;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroid/util/Size;",
            ")",
            "Landroidx/camera/camera2/internal/j0$i;"
        }
    .end annotation

    new-instance v6, Landroidx/camera/camera2/internal/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Landroidx/camera/camera2/internal/d;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;Landroid/util/Size;)V

    return-object v6
.end method

.method static b(Landroidx/camera/core/w;)Landroidx/camera/camera2/internal/j0$i;
    .locals 4

    invoke-static {p0}, Landroidx/camera/camera2/internal/j0;->N(Landroidx/camera/core/w;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/camera/core/w;->e()Landroid/util/Size;

    move-result-object p0

    invoke-static {v0, v1, v2, v3, p0}, Landroidx/camera/camera2/internal/j0$i;->a(Ljava/lang/String;Ljava/lang/Class;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/camera2/internal/j0$i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method abstract c()Landroidx/camera/core/impl/y1;
.end method

.method abstract d()Landroid/util/Size;
.end method

.method abstract e()Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end method

.method abstract f()Ljava/lang/String;
.end method

.method abstract g()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method
