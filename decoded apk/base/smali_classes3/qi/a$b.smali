.class final Lqi/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/nio/ByteBuffer;

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(IILandroid/media/Image$Plane;)V
    .locals 1

    const-string v0, "plane"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lqi/a$b;->a:I

    iput p2, p0, Lqi/a$b;->b:I

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "getBuffer(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lqi/a$b;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result p1

    iput p1, p0, Lqi/a$b;->d:I

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result p1

    iput p1, p0, Lqi/a$b;->e:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lqi/a$b;->c:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lqi/a$b;->b:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lqi/a$b;->e:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lqi/a$b;->d:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lqi/a$b;->a:I

    return v0
.end method
