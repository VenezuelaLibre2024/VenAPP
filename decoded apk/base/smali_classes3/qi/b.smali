.class public final Lqi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/renderscript/RenderScript;

.field private final b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

.field private c:Ljava/nio/ByteBuffer;

.field private d:[B

.field private e:Landroid/renderscript/Allocation;

.field private f:Landroid/renderscript/Allocation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p1

    iput-object p1, p0, Lqi/b;->a:Landroid/renderscript/RenderScript;

    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    move-result-object p1

    iput-object p1, p0, Lqi/b;->b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    const/4 p1, 0x0

    new-array p1, p1, [B

    iput-object p1, p0, Lqi/b;->d:[B

    return-void
.end method

.method private final a(Landroid/media/Image;Lqi/a;)Z
    .locals 2

    iget-object v0, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v0

    invoke-virtual {v0}, Landroid/renderscript/Type;->getX()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v0

    invoke-virtual {v0}, Landroid/renderscript/Type;->getY()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result p1

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object p1

    invoke-virtual {p1}, Landroid/renderscript/Type;->getYuv()I

    move-result p1

    invoke-virtual {p2}, Lqi/a;->c()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lqi/b;->d:[B

    array-length p1, p1

    invoke-virtual {p2}, Lqi/a;->b()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public final declared-synchronized b(Landroid/media/Image;Landroid/graphics/Bitmap;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqi/a;

    iget-object v1, p0, Lqi/b;->c:Ljava/nio/ByteBuffer;

    invoke-direct {v0, p1, v1}, Lqi/a;-><init>(Landroid/media/Image;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Lqi/a;->b()Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lqi/b;->c:Ljava/nio/ByteBuffer;

    invoke-direct {p0, p1, v0}, Lqi/b;->a(Landroid/media/Image;Lqi/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/renderscript/Type$Builder;

    iget-object v2, p0, Lqi/b;->a:Landroid/renderscript/RenderScript;

    invoke-static {v2}, Landroid/renderscript/Element;->U8(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/renderscript/Type$Builder;-><init>(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setX(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setY(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    invoke-virtual {v0}, Lqi/a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setYuvFormat(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    iget-object v2, p0, Lqi/b;->a:Landroid/renderscript/RenderScript;

    invoke-virtual {v1}, Landroid/renderscript/Type$Builder;->create()Landroid/renderscript/Type;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v2, v1, v3}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;I)Landroid/renderscript/Allocation;

    move-result-object v1

    iput-object v1, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    invoke-virtual {v0}, Lqi/a;->b()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Lqi/b;->d:[B

    new-instance v1, Landroid/renderscript/Type$Builder;

    iget-object v2, p0, Lqi/b;->a:Landroid/renderscript/RenderScript;

    invoke-static {v2}, Landroid/renderscript/Element;->RGBA_8888(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Landroid/renderscript/Type$Builder;-><init>(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setX(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/renderscript/Type$Builder;->setY(I)Landroid/renderscript/Type$Builder;

    move-result-object p1

    iget-object v1, p0, Lqi/b;->a:Landroid/renderscript/RenderScript;

    invoke-virtual {p1}, Landroid/renderscript/Type$Builder;->create()Landroid/renderscript/Type;

    move-result-object p1

    invoke-static {v1, p1, v3}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;I)Landroid/renderscript/Allocation;

    move-result-object p1

    iput-object p1, p0, Lqi/b;->f:Landroid/renderscript/Allocation;

    :cond_0
    invoke-virtual {v0}, Lqi/a;->b()Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Lqi/b;->d:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lqi/b;->d:[B

    invoke-virtual {p1, v0}, Landroid/renderscript/Allocation;->copyFrom([B)V

    iget-object p1, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lqi/b;->d:[B

    invoke-virtual {p1, v0}, Landroid/renderscript/Allocation;->copyFrom([B)V

    iget-object p1, p0, Lqi/b;->b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v0, p0, Lqi/b;->e:Landroid/renderscript/Allocation;

    invoke-virtual {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->setInput(Landroid/renderscript/Allocation;)V

    iget-object p1, p0, Lqi/b;->b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v0, p0, Lqi/b;->f:Landroid/renderscript/Allocation;

    invoke-virtual {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->forEach(Landroid/renderscript/Allocation;)V

    iget-object p1, p0, Lqi/b;->f:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
