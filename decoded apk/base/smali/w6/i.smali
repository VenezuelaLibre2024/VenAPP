.class public final Lw6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lt6/u1;

.field public final c:Lt6/u1;

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt6/u1;Lt6/u1;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p4, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lt8/a;->a(Z)V

    invoke-static {p1}, Lt8/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw6/i;->a:Ljava/lang/String;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/u1;

    iput-object p1, p0, Lw6/i;->b:Lt6/u1;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/u1;

    iput-object p1, p0, Lw6/i;->c:Lt6/u1;

    iput p4, p0, Lw6/i;->d:I

    iput p5, p0, Lw6/i;->e:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lw6/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lw6/i;

    iget v2, p0, Lw6/i;->d:I

    iget v3, p1, Lw6/i;->d:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lw6/i;->e:I

    iget v3, p1, Lw6/i;->e:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lw6/i;->a:Ljava/lang/String;

    iget-object v3, p1, Lw6/i;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lw6/i;->b:Lt6/u1;

    iget-object v3, p1, Lw6/i;->b:Lt6/u1;

    invoke-virtual {v2, v3}, Lt6/u1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lw6/i;->c:Lt6/u1;

    iget-object p1, p1, Lw6/i;->c:Lt6/u1;

    invoke-virtual {v2, p1}, Lt6/u1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    const/16 v0, 0x20f

    iget v1, p0, Lw6/i;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lw6/i;->e:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw6/i;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw6/i;->b:Lt6/u1;

    invoke-virtual {v1}, Lt6/u1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw6/i;->c:Lt6/u1;

    invoke-virtual {v1}, Lt6/u1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
