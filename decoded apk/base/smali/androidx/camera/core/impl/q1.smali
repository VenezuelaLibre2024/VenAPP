.class public abstract Landroidx/camera/core/impl/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/q1;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/f;

    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/core/impl/f;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()Landroid/util/Size;
.end method

.method public abstract d()Landroid/view/Surface;
.end method
