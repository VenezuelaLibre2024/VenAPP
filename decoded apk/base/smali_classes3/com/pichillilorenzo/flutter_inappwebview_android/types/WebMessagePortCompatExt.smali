.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private index:I

.field private webMessageChannelId:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    return-void
.end method

.method public static fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "index"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "webMessageChannelId"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v0, p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;-><init>(ILjava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    iget v2, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    return v0
.end method

.method public getWebMessageChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setIndex(I)V
    .locals 0

    iput p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    return-void
.end method

.method public setWebMessageChannelId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

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

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "index"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "webMessageChannelId"

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WebMessagePortCompatExt{index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", webMessageChannelId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/WebMessagePortCompatExt;->webMessageChannelId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
