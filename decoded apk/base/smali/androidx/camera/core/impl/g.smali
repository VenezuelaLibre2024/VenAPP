.class final Landroidx/camera/core/impl/g;
.super Landroidx/camera/core/impl/y1$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/g$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/core/impl/r0;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Lw/y;


# direct methods
.method private constructor <init>(Landroidx/camera/core/impl/r0;Ljava/util/List;Ljava/lang/String;ILw/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/r0;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Lw/y;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/camera/core/impl/y1$e;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/g;->a:Landroidx/camera/core/impl/r0;

    iput-object p2, p0, Landroidx/camera/core/impl/g;->b:Ljava/util/List;

    iput-object p3, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/String;

    iput p4, p0, Landroidx/camera/core/impl/g;->d:I

    iput-object p5, p0, Landroidx/camera/core/impl/g;->e:Lw/y;

    return-void
.end method

.method synthetic constructor <init>(Landroidx/camera/core/impl/r0;Ljava/util/List;Ljava/lang/String;ILw/y;Landroidx/camera/core/impl/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/impl/g;-><init>(Landroidx/camera/core/impl/r0;Ljava/util/List;Ljava/lang/String;ILw/y;)V

    return-void
.end method


# virtual methods
.method public b()Lw/y;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/g;->e:Lw/y;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/g;->b:Ljava/util/List;

    return-object v0
.end method

.method public e()Landroidx/camera/core/impl/r0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/g;->a:Landroidx/camera/core/impl/r0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/camera/core/impl/y1$e;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Landroidx/camera/core/impl/y1$e;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->a:Landroidx/camera/core/impl/r0;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->e()Landroidx/camera/core/impl/r0;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget v1, p0, Landroidx/camera/core/impl/g;->d:I

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->f()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Landroidx/camera/core/impl/g;->e:Lw/y;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->b()Lw/y;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw/y;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public f()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/impl/g;->d:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/impl/g;->a:Landroidx/camera/core/impl/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/camera/core/impl/g;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/camera/core/impl/g;->d:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Landroidx/camera/core/impl/g;->e:Lw/y;

    invoke-virtual {v1}, Lw/y;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutputConfig{surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->a:Landroidx/camera/core/impl/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sharedSurfaces="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", physicalCameraId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", surfaceGroupId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/core/impl/g;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dynamicRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->e:Lw/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
