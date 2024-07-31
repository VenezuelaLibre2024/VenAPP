.class public abstract Lcom/google/android/gms/ads/nativead/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/nativead/b$a;,
        Lcom/google/android/gms/ads/nativead/b$b;,
        Lcom/google/android/gms/ads/nativead/b$d;,
        Lcom/google/android/gms/ads/nativead/b$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract cancelUnconfirmedClick()V
.end method

.method public abstract destroy()V
.end method

.method public abstract enableCustomClickGesture()V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getAdChoicesInfo()Lcom/google/android/gms/ads/nativead/b$a;
.end method

.method public abstract getAdvertiser()Ljava/lang/String;
.end method

.method public abstract getBody()Ljava/lang/String;
.end method

.method public abstract getCallToAction()Ljava/lang/String;
.end method

.method public abstract getExtras()Landroid/os/Bundle;
.end method

.method public abstract getHeadline()Ljava/lang/String;
.end method

.method public abstract getIcon()Lcom/google/android/gms/ads/nativead/b$b;
.end method

.method public abstract getImages()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/nativead/b$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMediaContent()Lx8/p;
.end method

.method public abstract getMuteThisAdReasons()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx8/r;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPrice()Ljava/lang/String;
.end method

.method public abstract getResponseInfo()Lx8/z;
.end method

.method public abstract getStarRating()Ljava/lang/Double;
.end method

.method public abstract getStore()Ljava/lang/String;
.end method

.method public abstract isCustomClickGestureEnabled()Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract isCustomMuteThisAdEnabled()Z
.end method

.method public abstract muteThisAd(Lx8/r;)V
.end method

.method public abstract performClick(Landroid/os/Bundle;)V
.end method

.method public abstract recordCustomClickGesture()V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract recordImpression(Landroid/os/Bundle;)Z
.end method

.method public abstract reportTouchEvent(Landroid/os/Bundle;)V
.end method

.method public abstract setMuteThisAdListener(Lx8/q;)V
.end method

.method public abstract setOnPaidEventListener(Lx8/t;)V
.end method

.method public abstract setUnconfirmedClickListener(Lcom/google/android/gms/ads/nativead/b$d;)V
.end method

.method protected abstract zza()Ljava/lang/Object;
.end method
