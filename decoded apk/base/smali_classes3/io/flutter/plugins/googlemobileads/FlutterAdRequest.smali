.class Lio/flutter/plugins/googlemobileads/FlutterAdRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;
    }
.end annotation


# instance fields
.field private final adMobExtras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final contentUrl:Ljava/lang/String;

.field private final httpTimeoutMillis:Ljava/lang/Integer;

.field private final keywords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mediationExtras:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;",
            ">;"
        }
    .end annotation
.end field

.field private final mediationExtrasIdentifier:Ljava/lang/String;

.field private final mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

.field private final neighboringContentUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nonPersonalizedAds:Ljava/lang/Boolean;

.field private final requestAgent:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    iput-object p6, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    iput-object p7, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    iput-object p8, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    iput-object p9, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->requestAgent:Ljava/lang/String;

    iput-object p10, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    return-void
.end method

.method private addNetworkExtras(Lx8/a;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lx8/a<",
            "TT;>;>(",
            "Lx8/a<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;->getMediationExtras()Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Class;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    invoke-interface {v1, p2, v2}, Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;->getMediationExtras(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_1
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    if-nez p2, :cond_4

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    :cond_4
    const-string v2, "npa"

    const-string v3, "1"

    invoke-virtual {p2, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {p1, v1, v0}, Lx8/a;->b(Ljava/lang/Class;Landroid/os/Bundle;)Lx8/a;

    goto :goto_2

    :cond_6
    return-void
.end method


# virtual methods
.method asAdRequest(Ljava/lang/String;)Lx8/h;
    .locals 1

    new-instance v0, Lx8/h$a;

    invoke-direct {v0}, Lx8/h$a;-><init>()V

    invoke-virtual {p0, v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->updateAdRequestBuilder(Lx8/a;Ljava/lang/String;)Lx8/a;

    move-result-object p1

    check-cast p1, Lx8/h$a;

    invoke-virtual {p1}, Lx8/h$a;->k()Lx8/h;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    iget-object p1, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method protected getAdMobExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    return-object v0
.end method

.method protected getContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method protected getHttpTimeoutMillis()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    return-object v0
.end method

.method protected getKeywords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    return-object v0
.end method

.method protected getMediationExtras()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    return-object v0
.end method

.method protected getMediationExtrasIdentifier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method protected getNeighboringContentUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    return-object v0
.end method

.method protected getNonPersonalizedAds()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    return-object v0
.end method

.method protected getRequestAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->requestAgent:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected updateAdRequestBuilder(Lx8/a;Ljava/lang/String;)Lx8/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lx8/a<",
            "TT;>;>(",
            "Lx8/a<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lx8/a<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lx8/a;->a(Ljava/lang/String;)Lx8/a;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Lx8/a;->d(Ljava/lang/String;)Lx8/a;

    :cond_1
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->addNetworkExtras(Lx8/a;Ljava/lang/String;)V

    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-virtual {p1, p2}, Lx8/a;->f(Ljava/util/List;)Lx8/a;

    :cond_2
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lx8/a;->e(I)Lx8/a;

    :cond_3
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->requestAgent:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lx8/a;->g(Ljava/lang/String;)Lx8/a;

    return-object p1
.end method
