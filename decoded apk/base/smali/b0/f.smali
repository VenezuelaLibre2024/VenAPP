.class public abstract Lb0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(FFFF)Lw/k1;
    .locals 1

    new-instance v0, Lb0/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lb0/a;-><init>(FFFF)V

    return-object v0
.end method

.method public static f(Lw/k1;)Lw/k1;
    .locals 4

    new-instance v0, Lb0/a;

    invoke-interface {p0}, Lw/k1;->d()F

    move-result v1

    invoke-interface {p0}, Lw/k1;->a()F

    move-result v2

    invoke-interface {p0}, Lw/k1;->c()F

    move-result v3

    invoke-interface {p0}, Lw/k1;->b()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lb0/a;-><init>(FFFF)V

    return-object v0
.end method


# virtual methods
.method public abstract a()F
.end method

.method public abstract b()F
.end method

.method public abstract c()F
.end method

.method public abstract d()F
.end method
