.class Lio/flutter/plugins/googlemobileads/AdInstanceManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/googlemobileads/AdInstanceManager;->invokeOnAdEvent(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field final synthetic val$arguments:Ljava/util/Map;


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdInstanceManager$1;->this$0:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/AdInstanceManager$1;->val$arguments:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/AdInstanceManager$1;->this$0:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->access$000(Lio/flutter/plugins/googlemobileads/AdInstanceManager;)Lio/flutter/plugin/common/MethodChannel;

    move-result-object v0

    const-string v1, "onAdEvent"

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/AdInstanceManager$1;->val$arguments:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
