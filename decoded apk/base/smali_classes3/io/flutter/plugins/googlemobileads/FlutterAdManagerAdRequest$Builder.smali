.class Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;
.super Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Builder"
.end annotation


# instance fields
.field private customTargeting:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private customTargetingLists:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private publisherProvidedId:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method build()Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;
    .locals 17

    move-object/from16 v0, p0

    new-instance v16, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getKeywords()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getContentUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->customTargeting:Ljava/util/Map;

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->customTargetingLists:Ljava/util/Map;

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getNonPersonalizedAds()Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getNeighboringContentUrls()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getHttpTimeoutMillis()Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->publisherProvidedId:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getMediationExtrasIdentifier()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getMediationNetworkExtrasProvider()Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getAdMobExtras()Ljava/util/Map;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getRequestAgent()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->getMediationExtras()Ljava/util/List;

    move-result-object v14

    const/4 v15, 0x0

    move-object/from16 v1, v16

    invoke-direct/range {v1 .. v15}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$1;)V

    return-object v16
.end method

.method bridge synthetic build()Lio/flutter/plugins/googlemobileads/FlutterAdRequest;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    move-result-object v0

    return-object v0
.end method

.method public setCustomTargeting(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->customTargeting:Ljava/util/Map;

    return-object p0
.end method

.method public setCustomTargetingLists(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->customTargetingLists:Ljava/util/Map;

    return-object p0
.end method

.method public setPublisherProvidedId(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->publisherProvidedId:Ljava/lang/String;

    return-object p0
.end method
