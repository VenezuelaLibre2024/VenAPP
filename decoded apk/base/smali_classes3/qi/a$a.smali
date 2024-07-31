.class final Lqi/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lqi/a$b;

.field private final d:Lqi/a$b;

.field private final e:Lqi/a$b;


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 10

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v0

    iput v0, p0, Lqi/a$a;->a:I

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v1

    iput v1, p0, Lqi/a$a;->b:I

    new-instance v2, Lqi/a$b;

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const-string v5, "get(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0, v1, v3}, Lqi/a$b;-><init>(IILandroid/media/Image$Plane;)V

    iput-object v2, p0, Lqi/a$a;->c:Lqi/a$b;

    new-instance v3, Lqi/a$b;

    div-int/lit8 v6, v0, 0x2

    div-int/lit8 v7, v1, 0x2

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v8

    const/4 v9, 0x1

    aget-object v8, v8, v9

    invoke-static {v8, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v6, v7, v8}, Lqi/a$b;-><init>(IILandroid/media/Image$Plane;)V

    iput-object v3, p0, Lqi/a$a;->d:Lqi/a$b;

    new-instance v6, Lqi/a$b;

    const/4 v7, 0x2

    div-int/2addr v0, v7

    div-int/2addr v1, v7

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    aget-object p1, p1, v7

    invoke-static {p1, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0, v1, p1}, Lqi/a$b;-><init>(IILandroid/media/Image$Plane;)V

    iput-object v6, p0, Lqi/a$a;->e:Lqi/a$b;

    invoke-virtual {v2}, Lqi/a$b;->c()I

    move-result p1

    if-ne p1, v9, :cond_0

    move p1, v9

    goto :goto_0

    :cond_0
    move p1, v4

    :goto_0
    if-eqz p1, :cond_6

    invoke-virtual {v3}, Lqi/a$b;->c()I

    move-result p1

    invoke-virtual {v6}, Lqi/a$b;->c()I

    move-result v0

    if-ne p1, v0, :cond_1

    invoke-virtual {v3}, Lqi/a$b;->d()I

    move-result p1

    invoke-virtual {v6}, Lqi/a$b;->d()I

    move-result v0

    if-ne p1, v0, :cond_1

    move p1, v9

    goto :goto_1

    :cond_1
    move p1, v4

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {v3}, Lqi/a$b;->c()I

    move-result p1

    if-eq p1, v9, :cond_2

    invoke-virtual {v3}, Lqi/a$b;->c()I

    move-result p1

    if-ne p1, v7, :cond_3

    :cond_2
    move v4, v9

    :cond_3
    if-eqz v4, :cond_4

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Supported pixel strides for U and V planes are 1 and 2"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "U and V planes must have the same pixel and row strides but got pixel="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lqi/a$b;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " row="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lqi/a$b;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " for U and pixel="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lqi/a$b;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and row="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lqi/a$b;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " for V"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Pixel stride for Y plane must be 1 but got "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lqi/a$b;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " instead."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lqi/a$b;
    .locals 1

    iget-object v0, p0, Lqi/a$a;->d:Lqi/a$b;

    return-object v0
.end method

.method public final b()Lqi/a$b;
    .locals 1

    iget-object v0, p0, Lqi/a$a;->e:Lqi/a$b;

    return-object v0
.end method

.method public final c()Lqi/a$b;
    .locals 1

    iget-object v0, p0, Lqi/a$a;->c:Lqi/a$b;

    return-object v0
.end method
