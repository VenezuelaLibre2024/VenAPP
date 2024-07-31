.class final Lv6/a0;
.super Lv6/z;
.source "SourceFile"


# instance fields
.field private i:[I

.field private j:[I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv6/z;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/nio/ByteBuffer;)V
    .locals 7

    iget-object v0, p0, Lv6/a0;->j:[I

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v2

    sub-int v3, v2, v1

    iget-object v4, p0, Lv6/z;->b:Lv6/i$a;

    iget v4, v4, Lv6/i$a;->d:I

    div-int/2addr v3, v4

    iget-object v4, p0, Lv6/z;->c:Lv6/i$a;

    iget v4, v4, Lv6/i$a;->d:I

    mul-int/2addr v3, v4

    invoke-virtual {p0, v3}, Lv6/z;->l(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    :goto_0
    if-ge v1, v2, :cond_1

    array-length v4, v0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_0

    aget v6, v0, v5

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v1

    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v6

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lv6/z;->b:Lv6/i$a;

    iget v4, v4, Lv6/i$a;->d:I

    add-int/2addr v1, v4

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method

.method public h(Lv6/i$a;)Lv6/i$a;
    .locals 8

    iget-object v0, p0, Lv6/a0;->i:[I

    if-nez v0, :cond_0

    sget-object p1, Lv6/i$a;->e:Lv6/i$a;

    return-object p1

    :cond_0
    iget v1, p1, Lv6/i$a;->c:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    iget v1, p1, Lv6/i$a;->b:I

    array-length v3, v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    move v1, v5

    :goto_0
    move v3, v5

    :goto_1
    array-length v6, v0

    if-ge v3, v6, :cond_4

    aget v6, v0, v3

    iget v7, p1, Lv6/i$a;->b:I

    if-ge v6, v7, :cond_3

    if-eq v6, v3, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v5

    :goto_2
    or-int/2addr v1, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Lv6/i$b;

    invoke-direct {v0, p1}, Lv6/i$b;-><init>(Lv6/i$a;)V

    throw v0

    :cond_4
    if-eqz v1, :cond_5

    new-instance v1, Lv6/i$a;

    iget p1, p1, Lv6/i$a;->a:I

    array-length v0, v0

    invoke-direct {v1, p1, v0, v2}, Lv6/i$a;-><init>(III)V

    goto :goto_3

    :cond_5
    sget-object v1, Lv6/i$a;->e:Lv6/i$a;

    :goto_3
    return-object v1

    :cond_6
    new-instance v0, Lv6/i$b;

    invoke-direct {v0, p1}, Lv6/i$b;-><init>(Lv6/i$a;)V

    throw v0
.end method

.method protected i()V
    .locals 1

    iget-object v0, p0, Lv6/a0;->i:[I

    iput-object v0, p0, Lv6/a0;->j:[I

    return-void
.end method

.method protected k()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lv6/a0;->j:[I

    iput-object v0, p0, Lv6/a0;->i:[I

    return-void
.end method

.method public m([I)V
    .locals 0

    iput-object p1, p0, Lv6/a0;->i:[I

    return-void
.end method
