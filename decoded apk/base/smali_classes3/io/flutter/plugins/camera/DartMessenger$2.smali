.class Lio/flutter/plugins/camera/DartMessenger$2;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/DartMessenger;->sendCameraInitializedEvent(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;Lio/flutter/plugins/camera/features/autofocus/FocusMode;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/DartMessenger;

.field final synthetic val$exposureMode:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

.field final synthetic val$exposurePointSupported:Ljava/lang/Boolean;

.field final synthetic val$focusMode:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

.field final synthetic val$focusPointSupported:Ljava/lang/Boolean;

.field final synthetic val$previewHeight:Ljava/lang/Integer;

.field final synthetic val$previewWidth:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/DartMessenger;Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;Lio/flutter/plugins/camera/features/autofocus/FocusMode;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/DartMessenger$2;->this$0:Lio/flutter/plugins/camera/DartMessenger;

    iput-object p2, p0, Lio/flutter/plugins/camera/DartMessenger$2;->val$previewWidth:Ljava/lang/Integer;

    iput-object p3, p0, Lio/flutter/plugins/camera/DartMessenger$2;->val$previewHeight:Ljava/lang/Integer;

    iput-object p4, p0, Lio/flutter/plugins/camera/DartMessenger$2;->val$exposureMode:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    iput-object p5, p0, Lio/flutter/plugins/camera/DartMessenger$2;->val$focusMode:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    iput-object p6, p0, Lio/flutter/plugins/camera/DartMessenger$2;->val$exposurePointSupported:Ljava/lang/Boolean;

    iput-object p7, p0, Lio/flutter/plugins/camera/DartMessenger$2;->val$focusPointSupported:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "previewWidth"

    invoke-virtual {p0, p2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "previewHeight"

    invoke-virtual {p0, p2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "exposureMode"

    invoke-virtual {p4}, Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "focusMode"

    invoke-virtual {p5}, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "exposurePointSupported"

    invoke-virtual {p0, p1, p6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "focusPointSupported"

    invoke-virtual {p0, p1, p7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
