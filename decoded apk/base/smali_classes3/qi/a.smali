.class public final Lqi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqi/a$a;,
        Lqi/a$b;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Landroid/media/Image;Ljava/nio/ByteBuffer;)V
    .locals 3

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqi/a$a;

    invoke-direct {v0, p1}, Lqi/a$a;-><init>(Landroid/media/Image;)V

    invoke-virtual {v0}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lqi/a$b;->c()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/16 v1, 0x23

    goto :goto_0

    :cond_0
    const/16 v1, 0x11

    :goto_0
    iput v1, p0, Lqi/a;->a:I

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result p1

    mul-int/2addr v1, p1

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    if-lt p1, v1, :cond_1

    invoke-virtual {p2}, Ljava/nio/Buffer;->isReadOnly()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    :cond_2
    iput-object p2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-direct {p0, v0}, Lqi/a;->d(Lqi/a$a;)V

    return-void
.end method

.method private final a(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "slice(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final d(Lqi/a$a;)V
    .locals 5

    invoke-virtual {p1}, Lqi/a$a;->c()Lqi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/a$b;->e()I

    move-result v0

    invoke-virtual {p1}, Lqi/a$a;->c()Lqi/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lqi/a$b;->b()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lqi/a$b;->e()I

    move-result v1

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/a$b;->b()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-virtual {p1}, Lqi/a$a;->c()Lqi/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/a$b;->d()I

    move-result v2

    invoke-virtual {p1}, Lqi/a$a;->c()Lqi/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lqi/a$b;->e()I

    move-result v3

    const/4 v4, 0x0

    if-le v2, v3, :cond_0

    invoke-virtual {p1}, Lqi/a$a;->c()Lqi/a$b;

    move-result-object v2

    iget-object v3, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v2, v3, v4}, Lqi/a;->e(Lqi/a$b;Ljava/nio/ByteBuffer;I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lqi/a$a;->c()Lqi/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :goto_0
    iget v2, p0, Lqi/a;->a:I

    const/16 v3, 0x23

    if-ne v2, v3, :cond_2

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/a$b;->d()I

    move-result v2

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lqi/a$b;->e()I

    move-result v3

    if-le v2, v3, :cond_1

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v2

    iget-object v3, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v2, v3, v0}, Lqi/a;->e(Lqi/a$b;Ljava/nio/ByteBuffer;I)V

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object p1

    iget-object v2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    add-int/2addr v0, v1

    invoke-direct {p0, p1, v2, v0}, Lqi/a;->e(Lqi/a$b;Ljava/nio/ByteBuffer;I)V

    goto/16 :goto_1

    :cond_1
    iget-object v2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    add-int/2addr v0, v1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lqi/a$b;->d()I

    move-result v1

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/a$b;->e()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    if-le v1, v2, :cond_3

    iget-object v1, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-direct {p0, p1, v1, v0}, Lqi/a;->f(Lqi/a$a;Ljava/nio/ByteBuffer;I)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lqi/a$b;->b()I

    move-result v1

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/a$b;->d()I

    move-result v2

    mul-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    if-le v2, v1, :cond_4

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0, v0, v4, v1}, Lqi/a;->a(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v0

    :cond_4
    iget-object v1, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    iget-object v0, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    :goto_1
    iget-object p1, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-void
.end method

.method private final e(Lqi/a$b;Ljava/nio/ByteBuffer;I)V
    .locals 5

    invoke-virtual {p1}, Lqi/a$b;->c()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lqi/a$b;->d()I

    move-result v2

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Lqi/a$b;->b()I

    move-result p3

    :goto_1
    if-ge v1, p3, :cond_1

    mul-int v3, v1, v2

    invoke-virtual {p1}, Lqi/a$b;->e()I

    move-result v4

    invoke-direct {p0, v0, v3, v4}, Lqi/a;->a(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "use removePaddingCompact with pixelStride == 1"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final f(Lqi/a$a;Ljava/nio/ByteBuffer;I)V
    .locals 8

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/a$b;->c()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/a$b;->e()I

    move-result v0

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lqi/a$b;->b()I

    move-result v4

    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object v5

    invoke-virtual {v5}, Lqi/a$b;->d()I

    move-result v5

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sub-int/2addr v4, v2

    :goto_1
    if-ge v1, v4, :cond_1

    invoke-virtual {p1}, Lqi/a$a;->b()Lqi/a$b;

    move-result-object p3

    invoke-virtual {p3}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object p3

    mul-int v6, v1, v5

    mul-int/lit8 v7, v0, 0x2

    invoke-direct {p0, p3, v6, v7}, Lqi/a;->a(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lqi/a$a;->a()Lqi/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lqi/a$b;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    mul-int/2addr v4, v5

    sub-int/2addr v4, v2

    mul-int/2addr v0, v3

    invoke-direct {p0, p1, v4, v0}, Lqi/a;->a(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "use removePaddingNotCompact pixelStride == 2"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lqi/a;->b:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lqi/a;->a:I

    return v0
.end method
