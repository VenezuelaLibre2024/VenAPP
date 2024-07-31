.class public abstract Lw/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/h0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroidx/camera/core/impl/f2;JILandroid/graphics/Matrix;)Lw/h0;
    .locals 7

    new-instance v6, Lw/d;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lw/d;-><init>(Landroidx/camera/core/impl/f2;JILandroid/graphics/Matrix;)V

    return-object v6
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/utils/j$b;)V
    .locals 1

    invoke-virtual {p0}, Lw/m0;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/j$b;->m(I)Landroidx/camera/core/impl/utils/j$b;

    return-void
.end method

.method public abstract b()Landroidx/camera/core/impl/f2;
.end method

.method public abstract c()J
.end method

.method public abstract d()I
.end method

.method public abstract f()Landroid/graphics/Matrix;
.end method
