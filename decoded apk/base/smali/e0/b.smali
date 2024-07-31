.class public Le0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    const-class v0, Ld0/d;

    invoke-static {v0}, Ld0/b;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    check-cast v0, Ld0/d;

    if-eqz v0, :cond_1

    sget-object v1, Landroidx/camera/core/impl/l0;->i:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1}, Ld0/d;->e(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b(Landroidx/camera/core/o;)Z
    .locals 1

    invoke-virtual {p0}, Le0/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/o;->getFormat()I

    move-result p1

    const/16 v0, 0x100

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
