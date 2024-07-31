.class public final Lr/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/f$a;
    }
.end annotation


# instance fields
.field private final a:Lr/f$a;


# direct methods
.method public constructor <init>(ILandroid/view/Surface;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    new-instance v0, Lr/m;

    invoke-direct {v0, p1, p2}, Lr/m;-><init>(ILandroid/view/Surface;)V

    :goto_0
    iput-object v0, p0, Lr/f;->a:Lr/f$a;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, Lr/l;

    invoke-direct {v0, p1, p2}, Lr/l;-><init>(ILandroid/view/Surface;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    new-instance v0, Lr/j;

    invoke-direct {v0, p1, p2}, Lr/j;-><init>(ILandroid/view/Surface;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lr/g;

    invoke-direct {v0, p1, p2}, Lr/g;-><init>(ILandroid/view/Surface;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method private constructor <init>(Lr/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/f;->a:Lr/f$a;

    return-void
.end method

.method public static i(Ljava/lang/Object;)Lr/f;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_1

    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {p0}, Lr/m;->l(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/m;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {p0}, Lr/l;->k(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/l;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/16 v2, 0x1a

    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    if-lt v1, v2, :cond_3

    invoke-static {p0}, Lr/j;->j(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/j;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lr/g;->i(Landroid/hardware/camera2/params/OutputConfiguration;)Lr/g;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_4

    return-object v0

    :cond_4
    new-instance v0, Lr/f;

    invoke-direct {v0, p0}, Lr/f;-><init>(Lr/f$a;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0, p1}, Lr/f$a;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0}, Lr/f$a;->f()V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0}, Lr/f$a;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0}, Lr/f$a;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public e(J)V
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0, p1, p2}, Lr/f$a;->c(J)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lr/f;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    check-cast p1, Lr/f;

    iget-object p1, p1, Lr/f;->a:Lr/f$a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0, p1}, Lr/f$a;->d(Ljava/lang/String;)V

    return-void
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0, p1, p2}, Lr/f$a;->a(J)V

    return-void
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-interface {v0}, Lr/f$a;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lr/f;->a:Lr/f$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
