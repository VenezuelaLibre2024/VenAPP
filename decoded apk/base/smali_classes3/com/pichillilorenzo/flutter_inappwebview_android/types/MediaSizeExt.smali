.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private heightMils:I

.field private id:Ljava/lang/String;

.field private label:Ljava/lang/String;

.field private widthMils:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    iput p3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    iput p4, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    return-void
.end method

.method public static fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "id"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "label"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "widthMils"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "heightMils"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

    invoke-direct {v3, v0, v1, v2, p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-object v3
.end method

.method public static fromMediaSize(Landroid/print/PrintAttributes$MediaSize;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

    invoke-virtual {p0}, Landroid/print/PrintAttributes$MediaSize;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroid/print/PrintAttributes$MediaSize;->getHeightMils()I

    move-result v3

    invoke-virtual {p0}, Landroid/print/PrintAttributes$MediaSize;->getWidthMils()I

    move-result p0

    invoke-direct {v1, v2, v0, v3, p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

    iget v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    iget v3, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    iget v3, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_5
    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    move v0, v1

    :goto_0
    return v0

    :cond_7
    :goto_1
    return v1
.end method

.method public getHeightMils()I
    .locals 1

    iget v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getWidthMils()I
    .locals 1

    iget v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    add-int/2addr v0, v1

    return v0
.end method

.method public setHeightMils(I)V
    .locals 0

    iput p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    return-void
.end method

.method public setWidthMils(I)V
    .locals 0

    iput p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    return-void
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "id"

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "label"

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "heightMils"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "widthMils"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toMediaSize()Landroid/print/PrintAttributes$MediaSize;
    .locals 5

    new-instance v0, Landroid/print/PrintAttributes$MediaSize;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    iget v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    iget v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    const-string v4, "Custom"

    invoke-direct {v0, v1, v4, v2, v3}, Landroid/print/PrintAttributes$MediaSize;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaSizeExt{id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", label=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->label:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", widthMils="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->widthMils:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heightMils="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->heightMils:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
