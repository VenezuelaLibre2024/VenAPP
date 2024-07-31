.class public Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/t;


# instance fields
.field private final ad:Lio/flutter/plugins/googlemobileads/FlutterAd;

.field private final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;->ad:Lio/flutter/plugins/googlemobileads/FlutterAd;

    return-void
.end method


# virtual methods
.method public onPaidEvent(Lx8/j;)V
    .locals 5

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdValue;

    invoke-virtual {p1}, Lx8/j;->b()I

    move-result v1

    invoke-virtual {p1}, Lx8/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lx8/j;->c()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/plugins/googlemobileads/FlutterAdValue;-><init>(ILjava/lang/String;J)V

    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;->ad:Lio/flutter/plugins/googlemobileads/FlutterAd;

    invoke-virtual {p1, v1, v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onPaidEvent(Lio/flutter/plugins/googlemobileads/FlutterAd;Lio/flutter/plugins/googlemobileads/FlutterAdValue;)V

    return-void
.end method
