.class public Lio/flutter/plugins/googlemobileads/FlutterAdValue;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final currencyCode:Ljava/lang/String;

.field final precisionType:I

.field final valueMicros:J


# direct methods
.method public constructor <init>(ILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdValue;->precisionType:I

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdValue;->currencyCode:Ljava/lang/String;

    iput-wide p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdValue;->valueMicros:J

    return-void
.end method
