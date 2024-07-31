.class public abstract Landroidx/camera/core/impl/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/d2$b;,
        Landroidx/camera/core/impl/d2$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/i;

    const-wide/16 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Landroidx/camera/core/impl/i;-><init>(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)V

    return-object v0
.end method

.method public static b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/i;

    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/camera/core/impl/i;-><init>(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)V

    return-object v0
.end method

.method public static e(I)Landroidx/camera/core/impl/d2$b;
    .locals 1

    const/16 v0, 0x23

    if-ne p0, v0, :cond_0

    sget-object p0, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    return-object p0

    :cond_0
    const/16 v0, 0x100

    if-ne p0, v0, :cond_1

    sget-object p0, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    return-object p0

    :cond_1
    const/16 v0, 0x20

    if-ne p0, v0, :cond_2

    sget-object p0, Landroidx/camera/core/impl/d2$b;->RAW:Landroidx/camera/core/impl/d2$b;

    return-object p0

    :cond_2
    sget-object p0, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    return-object p0
.end method

.method public static h(IILandroid/util/Size;Landroidx/camera/core/impl/e2;)Landroidx/camera/core/impl/d2;
    .locals 3

    invoke-static {p1}, Landroidx/camera/core/impl/d2;->e(I)Landroidx/camera/core/impl/d2$b;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/d2$a;->NOT_SUPPORT:Landroidx/camera/core/impl/d2$a;

    invoke-static {p2}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p2

    const/4 v2, 0x1

    if-ne p0, v2, :cond_1

    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/e2;->i(I)Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_0

    sget-object v1, Landroidx/camera/core/impl/d2$a;->s720p:Landroidx/camera/core/impl/d2$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/e2;->g(I)Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_6

    sget-object v1, Landroidx/camera/core/impl/d2$a;->s1440p:Landroidx/camera/core/impl/d2$a;

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Landroidx/camera/core/impl/e2;->b()Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_2

    sget-object v1, Landroidx/camera/core/impl/d2$a;->VGA:Landroidx/camera/core/impl/d2$a;

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Landroidx/camera/core/impl/e2;->e()Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_3

    sget-object v1, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    goto :goto_0

    :cond_3
    invoke-virtual {p3}, Landroidx/camera/core/impl/e2;->f()Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_4

    sget-object v1, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    goto :goto_0

    :cond_4
    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/e2;->c(I)Landroid/util/Size;

    move-result-object p0

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_5

    sget-object v1, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    goto :goto_0

    :cond_5
    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/e2;->k(I)Landroid/util/Size;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Lf0/d;->a(Landroid/util/Size;)I

    move-result p0

    if-gt p2, p0, :cond_6

    sget-object v1, Landroidx/camera/core/impl/d2$a;->ULTRA_MAXIMUM:Landroidx/camera/core/impl/d2$a;

    :cond_6
    :goto_0
    invoke-static {v0, v1}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c()Landroidx/camera/core/impl/d2$a;
.end method

.method public abstract d()Landroidx/camera/core/impl/d2$b;
.end method

.method public abstract f()J
.end method

.method public final g(Landroidx/camera/core/impl/d2;)Z
    .locals 2

    invoke-virtual {p1}, Landroidx/camera/core/impl/d2;->d()Landroidx/camera/core/impl/d2$b;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/d2;->c()Landroidx/camera/core/impl/d2$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/d2$a;->h()I

    move-result p1

    invoke-virtual {p0}, Landroidx/camera/core/impl/d2;->c()Landroidx/camera/core/impl/d2$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/d2$a;->h()I

    move-result v1

    if-gt p1, v1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/d2;->d()Landroidx/camera/core/impl/d2$b;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
