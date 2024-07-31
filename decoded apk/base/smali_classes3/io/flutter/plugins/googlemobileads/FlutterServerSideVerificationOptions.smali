.class Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final customData:Ljava/lang/String;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->userId:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->customData:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public asServerSideVerificationOptions()Ln9/e;
    .locals 2

    new-instance v0, Ln9/e$a;

    invoke-direct {v0}, Ln9/e$a;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->userId:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ln9/e$a;->c(Ljava/lang/String;)Ln9/e$a;

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->customData:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ln9/e$a;->b(Ljava/lang/String;)Ln9/e$a;

    :cond_1
    invoke-virtual {v0}, Ln9/e$a;->a()Ln9/e;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    iget-object v1, p1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->userId:Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->customData:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->customData:Ljava/lang/String;

    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public getCustomData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->customData:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->userId:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->customData:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
