.class public final Lr/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/b$a;
    }
.end annotation


# instance fields
.field private final a:Lr/b$a;


# direct methods
.method constructor <init>(Lr/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/b;->a:Lr/b$a;

    return-void
.end method

.method public static a(Landroidx/camera/camera2/internal/compat/d0;)Lr/b;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/params/DynamicRangeProfiles;

    invoke-static {p0}, Lr/b;->e(Landroid/hardware/camera2/params/DynamicRangeProfiles;)Lr/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lr/d;->a:Lr/b;

    :cond_1
    return-object p0
.end method

.method public static e(Landroid/hardware/camera2/params/DynamicRangeProfiles;)Lr/b;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    new-instance v0, Lr/b;

    new-instance v1, Lr/c;

    invoke-direct {v1, p0}, Lr/c;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lr/b;-><init>(Lr/b$a;)V

    return-object v0
.end method


# virtual methods
.method public b(Lw/y;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/y;",
            ")",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lr/b;->a:Lr/b$a;

    invoke-interface {v0, p1}, Lr/b$a;->b(Lw/y;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lr/b;->a:Lr/b$a;

    invoke-interface {v0}, Lr/b$a;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/hardware/camera2/params/DynamicRangeProfiles;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Lr/b;->a:Lr/b$a;

    invoke-interface {v0}, Lr/b$a;->a()Landroid/hardware/camera2/params/DynamicRangeProfiles;

    move-result-object v0

    return-object v0
.end method
