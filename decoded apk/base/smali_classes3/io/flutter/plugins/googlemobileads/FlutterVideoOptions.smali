.class Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final clickToExpandRequested:Ljava/lang/Boolean;

.field final customControlsRequested:Ljava/lang/Boolean;

.field final startMuted:Ljava/lang/Boolean;


# direct methods
.method constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->clickToExpandRequested:Ljava/lang/Boolean;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->customControlsRequested:Ljava/lang/Boolean;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->startMuted:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method asVideoOptions()Lx8/c0;
    .locals 2

    new-instance v0, Lx8/c0$a;

    invoke-direct {v0}, Lx8/c0$a;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->clickToExpandRequested:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lx8/c0$a;->b(Z)Lx8/c0$a;

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->customControlsRequested:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lx8/c0$a;->c(Z)Lx8/c0$a;

    :cond_1
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->startMuted:Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lx8/c0$a;->d(Z)Lx8/c0$a;

    :cond_2
    invoke-virtual {v0}, Lx8/c0$a;->a()Lx8/c0;

    move-result-object v0

    return-object v0
.end method
