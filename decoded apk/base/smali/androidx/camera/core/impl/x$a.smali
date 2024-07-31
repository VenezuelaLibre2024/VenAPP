.class final Landroidx/camera/core/impl/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final G:Landroidx/camera/core/impl/b1;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Landroidx/camera/core/impl/b1;->a(Ljava/lang/Object;)Landroidx/camera/core/impl/b1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/x$a;->G:Landroidx/camera/core/impl/b1;

    return-void
.end method


# virtual methods
.method public Q()Landroidx/camera/core/impl/b1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/x$a;->G:Landroidx/camera/core/impl/b1;

    return-object v0
.end method

.method public m()Landroidx/camera/core/impl/n0;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/p1;->X()Landroidx/camera/core/impl/p1;

    move-result-object v0

    return-object v0
.end method
