.class public final Ldg/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ldg/f;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ldg/f;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ldg/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ldg/f;

    iget v0, p0, Ldg/f;->a:I

    iget v2, p1, Ldg/f;->a:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Ldg/f;->b:I

    iget p1, p1, Ldg/f;->b:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Ldg/f;->a:I

    mul-int/lit16 v0, v0, 0x7fc9

    iget v1, p0, Ldg/f;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ldg/f;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldg/f;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
