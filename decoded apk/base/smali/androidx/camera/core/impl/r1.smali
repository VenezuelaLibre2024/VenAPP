.class public final Landroidx/camera/core/impl/r1;
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
        "Landroidx/camera/core/s;",
        ">;",
        "Landroidx/camera/core/impl/f1;",
        "Lb0/k;"
    }
.end annotation


# instance fields
.field private final G:Landroidx/camera/core/impl/p1;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/r1;->G:Landroidx/camera/core/impl/p1;

    return-void
.end method


# virtual methods
.method public m()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/r1;->G:Landroidx/camera/core/impl/p1;

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
