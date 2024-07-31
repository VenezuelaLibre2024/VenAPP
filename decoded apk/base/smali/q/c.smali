.class public final Lq/c;
.super Landroidx/camera/core/impl/k1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/camera/core/impl/k1<",
        "Lq/b;",
        ">;"
    }
.end annotation


# direct methods
.method public varargs constructor <init>([Lq/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/impl/k1;-><init>()V

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/k1;->a(Ljava/util/List;)V

    return-void
.end method

.method public static e()Lq/c;
    .locals 2

    new-instance v0, Lq/c;

    const/4 v1, 0x0

    new-array v1, v1, [Lq/b;

    invoke-direct {v0, v1}, Lq/c;-><init>([Lq/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Landroidx/camera/core/impl/k1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/k1<",
            "Lq/b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/impl/k1;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/k1;->a(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq/c;->b()Landroidx/camera/core/impl/k1;

    move-result-object v0

    return-object v0
.end method

.method public d()Lq/c$a;
    .locals 2

    new-instance v0, Lq/c$a;

    invoke-virtual {p0}, Landroidx/camera/core/impl/k1;->c()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lq/c$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method
